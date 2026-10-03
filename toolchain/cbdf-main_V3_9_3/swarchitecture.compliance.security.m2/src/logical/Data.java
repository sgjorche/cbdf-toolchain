/**
 */
package logical;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logical.Data#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see logical.LogicalPackage#getData()
 * @model
 * @generated
 */
public interface Data extends InteractionNature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DataType)
	 * @see logical.LogicalPackage#getData_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link logical.Data#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Data
