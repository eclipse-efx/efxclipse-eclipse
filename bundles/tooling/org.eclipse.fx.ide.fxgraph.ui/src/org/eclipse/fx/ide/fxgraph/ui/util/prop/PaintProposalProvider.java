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
package org.eclipse.fx.ide.fxgraph.ui.util.prop;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.DialogProposal;
import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.HoverImpl;
import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.ProcessedProposal;
import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.Proposal;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;


public class PaintProposalProvider implements IProposalProvider {
	private List<Proposal> proposals = new ArrayList<Proposal>();

	private static final List<String> PREDEFINED_COLORS = new ArrayList<String>();

	static {
		PREDEFINED_COLORS.add("aliceblue");
		PREDEFINED_COLORS.add("aqua");
		PREDEFINED_COLORS.add("antiquewhite");
		PREDEFINED_COLORS.add("aquamarine");

		PREDEFINED_COLORS.add("azure");
		PREDEFINED_COLORS.add("beige");
		PREDEFINED_COLORS.add("bisque");
		PREDEFINED_COLORS.add("black");

		PREDEFINED_COLORS.add("blanchedalmond");
		PREDEFINED_COLORS.add("blue");
		PREDEFINED_COLORS.add("blueviolet");
		PREDEFINED_COLORS.add("brown");

		PREDEFINED_COLORS.add("burlywood");
		PREDEFINED_COLORS.add("cadetblue");
		PREDEFINED_COLORS.add("chartreuse");
		PREDEFINED_COLORS.add("chocolate");

		PREDEFINED_COLORS.add("coral");
		PREDEFINED_COLORS.add("cornflowerblue");
		PREDEFINED_COLORS.add("cornsilk");
		PREDEFINED_COLORS.add("crimson");

		PREDEFINED_COLORS.add("cyan");
		PREDEFINED_COLORS.add("darkblue");
		PREDEFINED_COLORS.add("darkcyan");
		PREDEFINED_COLORS.add("darkgoldenrod");

		PREDEFINED_COLORS.add("darkgray");
		PREDEFINED_COLORS.add("darkgreen");
		PREDEFINED_COLORS.add("darkgrey");
		PREDEFINED_COLORS.add("darkkhaki");

		PREDEFINED_COLORS.add("darkmagenta");
		PREDEFINED_COLORS.add("darkolivegreen");
		PREDEFINED_COLORS.add("darkorange");
		PREDEFINED_COLORS.add("darkorchid");

		PREDEFINED_COLORS.add("darkred");
		PREDEFINED_COLORS.add("darksalmon");
		PREDEFINED_COLORS.add("darkseagreen");
		PREDEFINED_COLORS.add("darkslateblue");

		PREDEFINED_COLORS.add("darkslategray");
		PREDEFINED_COLORS.add("darkslategrey");
		PREDEFINED_COLORS.add("darkturquoise");
		PREDEFINED_COLORS.add("darkviolet");

		PREDEFINED_COLORS.add("deeppink");
		PREDEFINED_COLORS.add("deepskyblue");
		PREDEFINED_COLORS.add("dimgray");
		PREDEFINED_COLORS.add("dimgrey");

		PREDEFINED_COLORS.add("dodgerblue");
		PREDEFINED_COLORS.add("firebrick");
		PREDEFINED_COLORS.add("floralwhite");
		PREDEFINED_COLORS.add("forestgreen");

		PREDEFINED_COLORS.add("fuchsia");
		PREDEFINED_COLORS.add("gainsboro");
		PREDEFINED_COLORS.add("ghostwhite");
		PREDEFINED_COLORS.add("gold");

		PREDEFINED_COLORS.add("goldenrod");
		PREDEFINED_COLORS.add("gray");
		PREDEFINED_COLORS.add("green");
		PREDEFINED_COLORS.add("greenyellow");

		PREDEFINED_COLORS.add("grey");
		PREDEFINED_COLORS.add("honeydew");
		PREDEFINED_COLORS.add("hotpink");
		PREDEFINED_COLORS.add("indianred");

		PREDEFINED_COLORS.add("indigo");
		PREDEFINED_COLORS.add("ivory");
		PREDEFINED_COLORS.add("khaki");
		PREDEFINED_COLORS.add("lavender");

		PREDEFINED_COLORS.add("lavenderblush");
		PREDEFINED_COLORS.add("lawngreen");
		PREDEFINED_COLORS.add("lemonchiffon");
		PREDEFINED_COLORS.add("lightblue");

		PREDEFINED_COLORS.add("lightcoral");
		PREDEFINED_COLORS.add("lightcyan");
		PREDEFINED_COLORS.add("lightgoldenrodyellow");
		PREDEFINED_COLORS.add("lightgray");

		PREDEFINED_COLORS.add("lightgreen");
		PREDEFINED_COLORS.add("lightgrey");
		PREDEFINED_COLORS.add("lightpink");
		PREDEFINED_COLORS.add("lightsalmon");

		PREDEFINED_COLORS.add("lightseagreen");
		PREDEFINED_COLORS.add("lightskyblue");
		PREDEFINED_COLORS.add("lightslategray");
		PREDEFINED_COLORS.add("lightslategrey");

		PREDEFINED_COLORS.add("lightsteelblue");
		PREDEFINED_COLORS.add("lightyellow");
		PREDEFINED_COLORS.add("lime");
		PREDEFINED_COLORS.add("limegreen");

		PREDEFINED_COLORS.add("linen");
		PREDEFINED_COLORS.add("magenta");
		PREDEFINED_COLORS.add("maroon");
		PREDEFINED_COLORS.add("mediumaquamarine");

		PREDEFINED_COLORS.add("mediumblue");
		PREDEFINED_COLORS.add("mediumorchid");
		PREDEFINED_COLORS.add("mediumpurple");
		PREDEFINED_COLORS.add("mediumseagreen");

		PREDEFINED_COLORS.add("mediumslateblue");
		PREDEFINED_COLORS.add("mediumspringgreen");
		PREDEFINED_COLORS.add("mediumturquoise");
		PREDEFINED_COLORS.add("mediumvioletred");

		PREDEFINED_COLORS.add("midnightblue");
		PREDEFINED_COLORS.add("mintcream");
		PREDEFINED_COLORS.add("mistyrose");
		PREDEFINED_COLORS.add("moccasin");

		PREDEFINED_COLORS.add("navajowhite");
		PREDEFINED_COLORS.add("navy");
		PREDEFINED_COLORS.add("oldlace");
		PREDEFINED_COLORS.add("olive");

		PREDEFINED_COLORS.add("olivedrab");
		PREDEFINED_COLORS.add("orange");
		PREDEFINED_COLORS.add("orangered");
		PREDEFINED_COLORS.add("orchid");

		PREDEFINED_COLORS.add("palegoldenrod");
		PREDEFINED_COLORS.add("palegreen");
		PREDEFINED_COLORS.add("paleturquoise");
		PREDEFINED_COLORS.add("palevioletred");

		PREDEFINED_COLORS.add("papayawhip");
		PREDEFINED_COLORS.add("peachpuff");
		PREDEFINED_COLORS.add("peru");
		PREDEFINED_COLORS.add("pink");

		PREDEFINED_COLORS.add("plum");
		PREDEFINED_COLORS.add("powderblue");
		PREDEFINED_COLORS.add("purple");
		PREDEFINED_COLORS.add("red");

		PREDEFINED_COLORS.add("rosybrown");
		PREDEFINED_COLORS.add("royalblue");
		PREDEFINED_COLORS.add("saddlebrown");
		PREDEFINED_COLORS.add("salmon");

		PREDEFINED_COLORS.add("sandybrown");
		PREDEFINED_COLORS.add("seagreen");
		PREDEFINED_COLORS.add("seashell");
		PREDEFINED_COLORS.add("sienna");

		PREDEFINED_COLORS.add("silver");
		PREDEFINED_COLORS.add("skyblue");
		PREDEFINED_COLORS.add("slateblue");
		PREDEFINED_COLORS.add("slategray");

		PREDEFINED_COLORS.add("slategrey");
		PREDEFINED_COLORS.add("snow");
		PREDEFINED_COLORS.add("springgreen");
		PREDEFINED_COLORS.add("steelblue");

		PREDEFINED_COLORS.add("tan");
		PREDEFINED_COLORS.add("teal");
		PREDEFINED_COLORS.add("thistle");
		PREDEFINED_COLORS.add("tomato");

		PREDEFINED_COLORS.add("turquoise");
		PREDEFINED_COLORS.add("violet");
		PREDEFINED_COLORS.add("wheat");
		PREDEFINED_COLORS.add("white");

		PREDEFINED_COLORS.add("whitesmoke");
		PREDEFINED_COLORS.add("yellow");
		PREDEFINED_COLORS.add("yellowgreen");
		PREDEFINED_COLORS.add("transparent");
	}

	static class PredefinedColor extends ProcessedProposal {

		public PredefinedColor(String label) {
			super(label);
		}

		@Override
		public String getProcessed() {
			return "\""+value+"\"";
		}
		
		
	}
	
	public PaintProposalProvider() {
		proposals.add(new DialogProposal(601, "Pick color ...") {

			@Override
			public String openProposal() {
				ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
				RGB rgb = dialog.open();
				if (rgb != null) {
					String r = Integer.toHexString(rgb.red);
					r = r.length() == 1 ? "0"+r : r;
					
					String g = Integer.toHexString(rgb.green);
					g = g.length() == 1 ? "0"+g : g;
					
					
					String b = Integer.toHexString(rgb.blue);
					b = b.length() == 1 ? "0"+b : b;
					
					
					return "\"#"+r+g+b+"\"";
				}
				return null;
			}
		});
		proposals.add(new PredefinedColor("#"));
		for (String s : PREDEFINED_COLORS) {
			proposals.add(new PredefinedColor(s.toUpperCase()));
		}

	}

	protected IMethod findMethod(IJavaProject jp) {
		try {
			IType t = jp.findType("javafx.scene.paint.Color");
			for( IMethod m : t.getMethods() ) {
				if( Flags.isStatic(m.getFlags()) && "web".equals(m.getElementName()) && m.getParameters().length == 1 ) {
					return m;
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
	
	public List<Proposal> getProposals(IJavaProject jp) {
		HoverImpl h = null;
		IMethod m = findMethod(jp);
		
		if( m != null ) {
			h = new HoverImpl(m);	
		}
		
		for( Proposal p : proposals ) {
			p.hover = h;
		}
		
		return proposals;
	}
}
