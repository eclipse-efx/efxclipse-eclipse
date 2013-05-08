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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.osgi.service.log.LogService;


import static org.eclipse.fx.ide.model.internal.utils.PropertiesUtil.*;
import static org.eclipse.fx.ide.model.internal.utils.Util.*;

public class FXClass implements IFXClass {
	public static final int STATE_DEFAULT_RESOLVED = 1;
	private IFXClass superClass;
	private IType type;
	
	private IJavaProject javaProject;
	private int state = 0;
	private IFXProperty defaultProperty;
	private Map<String,IFXProperty> properties;
	private Map<String, IFXProperty> staticProperties;
	private boolean valueOfResolved;
	private IMethod valueOfMethod;
	
	public FXClass(IJavaProject jp, IType type) {
		this.type = type;
		this.javaProject = jp;
		
		try {
			String s = type.getSuperclassName();
			
			if( s != null ) {
				s = getFQNType(type,Signature.getTypeErasure(s));
				superClass = FXPlugin.getClassmodel().findClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '"+type.getFullyQualifiedName()+"'", e );
		}
	}
	
	public String getFQN() {
		return type.getFullyQualifiedName();
	}

	public IType getType() {
		return type;
	}
	
	public IJavaProject getJavaProject() {
		return javaProject;
	}
	
	@Override
	public String getSimpleName() {
		return type.getElementName();
	}
	
	@Override
	public IFXProperty getDefaultProperty() {
		if( ! checkStatemask(state, STATE_DEFAULT_RESOLVED) ) {
			IAnnotation annotation = type.getAnnotation("javafx.beans.DefaultProperty");
			if( annotation.exists() ) {
				try {
					String v = getAnnotationMemberValue(annotation, "value");
					if( v != null ) {
						defaultProperty = getProperty(v);	
					}
				} catch (JavaModelException e) {
					FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve default annotation value for '"+type.getFullyQualifiedName()+"'", e);
				}
			}
			state |= STATE_DEFAULT_RESOLVED;
		}
		
		if( defaultProperty == null ) {
			if( superClass != null ) {
				return superClass.getDefaultProperty();
			}
		}
		
		return defaultProperty;
	}
	
	public IFXProperty getProperty(String name) {
		Map<String,IFXProperty> props = getAllProperties();
		return props.get(name);
	}
	
	public Map<String,IFXProperty> getAllProperties() {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllProperties());
		}
		rv.putAll(getLocalProperties());
		return Collections.unmodifiableMap(rv);
	}
	
	public Map<String, IFXProperty> getLocalProperties() {
		if( properties == null ) {
			try {
				properties = resolveProperties(this);
			} catch (JavaModelException e) {
				FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve properties of '"+type.getFullyQualifiedName()+"'", e);
			}
		}
		return Collections.unmodifiableMap(properties);
	}
	
	@Override
	public Map<String, IFXProperty> getAllStaticProperties() {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllStaticProperties());
		}
		rv.putAll(getLocalStaticProperties());
		return Collections.unmodifiableMap(rv);
	}
	
	@Override
	public Map<String, IFXProperty> getLocalStaticProperties() {
		if( staticProperties == null ) {
			try {
				staticProperties = resolveStaticProperties(this);
			} catch (JavaModelException e) {
				FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to static retrieve properties of '"+type.getFullyQualifiedName()+"'", e);
			}
		}
		return Collections.unmodifiableMap(staticProperties);
	}
	
	@Override
	public IFXProperty getStaticProperty(String name) {
		Map<String, IFXProperty> map = getLocalStaticProperties();
		return map.get(name);
	}
	
	@Override
	public IMethod getValueOf() {
//		if( ! valueOfResolved ) {
			try {
				for( IMethod m : type.getMethods() ) {
					if( Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && "valueOf".equals(m.getElementName()) ) {
						if( m.getParameterTypes().length == 1 ) {
//							String fqnType = Util.toFQN((IType) m.getParent(),m.getParameterTypes()[0]);
//							if("java.lang.String".equals( fqnType) ) {
								valueOfMethod = m; 
								break;	
//							}
						}
					}
				}
				valueOfResolved = true;
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		return valueOfMethod;
	}
}
