/**
 */
package cs4cbse.impl;

import als.AlsPackage;
import als.impl.AlsPackageImpl;
import compliance.CompliancePackage;

import compliance.impl.CompliancePackageImpl;

import cs4cbse.Cs4cbseFactory;
import cs4cbse.Cs4cbsePackage;
import cs4cbse.Import;
import cs4cbse.LogicalView;
import cs4cbse.PropertyView;
import cs4cbse.PropetyView;
import cs4cbse.Root;

import logical.LogicalPackage;

import logical.impl.LogicalPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import property.PropertyPackage;

import property.impl.PropertyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs4cbsePackageImpl extends EPackageImpl implements Cs4cbsePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cs4cbse.Cs4cbsePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cs4cbsePackageImpl() {
		super(eNS_URI, Cs4cbseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Cs4cbsePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cs4cbsePackage init() {
		if (isInited) return (Cs4cbsePackage)EPackage.Registry.INSTANCE.getEPackage(Cs4cbsePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCs4cbsePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Cs4cbsePackageImpl theCs4cbsePackage = registeredCs4cbsePackage instanceof Cs4cbsePackageImpl ? (Cs4cbsePackageImpl)registeredCs4cbsePackage : new Cs4cbsePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(registeredPackage instanceof LogicalPackageImpl ? registeredPackage : LogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);
		PropertyPackageImpl thePropertyPackage = (PropertyPackageImpl)(registeredPackage instanceof PropertyPackageImpl ? registeredPackage : PropertyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CompliancePackage.eNS_URI);
		CompliancePackageImpl theCompliancePackage = (CompliancePackageImpl)(registeredPackage instanceof CompliancePackageImpl ? registeredPackage : CompliancePackage.eINSTANCE);

		// Create package meta-data objects
		theCs4cbsePackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		thePropertyPackage.createPackageContents();
		theCompliancePackage.createPackageContents();

		// Initialize created meta-data
		theCs4cbsePackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		thePropertyPackage.initializePackageContents();
		theCompliancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCs4cbsePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cs4cbsePackage.eNS_URI, theCs4cbsePackage);
		return theCs4cbsePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_LogicalView() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_PropetyView() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Imports() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalView() {
		return logicalViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalView_Components() {
		return (EReference)logicalViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalView_Connectors() {
		return (EReference)logicalViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalView_InteractionNatures() {
		return (EReference)logicalViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyView() {
		return propertyViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyView_Libraries() {
		return (EReference)propertyViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyView_ComplianceProperties() {
		return (EReference)propertyViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyView_OverlayComplianceProperties() {
		return (EReference)propertyViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyView_SecurityControlProperties() {
		return (EReference)propertyViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cs4cbseFactory getCs4cbseFactory() {
		return (Cs4cbseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__LOGICAL_VIEW);
		createEReference(rootEClass, ROOT__PROPETY_VIEW);
		createEReference(rootEClass, ROOT__IMPORTS);

		logicalViewEClass = createEClass(LOGICAL_VIEW);
		createEReference(logicalViewEClass, LOGICAL_VIEW__COMPONENTS);
		createEReference(logicalViewEClass, LOGICAL_VIEW__CONNECTORS);
		createEReference(logicalViewEClass, LOGICAL_VIEW__INTERACTION_NATURES);

		propertyViewEClass = createEClass(PROPERTY_VIEW);
		createEReference(propertyViewEClass, PROPERTY_VIEW__LIBRARIES);
		createEReference(propertyViewEClass, PROPERTY_VIEW__COMPLIANCE_PROPERTIES);
		createEReference(propertyViewEClass, PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES);
		createEReference(propertyViewEClass, PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicalPackage theLogicalPackage = (LogicalPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);
		CompliancePackage theCompliancePackage = (CompliancePackage)EPackage.Registry.INSTANCE.getEPackage(CompliancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_LogicalView(), this.getLogicalView(), null, "logicalView", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_PropetyView(), this.getPropertyView(), null, "propetyView", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Imports(), this.getImport(), null, "imports", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalViewEClass, LogicalView.class, "LogicalView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalView_Components(), theLogicalPackage.getComponent(), null, "components", null, 0, -1, LogicalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalView_Connectors(), theLogicalPackage.getConnector(), null, "connectors", null, 0, -1, LogicalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalView_InteractionNatures(), theLogicalPackage.getInteractionNature(), null, "interactionNatures", null, 0, -1, LogicalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyViewEClass, PropertyView.class, "PropertyView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyView_Libraries(), thePropertyPackage.getPropertyCategoryLibrary(), null, "libraries", null, 0, -1, PropertyView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyView_ComplianceProperties(), theCompliancePackage.getComplianceInstance(), null, "complianceProperties", null, 0, -1, PropertyView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyView_OverlayComplianceProperties(), theCompliancePackage.getOverlayComplianceInstance(), null, "overlayComplianceProperties", null, 0, -1, PropertyView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyView_SecurityControlProperties(), theCompliancePackage.getSecurityControlInstance(), null, "securityControlProperties", null, 0, -1, PropertyView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Cs4cbsePackageImpl
