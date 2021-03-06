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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.demo.bug.BugPackage
 * @generated
 */
public class BugAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BugPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BugAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BugPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BugSwitch<Adapter> modelSwitch = new BugSwitch<Adapter>() {
		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter casePackage(emf.demo.bug.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseIconChangeableInterface(IconChangeableInterface object) {
			return createIconChangeableInterfaceAdapter();
		}

		@Override
		public Adapter caseComponentProxy(ComponentProxy object) {
			return createComponentProxyAdapter();
		}

		@Override
		public Adapter caseNameableInterface(NameableInterface object) {
			return createNameableInterfaceAdapter();
		}

		@Override
		public Adapter caseElementContainarable(ElementContainarable object) {
			return createElementContainarableAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.IconChangeableInterface <em>Icon Changeable Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.IconChangeableInterface
	 * @generated
	 */
	public Adapter createIconChangeableInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.ComponentProxy <em>Component Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.ComponentProxy
	 * @generated
	 */
	public Adapter createComponentProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.NameableInterface <em>Nameable Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.NameableInterface
	 * @generated
	 */
	public Adapter createNameableInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.demo.bug.ElementContainarable <em>Element Containarable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.demo.bug.ElementContainarable
	 * @generated
	 */
	public Adapter createElementContainarableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BugAdapterFactory
