/**
 */
package emf.demo.bug;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.demo.bug.Model#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see emf.demo.bug.BugPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends ElementContainarable {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link emf.demo.bug.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see emf.demo.bug.BugPackage#getModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<emf.demo.bug.Package> getPackages();

} // Model
