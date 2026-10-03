/**
 */
package cs4cbse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import property.PropertyCategoryLibrary;
import property.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propety View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.PropetyView#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link cs4cbse.PropetyView#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see cs4cbse.Cs4cbsePackage#getPropetyView()
 * @model
 * @generated
 */
public interface PropetyView extends EObject {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link property.PropertyCategoryLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropetyView_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyCategoryLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link property.PropertyInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see cs4cbse.Cs4cbsePackage#getPropetyView_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyInstance> getProperties();

} // PropetyView
