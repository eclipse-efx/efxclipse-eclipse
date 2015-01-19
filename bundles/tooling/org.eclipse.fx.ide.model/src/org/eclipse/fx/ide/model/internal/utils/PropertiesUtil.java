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
package org.eclipse.fx.ide.model.internal.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.fx.ide.model.IFXCollectionProperty;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.model.IFXPrimitiveProperty.Type;
import org.eclipse.fx.ide.model.internal.FXClass;
import org.eclipse.fx.ide.model.internal.FXCollectionProperty;
import org.eclipse.fx.ide.model.internal.FXEnumProperty;
import org.eclipse.fx.ide.model.internal.FXEventHandlerProperty;
import org.eclipse.fx.ide.model.internal.FXMapProperty;
import org.eclipse.fx.ide.model.internal.FXObjectPoperty;
import org.eclipse.fx.ide.model.internal.FXPrimitiveProperty;
import org.eclipse.fx.ide.model.internal.FXProperty;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class PropertiesUtil {

	public static Map<String, IFXProperty> resolveProperties(FXClass fxClass) throws JavaModelException {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();

		if ("java.lang.Object".equals(fxClass.getFQN())) {
			return rv;
		}

		Map<String, IMethod> beanProperties = new HashMap<String, IMethod>();
		Map<String, IMethod> builderProperties = new HashMap<String, IMethod>();

		String builder = fxClass.getType().getFullyQualifiedName() + "Builder";
		IType builderType = fxClass.getJavaProject().findType(builder);
		if (builderType != null) {
			for (IMethod m : builderType.getMethods()) {
				// Only public and none static methods
				if (!Flags.isPublic(m.getFlags()) || Flags.isStatic(m.getFlags())) {
					continue;
				}

				String name = m.getElementName();

				// omit the build method
				if ("build".equals(name) || "applyTo".equals(name)) {
					continue;
				}

				if (m.getParameterNames().length == 1) {
					String param = m.getParameterTypes()[0];
					if (Signature.getArrayCount(param) == 0) {
						builderProperties.put(name, m);
					}
				}
			}
		}

		for (IMethod m : fxClass.getType().getMethods()) {
			// Only public and none static methods
			if (!Flags.isPublic(m.getFlags()) || Flags.isStatic(m.getFlags())) {
				continue;
			}

			String name = m.getElementName();

			// do not use impl methods they are private
			if (name.startsWith("getImpl") || name.startsWith("isImpl") || name.startsWith("setImpl") || name.contains("Unmodifiable")) {
				continue;
			}

			if (name.startsWith("get") || name.startsWith("is")) {
				name = name.startsWith("get") ? name.substring(3) : name.substring(2);
				name = Character.toLowerCase(name.charAt(0)) + name.substring(1);

				// Only set if there's not already one stored
				if (!beanProperties.containsKey(name)) {
					beanProperties.put(name, m);
				}
			} else if (m.getElementName().startsWith("set") && m.getParameters().length == 1) {
				name = name.substring(3);
				name = Character.toLowerCase(name.charAt(0)) + name.substring(1);
				beanProperties.put(name, m);
			}
		}

		for (Entry<String, IMethod> e : beanProperties.entrySet()) {
			FXProperty p = getProperty(fxClass, e.getKey(), e.getValue());
			if (p != null) {
				rv.put(e.getKey(), p);
			}
		}

		for (Entry<String, IMethod> e : builderProperties.entrySet()) {
			IFXProperty p = rv.get(e.getKey());
			if (p == null) {
				continue;
			}

			if (!(p instanceof IFXCollectionProperty)) {
				if (!p.isSetable()) {
					p = getProperty(fxClass, e.getKey(), e.getValue());
					if (p != null) {
						rv.put(e.getKey(), p);
					}
				}
			}
		}

		return rv;
	}

	private static FXProperty getProperty(FXClass fxClass, String name, IMethod m) throws JavaModelException {
		FXProperty p = null;

		String signature;

		if (m.getElementName().startsWith("get") || m.getElementName().startsWith("is")) {
			signature = m.getReturnType();
		} else {
			// setter or builder method
			signature = m.getParameterTypes()[0];
		}

		String genericType = Signature.toString(signature);

		if (FXPrimitiveProperty.isPrimitive(genericType)) {
			p = new FXPrimitiveProperty(fxClass, name, m, Type.parseType(genericType), false);
		} else {
			String erasedFQNType = Util.getFQNType((IType) m.getParent(), Signature.getTypeErasure(genericType));
			if (erasedFQNType != null) {
				if (FXEventHandlerProperty.isEventHandler(fxClass.getJavaProject(), erasedFQNType)) {
					p = new FXEventHandlerProperty(fxClass, name, m, false);
				} else if (FXCollectionProperty.isList(fxClass.getJavaProject(), erasedFQNType)) {
					p = new FXCollectionProperty(fxClass, name, m, erasedFQNType, genericType, false);
				} else if (FXMapProperty.isMap(fxClass.getJavaProject(), erasedFQNType)) {
					p = new FXMapProperty(fxClass, name, m, false);
				} else if (FXEnumProperty.isEnum(fxClass.getJavaProject(), erasedFQNType)) {
					p = new FXEnumProperty(fxClass, name, m, erasedFQNType, false);
				} else {
					p = new FXObjectPoperty(fxClass, name, m, erasedFQNType, false);
				}
			}
		}

		return p;
	}

	public static Map<String, IFXProperty> resolveStaticProperties(FXClass fxClass) throws JavaModelException {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();

		if ("java.lang.Object".equals(fxClass.getFQN())) {
			return rv;
		}

		for (IMethod m : fxClass.getType().getMethods()) {
			if (!Flags.isPublic(m.getFlags()) || !Flags.isStatic(m.getFlags())) {
				continue;
			}

			String name = m.getElementName();

			if (name.startsWith("setImpl")) {
				continue;
			}

			if (name.startsWith("set") && m.getParameterTypes().length == 2) {
				name = name.substring(3);
				name = Character.toLowerCase(name.charAt(0)) + name.substring(1);

				FXProperty p = null;

				String signature = m.getParameterTypes()[1];

				String genericType = Signature.toString(signature);

				if (FXPrimitiveProperty.isPrimitive(genericType)) {
					p = new FXPrimitiveProperty(fxClass, name, m, Type.parseType(genericType), true);
				} else {
					String erasedFQNType = Util.getFQNType((IType) m.getParent(), Signature.getTypeErasure(genericType));
					if (erasedFQNType != null) {
						if (FXEnumProperty.isEnum(fxClass.getJavaProject(), erasedFQNType)) {
							p = new FXEnumProperty(fxClass, name, m, erasedFQNType, true);
						} else {
							p = new FXObjectPoperty(fxClass, name, m, erasedFQNType, true);
						}
					}
				}

				if (p != null) {
					rv.put(p.getName(), p);
				}
			}
		}

		return rv;
	}
}
