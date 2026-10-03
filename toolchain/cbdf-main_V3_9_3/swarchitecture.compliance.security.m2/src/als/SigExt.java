/**
 */
package als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.SigExt#getRef <em>Ref</em>}</li>
 *   <li>{@link als.SigExt#getRef2 <em>Ref2</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getSigExt()
 * @model
 * @generated
 */
public interface SigExt extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference.
	 * @see #setRef(ReferencesSig)
	 * @see als.AlsPackage#getSigExt_Ref()
	 * @model containment="true"
	 * @generated
	 */
	ReferencesSig getRef();

	/**
	 * Sets the value of the '{@link als.SigExt#getRef <em>Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' containment reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ReferencesSig value);

	/**
	 * Returns the value of the '<em><b>Ref2</b></em>' containment reference list.
	 * The list contents are of type {@link als.ReferencesSig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref2</em>' containment reference list.
	 * @see als.AlsPackage#getSigExt_Ref2()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferencesSig> getRef2();

} // SigExt
