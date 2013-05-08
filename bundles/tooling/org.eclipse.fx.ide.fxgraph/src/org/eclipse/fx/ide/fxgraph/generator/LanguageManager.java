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
package org.eclipse.fx.ide.fxgraph.generator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LanguageManager {
	private Set<String> languages = new HashSet<String>();
	
	public String addLanguage(String language) {
		languages.add(language);
		return "";
	}
	
	public Collection<String> getLanguages() {
		return languages;
	}
}
