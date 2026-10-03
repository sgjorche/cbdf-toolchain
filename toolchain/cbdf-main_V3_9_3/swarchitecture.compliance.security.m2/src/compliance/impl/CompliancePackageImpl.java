/**
 */
package compliance.impl;

import als.AlsPackage;
import als.impl.AlsPackageImpl;
import compliance.ComplianceDefinition;
import compliance.ComplianceFactory;
import compliance.ComplianceInstance;
import compliance.CompliancePackage;
import compliance.OverlayComplianceDefintion;
import compliance.OverlayComplianceInstance;
import compliance.PropertyDefinitionStandardRef;
import compliance.SecurityControlDefintion;

import compliance.SecurityControlInstance;
import compliance.StandardRef;
import cs4cbse.Cs4cbsePackage;

import cs4cbse.impl.Cs4cbsePackageImpl;

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
public class CompliancePackageImpl extends EPackageImpl implements CompliancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayComplianceDefintionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayComplianceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlDefintionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityControlInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionStandardRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardRefEClass = null;

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
	 * @see compliance.CompliancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompliancePackageImpl() {
		super(eNS_URI, ComplianceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompliancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompliancePackage init() {
		if (isInited) return (CompliancePackage)EPackage.Registry.INSTANCE.getEPackage(CompliancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCompliancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CompliancePackageImpl theCompliancePackage = registeredCompliancePackage instanceof CompliancePackageImpl ? (CompliancePackageImpl)registeredCompliancePackage : new CompliancePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Cs4cbsePackage.eNS_URI);
		Cs4cbsePackageImpl theCs4cbsePackage = (Cs4cbsePackageImpl)(registeredPackage instanceof Cs4cbsePackageImpl ? registeredPackage : Cs4cbsePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(registeredPackage instanceof LogicalPackageImpl ? registeredPackage : LogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);
		PropertyPackageImpl thePropertyPackage = (PropertyPackageImpl)(registeredPackage instanceof PropertyPackageImpl ? registeredPackage : PropertyPackage.eINSTANCE);

		// Create package meta-data objects
		theCompliancePackage.createPackageContents();
		theCs4cbsePackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		thePropertyPackage.createPackageContents();

		// Initialize created meta-data
		theCompliancePackage.initializePackageContents();
		theCs4cbsePackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		thePropertyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompliancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompliancePackage.eNS_URI, theCompliancePackage);
		return theCompliancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceDefinition() {
		return complianceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverlayComplianceDefintion() {
		return overlayComplianceDefintionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverlayComplianceInstance() {
		return overlayComplianceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceInstance() {
		return complianceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityControlDefintion() {
		return securityControlDefintionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityControlDefintion_Enforce() {
		return (EReference)securityControlDefintionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityControlInstance() {
		return securityControlInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDefinitionStandardRef() {
		return propertyDefinitionStandardRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinitionStandardRef_StandardRef() {
		return (EReference)propertyDefinitionStandardRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardRef() {
		return standardRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardRef_Name() {
		return (EAttribute)standardRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardRef_Url() {
		return (EAttribute)standardRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceFactory getComplianceFactory() {
		return (ComplianceFactory)getEFactoryInstance();
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
		complianceDefinitionEClass = createEClass(COMPLIANCE_DEFINITION);

		overlayComplianceDefintionEClass = createEClass(OVERLAY_COMPLIANCE_DEFINTION);

		overlayComplianceInstanceEClass = createEClass(OVERLAY_COMPLIANCE_INSTANCE);

		complianceInstanceEClass = createEClass(COMPLIANCE_INSTANCE);

		securityControlDefintionEClass = createEClass(SECURITY_CONTROL_DEFINTION);
		createEReference(securityControlDefintionEClass, SECURITY_CONTROL_DEFINTION__ENFORCE);

		securityControlInstanceEClass = createEClass(SECURITY_CONTROL_INSTANCE);

		propertyDefinitionStandardRefEClass = createEClass(PROPERTY_DEFINITION_STANDARD_REF);
		createEReference(propertyDefinitionStandardRefEClass, PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF);

		standardRefEClass = createEClass(STANDARD_REF);
		createEAttribute(standardRefEClass, STANDARD_REF__NAME);
		createEAttribute(standardRefEClass, STANDARD_REF__URL);
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
		PropertyPackage thePropertyPackage = (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		complianceDefinitionEClass.getESuperTypes().add(thePropertyPackage.getAtomicPropertyDefinition());
		complianceDefinitionEClass.getESuperTypes().add(this.getPropertyDefinitionStandardRef());
		overlayComplianceDefintionEClass.getESuperTypes().add(thePropertyPackage.getOverlayPropertyDefinition());
		overlayComplianceInstanceEClass.getESuperTypes().add(thePropertyPackage.getPropertyInstance());
		complianceInstanceEClass.getESuperTypes().add(thePropertyPackage.getPropertyInstance());
		securityControlDefintionEClass.getESuperTypes().add(thePropertyPackage.getAtomicPropertyDefinition());
		securityControlDefintionEClass.getESuperTypes().add(this.getPropertyDefinitionStandardRef());
		securityControlInstanceEClass.getESuperTypes().add(thePropertyPackage.getPropertyInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(complianceDefinitionEClass, ComplianceDefinition.class, "ComplianceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overlayComplianceDefintionEClass, OverlayComplianceDefintion.class, "OverlayComplianceDefintion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overlayComplianceInstanceEClass, OverlayComplianceInstance.class, "OverlayComplianceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complianceInstanceEClass, ComplianceInstance.class, "ComplianceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityControlDefintionEClass, SecurityControlDefintion.class, "SecurityControlDefintion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityControlDefintion_Enforce(), thePropertyPackage.getPropertyDefinition(), null, "enforce", null, 0, -1, SecurityControlDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityControlInstanceEClass, SecurityControlInstance.class, "SecurityControlInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyDefinitionStandardRefEClass, PropertyDefinitionStandardRef.class, "PropertyDefinitionStandardRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDefinitionStandardRef_StandardRef(), this.getStandardRef(), null, "standardRef", null, 0, -1, PropertyDefinitionStandardRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardRefEClass, StandardRef.class, "StandardRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, StandardRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardRef_Url(), ecorePackage.getEString(), "url", null, 0, 1, StandardRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompliancePackageImpl
