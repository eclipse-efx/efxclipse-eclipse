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
package org.eclipse.fx.ide.fxml.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.fx.ide.fxml.Activator;
import org.eclipse.fx.ide.fxml.wizards.template.FXMLElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage;

/**
 * Page to create FXML
 */
public class FXMLWizardPage extends AbstractJDTElementPage<FXMLElement> {
	IType customSelection;

	protected FXMLWizardPage(IPackageFragmentRoot froot, IPackageFragment fragment, IWorkspaceRoot fWorkspaceRoot) {
		super("fxml", Messages.FXMLWizardPage_1, Messages.FXMLWizardPage_0, froot, fragment, fWorkspaceRoot); //$NON-NLS-1$
	}

	@Override
	protected ImageDescriptor getTitleAreaImage(Display display) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/title_banner.png"); //$NON-NLS-1$
	}

	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		{
			Label l = new Label(parent, SWT.NONE);
			l.setText(Messages.FXMLWizardPage_4);

			final ComboViewer viewer = new ComboViewer(parent);
			viewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					IType t = (IType)element;
					return t.getElementName() + " - " + t.getPackageFragment().getElementName(); //$NON-NLS-1$
				}
			});
			viewer.setContentProvider(new ArrayContentProvider());
			List<IType> types = getTypes();
			viewer.setInput(types);
			viewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			Button button = new Button(parent, SWT.PUSH);
			button.setText(Messages.FXMLWizardPage_6);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					IType type = findContainerType();
					if( type != null ) {
						FXMLWizardPage.this.customSelection = type;
						viewer.setInput(getTypes());
						viewer.setSelection(new StructuredSelection(type));
					}
				}
			});

			FXMLElement element = getClazz();
			element.addPropertyChangeListener(new PropertyChangeListener() {

				@Override
				public void propertyChange(PropertyChangeEvent evt) {
					if( "fragmentRoot".equals(evt.getPropertyName()) ) { //$NON-NLS-1$
						viewer.setInput(getTypes());
					}
				}
			});
			dbc.bindValue(ViewerProperties.singleSelection().observe(viewer), BeanProperties.value("rootElement").observe(getClazz())); //$NON-NLS-1$

			if( types.size() > 0 ) {
				viewer.setSelection(new StructuredSelection(types.get(0)));
			}
		}

		{
			Label l = new Label(parent, SWT.NONE);
			l.setText(Messages.FXMLWizardPage_9);

			Button b = new Button(parent, SWT.CHECK);
			dbc.bindValue(WidgetProperties.selection().observe(b), BeanProperties.value("fxRoot").observe(getClazz())); //$NON-NLS-1$
		}
	}

	IType findContainerType() {
		if( getClazz().getFragmentRoot() != null ) {
			IJavaProject project= getClazz().getFragmentRoot().getJavaProject();

			try {
				IType superType = project.findType("javafx.scene.Parent"); //$NON-NLS-1$

				if( superType != null ) {
					IJavaSearchScope searchScope = SearchEngine.createStrictHierarchyScope(project, superType, true, false, null);

					SelectionDialog dialog = JavaUI.createTypeDialog(getShell(), PlatformUI.getWorkbench().getProgressService(), searchScope, IJavaElementSearchConstants.CONSIDER_CLASSES, false, ""); //$NON-NLS-1$
					dialog.setTitle(Messages.FXMLWizardPage_3);
					if (dialog.open() == Window.OK) {
						IType type = (IType) dialog.getResult()[0];
						return type;
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	protected void revalidate() {
		if( getClazz().getName() == null || getClazz().getName().trim().length() == 0 ) {
			setPageComplete(false);
			setMessage(Messages.FXMLWizardPage_2, IMessageProvider.ERROR);
		} else if(getClazz().getRootElement() == null) {
			setPageComplete(false);
			setMessage(Messages.FXMLWizardPage_10, IMessageProvider.ERROR);
		} else if(Character.isLowerCase(getClazz().getName().charAt(0))) {
			setPageComplete(true);
			setMessage(Messages.FXMLWizardPage_5, IMessageProvider.WARNING);
		} else {
			setPageComplete(true);
			setMessage(null);
		}
	}

	List<IType> getTypes() {
		List<IType> list = new ArrayList<IType>();

		if( getClazz().getFragmentRoot() != null ) {
			IJavaProject jp = getClazz().getFragmentRoot().getJavaProject();

			if( this.customSelection != null ) {
				try {
					IType t = jp.findType(this.customSelection.getFullyQualifiedName());
					if( t != null && ! list.contains(t) ) {
						list.add(t);
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if( getDialogSettings() != null ) {
				if( getDialogSettings().getArray(NewFXMLWizard.KEY_LAST_SELECTIONS) != null ) {
					for( String s : getDialogSettings().getArray(NewFXMLWizard.KEY_LAST_SELECTIONS) ) {
						try {
							IType t = jp.findType(s);
							if( t != null && ! list.contains(t) ) {
								list.add(t);
							}
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

			for(String s : new String[] {
					"javafx.scene.layout.AnchorPane",  //$NON-NLS-1$
					"javafx.scene.layout.BorderPane",  //$NON-NLS-1$
					"javafx.scene.layout.FlowPane",  //$NON-NLS-1$
					"javafx.scene.layout.GridPane",  //$NON-NLS-1$
					"javafx.scene.layout.HBox",  //$NON-NLS-1$
					"javafx.scene.layout.Region",  //$NON-NLS-1$
					"javafx.scene.layout.StackPane",  //$NON-NLS-1$
					"javafx.scene.layout.TilePane",  //$NON-NLS-1$
					"javafx.scene.layout.VBox", //$NON-NLS-1$
					"javafx.scene.Scene" //$NON-NLS-1$
				}) {
				try {
					IType t = jp.findType(s);
					if( t != null && ! list.contains(t) ) {
						list.add(t);
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return list;
	}



	@Override
	protected FXMLElement createInstance() {
		return new FXMLElement();
	}
}
