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

import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class TychoConfigurationPage extends WizardPage {
	private BundleProjectData data;
	
	private ModifyListener propertiesListener = new ModifyListener() {
		private boolean working;
		public void modifyText(ModifyEvent e) {
			if( working ) {
				return;
			}
			try {
				working = true;
				if( e.widget == relengArtifactPath ) {
					relengArtifactPathModified = true;
				}	
				setPageComplete(validate());
			} finally {
				working = false;
			}
			
		}
	};
	
	private SelectionListener listener = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			setPageComplete(validate());
		}
	};

	private Text groupId;

	private Text relengArtifactId;

//	private Text relengArtifactVersion;

	private Text relengArtifactPath;

	private Button tychoIntegration;
	
	private boolean relengArtifactPathModified;
	
	public TychoConfigurationPage(BundleProjectData data, String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		this.data = data;
		setPageComplete(!data.isTychoIntegration());
	}

	protected boolean validate() {
		if( tychoIntegration.getSelection() ) {
			setEnablement(true);
			setErrorMessage(null);
			if( ! checkEmpty(groupId, "You need to set a Group-Id") ) {
				return false;
			}
			if( ! checkEmpty(relengArtifactId, "You need to set a Releng-Artifact-Id") ) {
				return false;
			}
			
			if( ! relengArtifactPathModified ) {
				relengArtifactPath.setText("../"+relengArtifactId.getText().trim());
			}
			
//			if( ! checkEmpty(relengArtifactVersion, "You need to set a Releng-Artifact-Version") ) {
//				return false;
//			}
			if( ! checkEmpty(relengArtifactPath, "You need to set a Releng-Artifact-Path") ) {
				return false;
			}
			data.setTychoGroupId(groupId.getText().trim());
			data.setTychoRelengArtifactId(relengArtifactId.getText().trim());
//			data.setTychoRelengArtifactVersion(relengArtifactVersion.getText().trim());
			data.setTychoRelengArtifactPath(relengArtifactPath.getText().trim());
		} else {
			setEnablement(false);
			setErrorMessage(null);
		}
		return true;
	}
	
	private boolean checkEmpty(Text t, String message) {
		if( t.getText().trim().length() == 0) {
			setErrorMessage(message);
			return false;
		}
		return true;
	}
	
	private void setEnablement(boolean enabled) {
		groupId.setEnabled(enabled);
		relengArtifactId.setEnabled(enabled);
//		relengArtifactVersion.setEnabled(enabled);
		relengArtifactPath.setEnabled(enabled);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		
		Group group = new Group(container, SWT.NONE);
		group.setText("Maven Properties");
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		{
			tychoIntegration = new Button(group, SWT.CHECK);
			tychoIntegration.setText("Maven Tycho Integration");
			tychoIntegration.setSelection(data.isTychoIntegration());
			tychoIntegration.addSelectionListener(listener);	
			tychoIntegration.setLayoutData(new GridData(GridData.BEGINNING,GridData.CENTER,false,false,2,1));
		}
		
		{
			createLabel(group, "Group-Id");
			groupId = createText(group, propertiesListener, 1);
		}
		
		{
			createLabel(group, "Releng-Artifact-Id");
			relengArtifactId = createText(group, propertiesListener, 1);
		}
		
//		{
//			createLabel(group, "Releng-Artifact-Version");
//			relengArtifactVersion = createText(group, propertiesListener, 1);
//		}
		
		{
			createLabel(group, "Releng-Artifact-Path");
			relengArtifactPath = createText(group, propertiesListener, 1);
		}
		
		setControl(container);
	}
	
	protected Text createText(Composite parent, ModifyListener listener, int horizSpan) {
		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = horizSpan;
		text.setLayoutData(data);
		text.addModifyListener(listener);
		return text;
	}
	
	private Label createLabel(Composite container, String text) {
		Label label = new Label(container, SWT.NONE);
		label.setText(text);
		GridData gd = new GridData();
		gd.horizontalIndent=20;
		label.setLayoutData(gd);
		return label;
	}
}