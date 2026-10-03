/**
 */
package logical;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logical.Connector#getName <em>Name</em>}</li>
 *   <li>{@link logical.Connector#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see logical.LogicalPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see logical.LogicalPackage#getConnector_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link logical.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connects</b></em>' reference list.
	 * The list contents are of type {@link logical.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' reference list.
	 * @see logical.LogicalPackage#getConnector_Connects()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getConnects();

} // Connector
