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
package org.eclipse.fx.ide.rrobot.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.text.StrSubstitutor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fx.ide.rrobot.ProjectHandler;
import org.eclipse.fx.ide.rrobot.RRobot;
import org.eclipse.fx.ide.rrobot.model.task.Project;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;
import org.eclipse.fx.ide.rrobot.model.task.Variable;


public class RRobotImpl implements RRobot {
	private List<ProjectHandler<Project>> handlers = new ArrayList<ProjectHandler<Project>>();

	public void addProjectHandler(ProjectHandler<Project> handler) {
		synchronized (handlers) {
			handlers.add(handler);
		}
	}

	public void removeProjectHandler(ProjectHandler<Project> handler) {
		synchronized (handlers) {
			handlers.remove(handler);
		}
	}
	
	private static Object getVariableData(Variable v) {
		switch (v.getType()) {
		case BOOLEAN:
			return Boolean.parseBoolean(v.getDefaultValue());
		case DOUBLE:
			return Double.parseDouble(v.getDefaultValue());
		case INT:
			return Integer.parseInt(v.getDefaultValue());
		default:
			return v.getDefaultValue();
		}
	}

	@Override
	public IStatus executeTask(IProgressMonitor monitor, RobotTask task, Map<String, Object> additionalData) {

		// We'll operate on a copy because we modify the model and replace variable
		if( ! task.getVariables().isEmpty() ) {
			task = EcoreUtil.copy(task);	
		}
		
		System.err.println("ADDITIONAL: " + additionalData);
		
		for( Variable v : task.getVariables() ) {
			if( !additionalData.containsKey(v.getKey()) ) {
				additionalData.put(v.getKey(), getVariableData(v));
			}
		}
		
		for( Entry<String, Object> e : additionalData.entrySet() ) {
			if( e.getValue() instanceof String ) {
				e.setValue(StrSubstitutor.replace((String)e.getValue(),additionalData));
			}
		}
		
		List<ProjectHandler<Project>> handlers;
		
		synchronized (this.handlers) {
			handlers = new ArrayList<ProjectHandler<Project>>(this.handlers);	
		}
		
		TreeIterator<EObject> it = task.eAllContents();
		while( it.hasNext() ) {
			EObject eo = it.next();
			for( EStructuralFeature f : eo.eClass().getEAllStructuralFeatures() ) {
				Object val = eo.eGet(f);
				if( val instanceof String ) {
//					System.err.println("REPLACING: " + f + " val: " + val);
					eo.eSet(f,StrSubstitutor.replace(val, additionalData));
				}
			}
		}
		
		System.err.println("ADDITIONAL: " + additionalData);
		
		List<IStatus> states = new ArrayList<IStatus>();
		for( Project p : task.getProjects() ) {
			for( ProjectHandler<Project> handler : handlers ) {
				if( handler.isHandled(p.eClass()) ) {
					states.add(handler.createProject(monitor, p, additionalData));
				}
			}	
		}
		
		return new MultiStatus("org.eclipse.fx.ide.rrobot", 0, states.toArray(new IStatus[0]), "Task executed", null);
	}

}
