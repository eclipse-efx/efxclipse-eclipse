/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.editors;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.fx.ide.ui.util.RelativeFileLocator;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FXMLEditor extends StructuredTextEditor implements IFXMLProviderAdapter {
	private static final String FX_NAMESPACE = "http://javafx.com/fxml";
	@Override
	public String getPreviewFXML() {
		return getSourceViewer().getDocument().get();
	}

	@Override
	public List<String> getPreviewCSSFiles() {
		final IFile file = getFile();
		final List<String> cssFiles = new ArrayList<String>();
		Properties propFile = getProperties();

		if (propFile != null) {
			if (propFile.getProperty("fxmlpreview.all.stylesheets") != null) {
				for (String f : propFile.getProperty("fxmlpreview.all.stylesheets").split(",")) {
					File absFile = RelativeFileLocator.locateFile(file, f.trim());
					if (absFile != null) {
						try {
							cssFiles.add(absFile.toURI().toURL().toExternalForm());
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

			String fileConfig = "fxmlpreview.file." + file.getName().substring(0, file.getName().length() - 5);
			if (propFile.getProperty(fileConfig + ".stylesheets") != null) {
				for (String f : propFile.getProperty(fileConfig + ".stylesheets").split(",")) {
					File absFile = RelativeFileLocator.locateFile(file, f.trim());
					if (absFile != null) {
						try {
							cssFiles.add(absFile.toURI().toURL().toExternalForm());
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		
		try {
			SAXParser p = SAXParserFactory.newInstance().newSAXParser();
			p.parse(new InputSource(new StringReader(getModel().getStructuredDocument().get())), new DefaultHandler() {
				@Override
				public void processingInstruction(String target, String data) throws SAXException {
					if( "scenebuilder-stylesheet".equals(target) ) {
						File absFile = RelativeFileLocator.locateFile(file, data);
						if( absFile != null ) {
							try {
								cssFiles.add(absFile.toURI().toURL().toExternalForm());
							} catch (MalformedURLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			});
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cssFiles;
	}

	@Override
	public String getPreviewResourceBundle() {
		final IFile file = getFile();
		final AtomicReference<String> ref = new AtomicReference<String>();
		
		try {
			SAXParser p = SAXParserFactory.newInstance().newSAXParser();
			p.parse(new InputSource(new StringReader(getModel().getStructuredDocument().get())), new DefaultHandler() {
				@Override
				public void processingInstruction(String target, String data) throws SAXException {
					if( "scenebuilder-preview-i18n-resource".equals(target) ) {
						File absFile = RelativeFileLocator.locateFile(file, data);
						if( absFile != null && absFile.exists() ) {
							ref.set(absFile.getAbsolutePath());
							return;
						}
					}
				}
			});
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( ref.get() != null ) {
			return ref.get();
		}
		
		Properties propFile = getProperties();

		
		if (propFile != null) {
			String fileConfig = "fxmlpreview.file." + file.getName().substring(0, file.getName().length() - 5);

			if (propFile.getProperty("fxmlpreview.all.messagefile") != null) {
				File f = RelativeFileLocator.locateFile(file, propFile.getProperty("fxmlpreview.all.messagefile"));
				if (f != null && f.exists()) {
					return f.getAbsolutePath();
				}
			}

			if (propFile.getProperty(fileConfig + ".messagefile") != null) {
				File f = RelativeFileLocator.locateFile(file, propFile.getProperty(fileConfig + ".messagefile").trim());
				if (f != null && f.exists()) {
					return f.getAbsolutePath();
				}
			}
		}

		return null;
	}

	private Properties getProperties() {
		IFile file = getFile();
		IProject project = file.getProject();
		IFile previewConfig = project.getFile(new Path("fxml-preview.properties"));

		if (previewConfig.exists()) {
			InputStream stream = null;

			Properties propFile = new Properties();
			try {
				stream = previewConfig.getContents(true);
				propFile.load(stream);
				return propFile;
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
					}
				}
			}
		}

		return null;
	}

	@Override
	public List<URL> getPreviewClasspath() {
		return Collections.emptyList();
	}

	@Override
	public IFile getFile() {
		if (getEditorInput() instanceof IFileEditorInput) {
			IFileEditorInput input = (IFileEditorInput) getEditorInput();
			return input.getFile();
		}
		return null;
	}

	@Override
	public String getPreviewSceneFXML() {
		return null;
	}
}