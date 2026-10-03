/**
 */
package logical;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logical.LogicalFactory
 * @model kind="package"
 * @generated
 */
public interface LogicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "swarchitecture.compliance.security.logical";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalPackage eINSTANCE = logical.impl.LogicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link logical.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.ComponentImpl
	 * @see logical.impl.LogicalPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__USES = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link logical.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.ConnectorImpl
	 * @see logical.impl.LogicalPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTS = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link logical.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.PortImpl
	 * @see logical.impl.LogicalPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REALIZES = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__KIND = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link logical.impl.InteractionNatureImpl <em>Interaction Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.InteractionNatureImpl
	 * @see logical.impl.LogicalPackageImpl#getInteractionNature()
	 * @generated
	 */
	int INTERACTION_NATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interaction Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link logical.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.DataImpl
	 * @see logical.impl.LogicalPackageImpl#getData()
	 * @generated
	 */
	int DATA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = INTERACTION_NATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = INTERACTION_NATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = INTERACTION_NATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link logical.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.impl.DataTypeImpl
	 * @see logical.impl.LogicalPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link logical.Portkind <em>Portkind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logical.Portkind
	 * @see logical.impl.LogicalPackageImpl#getPortkind()
	 * @generated
	 */
	int PORTKIND = 6;


	/**
	 * Returns the meta object for class '{@link logical.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see logical.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link logical.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logical.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link logical.Component#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see logical.Component#getUses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Uses();

	/**
	 * Returns the meta object for the reference '{@link logical.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see logical.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for class '{@link logical.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see logical.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link logical.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logical.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the reference list '{@link logical.Connector#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connects</em>'.
	 * @see logical.Connector#getConnects()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Connects();

	/**
	 * Returns the meta object for class '{@link logical.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see logical.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link logical.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logical.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the reference list '{@link logical.Port#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see logical.Port#getRealizes()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link logical.Port#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see logical.Port#getKind()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Kind();

	/**
	 * Returns the meta object for class '{@link logical.InteractionNature <em>Interaction Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Nature</em>'.
	 * @see logical.InteractionNature
	 * @generated
	 */
	EClass getInteractionNature();

	/**
	 * Returns the meta object for the attribute '{@link logical.InteractionNature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logical.InteractionNature#getName()
	 * @see #getInteractionNature()
	 * @generated
	 */
	EAttribute getInteractionNature_Name();

	/**
	 * Returns the meta object for class '{@link logical.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see logical.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference '{@link logical.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see logical.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Type();

	/**
	 * Returns the meta object for class '{@link logical.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see logical.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link logical.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logical.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for enum '{@link logical.Portkind <em>Portkind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Portkind</em>'.
	 * @see logical.Portkind
	 * @generated
	 */
	EEnum getPortkind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicalFactory getLogicalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logical.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.ComponentImpl
		 * @see logical.impl.LogicalPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__USES = eINSTANCE.getComponent_Uses();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

		/**
		 * The meta object literal for the '{@link logical.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.ConnectorImpl
		 * @see logical.impl.LogicalPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Connects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTS = eINSTANCE.getConnector_Connects();

		/**
		 * The meta object literal for the '{@link logical.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.PortImpl
		 * @see logical.impl.LogicalPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REALIZES = eINSTANCE.getPort_Realizes();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__KIND = eINSTANCE.getPort_Kind();

		/**
		 * The meta object literal for the '{@link logical.impl.InteractionNatureImpl <em>Interaction Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.InteractionNatureImpl
		 * @see logical.impl.LogicalPackageImpl#getInteractionNature()
		 * @generated
		 */
		EClass INTERACTION_NATURE = eINSTANCE.getInteractionNature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_NATURE__NAME = eINSTANCE.getInteractionNature_Name();

		/**
		 * The meta object literal for the '{@link logical.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.DataImpl
		 * @see logical.impl.LogicalPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '{@link logical.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.impl.DataTypeImpl
		 * @see logical.impl.LogicalPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link logical.Portkind <em>Portkind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logical.Portkind
		 * @see logical.impl.LogicalPackageImpl#getPortkind()
		 * @generated
		 */
		EEnum PORTKIND = eINSTANCE.getPortkind();

	}

} //LogicalPackage
