/**
 */
package property.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import property.AtomicPropertyDefinition;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link property.impl.AtomicPropertyDefinitionImpl#getAlloy <em>Alloy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicPropertyDefinitionImpl extends PropertyDefinitionImpl implements AtomicPropertyDefinition {
	/**
	 * The default value of the '{@link #getAlloy() <em>Alloy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlloy()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlloy() <em>Alloy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlloy()
	 * @generated
	 * @ordered
	 */
	protected String alloy = ALLOY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicPropertyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.ATOMIC_PROPERTY_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlloy() {
		return alloy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlloy(String newAlloy) {
		String oldAlloy = alloy;
		alloy = newAlloy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY, oldAlloy, alloy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY:
				return getAlloy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY:
				setAlloy((String)newValue);
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
			case PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY:
				setAlloy(ALLOY_EDEFAULT);
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
			case PropertyPackage.ATOMIC_PROPERTY_DEFINITION__ALLOY:
				return ALLOY_EDEFAULT == null ? alloy != null : !ALLOY_EDEFAULT.equals(alloy);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (alloy: ");
		result.append(alloy);
		result.append(')');
		return result.toString();
	}

} //AtomicPropertyDefinitionImpl
