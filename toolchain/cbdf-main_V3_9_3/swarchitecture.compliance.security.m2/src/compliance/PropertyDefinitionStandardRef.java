/**
 */
package compliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition Standard Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compliance.PropertyDefinitionStandardRef#getStandardRef <em>Standard Ref</em>}</li>
 * </ul>
 *
 * @see compliance.CompliancePackage#getPropertyDefinitionStandardRef()
 * @model
 * @generated
 */
public interface PropertyDefinitionStandardRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard Ref</b></em>' containment reference list.
	 * The list contents are of type {@link compliance.StandardRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Ref</em>' containment reference list.
	 * @see compliance.CompliancePackage#getPropertyDefinitionStandardRef_StandardRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<StandardRef> getStandardRef();

} // PropertyDefinitionStandardRef
