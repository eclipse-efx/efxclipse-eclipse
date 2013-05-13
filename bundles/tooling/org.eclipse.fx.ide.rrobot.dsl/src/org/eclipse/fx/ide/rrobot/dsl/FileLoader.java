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
package org.eclipse.fx.ide.rrobot.dsl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class FileLoader {
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	private static RTaskRuntimeModule MODULE = new RTaskRuntimeModule();
	
	public RobotTask loadTask(URI uri) {
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(uri, true);
		return (RobotTask) resource.getContents().get(0); 
	}
	
	public static FileLoader createLoader() {
		Injector i = Guice.createInjector(MODULE);
		return i.getInstance(FileLoader.class);
	}
}
