/**
 */
package cs4cbse.impl;

import cs4cbse.Cs4cbsePackage;
import cs4cbse.Import;
import cs4cbse.LogicalView;
import cs4cbse.PropertyView;
import cs4cbse.PropetyView;
import cs4cbse.Root;

import java.util.Collection;

import logical.Component;
import logical.Connector;
import logical.InteractionNature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import property.PropertyCategoryLibrary;
import property.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.impl.RootImpl#getLogicalView <em>Logical View</em>}</li>
 *   <li>{@link cs4cbse.impl.RootImpl#getPropetyView <em>Propety View</em>}</li>
 *   <li>{@link cs4cbse.impl.RootImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root {
	/**
	 * The cached value of the '{@link #getLogicalView() <em>Logical View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalView()
	 * @generated
	 * @ordered
	 */
	protected LogicalView logicalView;

	/**
	 * The cached value of the '{@link #getPropetyView() <em>Propety View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropetyView()
	 * @generated
	 * @ordered
	 */
	protected PropertyView propetyView;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cs4cbsePackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalView getLogicalView() {
		return logicalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalView(LogicalView newLogicalView, NotificationChain msgs) {
		LogicalView oldLogicalView = logicalView;
		logicalView = newLogicalView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs4cbsePackage.ROOT__LOGICAL_VIEW, oldLogicalView, newLogicalView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalView(LogicalView newLogicalView) {
		if (newLogicalView != logicalView) {
			NotificationChain msgs = null;
			if (logicalView != null)
				msgs = ((InternalEObject)logicalView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs4cbsePackage.ROOT__LOGICAL_VIEW, null, msgs);
			if (newLogicalView != null)
				msgs = ((InternalEObject)newLogicalView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs4cbsePackage.ROOT__LOGICAL_VIEW, null, msgs);
			msgs = basicSetLogicalView(newLogicalView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cs4cbsePackage.ROOT__LOGICAL_VIEW, newLogicalView, newLogicalView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyView getPropetyView() {
		return propetyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropetyView(PropertyView newPropetyView, NotificationChain msgs) {
		PropertyView oldPropetyView = propetyView;
		propetyView = newPropetyView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cs4cbsePackage.ROOT__PROPETY_VIEW, oldPropetyView, newPropetyView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropetyView(PropertyView newPropetyView) {
		if (newPropetyView != propetyView) {
			NotificationChain msgs = null;
			if (propetyView != null)
				msgs = ((InternalEObject)propetyView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cs4cbsePackage.ROOT__PROPETY_VIEW, null, msgs);
			if (newPropetyView != null)
				msgs = ((InternalEObject)newPropetyView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cs4cbsePackage.ROOT__PROPETY_VIEW, null, msgs);
			msgs = basicSetPropetyView(newPropetyView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cs4cbsePackage.ROOT__PROPETY_VIEW, newPropetyView, newPropetyView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, Cs4cbsePackage.ROOT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cs4cbsePackage.ROOT__LOGICAL_VIEW:
				return basicSetLogicalView(null, msgs);
			case Cs4cbsePackage.ROOT__PROPETY_VIEW:
				return basicSetPropetyView(null, msgs);
			case Cs4cbsePackage.ROOT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case Cs4cbsePackage.ROOT__LOGICAL_VIEW:
				return getLogicalView();
			case Cs4cbsePackage.ROOT__PROPETY_VIEW:
				return getPropetyView();
			case Cs4cbsePackage.ROOT__IMPORTS:
				return getImports();
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
			case Cs4cbsePackage.ROOT__LOGICAL_VIEW:
				setLogicalView((LogicalView)newValue);
				return;
			case Cs4cbsePackage.ROOT__PROPETY_VIEW:
				setPropetyView((PropertyView)newValue);
				return;
			case Cs4cbsePackage.ROOT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case Cs4cbsePackage.ROOT__LOGICAL_VIEW:
				setLogicalView((LogicalView)null);
				return;
			case Cs4cbsePackage.ROOT__PROPETY_VIEW:
				setPropetyView((PropertyView)null);
				return;
			case Cs4cbsePackage.ROOT__IMPORTS:
				getImports().clear();
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
			case Cs4cbsePackage.ROOT__LOGICAL_VIEW:
				return logicalView != null;
			case Cs4cbsePackage.ROOT__PROPETY_VIEW:
				return propetyView != null;
			case Cs4cbsePackage.ROOT__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
