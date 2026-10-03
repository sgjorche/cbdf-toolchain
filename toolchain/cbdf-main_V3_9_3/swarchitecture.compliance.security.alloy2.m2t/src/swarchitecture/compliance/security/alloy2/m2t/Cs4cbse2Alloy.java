package swarchitecture.compliance.security.alloy2.m2t;


import java.io.IOException;
import java.io.PrintStream;

import cbdf.core.m2t.MyEGXRunner;


public class Cs4cbse2Alloy extends MyEGXRunner {

	public Cs4cbse2Alloy(PrintStream stream) throws IOException {
		super(
				"egx/Cs4cbse2Alloy.egx", 
				"swarchitecture.compliance.security", 
				stream
		);
	}
	
	
}

