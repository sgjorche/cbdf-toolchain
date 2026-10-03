/**
 */
package compliance.impl;

import compliance.ComplianceDefinition;
import compliance.CompliancePackage;
import compliance.PropertyDefinitionStandardRef;
import compliance.SecurityControlDefintion;

import compliance.StandardRef;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import property.impl.AtomicPropertyDefinitionImpl;
import property.impl.PropertyDefinitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compliance.impl.ComplianceDefinitionImpl#getStandardRef <em>Standard Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceDefinitionImpl extends AtomicPropertyDefinitionImpl implements ComplianceDefinition {
	/**
	 * The cached value of the '{@link #getStandardRef() <em>Standard Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRef()
	 * @generated
	 * @ordered
	 */
	protected EList<StandardRef> standardRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompliancePackage.Literals.COMPLIANCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StandardRef> getStandardRef() {
		if (standardRef == null) {
			standardRef = new EObjectContainmentEList<StandardRef>(StandardRef.class, this, CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF);
		}
		return standardRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF:
				return ((InternalEList<?>)getStandardRef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF:
				return getStandardRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF:
				getStandardRef().clear();
				getStandardRef().addAll((Collection<? extends StandardRef>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF:
				getStandardRef().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF:
				return standardRef != null && !standardRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyDefinitionStandardRef.class) {
			switch (derivedFeatureID) {
				case CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF: return CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyDefinitionStandardRef.class) {
			switch (baseFeatureID) {
				case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF: return CompliancePackage.COMPLIANCE_DEFINITION__STANDARD_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComplianceDefinitionImpl
