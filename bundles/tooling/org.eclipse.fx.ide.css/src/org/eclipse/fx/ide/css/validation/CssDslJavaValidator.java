/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.validation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.SymbolTok;
import org.eclipse.fx.ide.css.cssDsl.UrlTok;
import org.eclipse.fx.ide.css.cssDsl.WSTok;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.font_face;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.eclipse.fx.ide.css.util.Utils;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;


public class CssDslJavaValidator extends AbstractCssDslJavaValidator {
	private static final List<String> PREDEFINED_VAR_PROPS = Arrays.asList(
			"-fx-base",							"-fx-background",				"-fx-control-inner-background",		"-fx-control-inner-background-alt",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"-fx-dark-text-color",				"-fx-mid-text-color", 			"-fx-light-text-color", 			"-fx-accent", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"-fx-default-button",				"-fx-focus-color",				"-fx-faint-focus-color",			"-fx-color",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"CHART_COLOR_1",					"CHART_COLOR_2",				"CHART_COLOR_3",					"CHART_COLOR_4", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"CHART_COLOR_5",					"CHART_COLOR_6",				"CHART_COLOR_7",					"CHART_COLOR_8",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"CHART_COLOR_1_TRANS_20",			"CHART_COLOR_2_TRANS_20", 		"CHART_COLOR_3_TRANS_20", 			"CHART_COLOR_4_TRANS_20", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"CHART_COLOR_5_TRANS_20",			"CHART_COLOR_6_TRANS_20",		"CHART_COLOR_7_TRANS_20",			"CHART_COLOR_8_TRANS_20",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"CHART_COLOR_1_TRANS_70",			"CHART_COLOR_2_TRANS_70",		"CHART_COLOR_3_TRANS_70",			"CHART_COLOR_4_TRANS_70", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"CHART_COLOR_5_TRANS_70",			"CHART_COLOR_6_TRANS_70",		"CHART_COLOR_7_TRANS_70",			"CHART_COLOR_8_TRANS_70",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"-fx-hover-base",					"-fx-pressed-base",				"-fx-text-background-color",		"-fx-box-border", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"-fx-text-box-border",				"-fx-shadow-highlight-color", 	"-fx-outer-border",					"-fx-inner-border",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"-fx-inner-border-horizontal", 		"-fx-inner-border-bottomup", 	"-fx-body-color", 					"-fx-body-color-bottomup", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"-fx-body-color-to-right",			"-fx-text-base-color", 			"-fx-text-inner-color",				"-fx-mark-color",    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$
			"-fx-mark-highlight-color",			"-fx-selection-bar", 			"-fx-selection-bar-non-focused", 	"-fx-selection-bar-text", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"-fx-cell-hover-color",				"-fx-cell-focus-inner-border", 	"-fx-cell-focus-inner-border", 		"-fx-page-bullet-border",   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ //$NON-NLS-4$
			"-fx-page-indicator-hover-border", "-fx-focused-text-base-color", 	"-fx-focused-mark-color"  //$NON-NLS-1$ //$NON-NLS-2$//$NON-NLS-3$
			);
	//private @Inject CssDialectExtensionRegistry extension;

	private @Inject CssExt ext;

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	private boolean filterWS(CssTok t) {
		return !(t instanceof WSTok);
	}

	private boolean filterSymbol(CssTok t) {
		return !(t instanceof SymbolTok);
	}

	@Check
	public void checkProperty(css_property property) {
	}

	@SuppressWarnings("restriction")
	@Check
	public void checkDeclaration(css_declaration dec) {
//		System.err.println("CHECK DECL " + dec);
		css_property property = dec.getProperty();

		// Only validate files who are:
		// * in a plug-in project
		//   - when css is part of build.properties bin.includes
		//   - when css is part of the source-folder
		IFile file = Utils.getFile(dec.eResource());

		//TODO We should add a service possibility to contribute these lookups
		boolean validate = false;

		try {
			if( file.getProject().hasNature("org.eclipse.pde.PluginNature") ) { //$NON-NLS-1$
				// validate = true;
				IFile properties = PDEProject.getBuildProperties(file.getProject());
				Properties p = new Properties();
				try( InputStream in = properties.getContents() ) {
					p.load(in);
					String includes = p.getProperty("bin.includes"); //$NON-NLS-1$
					if( includes != null ) {
						IPath path = file.getProjectRelativePath();
						for( String s : includes.split(",") ) { //$NON-NLS-1$
							if( path.toString().startsWith(s.trim()) ) {
								validate = true;
								break;
							}
						}
					}
				} catch(IOException e) {
					e.printStackTrace();
				}
			}

			if( ! validate && file.getProject().hasNature("org.eclipse.jdt.core.javanature") ) { //$NON-NLS-1$
				IJavaProject jp = JavaCore.create(file.getProject());
				for( IPackageFragmentRoot r : jp.getPackageFragmentRoots() ) {
					if( r.getKind() == IPackageFragmentRoot.K_SOURCE ) {
						if( file.getProjectRelativePath().toString().startsWith(r.getPath().removeFirstSegments(1).toString()) ) {
							validate = true;
							break;
						}
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if( ! validate ) {
			return;
		}

		if( dec.eContainer() instanceof font_face ) {
			if( "font-family".equals(property.getName()) ) {
				if( dec.getValueTokens().stream().filter(this::filterWS).count() != 1 ) {
					error("Font family has to define a name", dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS);
				} else {
					if( ! (dec.getValueTokens().stream().filter(this::filterWS).findFirst().get() instanceof IdentifierTok) ) {
						CssTok tok = dec.getValueTokens().stream().filter(this::filterWS).findFirst().get();
						error("Invalid font family name", dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS, dec.getValueTokens().indexOf(tok));
					}
				}
			} else if( "src".equals(property.getName()) ) {
				if( dec.getValueTokens().stream().filter(this::filterWS).count() == 0 ) {
					error("At least one URL is required", dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS);
				} else {
					dec.getValueTokens().stream().filter(this::filterWS).filter(this::filterSymbol).filter((t) -> !(t instanceof UrlTok)).forEach((t) ->
						{
							error("Only url-values are allowed", dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS,dec.getValueTokens().indexOf(t));
						}
					);
				}
			} else if( "font-stretch".equals(property.getName()) ) {

			} else if( "font-style".equals(property.getName()) ) {

			} else if( "font-weight".equals(property.getName()) ) {

			} else if( "unicode-range".equals(property.getName()) ) {

			} else {
				warning("Unknown property: \""+property.getName()+"\"", property, CssDslPackage.Literals.CSS_PROPERTY__NAME);
			}

			return;
		}


		List<Proposal> properties = ext.getPropertyProposalsForSelector(file,dec,null);
				//extension.getAllProperties(uri);

		boolean known = false;
		for (Proposal p : properties) {
			if (p.getProposal().equals(property.getName())) {
				known = true;
				break;
			}
		}

		if (!known) {
			ICompositeNode node = NodeModelUtils.getNode(dec.getProperty());

			boolean suppress = node.getText().contains("@SuppressWarning");
			if( ! suppress && ! PREDEFINED_VAR_PROPS.contains(property.getName()) ) {
				warning("Unknown property: \""+property.getName()+"\"", property, CssDslPackage.Literals.CSS_PROPERTY__NAME);
			}
		}
		else {

			ruleset rs = (ruleset) dec.eContainer();
			List<selector> selectors = rs.getSelectors();
//			Set<CssProperty> selectorProps = new HashSet<>();
//			for (selector selector : selectors) {
//				selectorProps.addAll(extension.getPropertiesForSelector(uri, selector));
//			}

			List<Proposal> selectorProps = ext.getPropertyProposalsForSelector(Utils.getFile(dec.eResource()),dec,selectors);

			if (selectorProps.size() > 0) {
				boolean supported = false;
				for (Proposal p : selectorProps) {
					if (p.getProposal().equals(property.getName())) {
						supported = true;
						break;
					}
				}

				if (!supported) {
					ICompositeNode node = NodeModelUtils.getNode(dec.getProperty());

					boolean suppress = node.getText().contains("@SuppressWarning"); //$NON-NLS-1$

					if( ! PREDEFINED_VAR_PROPS.contains(property.getName()) ) {
						warning("\""+property.getName()+"\" is not supported by the given selectors", CssDslPackage.Literals.CSS_DECLARATION__PROPERTY);
					}
				}
			}

//			List<ValidationResult> result = extension.validateProperty(uri, null, property.getName(), tokens);

//			System.err.println(result);
//
//			System.err.println("validation of " + property.getName());

//			if (!result.isEmpty()) {
//				for (ValidationResult r : result) {
//					if (r.status == ValidationStatus.ERROR) {
//						if (r.object != null) {
//							if (r.object instanceof FuncTok) {
//								FuncTok f = (FuncTok) r.object;
//								error(r.message, f, CssDslPackage.Literals.FUNC_TOK__NAME, -1);
//							}
//							else {
//								error(r.message, r.object, null, 0);
//							}
//						}
//						else {
//							error(r.message, dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS, r.index);
//						}
//					}
//				}
//			}
		}
	}
//	@Check
//	public void checkDeclaration(css_declaration dec) {
//		css_property property = dec.getProperty();
//		String propertyName = property.getName();
//
//		if( propertyName == null || propertyName.trim().length() == 0 ) {
//			return;
//		}
//
//		if( dec.getExpression().getTermGroups().size() == 1 && dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 && ("null".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) || "inherit".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) ) ) {
//			return;
//		}
//
//		ValidationResult[] results = new ValidationResult[0];
//		for( Property p : extension.getProperties(dec.eResource().getURI()) ) {
//			if( propertyName.equals(p.getName()) ) {
//
//				ValidationResult[] r = p.validate(dec);
//
//				// At least one validation succeed
//				if( r == null || r.length == 0 ) {
//					return;
//				} else if( r != null ) {
//					results = r;
//				}
//			}
//		}
//
//		for( ValidationResult r : results ) {
//			if( r.status == ValidationStatus.ERROR ) {
//				if( r.object == null ) {
//					error( r.message, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION );
//				} else if( r.index == -1 ) {
//					error(r.message, r.object, r.feature, 0);
//				} else {
//					error(r.message, r.object, r.feature, r.index);
//				}
//			} else if( r.status == ValidationStatus.WARNING ) {
//				if( r.object == null ) {
//					warning( r.message, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION );
//				} else if( r.index == -1 ) {
//					warning(r.message, r.object, r.feature, 0);
//				} else {
//					warning(r.message, r.object, r.feature, r.index);
//				}
//			}
//		}
//
////		System.err.println("Checking: " + extension + " => " + dec);
//	}
}
