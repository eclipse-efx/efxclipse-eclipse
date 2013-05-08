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

import static org.eclipse.fx.ide.model.internal.utils.Util.getFQNType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXCtrlField;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.osgi.service.log.LogService;


public class FXCtrlClass implements IFXCtrlClass {
	private IJavaProject javaProject;
	private IType type;
	private Map<String,IFXCtrlEventMethod> eventMethods;
	private Map<String,IFXCtrlField> fields;
	private IFXCtrlClass superClass;
	
	public FXCtrlClass(IJavaProject jp, IType type) {
		this.javaProject = jp;
		this.type = type;
		
		try {
			String s = type.getSuperclassName();
			
			if( s != null ) {
				s = getFQNType(type,s);
				superClass = FXPlugin.getClassmodel().findCtrlClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '"+type.getFullyQualifiedName()+"'", e );
		}
	}
	
	@Override
	public IType getType() {
		return type;
	}
	
	IJavaProject getJavaProject() {
		return javaProject;
	}

	@Override
	public String getSimpleName() {
		return type.getElementName();
	}

	public String getFQN() {
		return type.getFullyQualifiedName();
	}
	
	@Override
	public Map<String,IFXCtrlEventMethod> getAllEventMethods() {
		Map<String, IFXCtrlEventMethod> rv = new HashMap<String, IFXCtrlEventMethod>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllEventMethods());
		}
		rv.putAll(getLocalEventMethods());
		return Collections.unmodifiableMap(rv);
	}

	private Map<String,IFXCtrlEventMethod> getLocalEventMethods() {
		if( eventMethods == null )  {
			eventMethods = new HashMap<String, IFXCtrlEventMethod>();
			try {
				for( IMethod m : type.getMethods() ) {
					boolean annotated = false;
					for (IAnnotation a : m.getAnnotations()) {
						if (a.getElementName().endsWith("FXML")) {
							annotated = true;
							break;
						}
					}
					
					if( annotated ) {
						String[] types = m.getParameterTypes();
						if( types.length <= 1 ) {
							if( types.length == 1 )  {
								String erasedFQNType = Util.getFQNType((IType)m.getParent(), Signature.getTypeErasure(Signature.toString(types[0])));
								if( FXCtrlEventMethod.isEventMethod(javaProject, erasedFQNType) ) {
									eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this,m, erasedFQNType));	
								}
							} else {
								// Only if there's not already a method with the same id
								if( ! eventMethods.containsKey(m.getElementName()) ) {
									eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this,m,null));	
								}
							}
						}
					}
					
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return eventMethods;
	}
	
	@Override
	public Map<String,IFXCtrlField> getAllFields() {
		Map<String, IFXCtrlField> rv = new HashMap<String, IFXCtrlField>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllFields());
		}
		rv.putAll(getLocalFields());
		return Collections.unmodifiableMap(rv);
	}
	
	private Map<String,IFXCtrlField> getLocalFields() {
		if( fields == null ) {
			fields = new HashMap<String, IFXCtrlField>();
			try {
				for( IField f : type.getFields() ) {
					boolean annotated = false;
					for (IAnnotation a : f.getAnnotations()) {
						if (a.getElementName().endsWith("FXML")) {
							annotated = true;
							break;
						}
					}
					
					if( annotated ) {
						String erasedFQNType = Util.getFQNType((IType)f.getParent(), Signature.getTypeErasure(Signature.toString(f.getTypeSignature())));
						FXCtrlField field = new FXCtrlField(this, f, erasedFQNType);
						fields.put(f.getElementName(), field);
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return fields;
	}
}
