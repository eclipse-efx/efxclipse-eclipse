package org.eclipse.fx.ide.css.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.CSSEditorNature;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class AddCssEditorNature extends AbstractHandler implements IHandler {

	private Logger logger;
	private Logger getLogger() {
		if (this.logger == null) {
			this.logger = LoggerCreator.createLogger(RemoveCssEditorNature.class);
		}
		return this.logger;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IProject project = getProject(event);
		this.getLogger().debug("adding css nature to " + project.getName()); //$NON-NLS-1$
		try {
			IProjectDescription description = project.getDescription();
			String[] natureIds = description.getNatureIds();
			
			boolean found = false;
			for (String natureId : natureIds) {
				if (CSSEditorNature.NATURE_ID.equals(natureId)) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				String[] newNatureIds = new String[natureIds.length+1];
				int i = 0;
				for (i = 0; i < natureIds.length; i++) {
					newNatureIds[i] = natureIds[i];
				}
				newNatureIds[natureIds.length] = CSSEditorNature.NATURE_ID;
				description.setNatureIds(newNatureIds);
				project.setDescription(description, new NullProgressMonitor());
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.err.println(event);
		return null;
	}

	public static IProject getProject(final ExecutionEvent event) {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			final Object element = ((IStructuredSelection) selection)
					.getFirstElement();

			return (IProject) Platform.getAdapterManager().getAdapter(element, IProject.class);
		}

		return null;
	}

}
