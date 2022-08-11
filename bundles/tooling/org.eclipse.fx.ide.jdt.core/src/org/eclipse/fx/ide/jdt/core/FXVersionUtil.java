/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
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
			} else if( javaVersion.startsWith("11") ) { //$NON-NLS-1$
				return FXVersion.FX11;
			} else {
				return FXVersion.FX11PLUS;
			}
		}
		return FXVersion.UNKNOWN;
	}

}
