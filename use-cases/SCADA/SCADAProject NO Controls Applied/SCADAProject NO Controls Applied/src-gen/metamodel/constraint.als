module constraint

open cbsemetamodel
open messaging
open connectorMPS
open util/ordering[messaging/Tick] as tick

sig MsgPassingConstraint extends MsgPassing {
	set_pld: Component -> Tick,
	set_rcv: Component -> Tick,
	set_src: Component -> Tick,
	get_pld: Component -> Tick,
	get_rcv: Component -> Tick,
	get_src: Component -> Tick
}{
	all c:Component, t:Tick | get_src.t = c => some m:MsgPassingConstraint, s:Component | H_get_src[c,m,s,t]
	all c:Component, t:Tick | get_rcv.t = c => some m:MsgPassingConstraint, r:Component | H_get_rcv[c,m,r,t]
	all c:Component, t:Tick | get_pld.t = c => some m:MsgPassingConstraint, d:Payload | H_get_pld[c,m,d,t]
	all c:Component, t:Tick | set_src.t = c => some m:MsgPassingConstraint, s:Component | H_set_src[c,m,s,t]
	all c:Component, t:Tick | set_rcv.t = c => some m:MsgPassingConstraint, r:Component | H_set_rcv[c,m,r,t]
	all c:Component, t:Tick | set_pld.t = c => some m:MsgPassingConstraint, d:Payload | H_set_pld[c,m,d,t]
}

fact axioms {
	all m:MsgPassingConstraint, c1:Component, t:Tick |
		H_intercept[c1,m,t] => some c2:Component | injected[c2,m,t]
	all m:MsgPassingConstraint, c1:Component, t1:Tick |
		H_inject[c1,m,t1] => some c2:Component, t2:t1.prevs | H_set_src[c1,m,c2,t2]
	all m:MsgPassingConstraint, c1:Component, t1:Tick |
		H_inject[c1,m,t1] => some c2:Component, t2:t1.prevs | H_set_rcv[c1,m,c2,t2]
	all m:MsgPassingConstraint, c:Component, t1:Tick |
		H_inject[c,m,t1] => some d:Payload, t2:t1.prevs | H_set_pld[c,m,d,t2]
	all m:MsgPassingConstraint, c,s:Component, t:Tick |
		H_get_src[c,m,s,t] => intercepted[c,m,t] and m.sender = s
	all m:MsgPassingConstraint, c,r:Component, t:Tick |
		H_get_rcv[c,m,r,t] => intercepted[c,m,t] and m.receiver = r
	all m:MsgPassingConstraint, c:Component, d:Payload, t:Tick |
		H_get_pld[c,m,d,t] => intercepted[c,m,t] and m.payload = d
}

pred E_inject[c:Component,m:MsgPassingConstraint, t:Tick] {
	some con:ConnectorMPS, p:c.uses
		| p in con.connects.t and p.kind = OUTPUT
		and m.payload.type = p.realizes.datatypes
}

pred E_intercept[c:Component,m:MsgPassingConstraint, t:Tick] {
	some con:ConnectorMPS, p:c.uses
		| p in con.connects.t and p.kind = INPUT
		and m.payload.type = p.realizes.datatypes
		and m in con.buffer.t
}

pred E_set_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] { not injected[c,m,t] }
pred E_set_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] { not injected[c,m,t] }
pred E_set_src[c:Component, m:MsgPassingConstraint, s:Component, t:Tick] { not injected[c,m,t] }

pred E_get_src[c:Component, m:MsgPassingConstraint, s:Component, t:Tick] {
	intercepted[c,m,t]
	m.sender = s
}

pred E_get_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	intercepted[c,m,t]
	m.receiver = r
}

pred E_get_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	intercepted[c,m,t]
	m.payload = d
}

pred H_inject[c1:Component,m:MsgPassingConstraint, t:Tick] {
	E_inject[c1,m,t]
	some c2:Component | c1.send[c2,m.payload,t]
}

pred H_intercept[c1:Component,m:MsgPassingConstraint, t:Tick] {
	E_intercept[c1,m,t]
	some c2:Component | c1.receive[c2,m.payload,t]
}

pred H_set_src[c:Component,m:MsgPassingConstraint, s:Component, t:Tick] {
	E_set_src[c,m,s,t]
	m.set_src.t = c
	m.sender = s
}

pred H_set_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	E_set_rcv[c,m,r,t]
	m.set_rcv.t = c
	m.receiver = r
}

pred H_set_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	E_set_pld[c,m,d,t]
	m.set_pld.t = c
	m.payload = d
}

pred H_get_src[c:Component,m:MsgPassingConstraint, s:Component, t:Tick] {
	E_get_src[c,m,s,t]
	m.get_src.t = c
}

pred H_get_rcv[c:Component, m:MsgPassingConstraint, r:Component, t:Tick] {
	E_get_rcv[c,m,r,t]
	m.get_rcv.t = c
}

pred H_get_pld[c:Component, m:MsgPassingConstraint, d:Payload, t:Tick] {
	E_get_pld[c,m,d,t]
	m.get_pld.t = c
}

pred injected[c:Component,m:MsgPassingConstraint, t1:Tick] {
	one t2:t1.prevs | H_inject[c,m,t2]
}

pred intercepted[c:Component,m:MsgPassingConstraint, t1:Tick] {
	one t2:t1.prevs | H_intercept[c,m,t2]
}

pred sent_by[m:MsgPassingConstraint,c:Component, t:Tick] {
	injected[c,m,t] and m.origin_sender = c
}

pred sent_with[m:MsgPassingConstraint, d:Payload, t:Tick] {
	one c:Component | sent_by[m,c,t] and m.sender = c and m.payload = d
}

pred sent_to[m:MsgPassingConstraint,r:set Component, t:Tick] {
	one c:Component | sent_by[m,c,t] and r = m.receiver
}

fact MsgPassingClosure {
	MsgPassing in MsgPassingConstraint
}
