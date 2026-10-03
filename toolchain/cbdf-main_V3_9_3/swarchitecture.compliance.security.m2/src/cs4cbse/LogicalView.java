/**
 */
package cs4cbse;

import logical.Component;
import logical.Connector;
import logical.InteractionNature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.LogicalView#getComponents <em>Components</em>}</li>
 *   <li>{@link cs4cbse.LogicalView#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link cs4cbse.LogicalView#getInteractionNatures <em>Interaction Natures</em>}</li>
 * </ul>
 *
 * @see cs4cbse.Cs4cbsePackage#getLogicalView()
 * @model
 * @generated
 */
public interface LogicalView extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link logical.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getLogicalView_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link logical.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getLogicalView_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Interaction Natures</b></em>' containment reference list.
	 * The list contents are of type {@link logical.InteractionNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Natures</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getLogicalView_InteractionNatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionNature> getInteractionNatures();

} // LogicalView
