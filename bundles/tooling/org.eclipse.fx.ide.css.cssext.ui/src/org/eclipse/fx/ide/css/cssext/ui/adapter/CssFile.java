/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
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
