open metamodel/messaging
open metamodel/cbsemetamodel
open metamodel/connectorMPS
open metamodel/constraint
open util/ordering[messaging/Tick] as tick
pred ISO_8_24[c1:Component,c2:Component]{

		
        all m: MsgPassing | m.receiver = c2 implies (
          all d: Payload, t: Tick |
            (some t1: t.prevs | H_inject[c1, m, t1])
            implies
            (all c3: Component - c1 - c2 | not E_get_pld[c3, m, d, t])
        )
        and
        all m: MsgPassing | m.receiver = c2 implies (
          all t: Tick |
            H_inject[c1, m, t]
            implies
            (some t1: t.prevs | H_set_pld[c1, m, m.payload, t1])
        )
      
}
pred ISO_8_5[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick |
          (H_intercept[c2, m, t] and
           (m.origin_sender = c1 or m.sender = c1))
          implies
          m.sender = m.origin_sender
      
}
pred ISO_8_15[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick |
          (H_inject[c1, m, t] implies Log.addEntry[m, t])
          and
          (H_intercept[c2, m, t] implies Log.addEntry[m, t])
      
}
pred ISO_8_6[c1:Component,c2:Component]{

		
        all t: Tick - tick/last |
          #{ m: MsgPassing |
            m.sender = c1 and
            m.receiver = c2 and
            m.sent in (t + t.next)
          } <= 1
      
}
pred ISO_8_2[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick, c3: Component - c1 - c2 |
          (m.origin_sender = c1 and m.receiver = c2)
          implies
          not H_intercept[c3, m, t]
      
}
pred B_ISO_8_5_V2_10[c1:Component,c2:Component]{

			ISO_8_5[c1,c2]
			OWASP_V2_10[c1,c2]
			OWASP_V3_5[c1,c2]
}
pred B_ISO_8_24_V9_2[c1:Component,c2:Component]{

			ISO_8_24[c1,c2]
			OWASP_V9_2[c1,c2]
}
pred B_ISO_8_24[c1:Component,c2:Component]{

			ISO_8_24[c1,c2]
			OWASP_V9_2[c1,c2]
}
pred B_ISO_8_6[c1:Component,c2:Component]{

			ISO_8_6[c1,c2]
}
pred B_ISO_8_2_V4_2[c1:Component,c2:Component]{

			ISO_8_2[c1,c2]
			OWASP_V4_2[c1,c2]
}
pred B_ISO_8_15_V7_1[c1:Component,c2:Component]{

			ISO_8_15[c1,c2]
			OWASP_V7_1[c1,c2]
			OWASP_V7_3[c1,c2]
}
pred OWASP_V9_2[c1:Component,c2:Component]{

		
        all m: MsgPassing | m.receiver = c2 implies (
          all d: Payload, t: Tick |
            (some t1: t.prevs | H_inject[c1, m, t1])
            implies
            (all c3: Component - c1 - c2 | not E_get_pld[c3, m, d, t])
        )
        and
        all m: MsgPassing | m.receiver = c2 implies (
          all t: Tick |
            H_inject[c1, m, t]
            implies
            (some t1: t.prevs | H_set_pld[c1, m, m.payload, t1])
        )
      
}
pred OWASP_V2_10[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick |
          (H_intercept[c2, m, t] and
           (m.origin_sender = c1 or m.sender = c1))
          implies
          m.sender = m.origin_sender
      
}
pred OWASP_V7_1[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick |
          (H_inject[c1, m, t] implies Log.addEntry[m, t])
          and
          (H_intercept[c2, m, t] implies Log.addEntry[m, t])
      
}
pred OWASP_V3_5[c1:Component,c2:Component]{

		
        all t2: Tick - tick/first, m: MsgPassing |
          E_get_src[c2, m, c1, t2] implies
            (some t1: t2.prevs | H_inject[c1, m, t1])
      
}
pred OWASP_V4_2[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick, c3: Component - c1 - c2 |
          (m.origin_sender = c1 and m.receiver = c2)
          implies
          not H_intercept[c3, m, t]
      
}
pred OWASP_V7_3[c1:Component,c2:Component]{

		
        all m: MsgPassing, t: Tick |
          (H_inject[c1, m, t] implies Log.addEntry[m, t])
          and
          (H_intercept[c2, m, t] implies Log.addEntry[m, t])
      
}
pred SecureCommunicationTLS[con:Connector]{

		
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t) implies con.connects.t = mp.origin_sender.uses + mp.receiver.uses
        all t: Tick, mp: MsgPassing |
          (mp in con.buffer.t) implies
          (no mp1: MsgPassing-mp, t2: t.prevs |
             mp1.sender = mp.sender and mp1.receiver = mp.receiver and
             mp1.sent = mp.sent and mp1 in con.buffer.t2)
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t) implies mp.sender = mp.origin_sender
      
}
pred spoofProof[con:Connector]{

		
        all mp: MsgPassing, t: Tick |
          mp in con.buffer.t implies
          mp.sender = mp.origin_sender
      
}
pred tamperProof[con:Connector]{

		
        all t: Tick, mp: MsgPassing |
          mp in con.buffer.t implies (
            no mp1: MsgPassing - mp, t1: t.prevs |
              mp1.sender = mp.sender and
              mp1.receiver = mp.receiver and
              mp1.sent = mp.sent and
              mp1 in con.buffer.t1
          )
      
}
pred repudiationProof[con:Connector]{

		
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t and H_inject[mp.sender, mp, t]) implies Log.addEntry[mp, t]
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t and H_intercept[mp.receiver, mp, t]) implies Log.addEntry[mp, t]
      
}
pred informationDisclosureProof[con:Connector]{

		
        all mp: MsgPassing, t: Tick |
          mp in con.buffer.t implies
          con.connects.t = mp.origin_sender.uses + mp.receiver.uses
      
}
pred staleProof[con:Connector]{

		
        all t: Tick - tick/last, mp: MsgPassing |
          mp in con.buffer.t implies (
            mp in con.buffer.(t.next) or
            some c: Component | mp.receiver = c
          )
      
}
pred EoPProof[con:Connector]{

		
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t and H_inject[mp.sender, mp, t]) implies Z_inject[mp.sender, mp]
        all mp: MsgPassing, t: Tick |
          (mp in con.buffer.t and H_intercept[mp.receiver, mp, t]) implies Z_intercept[mp.receiver, mp]
      
}
pred SecureCommunicationRateLimiter[con:Connector]{

		
        all c1, c2: Component, t: Tick - tick/last |
          (con.portO in c1.uses and con.portI in c2.uses) implies
          #{ mp: MsgPassing |
            mp.sender = c1 and
            mp.receiver = c2 and
            mp.sent in (t + t.next)
          } <= 1
      
}
