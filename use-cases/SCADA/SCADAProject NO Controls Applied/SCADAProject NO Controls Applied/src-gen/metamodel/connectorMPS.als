module connectorMPSTick

open messaging
open util/ordering[messaging/Tick] as tick
open cbsemetamodel

fact CleanupViz {
	all d:DataType | some i:Data | d in i.datatypes
	all m:Payload | some mp:MsgPassing | mp.payload = m
	# MsgPassing >= 1
}

sig ConnectorMPS extends Channel {
	buffer: set MsgPassing -> Tick,
}

sig Data extends InteractionNature {
	datatypes: set DataType,
}

sig DataType {}

one sig Log { entries: set MsgPassing -> Tick }
pred Log.addEntry[m: MsgPassing, t: Tick] { m -> t in this.entries }
pred Z_inject[c: Component, m: MsgPassing] { some con: ConnectorMPS, p: c.uses | p in con.connects.(m.sent) and p.kind = OUTPUT }
pred Z_intercept[c: Component, m: MsgPassing] { some con: ConnectorMPS, p: c.uses | p in con.connects.(m.sent) and p.kind = INPUT }

sig MsgPassing extends CommunicationStyle {
	payload: one Payload,
}
fact NoOverlappingPayload {
	no disj m1,m2:MsgPassing | some m1.payload & m2.payload
}

sig Payload {
	type: DataType,
}

fact InitBuffer {
	#buffer.(tick/first) = 0
	#buffer.(tick/last) = 0
}

pred ConnectorMPSSent {
	all c:Component, m:MsgPassing, t:Tick |
		m in t.sentMsg[c] <=> one con:ConnectorMPS, p:c.uses | some t2:t.nexts
			| p in con.connects.t and p.kind = OUTPUT and m.payload.type = p.realizes.datatypes
			and m in con.buffer.t2
}

pred ConnectorMPSVisible {
	all c:Component, m:MsgPassing, t:Tick |
		m in t.visible[c] <=> one con:ConnectorMPS, p:c.uses
			| p in con.connects.t and m in con.buffer.t and m.payload.type = p.realizes.datatypes
}

pred ConnectorMPSReceivedMsg {
	all c:Component, m:MsgPassing, t:Tick |
		m in t.receivedMsg[c] <=> one con:ConnectorMPS, p:c.uses
			| p in con.connects.t and p.kind = INPUT and m.payload.type = p.realizes.datatypes
			and m in con.buffer.t
}

fact MPSTraces {
	ConnectorMPSVisible
	ConnectorMPSReceivedMsg
	ConnectorMPSSent
}

pred Component.send[c:Component,d:Payload, t:Tick] {
	some m:MsgPassing {
		m.payload = d
		m.origin_sender = this
		m.receiver = c
		m.sent = t
	}
}

pred Component.receive[c:Component,d:Payload,t:Tick] {
	some m:MsgPassing {
		m.payload = d
		m.received[this] = t
		m.sender = c
	}
}
