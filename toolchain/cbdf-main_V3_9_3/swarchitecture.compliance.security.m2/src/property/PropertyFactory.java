/**
 */
package property;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see property.PropertyPackage
 * @generated
 */
public interface PropertyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertyFactory eINSTANCE = property.impl.PropertyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Category Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Library</em>'.
	 * @generated
	 */
	PropertyCategoryLibrary createPropertyCategoryLibrary();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	PropertyCategory createPropertyCategory();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	PropertyDefinition createPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Atomic Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Property Definition</em>'.
	 * @generated
	 */
	AtomicPropertyDefinition createAtomicPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Overlay Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlay Property Definition</em>'.
	 * @generated
	 */
	OverlayPropertyDefinition createOverlayPropertyDefinition();

	/**
	 * Returns a new object of class '<em>Overlay Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlay Instance</em>'.
	 * @generated
	 */
	OverlayInstance createOverlayInstance();

	/**
	 * Returns a new object of class '<em>Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Parameter</em>'.
	 * @generated
	 */
	PropertyDefinitionParameter createPropertyDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	PropertyInstance createPropertyInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PropertyPackage getPropertyPackage();

} //PropertyFactory
