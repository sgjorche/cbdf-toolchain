/**
 */
package property;

import als.Predicate;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link property.PropertyDefinition#getDefinitionParameters <em>Definition Parameters</em>}</li>
 *   <li>{@link property.PropertyDefinition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see property.PropertyPackage#getPropertyDefinition_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link property.PropertyDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definition Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link property.PropertyDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Parameters</em>' containment reference list.
	 * @see property.PropertyPackage#getPropertyDefinition_DefinitionParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDefinitionParameter> getDefinitionParameters();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see property.PropertyPackage#getPropertyDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link property.PropertyDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // PropertyDefinition
