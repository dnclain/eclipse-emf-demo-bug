# eclipse-emf-demo-bug
A temporary repository that contains an example of code of EMF that creates a weird bug.

When adding an icon that comes from the modeling workspace `platform:/resource/...` instead of the development workspace `platform:/plugins/...` :

Tested in Eclipse Modeling 2021-12.

```

!ENTRY org.eclipse.core.runtime 4 0 2022-01-08 22:30:52.159
!MESSAGE Invalid input url:platform:/resource/test-bug/icons/diamond.png
!STACK 0
java.io.IOException: Unsupported "platform:" protocol variation "platform:/resource/test-bug/icons/diamond.png".
	at org.eclipse.core.internal.runtime.PlatformURLPluginConnection.parse(PlatformURLPluginConnection.java:55)
	at org.eclipse.core.internal.runtime.FindSupport.find(FindSupport.java:293)
	at org.eclipse.core.runtime.FileLocator.find(FileLocator.java:206)
	at org.eclipse.jface.resource.URLImageDescriptor.getFilePath(URLImageDescriptor.java:240)
	at org.eclipse.jface.resource.URLImageDescriptor$URLImageFileNameProvider.getImagePath(URLImageDescriptor.java:58)
	at org.eclipse.swt.graphics.Image.<init>(Image.java:774)
	at org.eclipse.jface.resource.URLImageDescriptor.createImage(URLImageDescriptor.java:275)
	at org.eclipse.jface.resource.ImageDescriptor.createImage(ImageDescriptor.java:290)
	at org.eclipse.jface.resource.ImageDescriptor.createImage(ImageDescriptor.java:268)
	at org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getImage(ExtendedImageRegistry.java:179)
	at org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.getImageFromObject(AdapterFactoryLabelProvider.java:409)
	at org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.getImage(AdapterFactoryLabelProvider.java:380)
	at org.eclipse.jface.viewers.WrappedViewerLabelProvider.getImage(WrappedViewerLabelProvider.java:104)
	at org.eclipse.jface.viewers.WrappedViewerLabelProvider.update(WrappedViewerLabelProvider.java:149)
	at org.eclipse.jface.viewers.ViewerColumn.refresh(ViewerColumn.java:144)
	at org.eclipse.jface.viewers.AbstractTreeViewer.doUpdateItem(AbstractTreeViewer.java:957)
	at org.eclipse.jface.viewers.AbstractTreeViewer$UpdateItemSafeRunnable.run(AbstractTreeViewer.java:126)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:45)
	at org.eclipse.jface.util.SafeRunnable.run(SafeRunnable.java:174)
	at org.eclipse.jface.viewers.AbstractTreeViewer.doUpdateItem(AbstractTreeViewer.java:1035)
	at org.eclipse.jface.viewers.StructuredViewer$UpdateItemSafeRunnable.run(StructuredViewer.java:427)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:45)
	at org.eclipse.jface.util.SafeRunnable.run(SafeRunnable.java:174)
	at org.eclipse.jface.viewers.StructuredViewer.updateItem(StructuredViewer.java:2109)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createTreeItem(AbstractTreeViewer.java:851)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createChildren(AbstractTreeViewer.java:829)
	at org.eclipse.jface.viewers.TreeViewer.createChildren(TreeViewer.java:611)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createChildren(AbstractTreeViewer.java:777)
	at org.eclipse.jface.viewers.AbstractTreeViewer.handleTreeExpand(AbstractTreeViewer.java:1552)
	at org.eclipse.jface.viewers.TreeViewer.handleTreeExpand(TreeViewer.java:897)
	at org.eclipse.jface.viewers.AbstractTreeViewer$3.treeExpanded(AbstractTreeViewer.java:1564)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:136)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:89)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4565)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1522)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1545)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1530)
	at org.eclipse.swt.widgets.TreeItem.sendExpand(TreeItem.java:1033)
	at org.eclipse.swt.widgets.Tree.expandItem_expandChildren(Tree.java:1323)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6690)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Widget.callSuper(Widget.java:235)
	at org.eclipse.swt.widgets.Widget.mouseDownSuper(Widget.java:1146)
	at org.eclipse.swt.widgets.Tree.mouseDownSuper(Tree.java:2188)
	at org.eclipse.swt.widgets.Widget.mouseDown(Widget.java:1138)
	at org.eclipse.swt.widgets.Control.mouseDown(Control.java:2625)
	at org.eclipse.swt.widgets.Tree.mouseDown(Tree.java:2155)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6233)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Widget.callSuper(Widget.java:235)
	at org.eclipse.swt.widgets.Widget.windowSendEvent(Widget.java:2160)
	at org.eclipse.swt.widgets.Shell.windowSendEvent(Shell.java:2487)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6357)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Display.applicationSendEvent(Display.java:5601)
	at org.eclipse.swt.widgets.Display.applicationProc(Display.java:5744)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSend(Native Method)
	at org.eclipse.swt.internal.cocoa.NSApplication.sendEvent(NSApplication.java:117)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3924)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$5.run(PartRenderingEngine.java:1154)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:338)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1045)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:155)
	at org.eclipse.ui.internal.Workbench.lambda$3(Workbench.java:644)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:338)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:551)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:156)
	at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:152)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:203)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:136)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:401)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:255)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:659)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:596)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1467)
	at org.eclipse.equinox.launcher.Main.main(Main.java:1440)

!ENTRY org.eclipse.core.runtime 4 0 2022-01-08 22:30:52.161
!MESSAGE Invalid input url:platform:/resource/test-bug/icons/diamond@2x.png
!STACK 0
java.io.IOException: Unsupported "platform:" protocol variation "platform:/resource/test-bug/icons/diamond@2x.png".
	at org.eclipse.core.internal.runtime.PlatformURLPluginConnection.parse(PlatformURLPluginConnection.java:55)
	at org.eclipse.core.internal.runtime.FindSupport.find(FindSupport.java:293)
	at org.eclipse.core.runtime.FileLocator.find(FileLocator.java:206)
	at org.eclipse.jface.resource.URLImageDescriptor.getFilePath(URLImageDescriptor.java:240)
	at org.eclipse.jface.resource.URLImageDescriptor$URLImageFileNameProvider.getImagePath(URLImageDescriptor.java:58)
	at org.eclipse.swt.graphics.Image.<init>(Image.java:782)
	at org.eclipse.jface.resource.URLImageDescriptor.createImage(URLImageDescriptor.java:275)
	at org.eclipse.jface.resource.ImageDescriptor.createImage(ImageDescriptor.java:290)
	at org.eclipse.jface.resource.ImageDescriptor.createImage(ImageDescriptor.java:268)
	at org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getImage(ExtendedImageRegistry.java:179)
	at org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.getImageFromObject(AdapterFactoryLabelProvider.java:409)
	at org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.getImage(AdapterFactoryLabelProvider.java:380)
	at org.eclipse.jface.viewers.WrappedViewerLabelProvider.getImage(WrappedViewerLabelProvider.java:104)
	at org.eclipse.jface.viewers.WrappedViewerLabelProvider.update(WrappedViewerLabelProvider.java:149)
	at org.eclipse.jface.viewers.ViewerColumn.refresh(ViewerColumn.java:144)
	at org.eclipse.jface.viewers.AbstractTreeViewer.doUpdateItem(AbstractTreeViewer.java:957)
	at org.eclipse.jface.viewers.AbstractTreeViewer$UpdateItemSafeRunnable.run(AbstractTreeViewer.java:126)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:45)
	at org.eclipse.jface.util.SafeRunnable.run(SafeRunnable.java:174)
	at org.eclipse.jface.viewers.AbstractTreeViewer.doUpdateItem(AbstractTreeViewer.java:1035)
	at org.eclipse.jface.viewers.StructuredViewer$UpdateItemSafeRunnable.run(StructuredViewer.java:427)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:45)
	at org.eclipse.jface.util.SafeRunnable.run(SafeRunnable.java:174)
	at org.eclipse.jface.viewers.StructuredViewer.updateItem(StructuredViewer.java:2109)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createTreeItem(AbstractTreeViewer.java:851)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createChildren(AbstractTreeViewer.java:829)
	at org.eclipse.jface.viewers.TreeViewer.createChildren(TreeViewer.java:611)
	at org.eclipse.jface.viewers.AbstractTreeViewer.createChildren(AbstractTreeViewer.java:777)
	at org.eclipse.jface.viewers.AbstractTreeViewer.handleTreeExpand(AbstractTreeViewer.java:1552)
	at org.eclipse.jface.viewers.TreeViewer.handleTreeExpand(TreeViewer.java:897)
	at org.eclipse.jface.viewers.AbstractTreeViewer$3.treeExpanded(AbstractTreeViewer.java:1564)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:136)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:89)
	at org.eclipse.swt.widgets.Display.sendEvent(Display.java:4565)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1522)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1545)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1530)
	at org.eclipse.swt.widgets.TreeItem.sendExpand(TreeItem.java:1033)
	at org.eclipse.swt.widgets.Tree.expandItem_expandChildren(Tree.java:1323)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6690)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Widget.callSuper(Widget.java:235)
	at org.eclipse.swt.widgets.Widget.mouseDownSuper(Widget.java:1146)
	at org.eclipse.swt.widgets.Tree.mouseDownSuper(Tree.java:2188)
	at org.eclipse.swt.widgets.Widget.mouseDown(Widget.java:1138)
	at org.eclipse.swt.widgets.Control.mouseDown(Control.java:2625)
	at org.eclipse.swt.widgets.Tree.mouseDown(Tree.java:2155)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6233)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Widget.callSuper(Widget.java:235)
	at org.eclipse.swt.widgets.Widget.windowSendEvent(Widget.java:2160)
	at org.eclipse.swt.widgets.Shell.windowSendEvent(Shell.java:2487)
	at org.eclipse.swt.widgets.Display.windowProc(Display.java:6357)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSendSuper(Native Method)
	at org.eclipse.swt.widgets.Display.applicationSendEvent(Display.java:5601)
	at org.eclipse.swt.widgets.Display.applicationProc(Display.java:5744)
	at org.eclipse.swt.internal.cocoa.OS.objc_msgSend(Native Method)
	at org.eclipse.swt.internal.cocoa.NSApplication.sendEvent(NSApplication.java:117)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3924)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$5.run(PartRenderingEngine.java:1154)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:338)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1045)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:155)
	at org.eclipse.ui.internal.Workbench.lambda$3(Workbench.java:644)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:338)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:551)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:156)
	at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:152)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:203)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:136)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:401)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:255)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:659)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:596)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1467)
	at org.eclipse.equinox.launcher.Main.main(Main.java:1440)


```



