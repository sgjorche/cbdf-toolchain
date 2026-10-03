package cbdf.core.m2m;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class MyETLRunner {
	private String ETLScript;
	private String M2Source;
	private String M2Target;
	private PrintStream stream;
	
	 /**
	 * Epsilon ETL runner class  (Model to Model transformation)
	 * @param ETLScript : transformations scripts (rules)
	 * @param M2Source : uri of the source meta-model
	 * @param M2Target : uri of the target meta-model
	 * @param stream : stream print output
	 * @throws IOException 
	 */
	public MyETLRunner(String ETLScript, String M2Source, String M2Target, PrintStream stream) throws IOException {
		this.stream = stream;
		this.M2Source = M2Source;
		this.M2Target = M2Target;
		
		// get etl paths
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		this.ETLScript = findPath(bundle, ETLScript);
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
	 * Transform a capella model to compliance swarchitecture security model
	 * @param SourceModel : the URI of the source model to transform 
	 * @param TargetModel : the URI of the destination model to be save at this end of the transformqtion
	 */
	 public void transform(URI sourceModel, URI targetModel) throws EolModelLoadingException, EolRuntimeException, Exception  {
		 	EmfModel source = loadingModelSource(sourceModel);
			EmfModel target = loadingModelTarget(targetModel);
			runningTransformation(source, target);
			this.stream.println("Tranformation successfull");
	}

	/**
	 * Run a transformation from EmfModel source to EmfModel traget
	 * @param source
	 * @param target
	 * @throws Exception
	 * @throws EolRuntimeException
	 */
	private void runningTransformation(EmfModel source, EmfModel target) throws Exception, EolRuntimeException {
		this.stream.println("Running Tranformation");
		this.stream.println("ETL script is : " + this.ETLScript );
		EtlModule module = new EtlModule();
		module.getContext().setOutputStream(this.stream);
		module.parse(new File(this.ETLScript )); // load transformation script
		module.getContext().getModelRepository().addModel(source);
		module.getContext().getModelRepository().addModel(target);
		this.stream.println("Loaded transformation rules : " + module.getTransformationRules());
		module.execute();
		module.getContext().getModelRepository().dispose();
		module.getContext().dispose();
	}

	/**
	 * Instantiate a model as target EmfModel
	 * @param cswasTargetModel : target uri model file
	 * @return EmfModel target model
	 * @throws EolModelLoadingException
	 */
	private EmfModel loadingModelTarget(URI targetModel) throws EolModelLoadingException {
		this.stream.println("Loading Model Target");
		this.stream.println("Target path is : " + targetModel.toString());
		EmfModel target = new EmfModel();
		target.setName("Target"); // name used by etl script
		target.setMetamodelUri(this.M2Target); 
		target.setModelFileUri(targetModel); // define model target
		target.setReadOnLoad(false); // don't read contents of file
		target.setStoredOnDisposal(true); // save changes
		target.load();
		return target;
	}

	/**
	 * 	Instantiate a model as source EmfModel
	 * @param SourceModel : URI of the source model file 
	 * @return
	 * @throws EolModelLoadingException
	 */
	private EmfModel loadingModelSource(URI sourceModel) throws EolModelLoadingException {
		this.stream.println("Loading Model Source");
		this.stream.println("Source path is : " + sourceModel.toString());
	    EmfModel source = new EmfModel();
		source.setName("Source"); // name used by etl script
		source.setMetamodelUri(this.M2Source); // define meta-model source
		source.setModelFileUri(sourceModel); // define model source
		source.setReadOnLoad(true); // read the contents of the file
		source.setStoredOnDisposal(false); // do not save changes
		source.load();
		return source;
	}
}
