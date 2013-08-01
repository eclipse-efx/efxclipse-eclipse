/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.compiler;

import java.lang.reflect.Method;

import javafx.beans.DefaultProperty;
import javafx.scene.Node;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class ReflectionFX {
	public static String defaultAttribute(JvmTypeReference type) throws ClassNotFoundException {
		Class<?> c = Class.forName(type.getQualifiedName(), false, ReflectionFX.class.getClassLoader());
		DefaultProperty p;
		do {
			p = c.getAnnotation(DefaultProperty.class);
			c = c.getSuperclass();
		} while( p == null && c != Object.class );
		
		return p.value();
	}
	
	
	
	public static Method getStaticMethod(JvmType type, String attribute) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> c = Class.forName(type.getQualifiedName(), false, ReflectionFX.class.getClassLoader());
		return c.getMethod("get"+StringExtensions.toFirstUpper(attribute), Node.class);
	}
}
