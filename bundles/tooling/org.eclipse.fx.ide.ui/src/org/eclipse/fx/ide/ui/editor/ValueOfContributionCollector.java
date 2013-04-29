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
