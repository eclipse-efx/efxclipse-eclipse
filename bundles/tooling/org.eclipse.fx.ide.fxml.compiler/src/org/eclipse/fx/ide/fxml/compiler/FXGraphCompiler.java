/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.ide.fxgraph.converter.FXGraphConverter;
import org.eclipse.fx.ide.fxgraph.converter.FXMLLoader;
import org.eclipse.fx.ide.fxgraph.converter.IFXMLFile;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.xml.sax.SAXException;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class FXGraphCompiler {
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	public static void main(String[] args) {
		Injector injector = new org.eclipse.fx.ide.fxgraph.FXGraphStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		FXGraphCompiler main = injector.getInstance(FXGraphCompiler.class);
		try {
			main.compile(injector, args[0], args[1],null);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void compileFXML(Injector injector, final String string, final String sourcePrefix, String outputPrefix , boolean debug) throws SAXException, IOException, ParserConfigurationException {
		SAXParserFactory f = SAXParserFactory.newInstance();
		f.setNamespaceAware(true);
		SAXParser p = f.newSAXParser();
		
		FXMLSaxHandler h = injector.getInstance(FXMLSaxHandler.class);
		IFXMLFile fi = new IFXMLFile() {
			
			@Override
			public String getPackagename() {
				if( sourcePrefix == null) {
					return "dummy";
				} else {
					String filePath = new File(string).getParent();
					String packagename = filePath.substring(sourcePrefix.length());
					packagename = packagename.replace('\\', '.').replace('/', '.');
					
					return packagename.startsWith(".") ? packagename.substring(1) : packagename;
				}
			}
			
			@Override
			public String getName() {
				return new File(string).getName();
			}
			
			@Override
			public InputStream getContent() {
				try {
					return new FileInputStream(string);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		};
		h.setFile(fi);
		p.parse(fi.getContent(), h);
		
		if( debug ) {
			String data = new FXGraphGenerator().generate(h.model).toString();
			System.err.println("============");
			System.err.println(new String(data.getBytes()));
			
			generateJavaFile(h.model, string, sourcePrefix, outputPrefix);
		} else {
			generateJavaFile(h.model, string, sourcePrefix, outputPrefix);
		}
	}
	
	public void compileFXGraph(Injector injector, String inputFile, final String inputOriginalFile, final String sourcePrefix, String outputPrefix) throws SAXException, IOException, ParserConfigurationException {
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(inputFile), true);
		
		generateJavaFile( (Model)resource.getContents().get(0), inputOriginalFile, sourcePrefix, outputPrefix);
	}
	
	public void generateJavaFile(Model m, String inputOriginalFile, final String sourcePrefix, String outputPrefix) throws IOException {
		FXGraphJavaGenerator c = new FXGraphJavaGenerator(m);
		
		String outFile = inputOriginalFile.replaceAll("fxgraph$", "java").replaceAll("fxml$", "java").replaceAll("fxmlb$", "java");
		
		if( outputPrefix != null ) {
			String filePath = new File(outFile).getAbsolutePath();
			String packagename = filePath.substring(sourcePrefix.length()+1);
			File f = new File(outputPrefix,packagename);
			f.getParentFile().mkdirs();
			outFile = f.getAbsolutePath();
		}
		FileOutputStream out = new FileOutputStream(outFile);
		out.write(c.generate().toString().getBytes());
		out.close();
	}
	
	public void compile(Injector injector, final String filename, final String sourcePrefix, String outputPrefix) throws SAXException, IOException, ParserConfigurationException {
		if( filename.endsWith("fxml") || filename.endsWith("fxmlb") ) {
			compileFXML(injector, filename, sourcePrefix, outputPrefix, false);
		} else {
			compileFXGraph(injector, filename, filename, sourcePrefix, outputPrefix);
		}
//		
//		Model m;
//		String fxgraph = string;
//		if( string.endsWith("fxml") ) {
//			SAXParserFactory f = SAXParserFactory.newInstance();
//			f.setNamespaceAware(true);
//			SAXParser p = f.newSAXParser();
//			
//			FXMLSaxHandler h = injector.getInstance(FXMLSaxHandler.class);
//			IFXMLFile fi = new IFXMLFile() {
//				
//				@Override
//				public String getPackagename() {
//					if( sourcePrefix == null) {
//						return "dummy";
//					} else {
//						String filePath = new File(string).getParent();
//						String packagename = filePath.substring(sourcePrefix.length());
//						return packagename.replace('/', '.');
//					}
//				}
//				
//				@Override
//				public String getName() {
//					return new File(string).getName();
//				}
//				
//				@Override
//				public InputStream getContent() {
//					try {
//						return new FileInputStream(string);
//					} catch (FileNotFoundException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					return null;
//				}
//			};
//			h.setFile(fi);
//			p.parse(fi.getContent(), h);
//			
//			fxgraph = "/tmp/"+UUID.randomUUID().toString()+".fxgraph";
//			
//			File out = new File(fxgraph);
//			System.err.println(out);
////			out.deleteOnExit();
//			try {
//				String data = new FXGraphGenerator().generate(h.model).toString();
//				System.err.println(data);
//				FileOutputStream outStream = new FileOutputStream(out);
//				outStream.write(data.getBytes());
//				outStream.close();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		ResourceSet set = resourceSetProvider.get();
//		Resource resource = set.getResource(URI.createURI(fxgraph), true);
//		
//		m = (Model)resource.getContents().get(0);	
//		
//		FXGraphJavaGenerator c = new FXGraphJavaGenerator(m);
//		
//		try {
//			String outFile = string.replaceAll("fxgraph$", "java").replaceAll("fxml$", "java");
//			
//			if( outputPrefix != null ) {
//				String filePath = new File(outFile).getAbsolutePath();
//				String packagename = filePath.substring(sourcePrefix.length()+1);
//				File f = new File(outputPrefix,packagename);
//				f.getParentFile().mkdirs();
//				outFile = f.getAbsolutePath();
//			}
//			
//			FileOutputStream out = new FileOutputStream(outFile);
//			out.write(c.generate().toString().getBytes());
//			out.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
	}
}
