/**
 */
package property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.OverlayInstance#getParameters <em>Parameters</em>}</li>
 *   <li>{@link property.OverlayInstance#getPropertyDefinition <em>Property Definition</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getOverlayInstance()
 * @model
 * @generated
 */
public interface OverlayInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see property.PropertyPackage#getOverlayInstance_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition</em>' reference.
	 * @see #setPropertyDefinition(PropertyDefinition)
	 * @see property.PropertyPackage#getOverlayInstance_PropertyDefinition()
	 * @model required="true"
	 * @generated
	 */
	PropertyDefinition getPropertyDefinition();

	/**
	 * Sets the value of the '{@link property.OverlayInstance#getPropertyDefinition <em>Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Definition</em>' reference.
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	void setPropertyDefinition(PropertyDefinition value);

} // OverlayInstance
