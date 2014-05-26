package org.eclipse.fx.ide.jdt.core;

import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstall2;

public class FXVersionUtil {

	public static FXVersion getFxVersion(IVMInstall i) {
		if (i instanceof IVMInstall2) {
			final String javaVersion = ((IVMInstall2) i).getJavaVersion();
			if (javaVersion.startsWith("1.8")) {
				return FXVersion.FX8;
			} else if (javaVersion.startsWith("1.7")) {
				return FXVersion.FX2;
			}
		}
		return FXVersion.UNKNOWN;
	}

}
