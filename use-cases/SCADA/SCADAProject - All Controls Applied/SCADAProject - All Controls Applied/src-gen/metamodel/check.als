open cbsemetamodel
open messaging
open constraint

open util/ordering[messaging/Tick] as tick

pred SC_08_00[c1,c2:Component] {
  (all m: MsgPassingConstraint, d: Payload, t: Tick |
    (some t1: t.prevs | H_inject[c1, m, t1] and m.receiver = c2)
    implies
    (all c3: Component - c1 - c2 | not E_get_pld[c3, m, d, t]))
  and
  (all m: MsgPassingConstraint, t: Tick |
    (H_inject[c1, m, t] and m.receiver = c2)
    implies
    (some t1: t.prevs | H_set_pld[c1, m, m.payload, t1]))
}
assert SC_08_00_NotHold {
  all c1,c2: Component | SC_08_00[c1, c2] }

check SC_08_00_NotHold
