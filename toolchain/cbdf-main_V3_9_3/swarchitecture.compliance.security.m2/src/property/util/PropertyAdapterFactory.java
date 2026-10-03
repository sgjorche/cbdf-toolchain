/**
 */
package property.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import property.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see property.PropertyPackage
 * @generated
 */
public class PropertyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PropertyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PropertyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySwitch<Adapter> modelSwitch =
		new PropertySwitch<Adapter>() {
			@Override
			public Adapter casePropertyCategoryLibrary(PropertyCategoryLibrary object) {
				return createPropertyCategoryLibraryAdapter();
			}
			@Override
			public Adapter casePropertyCategory(PropertyCategory object) {
				return createPropertyCategoryAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseAtomicPropertyDefinition(AtomicPropertyDefinition object) {
				return createAtomicPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseOverlayPropertyDefinition(OverlayPropertyDefinition object) {
				return createOverlayPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseOverlayInstance(OverlayInstance object) {
				return createOverlayInstanceAdapter();
			}
			@Override
			public Adapter casePropertyDefinitionParameter(PropertyDefinitionParameter object) {
				return createPropertyDefinitionParameterAdapter();
			}
			@Override
			public Adapter casePropertyInstance(PropertyInstance object) {
				return createPropertyInstanceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link property.PropertyCategoryLibrary <em>Category Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.PropertyCategoryLibrary
	 * @generated
	 */
	public Adapter createPropertyCategoryLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.PropertyCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.PropertyCategory
	 * @generated
	 */
	public Adapter createPropertyCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.PropertyDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.AtomicPropertyDefinition <em>Atomic Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.AtomicPropertyDefinition
	 * @generated
	 */
	public Adapter createAtomicPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OverlayPropertyDefinition <em>Overlay Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OverlayPropertyDefinition
	 * @generated
	 */
	public Adapter createOverlayPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.OverlayInstance <em>Overlay Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.OverlayInstance
	 * @generated
	 */
	public Adapter createOverlayInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.PropertyDefinitionParameter <em>Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.PropertyDefinitionParameter
	 * @generated
	 */
	public Adapter createPropertyDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link property.PropertyInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see property.PropertyInstance
	 * @generated
	 */
	public Adapter createPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PropertyAdapterFactory
