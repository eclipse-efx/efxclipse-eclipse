/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.fx.ide.ui.wizards;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;



public abstract class AbstractNewJDTElementWizard<O extends JDTElement> extends Wizard implements INewWizard {
	private IPackageFragmentRoot root;
	private IPackageFragment fragment;
	private IFile file;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		IJavaElement jElement = getInitialJavaElement(selection);
		root = getFragmentRoot(jElement);
		fragment = getFragment(jElement);
	}

	public IPackageFragmentRoot getRoot() {
		if( getPages().length > 0 && getPages()[0] instanceof AbstractJDTElementPage<?>) {
			return ((AbstractJDTElementPage<?>)getPages()[0]).getFragmentRoot();
		}
		return root;
	}

	public IPackageFragment getFragment() {
		if( getPages().length > 0 && getPages()[0] instanceof AbstractJDTElementPage<?>) {
			return ((AbstractJDTElementPage<?>)getPages()[0]).getFragment();
		}
		return fragment;
	}

	public IPackageFragmentRoot getInitialRoot() {
		return root;
	}

	public IPackageFragment getInitialFragment() {
		return fragment;
	}

	private IPackageFragment getFragment(IJavaElement jElement) {
		if( jElement instanceof IPackageFragment ) {
			return (IPackageFragment) jElement;
		}
		return null;
	}

	protected IJavaElement getInitialJavaElement(IStructuredSelection selection) {
		IJavaElement jelem = null;
		if (selection != null && !selection.isEmpty()) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;

				jelem = (IJavaElement) adaptable.getAdapter(IJavaElement.class);
				if (jelem == null || !jelem.exists()) {
					jelem = null;
					IResource resource = (IResource) adaptable
							.getAdapter(IResource.class);
					if (resource != null
							&& resource.getType() != IResource.ROOT) {
						while (jelem == null
								&& resource.getType() != IResource.PROJECT) {
							resource = resource.getParent();
							jelem = (IJavaElement) resource
									.getAdapter(IJavaElement.class);
						}
						if (jelem == null) {
							jelem = JavaCore.create(resource); // java project
						}
					}
				}
			}
		}

		return jelem;
	}

	protected IPackageFragmentRoot getFragmentRoot(IJavaElement elem) {
		IPackageFragmentRoot initRoot = null;
		if (elem != null) {
			initRoot = (IPackageFragmentRoot) elem
					.getAncestor(IJavaElement.PACKAGE_FRAGMENT_ROOT);
			try {
				if (initRoot == null
						|| initRoot.getKind() != IPackageFragmentRoot.K_SOURCE) {
					IJavaProject jproject = elem.getJavaProject();
					if (jproject != null) {
						initRoot = null;
						if (jproject.exists()) {
							IPackageFragmentRoot[] roots = jproject
									.getPackageFragmentRoots();
							for (int i = 0; i < roots.length; i++) {
								if (roots[i].getKind() == IPackageFragmentRoot.K_SOURCE) {
									initRoot = roots[i];
									break;
								}
							}
						}
						if (initRoot == null) {
							initRoot = jproject.getPackageFragmentRoot(jproject
									.getResource());
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO
				e.printStackTrace();
			}
		}
		return initRoot;
	}

	protected abstract IGenerator<O> getGenerator();

	@SuppressWarnings("unchecked")
	public O getDomainClass() {
		return ((AbstractJDTElementPage<O>) getPages()[0]).getClazz();
	}

	protected Set<String> getRequiredBundles() {
		Set<String> rv = new HashSet<String>();
		rv.add("javax.inject");
		return rv;
	}

	@Override
	public boolean performFinish() {
		O clazz = getDomainClass();
		if( clazz == null ) {
			MessageDialog.openError(getShell(), "No domain object", "Please file a bug against e(fx)clipse with steps to reproduce this problem");
			return false;
		} else {
			String content = getGenerator().generateContent(clazz).toString();

			if( clazz.getFragmentRoot() == null ) {
				return false;
			}

			IFile file = createFile();

			if( file != null ) {
				try {
					if (!file.exists()) {
						file.create(new ByteArrayInputStream(content.getBytes()),
								true, null);
					} else {
						if( MessageDialog.openQuestion(getShell(), "File exists", "The file " + file.getName() + " already exists. Would you like to proceed?") ) {
							file.setContents(new ByteArrayInputStream(content.getBytes()),
									IFile.FORCE | IFile.KEEP_HISTORY, null);
						} else {
							return false;
						}
					}
					IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return true;
		}
	}

	protected abstract IFile createFile();

	public IFile getFile() {
		return file;
	}
}
