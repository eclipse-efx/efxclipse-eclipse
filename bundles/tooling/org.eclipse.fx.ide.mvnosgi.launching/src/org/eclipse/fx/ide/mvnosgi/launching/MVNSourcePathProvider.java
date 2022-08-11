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
package org.eclipse.fx.ide.mvnosgi.launching;

import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.StandardSourcePathProvider;

public class MVNSourcePathProvider extends StandardSourcePathProvider {
	public static final String ID = "org.eclipse.fx.ide.mvnosgi.launching.classpathProvider";
	
	public MVNSourcePathProvider() {
		System.err.println("======> CREATED ....");
	}
	
	@Override
	public IRuntimeClasspathEntry[] computeUnresolvedClasspath(ILaunchConfiguration configuration)
			throws CoreException {
		System.err.println("computeUnresolvedClasspath: " + configuration);
		return super.computeUnresolvedClasspath(configuration);
	}
	
	@Override
	public IRuntimeClasspathEntry[] resolveClasspath(IRuntimeClasspathEntry[] entries,
			ILaunchConfiguration configuration) throws CoreException {
		System.err.println("resolveClasspath: " + Arrays.toString(entries) + "; " + configuration);
		return super.resolveClasspath(entries, configuration);
	}
}
