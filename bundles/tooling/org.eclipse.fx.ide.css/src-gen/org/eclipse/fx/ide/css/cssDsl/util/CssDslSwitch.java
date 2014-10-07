/**
 */
package org.eclipse.fx.ide.css.cssDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.fx.ide.css.cssDsl.*;
import org.eclipse.jdt.annotation.Nullable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslSwitch<@Nullable T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CssDslPackage.STYLESHEET:
      {
        stylesheet stylesheet = (stylesheet)theEObject;
        T result = casestylesheet(stylesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CHARSET:
      {
        charset charset = (charset)theEObject;
        T result = casecharset(charset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.IMPORT_EXPRESSION:
      {
        importExpression importExpression = (importExpression)theEObject;
        T result = caseimportExpression(importExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PAGE:
      {
        page page = (page)theEObject;
        T result = casepage(page);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.MEDIA:
      {
        media media = (media)theEObject;
        T result = casemedia(media);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FONT_FACE:
      {
        font_face font_face = (font_face)theEObject;
        T result = casefont_face(font_face);
        if (result == null) result = casekeyframes(font_face);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.KEYFRAMES:
      {
        keyframes keyframes = (keyframes)theEObject;
        T result = casekeyframes(keyframes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.RULESET:
      {
        ruleset ruleset = (ruleset)theEObject;
        T result = caseruleset(ruleset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SELECTOR:
      {
        selector selector = (selector)theEObject;
        T result = caseselector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SIMPLE_SELECTOR_FOR_NEGATION:
      {
        SimpleSelectorForNegation simpleSelectorForNegation = (SimpleSelectorForNegation)theEObject;
        T result = caseSimpleSelectorForNegation(simpleSelectorForNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_SELECTOR:
      {
        CssSelector cssSelector = (CssSelector)theEObject;
        T result = caseCssSelector(cssSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SIMPLE_SELECTOR:
      {
        simple_selector simple_selector = (simple_selector)theEObject;
        T result = casesimple_selector(simple_selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CLASS_SELECTOR:
      {
        ClassSelector classSelector = (ClassSelector)theEObject;
        T result = caseClassSelector(classSelector);
        if (result == null) result = caseCssSelector(classSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.ELEMENT_SELECTOR:
      {
        ElementSelector elementSelector = (ElementSelector)theEObject;
        T result = caseElementSelector(elementSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.UNIVERSAL_SELECTOR:
      {
        UniversalSelector universalSelector = (UniversalSelector)theEObject;
        T result = caseUniversalSelector(universalSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.ID_SELECTOR:
      {
        IdSelector idSelector = (IdSelector)theEObject;
        T result = caseIdSelector(idSelector);
        if (result == null) result = caseCssSelector(idSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_DECLARATION:
      {
        css_declaration css_declaration = (css_declaration)theEObject;
        T result = casecss_declaration(css_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_PROPERTY:
      {
        css_property css_property = (css_property)theEObject;
        T result = casecss_property(css_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PSEUDO_CLASS_OR_FUNC:
      {
        PseudoClassOrFunc pseudoClassOrFunc = (PseudoClassOrFunc)theEObject;
        T result = casePseudoClassOrFunc(pseudoClassOrFunc);
        if (result == null) result = caseCssSelector(pseudoClassOrFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PSEUDO_CLASS:
      {
        PseudoClass pseudoClass = (PseudoClass)theEObject;
        T result = casePseudoClass(pseudoClass);
        if (result == null) result = casePseudoClassOrFunc(pseudoClass);
        if (result == null) result = caseCssSelector(pseudoClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PSEUDO_CLASS_NAME:
      {
        PseudoClassName pseudoClassName = (PseudoClassName)theEObject;
        T result = casePseudoClassName(pseudoClassName);
        if (result == null) result = casePseudoClass(pseudoClassName);
        if (result == null) result = casePseudoClassOrFunc(pseudoClassName);
        if (result == null) result = caseCssSelector(pseudoClassName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PSEUDO_CLASS_FUNCTION:
      {
        PseudoClassFunction pseudoClassFunction = (PseudoClassFunction)theEObject;
        T result = casePseudoClassFunction(pseudoClassFunction);
        if (result == null) result = casePseudoClassOrFunc(pseudoClassFunction);
        if (result == null) result = caseCssSelector(pseudoClassFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_TOK:
      {
        CssTok cssTok = (CssTok)theEObject;
        T result = caseCssTok(cssTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.URL_TYPE:
      {
        URLType urlType = (URLType)theEObject;
        T result = caseURLType(urlType);
        if (result == null) result = caseimportExpression(urlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.ATTRIBUTE_SELECTOR:
      {
        AttributeSelector attributeSelector = (AttributeSelector)theEObject;
        T result = caseAttributeSelector(attributeSelector);
        if (result == null) result = caseCssSelector(attributeSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SYMBOL_TOK:
      {
        SymbolTok symbolTok = (SymbolTok)theEObject;
        T result = caseSymbolTok(symbolTok);
        if (result == null) result = caseCssTok(symbolTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.WS_TOK:
      {
        WSTok wsTok = (WSTok)theEObject;
        T result = caseWSTok(wsTok);
        if (result == null) result = caseCssTok(wsTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.STRING_TOK:
      {
        StringTok stringTok = (StringTok)theEObject;
        T result = caseStringTok(stringTok);
        if (result == null) result = caseCssTok(stringTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.NUMBER_TOK:
      {
        NumberTok numberTok = (NumberTok)theEObject;
        T result = caseNumberTok(numberTok);
        if (result == null) result = caseCssTok(numberTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.URL_TOK:
      {
        UrlTok urlTok = (UrlTok)theEObject;
        T result = caseUrlTok(urlTok);
        if (result == null) result = caseCssTok(urlTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.COLOR_TOK:
      {
        ColorTok colorTok = (ColorTok)theEObject;
        T result = caseColorTok(colorTok);
        if (result == null) result = caseCssTok(colorTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.IDENTIFIER_TOK:
      {
        IdentifierTok identifierTok = (IdentifierTok)theEObject;
        T result = caseIdentifierTok(identifierTok);
        if (result == null) result = caseCssTok(identifierTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FUNC_TOK:
      {
        FuncTok funcTok = (FuncTok)theEObject;
        T result = caseFuncTok(funcTok);
        if (result == null) result = caseCssTok(funcTok);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestylesheet(stylesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>charset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>charset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecharset(charset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>import Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>import Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseimportExpression(importExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepage(page object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>media</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>media</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemedia(media object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>font face</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>font face</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefont_face(font_face object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>keyframes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>keyframes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casekeyframes(keyframes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleset(ruleset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselector(selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Selector For Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Selector For Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleSelectorForNegation(SimpleSelectorForNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Css Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Css Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCssSelector(CssSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_selector(simple_selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassSelector(ClassSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementSelector(ElementSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universal Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universal Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversalSelector(UniversalSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdSelector(IdSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_declaration(css_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_property(css_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class Or Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class Or Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClassOrFunc(PseudoClassOrFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClass(PseudoClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClassName(PseudoClassName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pseudo Class Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pseudo Class Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePseudoClassFunction(PseudoClassFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Css Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Css Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCssTok(CssTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURLType(URLType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSelector(AttributeSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolTok(SymbolTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WS Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WS Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWSTok(WSTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringTok(StringTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberTok(NumberTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Url Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Url Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUrlTok(UrlTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorTok(ColorTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifierTok(IdentifierTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Tok</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Tok</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncTok(FuncTok object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CssDslSwitch
