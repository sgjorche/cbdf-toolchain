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

import property.PropertyDefinition;
import property.impl.AtomicPropertyDefinitionImpl;
import property.impl.PropertyDefinitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Control Defintion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compliance.impl.SecurityControlDefintionImpl#getStandardRef <em>Standard Ref</em>}</li>
 *   <li>{@link compliance.impl.SecurityControlDefintionImpl#getEnforce <em>Enforce</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityControlDefintionImpl extends AtomicPropertyDefinitionImpl implements SecurityControlDefintion {
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
	 * The cached value of the '{@link #getEnforce() <em>Enforce</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforce()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> enforce;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityControlDefintionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompliancePackage.Literals.SECURITY_CONTROL_DEFINTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyDefinition> getEnforce() {
		if (enforce == null) {
			enforce = new EObjectResolvingEList<PropertyDefinition>(PropertyDefinition.class, this, CompliancePackage.SECURITY_CONTROL_DEFINTION__ENFORCE);
		}
		return enforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StandardRef> getStandardRef() {
		if (standardRef == null) {
			standardRef = new EObjectContainmentEList<StandardRef>(StandardRef.class, this, CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF);
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
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF:
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
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF:
				return getStandardRef();
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__ENFORCE:
				return getEnforce();
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
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF:
				getStandardRef().clear();
				getStandardRef().addAll((Collection<? extends StandardRef>)newValue);
				return;
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__ENFORCE:
				getEnforce().clear();
				getEnforce().addAll((Collection<? extends PropertyDefinition>)newValue);
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
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF:
				getStandardRef().clear();
				return;
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__ENFORCE:
				getEnforce().clear();
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
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF:
				return standardRef != null && !standardRef.isEmpty();
			case CompliancePackage.SECURITY_CONTROL_DEFINTION__ENFORCE:
				return enforce != null && !enforce.isEmpty();
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
				case CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF: return CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF;
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
				case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF: return CompliancePackage.SECURITY_CONTROL_DEFINTION__STANDARD_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SecurityControlDefintionImpl
