/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Martin Blühweis<martin.bluehweis@bestsolution.at> - refactoring to EMF build model
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.externaltools.internal.IExternalToolConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstall3;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMStandin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;


@SuppressWarnings( "restriction" )
public abstract class AbstractBuildHandler extends AbstractAntHandler {
	
	private static Logger LOGGER = LoggerCreator.createLogger(AbstractBuildHandler.class); 
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();

		IFile f = getConfigurationFile( context );
		if ( f == null ) {
			return null;
		}

		try {
			URI resourceURI = URI.createPlatformResourceURI( f.getFullPath().toString(), true );
			Resource resource = null;
			try {
				// Load the resource through the editing domain.
				//
				resource = new ResourceSetImpl().getResource( resourceURI, true );
			}
			catch ( Exception e ) {
				resource = new ResourceSetImpl().getResource( resourceURI, false );
			}

			AntTask task = (AntTask) resource.getContents().get( 0 );

			InputStream in = f.getContents();
			in.close();
			// TODO
			BuildConfiguration rv = prepareBuild( f, task );
			if ( rv != null ) {
				CreateBuildXML b = new CreateBuildXML();
				File buildFile = b.run( rv );

				f.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );

				ILaunchConfiguration cfg = getLaunchConfig( buildFile, rv, f );

				if ( cfg != null && launchAnt() ) {
					DebugUITools.launch( cfg, ILaunchManager.RUN_MODE );
				}
			}
		}
		catch ( Exception e ) {
			throw new ExecutionException( "Failed to export application", e );
		}
		return null;
	}

	protected abstract boolean launchAnt();

	protected abstract IFile getConfigurationFile( IEvaluationContext context );

	private ILaunchConfiguration getLaunchConfig( File buildFile, BuildConfiguration cfgData, IFile buildCfgFile ) throws CoreException {
		ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = mgr.getLaunchConfigurationType( "org.eclipse.ant.AntLaunchConfigurationType" );

		if ( type != null ) {
			String name = (String) cfgData.builderName;
			if ( name == null ) {
				name = "JFX Build - " + cfgData.projectName;
			}

			File fBuildFile = new File( cfgData.buildDirectory + "/build.xml" );

			for ( ILaunchConfiguration cfg : mgr.getLaunchConfigurations( type ) ) {
				if ( cfg.getName().equals( name ) ) {
					String s = cfg.getAttribute( IExternalToolConstants.ATTR_LOCATION, IExternalToolConstants.EMPTY_STRING );
					if ( !s.equals( "" ) && new File( s ).equals( fBuildFile ) ) {
						return cfg;
					}
					else {
						cfg.delete();
					}
				}
			}

			ILaunchConfigurationWorkingCopy cfg = type.newInstance( null, name );
			cfg.setAttribute( IExternalToolConstants.ATTR_LOCATION, buildFile.getAbsolutePath() );
			cfg.setAttribute( IExternalToolConstants.ATTR_WORKING_DIRECTORY, buildFile.getParentFile().getAbsolutePath() );
			cfg.setAttribute( "org.eclipse.debug.core.ATTR_REFRESH_SCOPE", "${project}" );
			cfg.setAttribute( IAntLaunchConstants.ATTR_DEFAULT_VM_INSTALL, false );
			cfg.setAttribute( "org.eclipse.jdt.launching.MAIN_TYPE", "org.eclipse.ant.internal.launching.remote.InternalAntRunner" );
			cfg.setAttribute( "process_factory_id", "org.eclipse.ant.ui.remoteAntProcessFactory" );
			
			IVMInstall install = null;
			for ( IClasspathEntry e : project.getRawClasspath() ) {
				String start = e.getPath().segment( 0 );
				if ( start.startsWith( "org.eclipse.jdt.launching.JRE_CONTAINER") ) {
					install = JavaRuntime.getVMInstall( e.getPath() );
					cfg.setAttribute( IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, e.getPath().toString() );	
				}
			}
			
			if( ! isJDK( install ) ) {
				if( MessageDialog.openQuestion( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Not a JDK", "The project is attached to a JRE only so ant would be started with a JRE which does not have a compiler. Would you like to proceed and select a JDK?" ) ) {
					JDKSelectionDialog d = new JDKSelectionDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell() );
					if( d.open() == Window.OK ) {
						cfg.setAttribute( IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, JavaRuntime.newJREContainerPath(d.install).toString() );
					}
				} else {
					return null;
				}
			}
			
			if( isAnt18AndJDK8(install) ) {
				cfg.setAttribute( "org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS", "-Dbuild.compiler=javac1.7" );
			}
			
			cfg.doSave();
			return cfg;
		}
		return null;
	}
	
	static boolean isJDK(IVMInstall install) {
		if( install == null ) {
			return false;
		}
		File f = install.getInstallLocation();
		File tools = new File(new File( f, "lib" ), "tools.jar");
		return tools.exists();
	}
	
	static boolean isAnt18AndJDK8(IVMInstall install) {
		boolean rv = true;
		try {
			if( install instanceof IVMInstall3 ) {
				String version = ((IVMInstall3)install).evaluateSystemProperties(new String[] {"java.version"}, new NullProgressMonitor()).get("java.version");
				if( version != null ) {
					rv = version.startsWith("1.8.0");
				}
			}
			
			if( rv ) {
				Bundle b = Platform.getBundle("org.apache.ant");
				if( b.getVersion().toString().startsWith("1.9") ) {
					return false;
				}
			}
		} catch (CoreException e) {
			LOGGER.error("Unable to detect java version", e);
		}
		return rv;
	}
	
	static class JDKSelectionDialog extends TitleAreaDialog {

		private TableViewer viewer;
		private IVMInstall install;

		public JDKSelectionDialog( Shell parentShell ) {
			super( parentShell );
		}
		
		@Override
		protected Control createDialogArea( Composite parent ) {
			Composite content = (Composite) super.createDialogArea( parent );
			
			getShell().setText( "Select a JDK" );
			setTitle( "Select a JDK" );
			setMessage( "To build your product you need to run ant with a JDK. Select one in the list below" );
			
			parent = new Composite( content, SWT.NONE );
			parent.setLayoutData( new GridData( GridData.FILL_BOTH ) );
			parent.setLayout( new GridLayout() );
			
			Label l = new Label( parent, SWT.NONE );
			l.setText( "Select a JDK" );
			
			viewer = new TableViewer( parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER );
			viewer.getControl().setLayoutData( new GridData(GridData.FILL_BOTH) );
			viewer.setContentProvider( ArrayContentProvider.getInstance() );
			viewer.setLabelProvider( new StyledCellLabelProvider() {
				public void update(ViewerCell cell) {
					IVMInstall install = (IVMInstall) cell.getElement();
					StyledString s = new StyledString( install.getName() );
					s.append( " - " + install.getInstallLocation().getAbsolutePath(), StyledString.DECORATIONS_STYLER );
					cell.setStyleRanges( s.getStyleRanges() );
					cell.setText( s.getString() );
					cell.setImage( JavaFXUIPlugin.getDefault().getImageRegistry().getDescriptor(JavaFXUIPlugin.LIBRARY_ICON).createImage() );
				}
			} );
			
			List<IVMInstall> installs = getWorkspaceJREs();
			Iterator<IVMInstall> it = installs.iterator();
			
			while( it.hasNext() ) {
				if( ! isJDK( it.next() ) ) {
					it.remove();
				}
			}
			viewer.setInput( installs );
			
			viewer.addSelectionChangedListener( new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged( SelectionChangedEvent event ) {
					ISelection s = event.getSelection();
					if( s.isEmpty() ) {
						getButton( IDialogConstants.OK_ID ).setEnabled( false );
					} else {
						install = (IVMInstall) ((IStructuredSelection)s).getFirstElement();
						getButton( IDialogConstants.OK_ID ).setEnabled( true );
					}
				}
			} );
			
			return content;
		}
		
		@Override
		protected Button createButton( Composite parent, int id, String label, boolean defaultButton ) {
			Button b = super.createButton( parent, id, label, defaultButton );
			if( id == IDialogConstants.OK_ID ) {
				b.setEnabled( false );
			}
			return b;
		}
	
		private List<IVMInstall> getWorkspaceJREs() {
			List<IVMInstall> standins = new ArrayList<IVMInstall>();
			IVMInstallType[] types = JavaRuntime.getVMInstallTypes();
			for (int i = 0; i < types.length; i++) {
				IVMInstallType type = types[i];
				IVMInstall[] installs = type.getVMInstalls();
				for (int j = 0; j < installs.length; j++) {
					IVMInstall install = installs[j];
					standins.add(new VMStandin(install));
				}
			}
			return standins;
		}
	}
}
