package cbdf.core.m2t;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import utils.EMF;

public class MyEGXRunner {
	private String EGXScript;
	private String M2Source;
	private PrintStream stream;
	
	 /**
	 * Epsilon EGX runner class  (Model to Text transformation)
	 * @param EGXScript : transformations scripts (templates)
	 * @param M2Source : uri of the source meta-model
	 * @param stream : stream print output
	 * @throws IOException 
	 */
	public MyEGXRunner(String EGXScript, String M2Source, PrintStream stream) throws IOException {
		this.stream = stream;
		this.M2Source = M2Source;
		
		// get etl paths
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		this.EGXScript = findPath(bundle, EGXScript);
	}
	
	/**
	 * Find a file in bundle
	 * @param bundle : Bundle where looking for path
	 * @param path : path of the file in the bundle
	 */
	private String findPath(Bundle bundle, String path) throws IOException {
		URL etlScriptURL = FileLocator.find(bundle, new Path(path), null);
		return FileLocator.toFileURL(etlScriptURL).getPath();
	}
	
	/**
	 * Transform a source model to target dir
	 * @param sourceModel : the URI of the source model to transform 
	 */
	 public void transform(URI sourceModel, java.nio.file.Path outDir) throws EolModelLoadingException, EolRuntimeException, Exception  {
			this.stream.println("Loading Model Source");
			this.stream.println("Source path is : " + sourceModel.toString());
		 	EmfModel source = EMF.loadingModelSource(this.M2Source, sourceModel);
			runningTransformation(source, outDir);
			this.stream.println("Tranformation successfull");
	}

	/**
	 * Run a transformation from EmfModel source to EmfModel target
	 * @param source : Source model for the transformation
	 * @throws Exception
	 * @throws EolRuntimeException
	 */
	private void runningTransformation(EmfModel source, java.nio.file.Path outDir) throws Exception, EolRuntimeException {
		this.stream.println("Running Tranformation");
		this.stream.println("EGXScript script is : " + this.EGXScript );
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory(outDir));
		module.getContext().setOutputStream(this.stream);
		module.parse(new File(this.EGXScript )); // load transformation script
		if (!module.getParseProblems().isEmpty()) {
			this.stream.println("Syntax errors in EGX script found. Exiting.");
			throw new Exception("EGX script syntax Error");
		}
		module.getContext().getModelRepository().addModel(source);
		this.stream.println("Loaded generations rules : " + module.getGenerationRules());
		module.execute();
		
		module.getContext().getModelRepository().dispose();
		module.getContext().dispose();
	}
}
