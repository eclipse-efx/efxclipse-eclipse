package org.eclipse.fx.ide.jdt.core;

import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstall2;

/**
 * Check the java version
 */
public class FXVersionUtil {
	/**
	 * Check the version for the given java install
	 *
	 * @param i
	 *            the installation
	 * @return the value
	 */
	public static FXVersion getFxVersion(IVMInstall i) {
		if (i instanceof IVMInstall2) {
			final String javaVersion = ((IVMInstall2) i).getJavaVersion();
			if (javaVersion == null) {
				return FXVersion.UNKNOWN;
			}

			if (javaVersion.startsWith("1.8")) { //$NON-NLS-1$
				return FXVersion.FX8;
			} else if (javaVersion.startsWith("1.7")) { //$NON-NLS-1$
				return FXVersion.FX2;
			} else if( javaVersion.startsWith("9") ) { //$NON-NLS-1$
				return FXVersion.FX9;
			}
		}
		return FXVersion.UNKNOWN;
	}

}
