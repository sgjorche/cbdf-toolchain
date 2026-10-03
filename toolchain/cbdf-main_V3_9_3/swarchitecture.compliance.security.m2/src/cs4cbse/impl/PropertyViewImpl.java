/**
 */
package cs4cbse.impl;

import compliance.ComplianceInstance;
import compliance.OverlayComplianceInstance;
import compliance.SecurityControlInstance;

import cs4cbse.Cs4cbsePackage;
import cs4cbse.PropertyView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import property.PropertyCategoryLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.impl.PropertyViewImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link cs4cbse.impl.PropertyViewImpl#getComplianceProperties <em>Compliance Properties</em>}</li>
 *   <li>{@link cs4cbse.impl.PropertyViewImpl#getOverlayComplianceProperties <em>Overlay Compliance Properties</em>}</li>
 *   <li>{@link cs4cbse.impl.PropertyViewImpl#getSecurityControlProperties <em>Security Control Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyViewImpl extends EObjectImpl implements PropertyView {
	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyCategoryLibrary> libraries;

	/**
	 * The cached value of the '{@link #getComplianceProperties() <em>Compliance Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplianceInstance> complianceProperties;

	/**
	 * The cached value of the '{@link #getOverlayComplianceProperties() <em>Overlay Compliance Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlayComplianceProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<OverlayComplianceInstance> overlayComplianceProperties;

	/**
	 * The cached value of the '{@link #getSecurityControlProperties() <em>Security Control Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityControlProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControlInstance> securityControlProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cs4cbsePackage.Literals.PROPERTY_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyCategoryLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<PropertyCategoryLibrary>(PropertyCategoryLibrary.class, this, Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplianceInstance> getComplianceProperties() {
		if (complianceProperties == null) {
			complianceProperties = new EObjectContainmentEList<ComplianceInstance>(ComplianceInstance.class, this, Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES);
		}
		return complianceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverlayComplianceInstance> getOverlayComplianceProperties() {
		if (overlayComplianceProperties == null) {
			overlayComplianceProperties = new EObjectContainmentEList<OverlayComplianceInstance>(OverlayComplianceInstance.class, this, Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES);
		}
		return overlayComplianceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityControlInstance> getSecurityControlProperties() {
		if (securityControlProperties == null) {
			securityControlProperties = new EObjectContainmentEList<SecurityControlInstance>(SecurityControlInstance.class, this, Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES);
		}
		return securityControlProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES:
				return ((InternalEList<?>)getComplianceProperties()).basicRemove(otherEnd, msgs);
			case Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES:
				return ((InternalEList<?>)getOverlayComplianceProperties()).basicRemove(otherEnd, msgs);
			case Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES:
				return ((InternalEList<?>)getSecurityControlProperties()).basicRemove(otherEnd, msgs);
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
			case Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES:
				return getLibraries();
			case Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES:
				return getComplianceProperties();
			case Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES:
				return getOverlayComplianceProperties();
			case Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES:
				return getSecurityControlProperties();
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
			case Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends PropertyCategoryLibrary>)newValue);
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES:
				getComplianceProperties().clear();
				getComplianceProperties().addAll((Collection<? extends ComplianceInstance>)newValue);
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES:
				getOverlayComplianceProperties().clear();
				getOverlayComplianceProperties().addAll((Collection<? extends OverlayComplianceInstance>)newValue);
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES:
				getSecurityControlProperties().clear();
				getSecurityControlProperties().addAll((Collection<? extends SecurityControlInstance>)newValue);
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
			case Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES:
				getLibraries().clear();
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES:
				getComplianceProperties().clear();
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES:
				getOverlayComplianceProperties().clear();
				return;
			case Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES:
				getSecurityControlProperties().clear();
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
			case Cs4cbsePackage.PROPERTY_VIEW__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case Cs4cbsePackage.PROPERTY_VIEW__COMPLIANCE_PROPERTIES:
				return complianceProperties != null && !complianceProperties.isEmpty();
			case Cs4cbsePackage.PROPERTY_VIEW__OVERLAY_COMPLIANCE_PROPERTIES:
				return overlayComplianceProperties != null && !overlayComplianceProperties.isEmpty();
			case Cs4cbsePackage.PROPERTY_VIEW__SECURITY_CONTROL_PROPERTIES:
				return securityControlProperties != null && !securityControlProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyViewImpl
