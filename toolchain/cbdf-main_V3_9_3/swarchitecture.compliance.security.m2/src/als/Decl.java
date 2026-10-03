/**
 */
package als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.Decl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link als.Decl#getComma <em>Comma</em>}</li>
 *   <li>{@link als.Decl#getColon <em>Colon</em>}</li>
 *   <li>{@link als.Decl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getDecl()
 * @model
 * @generated
 */
public interface Decl extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference list.
	 * The list contents are of type {@link als.PropertyName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference list.
	 * @see als.AlsPackage#getDecl_PropertyName()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyName> getPropertyName();

	/**
	 * Returns the value of the '<em><b>Comma</b></em>' containment reference list.
	 * The list contents are of type {@link als.Comma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comma</em>' containment reference list.
	 * @see als.AlsPackage#getDecl_Comma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comma> getComma();

	/**
	 * Returns the value of the '<em><b>Colon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colon</em>' containment reference.
	 * @see #setColon(Colon)
	 * @see als.AlsPackage#getDecl_Colon()
	 * @model containment="true"
	 * @generated
	 */
	Colon getColon();

	/**
	 * Sets the value of the '{@link als.Decl#getColon <em>Colon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colon</em>' containment reference.
	 * @see #getColon()
	 * @generated
	 */
	void setColon(Colon value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see als.AlsPackage#getDecl_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link als.Decl#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // Decl
