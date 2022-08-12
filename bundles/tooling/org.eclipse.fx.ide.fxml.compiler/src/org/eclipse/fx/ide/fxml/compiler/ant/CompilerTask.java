/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.compiler.ant;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.fx.ide.fxml.compiler.FXGraphCompiler;
import org.xml.sax.SAXException;

import com.google.inject.Injector;

public abstract class CompilerTask extends Task {
	private String srcDir;
	private String destDir;
	private String classpathref;
	private final boolean fxgraph;

	public CompilerTask(boolean fxgraph) {
		this.fxgraph = fxgraph;
	}
	
	public void setSourceDir(String srcDir) {
		this.srcDir = srcDir;
	}

	public String getSrcDir() {
		return srcDir;
	}

	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}

	public String getDestDir() {
		return destDir;
	}
	
//	public void setClasspathref(String classpathref) {
//		this.classpathref = classpathref;
//	}
//	
//	public String getClasspathref() {
//		return classpathref;
//	}

	@Override
	public void execute() throws BuildException {
		File f = new File(getLocation().getFileName());
		File sourceDirectory = new File(f.getParentFile(), srcDir);
		File outDirectory = new File(f.getParentFile(), destDir);
		
		
		final String sourcePrefix = sourceDirectory.getAbsolutePath();
		final String outPrefix = outDirectory.getAbsolutePath();
		
		final Injector injector = new org.eclipse.fx.ide.fxgraph.FXGraphStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		final FXGraphCompiler compiler = injector.getInstance(FXGraphCompiler.class);

		try {
			Files.walkFileTree(Paths.get(sourceDirectory.getAbsolutePath()), new FileFinder(new Callable() {

				@Override
				public void call(String file) {
					System.out.println("Compiling " + file);
					try {
						compiler.compile(injector, file, sourcePrefix, outPrefix);
					} catch (SAXException | IOException | ParserConfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.currentThread().setContextClassLoader(original);
	}

	class FileFinder extends SimpleFileVisitor<Path> {
		private final Callable runnable;

		public FileFinder(Callable runnable) {
			this.runnable = runnable;
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			if ((file.toFile().getAbsolutePath().endsWith(".fxml") && !fxgraph) || (file.toFile().getAbsolutePath().endsWith(".fxgraph") && fxgraph)) {
				runnable.call(file.toFile().getAbsolutePath());
			}
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
			return FileVisitResult.CONTINUE;
		}
	}

	public interface Callable {
		public void call(String file);
	}
}