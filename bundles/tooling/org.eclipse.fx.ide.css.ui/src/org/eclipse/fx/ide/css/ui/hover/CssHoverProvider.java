/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.hover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import org.eclipse.fx.ide.css.cssDsl.ColorTok;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.NumberTok;
import org.eclipse.fx.ide.css.extapi.CssExt;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CssHoverProvider extends DefaultEObjectHoverProvider {

//	@Inject
//	private CssDialectExtensionRegistry extension;
	
	@Inject
	private CssExt ext;
	
	@Inject(optional = true)
	@Named("org.eclipse.fx.ide.css.ui.styleSheetFileName")
	private String styleSheetFileName = "/CssDocsStyleSheet.css"; //$NON-NLS-1$
	
	// DBG
	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.hover.XtextEditorHover.font")
	private String fontSymbolicName = "org.eclipse.jdt.ui.javadocfont"; //$NON-NLS-1$ 

	protected String getStyleSheet() {
		
		// This is a development hack to enable stylesheet reloading
		// TODO add some kind of debug flag to disable this at runtime
		String css = loadStyleSheet();
	
		if (css != null) {
			FontData fontData = JFaceResources.getFontRegistry().getFontData(fontSymbolicName)[0];
			css = HTMLPrinter.convertTopLevelFont(css, fontData);
		}
		return css;
	}
	
	/**
	 * Loads and returns the hover style sheet.
	 * 
	 * @return the style sheet, or <code>null</code> if unable to load
	 */
	protected String loadStyleSheet() {
		URL styleSheetURL = Platform.getBundle("org.eclipse.fx.ide.css.ui").getEntry(styleSheetFileName); 
		if (styleSheetURL != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(styleSheetURL.openStream()));
				StringBuffer buffer = new StringBuffer(1500);
				String line = reader.readLine();
				while (line != null) {
					buffer.append(line);
					buffer.append('\n');
					line = reader.readLine();
				}
				return buffer.toString();
			} catch (IOException ex) {
				return ""; //$NON-NLS-1$
			} finally {
				try {
					if (reader != null)
						reader.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
	
	private String getColorHoverForFunction(FuncTok f) {
		if( "rgb".equals(f.getName().getName()) ) {
			String rgbHex = "#";
			int idx = 0;
			for( CssTok p : f.getParams() ) {
				if( p instanceof NumberTok ) {
					String hex = Integer.toHexString((int)Math.round(((NumberTok) p).getVal()));
					rgbHex += hex.length() < 2 ? "0"+hex : hex;
				}
				
				if( idx == 3 ) {
					break;
				}
			}
			String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+rgbHex+"'></div></td><td>"+rgbHex+"</td></tr></table>";
			return rv;
		}
		else return null;
	}
	
	protected String getHoverInfoAsHtml(EObject o) {
		// QnD hack to get tooltips back
		if( o instanceof ColorTok ) {
			ColorTok t = (ColorTok) o;
			String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+t.getValue()+"'></div></td><td>"+t.getValue()+"</td></tr></table>";
			return rv;
		} else if( o instanceof FuncTok ) {
			FuncTok f = (FuncTok) o;
			return getColorHoverForFunction(f);
		}
		else if (o.eContainer() instanceof FuncTok) {
			return getColorHoverForFunction((FuncTok) o.eContainer());
		}
		
//		System.err.println(o);
//		if( o instanceof function ) {
//			function f = (function) o;
//			if( "rgb".equals(f.getName()) ) {
//				EList<termGroup> g = f.getExpression().getTermGroups();
//				String red = g.get(0).getTerms().get(0).getNumber();
//				String green = g.get(1).getTerms().get(0).getNumber();
//				String blue = g.get(2).getTerms().get(0).getNumber();
//				String style = "rgb("+red+","+green+","+blue+")";
//				String hexRed = Integer.toHexString(Integer.parseInt(red));
//				String hexGreen = Integer.toHexString(Integer.parseInt(green));
//				String hexBlue = Integer.toHexString(Integer.parseInt(blue));
//				String hexVal = "#" + (hexRed.length() == 1 ? "0" : "") + hexRed;
//				hexVal += (hexGreen.length() == 1 ? "0" : "") + hexGreen;
//				hexVal += (hexBlue.length() == 1 ? "0" : "") + hexBlue;
//				
//				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+style+"'></div></td><td>"+hexVal+"</td></tr></table>";
//				return rv;
//			}
//		} else if( o instanceof term ) {
//			term t = (term) o;
//			if( t.getHexColor() != null ) {
//				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+t.getHexColor()+"'></div></td><td>"+t.getHexColor()+"</td></tr></table>";
//				return rv;
//			}
//		}
		return super.getHoverInfoAsHtml(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getFirstLine(EObject o) {
		String firstLine =  ext.getDocumentationHeader(o);
		
		if (firstLine==null) {
			firstLine = super.getFirstLine(o);
		}
		return firstLine;
	}
	
	protected boolean hasHover(EObject o) {
		String firstLine = ext.getDocumentationHeader(o);
		return firstLine != null;
	}
}
