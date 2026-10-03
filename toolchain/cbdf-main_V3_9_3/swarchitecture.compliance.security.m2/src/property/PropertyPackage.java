/**
 */
package property;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see property.PropertyFactory
 * @model kind="package"
 * @generated
 */
public interface PropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "property";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "swarchitecture.compliance.security.property";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "property";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertyPackage eINSTANCE = property.impl.PropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link property.impl.PropertyCategoryLibraryImpl <em>Category Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyCategoryLibraryImpl
	 * @see property.impl.PropertyPackageImpl#getPropertyCategoryLibrary()
	 * @generated
	 */
	int PROPERTY_CATEGORY_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_LIBRARY__CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Category Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link property.impl.PropertyCategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyCategoryImpl
	 * @see property.impl.PropertyPackageImpl#getPropertyCategory()
	 * @generated
	 */
	int PROPERTY_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link property.impl.PropertyDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyDefinitionImpl
	 * @see property.impl.PropertyPackageImpl#getPropertyDefinition()
	 * @generated
	 */
	int PROPERTY_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__DEFINITION_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link property.impl.AtomicPropertyDefinitionImpl <em>Atomic Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.AtomicPropertyDefinitionImpl
	 * @see property.impl.PropertyPackageImpl#getAtomicPropertyDefinition()
	 * @generated
	 */
	int ATOMIC_PROPERTY_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPERTY_DEFINITION__NAME = PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPERTY_DEFINITION__DEFINITION_PARAMETERS = PROPERTY_DEFINITION__DEFINITION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPERTY_DEFINITION__DESCRIPTION = PROPERTY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alloy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPERTY_DEFINITION__ALLOY = PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT = PROPERTY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link property.impl.OverlayPropertyDefinitionImpl <em>Overlay Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OverlayPropertyDefinitionImpl
	 * @see property.impl.PropertyPackageImpl#getOverlayPropertyDefinition()
	 * @generated
	 */
	int OVERLAY_PROPERTY_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_PROPERTY_DEFINITION__NAME = PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_PROPERTY_DEFINITION__DEFINITION_PARAMETERS = PROPERTY_DEFINITION__DEFINITION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_PROPERTY_DEFINITION__DESCRIPTION = PROPERTY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_PROPERTY_DEFINITION__INSTANCE = PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overlay Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_PROPERTY_DEFINITION_FEATURE_COUNT = PROPERTY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link property.impl.OverlayInstanceImpl <em>Overlay Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.OverlayInstanceImpl
	 * @see property.impl.PropertyPackageImpl#getOverlayInstance()
	 * @generated
	 */
	int OVERLAY_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_INSTANCE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_INSTANCE__PROPERTY_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Overlay Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link property.impl.PropertyDefinitionParameterImpl <em>Definition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyDefinitionParameterImpl
	 * @see property.impl.PropertyPackageImpl#getPropertyDefinitionParameter()
	 * @generated
	 */
	int PROPERTY_DEFINITION_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Definition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link property.impl.PropertyInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.impl.PropertyInstanceImpl
	 * @see property.impl.PropertyPackageImpl#getPropertyInstance()
	 * @generated
	 */
	int PROPERTY_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__PROPERTY_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link property.PropertyDefinitionParemeterType <em>Definition Paremeter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see property.PropertyDefinitionParemeterType
	 * @see property.impl.PropertyPackageImpl#getPropertyDefinitionParemeterType()
	 * @generated
	 */
	int PROPERTY_DEFINITION_PAREMETER_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link property.PropertyCategoryLibrary <em>Category Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Library</em>'.
	 * @see property.PropertyCategoryLibrary
	 * @generated
	 */
	EClass getPropertyCategoryLibrary();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyCategoryLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see property.PropertyCategoryLibrary#getName()
	 * @see #getPropertyCategoryLibrary()
	 * @generated
	 */
	EAttribute getPropertyCategoryLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link property.PropertyCategoryLibrary#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see property.PropertyCategoryLibrary#getCategories()
	 * @see #getPropertyCategoryLibrary()
	 * @generated
	 */
	EReference getPropertyCategoryLibrary_Categories();

	/**
	 * Returns the meta object for class '{@link property.PropertyCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see property.PropertyCategory
	 * @generated
	 */
	EClass getPropertyCategory();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see property.PropertyCategory#getName()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EAttribute getPropertyCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link property.PropertyCategory#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see property.PropertyCategory#getProperties()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EReference getPropertyCategory_Properties();

	/**
	 * Returns the meta object for class '{@link property.PropertyDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see property.PropertyDefinition
	 * @generated
	 */
	EClass getPropertyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see property.PropertyDefinition#getName()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link property.PropertyDefinition#getDefinitionParameters <em>Definition Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition Parameters</em>'.
	 * @see property.PropertyDefinition#getDefinitionParameters()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_DefinitionParameters();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see property.PropertyDefinition#getDescription()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EAttribute getPropertyDefinition_Description();

	/**
	 * Returns the meta object for class '{@link property.AtomicPropertyDefinition <em>Atomic Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Property Definition</em>'.
	 * @see property.AtomicPropertyDefinition
	 * @generated
	 */
	EClass getAtomicPropertyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link property.AtomicPropertyDefinition#getAlloy <em>Alloy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alloy</em>'.
	 * @see property.AtomicPropertyDefinition#getAlloy()
	 * @see #getAtomicPropertyDefinition()
	 * @generated
	 */
	EAttribute getAtomicPropertyDefinition_Alloy();

	/**
	 * Returns the meta object for class '{@link property.OverlayPropertyDefinition <em>Overlay Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Property Definition</em>'.
	 * @see property.OverlayPropertyDefinition
	 * @generated
	 */
	EClass getOverlayPropertyDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link property.OverlayPropertyDefinition#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see property.OverlayPropertyDefinition#getInstance()
	 * @see #getOverlayPropertyDefinition()
	 * @generated
	 */
	EReference getOverlayPropertyDefinition_Instance();

	/**
	 * Returns the meta object for class '{@link property.OverlayInstance <em>Overlay Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Instance</em>'.
	 * @see property.OverlayInstance
	 * @generated
	 */
	EClass getOverlayInstance();

	/**
	 * Returns the meta object for the attribute list '{@link property.OverlayInstance#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see property.OverlayInstance#getParameters()
	 * @see #getOverlayInstance()
	 * @generated
	 */
	EAttribute getOverlayInstance_Parameters();

	/**
	 * Returns the meta object for the reference '{@link property.OverlayInstance#getPropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Definition</em>'.
	 * @see property.OverlayInstance#getPropertyDefinition()
	 * @see #getOverlayInstance()
	 * @generated
	 */
	EReference getOverlayInstance_PropertyDefinition();

	/**
	 * Returns the meta object for class '{@link property.PropertyDefinitionParameter <em>Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parameter</em>'.
	 * @see property.PropertyDefinitionParameter
	 * @generated
	 */
	EClass getPropertyDefinitionParameter();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyDefinitionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see property.PropertyDefinitionParameter#getName()
	 * @see #getPropertyDefinitionParameter()
	 * @generated
	 */
	EAttribute getPropertyDefinitionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link property.PropertyDefinitionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see property.PropertyDefinitionParameter#getType()
	 * @see #getPropertyDefinitionParameter()
	 * @generated
	 */
	EAttribute getPropertyDefinitionParameter_Type();

	/**
	 * Returns the meta object for class '{@link property.PropertyInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see property.PropertyInstance
	 * @generated
	 */
	EClass getPropertyInstance();

	/**
	 * Returns the meta object for the reference list '{@link property.PropertyInstance#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see property.PropertyInstance#getParameters()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EReference getPropertyInstance_Parameters();

	/**
	 * Returns the meta object for the reference '{@link property.PropertyInstance#getPropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Definition</em>'.
	 * @see property.PropertyInstance#getPropertyDefinition()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EReference getPropertyInstance_PropertyDefinition();

	/**
	 * Returns the meta object for enum '{@link property.PropertyDefinitionParemeterType <em>Definition Paremeter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Paremeter Type</em>'.
	 * @see property.PropertyDefinitionParemeterType
	 * @generated
	 */
	EEnum getPropertyDefinitionParemeterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertyFactory getPropertyFactory();

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
		 * The meta object literal for the '{@link property.impl.PropertyCategoryLibraryImpl <em>Category Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyCategoryLibraryImpl
		 * @see property.impl.PropertyPackageImpl#getPropertyCategoryLibrary()
		 * @generated
		 */
		EClass PROPERTY_CATEGORY_LIBRARY = eINSTANCE.getPropertyCategoryLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY_LIBRARY__NAME = eINSTANCE.getPropertyCategoryLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CATEGORY_LIBRARY__CATEGORIES = eINSTANCE.getPropertyCategoryLibrary_Categories();

		/**
		 * The meta object literal for the '{@link property.impl.PropertyCategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyCategoryImpl
		 * @see property.impl.PropertyPackageImpl#getPropertyCategory()
		 * @generated
		 */
		EClass PROPERTY_CATEGORY = eINSTANCE.getPropertyCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY__NAME = eINSTANCE.getPropertyCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CATEGORY__PROPERTIES = eINSTANCE.getPropertyCategory_Properties();

		/**
		 * The meta object literal for the '{@link property.impl.PropertyDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyDefinitionImpl
		 * @see property.impl.PropertyPackageImpl#getPropertyDefinition()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Definition Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__DEFINITION_PARAMETERS = eINSTANCE.getPropertyDefinition_DefinitionParameters();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION__DESCRIPTION = eINSTANCE.getPropertyDefinition_Description();

		/**
		 * The meta object literal for the '{@link property.impl.AtomicPropertyDefinitionImpl <em>Atomic Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.AtomicPropertyDefinitionImpl
		 * @see property.impl.PropertyPackageImpl#getAtomicPropertyDefinition()
		 * @generated
		 */
		EClass ATOMIC_PROPERTY_DEFINITION = eINSTANCE.getAtomicPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Alloy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROPERTY_DEFINITION__ALLOY = eINSTANCE.getAtomicPropertyDefinition_Alloy();

		/**
		 * The meta object literal for the '{@link property.impl.OverlayPropertyDefinitionImpl <em>Overlay Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OverlayPropertyDefinitionImpl
		 * @see property.impl.PropertyPackageImpl#getOverlayPropertyDefinition()
		 * @generated
		 */
		EClass OVERLAY_PROPERTY_DEFINITION = eINSTANCE.getOverlayPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY_PROPERTY_DEFINITION__INSTANCE = eINSTANCE.getOverlayPropertyDefinition_Instance();

		/**
		 * The meta object literal for the '{@link property.impl.OverlayInstanceImpl <em>Overlay Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.OverlayInstanceImpl
		 * @see property.impl.PropertyPackageImpl#getOverlayInstance()
		 * @generated
		 */
		EClass OVERLAY_INSTANCE = eINSTANCE.getOverlayInstance();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_INSTANCE__PARAMETERS = eINSTANCE.getOverlayInstance_Parameters();

		/**
		 * The meta object literal for the '<em><b>Property Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY_INSTANCE__PROPERTY_DEFINITION = eINSTANCE.getOverlayInstance_PropertyDefinition();

		/**
		 * The meta object literal for the '{@link property.impl.PropertyDefinitionParameterImpl <em>Definition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyDefinitionParameterImpl
		 * @see property.impl.PropertyPackageImpl#getPropertyDefinitionParameter()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION_PARAMETER = eINSTANCE.getPropertyDefinitionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION_PARAMETER__NAME = eINSTANCE.getPropertyDefinitionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DEFINITION_PARAMETER__TYPE = eINSTANCE.getPropertyDefinitionParameter_Type();

		/**
		 * The meta object literal for the '{@link property.impl.PropertyInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.impl.PropertyInstanceImpl
		 * @see property.impl.PropertyPackageImpl#getPropertyInstance()
		 * @generated
		 */
		EClass PROPERTY_INSTANCE = eINSTANCE.getPropertyInstance();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INSTANCE__PARAMETERS = eINSTANCE.getPropertyInstance_Parameters();

		/**
		 * The meta object literal for the '<em><b>Property Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INSTANCE__PROPERTY_DEFINITION = eINSTANCE.getPropertyInstance_PropertyDefinition();

		/**
		 * The meta object literal for the '{@link property.PropertyDefinitionParemeterType <em>Definition Paremeter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see property.PropertyDefinitionParemeterType
		 * @see property.impl.PropertyPackageImpl#getPropertyDefinitionParemeterType()
		 * @generated
		 */
		EEnum PROPERTY_DEFINITION_PAREMETER_TYPE = eINSTANCE.getPropertyDefinitionParemeterType();

	}

} //PropertyPackage
