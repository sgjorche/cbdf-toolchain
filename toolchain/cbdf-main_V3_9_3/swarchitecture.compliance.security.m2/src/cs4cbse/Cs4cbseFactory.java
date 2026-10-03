/**
 */
package cs4cbse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cs4cbse.Cs4cbsePackage
 * @generated
 */
public interface Cs4cbseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cs4cbseFactory eINSTANCE = cs4cbse.impl.Cs4cbseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Logical View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical View</em>'.
	 * @generated
	 */
	LogicalView createLogicalView();

	/**
	 * Returns a new object of class '<em>Property View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property View</em>'.
	 * @generated
	 */
	PropertyView createPropertyView();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cs4cbsePackage getCs4cbsePackage();

} //Cs4cbseFactory
