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
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.osgi.service.log.LogService;

/**
 * Provide meta data for a controller class
 */
public class FXCtrlClass implements IFXCtrlClass {
	private IJavaProject javaProject;
	private IType type;
	private Map<String, IFXCtrlEventMethod> eventMethods;
	private Map<String, IFXCtrlField> fields;
	private IFXCtrlClass superClass;

	/**
	 * Create a new instance
	 *
	 * @param jp
	 *            the java project the type is contained in
	 * @param type
	 *            the type of the controller
	 */
	public FXCtrlClass(IJavaProject jp, IType type) {
		this.javaProject = jp;
		this.type = type;

		try {
			String s = type.getSuperclassName();

			if (s != null) {
				s = getFQNType(type, s);
				this.superClass = FXPlugin.getClassmodel().findCtrlClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '" + type.getFullyQualifiedName() + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	@Override
	public IType getType() {
		return this.type;
	}

	IJavaProject getJavaProject() {
		return this.javaProject;
	}

	@Override
	public String getSimpleName() {
		return this.type.getElementName();
	}

	@Override
	public String getFQN() {
		return this.type.getFullyQualifiedName();
	}

	@Override
	public Map<String, IFXCtrlEventMethod> getAllEventMethods() {
		Map<String, IFXCtrlEventMethod> rv = new HashMap<String, IFXCtrlEventMethod>();
		if (this.superClass != null) {
			rv.putAll(this.superClass.getAllEventMethods());
		}
		rv.putAll(getLocalEventMethods());
		return Collections.unmodifiableMap(rv);
	}

	private Map<String, IFXCtrlEventMethod> getLocalEventMethods() {
		if (this.eventMethods == null) {
			this.eventMethods = new HashMap<String, IFXCtrlEventMethod>();
			try {
				for (IMethod m : this.type.getMethods()) {
					boolean annotated = Flags.isPublic(m.getFlags());
					if (!annotated) {
						for (IAnnotation a : m.getAnnotations()) {
							if (a.getElementName().endsWith("FXML")) { //$NON-NLS-1$
								annotated = true;
								break;
							}
						}
					}

					if (annotated) {
						String[] types = m.getParameterTypes();
						if (types.length <= 1) {
							if (types.length == 1) {
								String erasedFQNType = Util.getFQNType((IType) m.getParent(), Signature.getTypeErasure(Signature.toString(types[0])));
								if (FXCtrlEventMethod.isEventMethod(this.javaProject, erasedFQNType)) {
									this.eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this, m, erasedFQNType));
								}
							} else {
								// Only if there's not already a method with the
								// same id
								if (!this.eventMethods.containsKey(m.getElementName())) {
									this.eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this, m, null));
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

		return this.eventMethods;
	}

	@Override
	public Map<String, IFXCtrlField> getAllFields() {
		Map<String, IFXCtrlField> rv = new HashMap<String, IFXCtrlField>();
		if (this.superClass != null) {
			rv.putAll(this.superClass.getAllFields());
		}
		rv.putAll(getLocalFields());
		return Collections.unmodifiableMap(rv);
	}

	private Map<String, IFXCtrlField> getLocalFields() {
		if (this.fields == null) {
			this.fields = new HashMap<String, IFXCtrlField>();
			try {
				for (IField f : this.type.getFields()) {
					boolean annotated = Flags.isPublic(f.getFlags());
					if (!annotated) {
						for (IAnnotation a : f.getAnnotations()) {
							if (a.getElementName().endsWith("FXML")) { //$NON-NLS-1$
								annotated = true;
								break;
							}
						}
					}

					if (annotated) {
						String erasedFQNType = Util.getFQNType((IType) f.getParent(), Signature.getTypeErasure(Signature.toString(f.getTypeSignature())));
						FXCtrlField field = new FXCtrlField(this, f, erasedFQNType);
						this.fields.put(f.getElementName(), field);
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return this.fields;
	}
}
