/**
 */
package property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link property.OverlayPropertyDefinition#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see property.PropertyPackage#getOverlayPropertyDefinition()
 * @model
 * @generated
 */
public interface OverlayPropertyDefinition extends PropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link property.OverlayInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see property.PropertyPackage#getOverlayPropertyDefinition_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverlayInstance> getInstance();

} // OverlayPropertyDefinition
