open metamodel/cbsemetamodel
open libs

one sig ControlCenter in Component {
}{
	uses = control_center_port_out_fs1 + control_center_port_out_fs2 + control_center_port_out_fs3 + control_center_port_out_fs4 + control_center_port_out_fs5 + control_center_port_out_fs6}


one sig FieldSite1 in Component {
}{
	uses = field_site1_port_in_fs1}


one sig FieldSite2 in Component {
}{
	uses = field_site2_port_in_fs2}


one sig FieldSite3 in Component {
}{
	uses = field_site3_port_in_fs3}


one sig FieldSite4 in Component {
}{
	uses = field_site4_port_in_fs4}


one sig FieldSite5 in Component {
}{
	uses = field_site5_port_in_fs5}


one sig FieldSite6 in Component {
}{
	uses = field_site6_port_in_fs6}



one sig control_center_port_out_fs1 in Port {}
one sig control_center_port_out_fs2 in Port {}
one sig control_center_port_out_fs3 in Port {}
one sig control_center_port_out_fs4 in Port {}
one sig control_center_port_out_fs5 in Port {}
one sig control_center_port_out_fs6 in Port {}
one sig field_site1_port_in_fs1 in Port {}
one sig field_site2_port_in_fs2 in Port {}
one sig field_site3_port_in_fs3 in Port {}
one sig field_site4_port_in_fs4 in Port {}
one sig field_site5_port_in_fs5 in Port {}
one sig field_site6_port_in_fs6 in Port {}

one sig con_ControlCenter_to_FieldSite1 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs1 + field_site1_port_in_fs1
	portO = control_center_port_out_fs1
	portI = field_site1_port_in_fs1
}
one sig con_ControlCenter_to_FieldSite2 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs2 + field_site2_port_in_fs2
	portO = control_center_port_out_fs2
	portI = field_site2_port_in_fs2
}
one sig con_ControlCenter_to_FieldSite3 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs3 + field_site3_port_in_fs3
	portO = control_center_port_out_fs3
	portI = field_site3_port_in_fs3
}
one sig con_ControlCenter_to_FieldSite4 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs4 + field_site4_port_in_fs4
	portO = control_center_port_out_fs4
	portI = field_site4_port_in_fs4
}
one sig con_ControlCenter_to_FieldSite5 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs5 + field_site5_port_in_fs5
	portO = control_center_port_out_fs5
	portI = field_site5_port_in_fs5
}
one sig con_ControlCenter_to_FieldSite6 in ConnectorMPS {
}{
	all t: Tick | connects.t = control_center_port_out_fs6 + field_site6_port_in_fs6
	portO = control_center_port_out_fs6
	portI = field_site6_port_in_fs6
}

fact ConnectorClosure {
	ConnectorMPS = con_ControlCenter_to_FieldSite1 + con_ControlCenter_to_FieldSite2 + con_ControlCenter_to_FieldSite3 + con_ControlCenter_to_FieldSite4 + con_ControlCenter_to_FieldSite5 + con_ControlCenter_to_FieldSite6}

// NO_SECURITY_CONTROLS_APPLIED
// No security controls were applied to this architecture.
// Compliance checks are evaluated over the unconstrained architecture.
