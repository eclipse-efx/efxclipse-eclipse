/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.mobile.sim.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MainTab extends AbstractLaunchConfigurationTab {
	private ComboViewer deviceType;
	private ComboViewer deviceOrientation;
	private Text width;
	private Text height;
	private Text mobileApp;

	static {
		JFaceResources.getImageRegistry().put("SimTabImage", new Image(Display.getCurrent(), MainTab.class.getClassLoader().getResourceAsStream("/icons/images.png")));
	}
	
	@Override
	public Image getImage() {
		return JFaceResources.getImage("SimTabImage");
	}

	@Override
	public void createControl(Composite parent) {
		parent = new Composite(parent, SWT.NONE);
		parent.setLayout(new GridLayout());
		
		{
			Group g = new Group(parent, SWT.NONE);
			g.setText("Mobile Application");
			g.setLayout(new GridLayout(2, false));
			g.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			mobileApp = new Text(g, SWT.BORDER);
			mobileApp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			mobileApp.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					updateLaunchConfigurationDialog();
				}
			});
			
			Button b = new Button(g, SWT.PUSH);
			b.setText("Browse...");
		}
		
		{
			Group g = new Group(parent, SWT.NONE);
			g.setText("Simulator configuration");
			g.setLayout(new GridLayout(4, false));
			g.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			{
				Label l = new Label(g, SWT.NONE);
				l.setText("Device Type:");
				
				deviceType = new ComboViewer(g, SWT.READ_ONLY);
				deviceType.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
				deviceType.setContentProvider(ArrayContentProvider.getInstance());
				deviceType.setLabelProvider(new LabelProvider() {
					@Override
					public String getText(Object element) {
						switch ((DeviceType)element) {
						case ANDROID_PHONE:
							return "Android Phone";
						case ANDROID_TABLET:
							return "Android Tablet";
						case IPAD:
							return "iPad";
						default:
							return "iPhone";
						}
					}
				});
				deviceType.addSelectionChangedListener(new ISelectionChangedListener() {
					
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						updateLaunchConfigurationDialog();
					}
				});
				deviceType.setInput(DeviceType.values());
			}
			
			{
				Label l = new Label(g, SWT.NONE);
				l.setText("Device Orientation:");
				
				deviceOrientation = new ComboViewer(g, SWT.READ_ONLY);
				deviceOrientation.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
				deviceOrientation.setContentProvider(ArrayContentProvider.getInstance());
				deviceOrientation.setLabelProvider(new LabelProvider() {
					@Override
					public String getText(Object element) {
						return element == Orientation.HORIZONTAL ? "horizontal" : "vertical";
					}
				});
				deviceOrientation.addSelectionChangedListener(new ISelectionChangedListener() {
					
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						updateLaunchConfigurationDialog();
					}
				});
				deviceOrientation.setInput(Orientation.values());
			}
			
			{
				Label l = new Label(g, SWT.NONE);
				l.setText("Display size:");
				
				width = new Text(g, SWT.BORDER);
				width.addModifyListener(new ModifyListener() {
					
					@Override
					public void modifyText(ModifyEvent e) {
						updateLaunchConfigurationDialog();
					}
				});
				new Label(g, SWT.NONE).setText("x");
				height = new Text(g, SWT.BORDER);
				height.addModifyListener(new ModifyListener() {
					
					@Override
					public void modifyText(ModifyEvent e) {
						updateLaunchConfigurationDialog();
					}
				});
			}
		}
		
		setControl(parent);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_TYPE, DeviceType.IPHONE.name());
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_ORIENTATION, Orientation.VERTICAL.name());
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			deviceType.setSelection(new StructuredSelection(DeviceType.valueOf(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_TYPE, DeviceType.IPHONE.name()))));
			deviceOrientation.setSelection(new StructuredSelection(Orientation.valueOf(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_ORIENTATION, Orientation.VERTICAL.name()))));
			width.setText(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136").substring(0, configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136").indexOf('x')));
			height.setText(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136").substring(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, "640x1136").indexOf('x')+1));
			mobileApp.setText(configuration.getAttribute(MobileSimulatorLaunchConfigurationTabGroup.APP_CLASS, ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_TYPE, ((DeviceType)((IStructuredSelection)deviceType.getSelection()).getFirstElement()).name());
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_ORIENTATION, ((Orientation)((IStructuredSelection)deviceOrientation.getSelection()).getFirstElement()).name());
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.DEVICE_SIZE, width.getText()+"x"+height.getText());
		configuration.setAttribute(MobileSimulatorLaunchConfigurationTabGroup.APP_CLASS, mobileApp.getText());
	}

	@Override
	public String getName() {
		return "Simulator";
	}
}