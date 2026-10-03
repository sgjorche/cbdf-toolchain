/**
 */
package als;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.Module#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link als.Module#getLeft <em>Left</em>}</li>
 *   <li>{@link als.Module#getExactly <em>Exactly</em>}</li>
 *   <li>{@link als.Module#getName <em>Name</em>}</li>
 *   <li>{@link als.Module#getComma <em>Comma</em>}</li>
 *   <li>{@link als.Module#getNumber <em>Number</em>}</li>
 *   <li>{@link als.Module#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see als.AlsPackage#getModule_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link als.Module#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(LeftSquareBracketKeyword)
	 * @see als.AlsPackage#getModule_Left()
	 * @model containment="true"
	 * @generated
	 */
	LeftSquareBracketKeyword getLeft();

	/**
	 * Sets the value of the '{@link als.Module#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(LeftSquareBracketKeyword value);

	/**
	 * Returns the value of the '<em><b>Exactly</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exactly</em>' attribute list.
	 * @see als.AlsPackage#getModule_Exactly()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getExactly();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link als.ExactlyName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see als.AlsPackage#getModule_Name()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExactlyName> getName();

	/**
	 * Returns the value of the '<em><b>Comma</b></em>' containment reference list.
	 * The list contents are of type {@link als.Comma}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comma</em>' containment reference list.
	 * @see als.AlsPackage#getModule_Comma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comma> getComma();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute list.
	 * @see als.AlsPackage#getModule_Number()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getNumber();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RightSquareBracketKeyword)
	 * @see als.AlsPackage#getModule_Right()
	 * @model containment="true"
	 * @generated
	 */
	RightSquareBracketKeyword getRight();

	/**
	 * Sets the value of the '{@link als.Module#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(RightSquareBracketKeyword value);

} // Module
