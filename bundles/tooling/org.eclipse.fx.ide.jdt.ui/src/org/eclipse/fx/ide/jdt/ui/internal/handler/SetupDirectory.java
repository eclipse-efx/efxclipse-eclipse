/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import java.io.File;

public class SetupDirectory {
	public File originalPath;
	public File relativePath;
	
	public SetupDirectory(File originalPath, File relativePath) {
		this.originalPath = originalPath;
		this.relativePath = relativePath;
	}
}
