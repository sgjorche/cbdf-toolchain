/**
 */
package als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.BinOp#getDot <em>Dot</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getBinOp()
 * @model
 * @generated
 */
public interface BinOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot</em>' containment reference.
	 * @see #setDot(Dot)
	 * @see als.AlsPackage#getBinOp_Dot()
	 * @model containment="true"
	 * @generated
	 */
	Dot getDot();

	/**
	 * Sets the value of the '{@link als.BinOp#getDot <em>Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot</em>' containment reference.
	 * @see #getDot()
	 * @generated
	 */
	void setDot(Dot value);

} // BinOp
