/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.wizards.template;


public class HtmlElement extends JDTElement{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		support.firePropertyChange("title", this.title, this.title = title);
	}
}
