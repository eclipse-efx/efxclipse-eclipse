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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class RemoveCssEditorNature extends AbstractHandler implements IHandler {

	private final static String NATURE_ID = "org.eclipse.fx.ide.css.nature";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IProject project = getProject(event);

		try {
			IProjectDescription description = project.getDescription();
			String[] natureIds = description.getNatureIds();
			
			boolean found = false;
			for (String natureId : natureIds) {
				if (NATURE_ID.equals(natureId)) {
					found = true;
					break;
				}
			}
			
			if (found) {
				String[] newNatureIds = new String[natureIds.length-1];
				int i = 0;
				for (String natureId : natureIds) {
					if (!NATURE_ID.equals(natureId)) {
						newNatureIds[i++] = natureId;
					}
				}
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
