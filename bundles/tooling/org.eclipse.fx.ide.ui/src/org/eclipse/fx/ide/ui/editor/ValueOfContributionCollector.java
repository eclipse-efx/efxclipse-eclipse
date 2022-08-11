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
package org.eclipse.fx.ide.ui.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueOfContributionCollector {
	private Map<String, List<IValueOfContributor>> map = new HashMap<>();
	
	public void addValueOfContributor(IValueOfContributor c) {
		List<IValueOfContributor> l = map.get(c.getType());
		if( l == null ) {
			l = new ArrayList<>();
			map.put(c.getType(), l);
		}
		l.add(c);
	}
	
	public void removeValueOfContributor(IValueOfContributor c) {
		List<IValueOfContributor> l = map.get(c.getType());
		if( l != null ) {
			l.remove(c);
		}
	}
	
	public List<IValueOfContributor> getContributors(String classType) {
		List<IValueOfContributor> rv = map.get(classType);
		if( rv != null ) {
			return Collections.unmodifiableList(rv);
		}
		return Collections.emptyList();
	}
}
