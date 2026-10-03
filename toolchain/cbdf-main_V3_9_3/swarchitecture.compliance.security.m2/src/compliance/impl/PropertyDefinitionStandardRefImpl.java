/**
 */
package compliance.impl;

import compliance.CompliancePackage;
import compliance.PropertyDefinitionStandardRef;
import compliance.StandardRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Definition Standard Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compliance.impl.PropertyDefinitionStandardRefImpl#getStandardRef <em>Standard Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyDefinitionStandardRefImpl extends EObjectImpl implements PropertyDefinitionStandardRef {
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
	protected PropertyDefinitionStandardRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompliancePackage.Literals.PROPERTY_DEFINITION_STANDARD_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StandardRef> getStandardRef() {
		if (standardRef == null) {
			standardRef = new EObjectContainmentEList<StandardRef>(StandardRef.class, this, CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF);
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
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF:
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
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF:
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
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF:
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
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF:
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
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF__STANDARD_REF:
				return standardRef != null && !standardRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyDefinitionStandardRefImpl
