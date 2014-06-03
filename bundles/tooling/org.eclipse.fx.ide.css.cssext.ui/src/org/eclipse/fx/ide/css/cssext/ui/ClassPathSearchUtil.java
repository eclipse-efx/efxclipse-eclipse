package org.eclipse.fx.ide.css.cssext.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

// TODO remove statics
public class ClassPathSearchUtil {

	public static abstract class Entry {
		public abstract URI toURI();
		@Override
		public String toString() {
			return toURI().toString();
		}
	}
	public static class IFileEntry extends Entry {
		public final IFile f;
		public IFileEntry(IFile f) {
			this.f = f;
		}
		@Override
		public URI toURI() {
			return URI.createPlatformResourceURI(f.getFullPath().toString(), true);
		}
	}
	public static class StringUriEntry extends Entry {
		public final String uri;
		public StringUriEntry(String uri) {
			this.uri = uri;
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
	
	private static List<Entry> searchJar(String absoluteJarPath) throws IOException {
		List<Entry> results = new ArrayList<>();
		ZipFile jar = new ZipFile(absoluteJarPath);
		Enumeration<? extends ZipEntry> entries = jar.entries();
		while (entries.hasMoreElements()) {
			ZipEntry el = entries.nextElement();
			if (el.getName().endsWith(".cssext")) {
//				System.err.println("found one: " + absoluteJarPath + " ! " + el.getName());
				String elPath = el.getName().startsWith("/") ? el.getName() : "/" + el.getName();
				results.add(new StringUriEntry("jar:file://" + absoluteJarPath + "!" + elPath));
			}
		}
		return results;
	}
	
	private static void searchFolderRec(File file, List<Entry> result) throws IOException {
//		System.err.println("filecheck: " + file);
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				searchFolderRec(f, result);
			}
		}
		else {
			if (file.getName().endsWith(".cssext")) {
//				System.err.println("add");
				result.add(new StringUriEntry("file://" + file.getAbsolutePath()));
			}
		}
	}
	
	private static List<Entry> searchFolder(String absolutePath) throws IOException {
		final List<Entry> results = new ArrayList<>();
		searchFolderRec(new File(absolutePath), results);
		return results;
	}
	
	
	public static List<Entry> checkJar(String absoluteJarPath) {
//		System.err.println("checkJar(" + absoluteJarPath + ")");
		List<Entry> results = cache.get(absoluteJarPath);
		if (results == null) {
			try {
				results = searchJar(absoluteJarPath);
				cache.put(absoluteJarPath, results);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
//		System.err.println("checkJar: " + (results != null ? results.size() : "no") + " hits");
		return results;
	}

	public static List<Entry> checkFolder(String absolutePath) {
//		System.err.println("checkFolder(" + absolutePath + ")");
		List<Entry> results = cache.get(absolutePath);
		if (results == null) {
			try {
				results = searchFolder(absolutePath);
				cache.put(absolutePath, results);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
//		System.err.println("checkFolder: " + (results != null ? results.size() : "no") + " hits");
		return results;
	}
	
	static class SearchResourceVisitor implements IResourceVisitor {

		private List<Entry> result = new ArrayList<>();
		
		public List<Entry> getResult() {
			return result;
		}
		
		@Override
		public boolean visit(IResource resource) throws CoreException {
			System.err.println("visit " + resource);
			
			
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
		SearchResourceVisitor v = new SearchResourceVisitor();
		try {
			r.accept(v);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("found " + v.getResult());
		return v.getResult();
	}
	
	
}
