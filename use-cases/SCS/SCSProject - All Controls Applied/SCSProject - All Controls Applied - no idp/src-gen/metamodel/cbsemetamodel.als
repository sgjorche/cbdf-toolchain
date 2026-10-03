/**
* CBSEMetamodel Module
*
* Define an Alloy Meta model for Component Base Architercture
*/
module cbsemetamodel
open util/ordering[Tick]
open messaging

/**
*  Specify associations Constraints for the MetaModel that can't be done directly
*/
fact associationsContraints {
	all c:Connector | all t:Tick |  # c.connects.t <= 2
	all l:Link | all t:Tick | # l.connects.t >= 2
	all p:Port | some c:Component | p in c.uses
	all pk:PortKind | some p:Port | p.kind = pk
}

/*******************************************************************************************************************************
*	Physical
*******************************************************************************************************************************/

/**
 * A link corresponds to a physical connection medium.
 * A link connects a set of nodes at any one time.
 */
sig Link {
	connects: set Node -> Tick
}

/**
 * A node corresponds to a physical device, capable of hosting a set components.
 */
sig Node {
	hosts: set Component -> Tick
}

/*******************************************************************************************************************************
*	Logical
*******************************************************************************************************************************/

/**
 * Components, as run-time instances, represent self-contained units of deployment.
 * A component belongs to exactly one domain, and is deployed on exactly one (not
 * necessarily the same) node at all times (as it is a run-time instance).
 */
sig Component extends Entity {
	uses: set Port
}{
	all t:Tick | one n:Node | this in n.hosts.t
}

fact PortOnlyUseOnce {
	all disj c1,c2:Component | all p:Port  | p in c1.uses => p not in c2.uses
}

/**
 * Port can provide and requite various Interfaces
 */
sig Port {
	realizes: one InteractionNature,
	kind: PortKind
}

enum PortKind { INPUT, OUTPUT }

/**
* Define the nature of an interaction between 2 Compenent
*/
abstract sig InteractionNature {}

/**
*	Connector
*/
abstract sig Connector {
	// The set of components connected by this connector
	connects: set Port -> Tick,
}{
	// Connectors have to be supported by a physical communication path in case of distinct nodes
	all disj c1,c2:Component,t:Tick {
		c1.uses + c2.uses in connects.t implies
		some n1,n2:Node {
			c1 in n1.hosts.t
			c2 in n2.hosts.t
			n1 = n2 or some l:Link | n1+n2 in l.connects.t
		}
	}
}

/**
*	Channel is a simple connector that can link only 2 component
*/
abstract sig Channel extends Connector {
	disj portI,portO: one Port
}{
	all t:Tick, p:Port |  p = portI => p in connects.t and p.kind = INPUT
	all t:Tick, p:Port |  p = portO => p in connects.t and p.kind = OUTPUT
}

/*******************************************************************************************************************************
*	Scenario
*******************************************************************************************************************************/

/**
*	CommunicationStyle
*/
abstract sig CommunicationStyle extends Msg {
		sender:  one Component, // the component that the receiver believe the communication originate
		receiver: one Component,
		origin_sender:  one Component,
} {
	to = receiver
	from = origin_sender
	origin_sender != receiver
	to not in from
	receiver not in sender
}

