/**
 */
package cs4cbse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cs4cbse.Cs4cbseFactory
 * @model kind="package"
 * @generated
 */
public interface Cs4cbsePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs4cbse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "swarchitecture.compliance.security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs4cbse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cs4cbsePackage eINSTANCE = cs4cbse.impl.Cs4cbsePackageImpl.init();

	/**
	 * The meta object id for the '{@link cs4cbse.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs4cbse.impl.RootImpl
	 * @see cs4cbse.impl.Cs4cbsePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Logical View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LOGICAL_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Propety View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PROPETY_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__IMPORTS = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cs4cbse.impl.LogicalViewImpl <em>Logical View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs4cbse.impl.LogicalViewImpl
	 * @see cs4cbse.impl.Cs4cbsePackageImpl#getLogicalView()
	 * @generated
	 */
	int LOGICAL_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Interaction Natures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW__INTERACTION_NATURES = 2;

	/**
	 * The number of structural features of the '<em>Logical View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cs4cbse.impl.PropertyViewImpl <em>Property View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs4cbse.impl.PropertyViewImpl
	 * @see cs4cbse.impl.Cs4cbsePackageImpl#getPropertyView()
	 * @generated
	 */
	int PROPERTY_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VIEW__LIBRARIES = 0;

	/**
	 * The feature id for the '<em><b>Compliance Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VIEW__COMPLIANCE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Overlay Compliance Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Security Control Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Property View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VIEW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cs4cbse.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs4cbse.impl.ImportImpl
	 * @see cs4cbse.impl.Cs4cbsePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link cs4cbse.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see cs4cbse.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link cs4cbse.Root#getLogicalView <em>Logical View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical View</em>'.
	 * @see cs4cbse.Root#getLogicalView()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_LogicalView();

	/**
	 * Returns the meta object for the containment reference '{@link cs4cbse.Root#getPropetyView <em>Propety View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propety View</em>'.
	 * @see cs4cbse.Root#getPropetyView()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_PropetyView();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.Root#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see cs4cbse.Root#getImports()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Imports();

	/**
	 * Returns the meta object for class '{@link cs4cbse.LogicalView <em>Logical View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical View</em>'.
	 * @see cs4cbse.LogicalView
	 * @generated
	 */
	EClass getLogicalView();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.LogicalView#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see cs4cbse.LogicalView#getComponents()
	 * @see #getLogicalView()
	 * @generated
	 */
	EReference getLogicalView_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.LogicalView#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see cs4cbse.LogicalView#getConnectors()
	 * @see #getLogicalView()
	 * @generated
	 */
	EReference getLogicalView_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.LogicalView#getInteractionNatures <em>Interaction Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Natures</em>'.
	 * @see cs4cbse.LogicalView#getInteractionNatures()
	 * @see #getLogicalView()
	 * @generated
	 */
	EReference getLogicalView_InteractionNatures();

	/**
	 * Returns the meta object for class '{@link cs4cbse.PropertyView <em>Property View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property View</em>'.
	 * @see cs4cbse.PropertyView
	 * @generated
	 */
	EClass getPropertyView();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.PropertyView#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see cs4cbse.PropertyView#getLibraries()
	 * @see #getPropertyView()
	 * @generated
	 */
	EReference getPropertyView_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.PropertyView#getComplianceProperties <em>Compliance Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compliance Properties</em>'.
	 * @see cs4cbse.PropertyView#getComplianceProperties()
	 * @see #getPropertyView()
	 * @generated
	 */
	EReference getPropertyView_ComplianceProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.PropertyView#getOverlayComplianceProperties <em>Overlay Compliance Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overlay Compliance Properties</em>'.
	 * @see cs4cbse.PropertyView#getOverlayComplianceProperties()
	 * @see #getPropertyView()
	 * @generated
	 */
	EReference getPropertyView_OverlayComplianceProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link cs4cbse.PropertyView#getSecurityControlProperties <em>Security Control Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Control Properties</em>'.
	 * @see cs4cbse.PropertyView#getSecurityControlProperties()
	 * @see #getPropertyView()
	 * @generated
	 */
	EReference getPropertyView_SecurityControlProperties();

	/**
	 * Returns the meta object for class '{@link cs4cbse.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see cs4cbse.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link cs4cbse.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see cs4cbse.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cs4cbseFactory getCs4cbseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cs4cbse.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs4cbse.impl.RootImpl
		 * @see cs4cbse.impl.Cs4cbsePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Logical View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__LOGICAL_VIEW = eINSTANCE.getRoot_LogicalView();

		/**
		 * The meta object literal for the '<em><b>Propety View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PROPETY_VIEW = eINSTANCE.getRoot_PropetyView();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__IMPORTS = eINSTANCE.getRoot_Imports();

		/**
		 * The meta object literal for the '{@link cs4cbse.impl.LogicalViewImpl <em>Logical View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs4cbse.impl.LogicalViewImpl
		 * @see cs4cbse.impl.Cs4cbsePackageImpl#getLogicalView()
		 * @generated
		 */
		EClass LOGICAL_VIEW = eINSTANCE.getLogicalView();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_VIEW__COMPONENTS = eINSTANCE.getLogicalView_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_VIEW__CONNECTORS = eINSTANCE.getLogicalView_Connectors();

		/**
		 * The meta object literal for the '<em><b>Interaction Natures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_VIEW__INTERACTION_NATURES = eINSTANCE.getLogicalView_InteractionNatures();

		/**
		 * The meta object literal for the '{@link cs4cbse.impl.PropertyViewImpl <em>Property View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs4cbse.impl.PropertyViewImpl
		 * @see cs4cbse.impl.Cs4cbsePackageImpl#getPropertyView()
		 * @generated
		 */
		EClass PROPERTY_VIEW = eINSTANCE.getPropertyView();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VIEW__LIBRARIES = eINSTANCE.getPropertyView_Libraries();

		/**
		 * The meta object literal for the '<em><b>Compliance Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VIEW__COMPLIANCE_PROPERTIES = eINSTANCE.getPropertyView_ComplianceProperties();

		/**
		 * The meta object literal for the '<em><b>Overlay Compliance Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES = eINSTANCE.getPropertyView_OverlayComplianceProperties();

		/**
		 * The meta object literal for the '<em><b>Security Control Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES = eINSTANCE.getPropertyView_SecurityControlProperties();

		/**
		 * The meta object literal for the '{@link cs4cbse.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs4cbse.impl.ImportImpl
		 * @see cs4cbse.impl.Cs4cbsePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

	}

} //Cs4cbsePackage
