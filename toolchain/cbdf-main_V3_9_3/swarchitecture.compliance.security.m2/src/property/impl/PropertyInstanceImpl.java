/**
 */
package property.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import property.PropertyDefinition;
import property.PropertyInstance;
import property.PropertyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link property.impl.PropertyInstanceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link property.impl.PropertyInstanceImpl#getPropertyDefinition <em>Property Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyInstanceImpl extends EObjectImpl implements PropertyInstance {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> parameters;

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
	protected PropertyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.PROPERTY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<EObject>(EObject.class, this, PropertyPackage.PROPERTY_INSTANCE__PARAMETERS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION, oldPropertyDefinition, propertyDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertyPackage.PROPERTY_INSTANCE__PARAMETERS:
				return getParameters();
			case PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION:
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
			case PropertyPackage.PROPERTY_INSTANCE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends EObject>)newValue);
				return;
			case PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION:
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
			case PropertyPackage.PROPERTY_INSTANCE__PARAMETERS:
				getParameters().clear();
				return;
			case PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION:
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
			case PropertyPackage.PROPERTY_INSTANCE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PropertyPackage.PROPERTY_INSTANCE__PROPERTY_DEFINITION:
				return propertyDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyInstanceImpl
