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
package org.eclipse.fx.ide.model;

public interface IFXPrimitiveProperty extends IFXProperty {
	public enum Type {
		DOUBLE("double"), FLOAT("float"), LONG("long"), INTEGER("integer"), CHAR("char"), SHORT("short"), BYTE("byte"), BOOLEAN("boolean"), STRING("java.lang.String");

		private final String jvmType;

		private Type(String jvmType) {
			this.jvmType = jvmType;
		}

		public String jvmType() {
			return jvmType;
		}

		public static Type parseType(String type) {
			for (Type t : values()) {
				if (t.jvmType.equals(type)) {
					return t;
				}
			}
			return null;
		}
	}

	public Type getType();
}
