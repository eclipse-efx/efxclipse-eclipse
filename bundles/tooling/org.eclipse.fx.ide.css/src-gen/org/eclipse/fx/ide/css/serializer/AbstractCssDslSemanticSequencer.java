package org.eclipse.fx.ide.css.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.AttributeSelector;
import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.ColorTok;
import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.IdSelector;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.NumberTok;
import org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction;
import org.eclipse.fx.ide.css.cssDsl.PseudoClassName;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation;
import org.eclipse.fx.ide.css.cssDsl.StringTok;
import org.eclipse.fx.ide.css.cssDsl.SymbolTok;
import org.eclipse.fx.ide.css.cssDsl.URLType;
import org.eclipse.fx.ide.css.cssDsl.UniversalSelector;
import org.eclipse.fx.ide.css.cssDsl.UrlTok;
import org.eclipse.fx.ide.css.cssDsl.WSTok;
import org.eclipse.fx.ide.css.cssDsl.charset;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.font_face;
import org.eclipse.fx.ide.css.cssDsl.importExpression;
import org.eclipse.fx.ide.css.cssDsl.media;
import org.eclipse.fx.ide.css.cssDsl.page;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractCssDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CssDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssDslPackage.ATTRIBUTE_SELECTOR:
				if(context == grammarAccess.getAttributeSelectorRule() ||
				   context == grammarAccess.getSubSelectorRule() ||
				   context == grammarAccess.getSubSelectorForNegationRule()) {
					sequence_AttributeSelector(context, (AttributeSelector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CLASS_SELECTOR:
				if(context == grammarAccess.getClassSelectorRule() ||
				   context == grammarAccess.getSubSelectorRule() ||
				   context == grammarAccess.getSubSelectorForNegationRule()) {
					sequence_ClassSelector(context, (ClassSelector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.COLOR_TOK:
				if(context == grammarAccess.getColorTokRule() ||
				   context == grammarAccess.getCssTokRule()) {
					sequence_ColorTok(context, (ColorTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.ELEMENT_SELECTOR:
				if(context == grammarAccess.getElementSelectorRule()) {
					sequence_ElementSelector(context, (ElementSelector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FUNC_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getIdentifierOrFuncTokRule()) {
					sequence_IdentifierOrFuncTok(context, (FuncTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.ID_SELECTOR:
				if(context == grammarAccess.getIdSelectorRule() ||
				   context == grammarAccess.getSubSelectorRule() ||
				   context == grammarAccess.getSubSelectorForNegationRule()) {
					sequence_IdSelector(context, (IdSelector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.IDENTIFIER_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getIdentifierOrFuncTokRule() ||
				   context == grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0()) {
					sequence_IdentifierOrFuncTok(context, (IdentifierTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.NUMBER_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getNumberTokRule()) {
					sequence_NumberTok(context, (NumberTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.PSEUDO_CLASS_FUNCTION:
				if(context == grammarAccess.getPseudoClassFunctionRule() ||
				   context == grammarAccess.getPseudoClassOrFuncRule() ||
				   context == grammarAccess.getSubSelectorRule()) {
					sequence_PseudoClassFunction(context, (PseudoClassFunction) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.PSEUDO_CLASS_NAME:
				if(context == grammarAccess.getPseudoClassRule() ||
				   context == grammarAccess.getPseudoClassNameRule() ||
				   context == grammarAccess.getPseudoClassOrFuncRule() ||
				   context == grammarAccess.getSubSelectorRule() ||
				   context == grammarAccess.getSubSelectorForNegationRule()) {
					sequence_PseudoClassName(context, (PseudoClassName) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR_FOR_NEGATION:
				if(context == grammarAccess.getSimpleSelectorForNegationRule()) {
					sequence_SimpleSelectorForNegation(context, (SimpleSelectorForNegation) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STRING_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getStringTokRule()) {
					sequence_StringTok(context, (StringTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SYMBOL_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getSymbolTokRule()) {
					sequence_SymbolTok(context, (SymbolTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.URL_TYPE:
				if(context == grammarAccess.getURLTypeRule()) {
					sequence_URLType(context, (URLType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getImportExpressionRule()) {
					sequence_URLType_importExpression(context, (URLType) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.UNIVERSAL_SELECTOR:
				if(context == grammarAccess.getUniversalSelectorRule()) {
					sequence_UniversalSelector(context, (UniversalSelector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.URL_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getUrlTokRule()) {
					sequence_UrlTok(context, (UrlTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.WS_TOK:
				if(context == grammarAccess.getCssTokRule() ||
				   context == grammarAccess.getWSTokRule()) {
					sequence_WSTok(context, (WSTok) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CHARSET:
				if(context == grammarAccess.getCharsetRule()) {
					sequence_charset(context, (charset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_DECLARATION:
				if(context == grammarAccess.getCss_declarationRule()) {
					sequence_css_declaration(context, (css_declaration) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_PROPERTY:
				if(context == grammarAccess.getCss_propertyRule()) {
					sequence_css_property(context, (css_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FONT_FACE:
				if(context == grammarAccess.getFont_faceRule()) {
					sequence_font_face(context, (font_face) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getKeyframesRule()) {
					sequence_keyframes(context, (font_face) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.IMPORT_EXPRESSION:
				if(context == grammarAccess.getImportExpressionRule()) {
					sequence_importExpression(context, (importExpression) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_media(context, (media) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_page(context, (page) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RULESET:
				if(context == grammarAccess.getRulesetRule()) {
					sequence_ruleset(context, (ruleset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_selector(context, (selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimple_selectorRule()) {
					sequence_simple_selector(context, (simple_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_stylesheet(context, (stylesheet) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=Identifier 
	 *         (
	 *             (
	 *                 op='^=' | 
	 *                 op='$=' | 
	 *                 op='*=' | 
	 *                 op='=' | 
	 *                 op=INCLUDES | 
	 *                 op=DASHMATCH
	 *             ) 
	 *             (value=Identifier | value=CSSSTRING)
	 *         )?
	 *     )
	 */
	protected void sequence_AttributeSelector(EObject context, AttributeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_ClassSelector(EObject context, ClassSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CLASS_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CLASS_SELECTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Hex
	 */
	protected void sequence_ColorTok(EObject context, ColorTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.COLOR_TOK__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.COLOR_TOK__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_ElementSelector(EObject context, ElementSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.ELEMENT_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.ELEMENT_SELECTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_IdSelector(EObject context, IdSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.ID_SELECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.ID_SELECTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierOrFuncTok_FuncTok_2_0 params+=CssTok+)
	 */
	protected void sequence_IdentifierOrFuncTok(EObject context, FuncTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_IdentifierOrFuncTok(EObject context, IdentifierTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.IDENTIFIER_TOK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.IDENTIFIER_TOK__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=Num
	 */
	protected void sequence_NumberTok(EObject context, NumberTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.NUMBER_TOK__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.NUMBER_TOK__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((not?=NotFunctionCall paramSelector=SimpleSelectorForNegation) | (name=Identifier params+=CssTok*))
	 */
	protected void sequence_PseudoClassFunction(EObject context, PseudoClassFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_PseudoClassName(EObject context, PseudoClassName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.PSEUDO_CLASS_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.PSEUDO_CLASS_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((element=ElementSelector | universal=UniversalSelector) subSelectors+=SubSelectorForNegation*) | subSelectors+=SubSelectorForNegation+)
	 */
	protected void sequence_SimpleSelectorForNegation(EObject context, SimpleSelectorForNegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=CSSSTRING
	 */
	protected void sequence_StringTok(EObject context, StringTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.STRING_TOK__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.STRING_TOK__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (symbol=COMMA | symbol=PERCENT)
	 */
	protected void sequence_SymbolTok(EObject context, SymbolTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=ValidURL
	 */
	protected void sequence_URLType(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=ValidURL mediaList=media_list?)
	 */
	protected void sequence_URLType_importExpression(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespace=css_namespace_prefix?)
	 */
	protected void sequence_UniversalSelector(EObject context, UniversalSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=URLType
	 */
	protected void sequence_UrlTok(EObject context, UrlTok semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.URL_TOK__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.URL_TOK__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {WSTok}
	 */
	protected void sequence_WSTok(EObject context, WSTok semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     charset=CSSSTRING
	 */
	protected void sequence_charset(EObject context, charset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharsetAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0(), semanticObject.getCharset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=css_property valueTokens+=CssTok+ important?=IMPORTANT_SYM?)
	 */
	protected void sequence_css_declaration(EObject context, css_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidPropertyIdent
	 */
	protected void sequence_css_property(EObject context, css_property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=css_declaration? declarations+=css_declaration*)
	 */
	protected void sequence_font_face(EObject context, font_face semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=CSSSTRING
	 */
	protected void sequence_importExpression(EObject context, importExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportExpressionAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=css_declaration? declarations+=css_declaration*)
	 */
	protected void sequence_keyframes(EObject context, font_face semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (medialist=media_list rulesets+=ruleset*)
	 */
	protected void sequence_media(EObject context, media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pseudoPage=pseudo_page? declarations+=css_declaration? declarations+=css_declaration*)
	 */
	protected void sequence_page(EObject context, page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=selector selectors+=selector* (declarations+=css_declaration declarations+=css_declaration*)?)
	 */
	protected void sequence_ruleset(EObject context, ruleset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleselectors+=simple_selector ((combinator=combinator selector=selector) | (combinator=combinator? selector=selector))?)
	 */
	protected void sequence_selector(EObject context, selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((element=ElementSelector | universal=UniversalSelector) subSelectors+=SubSelector*) | subSelectors+=SubSelector+)
	 */
	protected void sequence_simple_selector(EObject context, simple_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (charset=charset? imports+=importExpression* (ruleset+=ruleset | media+=media | page+=page | font_face+=font_face | keyframes+=keyframes)*)
	 */
	protected void sequence_stylesheet(EObject context, stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
