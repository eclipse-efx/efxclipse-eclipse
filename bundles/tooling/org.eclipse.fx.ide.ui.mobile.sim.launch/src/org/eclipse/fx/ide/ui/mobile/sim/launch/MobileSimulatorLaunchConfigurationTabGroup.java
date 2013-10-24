package org.eclipse.fx.ide.ui.mobile.sim.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab;

public class MobileSimulatorLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {
	private static final String ID = "org.eclipse.fx.ide.ui.mobile.sim.launch";
	
	public static final String DEVICE_TYPE = ID + ".DEVICE_TYPE";
	public static final String DEVICE_ORIENTATION = ID + ".DEVICE_ORIENTATION";
	public static final String DEVICE_SIZE = ID + ".DEVICE_SIZE";
	public static final String APP_CLASS = ID + ".APP_CLASS";
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new MainTab(),
				new JavaMainTab(),
				new JavaArgumentsTab(),
				new JavaJRETab(),
				new JavaClasspathTab(),
				new SourceLookupTab(),
				new EnvironmentTab(),
				new CommonTab()
			};
			setTabs(tabs);
	}
}
