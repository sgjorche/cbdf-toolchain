/**
 */
package property;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Definition Paremeter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see property.PropertyPackage#getPropertyDefinitionParemeterType()
 * @model
 * @generated
 */
public enum PropertyDefinitionParemeterType implements Enumerator {
	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(0, "Component", "Component"),

	/**
	 * The '<em><b>Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_VALUE
	 * @generated
	 * @ordered
	 */
	PORT(1, "Port", "Port"),

	/**
	 * The '<em><b>Connector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR(2, "Connector", "Connector");

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT
	 * @model name="Port"
	 * @generated
	 * @ordered
	 */
	public static final int PORT_VALUE = 1;

	/**
	 * The '<em><b>Connector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR
	 * @model name="Connector"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Definition Paremeter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyDefinitionParemeterType[] VALUES_ARRAY =
		new PropertyDefinitionParemeterType[] {
			COMPONENT,
			PORT,
			CONNECTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Definition Paremeter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyDefinitionParemeterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Definition Paremeter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyDefinitionParemeterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyDefinitionParemeterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Definition Paremeter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyDefinitionParemeterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyDefinitionParemeterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Definition Paremeter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyDefinitionParemeterType get(int value) {
		switch (value) {
			case COMPONENT_VALUE: return COMPONENT;
			case PORT_VALUE: return PORT;
			case CONNECTOR_VALUE: return CONNECTOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyDefinitionParemeterType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PropertyDefinitionParemeterType
