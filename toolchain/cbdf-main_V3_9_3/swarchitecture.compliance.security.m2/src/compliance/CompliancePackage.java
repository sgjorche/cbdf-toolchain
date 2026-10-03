/**
 */
package compliance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import property.PropertyPackage;

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
 * @see compliance.ComplianceFactory
 * @model kind="package"
 * @generated
 */
public interface CompliancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compliance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "swarchitecture.compliance.security.compliance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compliance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompliancePackage eINSTANCE = compliance.impl.CompliancePackageImpl.init();

	/**
	 * The meta object id for the '{@link compliance.impl.ComplianceDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.ComplianceDefinitionImpl
	 * @see compliance.impl.CompliancePackageImpl#getComplianceDefinition()
	 * @generated
	 */
	int COMPLIANCE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION__NAME = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION__DEFINITION_PARAMETERS = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__DEFINITION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION__DESCRIPTION = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alloy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION__ALLOY = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY;

	/**
	 * The feature id for the '<em><b>Standard Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION__STANDARD_REF = PropertyPackage.ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_DEFINITION_FEATURE_COUNT = PropertyPackage.ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link compliance.impl.OverlayComplianceDefintionImpl <em>Overlay Compliance Defintion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.OverlayComplianceDefintionImpl
	 * @see compliance.impl.CompliancePackageImpl#getOverlayComplianceDefintion()
	 * @generated
	 */
	int OVERLAY_COMPLIANCE_DEFINTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_DEFINTION__NAME = PropertyPackage.OVERLAY_PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_DEFINTION__DEFINITION_PARAMETERS = PropertyPackage.OVERLAY_PROPERTY_DEFINITION__DEFINITION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_DEFINTION__DESCRIPTION = PropertyPackage.OVERLAY_PROPERTY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_DEFINTION__INSTANCE = PropertyPackage.OVERLAY_PROPERTY_DEFINITION__INSTANCE;

	/**
	 * The number of structural features of the '<em>Overlay Compliance Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_DEFINTION_FEATURE_COUNT = PropertyPackage.OVERLAY_PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link compliance.impl.OverlayComplianceInstanceImpl <em>Overlay Compliance Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.OverlayComplianceInstanceImpl
	 * @see compliance.impl.CompliancePackageImpl#getOverlayComplianceInstance()
	 * @generated
	 */
	int OVERLAY_COMPLIANCE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_INSTANCE__PARAMETERS = PropertyPackage.PROPERTY_INSTANCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_INSTANCE__PROPERTY_DEFINITION = PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION;

	/**
	 * The number of structural features of the '<em>Overlay Compliance Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_COMPLIANCE_INSTANCE_FEATURE_COUNT = PropertyPackage.PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link compliance.impl.ComplianceInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.ComplianceInstanceImpl
	 * @see compliance.impl.CompliancePackageImpl#getComplianceInstance()
	 * @generated
	 */
	int COMPLIANCE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_INSTANCE__PARAMETERS = PropertyPackage.PROPERTY_INSTANCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_INSTANCE__PROPERTY_DEFINITION = PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_INSTANCE_FEATURE_COUNT = PropertyPackage.PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link compliance.impl.SecurityControlDefintionImpl <em>Security Control Defintion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.SecurityControlDefintionImpl
	 * @see compliance.impl.CompliancePackageImpl#getSecurityControlDefintion()
	 * @generated
	 */
	int SECURITY_CONTROL_DEFINTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__NAME = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__DEFINITION_PARAMETERS = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__DEFINITION_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__DESCRIPTION = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alloy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__ALLOY = PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY;

	/**
	 * The feature id for the '<em><b>Standard Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__STANDARD_REF = PropertyPackage.ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enforce</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION__ENFORCE = PropertyPackage.ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Control Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_DEFINTION_FEATURE_COUNT = PropertyPackage.ATOMIC_PROPERTY_DEFINITION_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link compliance.impl.SecurityControlInstanceImpl <em>Security Control Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.SecurityControlInstanceImpl
	 * @see compliance.impl.CompliancePackageImpl#getSecurityControlInstance()
	 * @generated
	 */
	int SECURITY_CONTROL_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_INSTANCE__PARAMETERS = PropertyPackage.PROPERTY_INSTANCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_INSTANCE__PROPERTY_DEFINITION = PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION;

	/**
	 * The number of structural features of the '<em>Security Control Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_INSTANCE_FEATURE_COUNT = PropertyPackage.PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link compliance.impl.PropertyDefinitionStandardRefImpl <em>Property Definition Standard Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.PropertyDefinitionStandardRefImpl
	 * @see compliance.impl.CompliancePackageImpl#getPropertyDefinitionStandardRef()
	 * @generated
	 */
	int PROPERTY_DEFINITION_STANDARD_REF = 6;

	/**
	 * The feature id for the '<em><b>Standard Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF = 0;

	/**
	 * The number of structural features of the '<em>Property Definition Standard Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_STANDARD_REF_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link compliance.impl.StandardRefImpl <em>Standard Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compliance.impl.StandardRefImpl
	 * @see compliance.impl.CompliancePackageImpl#getStandardRef()
	 * @generated
	 */
	int STANDARD_REF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_REF__URL = 1;

	/**
	 * The number of structural features of the '<em>Standard Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_REF_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link compliance.ComplianceDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see compliance.ComplianceDefinition
	 * @generated
	 */
	EClass getComplianceDefinition();

	/**
	 * Returns the meta object for class '{@link compliance.OverlayComplianceDefintion <em>Overlay Compliance Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Compliance Defintion</em>'.
	 * @see compliance.OverlayComplianceDefintion
	 * @generated
	 */
	EClass getOverlayComplianceDefintion();

	/**
	 * Returns the meta object for class '{@link compliance.OverlayComplianceInstance <em>Overlay Compliance Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Compliance Instance</em>'.
	 * @see compliance.OverlayComplianceInstance
	 * @generated
	 */
	EClass getOverlayComplianceInstance();

	/**
	 * Returns the meta object for class '{@link compliance.ComplianceInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see compliance.ComplianceInstance
	 * @generated
	 */
	EClass getComplianceInstance();

	/**
	 * Returns the meta object for class '{@link compliance.SecurityControlDefintion <em>Security Control Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Control Defintion</em>'.
	 * @see compliance.SecurityControlDefintion
	 * @generated
	 */
	EClass getSecurityControlDefintion();

	/**
	 * Returns the meta object for the reference list '{@link compliance.SecurityControlDefintion#getEnforce <em>Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enforce</em>'.
	 * @see compliance.SecurityControlDefintion#getEnforce()
	 * @see #getSecurityControlDefintion()
	 * @generated
	 */
	EReference getSecurityControlDefintion_Enforce();

	/**
	 * Returns the meta object for class '{@link compliance.SecurityControlInstance <em>Security Control Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Control Instance</em>'.
	 * @see compliance.SecurityControlInstance
	 * @generated
	 */
	EClass getSecurityControlInstance();

	/**
	 * Returns the meta object for class '{@link compliance.PropertyDefinitionStandardRef <em>Property Definition Standard Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Definition Standard Ref</em>'.
	 * @see compliance.PropertyDefinitionStandardRef
	 * @generated
	 */
	EClass getPropertyDefinitionStandardRef();

	/**
	 * Returns the meta object for the containment reference list '{@link compliance.PropertyDefinitionStandardRef#getStandardRef <em>Standard Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard Ref</em>'.
	 * @see compliance.PropertyDefinitionStandardRef#getStandardRef()
	 * @see #getPropertyDefinitionStandardRef()
	 * @generated
	 */
	EReference getPropertyDefinitionStandardRef_StandardRef();

	/**
	 * Returns the meta object for class '{@link compliance.StandardRef <em>Standard Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Ref</em>'.
	 * @see compliance.StandardRef
	 * @generated
	 */
	EClass getStandardRef();

	/**
	 * Returns the meta object for the attribute '{@link compliance.StandardRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see compliance.StandardRef#getName()
	 * @see #getStandardRef()
	 * @generated
	 */
	EAttribute getStandardRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link compliance.StandardRef#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see compliance.StandardRef#getUrl()
	 * @see #getStandardRef()
	 * @generated
	 */
	EAttribute getStandardRef_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComplianceFactory getComplianceFactory();

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
		 * The meta object literal for the '{@link compliance.impl.ComplianceDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.ComplianceDefinitionImpl
		 * @see compliance.impl.CompliancePackageImpl#getComplianceDefinition()
		 * @generated
		 */
		EClass COMPLIANCE_DEFINITION = eINSTANCE.getComplianceDefinition();

		/**
		 * The meta object literal for the '{@link compliance.impl.OverlayComplianceDefintionImpl <em>Overlay Compliance Defintion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.OverlayComplianceDefintionImpl
		 * @see compliance.impl.CompliancePackageImpl#getOverlayComplianceDefintion()
		 * @generated
		 */
		EClass OVERLAY_COMPLIANCE_DEFINTION = eINSTANCE.getOverlayComplianceDefintion();

		/**
		 * The meta object literal for the '{@link compliance.impl.OverlayComplianceInstanceImpl <em>Overlay Compliance Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.OverlayComplianceInstanceImpl
		 * @see compliance.impl.CompliancePackageImpl#getOverlayComplianceInstance()
		 * @generated
		 */
		EClass OVERLAY_COMPLIANCE_INSTANCE = eINSTANCE.getOverlayComplianceInstance();

		/**
		 * The meta object literal for the '{@link compliance.impl.ComplianceInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.ComplianceInstanceImpl
		 * @see compliance.impl.CompliancePackageImpl#getComplianceInstance()
		 * @generated
		 */
		EClass COMPLIANCE_INSTANCE = eINSTANCE.getComplianceInstance();

		/**
		 * The meta object literal for the '{@link compliance.impl.SecurityControlDefintionImpl <em>Security Control Defintion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.SecurityControlDefintionImpl
		 * @see compliance.impl.CompliancePackageImpl#getSecurityControlDefintion()
		 * @generated
		 */
		EClass SECURITY_CONTROL_DEFINTION = eINSTANCE.getSecurityControlDefintion();

		/**
		 * The meta object literal for the '<em><b>Enforce</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL_DEFINTION__ENFORCE = eINSTANCE.getSecurityControlDefintion_Enforce();

		/**
		 * The meta object literal for the '{@link compliance.impl.SecurityControlInstanceImpl <em>Security Control Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.SecurityControlInstanceImpl
		 * @see compliance.impl.CompliancePackageImpl#getSecurityControlInstance()
		 * @generated
		 */
		EClass SECURITY_CONTROL_INSTANCE = eINSTANCE.getSecurityControlInstance();

		/**
		 * The meta object literal for the '{@link compliance.impl.PropertyDefinitionStandardRefImpl <em>Property Definition Standard Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.PropertyDefinitionStandardRefImpl
		 * @see compliance.impl.CompliancePackageImpl#getPropertyDefinitionStandardRef()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION_STANDARD_REF = eINSTANCE.getPropertyDefinitionStandardRef();

		/**
		 * The meta object literal for the '<em><b>Standard Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF = eINSTANCE.getPropertyDefinitionStandardRef_StandardRef();

		/**
		 * The meta object literal for the '{@link compliance.impl.StandardRefImpl <em>Standard Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compliance.impl.StandardRefImpl
		 * @see compliance.impl.CompliancePackageImpl#getStandardRef()
		 * @generated
		 */
		EClass STANDARD_REF = eINSTANCE.getStandardRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_REF__NAME = eINSTANCE.getStandardRef_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_REF__URL = eINSTANCE.getStandardRef_Url();

	}

} //CompliancePackage
