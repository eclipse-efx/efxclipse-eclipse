/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class HTMLLaunch {
	
	public static void main(String[] args) {
//		if (args.length==0) {
//			System.err.println("Aborting: no path to EMF resource provided!");
//			return;
//		}
		Injector injector = new org.eclipse.fx.ide.css.cssext.CssExtDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		HTMLLaunch main = injector.getInstance(HTMLLaunch.class);
		main.runGenerator("file:///Users/tomschindl/git/e-fx-clipse/org.eclipse.fx.ide.css.jfx/OSGI-INF/jfx2.cssext");
	}
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	private HTMLDocGenerator generator = new HTMLDocGenerator();

	protected void runGenerator(String string) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(string), true);
		
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}
		
		// configure and start the generator
		String data = generator.generate(resource).toString();
		try {
			FileOutputStream out = new FileOutputStream(new File("/Users/tomschindl/git/e-fx-clipse/org.eclipse.fx.ide.css.jfx/jfx2.html"));
			out.write(data.getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Code generation finished.");
	}
}
