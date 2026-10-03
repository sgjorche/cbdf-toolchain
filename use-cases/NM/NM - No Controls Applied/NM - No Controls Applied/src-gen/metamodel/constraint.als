module constraint

open cbsemetamodel
open messaging
open connectorMPS
open util/ordering[messaging/Tick] as tick

// Extends MsgPassing with get_pld, get_rcv, get_src actions
sig MsgPassingConstraint extends MsgPassing {
	set_pld: Component -> Tick ,
	set_rcv: Component -> Tick,
	set_src: Component -> Tick,
	get_pld: Component ->Tick,
	get_rcv: Component ->Tick,
	get_src: Component ->Tick
}{
	all c:Component, t:Tick | get_src.t = c => some m:MsgPassingConstraint, s:Component |H_get_src[c,m,s,t]
	all c:Component, t:Tick | get_rcv.t = c => some m:MsgPassingConstraint, r:Component | H_get_rcv[c,m,r,t]
	all c:Component, t:Tick | get_pld.t = c => some m:MsgPassingConstraint, d:Payload | H_get_pld[c,m,d,t]
	all c:Component, t:Tick | set_src.t = c => some m:MsgPassingConstraint, s:Component | H_set_src[c,m,s,t]
	all c:Component, t:Tick | set_rcv.t = c => some m:MsgPassingConstraint, r:Component | H_set_rcv[c,m,r,t]
	all c:Component, t:Tick | set_pld.t = c => some m:MsgPassingConstraint, d:Payload |H_set_pld[c,m,d,t]  
}

/**
Axioms
*/
fact axioms {
	all m:MsgPassingConstraint, c1:Component, t:Tick|
		H_intercept[c1,m, t] => some c2:Component | injected[c2,m, t]
	
	all m:MsgPassingConstraint, c1:Component, t1:Tick |
		H_inject[c1,m,t1] => some c2:Component, t2:t1.prevs | H_set_src[c1,m,c2,t2]

	all m:MsgPassingConstraint, c1:Component, t1:Tick |
		H_inject[c1,m,t1] =>  some c2:Component, t2:t1.prevs| H_set_rcv[c1,m,c2,t2]

	all m:MsgPassingConstraint, c:Component, t1:Tick |
		H_inject[c,m,t1] =>  some d:Payload, t2:t1.prevs | H_set_pld[c,m,d,t2]

	all m:MsgPassingConstraint, c,s:Component, t:Tick |
		H_get_src[c,m,s,t] => intercepted[c,m,t] and m.sender = s

	all m:MsgPassingConstraint, c,r:Component, t:Tick |
		H_get_rcv[c,m,r,t] =>  intercepted[c,m, t] and m.receiver = r

	all m:MsgPassingConstraint, c:Component, d:Payload, t:Tick |
		H_get_pld[c,m,d,t] =>  intercepted[c,m, t] and m.payload = d
}

/** E Modalities */ 
// EInject : a c component have the opportunity to inject a message m at a Tick t
pred E_inject[c:Component,m:MsgPassingConstraint, t:Tick] {
	some con:ConnectorMPS, p:c.uses 
				| p in con.connects.t and p.kind = OUTPUT 
				and m.payload.type = p.realizes.datatypes
}

// EIntercept : a c component have the opportunity to intercept a message m at a Tick t
pred E_intercept[c:Component,m:MsgPassingConstraint, t:Tick] {
	 some con:ConnectorMPS, p:c.uses 
				| p in con.connects.t and p.kind = INPUT 
				and m.payload.type = p.realizes.datatypes
				and m in con.buffer.t
}


// Esetrcv: a c component have the opportunity to set the declared source of a message m at a Tick t
pred E_set_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	not injected[c,m,t]
}

// Esetpld : a c component have the opportunity to set the payload of a message m from a declared source sat a Tick t
pred E_set_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	not injected[c,m,t]
}

// Esetsrc : a c component have the opportunity to set the source of a message m at a Tick t
pred E_set_src[c:Component, m:MsgPassingConstraint, s:Component, t:Tick] {
	not injected[c,m,t]
}

// Egetsrc : a c component have the opportunity to get the source of a message m at a Tick t
pred E_get_src[c:Component, m:MsgPassingConstraint, s:Component, t:Tick] {
	intercepted[c,m,t]
	m.sender = s
}

// Egetrcv: a c component have the opportunity to get the declared source of a message m at a Tick t
pred E_get_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	intercepted[c,m,t]
	m.receiver = r
}

// Egetpld : a c component have the opportunity to get the payload of a message m from a declared source sat a Tick t
pred E_get_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	intercepted[c,m,t]
	m.payload = d
}

/** 
	Actions 
*/
// inject : a component c added a message m into the system at a tick  t
pred H_inject[c1:Component,m:MsgPassingConstraint, t:Tick] {
	E_inject[c1,m,t]
	some c2:Component | c1.send[c2,m.payload,t]
}

// intercepted : a component got the message m from the system at a tick t
pred H_intercept[c1:Component,m:MsgPassingConstraint, t:Tick] {
	E_intercept[c1,m,t]
	some c2:Component | c1.receive[c2,m.payload,t]
}

// set_src : a component set the  declared source s from the message m at a tick t
pred H_set_src[c:Component,m:MsgPassingConstraint, s:Component, t:Tick] {
	E_set_src[c,m,s,t]
	m.set_src.t = c
	m.sender = s 
}

//  set_rcv : a component set  the receiver(s) r from the message m at a tick t
pred H_set_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	E_set_rcv[c,m,r,t]
	m.set_rcv.t = c
	m.receiver = r
}

//  set_pld : a component set the payload d from the message m at a tick t
pred H_set_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	E_set_pld[c,m,d,t]
	m.set_pld.t = c
	m.payload = d
}

// get_src : a component got the  declared source s from the message m at a tick t
pred H_get_src[c:Component,m:MsgPassingConstraint, s:Component, t:Tick] {
	E_get_src[c,m,s,t]
	m.get_src.t = c
}

//  get_rcv : a component got the receiver(s) r from the message m at a tick t
pred H_get_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	E_get_rcv[c,m,r,t]
	m.get_rcv.t = c
}

//  get_pld : a component got the payload d from the message m at a tick t
pred H_get_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	E_get_pld[c,m,d,t]
	m.get_pld.t = c
}

/** Macros */
// injected : a component c added a message m into the system before a tick  t
pred injected[c:Component,m:MsgPassingConstraint, t1:Tick] {
	one t2:t1.prevs | H_inject[c,m,t2]
}

// intercepted : a component got the message m from the system before a tick t
pred intercepted[c:Component,m:MsgPassingConstraint, t1:Tick] {
	one t2:t1.prevs | H_intercept[c,m,t2]
}

// sent_by : a c component injected a message m and c is the accurate origin of m m.payload
pred sent_by[m:MsgPassingConstraint,c:Component, t:Tick] {
	injected[c,m,t] and m.origin_sender = c
}

// sent_with : a component c injected a message m that contains a paylaod d
pred sent_with[m:MsgPassingConstraint, d:Payload, t:Tick] {
	one c:Component | sent_by[m,c,t] and m.sender = c and m.payload = d 
}

// sent_to : some c component injected a message m with r has intended receivers
pred sent_to[m:MsgPassingConstraint,r:set Component, t:Tick] {
	one c:Component | sent_by[m,c,t] and r = m.receiver
}

fact MsgPassingClosure {
	MsgPassing in MsgPassingConstraint
}
