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
package org.eclipse.fx.ide.pde.ui.wizard;

import java.util.TreeSet;

import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.osgi.framework.Version;


public class BundleConfigurationPage extends WizardPage {
	private BundleProjectData data;
	
	private ModifyListener propertiesListener = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			setPageComplete(validate());
		}
	};
	
	private Text idText;
	private Text versionText;
	private Text nameText;
	private Text vendorText;
	private Combo eeChoice;

	public BundleConfigurationPage(BundleProjectData data, String pageName, String title) {
		super(pageName, title, null);
		this.data = data;
		setPageComplete(false);
	}
	
	protected boolean validate() {
		setErrorMessage(null);
		if( idText.getText().trim().isEmpty() ) {
			setErrorMessage( getBundleIdLabel() + " is required");
			return false;	
		} else if( versionText != null && versionText.getText().trim().isEmpty() ) {
			setErrorMessage("Version is required");
			return false;
		} else {
			if(versionText != null ) {
				try {
					new Version(versionText.getText());	
				} catch( IllegalArgumentException e ) {
					setErrorMessage("Invalid version definition");
					return false;
				}	
			}
		}
		
		data.setSymbolicname(idText.getText().trim());
		
		if( nameText != null ) {
			data.setBundleDescription(nameText.getText());	
		}
		
		if( versionText != null ) {
			data.setVersion(versionText.getText());	
		}
		
		data.setVendor(vendorText.getText().trim().isEmpty() ? null : vendorText.getText());
		data.setEEnv(eeChoice.getText());
		
		return true;
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());

		createPluginPropertiesGroup(container);

		setControl(container);
	}

	private void createPluginPropertiesGroup(Composite container) {
		Group propertiesGroup = new Group(container, SWT.NONE);
		propertiesGroup.setText("Properties");
		propertiesGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		propertiesGroup.setLayout(new GridLayout(3, false));

		{
			createLabel(propertiesGroup, getBundleIdLabel()+":");
			idText = createText(propertiesGroup, propertiesListener, 2);
		}

		if( withBundleVersion() )
		{
			createLabel(propertiesGroup, "Version:");
			versionText = createText(propertiesGroup, propertiesListener, 2);
			versionText.setText(data.getVersion());
		}

		if( withBundleDescription() )
		{
			createLabel(propertiesGroup, "Name:");
			nameText = createText(propertiesGroup, propertiesListener, 2);
			nameText.setMessage("Enter a short description");
		}

		{
			createLabel(propertiesGroup, "Vendor:");
			vendorText = createText(propertiesGroup, propertiesListener, 2);
			vendorText.setMessage("Enter the vendor of the bundle");
		}

		createExecutionEnvironmentControls(propertiesGroup);
	}
	
	protected String getBundleIdLabel() {
		return "ID";
	}

	protected boolean withBundleDescription() {
		return true;
	}
	
	protected boolean withBundleVersion() {
		return true;
	}
	
	private Label createLabel(Composite container, String text) {
		Label label = new Label(container, SWT.NONE);
		label.setText(text);
		GridData gd = new GridData();
		label.setLayoutData(gd);
		return label;
	}

	protected Text createText(Composite parent, ModifyListener listener, int horizSpan) {
		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = horizSpan;
		text.setLayoutData(data);
		text.addModifyListener(listener);
		return text;
	}

	private void createExecutionEnvironmentControls(Composite container) {
		// Create label
		createLabel(container, "Execution Environment");

		eeChoice = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		eeChoice.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Gather EEs
		IExecutionEnvironment[] exeEnvs = JavaRuntime.getExecutionEnvironmentsManager().getExecutionEnvironments();
		TreeSet<String> availableEEs = new TreeSet<String>();
		for (int i = 0; i < exeEnvs.length; i++) {
			availableEEs.add(exeEnvs[i].getId());
		}

		// Set data
		eeChoice.setItems((String[]) availableEEs.toArray(new String[availableEEs.size() - 1]));
		eeChoice.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				validate();
			}
		});

		// Set default EE based on strict match to default VM
		IVMInstall defaultVM = JavaRuntime.getDefaultVMInstall();
		String[] EEChoices = eeChoice.getItems();
		for (int i = 0; i < EEChoices.length; i++) {
			if (JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(EEChoices[i]).isStrictlyCompatible(defaultVM)) {
				eeChoice.select(i);
				validate();
				break;
			}
		}

		// Create button
		Button exeEnvButton = new Button(container, SWT.PUSH);
		exeEnvButton.setLayoutData(new GridData());
		exeEnvButton.setText("Environments...");
		exeEnvButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				PreferencesUtil.createPreferenceDialogOn(getShell(), "org.eclipse.jdt.debug.ui.jreProfiles", //$NON-NLS-1$
						new String[] { "org.eclipse.jdt.debug.ui.jreProfiles" }, null).open(); //$NON-NLS-1$ 
			}
		});
	}
}
