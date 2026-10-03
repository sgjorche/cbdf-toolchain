/**
 */
package als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.UnOp#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getUnOp()
 * @model
 * @generated
 */
public interface UnOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see als.AlsPackage#getUnOp_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link als.UnOp#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

} // UnOp
