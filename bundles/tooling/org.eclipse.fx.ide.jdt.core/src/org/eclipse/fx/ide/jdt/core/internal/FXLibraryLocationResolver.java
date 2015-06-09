package org.eclipse.fx.ide.jdt.core.internal;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.jdt.launching.ILibraryLocationResolver;

public class FXLibraryLocationResolver implements ILibraryLocationResolver {
	private static Logger LOGGER = LoggerCreator.createLogger(FXLibraryLocationResolver.class);
	
	public FXLibraryLocationResolver() {
	}

	@Override
	public IPath getPackageRoot(IPath libraryPath) {
		return Path.EMPTY;
	}

	@Override
	public IPath getSourcePath(IPath libraryPath) {
		if( libraryPath.lastSegment().endsWith("jfxrt.jar") ) {
			File jarLocation = libraryPath.toFile();
			File jdkHome = jarLocation.getParentFile().getParentFile().getParentFile().getParentFile();
			IPath srcPath = new Path(jdkHome.getAbsolutePath()).append("javafx-src.zip");
			if( srcPath.toFile().exists() ) {
				return srcPath;
			}
		}
		return Path.EMPTY;
	}

	@Override
	public URL getJavadocLocation(IPath libraryPath) {
		if( libraryPath.lastSegment().endsWith("jfxrt.jar") ) {
			try {
				File jarLocation = libraryPath.toFile();
				LOGGER.debug("jfxrt.jar at '"+jarLocation.getAbsolutePath()+"'");
				File jdkHome = jarLocation.getParentFile().getParentFile().getParentFile().getParentFile();
				LOGGER.debug("JAVA_HOME: " + jdkHome.getAbsolutePath());
				File javaDoc = new Path(jdkHome.getAbsolutePath()).append("docs").append("api").toFile();
				LOGGER.debug("Assumed JRE JavaDoc location: " + javaDoc.getAbsolutePath());
				if( javaDoc.exists() ) {
					return javaDoc.toURI().toURL();
				}
				
				LOGGER.debug("Checking user home for JavaDoc");
				javaDoc = new Path(System.getProperty("user.home")).append("javafx8-api").append("docs").append("api").toFile();
				LOGGER.debug("Assumed user home JavaDoc location: " + javaDoc.getAbsolutePath());
				if( javaDoc.exists() ) {
					return javaDoc.toURI().toURL();
				}
				
				return new URL(BuildPathSupport.WEB_JAVADOC_LOCATION);
			} catch (Exception e) {
				LOGGER.error("Failure while trying to detect JavaFX8 JavaDoc");
			}	
		}
		
		return null;
	}

	@Override
	public URL getIndexLocation(IPath libraryPath) {
		return null;
	}

}
