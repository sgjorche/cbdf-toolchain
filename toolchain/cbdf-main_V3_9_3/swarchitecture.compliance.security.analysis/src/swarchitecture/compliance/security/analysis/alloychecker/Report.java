package swarchitecture.compliance.security.analysis.alloychecker;

import java.util.ArrayList;
import java.util.Collection;

import compliance.SecurityControlInstance;
import edu.mit.csail.sdg.translator.A4Solution;
import swarchitecture.compliance.security.analysis.libs.Library;

abstract class Report {
	private ArrayList<A4Solution> solutions; 
	private Library library;
	private Collection<SecurityControlInstance> sec_controls;
	
	public Report(ArrayList<A4Solution> solutions, Library library, Collection<SecurityControlInstance> sec_controls) {
		this.solutions = solutions;
		this.library = library;
		this.sec_controls = sec_controls;
	}
	
	public abstract String toString();

	public ArrayList<A4Solution> getSolutions() {
		return solutions;
	}

	public Library getLibrary() {
		return library;
	}
	
	public Collection<SecurityControlInstance> getSecControls() {
		return sec_controls;
	}
}
