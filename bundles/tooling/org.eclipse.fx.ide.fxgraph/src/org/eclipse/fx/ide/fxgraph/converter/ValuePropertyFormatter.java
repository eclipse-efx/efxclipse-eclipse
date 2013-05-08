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
package org.eclipse.fx.ide.fxgraph.converter;

import org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty;

public class ValuePropertyFormatter {
	private String formattedValue;

	public ValuePropertyFormatter(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("value must not be null");
		} else if (value instanceof Property) {
			Property p = (Property) value;
			StringBuffer sb = new StringBuffer();
			if ("Integer".equals(p.getName()) || "Double".equals(p.getName())) {
				sb.append(new ValuePropertyFormatter(p.getValue())
						.getFormattedValue().replaceAll("\"", ""));
			} else {
				if (p.getModifier() != null) {
					sb.append(p.getModifier() + " ");
				}
				sb.append(p.getName() + " : ");
				sb.append(new ValuePropertyFormatter(p.getValue())
						.getFormattedValue());
			}
			formattedValue = sb.toString();
		} else if (value instanceof ResourceValueProperty) {
			ResourceValueProperty p = (ResourceValueProperty) value;
			formattedValue = "rstring \"" + p.getValue().getValue() + "\"";
		} else if (value instanceof LocationValueProperty) {
			LocationValueProperty p = (LocationValueProperty) value;
			formattedValue = "location \"" + p.getValue() + "\"";
		} else if (value instanceof BindValueProperty) {
			BindValueProperty p = (BindValueProperty) value;
			formattedValue = "bind " + p.getElementReference().getName() + "#"
					+ p.getAttribute();
		} else if (value instanceof ControllerHandledValueProperty) {
			formattedValue = "controllermethod "
					+ ((ControllerHandledValueProperty) value).getMethodname();
		} else if (value instanceof ScriptHandlerHandledValueProperty) {
			formattedValue = "scriptmethod "
					+ ((ScriptHandlerHandledValueProperty) value)
							.getFunctionname();
		} else if (value instanceof ScriptValueExpression) {
			formattedValue = "scriptexpression "
					+ ((ScriptValueExpression) value).getSourcecode();
		} else if (value instanceof ScriptValueReference) {
			formattedValue = "scriptvalue "
					+ ((ScriptValueReference) value).getReference();

		} else if (value instanceof StaticValueProperty) {
			StaticValueProperty p = (StaticValueProperty) value;
			StringBuffer sb = new StringBuffer();
			if (p.getModifier() != null) {
				sb.append(p.getModifier() + " ");
			}
			sb.append("static " + p.getName() + " : ");
			sb.append(new ValuePropertyFormatter(p.getValue())
					.getFormattedValue());
			formattedValue = sb.toString();
		} else if (value instanceof StaticCallValueProperty) {
			StaticCallValueProperty p = (StaticCallValueProperty) value;
			StringBuffer sb = new StringBuffer();
			if (p.getModifier() != null) {
				sb.append(p.getModifier() + " ");
			}
			sb.append("call " + p.getType().getSimpleName() + " # "
					+ p.getName() + " : ");
			sb.append(new ValuePropertyFormatter(p.getValue())
					.getFormattedValue());
			formattedValue = sb.toString();
		} else if (value instanceof ConstValueProperty) {
			ConstValueProperty p = (ConstValueProperty) value;
			StringBuffer sb = new StringBuffer();
			sb.append("const " + p.getType().getSimpleName() + "#"
					+ p.getField());
			formattedValue = sb.toString();
		} else if (value instanceof IncludeValueProperty) {
			IncludeValueProperty inc = (IncludeValueProperty) value;
			formattedValue = "include " + "source=" + inc.getSource()
					+ " name=" + inc.getName(); // TODO
		} else if (value instanceof ReferenceValueProperty) {
			ReferenceValueProperty ref = (ReferenceValueProperty) value;
			StringBuffer sb = new StringBuffer();
			sb.append("idref ");
			if (ref.getReference() instanceof Element) {
				sb.append(((Element) ref.getReference()).getType()
						.getSimpleName());
			}
			if (!ref.getStaticCallProperties().isEmpty()
					|| !ref.getStaticProperties().isEmpty()) {
				sb.append("{");
				boolean comma = false;
				for (StaticCallValueProperty p : ref.getStaticCallProperties()) {
					if (comma) {
						sb.append(",");
					}
					sb.append(new ValuePropertyFormatter(p).getFormattedValue());
					comma = true;
				}
				for (StaticValueProperty p : ref.getStaticProperties()) {
					if (comma) {
						sb.append(",");
					}
					sb.append(new ValuePropertyFormatter(p).getFormattedValue());
					comma = true;
				}
				sb.append("}");
			}
			formattedValue = sb.toString();
		} else if (value instanceof SimpleValueProperty) {
			SimpleValueProperty v = (SimpleValueProperty) value;
			if (v.getBooleanValue() != null) {
				formattedValue = v.getBooleanValue();
			} else if (v.getStringValue() != null) {
				formattedValue = "\"" + v.getStringValue() + "\"";
			} else if (v.getRealValue() != 0.0) {
				formattedValue = "" + v.getRealValue();
			} else {
				formattedValue = "" + v.getIntValue();
			}
		} else if (value instanceof ListValueProperty) {
			final StringBuffer sb = new StringBuffer();
			for (int i = 0; i < ((ListValueProperty) value).getValue().size(); i++) {
				ListValueElement o = ((ListValueProperty) value).getValue()
						.get(i);
				if (o instanceof SimpleValueProperty) {
					String val = ((SimpleValueProperty) o).getStringValue();
					if (sb.length() > 0) {
						sb.append("\n");
					}
					sb.append(val);
					if ((i + 1) < ((ListValueProperty) value).getValue().size()) {
						sb.append(",");
					}
				}
			}
			if (sb.length() == 0) {
				sb.append("value : \"no value found\"");
			}
			formattedValue = sb.toString();
		} else {
			formattedValue = value.toString();
		}

	}

	public String getFormattedValue() {
		return formattedValue;
	}
}
