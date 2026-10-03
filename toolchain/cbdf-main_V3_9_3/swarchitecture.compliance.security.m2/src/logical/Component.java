/**
 */
package logical;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logical.Component#getName <em>Name</em>}</li>
 *   <li>{@link logical.Component#getUses <em>Uses</em>}</li>
 *   <li>{@link logical.Component#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see logical.LogicalPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see logical.LogicalPackage#getComponent_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link logical.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link logical.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see logical.LogicalPackage#getComponent_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getUses();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Component)
	 * @see logical.LogicalPackage#getComponent_Parent()
	 * @model
	 * @generated
	 */
	Component getParent();

	/**
	 * Sets the value of the '{@link logical.Component#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Component value);

} // Component
