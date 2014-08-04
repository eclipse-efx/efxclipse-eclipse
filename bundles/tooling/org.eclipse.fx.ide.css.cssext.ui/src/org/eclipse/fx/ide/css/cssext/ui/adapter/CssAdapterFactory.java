package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.osgi.util.LoggerCreator;

public class CssAdapterFactory implements IAdapterFactory {

	private Logger logger;
	private Logger getLogger() {
		if (this.logger == null) {
			this.logger = LoggerCreator.createLogger(CssAdapterFactory.class);
		}
		return this.logger;
	}
	
	private Map<Object, ICssResource> adapterCache = new WeakHashMap<>();
	
	public CssAdapterFactory() {
	}
	
	private ICssResource createAdapter(Object adaptableObject) {
		getLogger().debug("=> creating adapter");
		if (adaptableObject instanceof IProject) {
			getLogger().debug(" IProject-> CssProject");
			return new CssProject((IResource)adaptableObject);
		}
		// is file?
		final IFile adapter = (IFile) Platform.getAdapterManager().getAdapter(adaptableObject, IFile.class);
		if (adapter != null) {
			getLogger().debug(" IFile -> CssFile");
			return new CssFile((IResource)adaptableObject);
		}
		else {
			getLogger().debug("  ? -> CssFolder");
			return new CssFolder((IResource)adaptableObject);
		}
	}
	
	private ICssResource getOrCreateAdapter(Object adaptableObject) {
		if (adapterCache.containsKey(adaptableObject)) {
			getLogger().debug("=> result from cache");
			return adapterCache.get(adaptableObject);
		}
		else {
			final ICssResource newAdapter = createAdapter(adaptableObject);
			adapterCache.put(adaptableObject, newAdapter);
			return newAdapter;
		}
	}
	
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		getLogger().debug("getAdapter(" + adaptableObject + ") " + adaptableObject.getClass().getName());  //$NON-NLS-1$//$NON-NLS-2$
		if (adapterType == ICssResource.class) {
			return getOrCreateAdapter(adaptableObject);
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { ICssResource.class };
	}

}
