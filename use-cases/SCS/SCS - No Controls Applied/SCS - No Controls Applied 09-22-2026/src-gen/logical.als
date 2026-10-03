open metamodel/cbsemetamodel
open libs

one sig EngineerOperator in Component {
}{
	uses = engineer_operator_port_eo_send_commands}


one sig HMITerminal in Component {
}{
	uses = hmi_terminal_port_hmi_receive_requests + hmi_terminal_port_hmi_send_commands}


one sig MissionServers in Component {
}{
	uses = mission_servers_port_ms_receive_commands + mission_servers_port_ms_issue_commands_gs1 + mission_servers_port_ms_issue_commands_gs2 + mission_servers_port_ms_issue_commands_gs3}


one sig GroundStation1 in Component {
}{
	uses = ground_station1_port_gs1_receive_commands + ground_station1_port_gs1_uplink_sat01 + ground_station1_port_gs1_uplink_sat02 + ground_station1_port_gs1_uplink_sat03 + ground_station1_port_gs1_uplink_sat04 + ground_station1_port_gs1_uplink_sat05 + ground_station1_port_gs1_uplink_sat06 + ground_station1_port_gs1_uplink_sat07 + ground_station1_port_gs1_uplink_sat08 + ground_station1_port_gs1_uplink_sat09 + ground_station1_port_gs1_uplink_sat10 + ground_station1_port_gs1_uplink_sat11 + ground_station1_port_gs1_uplink_sat12 + ground_station1_port_gs1_uplink_sat13 + ground_station1_port_gs1_uplink_sat14}


one sig GroundStation2 in Component {
}{
	uses = ground_station2_port_gs2_receive_commands + ground_station2_port_gs2_uplink_sat15 + ground_station2_port_gs2_uplink_sat16 + ground_station2_port_gs2_uplink_sat17 + ground_station2_port_gs2_uplink_sat18 + ground_station2_port_gs2_uplink_sat19 + ground_station2_port_gs2_uplink_sat20 + ground_station2_port_gs2_uplink_sat21 + ground_station2_port_gs2_uplink_sat22 + ground_station2_port_gs2_uplink_sat23 + ground_station2_port_gs2_uplink_sat24 + ground_station2_port_gs2_uplink_sat25 + ground_station2_port_gs2_uplink_sat26 + ground_station2_port_gs2_uplink_sat27}


one sig GroundStation3 in Component {
}{
	uses = ground_station3_port_gs3_receive_commands + ground_station3_port_gs3_uplink_sat28 + ground_station3_port_gs3_uplink_sat29 + ground_station3_port_gs3_uplink_sat30 + ground_station3_port_gs3_uplink_sat31 + ground_station3_port_gs3_uplink_sat32 + ground_station3_port_gs3_uplink_sat33 + ground_station3_port_gs3_uplink_sat34 + ground_station3_port_gs3_uplink_sat35 + ground_station3_port_gs3_uplink_sat36 + ground_station3_port_gs3_uplink_sat37 + ground_station3_port_gs3_uplink_sat38 + ground_station3_port_gs3_uplink_sat39 + ground_station3_port_gs3_uplink_sat40}


one sig LEOSatellite01 in Component {
}{
	uses = leo_satellite01_port_sat01_receive_uplink}


one sig LEOSatellite02 in Component {
}{
	uses = leo_satellite02_port_sat02_receive_uplink}


one sig LEOSatellite03 in Component {
}{
	uses = leo_satellite03_port_sat03_receive_uplink}


one sig LEOSatellite04 in Component {
}{
	uses = leo_satellite04_port_sat04_receive_uplink}


one sig LEOSatellite05 in Component {
}{
	uses = leo_satellite05_port_sat05_receive_uplink}


one sig LEOSatellite06 in Component {
}{
	uses = leo_satellite06_port_sat06_receive_uplink}


one sig LEOSatellite07 in Component {
}{
	uses = leo_satellite07_port_sat07_receive_uplink}


one sig LEOSatellite08 in Component {
}{
	uses = leo_satellite08_port_sat08_receive_uplink}


one sig LEOSatellite09 in Component {
}{
	uses = leo_satellite09_port_sat09_receive_uplink}


one sig LEOSatellite10 in Component {
}{
	uses = leo_satellite10_port_sat10_receive_uplink}


one sig LEOSatellite11 in Component {
}{
	uses = leo_satellite11_port_sat11_receive_uplink}


one sig LEOSatellite12 in Component {
}{
	uses = leo_satellite12_port_sat12_receive_uplink}


one sig LEOSatellite13 in Component {
}{
	uses = leo_satellite13_port_sat13_receive_uplink}


one sig LEOSatellite14 in Component {
}{
	uses = leo_satellite14_port_sat14_receive_uplink}


one sig LEOSatellite15 in Component {
}{
	uses = leo_satellite15_port_sat15_receive_uplink}


one sig LEOSatellite16 in Component {
}{
	uses = leo_satellite16_port_sat16_receive_uplink}


one sig LEOSatellite17 in Component {
}{
	uses = leo_satellite17_port_sat17_receive_uplink}


one sig LEOSatellite18 in Component {
}{
	uses = leo_satellite18_port_sat18_receive_uplink}


one sig LEOSatellite19 in Component {
}{
	uses = leo_satellite19_port_sat19_receive_uplink}


one sig LEOSatellite20 in Component {
}{
	uses = leo_satellite20_port_sat20_receive_uplink}


one sig LEOSatellite21 in Component {
}{
	uses = leo_satellite21_port_sat21_receive_uplink}


one sig LEOSatellite22 in Component {
}{
	uses = leo_satellite22_port_sat22_receive_uplink}


one sig LEOSatellite23 in Component {
}{
	uses = leo_satellite23_port_sat23_receive_uplink}


one sig LEOSatellite24 in Component {
}{
	uses = leo_satellite24_port_sat24_receive_uplink}


one sig LEOSatellite25 in Component {
}{
	uses = leo_satellite25_port_sat25_receive_uplink}


one sig LEOSatellite26 in Component {
}{
	uses = leo_satellite26_port_sat26_receive_uplink}


one sig LEOSatellite27 in Component {
}{
	uses = leo_satellite27_port_sat27_receive_uplink}


one sig LEOSatellite28 in Component {
}{
	uses = leo_satellite28_port_sat28_receive_uplink}


one sig LEOSatellite29 in Component {
}{
	uses = leo_satellite29_port_sat29_receive_uplink}


one sig LEOSatellite30 in Component {
}{
	uses = leo_satellite30_port_sat30_receive_uplink}


one sig LEOSatellite31 in Component {
}{
	uses = leo_satellite31_port_sat31_receive_uplink}


one sig LEOSatellite32 in Component {
}{
	uses = leo_satellite32_port_sat32_receive_uplink}


one sig LEOSatellite33 in Component {
}{
	uses = leo_satellite33_port_sat33_receive_uplink}


one sig LEOSatellite34 in Component {
}{
	uses = leo_satellite34_port_sat34_receive_uplink}


one sig LEOSatellite35 in Component {
}{
	uses = leo_satellite35_port_sat35_receive_uplink}


one sig LEOSatellite36 in Component {
}{
	uses = leo_satellite36_port_sat36_receive_uplink}


one sig LEOSatellite37 in Component {
}{
	uses = leo_satellite37_port_sat37_receive_uplink}


one sig LEOSatellite38 in Component {
}{
	uses = leo_satellite38_port_sat38_receive_uplink}


one sig LEOSatellite39 in Component {
}{
	uses = leo_satellite39_port_sat39_receive_uplink}


one sig LEOSatellite40 in Component {
}{
	uses = leo_satellite40_port_sat40_receive_uplink}



one sig engineer_operator_port_eo_send_commands in Port {}
one sig hmi_terminal_port_hmi_receive_requests in Port {}
one sig hmi_terminal_port_hmi_send_commands in Port {}
one sig mission_servers_port_ms_receive_commands in Port {}
one sig mission_servers_port_ms_issue_commands_gs1 in Port {}
one sig mission_servers_port_ms_issue_commands_gs2 in Port {}
one sig mission_servers_port_ms_issue_commands_gs3 in Port {}
one sig ground_station1_port_gs1_receive_commands in Port {}
one sig ground_station1_port_gs1_uplink_sat01 in Port {}
one sig ground_station1_port_gs1_uplink_sat02 in Port {}
one sig ground_station1_port_gs1_uplink_sat03 in Port {}
one sig ground_station1_port_gs1_uplink_sat04 in Port {}
one sig ground_station1_port_gs1_uplink_sat05 in Port {}
one sig ground_station1_port_gs1_uplink_sat06 in Port {}
one sig ground_station1_port_gs1_uplink_sat07 in Port {}
one sig ground_station1_port_gs1_uplink_sat08 in Port {}
one sig ground_station1_port_gs1_uplink_sat09 in Port {}
one sig ground_station1_port_gs1_uplink_sat10 in Port {}
one sig ground_station1_port_gs1_uplink_sat11 in Port {}
one sig ground_station1_port_gs1_uplink_sat12 in Port {}
one sig ground_station1_port_gs1_uplink_sat13 in Port {}
one sig ground_station1_port_gs1_uplink_sat14 in Port {}
one sig ground_station2_port_gs2_receive_commands in Port {}
one sig ground_station2_port_gs2_uplink_sat15 in Port {}
one sig ground_station2_port_gs2_uplink_sat16 in Port {}
one sig ground_station2_port_gs2_uplink_sat17 in Port {}
one sig ground_station2_port_gs2_uplink_sat18 in Port {}
one sig ground_station2_port_gs2_uplink_sat19 in Port {}
one sig ground_station2_port_gs2_uplink_sat20 in Port {}
one sig ground_station2_port_gs2_uplink_sat21 in Port {}
one sig ground_station2_port_gs2_uplink_sat22 in Port {}
one sig ground_station2_port_gs2_uplink_sat23 in Port {}
one sig ground_station2_port_gs2_uplink_sat24 in Port {}
one sig ground_station2_port_gs2_uplink_sat25 in Port {}
one sig ground_station2_port_gs2_uplink_sat26 in Port {}
one sig ground_station2_port_gs2_uplink_sat27 in Port {}
one sig ground_station3_port_gs3_receive_commands in Port {}
one sig ground_station3_port_gs3_uplink_sat28 in Port {}
one sig ground_station3_port_gs3_uplink_sat29 in Port {}
one sig ground_station3_port_gs3_uplink_sat30 in Port {}
one sig ground_station3_port_gs3_uplink_sat31 in Port {}
one sig ground_station3_port_gs3_uplink_sat32 in Port {}
one sig ground_station3_port_gs3_uplink_sat33 in Port {}
one sig ground_station3_port_gs3_uplink_sat34 in Port {}
one sig ground_station3_port_gs3_uplink_sat35 in Port {}
one sig ground_station3_port_gs3_uplink_sat36 in Port {}
one sig ground_station3_port_gs3_uplink_sat37 in Port {}
one sig ground_station3_port_gs3_uplink_sat38 in Port {}
one sig ground_station3_port_gs3_uplink_sat39 in Port {}
one sig ground_station3_port_gs3_uplink_sat40 in Port {}
one sig leo_satellite01_port_sat01_receive_uplink in Port {}
one sig leo_satellite02_port_sat02_receive_uplink in Port {}
one sig leo_satellite03_port_sat03_receive_uplink in Port {}
one sig leo_satellite04_port_sat04_receive_uplink in Port {}
one sig leo_satellite05_port_sat05_receive_uplink in Port {}
one sig leo_satellite06_port_sat06_receive_uplink in Port {}
one sig leo_satellite07_port_sat07_receive_uplink in Port {}
one sig leo_satellite08_port_sat08_receive_uplink in Port {}
one sig leo_satellite09_port_sat09_receive_uplink in Port {}
one sig leo_satellite10_port_sat10_receive_uplink in Port {}
one sig leo_satellite11_port_sat11_receive_uplink in Port {}
one sig leo_satellite12_port_sat12_receive_uplink in Port {}
one sig leo_satellite13_port_sat13_receive_uplink in Port {}
one sig leo_satellite14_port_sat14_receive_uplink in Port {}
one sig leo_satellite15_port_sat15_receive_uplink in Port {}
one sig leo_satellite16_port_sat16_receive_uplink in Port {}
one sig leo_satellite17_port_sat17_receive_uplink in Port {}
one sig leo_satellite18_port_sat18_receive_uplink in Port {}
one sig leo_satellite19_port_sat19_receive_uplink in Port {}
one sig leo_satellite20_port_sat20_receive_uplink in Port {}
one sig leo_satellite21_port_sat21_receive_uplink in Port {}
one sig leo_satellite22_port_sat22_receive_uplink in Port {}
one sig leo_satellite23_port_sat23_receive_uplink in Port {}
one sig leo_satellite24_port_sat24_receive_uplink in Port {}
one sig leo_satellite25_port_sat25_receive_uplink in Port {}
one sig leo_satellite26_port_sat26_receive_uplink in Port {}
one sig leo_satellite27_port_sat27_receive_uplink in Port {}
one sig leo_satellite28_port_sat28_receive_uplink in Port {}
one sig leo_satellite29_port_sat29_receive_uplink in Port {}
one sig leo_satellite30_port_sat30_receive_uplink in Port {}
one sig leo_satellite31_port_sat31_receive_uplink in Port {}
one sig leo_satellite32_port_sat32_receive_uplink in Port {}
one sig leo_satellite33_port_sat33_receive_uplink in Port {}
one sig leo_satellite34_port_sat34_receive_uplink in Port {}
one sig leo_satellite35_port_sat35_receive_uplink in Port {}
one sig leo_satellite36_port_sat36_receive_uplink in Port {}
one sig leo_satellite37_port_sat37_receive_uplink in Port {}
one sig leo_satellite38_port_sat38_receive_uplink in Port {}
one sig leo_satellite39_port_sat39_receive_uplink in Port {}
one sig leo_satellite40_port_sat40_receive_uplink in Port {}

one sig con_EngineerOperator_to_HMITerminal in ConnectorMPS {
}{
	all t: Tick | connects.t = engineer_operator_port_eo_send_commands + hmi_terminal_port_hmi_receive_requests
	portO = engineer_operator_port_eo_send_commands
	portI = hmi_terminal_port_hmi_receive_requests
}
one sig con_HMITerminal_to_MissionServers in ConnectorMPS {
}{
	all t: Tick | connects.t = hmi_terminal_port_hmi_send_commands + mission_servers_port_ms_receive_commands
	portO = hmi_terminal_port_hmi_send_commands
	portI = mission_servers_port_ms_receive_commands
}
one sig con_MissionServers_to_GroundStation1 in ConnectorMPS {
}{
	all t: Tick | connects.t = mission_servers_port_ms_issue_commands_gs1 + ground_station1_port_gs1_receive_commands
	portO = mission_servers_port_ms_issue_commands_gs1
	portI = ground_station1_port_gs1_receive_commands
}
one sig con_MissionServers_to_GroundStation2 in ConnectorMPS {
}{
	all t: Tick | connects.t = mission_servers_port_ms_issue_commands_gs2 + ground_station2_port_gs2_receive_commands
	portO = mission_servers_port_ms_issue_commands_gs2
	portI = ground_station2_port_gs2_receive_commands
}
one sig con_MissionServers_to_GroundStation3 in ConnectorMPS {
}{
	all t: Tick | connects.t = mission_servers_port_ms_issue_commands_gs3 + ground_station3_port_gs3_receive_commands
	portO = mission_servers_port_ms_issue_commands_gs3
	portI = ground_station3_port_gs3_receive_commands
}
one sig con_GroundStation1_to_LEOSatellite01 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat01 + leo_satellite01_port_sat01_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat01
	portI = leo_satellite01_port_sat01_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite02 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat02 + leo_satellite02_port_sat02_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat02
	portI = leo_satellite02_port_sat02_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite03 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat03 + leo_satellite03_port_sat03_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat03
	portI = leo_satellite03_port_sat03_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite04 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat04 + leo_satellite04_port_sat04_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat04
	portI = leo_satellite04_port_sat04_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite05 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat05 + leo_satellite05_port_sat05_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat05
	portI = leo_satellite05_port_sat05_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite06 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat06 + leo_satellite06_port_sat06_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat06
	portI = leo_satellite06_port_sat06_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite07 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat07 + leo_satellite07_port_sat07_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat07
	portI = leo_satellite07_port_sat07_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite08 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat08 + leo_satellite08_port_sat08_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat08
	portI = leo_satellite08_port_sat08_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite09 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat09 + leo_satellite09_port_sat09_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat09
	portI = leo_satellite09_port_sat09_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite10 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat10 + leo_satellite10_port_sat10_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat10
	portI = leo_satellite10_port_sat10_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite11 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat11 + leo_satellite11_port_sat11_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat11
	portI = leo_satellite11_port_sat11_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite12 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat12 + leo_satellite12_port_sat12_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat12
	portI = leo_satellite12_port_sat12_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite13 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat13 + leo_satellite13_port_sat13_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat13
	portI = leo_satellite13_port_sat13_receive_uplink
}
one sig con_GroundStation1_to_LEOSatellite14 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station1_port_gs1_uplink_sat14 + leo_satellite14_port_sat14_receive_uplink
	portO = ground_station1_port_gs1_uplink_sat14
	portI = leo_satellite14_port_sat14_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite15 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat15 + leo_satellite15_port_sat15_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat15
	portI = leo_satellite15_port_sat15_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite16 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat16 + leo_satellite16_port_sat16_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat16
	portI = leo_satellite16_port_sat16_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite17 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat17 + leo_satellite17_port_sat17_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat17
	portI = leo_satellite17_port_sat17_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite18 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat18 + leo_satellite18_port_sat18_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat18
	portI = leo_satellite18_port_sat18_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite19 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat19 + leo_satellite19_port_sat19_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat19
	portI = leo_satellite19_port_sat19_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite20 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat20 + leo_satellite20_port_sat20_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat20
	portI = leo_satellite20_port_sat20_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite21 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat21 + leo_satellite21_port_sat21_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat21
	portI = leo_satellite21_port_sat21_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite22 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat22 + leo_satellite22_port_sat22_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat22
	portI = leo_satellite22_port_sat22_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite23 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat23 + leo_satellite23_port_sat23_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat23
	portI = leo_satellite23_port_sat23_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite24 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat24 + leo_satellite24_port_sat24_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat24
	portI = leo_satellite24_port_sat24_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite25 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat25 + leo_satellite25_port_sat25_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat25
	portI = leo_satellite25_port_sat25_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite26 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat26 + leo_satellite26_port_sat26_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat26
	portI = leo_satellite26_port_sat26_receive_uplink
}
one sig con_GroundStation2_to_LEOSatellite27 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station2_port_gs2_uplink_sat27 + leo_satellite27_port_sat27_receive_uplink
	portO = ground_station2_port_gs2_uplink_sat27
	portI = leo_satellite27_port_sat27_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite28 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat28 + leo_satellite28_port_sat28_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat28
	portI = leo_satellite28_port_sat28_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite29 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat29 + leo_satellite29_port_sat29_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat29
	portI = leo_satellite29_port_sat29_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite30 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat30 + leo_satellite30_port_sat30_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat30
	portI = leo_satellite30_port_sat30_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite31 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat31 + leo_satellite31_port_sat31_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat31
	portI = leo_satellite31_port_sat31_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite32 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat32 + leo_satellite32_port_sat32_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat32
	portI = leo_satellite32_port_sat32_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite33 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat33 + leo_satellite33_port_sat33_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat33
	portI = leo_satellite33_port_sat33_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite34 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat34 + leo_satellite34_port_sat34_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat34
	portI = leo_satellite34_port_sat34_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite35 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat35 + leo_satellite35_port_sat35_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat35
	portI = leo_satellite35_port_sat35_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite36 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat36 + leo_satellite36_port_sat36_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat36
	portI = leo_satellite36_port_sat36_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite37 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat37 + leo_satellite37_port_sat37_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat37
	portI = leo_satellite37_port_sat37_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite38 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat38 + leo_satellite38_port_sat38_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat38
	portI = leo_satellite38_port_sat38_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite39 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat39 + leo_satellite39_port_sat39_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat39
	portI = leo_satellite39_port_sat39_receive_uplink
}
one sig con_GroundStation3_to_LEOSatellite40 in ConnectorMPS {
}{
	all t: Tick | connects.t = ground_station3_port_gs3_uplink_sat40 + leo_satellite40_port_sat40_receive_uplink
	portO = ground_station3_port_gs3_uplink_sat40
	portI = leo_satellite40_port_sat40_receive_uplink
}

fact ConnectorClosure {
	ConnectorMPS = con_EngineerOperator_to_HMITerminal + con_HMITerminal_to_MissionServers + con_MissionServers_to_GroundStation1 + con_MissionServers_to_GroundStation2 + con_MissionServers_to_GroundStation3 + con_GroundStation1_to_LEOSatellite01 + con_GroundStation1_to_LEOSatellite02 + con_GroundStation1_to_LEOSatellite03 + con_GroundStation1_to_LEOSatellite04 + con_GroundStation1_to_LEOSatellite05 + con_GroundStation1_to_LEOSatellite06 + con_GroundStation1_to_LEOSatellite07 + con_GroundStation1_to_LEOSatellite08 + con_GroundStation1_to_LEOSatellite09 + con_GroundStation1_to_LEOSatellite10 + con_GroundStation1_to_LEOSatellite11 + con_GroundStation1_to_LEOSatellite12 + con_GroundStation1_to_LEOSatellite13 + con_GroundStation1_to_LEOSatellite14 + con_GroundStation2_to_LEOSatellite15 + con_GroundStation2_to_LEOSatellite16 + con_GroundStation2_to_LEOSatellite17 + con_GroundStation2_to_LEOSatellite18 + con_GroundStation2_to_LEOSatellite19 + con_GroundStation2_to_LEOSatellite20 + con_GroundStation2_to_LEOSatellite21 + con_GroundStation2_to_LEOSatellite22 + con_GroundStation2_to_LEOSatellite23 + con_GroundStation2_to_LEOSatellite24 + con_GroundStation2_to_LEOSatellite25 + con_GroundStation2_to_LEOSatellite26 + con_GroundStation2_to_LEOSatellite27 + con_GroundStation3_to_LEOSatellite28 + con_GroundStation3_to_LEOSatellite29 + con_GroundStation3_to_LEOSatellite30 + con_GroundStation3_to_LEOSatellite31 + con_GroundStation3_to_LEOSatellite32 + con_GroundStation3_to_LEOSatellite33 + con_GroundStation3_to_LEOSatellite34 + con_GroundStation3_to_LEOSatellite35 + con_GroundStation3_to_LEOSatellite36 + con_GroundStation3_to_LEOSatellite37 + con_GroundStation3_to_LEOSatellite38 + con_GroundStation3_to_LEOSatellite39 + con_GroundStation3_to_LEOSatellite40}

// NO_SECURITY_CONTROLS_APPLIED
// No security controls were applied to this architecture.
// Compliance checks are evaluated over the unconstrained architecture.
