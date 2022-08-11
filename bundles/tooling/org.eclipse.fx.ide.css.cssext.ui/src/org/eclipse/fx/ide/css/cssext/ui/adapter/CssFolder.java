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
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;

public class CssFolder extends ACssResource {
	
	public CssFolder(IResource adaptedObject) {
		super(adaptedObject);
		getLogger().debug("creating CssFolder for " + adaptedObject);
	}

	@Override
	public String toString() {
		return "CssFolder(" + getAdaptedObject() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
