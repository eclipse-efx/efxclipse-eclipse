/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage
 * @generated
 */
public interface CssDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssDslFactory eINSTANCE = org.eclipse.fx.ide.css.cssDsl.impl.CssDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stylesheet</em>'.
   * @generated
   */
  stylesheet createstylesheet();

  /**
   * Returns a new object of class '<em>charset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>charset</em>'.
   * @generated
   */
  charset createcharset();

  /**
   * Returns a new object of class '<em>import Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>import Expression</em>'.
   * @generated
   */
  importExpression createimportExpression();

  /**
   * Returns a new object of class '<em>page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>page</em>'.
   * @generated
   */
  page createpage();

  /**
   * Returns a new object of class '<em>media</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>media</em>'.
   * @generated
   */
  media createmedia();

  /**
   * Returns a new object of class '<em>font face</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>font face</em>'.
   * @generated
   */
  font_face createfont_face();

  /**
   * Returns a new object of class '<em>keyframes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>keyframes</em>'.
   * @generated
   */
  keyframes createkeyframes();

  /**
   * Returns a new object of class '<em>ruleset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ruleset</em>'.
   * @generated
   */
  ruleset createruleset();

  /**
   * Returns a new object of class '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selector</em>'.
   * @generated
   */
  selector createselector();

  /**
   * Returns a new object of class '<em>Simple Selector For Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Selector For Negation</em>'.
   * @generated
   */
  SimpleSelectorForNegation createSimpleSelectorForNegation();

  /**
   * Returns a new object of class '<em>Css Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Css Selector</em>'.
   * @generated
   */
  CssSelector createCssSelector();

  /**
   * Returns a new object of class '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple selector</em>'.
   * @generated
   */
  simple_selector createsimple_selector();

  /**
   * Returns a new object of class '<em>Class Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Selector</em>'.
   * @generated
   */
  ClassSelector createClassSelector();

  /**
   * Returns a new object of class '<em>Element Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Selector</em>'.
   * @generated
   */
  ElementSelector createElementSelector();

  /**
   * Returns a new object of class '<em>Universal Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Universal Selector</em>'.
   * @generated
   */
  UniversalSelector createUniversalSelector();

  /**
   * Returns a new object of class '<em>Id Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Selector</em>'.
   * @generated
   */
  IdSelector createIdSelector();

  /**
   * Returns a new object of class '<em>css declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css declaration</em>'.
   * @generated
   */
  css_declaration createcss_declaration();

  /**
   * Returns a new object of class '<em>css property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css property</em>'.
   * @generated
   */
  css_property createcss_property();

  /**
   * Returns a new object of class '<em>Pseudo Class Or Func</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Class Or Func</em>'.
   * @generated
   */
  PseudoClassOrFunc createPseudoClassOrFunc();

  /**
   * Returns a new object of class '<em>Pseudo Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Class</em>'.
   * @generated
   */
  PseudoClass createPseudoClass();

  /**
   * Returns a new object of class '<em>Pseudo Class Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Class Name</em>'.
   * @generated
   */
  PseudoClassName createPseudoClassName();

  /**
   * Returns a new object of class '<em>Pseudo Class Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pseudo Class Function</em>'.
   * @generated
   */
  PseudoClassFunction createPseudoClassFunction();

  /**
   * Returns a new object of class '<em>Css Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Css Tok</em>'.
   * @generated
   */
  CssTok createCssTok();

  /**
   * Returns a new object of class '<em>URL Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URL Type</em>'.
   * @generated
   */
  URLType createURLType();

  /**
   * Returns a new object of class '<em>Attribute Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Selector</em>'.
   * @generated
   */
  AttributeSelector createAttributeSelector();

  /**
   * Returns a new object of class '<em>Symbol Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Tok</em>'.
   * @generated
   */
  SymbolTok createSymbolTok();

  /**
   * Returns a new object of class '<em>WS Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WS Tok</em>'.
   * @generated
   */
  WSTok createWSTok();

  /**
   * Returns a new object of class '<em>String Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Tok</em>'.
   * @generated
   */
  StringTok createStringTok();

  /**
   * Returns a new object of class '<em>Number Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Tok</em>'.
   * @generated
   */
  NumberTok createNumberTok();

  /**
   * Returns a new object of class '<em>Url Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url Tok</em>'.
   * @generated
   */
  UrlTok createUrlTok();

  /**
   * Returns a new object of class '<em>Color Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Tok</em>'.
   * @generated
   */
  ColorTok createColorTok();

  /**
   * Returns a new object of class '<em>Identifier Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier Tok</em>'.
   * @generated
   */
  IdentifierTok createIdentifierTok();

  /**
   * Returns a new object of class '<em>Func Tok</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Tok</em>'.
   * @generated
   */
  FuncTok createFuncTok();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CssDslPackage getCssDslPackage();

} //CssDslFactory
