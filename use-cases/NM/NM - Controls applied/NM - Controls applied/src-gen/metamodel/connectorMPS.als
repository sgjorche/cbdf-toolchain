/**
* connectorMPSTick Module 
* 
* Define MPS communication based on Tick in a Component Base Architercture 
*/
module connectorMPSTick

open messaging
open util/ordering[messaging/Tick] as tick
open cbsemetamodel

fact CleanupViz { 
	// Constraint for clean viz (instances must be link to something to exist)
	all d:DataType | some i:Data | d in i.datatypes
	all m:Payload | some mp:MsgPassing | mp.payload = m
	# MsgPassing >= 1
}

/*******************************************************************************************************************************
*	Logical
*******************************************************************************************************************************/
/**
*	Connector MPS definition
*/
sig ConnectorMPS extends Channel{
	buffer : set MsgPassing -> Tick,
}

/**
* Interface Data
*/
sig Data extends InteractionNature {
	datatypes: set DataType,
}

/**
* Type of Data
*/
sig DataType {}

one sig Log { entries: set MsgPassing -> Tick }
pred Log.addEntry[m: MsgPassing, t: Tick] { m -> t in this.entries }
pred Z_inject[c: Component, m: MsgPassing] { some con: ConnectorMPS, p: c.uses | p in con.connects.(m.sent) and p.kind = OUTPUT }
pred Z_intercept[c: Component, m: MsgPassing] { some con: ConnectorMPS, p: c.uses | p in con.connects.(m.sent) and p.kind = INPUT }

/**
* An MsgPassing reifies Communication Style
*/
sig MsgPassing extends CommunicationStyle {
	payload: one Payload,
}
fact NoOverlappingPayload { // each payload is considered uniq but a payload can containts the same content (see PayloadEquiv func for check this)
	no disj m1,m2:MsgPassing | some m1.payload & m2.payload
}


/**
*	An Payload contains the concret data and his type
*/

sig Payload {
	type: DataType,
}

/*******************************************************************************************************************************
*	Scenario
*******************************************************************************************************************************/
//Init all model with 0 message in the buffer as the messaging library do
fact InitBuffer {
	#buffer.(tick/first) = 0
	#buffer.(tick/last) = 0
}

/* Binding our metamodel with the messaging library offering the MPS Behavior */
pred ConnectorMPSSent {
	all c:Component, m:MsgPassing, t:Tick |
		 m in t.sentMsg[c] <=> one con:ConnectorMPS, p:c.uses | some t2:t.nexts
				| p in con.connects.t and p.kind = OUTPUT and m.payload.type = p.realizes.datatypes
				and m in con.buffer.t2
}

// A Message is in transmission (i.e, into the connector buffer)
pred ConnectorMPSVisible {
	all c:Component, m:MsgPassing, t:Tick |
		 m in t.visible[c] <=> one con:ConnectorMPS, p:c.uses 
			| p in con.connects.t and m in con.buffer.t and m.payload.type = p.realizes.datatypes
}

// A Message is Received
pred ConnectorMPSReceivedMsg {
	all c:Component, m:MsgPassing, t:Tick |
		 m in t.receivedMsg[c] <=> one con:ConnectorMPS, p:c.uses 
				| p in con.connects.t and p.kind =  INPUT and m.payload.type = p.realizes.datatypes
				and m in con.buffer.t
}

fact MPSTraces {
	ConnectorMPSVisible
	ConnectorMPSReceivedMsg
	ConnectorMPSSent
}


/* Communication primitives*/
// A Component (this) send a message d to a Component c at a Tick t
pred Component.send[c:Component,d:Payload, t:Tick] {
	some m:MsgPassing {
		m.payload = d
		m.origin_sender = this
		m.receiver = c
		m.sent = t
	}
}

// A Component (this) receive a message d from a Component c at a Tick t
pred Component.receive[c:Component,d:Payload,t:Tick] {
	some m:MsgPassing {
		m.payload = d
		m.received[this]  = t
		m.sender = c
	}
}



/*******************************************************************************************************************************
*	Illustrations
*******************************************************************************************************************************/
pred show_send(c1,c2:Component, d:Payload, t:Tick) {
		c1.send[c2,d,t]
}

pred show_receive(c1,c2:Component, d:Payload, t:Tick) {
		c2.receive[c1,d,t]
}

pred show_send_and_receive(t,t2:Tick, c1,c2:Component, d:Payload) {
	c1.send[c2,d,t] 
	c2.receive[c1,d,t2]
}

pred show_2_message_sequence  (c1,c2:Component, disj d1,d2:Payload){
	one ts1:Tick {
		c1.send[c2,d1,ts1]
		c1.send[c2,d2,ts1.next]
		c2.receive[c1,d1,ts1.next.next]
		c2.receive[c2,d2,ts1.next.next.next]  
	}
}

pred show_FIFO {
	 all disj c1,c2:Component | all disj d1,d2:Payload 
	| all ts1:Tick | let ts2 = ts1.nexts | all tr1:Tick| all tr2:Tick |
	 	(c1.send[c2,d1,ts1]
		and c1.send[c2,d2,ts2]
		and c2.receive[c1,d1,tr1]
		and c2.receive[c1,d2,tr2]) 
		=> tr2 in tr1.nexts
}

run show_send for 5
run show_receive for 5
run show_send_and_receive for 5
run show_2_message_sequence for 3 but 5 Tick
run show_FIFO for 3 but 8 Tick

/*******************************************************************************************************************************
*	Verifications
*******************************************************************************************************************************/
// once the client c1 sends a message to server c2 eventually that server receives it
pred send_is_eventually_received{
	one t:Tick | one t2:t.nexts | some c1,c2:Component | some d:Payload |
	c1.send[c2,d,t] => c2.receive[c1,d,t2]
}

// once the server c2 receives a message, it must already have been sent by a certain client c1
assert recieve_must_be_sent{	
	all t:Tick | all t2:t.nexts | some c1,c2:Component | some d:Payload |
	c2.receive[c1,d,t2] => c1.send[c2,d,t] 
}

// messages sent from the component c1 to the component c2 reach the c2 in the same order
// as they were sent from c1
assert is_FIFO {
	 all disj c1,c2:Component | all disj d1,d2:Payload | all rs1:Tick | all rs2:rs1.nexts
 	| all rr1:Tick | all rr2:Tick |
		(c1.send[c2,d1,rs1]
		and c1.send[c2,d2,rs2]
		and c2.receive[c1,d1,rr1]
		and c2.receive[c1,d2,rr2]) 
		=> rr2 in rr1.nexts
}


pred message_can_be_received_by_other {
	 all disj c1,c2,c3:Component, d:Payload, t1:Tick, t2:t1.prevs |
		c1.send[c2,d,t2] and c3.receive[c1,d,t1]
}

pred message_can_be_lost {
	 all disj c1,c2,c3:Component, d:Payload, t1:Tick, t2:t1.prevs |
		c1.send[c2,d,t2] and not c3.receive[c1,d,t1]
}

run send_is_eventually_received for 2 but 5 Tick
check recieve_must_be_sent for 2 but 5 Tick
check is_FIFO for 3 but 10 Tick, 1 ConnectorMPS
run message_can_be_received_by_other for 2 but 5 Tick
run message_can_be_lost for 2 but 5 Tick


