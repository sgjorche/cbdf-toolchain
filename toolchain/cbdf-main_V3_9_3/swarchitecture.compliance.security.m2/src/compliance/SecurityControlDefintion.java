/**
 */
package compliance;

import org.eclipse.emf.common.util.EList;

import property.AtomicPropertyDefinition;
import property.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Control Defintion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compliance.SecurityControlDefintion#getEnforce <em>Enforce</em>}</li>
 * </ul>
 *
 * @see compliance.CompliancePackage#getSecurityControlDefintion()
 * @model
 * @generated
 */
public interface SecurityControlDefintion extends AtomicPropertyDefinition, PropertyDefinitionStandardRef {
	/**
	 * Returns the value of the '<em><b>Enforce</b></em>' reference list.
	 * The list contents are of type {@link property.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforce</em>' reference list.
	 * @see compliance.CompliancePackage#getSecurityControlDefintion_Enforce()
	 * @model
	 * @generated
	 */
	EList<PropertyDefinition> getEnforce();

} // SecurityControlDefintion
