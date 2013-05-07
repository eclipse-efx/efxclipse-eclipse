/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSNumLiteral;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRangedDoubleType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRangedIntType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleBracket;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcat;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcatWithoutSpace;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleFunc;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleLiteral;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleOr;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRulePostfix;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRegex;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleSymbol;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleXor;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslFactory;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Import;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Substructure;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssExtDslFactoryImpl extends EFactoryImpl implements CssExtDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssExtDslFactory init()
  {
    try
    {
      CssExtDslFactory theCssExtDslFactory = (CssExtDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/css/cssext/CssExtDsl"); 
      if (theCssExtDslFactory != null)
      {
        return theCssExtDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssExtDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslFactoryImpl()
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
      case CssExtDslPackage.CSS_EXTENSION: return createCssExtension();
      case CssExtDslPackage.IMPORT: return createImport();
      case CssExtDslPackage.PACKAGE_DEFINITION: return createPackageDefinition();
      case CssExtDslPackage.DOKU: return createDoku();
      case CssExtDslPackage.CSS_RULE: return createCSSRule();
      case CssExtDslPackage.CSS_TYPE: return createCSSType();
      case CssExtDslPackage.ELEMENT_DEFINITION: return createElementDefinition();
      case CssExtDslPackage.DEFINITION: return createDefinition();
      case CssExtDslPackage.PSEUDO_CLASS_DEFINITION: return createPseudoClassDefinition();
      case CssExtDslPackage.CSS_RULE_REF: return createCSSRuleRef();
      case CssExtDslPackage.CSS_DEFAULT_VALUE: return createCSSDefaultValue();
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR: return createSubstructureSelector();
      case CssExtDslPackage.SUBSTRUCTURE: return createSubstructure();
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS: return createSubstructureStyleclass();
      case CssExtDslPackage.CSS_RANGED_INT_TYPE: return createCSSRangedIntType();
      case CssExtDslPackage.CSS_RANGED_DOUBLE_TYPE: return createCSSRangedDoubleType();
      case CssExtDslPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case CssExtDslPackage.CSS_RULE_DEFINITION: return createCSSRuleDefinition();
      case CssExtDslPackage.CSS_RULE_FUNC: return createCSSRuleFunc();
      case CssExtDslPackage.CSS_RULE_OR: return createCSSRuleOr();
      case CssExtDslPackage.CSS_RULE_XOR: return createCSSRuleXor();
      case CssExtDslPackage.CSS_RULE_CONCAT: return createCSSRuleConcat();
      case CssExtDslPackage.CSS_RULE_CONCAT_WITHOUT_SPACE: return createCSSRuleConcatWithoutSpace();
      case CssExtDslPackage.CSS_RULE_POSTFIX: return createCSSRulePostfix();
      case CssExtDslPackage.CSS_RULE_BRACKET: return createCSSRuleBracket();
      case CssExtDslPackage.CSS_NUM_LITERAL: return createCSSNumLiteral();
      case CssExtDslPackage.CSS_RULE_REGEX: return createCSSRuleRegex();
      case CssExtDslPackage.CSS_RULE_LITERAL: return createCSSRuleLiteral();
      case CssExtDslPackage.CSS_RULE_SYMBOL: return createCSSRuleSymbol();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtension createCssExtension()
  {
    CssExtensionImpl cssExtension = new CssExtensionImpl();
    return cssExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDefinition createPackageDefinition()
  {
    PackageDefinitionImpl packageDefinition = new PackageDefinitionImpl();
    return packageDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku createDoku()
  {
    DokuImpl doku = new DokuImpl();
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule createCSSRule()
  {
    CSSRuleImpl cssRule = new CSSRuleImpl();
    return cssRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSType createCSSType()
  {
    CSSTypeImpl cssType = new CSSTypeImpl();
    return cssType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition createElementDefinition()
  {
    ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
    return elementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PseudoClassDefinition createPseudoClassDefinition()
  {
    PseudoClassDefinitionImpl pseudoClassDefinition = new PseudoClassDefinitionImpl();
    return pseudoClassDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleRef createCSSRuleRef()
  {
    CSSRuleRefImpl cssRuleRef = new CSSRuleRefImpl();
    return cssRuleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSDefaultValue createCSSDefaultValue()
  {
    CSSDefaultValueImpl cssDefaultValue = new CSSDefaultValueImpl();
    return cssDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstructureSelector createSubstructureSelector()
  {
    SubstructureSelectorImpl substructureSelector = new SubstructureSelectorImpl();
    return substructureSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Substructure createSubstructure()
  {
    SubstructureImpl substructure = new SubstructureImpl();
    return substructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstructureStyleclass createSubstructureStyleclass()
  {
    SubstructureStyleclassImpl substructureStyleclass = new SubstructureStyleclassImpl();
    return substructureStyleclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRangedIntType createCSSRangedIntType()
  {
    CSSRangedIntTypeImpl cssRangedIntType = new CSSRangedIntTypeImpl();
    return cssRangedIntType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRangedDoubleType createCSSRangedDoubleType()
  {
    CSSRangedDoubleTypeImpl cssRangedDoubleType = new CSSRangedDoubleTypeImpl();
    return cssRangedDoubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefinition createPropertyDefinition()
  {
    PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
    return propertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleDefinition createCSSRuleDefinition()
  {
    CSSRuleDefinitionImpl cssRuleDefinition = new CSSRuleDefinitionImpl();
    return cssRuleDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleFunc createCSSRuleFunc()
  {
    CSSRuleFuncImpl cssRuleFunc = new CSSRuleFuncImpl();
    return cssRuleFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleOr createCSSRuleOr()
  {
    CSSRuleOrImpl cssRuleOr = new CSSRuleOrImpl();
    return cssRuleOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleXor createCSSRuleXor()
  {
    CSSRuleXorImpl cssRuleXor = new CSSRuleXorImpl();
    return cssRuleXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleConcat createCSSRuleConcat()
  {
    CSSRuleConcatImpl cssRuleConcat = new CSSRuleConcatImpl();
    return cssRuleConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleConcatWithoutSpace createCSSRuleConcatWithoutSpace()
  {
    CSSRuleConcatWithoutSpaceImpl cssRuleConcatWithoutSpace = new CSSRuleConcatWithoutSpaceImpl();
    return cssRuleConcatWithoutSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRulePostfix createCSSRulePostfix()
  {
    CSSRulePostfixImpl cssRulePostfix = new CSSRulePostfixImpl();
    return cssRulePostfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleBracket createCSSRuleBracket()
  {
    CSSRuleBracketImpl cssRuleBracket = new CSSRuleBracketImpl();
    return cssRuleBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSNumLiteral createCSSNumLiteral()
  {
    CSSNumLiteralImpl cssNumLiteral = new CSSNumLiteralImpl();
    return cssNumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleRegex createCSSRuleRegex()
  {
    CSSRuleRegexImpl cssRuleRegex = new CSSRuleRegexImpl();
    return cssRuleRegex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleLiteral createCSSRuleLiteral()
  {
    CSSRuleLiteralImpl cssRuleLiteral = new CSSRuleLiteralImpl();
    return cssRuleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRuleSymbol createCSSRuleSymbol()
  {
    CSSRuleSymbolImpl cssRuleSymbol = new CSSRuleSymbolImpl();
    return cssRuleSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslPackage getCssExtDslPackage()
  {
    return (CssExtDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssExtDslPackage getPackage()
  {
    return CssExtDslPackage.eINSTANCE;
  }

} //CssExtDslFactoryImpl
