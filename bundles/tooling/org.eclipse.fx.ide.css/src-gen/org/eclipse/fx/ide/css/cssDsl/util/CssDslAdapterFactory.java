/**
 */
package org.eclipse.fx.ide.css.cssDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.*;
import org.eclipse.jdt.annotation.Nullable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CssDslSwitch<@Nullable Adapter> modelSwitch =
    new CssDslSwitch<@Nullable Adapter>()
    {
      @Override
      public Adapter casestylesheet(stylesheet object)
      {
        return createstylesheetAdapter();
      }
      @Override
      public Adapter casecharset(charset object)
      {
        return createcharsetAdapter();
      }
      @Override
      public Adapter caseimportExpression(importExpression object)
      {
        return createimportExpressionAdapter();
      }
      @Override
      public Adapter casepage(page object)
      {
        return createpageAdapter();
      }
      @Override
      public Adapter casemedia(media object)
      {
        return createmediaAdapter();
      }
      @Override
      public Adapter casefont_face(font_face object)
      {
        return createfont_faceAdapter();
      }
      @Override
      public Adapter casekeyframes(keyframes object)
      {
        return createkeyframesAdapter();
      }
      @Override
      public Adapter casekeyframe_selector(keyframe_selector object)
      {
        return createkeyframe_selectorAdapter();
      }
      @Override
      public Adapter caseruleset(ruleset object)
      {
        return createrulesetAdapter();
      }
      @Override
      public Adapter caseselector(selector object)
      {
        return createselectorAdapter();
      }
      @Override
      public Adapter caseSimpleSelectorForNegation(SimpleSelectorForNegation object)
      {
        return createSimpleSelectorForNegationAdapter();
      }
      @Override
      public Adapter caseCssSelector(CssSelector object)
      {
        return createCssSelectorAdapter();
      }
      @Override
      public Adapter casesimple_selector(simple_selector object)
      {
        return createsimple_selectorAdapter();
      }
      @Override
      public Adapter caseClassSelector(ClassSelector object)
      {
        return createClassSelectorAdapter();
      }
      @Override
      public Adapter caseElementSelector(ElementSelector object)
      {
        return createElementSelectorAdapter();
      }
      @Override
      public Adapter caseUniversalSelector(UniversalSelector object)
      {
        return createUniversalSelectorAdapter();
      }
      @Override
      public Adapter caseIdSelector(IdSelector object)
      {
        return createIdSelectorAdapter();
      }
      @Override
      public Adapter casecss_declaration(css_declaration object)
      {
        return createcss_declarationAdapter();
      }
      @Override
      public Adapter casecss_property(css_property object)
      {
        return createcss_propertyAdapter();
      }
      @Override
      public Adapter casePseudoClassOrFunc(PseudoClassOrFunc object)
      {
        return createPseudoClassOrFuncAdapter();
      }
      @Override
      public Adapter casePseudoClass(PseudoClass object)
      {
        return createPseudoClassAdapter();
      }
      @Override
      public Adapter casePseudoClassName(PseudoClassName object)
      {
        return createPseudoClassNameAdapter();
      }
      @Override
      public Adapter casePseudoClassFunction(PseudoClassFunction object)
      {
        return createPseudoClassFunctionAdapter();
      }
      @Override
      public Adapter caseCssTok(CssTok object)
      {
        return createCssTokAdapter();
      }
      @Override
      public Adapter caseURLType(URLType object)
      {
        return createURLTypeAdapter();
      }
      @Override
      public Adapter caseAttributeSelector(AttributeSelector object)
      {
        return createAttributeSelectorAdapter();
      }
      @Override
      public Adapter caseSymbolTok(SymbolTok object)
      {
        return createSymbolTokAdapter();
      }
      @Override
      public Adapter caseWSTok(WSTok object)
      {
        return createWSTokAdapter();
      }
      @Override
      public Adapter caseStringTok(StringTok object)
      {
        return createStringTokAdapter();
      }
      @Override
      public Adapter caseNumberTok(NumberTok object)
      {
        return createNumberTokAdapter();
      }
      @Override
      public Adapter caseUrlTok(UrlTok object)
      {
        return createUrlTokAdapter();
      }
      @Override
      public Adapter caseColorTok(ColorTok object)
      {
        return createColorTokAdapter();
      }
      @Override
      public Adapter caseIdentifierTok(IdentifierTok object)
      {
        return createIdentifierTokAdapter();
      }
      @Override
      public Adapter caseFuncTok(FuncTok object)
      {
        return createFuncTokAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet
   * @generated
   */
  public Adapter createstylesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.charset <em>charset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.charset
   * @generated
   */
  public Adapter createcharsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.importExpression <em>import Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.importExpression
   * @generated
   */
  public Adapter createimportExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.page <em>page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.page
   * @generated
   */
  public Adapter createpageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.media <em>media</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.media
   * @generated
   */
  public Adapter createmediaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.font_face <em>font face</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.font_face
   * @generated
   */
  public Adapter createfont_faceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.keyframes <em>keyframes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.keyframes
   * @generated
   */
  public Adapter createkeyframesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector <em>keyframe selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.keyframe_selector
   * @generated
   */
  public Adapter createkeyframe_selectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.ruleset <em>ruleset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.ruleset
   * @generated
   */
  public Adapter createrulesetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.selector
   * @generated
   */
  public Adapter createselectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation <em>Simple Selector For Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation
   * @generated
   */
  public Adapter createSimpleSelectorForNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.CssSelector <em>Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.CssSelector
   * @generated
   */
  public Adapter createCssSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.simple_selector
   * @generated
   */
  public Adapter createsimple_selectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.ClassSelector <em>Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.ClassSelector
   * @generated
   */
  public Adapter createClassSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.ElementSelector <em>Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.ElementSelector
   * @generated
   */
  public Adapter createElementSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.UniversalSelector <em>Universal Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.UniversalSelector
   * @generated
   */
  public Adapter createUniversalSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.IdSelector <em>Id Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.IdSelector
   * @generated
   */
  public Adapter createIdSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration <em>css declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.css_declaration
   * @generated
   */
  public Adapter createcss_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.css_property <em>css property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.css_property
   * @generated
   */
  public Adapter createcss_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassOrFunc <em>Pseudo Class Or Func</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassOrFunc
   * @generated
   */
  public Adapter createPseudoClassOrFuncAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClass <em>Pseudo Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClass
   * @generated
   */
  public Adapter createPseudoClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassName <em>Pseudo Class Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassName
   * @generated
   */
  public Adapter createPseudoClassNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction <em>Pseudo Class Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction
   * @generated
   */
  public Adapter createPseudoClassFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.CssTok <em>Css Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.CssTok
   * @generated
   */
  public Adapter createCssTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.URLType <em>URL Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.URLType
   * @generated
   */
  public Adapter createURLTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.AttributeSelector <em>Attribute Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.AttributeSelector
   * @generated
   */
  public Adapter createAttributeSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.SymbolTok <em>Symbol Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.SymbolTok
   * @generated
   */
  public Adapter createSymbolTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.WSTok <em>WS Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.WSTok
   * @generated
   */
  public Adapter createWSTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.StringTok <em>String Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.StringTok
   * @generated
   */
  public Adapter createStringTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.NumberTok <em>Number Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.NumberTok
   * @generated
   */
  public Adapter createNumberTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.UrlTok <em>Url Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.UrlTok
   * @generated
   */
  public Adapter createUrlTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.ColorTok <em>Color Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.ColorTok
   * @generated
   */
  public Adapter createColorTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.IdentifierTok <em>Identifier Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.IdentifierTok
   * @generated
   */
  public Adapter createIdentifierTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.css.cssDsl.FuncTok <em>Func Tok</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.css.cssDsl.FuncTok
   * @generated
   */
  public Adapter createFuncTokAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CssDslAdapterFactory
