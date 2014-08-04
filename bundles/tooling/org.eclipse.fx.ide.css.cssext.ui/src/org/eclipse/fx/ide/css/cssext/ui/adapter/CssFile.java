/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import org.eclipse.core.resources.IResource;

/**
 * @author ccaks
 *
 */
public class CssFile extends ACssResource {

	public CssFile(IResource adaptedObject) {
		super(adaptedObject);
	}
	
	@Override
	public String toString() {
		return "CssFile(" + getAdaptedObject() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
