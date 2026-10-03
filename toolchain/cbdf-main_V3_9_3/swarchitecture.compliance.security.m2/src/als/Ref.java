/**
 */
package als;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.Ref#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Ref</em>' reference.
	 * @see #setNameRef(ReferencesName)
	 * @see als.AlsPackage#getRef_NameRef()
	 * @model
	 * @generated
	 */
	ReferencesName getNameRef();

	/**
	 * Sets the value of the '{@link als.Ref#getNameRef <em>Name Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ref</em>' reference.
	 * @see #getNameRef()
	 * @generated
	 */
	void setNameRef(ReferencesName value);

} // Ref
