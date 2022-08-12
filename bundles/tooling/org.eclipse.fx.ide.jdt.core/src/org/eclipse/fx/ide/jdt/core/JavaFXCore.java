/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.core;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class JavaFXCore {
	public static final String JAVAFX_CONTAINER_ID = "org.eclipse.fx.ide.jdt.core.JAVAFX_CONTAINER"; //$NON-NLS-1$

	public final static IPath JAVAFX_CONTAINER_PATH = new Path(JAVAFX_CONTAINER_ID); //$NON-NLS-1$

	public static final String MOBILE_CONTAINER_ID = "org.eclipse.fx.ide.jdt.core.MOBILE_CONTAINER"; //$NON-NLS-1$

	public final static IPath MOBILE_CONTAINER_PATH = new Path(MOBILE_CONTAINER_ID); //$NON-NLS-1$

	
	public static final String CSSEXT_FX8_BUNDLE_NAME = "org.eclipse.fx.ide.css.jfx8"; //$NON-NLS-1$
	public static final String CSSEXT_FX2_BUNDLE_NAME = "org.eclipse.fx.ide.css.jfx2"; //$NON-NLS-1$
	
}
