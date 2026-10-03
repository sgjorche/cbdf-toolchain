/**
 */
package property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.PropertyCategory#getName <em>Name</em>}</li>
 *   <li>{@link property.PropertyCategory#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getPropertyCategory()
 * @model
 * @generated
 */
public interface PropertyCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see property.PropertyPackage#getPropertyCategory_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link property.PropertyCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link property.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see property.PropertyPackage#getPropertyCategory_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDefinition> getProperties();

} // PropertyCategory
