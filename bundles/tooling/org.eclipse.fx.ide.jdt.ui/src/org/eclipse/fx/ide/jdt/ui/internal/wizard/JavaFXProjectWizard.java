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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.fx.ide.jdt.core.JavaFXCore;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
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

	private IConfigurationElement fConfigElement;

	public JavaFXProjectWizard() {
		this(null, null);
	}

	public JavaFXProjectWizard(NewJavaProjectWizardPageOne pageOne, NewJavaFXProjectWizardPageTwo pageTwo) {
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWJPRJ);
		setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
		setWindowTitle(NewWizardMessages.JavaProjectWizard_title);

		fFirstPage= pageOne;
		fSecondPage= pageTwo;
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
				IClasspathEntry[] currentFX = new IClasspathEntry[current.length+1];
				System.arraycopy(current, 0, currentFX, 0, current.length);
				currentFX[current.length] = JavaCore.newContainerEntry(JavaFXCore.JAVAFX_CONTAINER_PATH);  
				p.setRawClasspath(currentFX, new NullProgressMonitor());
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			final IFile buildFile = fSecondPage.getJavaProject().getProject().getFile(new Path("build.fxbuild"));
			try {
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
				new ProgressMonitorDialog( getShell() ).run( true, false, operation );
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
}
