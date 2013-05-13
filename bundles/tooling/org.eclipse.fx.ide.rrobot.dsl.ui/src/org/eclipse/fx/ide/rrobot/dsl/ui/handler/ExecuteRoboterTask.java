package org.eclipse.fx.ide.rrobot.dsl.ui.handler;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.ide.rrobot.RRobot;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.validation.IResourceValidator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;


import com.google.inject.Inject;
import com.google.inject.Provider;

public class ExecuteRoboterTask extends AbstractHandler {
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Bundle b = FrameworkUtil.getBundle(getClass());
		BundleContext ctx = b.getBundleContext();
		ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
		final RRobot r = ctx.getService(ref);

		IStructuredSelection ss = (IStructuredSelection)HandlerUtil.getActiveMenuSelection(event);
		IFile f = (IFile) ss.getFirstElement();
		
		URI uri = URI.createPlatformResourceURI(f.getProject().getName()+"/"+f.getProjectRelativePath().toString(),true);
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(uri, true);
		
		final RobotTask task = (RobotTask) resource.getContents().get(0); 
		WorkspaceModifyOperation w = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
				Map<String,Object> map = new HashMap<String, Object>();
				r.executeTask(monitor, task, map);
			}
		};
		
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, false, w);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
