package org.eclipse.fx.ide.mvnosgi.launching.ui;

import java.util.stream.Stream;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class MainLauncherTab extends AbstractLaunchConfigurationTab {

	private Text fProjText;

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		{
			Group g = new Group(composite, SWT.NONE);
			g.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			g.setText("Project");
			g.setLayout(new GridLayout(2, false));

			fProjText = new Text(g, SWT.BORDER);
			fProjText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			fProjText.addModifyListener( e -> {
				setDirty(true);
				getLaunchConfigurationDialog().updateButtons();
			});

			Button b = new Button(g, SWT.PUSH);
			b.addSelectionListener( SelectionListener.widgetSelectedAdapter( (e) -> {
				IJavaProject project = chooseJavaProject();
				if( project != null ) {
					fProjText.setText(project.getProject().getName());
//					MavenJdtPlugin jdtPlugin = MavenJdtPlugin.getDefault();
//					IClasspathManager manager = jdtPlugin.getBuildpathManager();
//					try {
//						IClasspathEntry[] classpath = manager.getClasspath(project.getProject(), IClasspathManager.CLASSPATH_DEFAULT, true, new NullProgressMonitor());
//						Stream.of(classpath).forEach(System.err::println);
//					} catch (CoreException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
				}
			}  ) );
			b.setText("Browse ...");
		}

		setControl(composite);
	}

	private IJavaProject chooseJavaProject() {
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
		// dialog.setTitle(LauncherMessages.AbstractJavaMainTab_4);
		// dialog.setMessage(LauncherMessages.AbstractJavaMainTab_3);
		try {
			Object[] projects = Stream.of(JavaCore.create(getWorkspaceRoot()).getJavaProjects())
				.filter( p -> {
					try {
						return p.getProject().hasNature("org.eclipse.m2e.core.maven2Nature");	
					} catch(CoreException e) {
						//FIXME Log it
						return false;
					}
				})
				.toArray();
			dialog.setElements(projects);
		} catch (JavaModelException jme) {
			// JDIDebugUIPlugin.log(jme);
		}
		IJavaProject javaProject = getJavaProject();
		if (javaProject != null) {
			dialog.setInitialSelections(new Object[] { javaProject });
		}
		if (dialog.open() == Window.OK) {
			return (IJavaProject) dialog.getFirstResult();
		}
		return null;
	}
	
	protected IJavaProject getJavaProject() {
		String projectName = fProjText.getText().trim();
		if (projectName.length() < 1) {
			return null;
		}
		return getJavaModel().getJavaProject(projectName);
	}
	
	/**
	 * Convenience method to get access to the java model.
	 */
	private IJavaModel getJavaModel() {
		return JavaCore.create(getWorkspaceRoot());
	}

	protected IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			fProjText.setText(configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, fProjText.getText());
	}

	@Override
	public String getName() {
		return "Main";
	}

}
