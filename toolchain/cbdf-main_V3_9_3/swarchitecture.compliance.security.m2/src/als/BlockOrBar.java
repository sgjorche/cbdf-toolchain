/**
 */
package als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Or Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.BlockOrBar#getBlock <em>Block</em>}</li>
 *   <li>{@link als.BlockOrBar#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getBlockOrBar()
 * @model
 * @generated
 */
public interface BlockOrBar extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see als.AlsPackage#getBlockOrBar_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link als.BlockOrBar#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see als.AlsPackage#getBlockOrBar_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link als.BlockOrBar#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // BlockOrBar
