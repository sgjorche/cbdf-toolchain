open metamodel/cbsemetamodel
open libs

one sig ANSP_Belgium in Component {
}{
	uses = ansp_belgium_port_belgium_out}


one sig ANSP_France in Component {
}{
	uses = ansp_france_port_france_out}


one sig ANSP_Germany in Component {
}{
	uses = ansp_germany_port_germany_out}


one sig ANSP_Luxembourg in Component {
}{
	uses = ansp_luxembourg_port_luxembourg_out}


one sig ANSP_Netherlands in Component {
}{
	uses = ansp_netherlands_port_netherlands_out}


one sig ANSP_UnitedKingdom in Component {
}{
	uses = ansp_united_kingdom_port_unitedkingdom_out}


one sig ANSP_Ireland in Component {
}{
	uses = ansp_ireland_port_ireland_out}


one sig ANSP_Portugal in Component {
}{
	uses = ansp_portugal_port_portugal_out}


one sig ANSP_Switzerland in Component {
}{
	uses = ansp_switzerland_port_switzerland_out}


one sig ANSP_Austria in Component {
}{
	uses = ansp_austria_port_austria_out}


one sig ANSP_Denmark in Component {
}{
	uses = ansp_denmark_port_denmark_out}


one sig ANSP_Norway in Component {
}{
	uses = ansp_norway_port_norway_out}


one sig ANSP_Sweden in Component {
}{
	uses = ansp_sweden_port_sweden_out}


one sig ANSP_Finland in Component {
}{
	uses = ansp_finland_port_finland_out}


one sig ANSP_CzechRepublic in Component {
}{
	uses = ansp_czech_republic_port_czechrepublic_out}


one sig ANSP_Slovakia in Component {
}{
	uses = ansp_slovakia_port_slovakia_out}


one sig ANSP_Poland in Component {
}{
	uses = ansp_poland_port_poland_out}


one sig ANSP_Hungary in Component {
}{
	uses = ansp_hungary_port_hungary_out}


one sig ANSP_Romania in Component {
}{
	uses = ansp_romania_port_romania_out}


one sig ANSP_Bulgaria in Component {
}{
	uses = ansp_bulgaria_port_bulgaria_out}


one sig ANSP_Croatia in Component {
}{
	uses = ansp_croatia_port_croatia_out}


one sig ANSP_Slovenia in Component {
}{
	uses = ansp_slovenia_port_slovenia_out}


one sig ANSP_Lithuania in Component {
}{
	uses = ansp_lithuania_port_lithuania_out}


one sig ANSP_Latvia in Component {
}{
	uses = ansp_latvia_port_latvia_out}


one sig ANSP_Estonia in Component {
}{
	uses = ansp_estonia_port_estonia_out}


one sig ANSP_Iceland in Component {
}{
	uses = ansp_iceland_port_iceland_out}


one sig ANSP_Ukraine in Component {
}{
	uses = ansp_ukraine_port_ukraine_out}


one sig ANSP_Moldova in Component {
}{
	uses = ansp_moldova_port_moldova_out}


one sig ANSP_Greece in Component {
}{
	uses = ansp_greece_port_greece_out}


one sig ANSP_Malta in Component {
}{
	uses = ansp_malta_port_malta_out}


one sig ANSP_Turkey in Component {
}{
	uses = ansp_turkey_port_turkey_out}


one sig ANSP_Cyprus in Component {
}{
	uses = ansp_cyprus_port_cyprus_out}


one sig ANSP_Spain in Component {
}{
	uses = ansp_spain_port_spain_out}


one sig ANSP_Italy in Component {
}{
	uses = ansp_italy_port_italy_out}


one sig ANSP_Albania in Component {
}{
	uses = ansp_albania_port_albania_out}


one sig ANSP_BosniaHerzegovina in Component {
}{
	uses = ansp_bosnia_herzegovina_port_bosniaherzegovina_out}


one sig ANSP_Serbia in Component {
}{
	uses = ansp_serbia_port_serbia_out}


one sig ANSP_Montenegro in Component {
}{
	uses = ansp_montenegro_port_montenegro_out}


one sig ANSP_NorthMacedonia in Component {
}{
	uses = ansp_north_macedonia_port_northmacedonia_out}


one sig ANSP_Monaco in Component {
}{
	uses = ansp_monaco_port_monaco_out}


one sig ANSP_Armenia in Component {
}{
	uses = ansp_armenia_port_armenia_out}


one sig ANSP_Georgia in Component {
}{
	uses = ansp_georgia_port_georgia_out}


one sig AOC in Component {
}{
	uses = aoc_port_aoc_out}


one sig ATMPortal in Component {
}{
	uses = atm_portal_port_atmp_out}


one sig Gateway in Component {
}{
	uses = gateway_port_gw_in_belgium + gateway_port_gw_in_france + gateway_port_gw_in_germany + gateway_port_gw_in_luxembourg + gateway_port_gw_in_netherlands + gateway_port_gw_in_unitedkingdom + gateway_port_gw_in_ireland + gateway_port_gw_in_portugal + gateway_port_gw_in_switzerland + gateway_port_gw_in_austria + gateway_port_gw_in_denmark + gateway_port_gw_in_norway + gateway_port_gw_in_sweden + gateway_port_gw_in_finland + gateway_port_gw_in_czechrepublic + gateway_port_gw_in_slovakia + gateway_port_gw_in_poland + gateway_port_gw_in_hungary + gateway_port_gw_in_romania + gateway_port_gw_in_bulgaria + gateway_port_gw_in_croatia + gateway_port_gw_in_slovenia + gateway_port_gw_in_lithuania + gateway_port_gw_in_latvia + gateway_port_gw_in_estonia + gateway_port_gw_in_iceland + gateway_port_gw_in_ukraine + gateway_port_gw_in_moldova + gateway_port_gw_in_greece + gateway_port_gw_in_malta + gateway_port_gw_in_turkey + gateway_port_gw_in_cyprus + gateway_port_gw_in_spain + gateway_port_gw_in_italy + gateway_port_gw_in_albania + gateway_port_gw_in_bosniaherzegovina + gateway_port_gw_in_serbia + gateway_port_gw_in_montenegro + gateway_port_gw_in_northmacedonia + gateway_port_gw_in_monaco + gateway_port_gw_in_armenia + gateway_port_gw_in_georgia + gateway_port_gw_in_aoc + gateway_port_gw_in_atmp + gateway_port_gw_out_nmoc + gateway_port_gw_out_cfmu}


one sig NMOC in Component {
}{
	uses = nmoc_port_nmoc_in + nmoc_port_nmoc_out_bcf}


one sig CFMU in Component {
}{
	uses = cfmu_port_cfmu_in + cfmu_port_cfmu_out_fdps}


one sig FDPS in Component {
}{
	uses = fdps_port_fdps_in + fdps_port_fdps_out}


one sig BusinessCellFlow in Component {
}{
	uses = business_cell_flow_port_bcf_in + business_cell_flow_port_bcf_out}


one sig TraditionalStructureData in Component {
}{
	uses = traditional_structure_data_port_tsd_in + traditional_structure_data_port_tsd_out}


one sig BIEcosystem in Component {
}{
	uses = bi_ecosystem_port_bi_in_bcf + bi_ecosystem_port_bi_in_tsd}



one sig ansp_belgium_port_belgium_out in Port {}
one sig ansp_france_port_france_out in Port {}
one sig ansp_germany_port_germany_out in Port {}
one sig ansp_luxembourg_port_luxembourg_out in Port {}
one sig ansp_netherlands_port_netherlands_out in Port {}
one sig ansp_united_kingdom_port_unitedkingdom_out in Port {}
one sig ansp_ireland_port_ireland_out in Port {}
one sig ansp_portugal_port_portugal_out in Port {}
one sig ansp_switzerland_port_switzerland_out in Port {}
one sig ansp_austria_port_austria_out in Port {}
one sig ansp_denmark_port_denmark_out in Port {}
one sig ansp_norway_port_norway_out in Port {}
one sig ansp_sweden_port_sweden_out in Port {}
one sig ansp_finland_port_finland_out in Port {}
one sig ansp_czech_republic_port_czechrepublic_out in Port {}
one sig ansp_slovakia_port_slovakia_out in Port {}
one sig ansp_poland_port_poland_out in Port {}
one sig ansp_hungary_port_hungary_out in Port {}
one sig ansp_romania_port_romania_out in Port {}
one sig ansp_bulgaria_port_bulgaria_out in Port {}
one sig ansp_croatia_port_croatia_out in Port {}
one sig ansp_slovenia_port_slovenia_out in Port {}
one sig ansp_lithuania_port_lithuania_out in Port {}
one sig ansp_latvia_port_latvia_out in Port {}
one sig ansp_estonia_port_estonia_out in Port {}
one sig ansp_iceland_port_iceland_out in Port {}
one sig ansp_ukraine_port_ukraine_out in Port {}
one sig ansp_moldova_port_moldova_out in Port {}
one sig ansp_greece_port_greece_out in Port {}
one sig ansp_malta_port_malta_out in Port {}
one sig ansp_turkey_port_turkey_out in Port {}
one sig ansp_cyprus_port_cyprus_out in Port {}
one sig ansp_spain_port_spain_out in Port {}
one sig ansp_italy_port_italy_out in Port {}
one sig ansp_albania_port_albania_out in Port {}
one sig ansp_bosnia_herzegovina_port_bosniaherzegovina_out in Port {}
one sig ansp_serbia_port_serbia_out in Port {}
one sig ansp_montenegro_port_montenegro_out in Port {}
one sig ansp_north_macedonia_port_northmacedonia_out in Port {}
one sig ansp_monaco_port_monaco_out in Port {}
one sig ansp_armenia_port_armenia_out in Port {}
one sig ansp_georgia_port_georgia_out in Port {}
one sig aoc_port_aoc_out in Port {}
one sig atm_portal_port_atmp_out in Port {}
one sig gateway_port_gw_in_belgium in Port {}
one sig gateway_port_gw_in_france in Port {}
one sig gateway_port_gw_in_germany in Port {}
one sig gateway_port_gw_in_luxembourg in Port {}
one sig gateway_port_gw_in_netherlands in Port {}
one sig gateway_port_gw_in_unitedkingdom in Port {}
one sig gateway_port_gw_in_ireland in Port {}
one sig gateway_port_gw_in_portugal in Port {}
one sig gateway_port_gw_in_switzerland in Port {}
one sig gateway_port_gw_in_austria in Port {}
one sig gateway_port_gw_in_denmark in Port {}
one sig gateway_port_gw_in_norway in Port {}
one sig gateway_port_gw_in_sweden in Port {}
one sig gateway_port_gw_in_finland in Port {}
one sig gateway_port_gw_in_czechrepublic in Port {}
one sig gateway_port_gw_in_slovakia in Port {}
one sig gateway_port_gw_in_poland in Port {}
one sig gateway_port_gw_in_hungary in Port {}
one sig gateway_port_gw_in_romania in Port {}
one sig gateway_port_gw_in_bulgaria in Port {}
one sig gateway_port_gw_in_croatia in Port {}
one sig gateway_port_gw_in_slovenia in Port {}
one sig gateway_port_gw_in_lithuania in Port {}
one sig gateway_port_gw_in_latvia in Port {}
one sig gateway_port_gw_in_estonia in Port {}
one sig gateway_port_gw_in_iceland in Port {}
one sig gateway_port_gw_in_ukraine in Port {}
one sig gateway_port_gw_in_moldova in Port {}
one sig gateway_port_gw_in_greece in Port {}
one sig gateway_port_gw_in_malta in Port {}
one sig gateway_port_gw_in_turkey in Port {}
one sig gateway_port_gw_in_cyprus in Port {}
one sig gateway_port_gw_in_spain in Port {}
one sig gateway_port_gw_in_italy in Port {}
one sig gateway_port_gw_in_albania in Port {}
one sig gateway_port_gw_in_bosniaherzegovina in Port {}
one sig gateway_port_gw_in_serbia in Port {}
one sig gateway_port_gw_in_montenegro in Port {}
one sig gateway_port_gw_in_northmacedonia in Port {}
one sig gateway_port_gw_in_monaco in Port {}
one sig gateway_port_gw_in_armenia in Port {}
one sig gateway_port_gw_in_georgia in Port {}
one sig gateway_port_gw_in_aoc in Port {}
one sig gateway_port_gw_in_atmp in Port {}
one sig gateway_port_gw_out_nmoc in Port {}
one sig gateway_port_gw_out_cfmu in Port {}
one sig nmoc_port_nmoc_in in Port {}
one sig nmoc_port_nmoc_out_bcf in Port {}
one sig cfmu_port_cfmu_in in Port {}
one sig cfmu_port_cfmu_out_fdps in Port {}
one sig fdps_port_fdps_in in Port {}
one sig fdps_port_fdps_out in Port {}
one sig business_cell_flow_port_bcf_in in Port {}
one sig business_cell_flow_port_bcf_out in Port {}
one sig traditional_structure_data_port_tsd_in in Port {}
one sig traditional_structure_data_port_tsd_out in Port {}
one sig bi_ecosystem_port_bi_in_bcf in Port {}
one sig bi_ecosystem_port_bi_in_tsd in Port {}

one sig con_ANSP_Belgium_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_belgium_port_belgium_out + gateway_port_gw_in_belgium
	portO = ansp_belgium_port_belgium_out
	portI = gateway_port_gw_in_belgium
}
one sig con_ANSP_France_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_france_port_france_out + gateway_port_gw_in_france
	portO = ansp_france_port_france_out
	portI = gateway_port_gw_in_france
}
one sig con_ANSP_Germany_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_germany_port_germany_out + gateway_port_gw_in_germany
	portO = ansp_germany_port_germany_out
	portI = gateway_port_gw_in_germany
}
one sig con_ANSP_Luxembourg_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_luxembourg_port_luxembourg_out + gateway_port_gw_in_luxembourg
	portO = ansp_luxembourg_port_luxembourg_out
	portI = gateway_port_gw_in_luxembourg
}
one sig con_ANSP_Netherlands_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_netherlands_port_netherlands_out + gateway_port_gw_in_netherlands
	portO = ansp_netherlands_port_netherlands_out
	portI = gateway_port_gw_in_netherlands
}
one sig con_ANSP_UnitedKingdom_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_united_kingdom_port_unitedkingdom_out + gateway_port_gw_in_unitedkingdom
	portO = ansp_united_kingdom_port_unitedkingdom_out
	portI = gateway_port_gw_in_unitedkingdom
}
one sig con_ANSP_Ireland_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_ireland_port_ireland_out + gateway_port_gw_in_ireland
	portO = ansp_ireland_port_ireland_out
	portI = gateway_port_gw_in_ireland
}
one sig con_ANSP_Portugal_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_portugal_port_portugal_out + gateway_port_gw_in_portugal
	portO = ansp_portugal_port_portugal_out
	portI = gateway_port_gw_in_portugal
}
one sig con_ANSP_Switzerland_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_switzerland_port_switzerland_out + gateway_port_gw_in_switzerland
	portO = ansp_switzerland_port_switzerland_out
	portI = gateway_port_gw_in_switzerland
}
one sig con_ANSP_Austria_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_austria_port_austria_out + gateway_port_gw_in_austria
	portO = ansp_austria_port_austria_out
	portI = gateway_port_gw_in_austria
}
one sig con_ANSP_Denmark_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_denmark_port_denmark_out + gateway_port_gw_in_denmark
	portO = ansp_denmark_port_denmark_out
	portI = gateway_port_gw_in_denmark
}
one sig con_ANSP_Norway_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_norway_port_norway_out + gateway_port_gw_in_norway
	portO = ansp_norway_port_norway_out
	portI = gateway_port_gw_in_norway
}
one sig con_ANSP_Sweden_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_sweden_port_sweden_out + gateway_port_gw_in_sweden
	portO = ansp_sweden_port_sweden_out
	portI = gateway_port_gw_in_sweden
}
one sig con_ANSP_Finland_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_finland_port_finland_out + gateway_port_gw_in_finland
	portO = ansp_finland_port_finland_out
	portI = gateway_port_gw_in_finland
}
one sig con_ANSP_CzechRepublic_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_czech_republic_port_czechrepublic_out + gateway_port_gw_in_czechrepublic
	portO = ansp_czech_republic_port_czechrepublic_out
	portI = gateway_port_gw_in_czechrepublic
}
one sig con_ANSP_Slovakia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_slovakia_port_slovakia_out + gateway_port_gw_in_slovakia
	portO = ansp_slovakia_port_slovakia_out
	portI = gateway_port_gw_in_slovakia
}
one sig con_ANSP_Poland_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_poland_port_poland_out + gateway_port_gw_in_poland
	portO = ansp_poland_port_poland_out
	portI = gateway_port_gw_in_poland
}
one sig con_ANSP_Hungary_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_hungary_port_hungary_out + gateway_port_gw_in_hungary
	portO = ansp_hungary_port_hungary_out
	portI = gateway_port_gw_in_hungary
}
one sig con_ANSP_Romania_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_romania_port_romania_out + gateway_port_gw_in_romania
	portO = ansp_romania_port_romania_out
	portI = gateway_port_gw_in_romania
}
one sig con_ANSP_Bulgaria_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_bulgaria_port_bulgaria_out + gateway_port_gw_in_bulgaria
	portO = ansp_bulgaria_port_bulgaria_out
	portI = gateway_port_gw_in_bulgaria
}
one sig con_ANSP_Croatia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_croatia_port_croatia_out + gateway_port_gw_in_croatia
	portO = ansp_croatia_port_croatia_out
	portI = gateway_port_gw_in_croatia
}
one sig con_ANSP_Slovenia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_slovenia_port_slovenia_out + gateway_port_gw_in_slovenia
	portO = ansp_slovenia_port_slovenia_out
	portI = gateway_port_gw_in_slovenia
}
one sig con_ANSP_Lithuania_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_lithuania_port_lithuania_out + gateway_port_gw_in_lithuania
	portO = ansp_lithuania_port_lithuania_out
	portI = gateway_port_gw_in_lithuania
}
one sig con_ANSP_Latvia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_latvia_port_latvia_out + gateway_port_gw_in_latvia
	portO = ansp_latvia_port_latvia_out
	portI = gateway_port_gw_in_latvia
}
one sig con_ANSP_Estonia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_estonia_port_estonia_out + gateway_port_gw_in_estonia
	portO = ansp_estonia_port_estonia_out
	portI = gateway_port_gw_in_estonia
}
one sig con_ANSP_Iceland_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_iceland_port_iceland_out + gateway_port_gw_in_iceland
	portO = ansp_iceland_port_iceland_out
	portI = gateway_port_gw_in_iceland
}
one sig con_ANSP_Ukraine_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_ukraine_port_ukraine_out + gateway_port_gw_in_ukraine
	portO = ansp_ukraine_port_ukraine_out
	portI = gateway_port_gw_in_ukraine
}
one sig con_ANSP_Moldova_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_moldova_port_moldova_out + gateway_port_gw_in_moldova
	portO = ansp_moldova_port_moldova_out
	portI = gateway_port_gw_in_moldova
}
one sig con_ANSP_Greece_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_greece_port_greece_out + gateway_port_gw_in_greece
	portO = ansp_greece_port_greece_out
	portI = gateway_port_gw_in_greece
}
one sig con_ANSP_Malta_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_malta_port_malta_out + gateway_port_gw_in_malta
	portO = ansp_malta_port_malta_out
	portI = gateway_port_gw_in_malta
}
one sig con_ANSP_Turkey_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_turkey_port_turkey_out + gateway_port_gw_in_turkey
	portO = ansp_turkey_port_turkey_out
	portI = gateway_port_gw_in_turkey
}
one sig con_ANSP_Cyprus_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_cyprus_port_cyprus_out + gateway_port_gw_in_cyprus
	portO = ansp_cyprus_port_cyprus_out
	portI = gateway_port_gw_in_cyprus
}
one sig con_ANSP_Spain_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_spain_port_spain_out + gateway_port_gw_in_spain
	portO = ansp_spain_port_spain_out
	portI = gateway_port_gw_in_spain
}
one sig con_ANSP_Italy_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_italy_port_italy_out + gateway_port_gw_in_italy
	portO = ansp_italy_port_italy_out
	portI = gateway_port_gw_in_italy
}
one sig con_ANSP_Albania_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_albania_port_albania_out + gateway_port_gw_in_albania
	portO = ansp_albania_port_albania_out
	portI = gateway_port_gw_in_albania
}
one sig con_ANSP_BosniaHerzegovina_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_bosnia_herzegovina_port_bosniaherzegovina_out + gateway_port_gw_in_bosniaherzegovina
	portO = ansp_bosnia_herzegovina_port_bosniaherzegovina_out
	portI = gateway_port_gw_in_bosniaherzegovina
}
one sig con_ANSP_Serbia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_serbia_port_serbia_out + gateway_port_gw_in_serbia
	portO = ansp_serbia_port_serbia_out
	portI = gateway_port_gw_in_serbia
}
one sig con_ANSP_Montenegro_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_montenegro_port_montenegro_out + gateway_port_gw_in_montenegro
	portO = ansp_montenegro_port_montenegro_out
	portI = gateway_port_gw_in_montenegro
}
one sig con_ANSP_NorthMacedonia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_north_macedonia_port_northmacedonia_out + gateway_port_gw_in_northmacedonia
	portO = ansp_north_macedonia_port_northmacedonia_out
	portI = gateway_port_gw_in_northmacedonia
}
one sig con_ANSP_Monaco_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_monaco_port_monaco_out + gateway_port_gw_in_monaco
	portO = ansp_monaco_port_monaco_out
	portI = gateway_port_gw_in_monaco
}
one sig con_ANSP_Armenia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_armenia_port_armenia_out + gateway_port_gw_in_armenia
	portO = ansp_armenia_port_armenia_out
	portI = gateway_port_gw_in_armenia
}
one sig con_ANSP_Georgia_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = ansp_georgia_port_georgia_out + gateway_port_gw_in_georgia
	portO = ansp_georgia_port_georgia_out
	portI = gateway_port_gw_in_georgia
}
one sig con_AOC_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = aoc_port_aoc_out + gateway_port_gw_in_aoc
	portO = aoc_port_aoc_out
	portI = gateway_port_gw_in_aoc
}
one sig con_ATMPortal_to_Gateway in ConnectorMPS {
}{
	all t: Tick | connects.t = atm_portal_port_atmp_out + gateway_port_gw_in_atmp
	portO = atm_portal_port_atmp_out
	portI = gateway_port_gw_in_atmp
}
one sig con_Gateway_to_NMOC in ConnectorMPS {
}{
	all t: Tick | connects.t = gateway_port_gw_out_nmoc + nmoc_port_nmoc_in
	portO = gateway_port_gw_out_nmoc
	portI = nmoc_port_nmoc_in
}
one sig con_Gateway_to_CFMU in ConnectorMPS {
}{
	all t: Tick | connects.t = gateway_port_gw_out_cfmu + cfmu_port_cfmu_in
	portO = gateway_port_gw_out_cfmu
	portI = cfmu_port_cfmu_in
}
one sig con_NMOC_to_BusinessCellFlow in ConnectorMPS {
}{
	all t: Tick | connects.t = nmoc_port_nmoc_out_bcf + business_cell_flow_port_bcf_in
	portO = nmoc_port_nmoc_out_bcf
	portI = business_cell_flow_port_bcf_in
}
one sig con_CFMU_to_FDPS in ConnectorMPS {
}{
	all t: Tick | connects.t = cfmu_port_cfmu_out_fdps + fdps_port_fdps_in
	portO = cfmu_port_cfmu_out_fdps
	portI = fdps_port_fdps_in
}
one sig con_FDPS_to_TraditionalStructureData in ConnectorMPS {
}{
	all t: Tick | connects.t = fdps_port_fdps_out + traditional_structure_data_port_tsd_in
	portO = fdps_port_fdps_out
	portI = traditional_structure_data_port_tsd_in
}
one sig con_BusinessCellFlow_to_BIEcosystem in ConnectorMPS {
}{
	all t: Tick | connects.t = business_cell_flow_port_bcf_out + bi_ecosystem_port_bi_in_bcf
	portO = business_cell_flow_port_bcf_out
	portI = bi_ecosystem_port_bi_in_bcf
}
one sig con_TraditionalStructureData_to_BIEcosystem in ConnectorMPS {
}{
	all t: Tick | connects.t = traditional_structure_data_port_tsd_out + bi_ecosystem_port_bi_in_tsd
	portO = traditional_structure_data_port_tsd_out
	portI = bi_ecosystem_port_bi_in_tsd
}

fact ConnectorClosure {
	ConnectorMPS = con_ANSP_Belgium_to_Gateway + con_ANSP_France_to_Gateway + con_ANSP_Germany_to_Gateway + con_ANSP_Luxembourg_to_Gateway + con_ANSP_Netherlands_to_Gateway + con_ANSP_UnitedKingdom_to_Gateway + con_ANSP_Ireland_to_Gateway + con_ANSP_Portugal_to_Gateway + con_ANSP_Switzerland_to_Gateway + con_ANSP_Austria_to_Gateway + con_ANSP_Denmark_to_Gateway + con_ANSP_Norway_to_Gateway + con_ANSP_Sweden_to_Gateway + con_ANSP_Finland_to_Gateway + con_ANSP_CzechRepublic_to_Gateway + con_ANSP_Slovakia_to_Gateway + con_ANSP_Poland_to_Gateway + con_ANSP_Hungary_to_Gateway + con_ANSP_Romania_to_Gateway + con_ANSP_Bulgaria_to_Gateway + con_ANSP_Croatia_to_Gateway + con_ANSP_Slovenia_to_Gateway + con_ANSP_Lithuania_to_Gateway + con_ANSP_Latvia_to_Gateway + con_ANSP_Estonia_to_Gateway + con_ANSP_Iceland_to_Gateway + con_ANSP_Ukraine_to_Gateway + con_ANSP_Moldova_to_Gateway + con_ANSP_Greece_to_Gateway + con_ANSP_Malta_to_Gateway + con_ANSP_Turkey_to_Gateway + con_ANSP_Cyprus_to_Gateway + con_ANSP_Spain_to_Gateway + con_ANSP_Italy_to_Gateway + con_ANSP_Albania_to_Gateway + con_ANSP_BosniaHerzegovina_to_Gateway + con_ANSP_Serbia_to_Gateway + con_ANSP_Montenegro_to_Gateway + con_ANSP_NorthMacedonia_to_Gateway + con_ANSP_Monaco_to_Gateway + con_ANSP_Armenia_to_Gateway + con_ANSP_Georgia_to_Gateway + con_AOC_to_Gateway + con_ATMPortal_to_Gateway + con_Gateway_to_NMOC + con_Gateway_to_CFMU + con_NMOC_to_BusinessCellFlow + con_CFMU_to_FDPS + con_FDPS_to_TraditionalStructureData + con_BusinessCellFlow_to_BIEcosystem + con_TraditionalStructureData_to_BIEcosystem}
fact {
EoPProof[con_BusinessCellFlow_to_BIEcosystem]
}
fact {
EoPProof[con_TraditionalStructureData_to_BIEcosystem]
}
fact {
SecureCommunicationRateLimiter[con_FDPS_to_TraditionalStructureData]
}
fact {
SecureCommunicationRateLimiter[con_BusinessCellFlow_to_BIEcosystem]
}
fact {
SecureCommunicationRateLimiter[con_TraditionalStructureData_to_BIEcosystem]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Luxembourg_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Netherlands_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_UnitedKingdom_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Ireland_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Portugal_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Belgium_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Switzerland_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Austria_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Denmark_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Norway_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Sweden_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Finland_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_CzechRepublic_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Slovakia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Poland_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Hungary_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Romania_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Bulgaria_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Croatia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Slovenia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Lithuania_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_France_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Latvia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Estonia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Iceland_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Ukraine_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Moldova_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Greece_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Malta_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Turkey_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Cyprus_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Spain_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Italy_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Albania_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_BosniaHerzegovina_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Serbia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Montenegro_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Germany_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_NorthMacedonia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Monaco_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Armenia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ANSP_Georgia_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_AOC_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_ATMPortal_to_Gateway]
}
fact {
SecureCommunicationRateLimiter[con_Gateway_to_NMOC]
}
fact {
SecureCommunicationRateLimiter[con_Gateway_to_CFMU]
}
fact {
SecureCommunicationRateLimiter[con_NMOC_to_BusinessCellFlow]
}
fact {
SecureCommunicationRateLimiter[con_CFMU_to_FDPS]
}
fact {
SecureCommunicationTLS[con_ANSP_Belgium_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Luxembourg_to_Gateway]
}
fact {
SecureCommunicationTLS[con_FDPS_to_TraditionalStructureData]
}
fact {
SecureCommunicationTLS[con_BusinessCellFlow_to_BIEcosystem]
}
fact {
SecureCommunicationTLS[con_TraditionalStructureData_to_BIEcosystem]
}
fact {
SecureCommunicationTLS[con_ANSP_Netherlands_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_UnitedKingdom_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Ireland_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Portugal_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Switzerland_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Austria_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Denmark_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Norway_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Sweden_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Finland_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_CzechRepublic_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Slovakia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Poland_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Hungary_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_France_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Romania_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Bulgaria_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Croatia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Slovenia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Lithuania_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Latvia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Estonia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Iceland_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Ukraine_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Moldova_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Greece_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Malta_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Turkey_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Cyprus_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Spain_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Germany_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Italy_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Albania_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_BosniaHerzegovina_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Serbia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Montenegro_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_NorthMacedonia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Monaco_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Armenia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ANSP_Georgia_to_Gateway]
}
fact {
SecureCommunicationTLS[con_AOC_to_Gateway]
}
fact {
SecureCommunicationTLS[con_ATMPortal_to_Gateway]
}
fact {
SecureCommunicationTLS[con_Gateway_to_NMOC]
}
fact {
SecureCommunicationTLS[con_Gateway_to_CFMU]
}
fact {
SecureCommunicationTLS[con_NMOC_to_BusinessCellFlow]
}
fact {
SecureCommunicationTLS[con_CFMU_to_FDPS]
}
fact {
spoofProof[con_TraditionalStructureData_to_BIEcosystem]
}
fact {
spoofProof[con_ANSP_Belgium_to_Gateway]
}
fact {
spoofProof[con_ANSP_France_to_Gateway]
}
fact {
spoofProof[con_ANSP_Germany_to_Gateway]
}
