/**
 */
package emf.demo.bug;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Changeable Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.demo.bug.IconChangeableInterface#getIconPath <em>Icon Path</em>}</li>
 * </ul>
 *
 * @see emf.demo.bug.BugPackage#getIconChangeableInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IconChangeableInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Path</em>' attribute.
	 * @see #setIconPath(String)
	 * @see emf.demo.bug.BugPackage#getIconChangeableInterface_IconPath()
	 * @model
	 * @generated
	 */
	String getIconPath();

	/**
	 * Sets the value of the '{@link emf.demo.bug.IconChangeableInterface#getIconPath <em>Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Path</em>' attribute.
	 * @see #getIconPath()
	 * @generated
	 */
	void setIconPath(String value);

} // IconChangeableInterface
