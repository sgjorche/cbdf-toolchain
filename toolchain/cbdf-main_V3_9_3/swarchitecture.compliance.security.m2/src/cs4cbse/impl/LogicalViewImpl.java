/**
 */
package cs4cbse.impl;

import cs4cbse.Cs4cbsePackage;
import cs4cbse.LogicalView;

import java.util.Collection;

import logical.Component;
import logical.Connector;
import logical.InteractionNature;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs4cbse.impl.LogicalViewImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link cs4cbse.impl.LogicalViewImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link cs4cbse.impl.LogicalViewImpl#getInteractionNatures <em>Interaction Natures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalViewImpl extends EObjectImpl implements LogicalView {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getInteractionNatures() <em>Interaction Natures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionNatures()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionNature> interactionNatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cs4cbsePackage.Literals.LOGICAL_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InteractionNature> getInteractionNatures() {
		if (interactionNatures == null) {
			interactionNatures = new EObjectContainmentEList<InteractionNature>(InteractionNature.class, this, Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES);
		}
		return interactionNatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES:
				return ((InternalEList<?>)getInteractionNatures()).basicRemove(otherEnd, msgs);
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
			case Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS:
				return getComponents();
			case Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS:
				return getConnectors();
			case Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES:
				return getInteractionNatures();
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
			case Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES:
				getInteractionNatures().clear();
				getInteractionNatures().addAll((Collection<? extends InteractionNature>)newValue);
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
			case Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS:
				getComponents().clear();
				return;
			case Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS:
				getConnectors().clear();
				return;
			case Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES:
				getInteractionNatures().clear();
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
			case Cs4cbsePackage.LOGICAL_VIEW__COMPONENTS:
				return components != null && !components.isEmpty();
			case Cs4cbsePackage.LOGICAL_VIEW__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case Cs4cbsePackage.LOGICAL_VIEW__INTERACTION_NATURES:
				return interactionNatures != null && !interactionNatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalViewImpl
