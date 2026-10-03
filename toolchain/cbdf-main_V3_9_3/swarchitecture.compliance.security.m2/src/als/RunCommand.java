/**
 */
package als;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link als.RunCommand#getRunName <em>Run Name</em>}</li>
 *   <li>{@link als.RunCommand#getName <em>Name</em>}</li>
 *   <li>{@link als.RunCommand#getBlock <em>Block</em>}</li>
 *   <li>{@link als.RunCommand#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see als.AlsPackage#getRunCommand()
 * @model
 * @generated
 */
public interface RunCommand extends Paragraph {
	/**
	 * Returns the value of the '<em><b>Run Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Name</em>' containment reference.
	 * @see #setRunName(Alias)
	 * @see als.AlsPackage#getRunCommand_RunName()
	 * @model containment="true"
	 * @generated
	 */
	Alias getRunName();

	/**
	 * Sets the value of the '{@link als.RunCommand#getRunName <em>Run Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Name</em>' containment reference.
	 * @see #getRunName()
	 * @generated
	 */
	void setRunName(Alias value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(PredicateName)
	 * @see als.AlsPackage#getRunCommand_Name()
	 * @model
	 * @generated
	 */
	PredicateName getName();

	/**
	 * Sets the value of the '{@link als.RunCommand#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(PredicateName value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see als.AlsPackage#getRunCommand_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link als.RunCommand#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see als.AlsPackage#getRunCommand_Scope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link als.RunCommand#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // RunCommand
