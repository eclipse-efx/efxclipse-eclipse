/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.fx.ide.jdt.core.JavaFXCore;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.FXProjectCtrlClassTemplate;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.FXProjectFXGraphTemplate;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.FXProjectFXMLTemplate;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.FXProjectMainClassTemplate;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.FXProjectMainMobileClassTemplate;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jdt.internal.ui.util.ExceptionHandler;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jdt.internal.ui.wizards.NewWizardMessages;
import org.eclipse.jdt.ui.IPackagesViewPart;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPageOne;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

@SuppressWarnings("restriction")
public class JavaFXProjectWizard extends NewElementWizard implements IExecutableExtension {

	private NewJavaProjectWizardPageOne fFirstPage;
	private NewJavaFXProjectWizardPageTwo fSecondPage;
	private NewJavaFXProjectWizardPageThree fThirdPage;

	private IConfigurationElement fConfigElement;
	
	private ProjectData projectData;

	public JavaFXProjectWizard() {
		this(null, null, null);
	}

	public JavaFXProjectWizard(NewJavaProjectWizardPageOne pageOne, NewJavaFXProjectWizardPageTwo pageTwo, NewJavaFXProjectWizardPageThree pageThree) {
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWJPRJ);
		setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
		setWindowTitle(NewWizardMessages.JavaProjectWizard_title);

		fFirstPage= pageOne;
		fSecondPage= pageTwo;
		fThirdPage = pageThree;
		projectData = new ProjectData();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		if (fFirstPage == null)
			fFirstPage= new NewJavaProjectWizardPageOne();
		addPage(fFirstPage);

		if (fSecondPage == null)
			fSecondPage= new NewJavaFXProjectWizardPageTwo(fFirstPage);
		addPage(fSecondPage); 
		
		if( fThirdPage == null )
			fThirdPage = new NewJavaFXProjectWizardPageThree(projectData);
		addPage(fThirdPage);

		fFirstPage.init(getSelection(), getActivePart());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#finishPage(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
		fSecondPage.performFinish(monitor); // use the full progress monitor
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean res= super.performFinish();
		if (res) {
			final IJavaElement newElement= getCreatedElement();

			IWorkingSet[] workingSets= fFirstPage.getWorkingSets();
			if (workingSets.length > 0) {
				PlatformUI.getWorkbench().getWorkingSetManager().addToWorkingSets(newElement, workingSets);
			}
			
			try {
				IJavaProject p = (IJavaProject) newElement;
				IClasspathEntry[] current = p.getRawClasspath();
				
				int i = current.length+1;
				if( projectData.mainApp.equals(NewJavaFXProjectWizardPageThree.MOBILE) ) {
					i += 1;
				}
				
				IClasspathEntry[] currentFX = new IClasspathEntry[i];
				System.arraycopy(current, 0, currentFX, 0, current.length);
				currentFX[current.length] = JavaCore.newContainerEntry(JavaFXCore.JAVAFX_CONTAINER_PATH); 
				
				if( projectData.mainApp.equals(NewJavaFXProjectWizardPageThree.MOBILE) ) {
					currentFX[current.length+1] = JavaCore.newContainerEntry(JavaFXCore.MOBILE_CONTAINER_PATH);
				}
				
				p.setRawClasspath(currentFX, new NullProgressMonitor());
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if( projectData.mainApp.equals(NewJavaFXProjectWizardPageThree.DESKTOP) ) {
				final IFile buildFile = fSecondPage.getJavaProject().getProject().getFile(new Path("build.fxbuild"));
				AntTask task = AntTasksFactory.eINSTANCE.createAntTask();
				task.setBuildDirectory( "${project}/build" );
				task.setDeploy( AntTasksFactory.eINSTANCE.createDeploy() );
				task.getDeploy().setApplication( ParametersFactory.eINSTANCE.createApplication() );
				task.getDeploy().getApplication().setName( fFirstPage.getProjectName() );				
				task.getDeploy().setInfo( ParametersFactory.eINSTANCE.createInfo() );
				task.setSignjar( AntTasksFactory.eINSTANCE.createSignJar() );
				
				final XMIResource resource= new XMIResourceImpl();
				resource.getContents().add( task );
				
				WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
					@Override
					public void execute( IProgressMonitor monitor ) {

						if ( !resource.getContents().isEmpty() ) {
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);

							ByteArrayOutputStream streamOut = null;
							ByteArrayInputStream streamIn = null;
							try {
								streamOut = new ByteArrayOutputStream();
								resource.save( streamOut, options );
								streamIn = new ByteArrayInputStream( streamOut.toByteArray() );
								buildFile.create( streamIn, true, monitor );
							}
							catch ( IOException | CoreException e ) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							finally {
								options.clear();
								if (streamOut != null) {
									try {
										streamOut.close();
									}
									catch ( IOException e ) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (streamIn != null) {
									try {
										streamIn.close();
									}
									catch ( IOException e ) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						}
					}
				};
				try {
					new ProgressMonitorDialog( getShell() ).run( true, false, operation );
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				IJavaProject p = fSecondPage.getJavaProject();
				IPackageFragment f = p.getPackageFragments()[0];
				IPath path = f.getPath();
				
				for( String s : projectData.packageName.split("\\.") ) {
					path = path.append(s);
					p.getProject().getWorkspace().getRoot().getFolder(path).create(true, true, null);
				}
				
				{
					IFile cssFile = p.getProject().getWorkspace().getRoot().getFile(path.append("application.css"));
					ByteArrayInputStream in = new ByteArrayInputStream("".getBytes());
					cssFile.create(in, IFile.FORCE|IFile.KEEP_HISTORY, null);
					in.close();						
				}
				
				if( projectData.mainApp.equals(NewJavaFXProjectWizardPageThree.DESKTOP) ) {
					IFile mainClass = p.getProject().getWorkspace().getRoot().getFile(path.append("Main.java"));
					ByteArrayInputStream in = new ByteArrayInputStream(new FXProjectMainClassTemplate().generate(projectData).toString().getBytes());
					mainClass.create(in, IFile.FORCE|IFile.KEEP_HISTORY, null);
					in.close();						
				} else if( projectData.mainApp.equals(NewJavaFXProjectWizardPageThree.MOBILE) ) {
					IFile mainClass = p.getProject().getWorkspace().getRoot().getFile(path.append("Main.java"));
					ByteArrayInputStream in = new ByteArrayInputStream(new FXProjectMainMobileClassTemplate().generate(projectData).toString().getBytes());
					mainClass.create(in, IFile.FORCE|IFile.KEEP_HISTORY, null);
					in.close();
				}
				
				if( ! projectData.declarativeUiType.equals("None") ) {
					if( ! projectData.declarativeUiController.trim().isEmpty() ) {
						IFile ctrlClass = p.getProject().getWorkspace().getRoot().getFile(path.append(projectData.declarativeUiController+".java"));
						ByteArrayInputStream in = new ByteArrayInputStream(new FXProjectCtrlClassTemplate().generate(projectData).toString().getBytes());
						ctrlClass.create(in, IFile.FORCE|IFile.KEEP_HISTORY, null);
						in.close();	
					}
					IFile declarativeUi = p.getProject().getWorkspace().getRoot().getFile(path.append(projectData.declarativeUiName+"."+(projectData.declarativeUiType.endsWith("FXML")?"fxml":"fxgraph")));
					ByteArrayInputStream in = new ByteArrayInputStream(
							(projectData.declarativeUiType.endsWith("FXML")?
							new FXProjectFXMLTemplate().generate(projectData).toString().getBytes():
							new FXProjectFXGraphTemplate().generate(projectData).toString().getBytes()
							));
					declarativeUi.create(in, IFile.FORCE|IFile.KEEP_HISTORY, null);
					in.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getJavaProject().getProject());

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPart activePart= getActivePart();
					if (activePart instanceof IPackagesViewPart) {
						PackageExplorerPart view= PackageExplorerPart.openInActivePerspective();
						view.tryToReveal(newElement);
					}
				}
			});
		}
		return res;
	}

	private IWorkbenchPart getActivePart() {
		IWorkbenchWindow activeWindow= getWorkbench().getActiveWorkbenchWindow();
		if (activeWindow != null) {
			IWorkbenchPage activePage= activeWindow.getActivePage();
			if (activePage != null) {
				return activePage.getActivePart();
			}
		}
		return null;
	}

	@Override
	protected void handleFinishException(Shell shell, InvocationTargetException e) {
		String title= NewWizardMessages.JavaProjectWizard_op_error_title;
		String message= NewWizardMessages.JavaProjectWizard_op_error_create_message;
		ExceptionHandler.handle(e, getShell(), title, message);
	}

	/*
	 * Stores the configuration element for the wizard.  The config element will be used
	 * in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
		fConfigElement= cfig;
	}

	/* (non-Javadoc)
	 * @see IWizard#performCancel()
	 */
	@Override
	public boolean performCancel() {
		fSecondPage.performCancel();
		return super.performCancel();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#getCreatedElement()
	 */
	@Override
	public IJavaElement getCreatedElement() {
		return fSecondPage.getJavaProject();
	}
	
	public static class ProjectData {
		public String mainApp = "Desktop";
		public String packageName = "application";
		public String declarativeUiType = "None";
		public String declarativeUiName = "Sample";
		public String declarativeUiController = "SampleController";
		public String declarativeUiRootType = "javafx.scene.layout.BorderPane";
	}
}
