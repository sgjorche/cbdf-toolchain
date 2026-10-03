/**
 */
package property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.PropertyInstance#getParameters <em>Parameters</em>}</li>
 *   <li>{@link property.PropertyInstance#getPropertyDefinition <em>Property Definition</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getPropertyInstance()
 * @model
 * @generated
 */
public interface PropertyInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see property.PropertyPackage#getPropertyInstance_Parameters()
	 * @model
	 * @generated
	 */
	EList<EObject> getParameters();

	/**
	 * Returns the value of the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition</em>' reference.
	 * @see #setPropertyDefinition(PropertyDefinition)
	 * @see property.PropertyPackage#getPropertyInstance_PropertyDefinition()
	 * @model required="true"
	 * @generated
	 */
	PropertyDefinition getPropertyDefinition();

	/**
	 * Sets the value of the '{@link property.PropertyInstance#getPropertyDefinition <em>Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Definition</em>' reference.
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	void setPropertyDefinition(PropertyDefinition value);

} // PropertyInstance
