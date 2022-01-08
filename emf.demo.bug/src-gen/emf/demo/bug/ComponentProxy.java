/**
 */
package emf.demo.bug;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.demo.bug.ComponentProxy#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see emf.demo.bug.BugPackage#getComponentProxy()
 * @model
 * @generated
 */
public interface ComponentProxy extends NameableInterface {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see emf.demo.bug.BugPackage#getComponentProxy_Type()
	 * @model
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link emf.demo.bug.ComponentProxy#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

} // ComponentProxy
