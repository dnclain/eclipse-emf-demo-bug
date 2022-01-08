/**
 */
package emf.demo.bug;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emf.demo.bug.BugFactory
 * @model kind="package"
 * @generated
 */
public interface BugPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bug";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bug";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bug";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BugPackage eINSTANCE = emf.demo.bug.impl.BugPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.demo.bug.ElementContainarable <em>Element Containarable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.ElementContainarable
	 * @see emf.demo.bug.impl.BugPackageImpl#getElementContainarable()
	 * @generated
	 */
	int ELEMENT_CONTAINARABLE = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTAINARABLE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Element Containarable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTAINARABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Containarable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTAINARABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.impl.ModelImpl
	 * @see emf.demo.bug.impl.BugPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = ELEMENT_CONTAINARABLE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = ELEMENT_CONTAINARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ELEMENT_CONTAINARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ELEMENT_CONTAINARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.NameableInterface <em>Nameable Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.NameableInterface
	 * @see emf.demo.bug.impl.BugPackageImpl#getNameableInterface()
	 * @generated
	 */
	int NAMEABLE_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nameable Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.impl.PackageImpl
	 * @see emf.demo.bug.impl.BugPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMEABLE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = NAMEABLE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = NAMEABLE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMEABLE_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMEABLE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.impl.ComponentImpl
	 * @see emf.demo.bug.impl.BugPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMEABLE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ICON_PATH = NAMEABLE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CHILDREN = NAMEABLE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMEABLE_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMEABLE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.IconChangeableInterface <em>Icon Changeable Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.IconChangeableInterface
	 * @see emf.demo.bug.impl.BugPackageImpl#getIconChangeableInterface()
	 * @generated
	 */
	int ICON_CHANGEABLE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CHANGEABLE_INTERFACE__ICON_PATH = 0;

	/**
	 * The number of structural features of the '<em>Icon Changeable Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CHANGEABLE_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Icon Changeable Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CHANGEABLE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.demo.bug.impl.ComponentProxyImpl <em>Component Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.demo.bug.impl.ComponentProxyImpl
	 * @see emf.demo.bug.impl.BugPackageImpl#getComponentProxy()
	 * @generated
	 */
	int COMPONENT_PROXY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROXY__NAME = NAMEABLE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROXY__TYPE = NAMEABLE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROXY_FEATURE_COUNT = NAMEABLE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROXY_OPERATION_COUNT = NAMEABLE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see emf.demo.bug.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.demo.bug.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see emf.demo.bug.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see emf.demo.bug.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.demo.bug.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see emf.demo.bug.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see emf.demo.bug.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.demo.bug.Component#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see emf.demo.bug.Component#getChildren()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Children();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.IconChangeableInterface <em>Icon Changeable Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Changeable Interface</em>'.
	 * @see emf.demo.bug.IconChangeableInterface
	 * @generated
	 */
	EClass getIconChangeableInterface();

	/**
	 * Returns the meta object for the attribute '{@link emf.demo.bug.IconChangeableInterface#getIconPath <em>Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Path</em>'.
	 * @see emf.demo.bug.IconChangeableInterface#getIconPath()
	 * @see #getIconChangeableInterface()
	 * @generated
	 */
	EAttribute getIconChangeableInterface_IconPath();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.ComponentProxy <em>Component Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Proxy</em>'.
	 * @see emf.demo.bug.ComponentProxy
	 * @generated
	 */
	EClass getComponentProxy();

	/**
	 * Returns the meta object for the reference '{@link emf.demo.bug.ComponentProxy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see emf.demo.bug.ComponentProxy#getType()
	 * @see #getComponentProxy()
	 * @generated
	 */
	EReference getComponentProxy_Type();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.NameableInterface <em>Nameable Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable Interface</em>'.
	 * @see emf.demo.bug.NameableInterface
	 * @generated
	 */
	EClass getNameableInterface();

	/**
	 * Returns the meta object for the attribute '{@link emf.demo.bug.NameableInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.demo.bug.NameableInterface#getName()
	 * @see #getNameableInterface()
	 * @generated
	 */
	EAttribute getNameableInterface_Name();

	/**
	 * Returns the meta object for class '{@link emf.demo.bug.ElementContainarable <em>Element Containarable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Containarable</em>'.
	 * @see emf.demo.bug.ElementContainarable
	 * @generated
	 */
	EClass getElementContainarable();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.demo.bug.ElementContainarable#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see emf.demo.bug.ElementContainarable#getElements()
	 * @see #getElementContainarable()
	 * @generated
	 */
	EReference getElementContainarable_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BugFactory getBugFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emf.demo.bug.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.impl.ModelImpl
		 * @see emf.demo.bug.impl.BugPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.impl.PackageImpl
		 * @see emf.demo.bug.impl.BugPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.impl.ComponentImpl
		 * @see emf.demo.bug.impl.BugPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CHILDREN = eINSTANCE.getComponent_Children();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.IconChangeableInterface <em>Icon Changeable Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.IconChangeableInterface
		 * @see emf.demo.bug.impl.BugPackageImpl#getIconChangeableInterface()
		 * @generated
		 */
		EClass ICON_CHANGEABLE_INTERFACE = eINSTANCE.getIconChangeableInterface();

		/**
		 * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_CHANGEABLE_INTERFACE__ICON_PATH = eINSTANCE.getIconChangeableInterface_IconPath();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.impl.ComponentProxyImpl <em>Component Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.impl.ComponentProxyImpl
		 * @see emf.demo.bug.impl.BugPackageImpl#getComponentProxy()
		 * @generated
		 */
		EClass COMPONENT_PROXY = eINSTANCE.getComponentProxy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROXY__TYPE = eINSTANCE.getComponentProxy_Type();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.NameableInterface <em>Nameable Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.NameableInterface
		 * @see emf.demo.bug.impl.BugPackageImpl#getNameableInterface()
		 * @generated
		 */
		EClass NAMEABLE_INTERFACE = eINSTANCE.getNameableInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE_INTERFACE__NAME = eINSTANCE.getNameableInterface_Name();

		/**
		 * The meta object literal for the '{@link emf.demo.bug.ElementContainarable <em>Element Containarable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.demo.bug.ElementContainarable
		 * @see emf.demo.bug.impl.BugPackageImpl#getElementContainarable()
		 * @generated
		 */
		EClass ELEMENT_CONTAINARABLE = eINSTANCE.getElementContainarable();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTAINARABLE__ELEMENTS = eINSTANCE.getElementContainarable_Elements();

	}

} //BugPackage
