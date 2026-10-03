package swarchitecture.compliance.security.analysis.libs;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import compliance.ComplianceDefinition;
import compliance.OverlayComplianceDefintion;
import compliance.SecurityControlDefintion;
import compliance.StandardRef;
import compliance.impl.ComplianceDefinitionImpl;
import compliance.impl.SecurityControlDefintionImpl;
import compliance.impl.OverlayComplianceDefintionImpl;
import property.OverlayInstance;
import property.PropertyCategory;
import property.PropertyCategoryLibrary;
import property.PropertyDefinition;
import property.impl.PropertyDefinitionImpl;
import cs4cbse.impl.ImportImpl;
import utils.EMF;

public class Library {
	private PrintStream stream;
	private HashMap<String, PropertyDefinitionImpl> libs = new HashMap<String, PropertyDefinitionImpl>();

//	private HashMap<String,ComplianceDefinitionImpl> complianceLib = new HashMap<String,ComplianceDefinitionImpl>();
//	private HashMap<String,OverlayComplianceDefintionImpl> overlayComplianceLib = new HashMap<String,OverlayComplianceDefintionImpl>();
//	private HashMap<String,SecurityControlDefintionImpl> secControlLib = new HashMap<String,SecurityControlDefintionImpl>();

	/**
	 * Model library for compliance and security solutions
	 * 
	 * @param models Collection of model where to find the library
	 * @throws EolModelElementTypeNotFoundException
	 * @throws EolModelLoadingException
	 */
	public Library(Collection<EmfModel> models, PrintStream stream)
			throws EolModelElementTypeNotFoundException, EolModelLoadingException {
		this.stream = stream;

		for (EmfModel model : models) {
			collectPropertyDefinitionImpl(model);
		}
	}

	private void collectPropertyDefinitionImpl(EmfModel model) throws EolModelElementTypeNotFoundException {
		Collection<PropertyDefinitionImpl> list = model.getAllOfKind("PropertyDefinition").stream()
				.map(x -> (PropertyDefinitionImpl) x).collect(Collectors.toList());
		for (PropertyDefinitionImpl item : list) {
			if (item.getName() != null && !item.getName().isEmpty()) {
				libs.put(item.getName(), item);
			}
		}
	}

	/**
	 * Get the property definition by his name
	 * @param name the name the property we seek
	 * @return
	 */
	public PropertyDefinition getDefinition(String name) {
		return this.libs.get(name);
	}

	
	/**
	 * Get the related security controls for a property
	 * @param p the property that we want the related security controls
	 * @return the list of security controls related to the property
	 */
	public Set<PropertyDefinition> getElicit(PropertyDefinition p) {
		Set<PropertyDefinition> ret = new HashSet<PropertyDefinition> ();
		for (PropertyDefinition i: libs.values())  {
			if (i instanceof SecurityControlDefintion) {
				for(PropertyDefinition j: ((SecurityControlDefintion) i).getEnforce()  ) {
					if (j.getName() != null && p.getName() != null && j.getName().equals(p.getName())) {
						ret.add(i);
					}
				}
			}
		}
		return ret;
	}
	
	/**
	 * Get the related the standard references for a property
	 * @param p the property that we want the standard references
	 * @return the list of standard references related to the property
	 */
	public EList<StandardRef> getStandardRef(PropertyDefinition p) {
		if( p instanceof ComplianceDefinition) {
			return ((ComplianceDefinition) p).getStandardRef();
		}
		if( p instanceof OverlayComplianceDefintion) {
			EList<StandardRef> ret = new BasicEList<StandardRef> ();
			for (OverlayInstance item: ((OverlayComplianceDefintion) p).getInstance()) {
				ret.addAll(this.getStandardRef(item.getPropertyDefinition()));
			}
			return ret;
		}
		
		return new BasicEList<StandardRef> ();
	}
	
	/**
	 * Get the library and category of a property
	 * @param p the property that we want he library and category 
	 * @return a pair that contain the library and it's category
	 */
	public Pair<PropertyCategoryLibrary, PropertyCategory> getLibraryCategory(PropertyDefinition p) {
		PropertyCategory category = (PropertyCategory) p.eContainer();
		PropertyCategoryLibrary library = (PropertyCategoryLibrary) category.eContainer();
		return Pair.of(library, category );
	}
	
}
