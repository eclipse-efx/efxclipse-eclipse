package org.eclipse.fx.ide.css.cssext.ui;


import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DataBindingException;

import org.eclipse.core.databinding.BindingProperties;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.internal.databinding.property.PropertyObservableUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.ui.adapter.ICssResource;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

public class CSSEditorPropertyPage extends PropertyPage implements IWorkbenchPropertyPage {

	private Logger logger;
	private Logger getLogger() {
		if (this.logger == null) {
			this.logger = LoggerCreator.createLogger(CSSEditorPropertyPage.class);
		}
		return this.logger;
	}
	
	public CSSEditorPropertyPage() {
		
		// get the selection
		
	}
	
	private IObservableValue master = new WritableValue();
	
	@Override
	protected Control createContents(Composite parent) {
		
		DataBindingContext dbc = new DataBindingContext();
		
		IContainer elementContainer = getElementContainer();
		IFile elementFile = getElementFile();
		
		boolean useCustom = false;
		boolean isFile = elementFile != null;
		
		Composite area = new Composite(parent, SWT.NONE);
		area.setLayout(new GridLayout(1, true));
		
		final Button b = new Button(area, SWT.CHECK);
		b.setText("Use custom definition");
		IObservableValue useCustomObsModel = BeansObservables.observeDetailValue(master, "useCustom", Boolean.class);
		ISWTObservableValue useCustomObsUI = SWTObservables.observeSelection(b);
		dbc.bindValue(useCustomObsUI, useCustomObsModel);
		
		
		final Label l = new Label(area, SWT.NONE);
		l.setEnabled(useCustom);
		ISWTObservableValue lEnabled = SWTObservables.observeEnabled(l);
		dbc.bindValue(lEnabled, useCustomObsModel);
		
		
		final TableViewer extensionViewer = new TableViewer(area, SWT.BORDER | SWT.FULL_SELECTION);
		extensionViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
//		vClasspath.setLabelProvider(new LabelProvider() {
//			@Override
//			public String getText(Object element) {
//				URI uri = (URI) element;
//				return uri.toString();
//			}
//		});
		
		final TableViewerColumn colInherited = new TableViewerColumn(extensionViewer, SWT.NONE);
		colInherited.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				URI uri = (URI) element;
				if (isInherited(uri)) {
					return "I";
				}
				else {
					return "";
				}
				
			}
		});
		colInherited.getColumn().setWidth(30);
		colInherited.getColumn().setText("Inherited");
		
		final TableViewerColumn colDisabled = new TableViewerColumn(extensionViewer, SWT.NONE);
		colDisabled.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final URI uri = (URI) element;
				if (isDisabledInherited(uri)) {
					return "DI";
				}
				else if (isDisabledLocal(uri)) {
					return "D";
				}
				else {
					return "";
				}
				
			}
		});
		colDisabled.getColumn().setWidth(30);
		colDisabled.getColumn().setText("Disabled");
		
		TableViewerColumn colName = new TableViewerColumn(extensionViewer, SWT.NONE);
		colName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final URI uri = (URI) element;
				return lookupRootPackage(uri);
			}
		});
		colName.getColumn().setWidth(200);
		colName.getColumn().setText("Name");
		
		TableViewerColumn colURI = new TableViewerColumn(extensionViewer, SWT.NONE);
		colURI.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final URI uri = (URI) element;
				return uri.toString();
			}
		});
		colURI.getColumn().setWidth(200);
		colURI.getColumn().setText("URI");
		
		extensionViewer.getTable().setHeaderVisible(true);
		extensionViewer.setContentProvider(new ArrayContentProvider());
		ISWTObservableValue vClasspathEnabled = SWTObservables.observeEnabled(extensionViewer.getControl());
		dbc.bindValue(vClasspathEnabled, useCustomObsModel);
		
		final TableViewer vUser = new TableViewer(area, SWT.CHECK | SWT.BORDER | SWT.FULL_SELECTION);
		vUser.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		vUser.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				URI uri = (URI) element;
				return uri.toString();
			}
		});
		vUser.setContentProvider(new ArrayContentProvider());
		ISWTObservableValue vUserEnabled = SWTObservables.observeEnabled(vUser.getControl());
		dbc.bindValue(vUserEnabled, useCustomObsModel);
		
		final IAction disable = new Action("disable") {
			@Override
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) extensionViewer.getSelection();
				if (!ss.isEmpty()) {
					URI uri = (URI) ss.getFirstElement();
					if (!isDisabledLocal(uri)) {
						getMasterValue().addDisabledExtension(uri);
						extensionViewer.refresh();
					}
				}
			}
		};
		final IAction enable = new Action("enable") {
			public void run() {
				IStructuredSelection ss = (IStructuredSelection) extensionViewer.getSelection();
				if (!ss.isEmpty()) {
					URI uri = (URI) ss.getFirstElement();
					if (isDisabledLocal(uri)) {
						getMasterValue().removeDisabledExtension(uri);
						extensionViewer.refresh();
					}				}
			}
		};
		
		MenuManager mm = new MenuManager();
		Menu m = mm.createContextMenu(extensionViewer.getTable());
		
		mm.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				IStructuredSelection ss = (IStructuredSelection) extensionViewer.getSelection();
				if (!ss.isEmpty()) {
					URI e = (URI) ss.getFirstElement();
					if (isDisabledLocal(e)) { 
						manager.add(enable);
					}
					else {
						if (!isDisabledInherited(e)) {
							manager.add(disable);
						}
					}
				}
				
				
			}
		});
		
		mm.setRemoveAllWhenShown(true);
		extensionViewer.getTable().setMenu(m);
		
		
		
		master.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				String str = "<null>";
				if (event.diff.getNewValue() != null) {
					str = event.diff.getNewValue().toString();
				}
				l.setText("ICssResource: " + str);
				
				
			final ICssResource r = (ICssResource) event.diff.getNewValue();
				if (r != null) {
//					vUser.setInput(r.getUserAddedExtensions());
					ArrayList<URI> input = new ArrayList<>();
					
					List<URI> inheritedClasspathExtensions = r.getInheritedClasspathExtensions();
					getLogger().debug("adding inherited classpath extensions: " + inheritedClasspathExtensions.size() + " / " + inheritedClasspathExtensions);
					input.addAll(inheritedClasspathExtensions);
					getLogger().debug("result -> " + input.size() + " / " + input);
					List<URI> classpathExtensions = r.getClasspathExtensions();
					getLogger().debug("adding classpath extensions: " + classpathExtensions.size() + " / " + classpathExtensions);
					input.addAll(classpathExtensions);
					getLogger().debug("result -> " + input.size() + " / " + input);
					List<URI> inheritedCustomExtensions = r.getInheritedCustomExtensions();
					getLogger().debug("adding inherited custom extensions: " + inheritedCustomExtensions.size() + " / " + inheritedCustomExtensions);
					input.addAll(inheritedCustomExtensions);
					getLogger().debug("result -> " + input.size() + " / " + input);
					List<URI> customExtensions = r.getCustomExtensions();
					getLogger().debug("adding custom extensions: " + customExtensions.size() + " / " + customExtensions);
					input.addAll(customExtensions);
					getLogger().debug("result -> " + input.size() + " / " + input);
					
					getLogger().debug("SETTING INPUT TO " + input);
					extensionViewer.setInput(input);
				}
				else {
					extensionViewer.setInput(null);
					vUser.setInput(null);
				}
			}
		});
		
		
		
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean useCustom = b.getSelection();
				l.setEnabled(useCustom);
				vUser.getTable().setEnabled(useCustom);
			}
		});
		
		// bind
		//getLogger().debug("ELEMENT: " + getElement() + " = " + getElement().getClass().getSimpleName());
		this.master.setValue(getCssResource());
		
		return area;
	}
	
	protected boolean isInherited(URI uri) {
		return getMasterValue().getInheritedClasspathExtensions().contains(uri) || getMasterValue().getCustomExtensions().contains(uri);
	}
	
	protected boolean isDisabledInherited(URI uri) {
		return getMasterValue().getInheritedDisabledExtensions().contains(uri);
	}
	
	protected boolean isDisabledLocal(URI uri) {
		return getMasterValue().getDisabledExtensions().contains(uri);
	}
	
	protected String lookupRootPackage(URI uri) {
		CssExtension extension = getMasterValue().getExtension(uri);
		if (extension != null) {
			return extension.getPackageDef().getName();
		}
		return "read error";
	}
	
	@Override
	protected void performApply() {
		try {
			((ICssResource)master.getValue()).save();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void performDefaults() {
		getMasterValue().clearCustomExtensions();
		getMasterValue().clearDisabledExtensions();
	}
	
	protected ICssResource getMasterValue() {
		return (ICssResource) master.getValue();
	}
	
	private IContainer getElementContainer() {
		return (IContainer) Platform.getAdapterManager().getAdapter(getElement(), IContainer.class);
	}
	
	private IFile getElementFile() {
		return (IFile) Platform.getAdapterManager().getAdapter(getElement(), IFile.class);
	}
	
	private IResource getElementAsResource() {
		if (getElement() instanceof IResource) {
			return (IResource) getElement();
		}
		else {
			return (IResource) Platform.getAdapterManager().getAdapter(getElement(), IResource.class);
		}
	}

	private ICssResource getCssResource() {
		return (ICssResource) Platform.getAdapterManager().getAdapter(getElementAsResource(), ICssResource.class);
	}
}
