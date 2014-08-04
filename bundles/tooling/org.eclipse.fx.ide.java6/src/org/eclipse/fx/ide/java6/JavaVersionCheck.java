package org.eclipse.fx.ide.java6;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Start up participant who will open an error dialog
 */
public class JavaVersionCheck implements IStartup {

	@Override
	public void earlyStartup() {
		StatusManager.getManager().handle(
				new Status(IStatus.ERROR, "org.eclipse.fx.ide.java6", "You are not running your eclipse instance with Java8. The JavaFX tooling is disabled because of this.Make Java8 the default system java or adjust your eclipse.ini to pass -vm pointing to your Java8 install.\r\n\r\nIn case you want to turn off this check open your preferences and go to General > Startup and Shutdown and uncheck 'JavaFX Tooling Java Check'"),StatusManager.SHOW); //$NON-NLS-1$ //$NON-NLS-2$
	}
}