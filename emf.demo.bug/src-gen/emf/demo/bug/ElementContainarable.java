/**
 */
package emf.demo.bug;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Containarable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.demo.bug.ElementContainarable#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see emf.demo.bug.BugPackage#getElementContainarable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementContainarable extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link emf.demo.bug.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see emf.demo.bug.BugPackage#getElementContainarable_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getElements();

} // ElementContainarable
