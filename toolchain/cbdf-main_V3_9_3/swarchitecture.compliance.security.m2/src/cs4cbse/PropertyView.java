/**
 */
package cs4cbse;

import compliance.ComplianceInstance;
import compliance.OverlayComplianceInstance;
import compliance.SecurityControlInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import property.PropertyCategoryLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.PropertyView#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link cs4cbse.PropertyView#getComplianceProperties <em>Compliance Properties</em>}</li>
 *   <li>{@link cs4cbse.PropertyView#getOverlayComplianceProperties <em>Overlay Compliance Properties</em>}</li>
 *   <li>{@link cs4cbse.PropertyView#getSecurityControlProperties <em>Security Control Properties</em>}</li>
 * </ul>
 *
 * @see cs4cbse.Cs4cbsePackage#getPropertyView()
 * @model
 * @generated
 */
public interface PropertyView extends EObject {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link property.PropertyCategoryLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropertyView_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyCategoryLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Compliance Properties</b></em>' containment reference list.
	 * The list contents are of type {@link compliance.ComplianceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Properties</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropertyView_ComplianceProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplianceInstance> getComplianceProperties();

	/**
	 * Returns the value of the '<em><b>Overlay Compliance Properties</b></em>' containment reference list.
	 * The list contents are of type {@link compliance.OverlayComplianceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Compliance Properties</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropertyView_OverlayComplianceProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverlayComplianceInstance> getOverlayComplianceProperties();

	/**
	 * Returns the value of the '<em><b>Security Control Properties</b></em>' containment reference list.
	 * The list contents are of type {@link compliance.SecurityControlInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Control Properties</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropertyView_SecurityControlProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityControlInstance> getSecurityControlProperties();

} // PropertyView
