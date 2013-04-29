package org.eclipse.fx.ide.ui.wizards.internal;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;

public class JFXWorkbenchPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private Text scenebuilder;

	public JFXWorkbenchPreferencePage() {
	}

	public JFXWorkbenchPreferencePage(String title) {
		super(title);
	}

	public JFXWorkbenchPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected Control createContents(Composite parent) {
		parent = new Composite(parent, SWT.NONE);
		parent.setLayout(new GridLayout(3, false));
		
		Label l = new Label(parent, SWT.NONE);
		l.setText("SceneBuilder executable");
		
		scenebuilder = new Text(parent, SWT.BORDER);
		scenebuilder.setText(InstanceScope.INSTANCE.getNode("org.eclipse.fx.ide.ui").get("scenebuilder.exe", ""));
		scenebuilder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		final Button b = new Button(parent, SWT.PUSH);
		b.setText("Browse ...");
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog d = new FileDialog(b.getShell(),SWT.OPEN);
				String file = d.open();
				if( file != null ) {
					scenebuilder.setText(file);
				}
			}
		});
		
		return parent;
	}
	
	@Override
	public boolean performOk() {
		String text = scenebuilder.getText().trim();
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode("org.eclipse.fx.ide.ui");
		if( ! text.isEmpty() ) {
			pref.put("scenebuilder.exe",text);
		} else {
			pref.remove("scenebuilder.exe");
		}
		
		try {
			pref.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return super.performOk();
	}
	
	@Override
	protected void performDefaults() {
		super.performDefaults();
		scenebuilder.setText("");
	}
}
