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
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.converter;

import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty;

public class CastHelper {
	public Element castToElement(FactoryValueElement element) {
		return (Element) element;
	}

	public Element castToElement(ValueProperty property) {
		return (Element) property;
	}

	public Element castToElement(ListValueElement property) {
		return (Element) property;
	}

	public ListValueProperty castToListValueProperty(ValueProperty property) {
		return (ListValueProperty) property;
	}

	public MapValueProperty castToMapValueProperty(ValueProperty property) {
		return (MapValueProperty) property;
	}
}
