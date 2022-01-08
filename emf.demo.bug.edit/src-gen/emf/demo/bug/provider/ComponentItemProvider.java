/**
 */
package emf.demo.bug.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import emf.demo.bug.BugFactory;
import emf.demo.bug.BugPackage;
import emf.demo.bug.Component;
import emf.demo.bug.ComponentProxy;
import emf.demo.bug.util.BugModelService;
import emf.demo.bug.util.StringUtils;

/**
 * This is the item provider adapter for a {@link emf.demo.bug.Component}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIconPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NameableInterface_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NameableInterface_name_feature",
								"_UI_NameableInterface_type"),
						BugPackage.Literals.NAMEABLE_INTERFACE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Icon Path feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IconChangeableInterface_iconPath_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IconChangeableInterface_iconPath_feature",
						"_UI_IconChangeableInterface_type"),
				BugPackage.Literals.ICON_CHANGEABLE_INTERFACE__ICON_PATH, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an
	 * appropriate feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BugPackage.Literals.COMPONENT__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to
		// use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Component.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		var _cur = (Component) object;
		if (_cur.eContainer() != null && !StringUtils.isBlank(_cur.getIconPath())) {
			try {
				var _url = URI.createPlatformResourceURI(BugModelService.resourcePath(_cur, _cur.getIconPath()), true);
				return overlayImage(object, _url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component.png"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update
	 * any cached children and by creating a viewer notification, which it passes to
	 * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Component.class)) {
		case BugPackage.COMPONENT__NAME:
		case BugPackage.COMPONENT__ICON_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BugPackage.COMPONENT__CHILDREN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	public static interface Callable<T> {
		void call(T e);
	}

	/**
	 * @generated NOT
	 */
	public void collectUsableComponent(Collection<Object> newChildDescriptors, Object object,
			Callable<ComponentProxy> adder) {
		if (object instanceof EObject) {
			var _elements = ItemPropertyDescriptor.getReachableObjectsOfType((EObject) object,
					BugPackage.Literals.COMPONENT);
			for (var _el : _elements) {
				var _it = (Component) _el;

				ComponentProxy _child = BugFactory.eINSTANCE.createComponentProxy();

				_child.setType(_it);

				// newChildDescriptors.add(new
				// CreateChildCommand(AdapterFactoryEditingDomain.getEditingDomainFor(_el),
				// null, _it.eContainingFeature(), _child, Arrays.asList(object)));
				adder.call(_child);
			}
		}
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing
	 * the children that can be created under this object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		// 🚨 TODO: make this less time consuming
		this.collectUsableComponent(newChildDescriptors, object, e -> {
			newChildDescriptors.add(createChildParameter(
					BugPackage.Literals.COMPONENT__CHILDREN, e));
		});

		newChildDescriptors.add(createChildParameter(BugPackage.Literals.COMPONENT__CHILDREN,
				BugFactory.eINSTANCE.createComponentProxy()));
	}

	/**
	 * 
	 * @param elseLabel
	 * @param owner
	 * @param feature
	 * @param child
	 * @param selection
	 * @generated NOT
	 * @return
	 */
	public String getCreateChildTextGlobal(String elseLabel, Object owner, Object feature, Object child,
			Collection<?> selection) {
		if (child instanceof ComponentProxy) {
			var _proxy = (ComponentProxy) child;
			if (_proxy.getType() != null) {
				var _target = (Component) _proxy.getType();

				var _name = "&🪧 Local > " + _target.getName();
								
				return _name;
			}			
		}
		return null;
	}
	
	
	/**
	 * This returns the label for {@link CreateChildCommand}.
	 * 
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		var _result = this.getCreateChildTextGlobal(getTypeText(child) + " ❌", owner, feature, child, selection); 
		
		if (_result != null) {
			return _result;
		}
		
		return super.getCreateChildText(owner, feature, child, selection);
	}
	
	
	/**
	 * @generated NOT 
	 */
	public Object getCreateChildImageGlobal(ResourceLocator resourceLocator, Object owner, Object feature,
			Object child, Collection<?> selection) {
		if (child instanceof ComponentProxy) {
			var _proxy = (ComponentProxy) child;
			if (_proxy.getType() != null) {
				var _target = _proxy.getType();
				if (_target.eContainer() != null && !StringUtils.isBlank(_target.getIconPath())) {
					try {
						return URI.createPlatformResourceURI(BugModelService.resourcePath(_target, _target.getIconPath()), true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return resourceLocator.getImage("full/obj16/ComponentProxy.png");
			}
		}

		return null;
	}
	
	
	/**
	 * This returns the icon image for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * @generated NOT
	 */
	@Override	
	public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
		var _result = this.getCreateChildImageGlobal(this.getResourceLocator(), owner, feature, child, selection);
		
		if (_result != null) {
			return _result;
		}
		
		return super.getCreateChildImage(owner, feature, child, selection);
	}
	
	
	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BugEditPlugin.INSTANCE;
	}

}
