/**
 */
package cs4cbse.impl;

import cs4cbse.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cs4cbseFactoryImpl extends EFactoryImpl implements Cs4cbseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cs4cbseFactory init() {
		try {
			Cs4cbseFactory theCs4cbseFactory = (Cs4cbseFactory)EPackage.Registry.INSTANCE.getEFactory(Cs4cbsePackage.eNS_URI);
			if (theCs4cbseFactory != null) {
				return theCs4cbseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cs4cbseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cs4cbseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Cs4cbsePackage.ROOT: return createRoot();
			case Cs4cbsePackage.LOGICAL_VIEW: return createLogicalView();
			case Cs4cbsePackage.PROPERTY_VIEW: return createPropertyView();
			case Cs4cbsePackage.IMPORT: return createImport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalView createLogicalView() {
		LogicalViewImpl logicalView = new LogicalViewImpl();
		return logicalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyView createPropertyView() {
		PropertyViewImpl propertyView = new PropertyViewImpl();
		return propertyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cs4cbsePackage getCs4cbsePackage() {
		return (Cs4cbsePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cs4cbsePackage getPackage() {
		return Cs4cbsePackage.eINSTANCE;
	}

} //Cs4cbseFactoryImpl
