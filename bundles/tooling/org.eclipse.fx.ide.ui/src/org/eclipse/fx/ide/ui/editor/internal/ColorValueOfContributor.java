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
package org.eclipse.fx.ide.ui.editor.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.fx.ide.ui.editor.IValueOfContributor;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;



public class ColorValueOfContributor implements IValueOfContributor {
	
	private static List<Proposal> NAMED_COLOR_PROPOSALS = new ArrayList<>();
	static {
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("aliceblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("anitquewhite".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("aqua".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("aquamarine".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("azure".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("beige".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("bisque".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("black".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("blanchedalmond".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("blue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("blueviolet".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("brown".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("burlywood".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("cadetblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("chartreuse".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("chocolate".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("coral".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("cornflowerblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("cornsilk".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("crimson".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("cyan".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkcyan".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkgoldenrod".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkgray".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkgreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkgrey".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkkhaki".toUpperCase()));

		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkmagenta".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkolivegreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkorange".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkorchid".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkred".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darksalmon".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkseagreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkslateblue".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkslategray".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkslategrey".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkturquoise".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("darkviolet".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("deeppink".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("deepskyblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("dimgray".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("dimgrey".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("dodgerblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("firebrick".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("floralwhite".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("forestgreen".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("fuchsia".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("gainsboro".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("ghostwhite".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("gold".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("goldenrod".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("gray".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("green".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("greenyellow".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("grey".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("honeydew".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("hotpink".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("indianred".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("indigo".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("ivory".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("khaki".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lavender".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lavenderblush".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lawngreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lemonchiffon".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightblue".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightcoral".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightcyan".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightgoldenrodyellow".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightgray".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightgreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightgrey".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightpink".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightsalmon".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightseagreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightskyblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightslategray".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightslategrey".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightsteelblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lightyellow".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("lime".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("limegreen".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("linen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("magenta".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("maroon".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumaquamarine".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumorchid".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumpurple".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumseagreen".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumslateblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumspringgreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumturquoise".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mediumvioletred".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("midnightblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mintcream".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("mistyrose".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("moccasin".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("navajowhite".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("navy".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("oldlace".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("olive".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("olivedrab".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("orange".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("orangered".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("orchid".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("palegoldenrod".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("palegreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("paleturquoise".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("palevioletred".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("papayawhip".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("peachpuff".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("peru".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("pink".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("plum".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("powderblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("purple".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("red".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("rosybrown".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("royalblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("saddlebrown".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("salmon".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("sandybrown".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("seagreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("seashell".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("sienna".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("silver".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("skyblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("slateblue".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("slategray".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("slategrey".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("snow".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("springgreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("steelblue".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("tan".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("teal".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("thistle".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("tomato".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("turquoise".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("violet".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("wheat".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("white".toUpperCase()));
		
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("whitesmoke".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("yellow".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("yellowgreen".toUpperCase()));
		NAMED_COLOR_PROPOSALS.add(new SimpleValueProposal("transparent".toUpperCase()));
	}
	
	private static List<Proposal> FUNCTION_COLOR = new ArrayList<>();
	
	{
		FUNCTION_COLOR.add(new SimpleValueProposal("rgb(red,green,blue)",1));
		FUNCTION_COLOR.add(new SimpleValueProposal("rgba(red,green,blue,alpha)",1));
		FUNCTION_COLOR.add(new SimpleValueProposal("hsb(hue,saturation,brightness)",1));
		FUNCTION_COLOR.add(new SimpleValueProposal("hsba(hue,saturation,brightness,alpha)",1));
	}
	
	@Override
	public List<Proposal> getProposals() {
		List<Proposal> rv = new ArrayList<>();
		rv.add(new DialogProposal() {
			
			@Override
			public String getValue() {
				return "Pick color ...";
			}
			
			@Override
			public int getPriority() {
				return 2;
			}
			
			@Override
			public String openDialogValue() {
				ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
				RGB rgb = dialog.open();
				if( rgb != null ) {
					return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
				}
				return null;
			}
		});
		rv.addAll(FUNCTION_COLOR);
		rv.addAll(NAMED_COLOR_PROPOSALS);
		
		return Collections.unmodifiableList(rv);
	}

	@Override
	public String getType() {
		return "javafx.scene.paint.Paint";
	}
}
