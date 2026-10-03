package swarchitecture.cbse.capella4.m2m;


import java.io.IOException;
import java.io.PrintStream;


import cbdf.core.m2m.MyETLRunner;



public class Capella2Cbse extends MyETLRunner {
	public Capella2Cbse(PrintStream stream) throws IOException {
		super(
				"etl/capellaToCbse.etl", 
				"http://www.polarsys.org/capella/core/modeller/5.0.0", 
				"swarchitecture.compliance.security", 
				stream
		);
	}
}
