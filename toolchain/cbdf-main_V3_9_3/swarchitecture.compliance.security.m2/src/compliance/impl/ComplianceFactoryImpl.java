/**
 */
package compliance.impl;

import compliance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplianceFactoryImpl extends EFactoryImpl implements ComplianceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComplianceFactory init() {
		try {
			ComplianceFactory theComplianceFactory = (ComplianceFactory)EPackage.Registry.INSTANCE.getEFactory(CompliancePackage.eNS_URI);
			if (theComplianceFactory != null) {
				return theComplianceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComplianceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompliancePackage.COMPLIANCE_DEFINITION: return createComplianceDefinition();
			case CompliancePackage.OVERLAY_COMPLIANCE_DEFINTION: return createOverlayComplianceDefintion();
			case CompliancePackage.OVERLAY_COMPLIANCE_INSTANCE: return createOverlayComplianceInstance();
			case CompliancePackage.COMPLIANCE_INSTANCE: return createComplianceInstance();
			case CompliancePackage.SECURITY_CONTROL_DEFINTION: return createSecurityControlDefintion();
			case CompliancePackage.SECURITY_CONTROL_INSTANCE: return createSecurityControlInstance();
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF: return createPropertyDefinitionStandardRef();
			case CompliancePackage.STANDARD_REF: return createStandardRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceDefinition createComplianceDefinition() {
		ComplianceDefinitionImpl complianceDefinition = new ComplianceDefinitionImpl();
		return complianceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlayComplianceDefintion createOverlayComplianceDefintion() {
		OverlayComplianceDefintionImpl overlayComplianceDefintion = new OverlayComplianceDefintionImpl();
		return overlayComplianceDefintion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlayComplianceInstance createOverlayComplianceInstance() {
		OverlayComplianceInstanceImpl overlayComplianceInstance = new OverlayComplianceInstanceImpl();
		return overlayComplianceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplianceInstance createComplianceInstance() {
		ComplianceInstanceImpl complianceInstance = new ComplianceInstanceImpl();
		return complianceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityControlDefintion createSecurityControlDefintion() {
		SecurityControlDefintionImpl securityControlDefintion = new SecurityControlDefintionImpl();
		return securityControlDefintion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityControlInstance createSecurityControlInstance() {
		SecurityControlInstanceImpl securityControlInstance = new SecurityControlInstanceImpl();
		return securityControlInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinitionStandardRef createPropertyDefinitionStandardRef() {
		PropertyDefinitionStandardRefImpl propertyDefinitionStandardRef = new PropertyDefinitionStandardRefImpl();
		return propertyDefinitionStandardRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardRef createStandardRef() {
		StandardRefImpl standardRef = new StandardRefImpl();
		return standardRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompliancePackage getCompliancePackage() {
		return (CompliancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompliancePackage getPackage() {
		return CompliancePackage.eINSTANCE;
	}

} //ComplianceFactoryImpl
