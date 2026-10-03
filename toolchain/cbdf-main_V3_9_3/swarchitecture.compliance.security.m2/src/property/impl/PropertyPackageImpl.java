/**
 */
package property.impl;

import als.AlsPackage;
import als.impl.AlsPackageImpl;
import compliance.CompliancePackage;

import compliance.impl.CompliancePackageImpl;

import cs4cbse.Cs4cbsePackage;

import cs4cbse.impl.Cs4cbsePackageImpl;

import logical.LogicalPackage;

import logical.impl.LogicalPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import property.AtomicPropertyDefinition;
import property.OverlayInstance;
import property.OverlayPropertyDefinition;
import property.PropertyCategory;
import property.PropertyCategoryLibrary;
import property.PropertyDefinition;
import property.PropertyDefinitionParameter;
import property.PropertyDefinitionParemeter;
import property.PropertyDefinitionParemeterType;
import property.PropertyFactory;
import property.PropertyInstance;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyPackageImpl extends EPackageImpl implements PropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCategoryLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicPropertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayPropertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyDefinitionParemeterTypeEEnum = null;

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
	 * @see property.PropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertyPackageImpl() {
		super(eNS_URI, PropertyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertyPackage init() {
		if (isInited) return (PropertyPackage)EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPropertyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PropertyPackageImpl thePropertyPackage = registeredPropertyPackage instanceof PropertyPackageImpl ? (PropertyPackageImpl)registeredPropertyPackage : new PropertyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Cs4cbsePackage.eNS_URI);
		Cs4cbsePackageImpl theCs4cbsePackage = (Cs4cbsePackageImpl)(registeredPackage instanceof Cs4cbsePackageImpl ? registeredPackage : Cs4cbsePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(registeredPackage instanceof LogicalPackageImpl ? registeredPackage : LogicalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CompliancePackage.eNS_URI);
		CompliancePackageImpl theCompliancePackage = (CompliancePackageImpl)(registeredPackage instanceof CompliancePackageImpl ? registeredPackage : CompliancePackage.eINSTANCE);

		// Create package meta-data objects
		thePropertyPackage.createPackageContents();
		theCs4cbsePackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		theCompliancePackage.createPackageContents();

		// Initialize created meta-data
		thePropertyPackage.initializePackageContents();
		theCs4cbsePackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		theCompliancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropertyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertyPackage.eNS_URI, thePropertyPackage);
		return thePropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyCategoryLibrary() {
		return propertyCategoryLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyCategoryLibrary_Name() {
		return (EAttribute)propertyCategoryLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyCategoryLibrary_Categories() {
		return (EReference)propertyCategoryLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyCategory() {
		return propertyCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyCategory_Name() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyCategory_Properties() {
		return (EReference)propertyCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDefinition() {
		return propertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_Name() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDefinition_DefinitionParameters() {
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinition_Description() {
		return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicPropertyDefinition() {
		return atomicPropertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomicPropertyDefinition_Alloy() {
		return (EAttribute)atomicPropertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverlayPropertyDefinition() {
		return overlayPropertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverlayPropertyDefinition_Instance() {
		return (EReference)overlayPropertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverlayInstance() {
		return overlayInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOverlayInstance_Parameters() {
		return (EAttribute)overlayInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverlayInstance_PropertyDefinition() {
		return (EReference)overlayInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDefinitionParameter() {
		return propertyDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinitionParameter_Name() {
		return (EAttribute)propertyDefinitionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyDefinitionParameter_Type() {
		return (EAttribute)propertyDefinitionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyInstance() {
		return propertyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyInstance_Parameters() {
		return (EReference)propertyInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyInstance_PropertyDefinition() {
		return (EReference)propertyInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyDefinitionParemeterType() {
		return propertyDefinitionParemeterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyFactory getPropertyFactory() {
		return (PropertyFactory)getEFactoryInstance();
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
		propertyCategoryLibraryEClass = createEClass(PROPERTY_CATEGORY_LIBRARY);
		createEAttribute(propertyCategoryLibraryEClass, PROPERTY_CATEGORY_LIBRARY__NAME);
		createEReference(propertyCategoryLibraryEClass, PROPERTY_CATEGORY_LIBRARY__CATEGORIES);

		propertyCategoryEClass = createEClass(PROPERTY_CATEGORY);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__NAME);
		createEReference(propertyCategoryEClass, PROPERTY_CATEGORY__PROPERTIES);

		propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__DEFINITION_PARAMETERS);
		createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__DESCRIPTION);

		atomicPropertyDefinitionEClass = createEClass(ATOMIC_PROPERTY_DEFINITION);
		createEAttribute(atomicPropertyDefinitionEClass, ATOMIC_PROPERTY_DEFINITION__ALLOY);

		overlayPropertyDefinitionEClass = createEClass(OVERLAY_PROPERTY_DEFINITION);
		createEReference(overlayPropertyDefinitionEClass, OVERLAY_PROPERTY_DEFINITION__INSTANCE);

		overlayInstanceEClass = createEClass(OVERLAY_INSTANCE);
		createEAttribute(overlayInstanceEClass, OVERLAY_INSTANCE__PARAMETERS);
		createEReference(overlayInstanceEClass, OVERLAY_INSTANCE__PROPERTY_DEFINITION);

		propertyDefinitionParameterEClass = createEClass(PROPERTY_DEFINITION_PARAMETER);
		createEAttribute(propertyDefinitionParameterEClass, PROPERTY_DEFINITION_PARAMETER__NAME);
		createEAttribute(propertyDefinitionParameterEClass, PROPERTY_DEFINITION_PARAMETER__TYPE);

		propertyInstanceEClass = createEClass(PROPERTY_INSTANCE);
		createEReference(propertyInstanceEClass, PROPERTY_INSTANCE__PARAMETERS);
		createEReference(propertyInstanceEClass, PROPERTY_INSTANCE__PROPERTY_DEFINITION);

		// Create enums
		propertyDefinitionParemeterTypeEEnum = createEEnum(PROPERTY_DEFINITION_PAREMETER_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicPropertyDefinitionEClass.getESuperTypes().add(this.getPropertyDefinition());
		overlayPropertyDefinitionEClass.getESuperTypes().add(this.getPropertyDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(propertyCategoryLibraryEClass, PropertyCategoryLibrary.class, "PropertyCategoryLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyCategoryLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyCategoryLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCategoryLibrary_Categories(), this.getPropertyCategory(), null, "categories", null, 0, -1, PropertyCategoryLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCategoryEClass, PropertyCategory.class, "PropertyCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCategory_Properties(), this.getPropertyDefinition(), null, "properties", null, 0, -1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_DefinitionParameters(), this.getPropertyDefinitionParameter(), null, "definitionParameters", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicPropertyDefinitionEClass, AtomicPropertyDefinition.class, "AtomicPropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicPropertyDefinition_Alloy(), ecorePackage.getEString(), "alloy", null, 0, 1, AtomicPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayPropertyDefinitionEClass, OverlayPropertyDefinition.class, "OverlayPropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverlayPropertyDefinition_Instance(), this.getOverlayInstance(), null, "instance", null, 0, -1, OverlayPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayInstanceEClass, OverlayInstance.class, "OverlayInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlayInstance_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, OverlayInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverlayInstance_PropertyDefinition(), this.getPropertyDefinition(), null, "propertyDefinition", null, 1, 1, OverlayInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDefinitionParameterEClass, PropertyDefinitionParameter.class, "PropertyDefinitionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyDefinitionParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDefinitionParameter_Type(), this.getPropertyDefinitionParemeterType(), "type", null, 1, 1, PropertyDefinitionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInstanceEClass, PropertyInstance.class, "PropertyInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInstance_Parameters(), ecorePackage.getEObject(), null, "parameters", null, 0, -1, PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyInstance_PropertyDefinition(), this.getPropertyDefinition(), null, "propertyDefinition", null, 1, 1, PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyDefinitionParemeterTypeEEnum, PropertyDefinitionParemeterType.class, "PropertyDefinitionParemeterType");
		addEEnumLiteral(propertyDefinitionParemeterTypeEEnum, PropertyDefinitionParemeterType.COMPONENT);
		addEEnumLiteral(propertyDefinitionParemeterTypeEEnum, PropertyDefinitionParemeterType.PORT);
		addEEnumLiteral(propertyDefinitionParemeterTypeEEnum, PropertyDefinitionParemeterType.CONNECTOR);

		// Create resource
		createResource(eNS_URI);
	}

} //PropertyPackageImpl
