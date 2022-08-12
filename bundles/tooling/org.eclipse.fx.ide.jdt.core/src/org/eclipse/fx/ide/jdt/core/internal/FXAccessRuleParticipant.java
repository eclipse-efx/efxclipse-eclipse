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
package org.eclipse.fx.ide.jdt.core.internal;

import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.jdt.core.FXVersion;
import org.eclipse.fx.ide.jdt.core.FXVersionUtil;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jdt.launching.environments.IAccessRuleParticipant;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;

public class FXAccessRuleParticipant implements IAccessRuleParticipant {

	@Override
	public IAccessRule[][] getAccessRules(IExecutionEnvironment environment, IVMInstall vm, LibraryLocation[] libraries, IJavaProject project) {
		boolean fxOnExtPath = false;
		for( LibraryLocation loc : libraries ) {
			if( "jfxrt.jar".equals(loc.getSystemLibraryPath().lastSegment()) ) {
				fxOnExtPath = true;
				break;
			}
		}

		if( fxOnExtPath ) {
			IAccessRule[] rules = new IAccessRule[6];
			rules[0] = JavaCore.newAccessRule(new Path("javafx/**"), IAccessRule.K_ACCESSIBLE);
			rules[1] = JavaCore.newAccessRule(new Path("netscape/javascript/**"), IAccessRule.K_ACCESSIBLE);
			rules[2] = JavaCore.newAccessRule(new Path("com/sun/javafx/**"), IAccessRule.K_DISCOURAGED);
			rules[3] = JavaCore.newAccessRule(new Path("com/sun/glass/**"), IAccessRule.K_DISCOURAGED);
			rules[4] = JavaCore.newAccessRule(new Path("com/sun/media/jfxmedia/**"), IAccessRule.K_DISCOURAGED);
			rules[5] = JavaCore.newAccessRule(new Path("com/sun/prism/**"), IAccessRule.K_DISCOURAGED);

			IAccessRule[][] rv = new IAccessRule[libraries.length][];

			for( int i = 0; i < rv.length; i++ ) {
				rv[i] = rules;
			}

			return rv;
		} else if( FXVersionUtil.getFxVersion(vm) == FXVersion.FX9 ) {
			IAccessRule[] rules = new IAccessRule[2];
			rules[0] = JavaCore.newAccessRule(new Path("javafx/**"), IAccessRule.K_ACCESSIBLE);
			rules[1] = JavaCore.newAccessRule(new Path("netscape/javascript/**"), IAccessRule.K_ACCESSIBLE);

			IAccessRule[][] rv = new IAccessRule[libraries.length][];

			for( int i = 0; i < rv.length; i++ ) {
				rv[i] = rules;
			}

			return rv;
		}

		return new IAccessRule[0][0];
	}

}
