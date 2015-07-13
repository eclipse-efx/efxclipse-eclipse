/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.fx.ide.ui.wizards;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;



@SuppressWarnings("restriction")
public abstract class AbstractJDTElementPage<O extends JDTElement> extends WizardPage {
	private O clazz;
	private IPackageFragmentRoot froot;
	private IPackageFragment fragment;
	private IWorkspaceRoot fWorkspaceRoot;
	private Text nameField;

	protected AbstractJDTElementPage(String pageName, String title, String description, IPackageFragmentRoot froot, IPackageFragment fragment, IWorkspaceRoot fWorkspaceRoot) {
		super(pageName);
		if( froot == null ) {
			setMessage("Root is not a java project", IMessageProvider.ERROR);
		}
		this.froot = froot;
		this.fragment = fragment;
		this.fWorkspaceRoot = fWorkspaceRoot;

		setTitle(title);
		setDescription(description);
		setImageDescriptor(getTitleAreaImage(Display.getCurrent()));
	}

	public void createControl(Composite parent) {

		parent = new Composite(parent, SWT.NULL);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		parent.setLayout(new GridLayout(3, false));

		clazz = createInstance();
		clazz.setFragmentRoot(froot);
		clazz.setPackageFragment(fragment);


		DataBindingContext dbc = new DataBindingContext();

		{
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
					IPackageFragmentRoot root = choosePackageRoot();
					if( root != null ) {
						froot = root;
						clazz.setFragmentRoot(root);
					}
					bd.updateModelToTarget(); //TODO Find out why this is needed
				}
			});
		}

		{
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
					IPackageFragment fragment = choosePackage();
					if( fragment != null ) {
						clazz.setPackageFragment(fragment);
					}
					bd.updateModelToTarget(); //TODO Find out why this is needed
				}
			});
		}

		{
			IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);

			Label l = new Label(parent, SWT.NONE);
			l.setText("Name");

			nameField = new Text(parent, SWT.BORDER);
			nameField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			dbc.bindValue(textProp.observe(nameField), BeanProperties.value("name", String.class).observe(clazz));

			new Label(parent, SWT.NONE);
		}

		{
			Label l = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
			l.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false, 3, 1));
		}

		createFields(parent, dbc);
		setControl(parent);

		clazz.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				revalidate();
			}
		});
		setPageComplete(false);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		if( visible ) {
			nameField.setFocus();
		}
	}

	protected void revalidate() {
		if( getClazz().getName() == null || getClazz().getName().trim().length() == 0 ) {
			setPageComplete(false);
			setMessage("Enter a name", IMessageProvider.ERROR);
		} else if( froot == null ) {
			setPageComplete(false);
			setMessage("Root is not a java project", IMessageProvider.ERROR);
		} else {
			setPageComplete(true);
			setMessage(null);
		}
	}

	private IPackageFragmentRoot choosePackageRoot() {
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
		ElementTreeSelectionDialog dialog= new ElementTreeSelectionDialog(getShell(), labelProvider, provider);
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

	private IPackageFragment choosePackage() {
		IJavaElement[] packages= null;
		try {
			if (froot != null && froot.exists()) {
				packages= froot.getChildren();
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		if (packages == null) {
			packages= new IJavaElement[0];
		}

		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT));
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

	protected IPackageFragmentRoot getFragmentRoot() {
		return froot;
	}

	public IPackageFragment getFragment() {
		return fragment;
	}

	protected abstract void createFields(Composite parent, DataBindingContext dbc);

	protected abstract O createInstance();

	protected abstract ImageDescriptor getTitleAreaImage(Display display);

	public O getClazz() {
		return clazz;
	}

	static class ClassnameValidator implements IValidator {

		public IStatus validate(Object value) {
			String name = value.toString();
			char[] ar = name.toCharArray();
			for (char c : ar) {
				if (!Character.isJavaIdentifierPart(c)) {
					return new Status(IStatus.ERROR, "", "'" + c + "' is not allowed in a Class-Name");
				}
			}

			if (!Character.isJavaIdentifierStart(ar[0])) {
				return new Status(IStatus.ERROR, "", "'" + ar[0] + "' is not allowed as the first character of a Class-Name");
			}

			return Status.OK_STATUS;
		}
	}

	static class PackageFragmentRootToStringConverter extends Converter {

		public PackageFragmentRootToStringConverter() {
			super(IPackageFragmentRoot.class, String.class);
		}

		public Object convert(Object fromObject) {
			IPackageFragmentRoot f = (IPackageFragmentRoot) fromObject;
			if( f == null ) {
				return "";
			}
			return f.getPath().makeRelative().toString();
		}
	}

	static class PackageFragmentToStringConverter extends Converter {

		public PackageFragmentToStringConverter() {
			super(IPackageFragment.class, String.class);
		}

		public Object convert(Object fromObject) {
			if( fromObject == null ) {
				return "";
			}
			IPackageFragment f = (IPackageFragment) fromObject;
			return f.getElementName();
		}
	}


}
