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
package org.eclipse.fx.ide.css.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;

/**
 * @author ccaks
 *
 */
public class CssFile {

	private Object adaptedObject;
	
	public CssFile(Object adaptedObject) {
		this.adaptedObject = adaptedObject;
	}
	
	@Override
	public String toString() {
		return "CssFile(" + adaptedObject + ")";
	}

	/**
	 * @return
	 */
	public List<Object> getExtList() {
		
	//	Platform.getAdapterManager().getAdapter(adaptedObject, Css.class);
		
		ArrayList<Object> l = new ArrayList<>();
		
		l.add("jfx2.cssext");
		l.add("jfx8.cssext");
		l.add("somestuff.cssext");
		
		return l;
	}

	/**
	 * @return
	 */
	public Set<CssExtension> collectCssExtension() {
		// TODO Auto-generated method stub
		return null;
	}
}
