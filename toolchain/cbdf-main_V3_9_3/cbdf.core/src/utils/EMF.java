package utils;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

public class EMF {
	/**
	 * 	Instantiate a model as source EmfModel
	 * @param M2Source : Metamodel source
	 * @param SourceModel : URI of the source model file 
	 * @return EmfModel : Emf Model
	 * @throws EolModelLoadingException
	 */
	public static EmfModel loadingModelSource(String M2Source, URI sourceModel) throws EolModelLoadingException {
	    EmfModel source = new EmfModel();
		source.setName("Source"); // name used by etl script
		source.setMetamodelUri(M2Source); // define meta-model source
		source.setModelFileUri(sourceModel); // define model source
		source.setReadOnLoad(true); // read the contents of the file
		source.setStoredOnDisposal(false); // do not save changes
		source.setExpand(false);
		source.load();
		return source;
	}


}
