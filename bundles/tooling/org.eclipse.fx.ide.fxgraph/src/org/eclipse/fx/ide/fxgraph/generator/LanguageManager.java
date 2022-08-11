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
