// cbdf-main_updated_V3_5
// Fix 1: connectors generated as ConnectorMPS (not Connector) in logicalView2alloy.etl
// Fix 2: connector port binding body generated (all t: Tick | portO + portI in connects.t)
// Together these ensure TLS security control facts operate on a real buffered connector
// with bound ports, matching the paper's Listing 17 exactly.
package swarchitecture.compliance.security.alloy2.m2m.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

import cs4cbse.impl.ImportImpl;
import swarchitecture.compliance.security.alloy2.m2t.Cs4cbse2Alloy;
import swarchitecture.compliance.security.analysis.alloychecker.ReportGenerator;
import utils.EMF;

public class Cs4cbse2AlloyHandler extends AbstractHandler {
	private PrintStream stream;
	
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
		    	
		    	// Define the project src-gen 
				IProject project = file.getProject();
				IFolder srcGen = project.getFolder("src-gen");
				
		    	// Create a background job to run the transformation
		    	Job job = Job.create("TransformationCs4cbse2Alloy", (ICoreRunnable) monitor -> {
		    		// Get console
		    		final MessageConsoleStream stream  = getConsole();
		    		stream.setActivateOnWrite(true);
		    	
		    		stream.println("##### Preparing Transformation");
		    		// Set Models and transformation scripts paths
					URI cs4cbseM = EmfUtil.createUri(file.getFullPath().toOSString());
					
					Path outDir = Paths.get(srcGen.getLocation().toOSString());
					
					try {
						stream.println("##### Clean Model to rc-gen");
						clean(srcGen);
						
						stream.println("##### Transform Model to Alloy");
						// loading import models for libraries 
						EmfModel model = EMF.loadingModelSource("swarchitecture.compliance.security", cs4cbseM);
						
						Collection<EmfModel> libs = collectImport("swarchitecture.compliance.security", model, project);
						
						Cs4cbse2Alloy t = new Cs4cbse2Alloy(new PrintStream(stream));
						
						stream.println("Transforming " + cs4cbseM);
						t.transform(cs4cbseM, outDir);
						preserveArchitecture(srcGen);
						for (EmfModel m : libs) {
							stream.println("Transforming " + m.getModelFileUri());
							t.transform(m.getModelFileUri(), outDir);
							preserveArchitecture(srcGen);
						}

						// Restore the populated architecture into logical.als if a later
						// transform (e.g. a controls/checks model with no LogicalView)
						// overwrote it with an empty one.
						restoreArchitecture(srcGen);

						// A hackich way to glue libs 
						/// TODO we should find a cleaner way to handle that but works for PoC
						glueLibs(srcGen);

						stream.println("##### Generationg Compliance Report");
						stream.println("Import model loaded : " + libs.size());
						
						
						// Temporarily move metamodel/check.als out of the module path
						// during the Alloy run. check.als is a standalone manual
						// verification harness that defines its own copy of SC_08_00;
						// if it remains in src-gen/metamodel/ during the run, the Alloy
						// module resolver picks up the duplicate SC_08_00 and the
						// compliance checks that call SC_08_00 (e.g. B_SC_13_00) fail.
						// It is restored immediately after the run so the project folder
						// always contains check.als for manual, UI-less verification.
						File checkAls = new File(srcGen.getLocation().toOSString()
								+ "/metamodel/check.als");
						File checkAlsHidden = new File(srcGen.getLocation().toOSString()
								+ "/check.als.hidden");
						boolean checkAlsMoved = false;
						if (checkAls.exists()) {
							FileUtils.moveFile(checkAls, checkAlsHidden);
							checkAlsMoved = true;
						}

						try {
							//generate report
							ReportGenerator.generate(
									srcGen.getLocation().toOSString(), 
									srcGen.getLocation().toOSString() + "/report.html",
									libs,
									new PrintStream(stream)
							);
						} finally {
							// Always restore check.als, even if the run failed.
							if (checkAlsMoved) {
								FileUtils.moveFile(checkAlsHidden, checkAls);
							}
						}
					} catch (Exception e) {
						stream.println(e.toString());
						e.printStackTrace();
						return;
					}
					
		    	});
		    	job.schedule();
			}
			return null;
		}

	/**
	 * After a transform, if logical.als contains a real architecture
	 * (at least one component signature), snapshot it to logical.als.bak.
	 * This protects the architecture from being overwritten by a subsequent
	 * transform of a model that has no LogicalView (e.g. a controls or
	 * checks model), which would otherwise emit an empty logical.als.
	 * @param srcGen Folder where the generated files are
	 * @throws IOException
	 */
	private void preserveArchitecture(IFolder srcGen) throws IOException {
		File logical = new File(srcGen.getLocation().toOSString() + "/logical.als");
		if (!logical.exists()) return;
		String content = FileUtils.readFileToString(logical, StandardCharsets.UTF_8);
		if (content.contains("in Component")) {
			File backup = new File(srcGen.getLocation().toOSString() + "/logical.als.bak");
			FileUtils.writeStringToFile(backup, content, StandardCharsets.UTF_8, false);
		}
	}

	/**
	 * If the current logical.als has no architecture but a snapshot exists,
	 * restore the snapshot. Ensures the architecture is always present for
	 * verification, even when no controls were applied. Removes the snapshot
	 * file afterwards.
	 * @param srcGen Folder where the generated files are
	 * @throws IOException
	 */
	private void restoreArchitecture(IFolder srcGen) throws IOException {
		File logical = new File(srcGen.getLocation().toOSString() + "/logical.als");
		File backup  = new File(srcGen.getLocation().toOSString() + "/logical.als.bak");
		if (!backup.exists()) return;
		String current = logical.exists()
			? FileUtils.readFileToString(logical, StandardCharsets.UTF_8) : "";
		if (!current.contains("in Component")) {
			String saved = FileUtils.readFileToString(backup, StandardCharsets.UTF_8);
			FileUtils.writeStringToFile(logical, saved, StandardCharsets.UTF_8, false);
		}
		FileUtils.deleteQuietly(backup);
	}

	/**
	 * Links generate libraries together
	 * @param srcGen Folder where the generated libs are
	 * @throws IOException
	 */
	private void glueLibs(IFolder srcGen) throws IOException {
		File dir = new File(srcGen.getLocation().toOSString());
		File libs = new File(srcGen.getLocation().toOSString() + "/libs.als");
		File logical = new File(srcGen.getLocation().toOSString() + "/logical.als");
		
		
		// glue libs
		FileUtils.writeStringToFile(libs, "open metamodel/messaging\n",  StandardCharsets.UTF_8, true);
		FileUtils.writeStringToFile(libs, "open metamodel/cbsemetamodel\n",  StandardCharsets.UTF_8, true);
		FileUtils.writeStringToFile(libs, "open metamodel/connectorMPS\n",  StandardCharsets.UTF_8, true);
		FileUtils.writeStringToFile(libs, "open metamodel/constraint\n",  StandardCharsets.UTF_8, true);
		FileUtils.writeStringToFile(libs, "open util/ordering[messaging/Tick] as tick\n",  StandardCharsets.UTF_8, true);
		
		for (File file: dir.listFiles()) {
			if (file.getName().startsWith("libs_")) {
				FileUtils.writeStringToFile(libs, FileUtils.readFileToString(file,  StandardCharsets.UTF_8),  StandardCharsets.UTF_8, true);
			}
		 }
		
		// glue seccontrols
		// Count how many security control instances were generated. Each applied
		// control produces a seqReq_* file; zero such files means no controls were
		// applied to the architecture.
		int controlCount = 0;
		for (File file: dir.listFiles()) {
			if (file.getName().startsWith("seqReq_")) {
				FileUtils.writeStringToFile(logical, FileUtils.readFileToString(file,  StandardCharsets.UTF_8),  StandardCharsets.UTF_8, true);
				controlCount++;
			}
		 }

		// If no security controls were applied, the architecture in logical.als is
		// unconstrained. Record this explicitly so that verification still runs over
		// the bare architecture and the report can state that no controls are applied,
		// rather than failing. The marker is an Alloy comment and does not change the
		// formal model.
		if (controlCount == 0) {
			FileUtils.writeStringToFile(logical,
				"\n// NO_SECURITY_CONTROLS_APPLIED\n" +
				"// No security controls were applied to this architecture.\n" +
				"// Compliance checks are evaluated over the unconstrained architecture.\n",
				StandardCharsets.UTF_8, true);
		}
	}
	
	
	private void clean(IFolder srcGen) throws IOException {
		File dir = new File(srcGen.getLocation().toOSString());

		// Recovery: if a previous run crashed after hiding metamodel/check.als
		// but before restoring it, a stranded check.als.hidden may remain.
		// Restore it before cleaning so check.als is never permanently lost.
		File strandedHidden = new File(srcGen.getLocation().toOSString() + "/check.als.hidden");
		File checkAlsTarget  = new File(srcGen.getLocation().toOSString() + "/metamodel/check.als");
		if (strandedHidden.exists() && !checkAlsTarget.exists()) {
			FileUtils.moveFile(strandedHidden, checkAlsTarget);
		} else if (strandedHidden.exists()) {
			FileUtils.deleteQuietly(strandedHidden);
		}

		// Delete stale generated artifacts from any previous run so a rerun
		// starts fresh. Top-level generated files (checks_*, seqReq_*, libs*,
		// logical.als, report.html, *.bak) are removed. The metamodel/ subfolder
		// is preserved because it is part of the project, not regenerated by the
		// transform.
		for (File file: dir.listFiles()) {
			if (file.isFile()) {
				FileUtils.deleteQuietly(file);
			} else if (file.isDirectory() && !file.getName().equals("metamodel")) {
				FileUtils.deleteQuietly(file);
			}
		}
	}

	
	/**
	 * Collect all imported model from model 
	 * @param sourceM2 Metamodel of the model source
	 * @param model The Model 
	 * @param baseDir The base directory of the model
	 * @return A collection of EMF Model imported by the model
	 * @throws EolModelElementTypeNotFoundException
	 * @throws EolModelLoadingException
	 */
	private Collection<EmfModel> collectImport(String sourceM2, EmfModel model,  IProject baseDir) throws EolModelElementTypeNotFoundException, EolModelLoadingException  {
		Collection<EObject> imports = model.getAllOfType("Import");
		List<EmfModel> emfModels = new ArrayList<EmfModel>();
		for (Iterator<EObject> iterator = imports.iterator(); iterator.hasNext();) {
			ImportImpl c = (ImportImpl) iterator.next();
		    IFile importPath = baseDir.getFile(c.getImportURI());
			URI sourceModel = EmfUtil.createUri(importPath.getFullPath().toOSString());
			emfModels.add( EMF.loadingModelSource(sourceM2, sourceModel));
		}
		return emfModels;
	}

		/**
		 * Get console to output message
		 * @return a stream console
		 */
		private MessageConsoleStream getConsole() {
			MessageConsole myConsole = new MessageConsole("Transformation cs4cbse to alloy", null);
			myConsole.activate();
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ myConsole });
			ConsolePlugin.getDefault().getConsoleManager().showConsoleView(myConsole);
			return myConsole.newMessageStream();
		}
}
