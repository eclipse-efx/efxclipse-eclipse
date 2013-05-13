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

import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit;
import org.eclipse.fx.ide.rrobot.model.task.Folder;
import org.eclipse.fx.ide.rrobot.model.task.JDTProject;
import org.eclipse.fx.ide.rrobot.model.task.SourceFragment;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;


public class JDTProjectHandler<P extends JDTProject> extends DefaultProjectHandler<P> {
	@Override
	public boolean isHandled(EClass eClass) {
		return eClass == TaskPackage.Literals.JDT_PROJECT;
	}
	
	protected IStatus customizeProject(IProgressMonitor monitor,IProject project, P model) {
		try {
			addNatureToProject(project, JavaCore.NATURE_ID, monitor);
			
			IJavaProject javaProject = JavaCore.create(project);
			
			javaProject.setOutputLocation(project.getFullPath().append("bin"), monitor); //FIXME has to come from model
			IClasspathEntry[] tmpEntries = createClasspathEntries(model);
			IClasspathEntry[] entries = new IClasspathEntry[tmpEntries.length+model.getSourceFragments().size()];
			int i = 0;
			for( SourceFragment f : model.getSourceFragments() ) {
				StringBuilder b = new StringBuilder();
				Folder folder = f.getFolder();
				while( folder != null ) {
					if( b.length() > 0 ) {
						b.insert(0, "/");
					}
					b.insert(0, folder.getName());
					if( folder.eContainer() instanceof Folder ) {
						folder = (Folder) folder.eContainer();
					} else {
						break;
					}
				}
				
				entries[i] = JavaCore.newSourceEntry(project.getProject().getFullPath().append(b.toString()));	
			}
			
			System.arraycopy(tmpEntries, 0, entries, model.getSourceFragments().size(), tmpEntries.length);
			javaProject.setRawClasspath(entries, monitor);
			
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Unable to add nature", e);
		}
		return super.customizeProject(monitor, project, model);
	}
	
	protected IStatus createResources(IProgressMonitor monitor, IProject p, P model, Map<String, Object> additionalData) {
		IStatus s = super.createResources(monitor, p, model, additionalData);
		
		if( !s.isOK() ) {
			return s;
		}
		
		for( CompilationUnit c : model.getCompilationUnits() ) {
			if( c.getExcludeExpression() != null ) {
				if( c.getExcludeExpression().execute(additionalData) ) {
					continue;
				}
			}
			Folder mFolder = c.getSourcefragment().getFolder();
			IFolder folder = getProjectFolder(p, mFolder);
			
			if( c.getPackagename().trim().length()  == 0) {
				createFile(monitor, folder.getFile(c.getFile().getName()), c.getFile(), additionalData);
			} else {
				String[] packs = c.getPackagename().split("\\.");
				for( String pack: packs ) {
					folder = folder.getFolder(pack);
					try {
						if( ! folder.exists() ) {
							folder.create(true, true, monitor);	
						}
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				createFile(monitor, folder.getFile(c.getFile().getName()), c.getFile(), additionalData);
			}
		}
		
//		if( ! p.getFolder("src").exists() ) {
//			try {
//				p.getFolder("src").create(true, true, monitor);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		if( ! p.getFolder("bin").exists() ) {
			try {
				p.getFolder("bin").create(true, true, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return s;
	}
	
	protected IClasspathEntry[] createClasspathEntries(P model) {
		return new IClasspathEntry[0];
	}
}