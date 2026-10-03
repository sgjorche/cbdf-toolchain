package swarchitecture.compliance.security.analysis.alloychecker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import compliance.SecurityControlInstance;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.translator.A4Solution;
import property.impl.PropertyDefinitionImpl;
import swarchitecture.compliance.security.analysis.libs.Library;


public class ReportGenerator {
	
	/**
	 * Generate a compliance report from an alloy model
	 * @param dir_in  Input Alloy file
	 * @param file_out Ouput html file
	 * @param models Collection of model where to find the library
	 * @param stream Stream log output
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws EolModelLoadingException 
	 * @throws EolModelElementTypeNotFoundException 
	 */
	public static void generate(String dir_in, String file_out, Collection<EmfModel> models, PrintStream stream) throws IOException, InstantiationException, IllegalAccessException, EolModelLoadingException, EolModelElementTypeNotFoundException {

		stream.println("=========== Running Alloy Analysis on " + dir_in + " =============");
		long analysisStart = System.currentTimeMillis();
		ArrayList<A4Solution> solutions = walkChecks(dir_in, stream);
		long analysisElapsed = System.currentTimeMillis() - analysisStart;
		stream.println("=========== Alloy Analysis completed in " + analysisElapsed + " ms =============");
		
		stream.println("=========== Loading libraries from  "+ models.stream().map(x -> x.getName().toString()).toArray() + " files to generate report analysis =============");
		Library lib = new Library(models, stream);
		stream.println("Libraries loaded");
		
		Collection<SecurityControlInstance> sec_controls = new BasicEList<SecurityControlInstance>();
		for (EmfModel model : models) {
			sec_controls.addAll( model.getAllOfKind("SecurityControlInstance").stream()
					.map(x -> (SecurityControlInstance) x).collect(Collectors.toList()));
		}
        
		stream.println("=========== Generating analysis report on " + dir_in + " =============");
        commandSolutionParserListHtml(solutions, file_out, lib, sec_controls, analysisElapsed);
        stream.println("Report generated to " + file_out);
        
        stream.println("=========== End =============");

	}
	
	
	
	/**
	 * Walks all files and checks them with Alloy
	 * @param dir_in
	 * @param stream
	 * @return
	 */
	public static ArrayList<A4Solution> walkChecks(String dir_in, PrintStream stream) {
		ArrayList<A4Solution> solutions = new ArrayList<A4Solution>();
		File dir = new File(dir_in);
		for (File file: dir.listFiles()) {
			if (file.getName().startsWith("checks_")) {
				stream.println("Running : " + file.getPath() );
				long fileStart = System.currentTimeMillis();
				MyAlloyChecker w = new MyAlloyChecker(file.getPath(), stream);
				solutions.addAll(w.run_world());
				long fileElapsed = System.currentTimeMillis() - fileStart;
				stream.println("  => File completed in " + fileElapsed + " ms");
			}
		}
		return solutions;
	}
	

    /**
     * Parse a List Alloy Solution to Compliance Report
     * @param solutions Alloy solutions
     * @param file_out Ouput html file
     * @throws IOException
     * @throws Err
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
	private static void commandSolutionParserListHtml(ArrayList<A4Solution> solutions, String file_out, Library libs, Collection<SecurityControlInstance> sec_controls, long analysisElapsedMs) throws IOException, Err, InstantiationException, IllegalAccessException {
		ArrayList<A4Solution> compliance_list = new ArrayList<>();
		for (A4Solution s: solutions) {
        	if (isAComplianceAssert(s))
        		compliance_list.add(s);
        }
		ReportGenerator.genComplianceReport(file_out, solutions, libs, sec_controls, analysisElapsedMs);
    	
	}
	
    /**
     * Generate compliance reports in html
     * @param file_out Ouput html file
     * @param solutions Alloy solutions to be included in the repots
     * @param libs Libraries used to for the compliance check to fill report informations 
     */
	private static void genComplianceReport(String file_out, ArrayList<A4Solution> solutions, Library libs, Collection<SecurityControlInstance> sec_controls, long analysisElapsedMs) throws IOException, InstantiationException, IllegalAccessException {
		String report = (new ReportHtml(solutions, libs, sec_controls, analysisElapsedMs)).toString();
		FileWriter fileWriter = new FileWriter(file_out);
		fileWriter.write(report);
		fileWriter.close();
		
	}
	
    /**
     * Return true if the check is Compliance check
     * @param solution Alloy solution
     */
    static private boolean isAComplianceAssert(A4Solution solution)  {
    	return solution.getOriginalCommand().startsWith("Check Compliance");
    }
	
}
