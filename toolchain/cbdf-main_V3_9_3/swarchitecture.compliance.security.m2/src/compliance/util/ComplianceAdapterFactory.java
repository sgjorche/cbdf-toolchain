/**
 */
package compliance.util;

import compliance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import property.AtomicPropertyDefinition;
import property.OverlayPropertyDefinition;
import property.PropertyDefinition;
import property.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see compliance.CompliancePackage
 * @generated
 */
public class ComplianceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompliancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CompliancePackage.eINSTANCE;
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
	protected ComplianceSwitch<Adapter> modelSwitch =
		new ComplianceSwitch<Adapter>() {
			@Override
			public Adapter caseComplianceDefinition(ComplianceDefinition object) {
				return createComplianceDefinitionAdapter();
			}
			@Override
			public Adapter caseOverlayComplianceDefintion(OverlayComplianceDefintion object) {
				return createOverlayComplianceDefintionAdapter();
			}
			@Override
			public Adapter caseOverlayComplianceInstance(OverlayComplianceInstance object) {
				return createOverlayComplianceInstanceAdapter();
			}
			@Override
			public Adapter caseComplianceInstance(ComplianceInstance object) {
				return createComplianceInstanceAdapter();
			}
			@Override
			public Adapter caseSecurityControlDefintion(SecurityControlDefintion object) {
				return createSecurityControlDefintionAdapter();
			}
			@Override
			public Adapter caseSecurityControlInstance(SecurityControlInstance object) {
				return createSecurityControlInstanceAdapter();
			}
			@Override
			public Adapter casePropertyDefinitionStandardRef(PropertyDefinitionStandardRef object) {
				return createPropertyDefinitionStandardRefAdapter();
			}
			@Override
			public Adapter caseStandardRef(StandardRef object) {
				return createStandardRefAdapter();
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
	 * Creates a new adapter for an object of class '{@link compliance.ComplianceDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.ComplianceDefinition
	 * @generated
	 */
	public Adapter createComplianceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.OverlayComplianceDefintion <em>Overlay Compliance Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.OverlayComplianceDefintion
	 * @generated
	 */
	public Adapter createOverlayComplianceDefintionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.OverlayComplianceInstance <em>Overlay Compliance Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.OverlayComplianceInstance
	 * @generated
	 */
	public Adapter createOverlayComplianceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.ComplianceInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.ComplianceInstance
	 * @generated
	 */
	public Adapter createComplianceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.SecurityControlDefintion <em>Security Control Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.SecurityControlDefintion
	 * @generated
	 */
	public Adapter createSecurityControlDefintionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.SecurityControlInstance <em>Security Control Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.SecurityControlInstance
	 * @generated
	 */
	public Adapter createSecurityControlInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.PropertyDefinitionStandardRef <em>Property Definition Standard Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.PropertyDefinitionStandardRef
	 * @generated
	 */
	public Adapter createPropertyDefinitionStandardRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compliance.StandardRef <em>Standard Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compliance.StandardRef
	 * @generated
	 */
	public Adapter createStandardRefAdapter() {
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

} //ComplianceAdapterFactory
