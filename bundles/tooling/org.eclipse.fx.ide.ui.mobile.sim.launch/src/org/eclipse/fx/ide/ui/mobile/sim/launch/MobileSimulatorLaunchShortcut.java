package org.eclipse.fx.ide.ui.mobile.sim.launch;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class MobileSimulatorLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		try {
			ICompilationUnit u = (ICompilationUnit) ((IStructuredSelection)selection).getFirstElement();
			IType t = u.getTypes()[0];
			launch(t, mode);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		IJavaElement je = (IJavaElement) input.getAdapter(IJavaElement.class);
		if( je instanceof IMember ) {
			launch(((IMember)je).getDeclaringType(),mode);
		}
	}
	
	void launch(IType type, String mode) {
		try {
			ILaunchConfigurationType ctype = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurationType("org.eclipse.fx.ide.ui.mobile.sim.launch.launchConfigurationType");
			ILaunchConfiguration launchConfig = findLaunchConfig(type, ctype);
			
			if( launchConfig == null ) {
				launchConfig = createNew(type, ctype);
			}
			DebugUITools.launch(launchConfig, mode);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private ILaunchConfiguration createNew(IType type, ILaunchConfigurationType ctype) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			wc = ctype.newInstance(null, DebugPlugin.getDefault().getLaunchManager().generateLaunchConfigurationName(type.getTypeQualifiedName('.')));
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "org.eclipse.fx.ide.ui.mobile.sim.device.MobileDeviceSimulator");
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, type.getJavaProject().getElementName());
			wc.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.APP_CLASS, type.getFullyQualifiedName());
			wc.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_TYPE, DeviceType.IPHONE.name());
			wc.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_ORIENTATION, Orientation.VERTICAL.name());
			wc.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136");
			wc.setMappedResources(new IResource[] {type.getUnderlyingResource()});
			config = wc.doSave();
		} catch (CoreException exception) {
			exception.printStackTrace();	
		} 
		return config;
	}

	private ILaunchConfiguration findLaunchConfig(IType type, ILaunchConfigurationType ctype) throws CoreException {
		ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(ctype);
		
		String typename = type.getFullyQualifiedName();
		String projectname = type.getJavaProject().getElementName();
		
		for( ILaunchConfiguration c : configs ) {
			if( c.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "").equals(projectname) 
					&& c.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.APP_CLASS, "").equals(typename)) {
				return c;
			}
		}
		
		return null;
	}
}
