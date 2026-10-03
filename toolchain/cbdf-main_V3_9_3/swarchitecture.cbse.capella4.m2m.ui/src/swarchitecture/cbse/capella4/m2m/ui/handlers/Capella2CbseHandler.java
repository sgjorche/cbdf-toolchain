package swarchitecture.cbse.capella4.m2m.ui.handlers;

import java.io.PrintStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

import swarchitecture.cbse.capella4.m2m.Capella2Cbse;

public class Capella2CbseHandler extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// Set selection service
		ISelectionService service = window.getSelectionService();
		// Set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		
		// Check if the selected file is actually a IFile 
		if (structured.getFirstElement() instanceof IFile) {
	    	IFile file = (IFile) structured.getFirstElement();
	    	
	    	// define the root 
			IProject project = file.getProject();
			IFolder srcGen = project.getFolder("src-gen");
	    	
	    	// Create a background job to run the transformation
	    	Job job = Job.create("TransformationCapella2Cswas", (ICoreRunnable) monitor -> {
	    		
	    		// Get console
	    		final MessageConsoleStream stream  = getConsole();
	    		stream.setActivateOnWrite(true);
	    		
	    		// Set Models and transformation scripts paths
				URI capellaM = EmfUtil.createUri(file.getFullPath().toOSString());
				URI cswasM = EmfUtil.createUri(srcGen.getFile("out.cbse").getFullPath().toString());
				
				
				// register cs4bse metamodel 
//				ResourceSetImpl resourceSet = new ResourceSetImpl();
//				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new Cs4cbseFactoryImpl());
//				resourceSet.getPackageRegistry().put(Cs4cbsePackage.eNS_URI,Cs4cbsePackage.eINSTANCE);
				
				try {
					Capella2Cbse t = new Capella2Cbse(new PrintStream(stream));
					t.transform(capellaM, cswasM);
					stream.close();
				} catch (Exception e) {
					stream.println(e.toString());
					e.printStackTrace();
				}
	    	});
	    	job.schedule();
		}
		return null;
	}

	/**
	 * Get console to output message
	 * @return a stream console
	 */
	private MessageConsoleStream getConsole() {
		MessageConsole myConsole = new MessageConsole("Transformation capella to cswas", null);
		myConsole.activate();
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ myConsole });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(myConsole);
		return myConsole.newMessageStream();
	}
}
