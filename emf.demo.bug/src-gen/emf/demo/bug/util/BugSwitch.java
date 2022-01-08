/**
 */
package emf.demo.bug.util;

import emf.demo.bug.BugPackage;
import emf.demo.bug.Component;
import emf.demo.bug.ComponentProxy;
import emf.demo.bug.ElementContainarable;
import emf.demo.bug.IconChangeableInterface;
import emf.demo.bug.Model;
import emf.demo.bug.NameableInterface;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see emf.demo.bug.BugPackage
 * @generated
 */
public class BugSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BugPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BugSwitch() {
		if (modelPackage == null) {
			modelPackage = BugPackage.eINSTANCE;
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
		case BugPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseElementContainarable(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.PACKAGE: {
			emf.demo.bug.Package package_ = (emf.demo.bug.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseNameableInterface(package_);
			if (result == null)
				result = caseElementContainarable(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseNameableInterface(component);
			if (result == null)
				result = caseIconChangeableInterface(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.ICON_CHANGEABLE_INTERFACE: {
			IconChangeableInterface iconChangeableInterface = (IconChangeableInterface) theEObject;
			T result = caseIconChangeableInterface(iconChangeableInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.COMPONENT_PROXY: {
			ComponentProxy componentProxy = (ComponentProxy) theEObject;
			T result = caseComponentProxy(componentProxy);
			if (result == null)
				result = caseNameableInterface(componentProxy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.NAMEABLE_INTERFACE: {
			NameableInterface nameableInterface = (NameableInterface) theEObject;
			T result = caseNameableInterface(nameableInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BugPackage.ELEMENT_CONTAINARABLE: {
			ElementContainarable elementContainarable = (ElementContainarable) theEObject;
			T result = caseElementContainarable(elementContainarable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(emf.demo.bug.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Changeable Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Changeable Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconChangeableInterface(IconChangeableInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProxy(ComponentProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameableInterface(NameableInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Containarable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Containarable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementContainarable(ElementContainarable object) {
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

} //BugSwitch
