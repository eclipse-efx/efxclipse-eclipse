/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - rewritten, the build configuration is represented by an EMF model now
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.editors;

import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.*;
import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.dialogs.MainTypeSelectionDialog;
import org.eclipse.jdt.internal.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.FolderSelectionDialog;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;


/**
 *
 * @author martin
 */
@SuppressWarnings( "restriction" )
public class JFXBuildConfigurationEditor extends MultiPageEditorPart {
	final WritableValue bean = new WritableValue();
	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 */
	AdapterFactoryEditingDomain editingDomain;
	/**
	 * This is the one adapter factory used for providing views of the model.
	 */
	private ComposedAdapterFactory adapterFactory;
	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 */
	Viewer currentViewer;
	/**
	 * Controls whether the problem indication should be updated.
	 */
	boolean updateProblemIndication = true;
	/**
	 * Resources that have been removed since last activation.
	 */
	Collection<Resource> removedResources = new ArrayList<Resource>();
	/**
	 * Resources that have been changed since last activation.
	 */
	Collection<Resource> changedResources = new ArrayList<Resource>();
	/**
	 * Resources that have been saved.
	 */
	Collection<Resource> savedResources = new ArrayList<Resource>();
	/**
	 * Properties from old build file.
	 */
	private Properties properties = new Properties();
	/**
	 * The MarkerHelper is responsible for creating workspace resource markers presented.
	 */
	private MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * Map to store the diagnostic associated with a resource.
	 */
	Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	private FormToolkit toolkit;

	private static final int DELAY = 500;

	private DataBindingContext dbc;

	/**
	 * This listens to which ever viewer is active. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * Create an editor instance
	 */
	public JFXBuildConfigurationEditor() {
		super();
		initializeEditingDomain();
		ResourcesPlugin.getWorkspace().addResourceChangeListener( this.resourceChangeListener );
	}

	/**
	 * This listens for workspace changes. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		@Override
		public void resourceChanged( IResourceChangeEvent event ) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {
					protected ResourceSet resourceSet = JFXBuildConfigurationEditor.this.editingDomain.getResourceSet();
					protected Collection<Resource> changedResources = new ArrayList<Resource>();
					protected Collection<Resource> removedResources = new ArrayList<Resource>();

					@Override
					public boolean visit( IResourceDelta delta ) {
						if ( delta.getResource().getType() == IResource.FILE ) {
							if ( delta.getKind() == IResourceDelta.REMOVED || delta.getKind() == IResourceDelta.CHANGED
									&& delta.getFlags() != IResourceDelta.MARKERS ) {
								Resource resource = this.resourceSet.getResource( URI.createPlatformResourceURI( delta.getFullPath().toString(), true ), false );
								if ( resource != null ) {
									if ( delta.getKind() == IResourceDelta.REMOVED ) {
										this.removedResources.add( resource );
									}
									else if ( !JFXBuildConfigurationEditor.this.savedResources.remove( resource ) ) {
										this.changedResources.add( resource );
									}
								}
							}
						}

						return true;
					}

					public Collection<Resource> getChangedResources() {
						return this.changedResources;
					}

					public Collection<Resource> getRemovedResources() {
						return this.removedResources;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept( visitor );

				if ( !visitor.getRemovedResources().isEmpty() ) {
					getSite().getShell().getDisplay().asyncExec( new Runnable() {
						@Override
						public void run() {
							JFXBuildConfigurationEditor.this.removedResources.addAll( visitor.getRemovedResources() );
							if ( !isDirty() ) {
								getSite().getPage().closeEditor( JFXBuildConfigurationEditor.this, false );
							}
						}
					} );
				}

				if ( !visitor.getChangedResources().isEmpty() ) {
					getSite().getShell().getDisplay().asyncExec( new Runnable() {
						@Override
						public void run() {
							JFXBuildConfigurationEditor.this.changedResources.addAll( visitor.getChangedResources() );
							if ( getSite().getPage().getActiveEditor() == JFXBuildConfigurationEditor.this ) {
								handleActivate();
							}
						}
					} );
				}
			}
			catch ( CoreException e ) {
				e.printStackTrace();
			}
		}
	};

	/**
	 * Handles activation of the editor or it's associated views.
	 */
	void handleActivate() {
		if ( this.editingDomain.getResourceToReadOnlyMap() != null ) {
			this.editingDomain.getResourceToReadOnlyMap().clear();
		}

		if ( !this.removedResources.isEmpty() ) {
			if ( handleDirtyConflict() ) {
				getSite().getPage().closeEditor( JFXBuildConfigurationEditor.this, false );
			}
			else {
				this.removedResources.clear();
				this.changedResources.clear();
				this.savedResources.clear();
			}
		}
		else if ( !this.changedResources.isEmpty() ) {
			this.changedResources.removeAll( this.savedResources );
			handleChangedResources();
			this.changedResources.clear();
			this.savedResources.clear();
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 */
	private boolean handleDirtyConflict() {
		return MessageDialog.openQuestion( getSite().getShell(), Messages.JFXBuildConfigurationEditor_FileConflict,
				"There are unsaved changes that conflict with changes made outside the editor.  Do you wish to discard this editor's changes?" );
	}

	/**
	 * Handles what to do with changed resources on activation.
	 */
	private void handleChangedResources() {
		if ( !this.changedResources.isEmpty() && ( !isDirty() || handleDirtyConflict() ) ) {
			if ( isDirty() ) {
				this.changedResources.addAll( this.editingDomain.getResourceSet().getResources() );
			}
			this.editingDomain.getCommandStack().flush();

			this.updateProblemIndication = false;
			for ( Resource resource : this.changedResources ) {
				if ( resource.isLoaded() ) {
					resource.unload();
					try {
						resource.load( Collections.EMPTY_MAP );
						this.bean.setValue( getTask() );
						this.dbc.updateTargets();
					}
					catch ( IOException exception ) {
						if ( !this.resourceToDiagnosticMap.containsKey( resource ) ) {
							this.resourceToDiagnosticMap.put( resource, analyzeResourceProblems( resource, exception ) );
						}
					}
				}
			}
			this.updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * This sets up the editing domain for the model editor.
	 */
	private void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		this.adapterFactory = new ComposedAdapterFactory( ComposedAdapterFactory.Descriptor.Registry.INSTANCE );

		this.adapterFactory.addAdapterFactory( new ResourceItemProviderAdapterFactory() );
		// adapterFactory.addAdapterFactory( new AntTasksItemProviderAdapterFactory() );
		// adapterFactory.addAdapterFactory( new ParametersItemProviderAdapterFactory() );
		this.adapterFactory.addAdapterFactory( new ReflectiveItemProviderAdapterFactory() );

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener( new CommandStackListener() {
			@SuppressWarnings("synthetic-access")
			@Override
			public void commandStackChanged( final EventObject event ) {
				getContainer().getDisplay().asyncExec( new Runnable() {
					@Override
					public void run() {
						firePropertyChange( IEditorPart.PROP_DIRTY );

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ( (CommandStack) event.getSource() ).getMostRecentCommand();
						if ( mostRecentCommand != null ) {
							setSelectionToViewer( mostRecentCommand.getAffectedObjects() );
						}
					}
				} );
			}
		} );

		// Create the editing domain with a special command stack.
		//
		this.editingDomain = new AdapterFactoryEditingDomain( this.adapterFactory, commandStack, new HashMap<Resource, Boolean>() );
	}

	private void setSelectionToViewer( Collection<?> collection ) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if ( theSelection != null && !theSelection.isEmpty() ) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// Try to select the items in the current content viewer of the editor.
					//
					if ( JFXBuildConfigurationEditor.this.currentViewer != null ) {
						JFXBuildConfigurationEditor.this.currentViewer.setSelection( new StructuredSelection( theSelection.toArray() ), true );
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec( runnable );
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 */
	@Override
	public boolean isDirty() {
		return ( (BasicCommandStack) this.editingDomain.getCommandStack() ).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 */
	@Override
	public void doSave( IProgressMonitor progressMonitor ) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put( Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER );

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute( IProgressMonitor monitor ) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for ( Resource resource : JFXBuildConfigurationEditor.this.editingDomain.getResourceSet().getResources() ) {
					if ( ( first || !resource.getContents().isEmpty() || isPersisted( resource ) ) && !JFXBuildConfigurationEditor.this.editingDomain.isReadOnly( resource ) ) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save( saveOptions );
							if ( resource.getTimeStamp() != timeStamp ) {
								JFXBuildConfigurationEditor.this.savedResources.add( resource );
							}
						}
						catch ( Exception exception ) {
							JFXBuildConfigurationEditor.this.resourceToDiagnosticMap.put( resource, analyzeResourceProblems( resource, exception ) );
						}
						first = false;
					}
				}
			}
		};

		this.updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog( getSite().getShell() ).run( true, false, operation );

			// Refresh the necessary state.
			//
			( (BasicCommandStack) this.editingDomain.getCommandStack() ).saveIsDone();
			firePropertyChange( IEditorPart.PROP_DIRTY );
		}
		catch ( Exception e ) {
			// TODO
			e.printStackTrace();
		}
		this.updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * Updates the problems indication with the information described in the specified diagnostic. <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	void updateProblemIndication() {
		if ( this.updateProblemIndication ) {
			BasicDiagnostic diagnostic = new BasicDiagnostic( Diagnostic.OK, JavaFXUIPlugin.PLUGIN_ID, 0, null, new Object[] { this.editingDomain.getResourceSet() } );
			for ( Diagnostic childDiagnostic : this.resourceToDiagnosticMap.values() ) {
				if ( childDiagnostic.getSeverity() != Diagnostic.OK ) {
					diagnostic.add( childDiagnostic );
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if ( lastEditorPage >= 0 && getEditor( lastEditorPage ) instanceof ProblemEditorPart ) {
				( (ProblemEditorPart) getEditor( lastEditorPage ) ).setDiagnostic( diagnostic );
				if ( diagnostic.getSeverity() != Diagnostic.OK ) {
					setActivePage( lastEditorPage );
				}
			}
			else if ( diagnostic.getSeverity() != Diagnostic.OK ) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic( diagnostic );
				problemEditorPart.setMarkerHelper( this.markerHelper );
				try {
					addPage( ++lastEditorPage, problemEditorPart, getEditorInput() );
					setPageText( lastEditorPage, problemEditorPart.getPartName() );
					setActivePage( lastEditorPage );
					showTabs();
				}
				catch ( PartInitException e ) {
					// TODO
					e.printStackTrace();
				}
			}

			if ( this.markerHelper.hasMarkers( this.editingDomain.getResourceSet() ) ) {
				this.markerHelper.deleteMarkers( this.editingDomain.getResourceSet() );
				if ( diagnostic.getSeverity() != Diagnostic.OK ) {
					try {
						this.markerHelper.createMarkers( diagnostic );
					}
					catch ( CoreException e ) {
						// TODO
						e.printStackTrace();
					}
				}
			}
		}
	}

	static Diagnostic analyzeResourceProblems( Resource resource, Exception exception ) {
		if ( !resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty() ) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic( Diagnostic.ERROR, JavaFXUIPlugin.PLUGIN_ID, 0, "_UI_CreateModelError_message", //$NON-NLS-1$
					new Object[] { exception == null ? (Object) resource : exception } );
			basicDiagnostic.merge( EcoreUtil.computeDiagnostic( resource, true ) );
			return basicDiagnostic;
		}
		else if ( exception != null ) {
			return new BasicDiagnostic( Diagnostic.ERROR, JavaFXUIPlugin.PLUGIN_ID, 0, "_UI_CreateModelError_message", new Object[] { exception } ); //$NON-NLS-1$
		}
		else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	boolean isPersisted( Resource resource ) {
		boolean result = false;
		try (InputStream stream = this.editingDomain.getResourceSet().getURIConverter().createInputStream( resource.getURI() ) ) {
					result = true;
		} catch ( IOException e ) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog( getSite().getShell() );
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if ( path != null ) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile( path );
			if ( file != null ) {
				doSaveAs( URI.createPlatformResourceURI( file.getFullPath().toString(), true ), new FileEditorInput( file ) );
			}
		}
	}

	private void doSaveAs( URI uri, IEditorInput editorInput ) {
		( this.editingDomain.getResourceSet().getResources().get( 0 ) ).setURI( uri );
		setInputWithNotify( editorInput );
		setPartName( editorInput.getName() );
		IProgressMonitor progressMonitor = getActionBars().getStatusLineManager() != null ? getActionBars().getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
		doSave( progressMonitor );
	}

	private EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite().getActionBarContributor();
	}

	private IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener( this.resourceChangeListener );
		this.dbc.dispose();
		super.dispose();
	}

	@Override
	protected void createPages() {
		createModel();

		// Only creates the other pages if there is something that can be edited
		if ( !this.editingDomain.getResourceSet().getResources().isEmpty() ) {
			AntTask task = getTask();
			createPageOverview( task );
			createPageDeploy( task );
			createPageSigning( task );
		}

		getSite().getShell().getDisplay().asyncExec( new Runnable() {
			@SuppressWarnings("synthetic-access")
			@Override
			public void run() {
				setActivePage( 0 );
			}
		} );
	}

	AntTask getTask() {
		AntTask task;
		try {
			task = (AntTask) this.editingDomain.getResourceSet().getResources().get( 0 ).getContents().get( 0 );
		}
		catch ( Exception e ) {
			if ( !this.properties.isEmpty() ) {
				task = PropertiesToModelTransformer.transform( this.properties );
				this.editingDomain.getResourceSet().getResources().get( 0 ).getContents().add( 0, task );
				doSave( new NullProgressMonitor() );
			}
			else {
				throw new UnsupportedOperationException( "Could not read file" ); //$NON-NLS-1$
			}
		}
		return task;
	}

	private void createModel() {
		// Initialize the model, this is important for the class loader.
		AntTasksPackage.eINSTANCE.eClass();
		ParametersPackage.eINSTANCE.eClass();

		URI resourceURI = EditUIUtil.getURI( getEditorInput() );
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = this.editingDomain.getResourceSet().getResource( resourceURI, true );
		}
		catch ( Exception e ) {
			exception = e;
			resource = this.editingDomain.getResourceSet().getResource( resourceURI, false );
		}

		Diagnostic diagnostic = analyzeResourceProblems( resource, exception );
		if ( diagnostic.getSeverity() != Diagnostic.OK ) {
			this.resourceToDiagnosticMap.put( resource, diagnostic );
		}
		this.editingDomain.getResourceSet().eAdapters().add( this.problemIndicationAdapter );
	}

	private EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged( Notification notification ) {
			if ( notification.getNotifier() instanceof Resource ) {
				switch ( notification.getFeatureID( Resource.class ) ) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems( resource, null );
					if ( diagnostic.getSeverity() != Diagnostic.OK ) {
						JFXBuildConfigurationEditor.this.resourceToDiagnosticMap.put( resource, diagnostic );
					}
					else {
						JFXBuildConfigurationEditor.this.resourceToDiagnosticMap.remove( resource );
					}

					if ( JFXBuildConfigurationEditor.this.updateProblemIndication ) {
						getSite().getShell().getDisplay().asyncExec( new Runnable() {
							@Override
							public void run() {
								updateProblemIndication();
							}
						} );
					}
					break;
				}
				}
			}
			else {
				super.notifyChanged( notification );
			}
		}

		@Override
		protected void setTarget( Resource target ) {
			basicSetTarget( target );
		}

		@Override
		protected void unsetTarget( Resource target ) {
			basicUnsetTarget( target );
		}
	};

	@Override
	public void init( IEditorSite site, IEditorInput editorInput ) throws PartInitException {
		if ( !( editorInput instanceof IFileEditorInput ) )
			throw new PartInitException( "Invalid Input: Must be IFileEditorInput" );
		super.init( site, editorInput );
		try {
			IFileEditorInput i = (IFileEditorInput) editorInput;
			this.properties.load( i.getFile().getContents() );
			setPartName( editorInput.getName() );
		}
		catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( CoreException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createPageOverview( final AntTask task ) {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );
		PlatformUI.getWorkbench().getHelpSystem().setHelp( composite, JavaFXUIPlugin.PLUGIN_ID + ".JFXBuildConfigurationEditor_overview" ); //$NON-NLS-1$

		this.bean.setValue( task );

		this.toolkit = new FormToolkit( composite.getDisplay() );

		final Form form = this.toolkit.createForm( composite );
		form.setText( "FX Build Configuration" );
		form.setImage( getTitleImage() );
		form.getBody().setLayout( new FillLayout() );
		this.toolkit.decorateFormHeading( form );

		initToolbar( form );

		ScrolledForm scrolledForm = this.toolkit.createScrolledForm( form.getBody() );
		scrolledForm.getBody().setLayout( new GridLayout( 2, false ) );
		Composite sectionParent = scrolledForm.getBody();

		this.dbc = new DataBindingContext();
		IWidgetValueProperty textModify = WidgetProperties.text( SWT.Modify );
		IWidgetValueProperty selChange = WidgetProperties.selection();

		{
			Section section = this.toolkit.createSection( sectionParent, Section.DESCRIPTION | ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED );
			section.setText( "Build && Package Properties" );
			section.setDescription( "The following properties are needed to build the JavaFX-Application" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = this.toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 4, false ) );

			{
				this.toolkit.createLabel( sectionClient, "Build Directory*:" );
				final Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				this.toolkit.createButton( sectionClient, "Filesystem ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String dir = handleBuildFilesystemDirectorySelection( t.getShell() );
						if ( dir != null ) {
							t.setText( dir );
						}
					}
				} );
				this.toolkit.createButton( sectionClient, "Workspace ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String dir = handleBuildWorkbenchDirectorySelection( t.getShell() );
						if ( dir != null ) {
							t.setText( dir );
						}
					}
				} );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, ANT_TASK__BUILD_DIRECTORY );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Vendor name*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INFO, INFO__VENDOR ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Application title*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain,
						FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INFO, INFO__TITLE ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Application version*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain,
						FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__VERSION ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Application class*:" );
				final Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = this.toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handleRootclassSelection( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain,
						FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__MAINCLASS ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Preloader class:" );
				final Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = this.toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handlePreloaderclassSelection( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain,
						FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__PRELOADERCLASS ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Splash:" );
				final Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER ); //$NON-NLS-1$
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = this.toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handleSplashImage( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__SPLASH_IMAGE ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( this.bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Manifest-Attributes:" )
						.setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = this.toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				GridData gdContainer = new GridData( GridData.FILL_HORIZONTAL );
				gdContainer.horizontalSpan = 2;
				container.setLayoutData( gdContainer );

				Composite tableContainer = this.toolkit.createComposite( container );
				Table t = this.toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				GridData gdTable = new GridData( GridData.FILL_HORIZONTAL );
				gdTable.heightHint = t.getHeaderHeight() + t.getItemHeight() * 5;
				tableContainer.setLayoutData( gdTable );

				TableColumnLayout tablelayout = new TableColumnLayout();
				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getHeaderHeight() + t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( final Object element ) {
							return ( (Param) element ).getName();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 33 ) );
					c.getColumn().setText( "Name" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( final Object element ) {
							return ( (Param) element ).getValue();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 67 ) );
					c.getColumn().setText( "Value" );
				}
				tableContainer.setLayout( tablelayout );
				v.setInput( task.getManifestEntries() );

				Composite buttonComp = this.toolkit.createComposite( sectionClient );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = this.toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddManifestAttr( getSite().getShell() ) ) {
								v.setInput( task.getManifestEntries() );
								v.setSelection( new StructuredSelection( task.getManifestEntries().get( task.getManifestEntries().size() - 1 ) ) );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							Param value = (Param) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( value != null ) {
								if ( handleRemoveManifestAttr( value ) ) {
									v.setInput( task.getManifestEntries() );
								}
							}
							else {
								MessageDialog.openWarning( getSite().getShell(), "Warning", "Please select an entry" );
							}
						}
					} );
				}
				{
					this.toolkit.createLabel( sectionClient, "Toolkit Type:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
					ComboViewer c = new ComboViewer( sectionClient );
					c.getCombo().setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
					c.setContentProvider( new ArrayContentProvider() );
					c.setInput( ApplicationToolkitType.VALUES );
					IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain,
							FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__TOOLKIT ) );
					this.dbc.bindValue( selChange.observe( c.getCombo() ), prop.observeDetail( this.bean ) );
				}
				{
					this.toolkit.createLabel( sectionClient, "Packaging Format:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
					ComboViewer c = new ComboViewer( sectionClient );
					c.getCombo().setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
					c.setContentProvider( new ArrayContentProvider() );
					c.setInput( PackagingFormat.VALUES );
					IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PACKAGING_FORMAT ) );
					this.dbc.bindValue( selChange.observe( c.getCombo() ), prop.observeDetail( this.bean ) );
				}
				{
					Button b = this.toolkit.createButton( sectionClient, "automatic Proxy Resolution", SWT.CHECK );
					b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 4, 1 ) );
					IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PROXY_RESOLUTION ) );
					this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( this.bean ) );
				}
				{
					Button b = this.toolkit.createButton( sectionClient, "Convert CSS into binary form", SWT.CHECK );
					b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 4, 1 ) );
					IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__CSS_TO_BIN ) );
					this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( this.bean ) );
				}
				{
					Button b = this.toolkit.createButton( sectionClient, "Enable verbose build mode (Not recommended)", SWT.CHECK );
					b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 4, 1 ) );
					IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__VERBOSE ) );
					this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( this.bean ) );
				}
			}

			section.setClient( sectionClient );
		}

		{
			Section section = this.toolkit.createSection( sectionParent, Section.DESCRIPTION | ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED );
			section.setText( "Building & Exporting" );
			section.setLayoutData( new GridData( GridData.FILL, GridData.FILL, false, true, 1, 2 ) );

			Composite sectionClient = this.toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 1, false ) );

			{
				FormText text = this.toolkit.createFormText( sectionClient, false );
				text.setText(
						"<p>To generate build instructions and export the project: <li style=\"bullet\" bindent=\"1\">Generate <a href=\"generateAnt\">ant build.xml</a> only</li><li style=\"bullet\" bindent=\"2\">Generate <a href=\"generateAndRun\">ant build.xml and run</a></li>&#160;</p>",
						true, false );
				text.addHyperlinkListener( new IHyperlinkListener() {

					@Override
					public void linkExited( final HyperlinkEvent e ) {
						// nothing
					}

					@Override
					public void linkEntered( HyperlinkEvent e ) {
						// nothing
					}

					@Override
					public void linkActivated( HyperlinkEvent e ) {
						try {
							if ( "generateAndRun".equals( e.getHref() ) ) { //$NON-NLS-1$
								executeExport();
							}
							else {
								executeGenerateAnt();
							}
						}
						catch ( Exception e1 ) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				} );
			}

			section.setClient( sectionClient );
		}

		int index = addPage( composite );
		setPageText( index, "Overview" );
	}

	private void createPageDeploy( final AntTask task ) {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );
		PlatformUI.getWorkbench().getHelpSystem().setHelp( composite, JavaFXUIPlugin.PLUGIN_ID + ".JFXBuildConfigurationEditor_deploy" );

		// TODO
		final WritableValue bean = new WritableValue();
		bean.setValue( task );

		this.toolkit = new FormToolkit( composite.getDisplay() );

		final Form form = this.toolkit.createForm( composite );
		form.setText( "FX Build Configuration" );
		form.setImage( getTitleImage() );
		form.getBody().setLayout( new FillLayout() );
		this.toolkit.decorateFormHeading( form );

		initToolbar( form );

		ScrolledForm scrolledForm = this.toolkit.createScrolledForm( form.getBody() );
		scrolledForm.getBody().setLayout( new GridLayout( 2, false ) );
		Composite sectionParent = scrolledForm.getBody();

		IWidgetValueProperty textModify = WidgetProperties.text( SWT.Modify );
		IWidgetValueProperty selChange = WidgetProperties.selection();

		{
			Section section = this.toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Deploy Properties" );
			section.setDescription( "The following properties are needed to create a Java Webstart Deployment" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = this.toolkit.createComposite( section );
			final int COLUMN_COUNT = 3;
			sectionClient.setLayout( new GridLayout( COLUMN_COUNT, false ) );

			{
				this.toolkit.createLabel( sectionClient, "Applet Width*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.horizontalSpan = COLUMN_COUNT - 1;
				t.setLayoutData( gd );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__WIDTH ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Applet Height*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.horizontalSpan = COLUMN_COUNT - 1;
				t.setLayoutData( gd );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__HEIGHT ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				Button b = this.toolkit.createButton( sectionClient, "Embed JNLP", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, COLUMN_COUNT, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__EMBEDJNLP ) );
				this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = this.toolkit.createButton( sectionClient, "Treat files as extensions", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, COLUMN_COUNT, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__EXTENSION ) );
				this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = this.toolkit.createButton( sectionClient, "Include deployment toolkit", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, COLUMN_COUNT, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INCLUDE_DT ) );
				this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = this.toolkit.createButton( sectionClient, "Offline allowed", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, COLUMN_COUNT, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__OFFLINE_ALLOWED ) );
				this.dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Placeholder Ref.*:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.horizontalSpan = COLUMN_COUNT - 1;
				t.setLayoutData( gd );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PLACEHOLDERREF ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Placeholder ID*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.horizontalSpan = COLUMN_COUNT - 1;
				t.setLayoutData( gd );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PLACEHOLDERID ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "HTML Template:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__TEMPLATE, TEMPLATE__FILE ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
				Button b = this.toolkit.createButton( sectionClient, "Workspace ...", SWT.NONE );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						FilteredResourcesSelectionDialog d = new FilteredResourcesSelectionDialog( getSite().getShell(), false,
								( (IFileEditorInput) getEditorInput() ).getFile().getProject(), IResource.FILE ) {
							@Override
							protected IStatus validateItem( final Object item ) {
								IFile f = (IFile) item;
								if ( f.getParent() instanceof IProject ) {
									return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The selected resource has to be part of the source folder" );
								}
								if ( !f.getName().endsWith( JavaFXUIPlugin.FILEEXTENSION_HTML_TEMPLATE ) ) {
									return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The selected resource does not seem to be a html file" );
								}
								return super.validateItem( item );
							}
						};

						if ( d.open() == Window.OK ) {
							Object[] rv = d.getResult();
							if ( rv.length == 1 ) {
								IFile f = (IFile) rv[0];
								IJavaElement j = JavaCore.create( f.getParent() );
								String template = null;
								if ( j instanceof IPackageFragment ) {
									IPackageFragment p = (IPackageFragment) j;
									template = p.getElementName().replace( '.', '/' ) + "/" + f.getName(); //$NON-NLS-1$
								}
								else if ( j instanceof IPackageFragmentRoot ) {
									IPackageFragmentRoot p = (IPackageFragmentRoot) j;
									template = f.getName();
								}
								else {
									MessageDialog.openInformation( getSite().getShell(), "Not valid",
											"The selected resource has to be part of the source folder" );
								}
								if ( template != null ) {
									if ( getTask().getDeploy().getTemplate() == null ) {
										Command cmd = new SetCommand( JFXBuildConfigurationEditor.this.editingDomain, getTask().getDeploy(), DEPLOY__TEMPLATE, ParametersFactory.eINSTANCE
												.createTemplate() );
										if ( cmd.canExecute() ) {
											cmd.execute();
										}
									}
									Command cmd = new SetCommand( JFXBuildConfigurationEditor.this.editingDomain, getTask().getDeploy().getTemplate(), TEMPLATE__FILE, template );
									if ( cmd.canExecute() ) {
										cmd.execute();
									}
								}
							}
						}
					}
				} );
			}

			{
				this.toolkit.createLabel( sectionClient, "Template Output File:" );
				Text t = this.toolkit.createText( sectionClient, "", SWT.BORDER );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.horizontalSpan = COLUMN_COUNT - 1;
				t.setLayoutData( gd );
				IEMFValueProperty prop = EMFEditProperties.value( this.editingDomain, FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__TEMPLATE, TEMPLATE__TO_FILE ) );
				this.dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				this.toolkit.createLabel( sectionClient, "Webstart Splash:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = this.toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				GridData gdContainer = new GridData( GridData.FILL_HORIZONTAL );
				gdContainer.horizontalSpan = COLUMN_COUNT - 1;
				container.setLayoutData( gdContainer );

				Composite tableContainer = this.toolkit.createComposite( container );
				Table t = this.toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				GridData gdTable = new GridData( GridData.FILL_HORIZONTAL );
				gdTable.heightHint = t.getItemHeight() * 5;
				tableContainer.setLayoutData( gdTable );

				TableColumnLayout tablelayout = new TableColumnLayout();

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( final Object element ) {
							return ( (Splash) element ).getMode().getName();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 10, 100, false ) );
					c.getColumn().setText( "Mode" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( final Object element ) {
							return ( (Splash) element ).getHref();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 90 ) );
					c.getColumn().setText( "URL" );
				}
				tableContainer.setLayout( tablelayout );
				v.setInput( task.getDeploy().getInfo().getSplash() );

				Composite buttonComp = this.toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = this.toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddSplash() ) {
								v.setInput( task.getDeploy().getInfo().getSplash() );
								v.setSelection( new StructuredSelection( task.getDeploy().getInfo().getSplash()
										.get( task.getDeploy().getInfo().getSplash().size() - 1 ) ) );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							Splash value = (Splash) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( value != null ) {
								if ( handleRemoveSplash( value ) ) {
									v.setInput( getTask().getDeploy().getInfo().getSplash() );
								}
							}
							else {
								MessageDialog.openWarning( getSite().getShell(), "Warning", "Please select an entry" );
							}
						}
					} );
				}
			}

			{
				toolkit.createLabel( sectionClient, "Webstart Icons:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				GridData gdContainer = new GridData( GridData.FILL_HORIZONTAL );
				gdContainer.horizontalSpan = COLUMN_COUNT - 1;
				container.setLayoutData( gdContainer );

				Composite tableContainer = toolkit.createComposite( container );
				Table t = toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				GridData gdTable = new GridData( GridData.FILL_HORIZONTAL );
				gdTable.heightHint = t.getItemHeight() * 5;
				tableContainer.setLayoutData( gdTable );

				TableColumnLayout tablelayout = new TableColumnLayout();

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (Icon) element ).getDepth();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 10, 50, false ) );
					c.getColumn().setText( "Depth" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (Icon) element ).getKind().getName();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 10, 100, false ) );
					c.getColumn().setText( "Kind" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (Icon) element ).getWidth();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 10, 50, false ) );
					c.getColumn().setText( "Width" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (Icon) element ).getHeight();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 10, 50, false ) );
					c.getColumn().setText( "Height" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (Icon) element ).getHref();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 60 ) );
					c.getColumn().setText( "Url" );
				}
				tableContainer.setLayout( tablelayout );
				v.setInput( task.getDeploy().getInfo().getIcon() );

				Composite buttonComp = this.toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = this.toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddIcon() ) {
								v.setInput( task.getDeploy().getInfo().getIcon() );
								v.setSelection( new StructuredSelection( task.getDeploy().getInfo().getIcon()
										.get( task.getDeploy().getInfo().getIcon().size() - 1 ) ) );
							}
						}
					} );
				}

				{
					Button b = this.toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							Icon value = (Icon) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( value != null ) {
								if ( handleRemoveIcon( value ) ) {
									v.setInput( task.getDeploy().getInfo().getIcon() );
								}
							}
							else {
								MessageDialog.openWarning( getSite().getShell(), "Warning", "Please select an entry" );
							}
						}
					} );
				}
			}

			{
				this.toolkit.createLabel( sectionClient, "Additional META-INF files:" ).setLayoutData(
						new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				GridData gdContainer = new GridData( GridData.FILL_HORIZONTAL );
				gdContainer.horizontalSpan = COLUMN_COUNT - 1;
				container.setLayoutData( gdContainer );

				Composite tableContainer = toolkit.createComposite( container );
				Table t = toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				GridData gdTable = new GridData( GridData.FILL_HORIZONTAL );
				gdTable.heightHint = t.getItemHeight() * 5;
				tableContainer.setLayoutData( gdTable );

				TableColumnLayout tablelayout = new TableColumnLayout();

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (KeyValuePair) element ).getKey();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 33 ) );
					c.getColumn().setText( "Folder" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (KeyValuePair) element ).getValue();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 67 ) );
					c.getColumn().setText( "File" );
				}
				tableContainer.setLayout( tablelayout );
				v.setInput( task.getFiles() );

				Composite buttonComp = this.toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = this.toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddMetaInfFile() ) {
								v.setInput( task.getFiles() );
								v.setSelection( new StructuredSelection( task.getFiles().get( task.getFiles().size() - 1 ) ) );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							KeyValuePair value = (KeyValuePair) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( value != null ) {
								if ( handleRemoveMetaInfFile( value ) ) {
									v.setInput( task.getFiles() );
								}
							}
							else {
								MessageDialog.openWarning( getSite().getShell(), "Warning", "Please select an entry" );
							}
						}
					} );
				}
			}

			{
				this.toolkit.createLabel( sectionClient, "Fonts:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				GridData gdContainer = new GridData( GridData.FILL_HORIZONTAL );
				gdContainer.horizontalSpan = COLUMN_COUNT - 1;
				container.setLayoutData( gdContainer );

				Composite tableContainer = toolkit.createComposite( container );
				Table t = toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				GridData gdTable = new GridData( GridData.FILL_HORIZONTAL );
				gdTable.heightHint = t.getItemHeight() * 5;
				tableContainer.setLayoutData( gdTable );

				TableColumnLayout tablelayout = new TableColumnLayout();

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				final ArrayContentProvider cp = new ArrayContentProvider();
				v.setContentProvider( cp );

				{
					IEMFValueProperty prop = EMFEditProperties.value( editingDomain, ParametersPackage.Literals.KEY_VALUE_PAIR__KEY );
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					TableColumn tc = c.getColumn();
					tc.setText( "Font name" );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (KeyValuePair) element ).getKey();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 33 ) );
				}

				{
					IEMFValueProperty prop = EMFEditProperties.value( editingDomain, ParametersPackage.Literals.KEY_VALUE_PAIR__VALUE );
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					TableColumn tc = c.getColumn();
					tc.setText( "File" );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (KeyValuePair) element ).getValue();
						}
					} );
					tablelayout.setColumnData( c.getColumn(), new ColumnWeightData( 67 ) );
				}
				tableContainer.setLayout( tablelayout );
				v.setInput( task.getFonts() );

				Composite buttonComp = toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddFont() ) {
								final KeyValuePair newFont = task.getFonts().get( task.getFonts().size() - 1 );
								v.refresh();
								v.setSelection( new StructuredSelection( newFont ) );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							KeyValuePair value = (KeyValuePair) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( value != null ) {
								if ( handleRemoveFont( value ) ) {
									v.setInput( task.getFonts() );
								}
							}
							else {
								MessageDialog.openWarning( getSite().getShell(), "Warning", "Please select an entry" );
							}
						}
					} );
				}
			}
			section.setClient( sectionClient );
		}
		int index = addPage( composite );
		setPageText( index, "Deploy" );
	}

	/**
	 * initialize tool bar for a form.
	 */
	private void initToolbar( final Form form ) {
		IToolBarManager mgr = form.getToolBarManager();
		// TODO do not use the hard coded image name here
		mgr.add( new Action( "Build & Export FX Application", ImageDescriptor.createFromURL( getClass().getClassLoader().getResource(
				"/icons/exportrunnablejar_wiz.gif" ) ) ) {
			@Override
			public void run() {
				try {
					executeExport();
				}
				catch ( Exception e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} );
		// mgr.add(new Action("Export Ant File",ImageDescriptor.createFromURL(getClass().getClassLoader().getResource("/icons/exportAnt_co.gif"))) {
		// @Override
		// public void run() {
		//
		// }
		// });
		form.updateToolBar();
	}

	/**
	 * handleRemoveMetaInfFile.
	 *
	 * @param value
	 *            the value to delete
	 * @return true if value was deleted, and false otherwise.
	 */
	boolean handleRemoveMetaInfFile( final KeyValuePair value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected META-INF file" ) ) {
			RemoveCommand cmd = new RemoveCommand( editingDomain, getTask().getFiles(), value );
			if ( cmd.canExecute() ) {
				cmd.execute();
				return true;
			}
		}
		return false;
	}

	/**
	 * handleRemoveFont.
	 *
	 * @param value
	 *            the value to delete
	 * @return true if value was deleted, and false otherwise.
	 */
	private boolean handleRemoveFont( final KeyValuePair value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected font" ) ) {
			RemoveCommand cmd = new RemoveCommand( editingDomain, getTask().getFonts(), value );
			if ( cmd.canExecute() ) {
				cmd.execute();
				return true;
			}
		}
		return false;
	}

	/**
	 * handleAddService.
	 *
	 * @return the return code
	 *
	 * @see TitleAreaDialog#open()
	 */
	boolean handleAddMetaInfFile() {
		AddMetaInfFileDialog d = new AddMetaInfFileDialog( getSite().getShell(), editingDomain, getTask(), ( (IFileEditorInput) getEditorInput() ).getFile()
				.getProject().getWorkspace().getRoot() );
		return d.open() == TitleAreaDialog.OK;
	}

	/**
	 * handleAddFont.
	 *
	 * @return the return code
	 *
	 * @see TitleAreaDialog#open()
	 */
	private boolean handleAddFont() {
		AddFontDialog d = new AddFontDialog( getSite().getShell(), editingDomain, getTask(), ( (IFileEditorInput) getEditorInput() ).getFile().getProject() );
		return d.open() == TitleAreaDialog.OK;
	}

	private void createPageSigning( AntTask task ) {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );
		PlatformUI.getWorkbench().getHelpSystem().setHelp( composite, JavaFXUIPlugin.PLUGIN_ID + ".JFXBuildConfigurationEditor_signing" );

		final WritableValue bean = new WritableValue();
		bean.setValue( task );

		toolkit = new FormToolkit( composite.getDisplay() );

		final Form form = toolkit.createForm( composite );
		form.setText( "FX Build Configuration" );
		form.setImage( getTitleImage() );
		form.getBody().setLayout( new FillLayout() );
		toolkit.decorateFormHeading( form );

		initToolbar( form );

		ScrolledForm scrolledForm = toolkit.createScrolledForm( form.getBody() );
		scrolledForm.getBody().setLayout( new GridLayout( 2, false ) );
		Composite sectionParent = scrolledForm.getBody();

		IWidgetValueProperty textModify = WidgetProperties.text( SWT.Modify );

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Signing Properties" );
			section.setDescription( "Information for signing result jar" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 4, false ) );

			{
				toolkit.createLabel( sectionClient, "Alias*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__ALIAS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Key-Password*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__KEYPASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Keystore*:" );
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				toolkit.createButton( sectionClient, "Filesystem ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String v = handleKeyStoreFilesystemSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				toolkit.createButton( sectionClient, "Workspace ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String v = handleKeyStoreWorkspaceSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__KEYSTORE ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Store-Password*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__STOREPASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Storetype:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFEditProperties.value( editingDomain, FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__STORETYPE ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			section.setClient( sectionClient );
		}

		int index = addPage( composite );
		setPageText( index, "Signing" );
	}

	/**
	 * handleRemoveManifestAttr.
	 *
	 * @param value
	 *            the value to delete
	 * @return true if value was deleted, and false otherwise.
	 */
	boolean handleRemoveManifestAttr( final Param value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected attribute" ) ) {
			RemoveCommand cmd = new RemoveCommand( editingDomain, getTask().getManifestEntries(), value );
			if ( cmd.canExecute() ) {
				cmd.execute();
				return true;
			}
		}
		return false;
	}

	/**
	 * handleAddManifestAttr.
	 *
	 * @return the return code
	 *
	 * @see TitleAreaDialog#open()
	 */
	boolean handleAddManifestAttr( Shell shell ) {
		AddManifestAttributeDialog d = new AddManifestAttributeDialog( getSite().getShell(), editingDomain, getTask() );
		return d.open() == TitleAreaDialog.OK;
	}

	String handleSplashImage( Shell shell ) {
		FilteredResourcesSelectionDialog d = new FilteredResourcesSelectionDialog( shell, false,
				( (IFileEditorInput) getEditorInput() ).getFile().getProject(), IResource.FILE ) {
			@Override
			protected IStatus validateItem( Object item ) {
				IFile f = (IFile) item;
				if ( f.getParent() instanceof IProject ) {
					return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The selected resource has to part of the source folder" );
				}
				return super.validateItem( item );
			}
		};
		if ( d.open() == ResourceSelectionDialog.OK ) {
			Object[] rv = d.getResult();
			if ( rv.length == 1 ) {
				IFile f = (IFile) rv[0];
				IJavaElement j = JavaCore.create( f.getParent() );
				if ( j instanceof IPackageFragment ) {
					IPackageFragment p = (IPackageFragment) j;
					return p.getElementName().replace( '.', '/' ) + "/" + f.getName();
				}
				else if ( j instanceof IPackageFragmentRoot ) {
					return f.getName();
				}
				else {
					MessageDialog.openInformation( shell, "Not valid", "The selected resource has to part of the source folder" );
				}
			}
		}
		return null;
	}

	/**
	 * handleRemoveIcon.
	 *
	 * @param value
	 *            the value to delete
	 * @return true if value was deleted, and false otherwise.
	 */
	boolean handleRemoveIcon( final Icon value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected icon" ) ) {
			RemoveCommand cmd = new RemoveCommand( editingDomain, getTask().getDeploy().getInfo().getIcon(), value );
			if ( cmd.canExecute() ) {
				cmd.execute();
				return true;
			}
		}
		return false;
	}

	/**
	 * handleAddIcon.
	 *
	 * @return the return code
	 *
	 * @see TitleAreaDialog#open()
	 */
	boolean handleAddIcon() {
		AddIconDialog d = new AddIconDialog( getSite().getShell(), editingDomain, getTask() );
		return d.open() == TitleAreaDialog.OK;
	}

	/**
	 * handleAddSplash.
	 *
	 * @return the return code
	 *
	 * @see TitleAreaDialog#open()
	 */
	boolean handleAddSplash() {
		AddSplashDialog d = new AddSplashDialog( getSite().getShell(), editingDomain, getTask() );
		return d.open() == TitleAreaDialog.OK;
	}

	/**
	 * handleRemoveSplash.
	 *
	 * @param value
	 *            the value to delete
	 * @return true if value was deleted, and false otherwise.
	 */
	boolean handleRemoveSplash( final Splash value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected splash" ) ) {
			RemoveCommand cmd = new RemoveCommand( editingDomain, getTask().getDeploy().getInfo().getSplash(), value );
			if ( cmd.canExecute() ) {
				cmd.execute();
				return true;
			}
		}
		return false;
	}

	String handleBuildFilesystemDirectorySelection( final Shell parent ) {
		DirectoryDialog dialog = new DirectoryDialog( parent );
		return dialog.open();
	}

	String handleBuildWorkbenchDirectorySelection( final Shell parent ) {
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();

		Class<?>[] acceptedClasses = new Class[] { IProject.class, IFolder.class };
		ViewerFilter filter = new TypedViewerFilter( acceptedClasses );

		FolderSelectionDialog dialog = new FolderSelectionDialog( parent, lp, cp );
		dialog.setTitle( "Output directory" );
		dialog.setMessage( "Select output directory" );
		dialog.addFilter( filter );
		dialog.setInput( ResourcesPlugin.getWorkspace().getRoot() );
		if ( dialog.open() == Window.OK ) {
			IContainer c = (IContainer) dialog.getFirstResult();
			if ( c.getProject() == ( (IFileEditorInput) getEditorInput() ).getFile().getProject() ) {
				return "${project}/" + c.getProjectRelativePath().toString();
			}
			else {
				return "${workspace}/" + c.getProject().getName() + "/" + c.getProjectRelativePath().toString();
			}
		}
		return null;
	}

	String handleRootclassSelection( Shell parent ) {
		IFileEditorInput i = (IFileEditorInput) getEditorInput();
		IJavaProject project = JavaCore.create( i.getFile().getProject() );
		if ( project == null ) {
			return null;
		}

		IJavaElement[] elements = new IJavaElement[] { project };

		int constraints = IJavaSearchScope.SOURCES;
		constraints |= IJavaSearchScope.APPLICATION_LIBRARIES;

		IJavaSearchScope searchScope = SearchEngine.createJavaSearchScope( elements, constraints );
		BusyIndicatorRunnableContext context = new BusyIndicatorRunnableContext();

		MainTypeSelectionDialog dialog = new MainTypeSelectionDialog( parent, context, searchScope, 0 );
		dialog.setTitle( "Find class" );
		dialog.setMessage( "Find the class used to launch the application" );
		if ( dialog.open() == Window.CANCEL ) {
			return null;
		}
		Object[] results = dialog.getResult();
		IType type = (IType) results[0];
		if ( type != null ) {
			return type.getFullyQualifiedName();
		}

		return null;
	}

	String handlePreloaderclassSelection( Shell parent ) {
		IFileEditorInput i = (IFileEditorInput) getEditorInput();
		IJavaProject project = JavaCore.create( i.getFile().getProject() );
		if ( project == null ) {
			return null;
		}

		try {
			IType superType = project.findType( "javafx.application.Preloader" );

			IJavaSearchScope searchScope = SearchEngine.createStrictHierarchyScope( project, superType, true, false, null );

			SelectionDialog dialog = JavaUI.createTypeDialog( parent, PlatformUI.getWorkbench().getProgressService(), searchScope,
					IJavaElementSearchConstants.CONSIDER_CLASSES, false, "" );
			dialog.setTitle( "Find Preloader" );
			if ( dialog.open() == Window.OK ) {
				IType type = (IType) dialog.getResult()[0];
				return type.getFullyQualifiedName( '$' );
			}
		}
		catch ( JavaModelException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private String handleKeyStoreFilesystemSelection( Shell parent ) {
		FileDialog dialog = new FileDialog( parent, SWT.OPEN );
		String keystore = dialog.open();
		if ( keystore != null ) {
			IStatus s = validateKeyStore( new File( keystore ) );
			if ( s.isOK() ) {
				return keystore;
			}
			else {
				MessageDialog.openError( parent, "Not a keystore", "Looks like the selected file is not a keystore" );
				return handleKeyStoreFilesystemSelection( parent );
			}
		}
		return null;
	}

	private String handleKeyStoreWorkspaceSelection( Shell parent ) {
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();

		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog( parent, lp, cp );
		dialog.setValidator( new ISelectionStatusValidator() {

			@Override
			public IStatus validate( final Object[] selection ) {
				if ( selection.length > 1 ) {
					return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Only one file allowed." );
				}
				else if ( selection.length == 1 ) {
					if ( selection[0] instanceof IFile ) {
						IFile f = (IFile) selection[0];
						return validateKeyStore( f.getLocation().toFile() );
					}
				}
				return Status.OK_STATUS;
			}
		} );
		dialog.setInput( ResourcesPlugin.getWorkspace().getRoot() );

		if ( dialog.open() == Window.OK ) {
			IFile f = (IFile) dialog.getFirstResult();
			if ( f != null ) {
				if ( f.getProject() == ( (IFileEditorInput) getEditorInput() ).getFile().getProject() ) {
					return "${project}/" + f.getProjectRelativePath().toString();
				}
				else {
					return "${workspace}/" + f.getProject().getName() + "/" + f.getProjectRelativePath().toString();
				}
			}
		}
		return null;
	}

	private IStatus validateKeyStore( final File f ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( f );
			KeyStore ks = KeyStore.getInstance( KeyStore.getDefaultType() );
			ks.load( fis, null );
		}
		catch ( FileNotFoundException e ) {
			return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The keystore file '" + f.getAbsolutePath() + "' is not found.", e );
		}
		catch ( KeyStoreException e ) {
			return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Unable to initialize keystore", e );
		}
		catch ( NoSuchAlgorithmException e ) {
			return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Loading keystore failed. Is this a valid keystore?", e );
		}
		catch ( CertificateException e ) {
			return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Loading keystore failed. Is this a valid keystore?", e );
		}
		catch ( IOException e ) {
			if ( e.getCause() instanceof UnrecoverableKeyException ) {
				return Status.OK_STATUS;
			}
			return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Loading keystore failed. Is this a valid keystore?", e );
		}
		finally {
			if ( fis != null ) {
				try {
					fis.close();
				}
				catch ( IOException e ) {
				}
			}
		}
		return Status.OK_STATUS;
	}

	@Override
	protected void pageChange( int newPageIndex ) {
		dbc.updateTargets();
	}
	
	/**
	 * If there is more than one page in the multi-page editor part, this shows the tabs at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private void showTabs() {
		if ( getPageCount() > 1 ) {
			setPageText( 0, "Selection" );
			if ( getContainer() instanceof CTabFolder ) {
				( (CTabFolder) getContainer() ).setTabHeight( SWT.DEFAULT );
				Point point = getContainer().getSize();
				getContainer().setSize( point.x, point.y - 6 );
			}
		}
	}

	/**
	 * @throws Exception
	 *             exception
	 */
	void executeExport() throws Exception {
		if ( validateAndShowErrors() ) {
			IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService( IHandlerService.class );
			hs.executeCommand( "org.eclipse.fx.ide.jdt.ui.export", null );
		}
	}

	/**
	 * @throws Exception
	 *             exception
	 */
	void executeGenerateAnt() throws Exception {
		if ( validateAndShowErrors() ) {
			IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService( IHandlerService.class );
			hs.executeCommand( "org.eclipse.fx.ide.jdt.ui.generateAnt", null );
		}
	}

	/**
	 * @return <true> if build configuration is valid, <false> otherwise
	 */
	private boolean validateAndShowErrors() {
		MultiStatus status = new MultiStatus( JavaFXUIPlugin.PLUGIN_ID, IStatus.OK, null, null );
		// dirty
		if ( isDirty() ) {
			boolean option = MessageDialog.openQuestion( getSite().getShell(), "Save FX Build Configuration", getEditorInput().getName()
					+ " must be saved before generating ant build.xml file.\nSave changes now?" );
			if ( option ) {
				doSave( new NullProgressMonitor() );
			}
			else {
				return false;
			}
		}
		// height
		if ( getTask().getDeploy().getHeight() != null && getTask().getDeploy().getHeight().length() > 0 ) {
			try {
				Integer.parseInt( getTask().getDeploy().getHeight() );
			}
			catch ( Exception e ) {
				status.add( new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Height must be an integer value" ) );
			}
		}
		// width
		if ( getTask().getDeploy().getWidth() != null && getTask().getDeploy().getWidth().length() > 0 ) {
			try {
				Integer.parseInt( getTask().getDeploy().getWidth() );
			}
			catch ( Exception e ) {
				status.add( new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Width must be an integer value" ) );
			}
		}
		// Show the collected errors
		if ( !status.isOK() ) {
			StringBuffer errors = new StringBuffer();
			for ( IStatus err : status.getChildren() ) {
				errors.append( err.getMessage() ).append( "\n" );
			}
			MessageDialog.openWarning( getSite().getShell(), "Invalid FX Build configuration", errors.toString() );
		}
		return status.isOK();
	}
}

/**
 * Implementation of a cell label provider which provides support for formatting using {@link MessageFormat#format(String, Object...)}
 */
class GenericMapCellLabelProvider extends ObservableMapCellLabelProvider {
	private IObservableMap[] attributeMaps;
	private String messagePattern;

	/**
	 * Create a new label provider
	 *
	 * @param messagePattern
	 *            the message pattern
	 * @param attributeMaps
	 *            the values to observe
	 */
	public GenericMapCellLabelProvider( String messagePattern, IObservableMap... attributeMaps ) {
		super( attributeMaps );
		this.messagePattern = messagePattern;
		this.attributeMaps = attributeMaps;
	}

	@Override
	public void update( ViewerCell cell ) {
		Object element = cell.getElement();
		Object[] values = new Object[attributeMaps.length];
		int i = 0;
		for ( IObservableMap m : attributeMaps ) {
			values[i++] = m.get( element );
			if ( values[i - 1] == null ) {
				cell.setText( "" ); //$NON-NLS-1$
				return;
			}
		}
		cell.setText( MessageFormat.format( messagePattern, values ) );
	}
}
