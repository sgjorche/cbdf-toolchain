/**
 */
package als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paranthesisand Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.ParanthesisandExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getParanthesisandExpression()
 * @model
 * @generated
 */
public interface ParanthesisandExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
	 * The list contents are of type {@link als.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference list.
	 * @see als.AlsPackage#getParanthesisandExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpr();

} // ParanthesisandExpression
