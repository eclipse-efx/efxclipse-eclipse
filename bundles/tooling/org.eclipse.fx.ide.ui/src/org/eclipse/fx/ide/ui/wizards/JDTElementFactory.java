/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.wizards;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage.PackageFragmentRootToStringConverter;
import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage.PackageFragmentToStringConverter;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.wizards.NewWizardMessages;
import org.eclipse.jdt.internal.ui.wizards.TypedElementSelectionValidator;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.ui.JavaElementComparator;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

public class JDTElementFactory {
	public static void createSourceFolderElement(Composite parent, DataBindingContext dbc, JDTElement clazz, IWorkspaceRoot fWorkspaceRoot) {
		Label l = new Label(parent, SWT.NONE);
		l.setText("Source folder");

		Text t = new Text(parent, SWT.BORDER);
		t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		t.setEditable(false);
		final Binding bd = dbc.bindValue(
				WidgetProperties.text().observe(t),
				BeanProperties.value("fragmentRoot").observe(clazz),
				new UpdateValueStrategy(),
				new UpdateValueStrategy().setConverter(new PackageFragmentRootToStringConverter())
		);

		Button b = new Button(parent, SWT.PUSH);
		b.setText("Browse ...");
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IPackageFragmentRoot root = choosePackageRoot(parent.getShell(),clazz,fWorkspaceRoot);
				if( root != null ) {
					clazz.setFragmentRoot(root);
				}
				bd.updateModelToTarget(); //TODO Find out why this is needed
			}
		});
	}

	public static void createPackageElement(Composite parent, DataBindingContext dbc, JDTElement clazz) {
		Label l = new Label(parent, SWT.NONE);
		l.setText("Package");

		Text t = new Text(parent, SWT.BORDER);
		t.setEditable(false);
		t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final Binding bd = dbc.bindValue(
				WidgetProperties.text().observe(t),
				BeanProperties.value("packageFragment").observe(clazz),
				new UpdateValueStrategy(),
				new UpdateValueStrategy().setConverter(new PackageFragmentToStringConverter())
		);

		Button b = new Button(parent, SWT.PUSH);
		b.setText("Browse ...");
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IPackageFragment fragment = choosePackage(parent.getShell(),clazz);
				if( fragment != null ) {
					clazz.setPackageFragment(fragment);
				}
				bd.updateModelToTarget(); //TODO Find out why this is needed
			}
		});
	}

	private static IPackageFragment choosePackage(Shell s, JDTElement clazz) {
		IJavaElement[] packages= null;
		try {
			if (clazz.getFragmentRoot() != null && clazz.getFragmentRoot().exists()) {
				packages= clazz.getFragmentRoot().getChildren();
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		if (packages == null) {
			packages= new IJavaElement[0];
		}

		ElementListSelectionDialog dialog= new ElementListSelectionDialog(s, new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT));
		dialog.setIgnoreCase(false);
		dialog.setTitle("Choose Package");
		dialog.setMessage("Choose a Package");
		dialog.setEmptyListMessage("You need to select a package");
		dialog.setElements(packages);
		dialog.setHelpAvailable(false);

		IPackageFragment pack= clazz.getPackageFragment();
		if (pack != null) {
			dialog.setInitialSelections(new Object[] { pack });
		}

		if (dialog.open() == Window.OK) {
			return (IPackageFragment) dialog.getFirstResult();
		}
		return null;
	}

	private static IPackageFragmentRoot choosePackageRoot(Shell shell, JDTElement clazz, IWorkspaceRoot fWorkspaceRoot) {
		IJavaElement initElement= clazz.getFragmentRoot();
		Class<?>[] acceptedClasses= new Class<?>[] { IPackageFragmentRoot.class, IJavaProject.class };
		TypedElementSelectionValidator validator= new TypedElementSelectionValidator(acceptedClasses, false) {
			public boolean isSelectedValid(Object element) {
				try {
					if (element instanceof IJavaProject) {
						IJavaProject jproject= (IJavaProject)element;
						IPath path= jproject.getProject().getFullPath();
						return (jproject.findPackageFragmentRoot(path) != null);
					} else if (element instanceof IPackageFragmentRoot) {
						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
					}
					return true;
				} catch (JavaModelException e) {
					JavaPlugin.log(e.getStatus()); // just log, no UI in validation
				}
				return false;
			}
		};

		acceptedClasses= new Class[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class };
		ViewerFilter filter= new TypedViewerFilter(acceptedClasses) {
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IPackageFragmentRoot) {
					try {
						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
					} catch (JavaModelException e) {
						JavaPlugin.log(e.getStatus()); // just log, no UI in validation
						return false;
					}
				}
				return super.select(viewer, parent, element);
			}
		};

		StandardJavaElementContentProvider provider= new StandardJavaElementContentProvider();
		ILabelProvider labelProvider= new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog= new ElementTreeSelectionDialog(shell, labelProvider, provider);
		dialog.setValidator(validator);
		dialog.setComparator(new JavaElementComparator());
		dialog.setTitle(NewWizardMessages.NewContainerWizardPage_ChooseSourceContainerDialog_title);
		dialog.setMessage(NewWizardMessages.NewContainerWizardPage_ChooseSourceContainerDialog_description);
		dialog.addFilter(filter);
		dialog.setInput(JavaCore.create(fWorkspaceRoot));
		dialog.setInitialSelection(initElement);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element= dialog.getFirstResult();
			if (element instanceof IJavaProject) {
				IJavaProject jproject= (IJavaProject)element;
				return jproject.getPackageFragmentRoot(jproject.getProject());
			} else if (element instanceof IPackageFragmentRoot) {
				return (IPackageFragmentRoot)element;
			}
			return null;
		}
		return null;
	}
}
