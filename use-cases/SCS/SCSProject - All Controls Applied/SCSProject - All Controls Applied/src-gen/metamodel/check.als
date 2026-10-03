open cbsemetamodel
open messaging
open constraint

open util/ordering[messaging/Tick] as tick

pred SC_08_00[c1,c2:Component]  {
  all c3:Component-c1-c2, m:MsgPassing, d:Payload|
  all t:Tick | E_get_pld[c3,m,d,t] implies 
    (no t2:Tick-tick/first | no t1:t2.prevs | (H_inject[c1,m,t1] and m.receiver = c2) 
      implies E_get_pld[c3,m,d,t2])
  all t2:Tick-tick/first, m:MsgPassing, d:Payload | some t1:t2.prevs | 
    (H_inject[c1,m,t1] implies  E_get_pld[c2,m,d,t2])
  implies (all t2:Tick-tick/first | some t1:t2.prevs | 
    (H_set_pld[c1,m,d,t2] implies H_inject[c1,m,t1]))
}
assert SC_08_00_NotHold {
  all c1,c2: Component | SC_08_00[c1, c2] }

check SC_08_00_NotHold
