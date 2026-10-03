/**
 */
package compliance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see compliance.CompliancePackage
 * @generated
 */
public interface ComplianceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComplianceFactory eINSTANCE = compliance.impl.ComplianceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	ComplianceDefinition createComplianceDefinition();

	/**
	 * Returns a new object of class '<em>Overlay Compliance Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlay Compliance Defintion</em>'.
	 * @generated
	 */
	OverlayComplianceDefintion createOverlayComplianceDefintion();

	/**
	 * Returns a new object of class '<em>Overlay Compliance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlay Compliance Instance</em>'.
	 * @generated
	 */
	OverlayComplianceInstance createOverlayComplianceInstance();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	ComplianceInstance createComplianceInstance();

	/**
	 * Returns a new object of class '<em>Security Control Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Control Defintion</em>'.
	 * @generated
	 */
	SecurityControlDefintion createSecurityControlDefintion();

	/**
	 * Returns a new object of class '<em>Security Control Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Control Instance</em>'.
	 * @generated
	 */
	SecurityControlInstance createSecurityControlInstance();

	/**
	 * Returns a new object of class '<em>Property Definition Standard Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Definition Standard Ref</em>'.
	 * @generated
	 */
	PropertyDefinitionStandardRef createPropertyDefinitionStandardRef();

	/**
	 * Returns a new object of class '<em>Standard Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Ref</em>'.
	 * @generated
	 */
	StandardRef createStandardRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompliancePackage getCompliancePackage();

} //ComplianceFactory
