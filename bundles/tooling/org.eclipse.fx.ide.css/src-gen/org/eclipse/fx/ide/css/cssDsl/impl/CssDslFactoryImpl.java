/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.fx.ide.css.cssDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fx.ide.css.cssDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssDslFactoryImpl extends EFactoryImpl implements CssDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssDslFactory init()
  {
    try
    {
      CssDslFactory theCssDslFactory = (CssDslFactory)EPackage.Registry.INSTANCE.getEFactory(CssDslPackage.eNS_URI);
      if (theCssDslFactory != null)
      {
        return theCssDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CssDslPackage.STYLESHEET: return createstylesheet();
      case CssDslPackage.CHARSET: return createcharset();
      case CssDslPackage.IMPORT_EXPRESSION: return createimportExpression();
      case CssDslPackage.PAGE: return createpage();
      case CssDslPackage.MEDIA: return createmedia();
      case CssDslPackage.FONT_FACE: return createfont_face();
      case CssDslPackage.KEYFRAMES: return createkeyframes();
      case CssDslPackage.KEYFRAME_SELECTOR: return createkeyframe_selector();
      case CssDslPackage.RULESET: return createruleset();
      case CssDslPackage.SELECTOR: return createselector();
      case CssDslPackage.SIMPLE_SELECTOR_FOR_NEGATION: return createSimpleSelectorForNegation();
      case CssDslPackage.CSS_SELECTOR: return createCssSelector();
      case CssDslPackage.SIMPLE_SELECTOR: return createsimple_selector();
      case CssDslPackage.CLASS_SELECTOR: return createClassSelector();
      case CssDslPackage.ELEMENT_SELECTOR: return createElementSelector();
      case CssDslPackage.UNIVERSAL_SELECTOR: return createUniversalSelector();
      case CssDslPackage.ID_SELECTOR: return createIdSelector();
      case CssDslPackage.CSS_DECLARATION: return createcss_declaration();
      case CssDslPackage.CSS_PROPERTY: return createcss_property();
      case CssDslPackage.PSEUDO_CLASS_OR_FUNC: return createPseudoClassOrFunc();
      case CssDslPackage.PSEUDO_CLASS: return createPseudoClass();
      case CssDslPackage.PSEUDO_CLASS_NAME: return createPseudoClassName();
      case CssDslPackage.PSEUDO_CLASS_FUNCTION: return createPseudoClassFunction();
      case CssDslPackage.CSS_TOK: return createCssTok();
      case CssDslPackage.URL_TYPE: return createURLType();
      case CssDslPackage.ATTRIBUTE_SELECTOR: return createAttributeSelector();
      case CssDslPackage.SYMBOL_TOK: return createSymbolTok();
      case CssDslPackage.WS_TOK: return createWSTok();
      case CssDslPackage.STRING_TOK: return createStringTok();
      case CssDslPackage.NUMBER_TOK: return createNumberTok();
      case CssDslPackage.URL_TOK: return createUrlTok();
      case CssDslPackage.COLOR_TOK: return createColorTok();
      case CssDslPackage.IDENTIFIER_TOK: return createIdentifierTok();
      case CssDslPackage.FUNC_TOK: return createFuncTok();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stylesheet createstylesheet()
  {
    stylesheetImpl stylesheet = new stylesheetImpl();
    return stylesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public charset createcharset()
  {
    charsetImpl charset = new charsetImpl();
    return charset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importExpression createimportExpression()
  {
    importExpressionImpl importExpression = new importExpressionImpl();
    return importExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public page createpage()
  {
    pageImpl page = new pageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public media createmedia()
  {
    mediaImpl media = new mediaImpl();
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public font_face createfont_face()
  {
    font_faceImpl font_face = new font_faceImpl();
    return font_face;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public keyframes createkeyframes()
  {
    keyframesImpl keyframes = new keyframesImpl();
    return keyframes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public keyframe_selector createkeyframe_selector()
  {
    keyframe_selectorImpl keyframe_selector = new keyframe_selectorImpl();
    return keyframe_selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleset createruleset()
  {
    rulesetImpl ruleset = new rulesetImpl();
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selector createselector()
  {
    selectorImpl selector = new selectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelectorForNegation createSimpleSelectorForNegation()
  {
    SimpleSelectorForNegationImpl simpleSelectorForNegation = new SimpleSelectorForNegationImpl();
    return simpleSelectorForNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssSelector createCssSelector()
  {
    CssSelectorImpl cssSelector = new CssSelectorImpl();
    return cssSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_selector createsimple_selector()
  {
    simple_selectorImpl simple_selector = new simple_selectorImpl();
    return simple_selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassSelector createClassSelector()
  {
    ClassSelectorImpl classSelector = new ClassSelectorImpl();
    return classSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementSelector createElementSelector()
  {
    ElementSelectorImpl elementSelector = new ElementSelectorImpl();
    return elementSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniversalSelector createUniversalSelector()
  {
    UniversalSelectorImpl universalSelector = new UniversalSelectorImpl();
    return universalSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdSelector createIdSelector()
  {
    IdSelectorImpl idSelector = new IdSelectorImpl();
    return idSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_declaration createcss_declaration()
  {
    css_declarationImpl css_declaration = new css_declarationImpl();
    return css_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_property createcss_property()
  {
    css_propertyImpl css_property = new css_propertyImpl();
    return css_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClassOrFunc createPseudoClassOrFunc()
  {
    PseudoClassOrFuncImpl pseudoClassOrFunc = new PseudoClassOrFuncImpl();
    return pseudoClassOrFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClass createPseudoClass()
  {
    PseudoClassImpl pseudoClass = new PseudoClassImpl();
    return pseudoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClassName createPseudoClassName()
  {
    PseudoClassNameImpl pseudoClassName = new PseudoClassNameImpl();
    return pseudoClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClassFunction createPseudoClassFunction()
  {
    PseudoClassFunctionImpl pseudoClassFunction = new PseudoClassFunctionImpl();
    return pseudoClassFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssTok createCssTok()
  {
    CssTokImpl cssTok = new CssTokImpl();
    return cssTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URLType createURLType()
  {
    URLTypeImpl urlType = new URLTypeImpl();
    return urlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSelector createAttributeSelector()
  {
    AttributeSelectorImpl attributeSelector = new AttributeSelectorImpl();
    return attributeSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolTok createSymbolTok()
  {
    SymbolTokImpl symbolTok = new SymbolTokImpl();
    return symbolTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WSTok createWSTok()
  {
    WSTokImpl wsTok = new WSTokImpl();
    return wsTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringTok createStringTok()
  {
    StringTokImpl stringTok = new StringTokImpl();
    return stringTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberTok createNumberTok()
  {
    NumberTokImpl numberTok = new NumberTokImpl();
    return numberTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlTok createUrlTok()
  {
    UrlTokImpl urlTok = new UrlTokImpl();
    return urlTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorTok createColorTok()
  {
    ColorTokImpl colorTok = new ColorTokImpl();
    return colorTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierTok createIdentifierTok()
  {
    IdentifierTokImpl identifierTok = new IdentifierTokImpl();
    return identifierTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncTok createFuncTok()
  {
    FuncTokImpl funcTok = new FuncTokImpl();
    return funcTok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslPackage getCssDslPackage()
  {
    return (CssDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssDslPackage getPackage()
  {
    return CssDslPackage.eINSTANCE;
  }

} //CssDslFactoryImpl
