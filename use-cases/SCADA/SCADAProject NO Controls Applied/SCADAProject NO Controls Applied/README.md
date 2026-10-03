# SCADA Secure Communication

CBDL project for SCADA/ICS systems — NIST SP 800-53 Rev.5 + OMB Circular A-130.

## Architecture
ControlCenter communicates with 3 Field Sites over TCP using TLS-secured connectors.

## Standards
- NIST SP 800-53 Rev.5 — SC-8, AC-17(02), SC-5, AC-6(08), AU-2(03)
- OMB Circular A-130 — Authentication requirements
- NISTxOMB overlay — B_SC_13_00, B_AC_17_02, B_SC_05_06, B_AC_06_08, B_AU_02_03

## Protocol
TLS 1.3 (RFC 8446)
