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
package org.eclipse.fx.ide.model.internal;

import static org.eclipse.fx.ide.model.internal.utils.PropertiesUtil.resolveProperties;
import static org.eclipse.fx.ide.model.internal.utils.PropertiesUtil.resolveStaticProperties;
import static org.eclipse.fx.ide.model.internal.utils.Util.checkStatemask;
import static org.eclipse.fx.ide.model.internal.utils.Util.getAnnotationMemberValue;
import static org.eclipse.fx.ide.model.internal.utils.Util.getFQNType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.osgi.service.log.LogService;

/**
 * Abstraction of an {@link IType} providing JavaFX relevant informations
 */
public class FXClass implements IFXClass {
	private static final int STATE_DEFAULT_RESOLVED = 1;
	private IFXClass superClass;
	private IType type;

	private IJavaProject javaProject;
	private int state = 0;
	private IFXProperty defaultProperty;
	private Map<String, IFXProperty> properties;
	private Map<String, IFXProperty> staticProperties;
	// private boolean valueOfResolved;
	private IMethod valueOfMethod;

	/**
	 * Create a new instance
	 *
	 * @param jp
	 *            the java project
	 * @param type
	 *            the type
	 */
	public FXClass(IJavaProject jp, IType type) {
		this.type = type;
		this.javaProject = jp;

		try {
			String s = type.getSuperclassName();

			if (s != null) {
				s = getFQNType(type, Signature.getTypeErasure(s));
				this.superClass = FXPlugin.getClassmodel().findClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '" + type.getFullyQualifiedName() + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	@Override
	public String getFQN() {
		return this.type.getFullyQualifiedName();
	}

	@Override
	public IType getType() {
		return this.type;
	}

	/**
	 * @return the java project the type is attached to
	 */
	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	@Override
	public String getSimpleName() {
		return this.type.getElementName();
	}

	@Override
	public IFXProperty getDefaultProperty() {
		if (!checkStatemask(this.state, STATE_DEFAULT_RESOLVED)) {
			IAnnotation annotation = this.type.getAnnotation("javafx.beans.DefaultProperty"); //$NON-NLS-1$
			if (annotation.exists()) {
				try {
					String v = getAnnotationMemberValue(annotation, "value"); //$NON-NLS-1$
					if (v != null) {
						this.defaultProperty = getProperty(v);
					}
				} catch (JavaModelException e) {
					FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve default annotation value for '" + this.type.getFullyQualifiedName() + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			this.state |= STATE_DEFAULT_RESOLVED;
		}

		if (this.defaultProperty == null) {
			if (this.superClass != null) {
				return this.superClass.getDefaultProperty();
			}
		}

		return this.defaultProperty;
	}

	@Override
	public IFXProperty getProperty(String name) {
		Map<String, IFXProperty> props = getAllProperties();
		return props.get(name);
	}

	@Override
	public Map<String, IFXProperty> getAllProperties() {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();
		if (this.superClass != null) {
			rv.putAll(this.superClass.getAllProperties());
		}
		rv.putAll(getLocalProperties());
		return Collections.unmodifiableMap(rv);
	}

	@Override
	public Map<String, IFXProperty> getLocalProperties() {
		if (this.properties == null) {
			try {
				this.properties = resolveProperties(this);
			} catch (JavaModelException e) {
				FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve properties of '" + this.type.getFullyQualifiedName() + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		return this.properties == null ? Collections.emptyMap() : Collections.unmodifiableMap(this.properties);
	}

	@Override
	public Map<String, IFXProperty> getAllStaticProperties() {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();
		if (this.superClass != null) {
			rv.putAll(this.superClass.getAllStaticProperties());
		}
		rv.putAll(getLocalStaticProperties());
		return Collections.unmodifiableMap(rv);
	}

	@Override
	public Map<String, IFXProperty> getLocalStaticProperties() {
		if (this.staticProperties == null) {
			try {
				this.staticProperties = resolveStaticProperties(this);
			} catch (JavaModelException e) {
				FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to static retrieve properties of '" + this.type.getFullyQualifiedName() + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		return Collections.unmodifiableMap(this.staticProperties);
	}

	@Override
	public IFXProperty getStaticProperty(String name) {
		Map<String, IFXProperty> map = getLocalStaticProperties();
		return map.get(name);
	}

	@Override
	public IMethod getValueOf() {
		// if( ! valueOfResolved ) {
		try {
			for (IMethod m : this.type.getMethods()) {
				if (Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && "valueOf".equals(m.getElementName())) { //$NON-NLS-1$
					if (m.getParameterTypes().length == 1) {
						// String fqnType = Util.toFQN((IType)
						// m.getParent(),m.getParameterTypes()[0]);
						// if("java.lang.String".equals( fqnType) ) {
						this.valueOfMethod = m;
						break;
						// }
					}
				}
			}
			// valueOfResolved = true;
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// }
		return this.valueOfMethod;
	}
}
