/**
 */
package compliance.util;

import compliance.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import property.AtomicPropertyDefinition;
import property.OverlayPropertyDefinition;
import property.PropertyDefinition;
import property.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see compliance.CompliancePackage
 * @generated
 */
public class ComplianceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompliancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceSwitch() {
		if (modelPackage == null) {
			modelPackage = CompliancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CompliancePackage.COMPLIANCE_DEFINITION: {
				ComplianceDefinition complianceDefinition = (ComplianceDefinition)theEObject;
				T result = caseComplianceDefinition(complianceDefinition);
				if (result == null) result = caseAtomicPropertyDefinition(complianceDefinition);
				if (result == null) result = casePropertyDefinitionStandardRef(complianceDefinition);
				if (result == null) result = casePropertyDefinition(complianceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.OVERLAY_COMPLIANCE_DEFINTION: {
				OverlayComplianceDefintion overlayComplianceDefintion = (OverlayComplianceDefintion)theEObject;
				T result = caseOverlayComplianceDefintion(overlayComplianceDefintion);
				if (result == null) result = caseOverlayPropertyDefinition(overlayComplianceDefintion);
				if (result == null) result = casePropertyDefinition(overlayComplianceDefintion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.OVERLAY_COMPLIANCE_INSTANCE: {
				OverlayComplianceInstance overlayComplianceInstance = (OverlayComplianceInstance)theEObject;
				T result = caseOverlayComplianceInstance(overlayComplianceInstance);
				if (result == null) result = casePropertyInstance(overlayComplianceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.COMPLIANCE_INSTANCE: {
				ComplianceInstance complianceInstance = (ComplianceInstance)theEObject;
				T result = caseComplianceInstance(complianceInstance);
				if (result == null) result = casePropertyInstance(complianceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.SECURITY_CONTROL_DEFINTION: {
				SecurityControlDefintion securityControlDefintion = (SecurityControlDefintion)theEObject;
				T result = caseSecurityControlDefintion(securityControlDefintion);
				if (result == null) result = caseAtomicPropertyDefinition(securityControlDefintion);
				if (result == null) result = casePropertyDefinitionStandardRef(securityControlDefintion);
				if (result == null) result = casePropertyDefinition(securityControlDefintion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.SECURITY_CONTROL_INSTANCE: {
				SecurityControlInstance securityControlInstance = (SecurityControlInstance)theEObject;
				T result = caseSecurityControlInstance(securityControlInstance);
				if (result == null) result = casePropertyInstance(securityControlInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.PROPERTY_DEFINITION_STANDARD_REF: {
				PropertyDefinitionStandardRef propertyDefinitionStandardRef = (PropertyDefinitionStandardRef)theEObject;
				T result = casePropertyDefinitionStandardRef(propertyDefinitionStandardRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompliancePackage.STANDARD_REF: {
				StandardRef standardRef = (StandardRef)theEObject;
				T result = caseStandardRef(standardRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceDefinition(ComplianceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay Compliance Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay Compliance Defintion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlayComplianceDefintion(OverlayComplianceDefintion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay Compliance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay Compliance Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlayComplianceInstance(OverlayComplianceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceInstance(ComplianceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Control Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Control Defintion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControlDefintion(SecurityControlDefintion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Control Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Control Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControlInstance(SecurityControlInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Definition Standard Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definition Standard Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinitionStandardRef(PropertyDefinitionStandardRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardRef(StandardRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinition(PropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicPropertyDefinition(AtomicPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlayPropertyDefinition(OverlayPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInstance(PropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComplianceSwitch
