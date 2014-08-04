/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

import java.util.StringTokenizer;



public class JavaDocParser {

	private String source;
	
	public String parse(String source) {
		this.source = source;
		
		StringBuffer result = new StringBuffer();
		StringTokenizer linetokenizer = new StringTokenizer(this.source, "\r\n");
		
		while (linetokenizer.hasMoreElements()) {
			String line = linetokenizer.nextToken();
//			System.err.println("parsing token: " + line);
			
			line = line.replaceFirst("^/[*][*]", "");
			line = line.replaceFirst("[*][/]$", "");
			line = line.replaceFirst("^.*[*]\t*", "");
			
//			System.err.println("removing star: " + line);
			if (line.length() == 0 && result.length() > 0) {
				result.append("<br/>");
			}
			
			else {
				result.append(line);
			}
		}
//		System.err.println(result.toString());
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		String s = 	"/**\n";
		 s+=		" * No whitespace is allowed between the number and units if provided.\n";
		 s+=		" *  TODO wie bau ma so was ein!?\n";
		 s+=		" * Sizes can either be a percentage or a length with units. If units are not specified then specified the 'px' is assumed. Some units are relative and others absolute.\n";
		 s+=		" * \n";
		 s+=		" * Relative\n";
		 s+=		" * <ul>\n";
		 s+=		" * <li>px: pixels, relative to the viewing device</li>\n";
		 s+=		" * <li>em: the 'font-size' of the relevant font</li>\n";
		 s+=		" * <li>ex: the 'x-height' of the relevant font</li>\n";
		 s+=		" * </ul>\n";
		 s+=		" * Absolute\n";
		 s+=		" * <ul>\n";
		 s+=		" * <li>in: inches � 1 inch is equal to 2.54 centimeters.</li>\n";
		 s+=		" * <li>cm: centimeters</li>\n";
		 s+=		" * <li>mm: millimeters</li>\n";
		 s+=		" * <li>pt: points � the points used by CSS 2.1 are equal to 1/72nd of an inch.</li>\n";
		 s+=		" * <li>pc: picas � 1 pica is equal to 12 points.</li>\n";
		 s+=		" * </ul>\n";
		 s+=		" * Percentages\n";
		 s+=		" * These are a percentage of some length, they are context sensitive so what they are relative to depends on where they are specified. Each property that supports a percentage should specify if percentage is supported and if it is what it is relative to.\n";
		 s+=		" */";

		JavaDocParser x = new JavaDocParser();
		x.parse(s);
	}
	
}
