package org.eclipse.fx.ide.css.cssext.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.ide.css.cssext.ui.CssFile.CssExtensionNfo;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.handlers.HandlerUtil;

public class CSSEditorPropertyPage extends PropertyPage implements IWorkbenchPropertyPage {

	public CSSEditorPropertyPage() {
		
		// get the selection
		
	}

	@Override
	protected Control createContents(Composite parent) {
		
		IContainer elementContainer = getElementContainer();
		IFile elementFile = getElementFile();
		
		boolean useCustom = false;
		boolean isFile = elementFile != null;
		
		Composite area = new Composite(parent, SWT.NONE);
		area.setLayout(new GridLayout(1, true));
		
			
		final Button b = new Button(area, SWT.CHECK);
		b.setText("Use custom definition");
		b.setSelection(useCustom);

		
		System.err.println("ELEMENT: " + getElement() + " = " + getElement().getClass().getSimpleName());
		final CssFile cssFile = getCssFile();
		
		final Label l = new Label(area, SWT.NONE);
		l.setText("This is my Property Page\n" + (cssFile != null ? cssFile.toString() : "cssFile was null!"));
		l.setEnabled(useCustom);
		
		final TableViewer v = new TableViewer(area, SWT.CHECK | SWT.BORDER | SWT.FULL_SELECTION);
		v.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		v.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				CssExtensionNfo nfo = (CssExtensionNfo) element;
				return nfo.uri.toString();
			}
		});
		v.setContentProvider(new ArrayContentProvider());
		
		if (cssFile != null) {
			v.getTable().setEnabled(useCustom);
			v.setInput(cssFile.collectCssExtension());
		}
		
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean useCustom = b.getSelection();
				l.setEnabled(useCustom);
				v.getTable().setEnabled(useCustom);
			}
		});
		
		final Button but = new Button(area, SWT.PUSH);
		but.setText("Test");
		but.setLayoutData(new GridData(GridData.FILL_BOTH));
		but.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (cssFile != null)
					cssFile.getCssExtensions();
			}
		});
		
		return area;
	}
	
	private IContainer getElementContainer() {
		return (IContainer) Platform.getAdapterManager().getAdapter(getElement(), IContainer.class);
	}
	
	private IFile getElementFile() {
		return (IFile) Platform.getAdapterManager().getAdapter(getElement(), IFile.class);
	}

	
	private CssFile getCssFile() {
		return (CssFile) Platform.getAdapterManager().getAdapter(getElement(), CssFile.class);
	}
}
