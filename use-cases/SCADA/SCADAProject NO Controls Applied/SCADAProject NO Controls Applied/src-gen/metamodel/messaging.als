module messaging

open util/ordering[Tick] as ord
open util/relation as rel

abstract sig Entity {}

abstract sig Msg {
   from: Entity,
   to: one Entity,
   sent: one Tick,
   received: Entity -> lone Tick
}
sig Tick {
   available: set Msg,
   sentMsg: Entity -> Msg,
   visible: Entity -> Msg,
   receivedMsg: Entity -> Msg,
}

fun MsgsSentOnTick[r: Tick]: set Msg { r.sentMsg[Entity] }
fun MsgsVisibleOnTick[r: Tick]: set Msg { r.visible[Entity] }
fun MsgsReceivedOnTick[r: Tick]: set Msg { r.receivedMsg[Entity] }

fact MsgMovementConstraints {
   no ord/first.visible[Entity]
   all pre: Tick - ord/last |
     let post = ord/next[pre] | {
        post.available = pre.available - MsgsSentOnTick[pre]
     }
   all t: Tick | {
      MsgsSentOnTick[t] in t.available
      MsgsSentOnTick[t].sent in t
      MsgsReceivedOnTick[t].received[Entity] in t
      MsgsSentOnTick[t] = t.sentMsg[Entity]
      all e: Entity, m: Msg |
           m.received[e] = t => m in t.receivedMsg[e]
      all e: Entity | t.sentMsg[e].from in e
      all e: Entity, m: Msg | {
          (m in t.visible[e] => (m.sent in ord/prevs[t]))
          (m in t.receivedMsg[e] => m in t.visible[e] and m !in ord/nexts[t].visible[e])
      }
      lone e: Entity, m: Msg | m in t.receivedMsg[e] iff not m in t.sentMsg[e]
   }
}

fact CleanupViz {
    Msg in Tick.sentMsg[Entity]
}
