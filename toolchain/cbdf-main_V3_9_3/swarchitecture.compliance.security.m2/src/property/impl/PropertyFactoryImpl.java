/**
 */
package property.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import property.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyFactoryImpl extends EFactoryImpl implements PropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyFactory init() {
		try {
			PropertyFactory thePropertyFactory = (PropertyFactory)EPackage.Registry.INSTANCE.getEFactory(PropertyPackage.eNS_URI);
			if (thePropertyFactory != null) {
				return thePropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFactoryImpl() {
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
			case PropertyPackage.PROPERTY_CATEGORY_LIBRARY: return createPropertyCategoryLibrary();
			case PropertyPackage.PROPERTY_CATEGORY: return createPropertyCategory();
			case PropertyPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
			case PropertyPackage.ATOMIC_PROPERTY_DEFINITION: return createAtomicPropertyDefinition();
			case PropertyPackage.OVERLAY_PROPERTY_DEFINITION: return createOverlayPropertyDefinition();
			case PropertyPackage.OVERLAY_INSTANCE: return createOverlayInstance();
			case PropertyPackage.PROPERTY_DEFINITION_PARAMETER: return createPropertyDefinitionParameter();
			case PropertyPackage.PROPERTY_INSTANCE: return createPropertyInstance();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PropertyPackage.PROPERTY_DEFINITION_PAREMETER_TYPE:
				return createPropertyDefinitionParemeterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PropertyPackage.PROPERTY_DEFINITION_PAREMETER_TYPE:
				return convertPropertyDefinitionParemeterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyCategoryLibrary createPropertyCategoryLibrary() {
		PropertyCategoryLibraryImpl propertyCategoryLibrary = new PropertyCategoryLibraryImpl();
		return propertyCategoryLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyCategory createPropertyCategory() {
		PropertyCategoryImpl propertyCategory = new PropertyCategoryImpl();
		return propertyCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtomicPropertyDefinition createAtomicPropertyDefinition() {
		AtomicPropertyDefinitionImpl atomicPropertyDefinition = new AtomicPropertyDefinitionImpl();
		return atomicPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlayPropertyDefinition createOverlayPropertyDefinition() {
		OverlayPropertyDefinitionImpl overlayPropertyDefinition = new OverlayPropertyDefinitionImpl();
		return overlayPropertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverlayInstance createOverlayInstance() {
		OverlayInstanceImpl overlayInstance = new OverlayInstanceImpl();
		return overlayInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinitionParameter createPropertyDefinitionParameter() {
		PropertyDefinitionParameterImpl propertyDefinitionParameter = new PropertyDefinitionParameterImpl();
		return propertyDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyInstance createPropertyInstance() {
		PropertyInstanceImpl propertyInstance = new PropertyInstanceImpl();
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinitionParemeterType createPropertyDefinitionParemeterTypeFromString(EDataType eDataType, String initialValue) {
		PropertyDefinitionParemeterType result = PropertyDefinitionParemeterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyDefinitionParemeterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyPackage getPropertyPackage() {
		return (PropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PropertyPackage getPackage() {
		return PropertyPackage.eINSTANCE;
	}

} //PropertyFactoryImpl
