/**
 */
package property.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import property.OverlayInstance;
import property.PropertyDefinition;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overlay Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link property.impl.OverlayInstanceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link property.impl.OverlayInstanceImpl#getPropertyDefinition <em>Property Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverlayInstanceImpl extends EObjectImpl implements OverlayInstance {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The cached value of the '{@link #getPropertyDefinition() <em>Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDefinition()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefinition propertyDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverlayInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.OVERLAY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, PropertyPackage.OVERLAY_INSTANCE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition getPropertyDefinition() {
		if (propertyDefinition != null && propertyDefinition.eIsProxy()) {
			InternalEObject oldPropertyDefinition = (InternalEObject)propertyDefinition;
			propertyDefinition = (PropertyDefinition)eResolveProxy(oldPropertyDefinition);
			if (propertyDefinition != oldPropertyDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
			}
		}
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition basicGetPropertyDefinition() {
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyDefinition(PropertyDefinition newPropertyDefinition) {
		PropertyDefinition oldPropertyDefinition = propertyDefinition;
		propertyDefinition = newPropertyDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertyPackage.OVERLAY_INSTANCE__PARAMETERS:
				return getParameters();
			case PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION:
				if (resolve) return getPropertyDefinition();
				return basicGetPropertyDefinition();
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
			case PropertyPackage.OVERLAY_INSTANCE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION:
				setPropertyDefinition((PropertyDefinition)newValue);
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
			case PropertyPackage.OVERLAY_INSTANCE__PARAMETERS:
				getParameters().clear();
				return;
			case PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION:
				setPropertyDefinition((PropertyDefinition)null);
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
			case PropertyPackage.OVERLAY_INSTANCE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PropertyPackage.OVERLAY_INSTANCE__PROPERTY_DEFINITION:
				return propertyDefinition != null;
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //OverlayInstanceImpl
