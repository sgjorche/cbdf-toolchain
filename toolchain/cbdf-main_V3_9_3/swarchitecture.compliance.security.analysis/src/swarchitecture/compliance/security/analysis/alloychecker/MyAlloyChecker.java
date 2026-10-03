package swarchitecture.compliance.security.analysis.alloychecker;

import java.io.PrintStream;
import java.util.ArrayList;


import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.ast.Command;
import edu.mit.csail.sdg.parser.CompModule;
import edu.mit.csail.sdg.parser.CompUtil;
import edu.mit.csail.sdg.translator.A4Options;
import edu.mit.csail.sdg.translator.A4Solution;
import edu.mit.csail.sdg.translator.TranslateAlloyToKodkod;


public class MyAlloyChecker  {
	public static A4Options options;
	public static A4Reporter rep;
	public static CompModule world;
	private PrintStream stream;
	
	/**
	 * Run checks from an Alloy file
	 * @param filename Alloy file name to run check
	 * @param stream Stream log output
	 * @throws Err
	 */
    public MyAlloyChecker(String filename, PrintStream stream) throws Err {
    	MyAlloyChecker.options = new A4Options();
        MyAlloyChecker.options.solver = A4Options.SatSolver.SAT4J;
		MyAlloyChecker.rep = new A4Reporter() {
            @Override public void warning(ErrorWarning msg) {
                stream.print("Relevance Warning:\n"+(msg.toString().trim())+"\n\n");
                stream.flush();
            }
        };
        MyAlloyChecker.world = CompUtil.parseEverything_fromFile(rep, null, filename);
        this.stream = stream;
    }    
    
    
    
    static public boolean isAssertCommand(A4Solution solution) {
    	return solution.getOriginalCommand().startsWith("Check");
    }
    
    static public boolean isPredCommend(A4Solution solution) {
    	return solution.getOriginalCommand().startsWith("Run");
    }
   
	
    static public boolean isValidAssert(A4Solution solution) {
    	return isAssertCommand(solution) & ! solution.satisfiable();
    }
    
    static public boolean isValidPred(A4Solution solution) {
    	return isPredCommend(solution) & solution.satisfiable();
    }
    
    static public boolean isValidSolution(A4Solution solution)  {
    	return isValidAssert(solution) || isValidPred(solution);
    }
    
    public A4Solution run(Command command) throws Err {
        long startTime = System.currentTimeMillis();
        A4Solution solution = TranslateAlloyToKodkod.execute_command(rep, world.getAllReachableSigs(), command, options);
        long elapsed = System.currentTimeMillis() - startTime;
        stream.println("  [" + command.label + "] completed in " + elapsed + " ms");
        return solution;
    }
    
    public ArrayList<A4Solution> run_world() throws Err {
    	return this.runs(world.getAllCommands());
    }
    
    public ArrayList<A4Solution> runs(ConstList<Command> commands) throws Err {
    	ArrayList<A4Solution> solutions = new ArrayList<>();
    	for (Command command: commands ) {
    		solutions.add(this.run(command));
    	}
    	return solutions;
    }
}

