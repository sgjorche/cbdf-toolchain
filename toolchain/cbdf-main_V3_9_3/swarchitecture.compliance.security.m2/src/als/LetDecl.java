/**
 */
package als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.LetDecl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link als.LetDecl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getLetDecl()
 * @model
 * @generated
 */
public interface LetDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(PropertyName)
	 * @see als.AlsPackage#getLetDecl_NameExpression()
	 * @model containment="true"
	 * @generated
	 */
	PropertyName getNameExpression();

	/**
	 * Sets the value of the '{@link als.LetDecl#getNameExpression <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' containment reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(PropertyName value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see als.AlsPackage#getLetDecl_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link als.LetDecl#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // LetDecl
