/**
 */
package property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.PropertyDefinitionParameter#getName <em>Name</em>}</li>
 *   <li>{@link property.PropertyDefinitionParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getPropertyDefinitionParameter()
 * @model
 * @generated
 */
public interface PropertyDefinitionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see property.PropertyPackage#getPropertyDefinitionParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link property.PropertyDefinitionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link property.PropertyDefinitionParemeterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see property.PropertyDefinitionParemeterType
	 * @see #setType(PropertyDefinitionParemeterType)
	 * @see property.PropertyPackage#getPropertyDefinitionParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	PropertyDefinitionParemeterType getType();

	/**
	 * Sets the value of the '{@link property.PropertyDefinitionParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see property.PropertyDefinitionParemeterType
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyDefinitionParemeterType value);

} // PropertyDefinitionParameter
