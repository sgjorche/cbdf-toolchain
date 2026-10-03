module messaging

/*
 * Generic messaging among several nodes
 *
 * By default, messages can be lost (i.e. never become visible to the
 * recipient node) or may be arbitrarily delayed.  Also, by default
 * out-of-order delivery is allowed.
 */

open util/ordering[Tick] as ord
open util/relation as rel

abstract sig Entity {}

abstract sig Msg {
   // Node that sent the message
   from: Entity,
   // Intended recipient(s) of a message; note that broadcasts are allowed
   to: one Entity,
   // Timestamp: the tick on which the message was sent
   sent: one Tick,
   // tick at which node reads message, if read
   received: Entity -> lone Tick
}
sig Tick {
   //
   // Definition of what each Entity does on this tick:
   //
 	// Messages available for sending at this tick.  A given message
   // atom is only used once, and then it gets removed from the available
   // set and cannot be used to represent messages sent on subsequent ticks.
   // Also, two different Entities cannot send the same message atom.
   // So, a message atom represents a particular single physical message
   // sent by a given Entity on a given tick.
   available: set Msg,  // add a predicate : To send

   // Messages sent by the Entity in this tick.  They become visible to
   // (and can be read by) their recipients on the next tick.
   sentMsg: Entity -> Msg, // add a predicate: added into the buffer

   // Messages that the Entity _can_ read in this tick, i.e. messages available
   // for receiving at the beginning of this tick.  The messages that
   // the Entity actually received are a subset of this set.  Determined by
   // constraints in this module.
   visible: Entity -> Msg, // add a predicate : all messages that in the buffers of the connectors connected to this Entity

   // Messages that the Entity _actually receives_ in this tick.  Must be a subset
   // of visible.  Determined by constraints of the particular system
   // that uses this module.
   receivedMsg: Entity -> Msg, // add a predicate : Removed from the buffer
}

fun MsgsSentOnTick[r: Tick]: set Msg { r.sentMsg[Entity] }
fun MsgsVisibleOnTick[r: Tick]: set Msg { r.visible[Entity] }
fun MsgsReceivedOnTick[r: Tick]: set Msg { r.receivedMsg[Entity] }

fact MsgMovementConstraints {
   // At the beginning, no messages have been sent yet
   no ord/first.visible[Entity]

   // Messages sent on a given tick become visible to recipient(s)
   // on the subsequent tick.
   all pre: Tick - ord/last |
     let post = ord/next[pre] | {
        // messages sent on this tick are no longer available on subsequent tick
        post.available = pre.available - MsgsSentOnTick[pre]
     }

   all t: Tick | {
      // Messages sent on a tick are taken from the pool of available
      // (not-yet-sent) message atoms
      MsgsSentOnTick[t] in t.available

      // Timestamps are correct
      MsgsSentOnTick[t].sent in t
      MsgsReceivedOnTick[t].received[Entity] in t

      // The only new message atoms are those sent by nodes
      MsgsSentOnTick[t] = t.sentMsg[Entity]

      all e: Entity, m: Msg |
           m.received[e] = t => m in t.receivedMsg[e]

      // Return addresses are correct
      all e: Entity | t.sentMsg[e].from in e

      // messages sent to a node on a tick become visible to that node on some subseqent tick,
      // and permanently stop being visible to that node on the tick after that node reads the message
      all e: Entity, m: Msg | {
          // message starts being visible to node n no earlier than it is sent;
          // only messages sent to this node are visible to this node.
          (m in t.visible[e] => (m.sent in ord/prevs[t]))
          // message permanently stops being visible immediately after being read
          (m in t.receivedMsg[e] => m in t.visible[e] and m !in ord/nexts[t].visible[e])
      }
	  // Max one Sent or Received by tick
	  lone e: Entity, m: Msg  | m in t.receivedMsg[e] iff not m in t.sentMsg[e]
   }
}

fact CleanupViz {
    // cleans up visualization without precluding any interesting traces

    // all messages must be sent
    Msg in Tick.sentMsg[Entity]
}

