/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.core;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class JavaFXCore {
	public static final String JAVAFX_CONTAINER_ID= "org.eclipse.fx.ide.jdt.core.JAVAFX_CONTAINER"; //$NON-NLS-1$
	
	public final static IPath JAVAFX_CONTAINER_PATH= new Path(JAVAFX_CONTAINER_ID); //$NON-NLS-1$
}
