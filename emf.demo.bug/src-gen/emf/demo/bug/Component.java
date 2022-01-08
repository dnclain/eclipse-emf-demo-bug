/**
 */
package emf.demo.bug;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.demo.bug.Component#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see emf.demo.bug.BugPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NameableInterface, IconChangeableInterface {

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link emf.demo.bug.ComponentProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see emf.demo.bug.BugPackage#getComponent_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentProxy> getChildren();
} // Component
