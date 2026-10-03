/**
 */
package logical;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logical.Port#getName <em>Name</em>}</li>
 *   <li>{@link logical.Port#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link logical.Port#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see logical.LogicalPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see logical.LogicalPackage#getPort_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link logical.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link logical.InteractionNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see logical.LogicalPackage#getPort_Realizes()
	 * @model required="true"
	 * @generated
	 */
	EList<InteractionNature> getRealizes();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link logical.Portkind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see logical.Portkind
	 * @see #setKind(Portkind)
	 * @see logical.LogicalPackage#getPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	Portkind getKind();

	/**
	 * Sets the value of the '{@link logical.Port#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see logical.Portkind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Portkind value);

} // Port
