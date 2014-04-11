package org.eclipse.fx.ide.css.jfx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerFactory;
import org.eclipse.fx.core.log.Logger.Level;
import org.eclipse.fx.ide.css.cssext.ICSSExtModelProvider;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

public class JFXModelProvider implements ICSSExtModelProvider {
	private CssExtension jfx2Model;
	private CssExtension jfx8Model;
	private Map<IVMInstall, Boolean> JDK8CACHE = new HashMap<>();
	private Logger logger;   
	
	/**
	 * 
	 */
	public JFXModelProvider() {
//		logger.debug("Created instance of " + this);
	}
	
	@Override
	public Collection<CssExtension> getModels(IFile file) {
		if( ! file.getName().endsWith(".css") ) {
			return Collections.emptyList();
		}
		try {
			System.err.println("logger: " + logger.isEnabled(Level.DEBUG));
			logger.debug("Resolving models on file '"+file+"'");
			if( ! isJDTProject(file.getProject()) ) {
				logger.debug("Project is not a JDT-Project");
				return Collections.emptySet();
			}
		
			//TODO Check if it is a web project
		
			IJavaProject jp = JavaCore.create(file.getProject());
			IVMInstall i = JavaRuntime.getVMInstall(jp);
			
			if( i == null ) {
				logger.debug("No VM-Install found using default");
				i = JavaRuntime.getDefaultVMInstall();
			}
			
			logger.debug("Java Runtime is " + i);
			
			if( ! isJava8(i) ) {
				if( jfx2Model == null ) {
					jfx2Model = loadModel("jfx2");
				}
				
				logger.debug("This is Java7");
				
				return Collections.singleton(jfx2Model);
			} else {
				if( jfx8Model == null ) {
					jfx8Model = loadModel("jfx8");
				}
				
				logger.debug("This is Java8");
				
				return Collections.singleton(jfx8Model);
			}
			
		} catch (CoreException e) {
			logger.error("Failed to extract JDT informations", e);
		}
		
		logger.debug("No format CSS-Ext files are found");
		
		return Collections.emptySet();
	}
	
	private boolean isJava8(IVMInstall i) {
		Boolean rv = JDK8CACHE.get(i);
		if( rv != null ) {
			return rv;
		}
		
		for( LibraryLocation l : JavaRuntime.getLibraryLocations(i) ) {
			if( "jfxrt.jar".equals(l.getSystemLibraryPath().lastSegment()) ) {
				JDK8CACHE.put(i, Boolean.TRUE);
				return true;
			}
		}
		JDK8CACHE.put(i, Boolean.FALSE);
		return false;
	}
	
	private boolean isJDTProject(IProject p) throws CoreException {
		return p.getNature(JavaCore.NATURE_ID) != null;
	}

	private CssExtension loadModel(String name) {
		URI uri = URI.createPlatformPluginURI("/org.eclipse.fx.ide.css.jfx/OSGI-INF/"+name+".cssext", true);
		
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		CssExtension model = (CssExtension) resource.getContents().get(0);
		return model;
	}
	
	public void bindLoggerFactory(LoggerFactory factory) {
		logger = factory.createLogger(getClass().getName());
	}
	
	public void unbindLoggerFactory(LoggerFactory factory) {
		logger = null;
	}
}
