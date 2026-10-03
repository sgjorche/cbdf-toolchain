/**
 */
package cs4cbse;

import logical.Component;
import logical.Connector;
import logical.InteractionNature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import property.PropertyCategoryLibrary;
import property.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.Root#getLogicalView <em>Logical View</em>}</li>
 *   <li>{@link cs4cbse.Root#getPropetyView <em>Propety View</em>}</li>
 *   <li>{@link cs4cbse.Root#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see cs4cbse.Cs4cbsePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical View</em>' containment reference.
	 * @see #setLogicalView(LogicalView)
	 * @see cs4cbse.Cs4cbsePackage#getRoot_LogicalView()
	 * @model containment="true"
	 * @generated
	 */
	LogicalView getLogicalView();

	/**
	 * Sets the value of the '{@link cs4cbse.Root#getLogicalView <em>Logical View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical View</em>' containment reference.
	 * @see #getLogicalView()
	 * @generated
	 */
	void setLogicalView(LogicalView value);

	/**
	 * Returns the value of the '<em><b>Propety View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propety View</em>' containment reference.
	 * @see #setPropetyView(PropertyView)
	 * @see cs4cbse.Cs4cbsePackage#getRoot_PropetyView()
	 * @model containment="true"
	 * @generated
	 */
	PropertyView getPropetyView();

	/**
	 * Sets the value of the '{@link cs4cbse.Root#getPropetyView <em>Propety View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propety View</em>' containment reference.
	 * @see #getPropetyView()
	 * @generated
	 */
	void setPropetyView(PropertyView value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link cs4cbse.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getRoot_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Root
