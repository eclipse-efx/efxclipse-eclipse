package org.eclipse.fx.ide.mvnosgi.launching.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class OSGiLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

	public OSGiLaunchConfigurationTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new MainLauncherTab() };
		setTabs(tabs);
	}

}
