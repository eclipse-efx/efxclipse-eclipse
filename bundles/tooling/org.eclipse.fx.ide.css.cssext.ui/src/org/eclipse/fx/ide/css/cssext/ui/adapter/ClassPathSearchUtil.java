package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ExternalFoldersManager;

// TODO remove statics
public class ClassPathSearchUtil {
	
	private static Logger logger;
	private static Logger getLogger() {
		if (logger == null) {
			logger = LoggerCreator.createLogger(ClassPathSearchUtil.class);
		}
		return logger;
	}

	
	
	public static abstract class Entry {
		public abstract URI toURI();
		@Override
		public String toString() {
			return toURI().toString();
		}
	}
	
	public static class FileEntry extends Entry {
		private final File f;
		public FileEntry(File f) {
			this.f = f;
		}
		@Override
		public URI toURI() {
			return URI.createURI(f.toURI().toString().replaceAll("\\\\", "/"));
		}
	}
	
	public static class FileArchiveEntry extends FileEntry {
		private final String archivePath;
		public FileArchiveEntry(File archiveFile, String archivePath) {
			super(archiveFile);
			this.archivePath = archivePath;
		}
		
		@Override
		public URI toURI() {
			URI uri = super.toURI();
			return URI.createURI("archive:" + uri.toString() + "!" + archivePath);
		}
	}
	
	public static class URIEntry extends Entry {
		private final URI uri;
		
		public URIEntry(URI uri) {
			this.uri = uri;
		}

		@Override
		public URI toURI() {
			return uri;
		}
		
	}
	public static class IFileEntry extends Entry {
		public final IFile f;
		public IFileEntry(IFile f) {
			this.f = f;
		}
		@Override
		public URI toURI() {
			final IPath workspaceRelativePath = f.getFullPath();
			return URI.createPlatformResourceURI(workspaceRelativePath.toString().replace('\\', '/'), true);
		}
	}
	public static class IFileArchiveEntry extends IFileEntry {
		private final String archivePath;
		public IFileArchiveEntry(IFile archiveFile, String archivePath) {
			super(archiveFile);
			this.archivePath = archivePath;
		}
		
		@Override
		public URI toURI() {
			URI uri = super.toURI();
			return URI.createURI("archive:" + uri.toString() + "!" + archivePath);
		}
	}
	
	
	public static class StringUriEntry extends Entry {
		public final String uri;
		public StringUriEntry(String uri) {
			this.uri = uri.replace('\\', '/');
		}
		@Override
		public URI toURI() {
			try {
				return URI.createURI(uri);
			}
			catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("Issue with the following URI: " + uri, e);
			}
		}
	}
	
	private static Map<String, List<Entry>> cache = new HashMap<>();
	
	private static List<Entry> searchJar(String absoluteJarPath, String uri) throws IOException {
		List<Entry> results = new ArrayList<>();
		try(ZipFile jar = new ZipFile(absoluteJarPath) ) {
			Enumeration<? extends ZipEntry> entries = jar.entries();
			while (entries.hasMoreElements()) {
				ZipEntry el = entries.nextElement();
				if (el.getName().endsWith(".cssext")) {
					String elPath = el.getName().startsWith("/") ? el.getName() : "/" + el.getName();
					results.add(new StringUriEntry("archive:" + uri + "!" + elPath));
//					results.add(new StringUriEntry("jar:file:" + absoluteJarPath.replace('\\', '/') + "!" + elPath));
				}
			}			
		} catch( IOException e ) {
			e.printStackTrace();
		}
		return results;
	}
	
	private static void searchFolderRec(File file, String innerPath, String uri, List<Entry> result) throws IOException {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				searchFolderRec(f, innerPath + "/" + f.getName(), uri, result);
			}
		}
		else {
			if (file.getName().endsWith(".cssext")) {
				// we replace all \ with / for windows - if we don't do that URI.lastSegment returns null and EMF uses an xmi resource to load the xtext file
				result.add(new StringUriEntry(uri + innerPath));
//				result.add(new StringUriEntry("file://" + file.getAbsolutePath().replaceAll("\\\\", "/")));
			}
		}
	}
	
	private static List<Entry> searchFolder(String absolutePath, String uri) throws IOException {
		final List<Entry> results = new ArrayList<>();
		searchFolderRec(new File(absolutePath), "", uri, results);
		return results;
	}
	
	
	public static List<Entry> checkJar(String absoluteJarPath, String uri) {
		List<Entry> results = cache.get(absoluteJarPath);
		if (results == null) {
			try {
				results = searchJar(absoluteJarPath, uri);
				cache.put(absoluteJarPath, results);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return results;
	}

	public static List<Entry> checkFolder(String absolutePath, String uri) {
		List<Entry> results = cache.get(absolutePath);
		if (results == null) {
			try {
				results = searchFolder(absolutePath, uri);
				cache.put(absolutePath, results);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return results;
	}
	
	static class SearchResourceVisitor implements IResourceVisitor {

		private List<Entry> result = new ArrayList<>();
		
		public List<Entry> getResult() {
			return result;
		}
		
		@Override
		public boolean visit(IResource resource) throws CoreException {
			if (resource instanceof IContainer) {
				return true;
			}
			else {
				IFile file = (IFile) resource.getAdapter(IFile.class);
				if (file != null) {
					if (file.getName().endsWith(".cssext")) {
						result.add(new IFileEntry(file));
					}
				}
				
			}
			return false;
		}
	}
	
	public static List<Entry> checkResource(IResource r) {
		getLogger().debug("checkResource " + r);
		SearchResourceVisitor v = new SearchResourceVisitor();
		try {
			r.accept(v);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v.getResult();
	}
	
	private static List<Entry> checkInternalLibrary(IFile file) {
		getLogger().debug("checkInternalJar " + file);
		
		List<Entry> results = new ArrayList<>();
		try(ZipFile jar = new ZipFile(file.getLocation().toFile()) ) {
			Enumeration<? extends ZipEntry> entries = jar.entries();
			while (entries.hasMoreElements()) {
				ZipEntry el = entries.nextElement();
				if (el.getName().endsWith(".cssext")) {
					String elPath = el.getName().startsWith("/") ? el.getName() : "/" + el.getName();
					results.add(new IFileArchiveEntry(file, elPath));
				}
			}			
		} catch( IOException e ) {
			e.printStackTrace();
		}
		return results;
		
	}
	
	private static List<Entry> checkInternalExpandedLibrary(IFolder folder) {
		return checkResource(folder);
	}
	
	private static List<Entry> checkExternalJar(File jarFile) {
		getLogger().debug("checkExternalJar " + jarFile);
		List<Entry> results = new ArrayList<>();
		try(ZipFile jar = new ZipFile(jarFile) ) {
			Enumeration<? extends ZipEntry> entries = jar.entries();
			while (entries.hasMoreElements()) {
				ZipEntry el = entries.nextElement();
				if (el.getName().endsWith(".cssext")) {
					String elPath = el.getName().startsWith("/") ? el.getName() : "/" + el.getName();
					results.add(new FileArchiveEntry(jarFile, elPath));
				}
			}			
		} catch( IOException e ) {
			e.printStackTrace();
		}
		return results;
		
	}
	
	private static void searchFolderRec(File file, List<Entry> result) throws IOException {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				searchFolderRec(f, result);
			}
		}
		else {
			if (file.getName().endsWith(".cssext")) {
				result.add(new FileEntry(file));
			}
		}
	}
	
	private static List<Entry> checkExternalFolder(File folder) {
		List<Entry> results = new ArrayList<>();
		try {
			searchFolderRec(folder, results);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	private static List<Entry> checkSourceEntry(IWorkspaceRoot root, IClasspathEntry entry) {
		IResource resource = root.findMember(entry.getPath());
		return checkResource(resource);
//		// we prefer to search the bin folder - if it is there?
//				IFolder libFolder = root.getFolder(path);
//				IFolder binFolder = libFolder.getFolder("bin");
//				if (binFolder.exists()) {
//					return checkResource(binFolder);
//				}
//				else {
//					return checkResource(libFolder);
//				}
	}
	
	private static List<Entry> checkLibraryEntry(IWorkspaceRoot root, IClasspathEntry entry) {
		getLogger().debug("checkLibraryEntry " + entry.getPath());
		IPath path = entry.getPath();
		
		switch(entry.getContentKind()) {
		case IPackageFragmentRoot.K_SOURCE: {
			getLogger().debug(" is source");
			return checkSourceEntry(root, entry);
		}
		case IPackageFragmentRoot.K_BINARY: {
			getLogger().debug(" is binary");
			
			IResource member = root.findMember(path);
			if (member != null && member.exists()) {
				getLogger().debug(" is workspace resource");
				URI uri = URI.createPlatformResourceURI(path.toString(), false);
				switch (member.getType()) {
				case IResource.FILE: return checkInternalLibrary((IFile)member);
				case IResource.FOLDER: return checkInternalExpandedLibrary((IFolder) member);
				}
			}
			else {
				getLogger().debug(" is external");
				
				IFolder jdtMappedFolder = ExternalFoldersManager.getExternalFoldersManager().getFolder(path);
				if (jdtMappedFolder != null) {
					getLogger().debug(" but is mapped to internal by jdt");
					return checkInternalExpandedLibrary(jdtMappedFolder);
				}
				else {
					// do external handling
					File file = path.toFile();
					if (file.isDirectory()) {
						// must be an expanded lib
						return checkExternalFolder(file);
					}
					else {
						// must be a jar
						return checkExternalJar(file);
					}
				}
			}
		}
			
		}
		return Collections.emptyList();
	}
	
	private static List<Entry> checkProjectEntry(IWorkspaceRoot root, IClasspathEntry entry) {
		getLogger().debug("checkProjectEntry " + entry.getPath());
		try {
			final IPath path = entry.getPath();
			final IProject p = (IProject) root.findMember(path);
			final IJavaProject jp = JavaCore.create(p);
			final IResource output = root.findMember(jp.getOutputLocation());
			if( output != null ) {
				return ClassPathSearchUtil.checkResource(output);
			}
		}
		catch (JavaModelException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	
	
	public static List<Entry> checkEntry(IWorkspaceRoot root, IClasspathEntry entry) {
		getLogger().debug("checkEntry " + entry.getPath());
		
		switch (entry.getEntryKind()) {
		case IClasspathEntry.CPE_SOURCE:   return checkSourceEntry(root, entry);
		case IClasspathEntry.CPE_LIBRARY:  return checkLibraryEntry(root, entry);
		case IClasspathEntry.CPE_PROJECT:  return checkProjectEntry(root, entry);
		}
		
		System.err.println("could not handle entry " + entry);
		return Collections.emptyList();
	}
	
	public static List<Entry> checkEntries(IWorkspaceRoot root, IClasspathEntry[] entries) {
		List<Entry> r = new ArrayList<>();
		for (IClasspathEntry entry : entries) {
			getLogger().debug(" -> " + entry);
			try {
				r.addAll(checkEntry(root, entry));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return r;
	}
}
