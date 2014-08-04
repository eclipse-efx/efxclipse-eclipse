/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

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
