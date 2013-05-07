/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssExtDslPackageImpl extends EPackageImpl implements CssExtDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssExtensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dokuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pseudoClassDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssDefaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substructureSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substructureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substructureStyleclassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRangedIntTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRangedDoubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleFuncEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleXorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleConcatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleConcatWithoutSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRulePostfixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleBracketEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssNumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleRegexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssRuleSymbolEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CssExtDslPackageImpl()
  {
    super(eNS_URI, CssExtDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CssExtDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CssExtDslPackage init()
  {
    if (isInited) return (CssExtDslPackage)EPackage.Registry.INSTANCE.getEPackage(CssExtDslPackage.eNS_URI);

    // Obtain or create and register package
    CssExtDslPackageImpl theCssExtDslPackage = (CssExtDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CssExtDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CssExtDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCssExtDslPackage.createPackageContents();

    // Initialize created meta-data
    theCssExtDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCssExtDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CssExtDslPackage.eNS_URI, theCssExtDslPackage);
    return theCssExtDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCssExtension()
  {
    return cssExtensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCssExtension_Imports()
  {
    return (EReference)cssExtensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCssExtension_PackageDef()
  {
    return (EReference)cssExtensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDefinition()
  {
    return packageDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Doku()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDefinition_Name()
  {
    return (EAttribute)packageDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Rules()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Subpackages()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDefinition_Elements()
  {
    return (EReference)packageDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoku()
  {
    return dokuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoku_Content()
  {
    return (EAttribute)dokuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRule()
  {
    return cssRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSType()
  {
    return cssTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSType_Doku()
  {
    return (EReference)cssTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSType_Type()
  {
    return (EAttribute)cssTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDefinition()
  {
    return elementDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDefinition_Doku()
  {
    return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementDefinition_Name()
  {
    return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDefinition_Super()
  {
    return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementDefinition_Styleclass()
  {
    return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDefinition_Properties()
  {
    return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDefinition_PseudoClasses()
  {
    return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementDefinition_Substructures()
  {
    return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Doku()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinition_Name()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Rule()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPseudoClassDefinition()
  {
    return pseudoClassDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPseudoClassDefinition_Doku()
  {
    return (EReference)pseudoClassDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPseudoClassDefinition_Name()
  {
    return (EAttribute)pseudoClassDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleRef()
  {
    return cssRuleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleRef_Doku()
  {
    return (EReference)cssRuleRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleRef_Ref()
  {
    return (EReference)cssRuleRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSDefaultValue()
  {
    return cssDefaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSDefaultValue_Val()
  {
    return (EReference)cssDefaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSDefaultValue_Ival()
  {
    return (EAttribute)cssDefaultValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSDefaultValue_Dval()
  {
    return (EAttribute)cssDefaultValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSDefaultValue_Sval()
  {
    return (EAttribute)cssDefaultValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstructureSelector()
  {
    return substructureSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubstructureSelector_SelectorName()
  {
    return (EAttribute)substructureSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubstructureSelector_Var()
  {
    return (EAttribute)substructureSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstructure()
  {
    return substructureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructure_Doku()
  {
    return (EReference)substructureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubstructure_Name()
  {
    return (EAttribute)substructureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructure_Childs()
  {
    return (EReference)substructureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstructureStyleclass()
  {
    return substructureStyleclassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructureStyleclass_Doku()
  {
    return (EReference)substructureStyleclassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructureStyleclass_Element()
  {
    return (EReference)substructureStyleclassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructureStyleclass_Selectors()
  {
    return (EReference)substructureStyleclassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstructureStyleclass_Childs()
  {
    return (EReference)substructureStyleclassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRangedIntType()
  {
    return cssRangedIntTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRangedIntType_From()
  {
    return (EAttribute)cssRangedIntTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRangedIntType_To()
  {
    return (EAttribute)cssRangedIntTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRangedDoubleType()
  {
    return cssRangedDoubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRangedDoubleType_From()
  {
    return (EAttribute)cssRangedDoubleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRangedDoubleType_To()
  {
    return (EAttribute)cssRangedDoubleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDefinition_Default()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleDefinition()
  {
    return cssRuleDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleDefinition_Func()
  {
    return (EReference)cssRuleDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleFunc()
  {
    return cssRuleFuncEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRuleFunc_Name()
  {
    return (EAttribute)cssRuleFuncEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleFunc_Params()
  {
    return (EReference)cssRuleFuncEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleOr()
  {
    return cssRuleOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleOr_Ors()
  {
    return (EReference)cssRuleOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleXor()
  {
    return cssRuleXorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleXor_Xors()
  {
    return (EReference)cssRuleXorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleConcat()
  {
    return cssRuleConcatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleConcat_Conc()
  {
    return (EReference)cssRuleConcatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleConcatWithoutSpace()
  {
    return cssRuleConcatWithoutSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleConcatWithoutSpace_Conc()
  {
    return (EReference)cssRuleConcatWithoutSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRulePostfix()
  {
    return cssRulePostfixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRulePostfix_Rule()
  {
    return (EReference)cssRulePostfixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRulePostfix_Cardinality()
  {
    return (EAttribute)cssRulePostfixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleBracket()
  {
    return cssRuleBracketEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleBracket_Inner()
  {
    return (EReference)cssRuleBracketEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSNumLiteral()
  {
    return cssNumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSNumLiteral_Value()
  {
    return (EAttribute)cssNumLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleRegex()
  {
    return cssRuleRegexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRuleRegex_Regex()
  {
    return (EAttribute)cssRuleRegexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleLiteral()
  {
    return cssRuleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleLiteral_Doku()
  {
    return (EReference)cssRuleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRuleLiteral_Value()
  {
    return (EAttribute)cssRuleLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSSRuleSymbol()
  {
    return cssRuleSymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSSRuleSymbol_Doku()
  {
    return (EReference)cssRuleSymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSSRuleSymbol_Symbol()
  {
    return (EAttribute)cssRuleSymbolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssExtDslFactory getCssExtDslFactory()
  {
    return (CssExtDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cssExtensionEClass = createEClass(CSS_EXTENSION);
    createEReference(cssExtensionEClass, CSS_EXTENSION__IMPORTS);
    createEReference(cssExtensionEClass, CSS_EXTENSION__PACKAGE_DEF);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageDefinitionEClass = createEClass(PACKAGE_DEFINITION);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__DOKU);
    createEAttribute(packageDefinitionEClass, PACKAGE_DEFINITION__NAME);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__RULES);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__SUBPACKAGES);
    createEReference(packageDefinitionEClass, PACKAGE_DEFINITION__ELEMENTS);

    dokuEClass = createEClass(DOKU);
    createEAttribute(dokuEClass, DOKU__CONTENT);

    cssRuleEClass = createEClass(CSS_RULE);

    cssTypeEClass = createEClass(CSS_TYPE);
    createEReference(cssTypeEClass, CSS_TYPE__DOKU);
    createEAttribute(cssTypeEClass, CSS_TYPE__TYPE);

    elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
    createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__DOKU);
    createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__NAME);
    createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SUPER);
    createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__STYLECLASS);
    createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PROPERTIES);
    createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PSEUDO_CLASSES);
    createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SUBSTRUCTURES);

    definitionEClass = createEClass(DEFINITION);
    createEReference(definitionEClass, DEFINITION__DOKU);
    createEAttribute(definitionEClass, DEFINITION__NAME);
    createEReference(definitionEClass, DEFINITION__RULE);

    pseudoClassDefinitionEClass = createEClass(PSEUDO_CLASS_DEFINITION);
    createEReference(pseudoClassDefinitionEClass, PSEUDO_CLASS_DEFINITION__DOKU);
    createEAttribute(pseudoClassDefinitionEClass, PSEUDO_CLASS_DEFINITION__NAME);

    cssRuleRefEClass = createEClass(CSS_RULE_REF);
    createEReference(cssRuleRefEClass, CSS_RULE_REF__DOKU);
    createEReference(cssRuleRefEClass, CSS_RULE_REF__REF);

    cssDefaultValueEClass = createEClass(CSS_DEFAULT_VALUE);
    createEReference(cssDefaultValueEClass, CSS_DEFAULT_VALUE__VAL);
    createEAttribute(cssDefaultValueEClass, CSS_DEFAULT_VALUE__IVAL);
    createEAttribute(cssDefaultValueEClass, CSS_DEFAULT_VALUE__DVAL);
    createEAttribute(cssDefaultValueEClass, CSS_DEFAULT_VALUE__SVAL);

    substructureSelectorEClass = createEClass(SUBSTRUCTURE_SELECTOR);
    createEAttribute(substructureSelectorEClass, SUBSTRUCTURE_SELECTOR__SELECTOR_NAME);
    createEAttribute(substructureSelectorEClass, SUBSTRUCTURE_SELECTOR__VAR);

    substructureEClass = createEClass(SUBSTRUCTURE);
    createEReference(substructureEClass, SUBSTRUCTURE__DOKU);
    createEAttribute(substructureEClass, SUBSTRUCTURE__NAME);
    createEReference(substructureEClass, SUBSTRUCTURE__CHILDS);

    substructureStyleclassEClass = createEClass(SUBSTRUCTURE_STYLECLASS);
    createEReference(substructureStyleclassEClass, SUBSTRUCTURE_STYLECLASS__DOKU);
    createEReference(substructureStyleclassEClass, SUBSTRUCTURE_STYLECLASS__ELEMENT);
    createEReference(substructureStyleclassEClass, SUBSTRUCTURE_STYLECLASS__SELECTORS);
    createEReference(substructureStyleclassEClass, SUBSTRUCTURE_STYLECLASS__CHILDS);

    cssRangedIntTypeEClass = createEClass(CSS_RANGED_INT_TYPE);
    createEAttribute(cssRangedIntTypeEClass, CSS_RANGED_INT_TYPE__FROM);
    createEAttribute(cssRangedIntTypeEClass, CSS_RANGED_INT_TYPE__TO);

    cssRangedDoubleTypeEClass = createEClass(CSS_RANGED_DOUBLE_TYPE);
    createEAttribute(cssRangedDoubleTypeEClass, CSS_RANGED_DOUBLE_TYPE__FROM);
    createEAttribute(cssRangedDoubleTypeEClass, CSS_RANGED_DOUBLE_TYPE__TO);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__DEFAULT);

    cssRuleDefinitionEClass = createEClass(CSS_RULE_DEFINITION);
    createEReference(cssRuleDefinitionEClass, CSS_RULE_DEFINITION__FUNC);

    cssRuleFuncEClass = createEClass(CSS_RULE_FUNC);
    createEAttribute(cssRuleFuncEClass, CSS_RULE_FUNC__NAME);
    createEReference(cssRuleFuncEClass, CSS_RULE_FUNC__PARAMS);

    cssRuleOrEClass = createEClass(CSS_RULE_OR);
    createEReference(cssRuleOrEClass, CSS_RULE_OR__ORS);

    cssRuleXorEClass = createEClass(CSS_RULE_XOR);
    createEReference(cssRuleXorEClass, CSS_RULE_XOR__XORS);

    cssRuleConcatEClass = createEClass(CSS_RULE_CONCAT);
    createEReference(cssRuleConcatEClass, CSS_RULE_CONCAT__CONC);

    cssRuleConcatWithoutSpaceEClass = createEClass(CSS_RULE_CONCAT_WITHOUT_SPACE);
    createEReference(cssRuleConcatWithoutSpaceEClass, CSS_RULE_CONCAT_WITHOUT_SPACE__CONC);

    cssRulePostfixEClass = createEClass(CSS_RULE_POSTFIX);
    createEReference(cssRulePostfixEClass, CSS_RULE_POSTFIX__RULE);
    createEAttribute(cssRulePostfixEClass, CSS_RULE_POSTFIX__CARDINALITY);

    cssRuleBracketEClass = createEClass(CSS_RULE_BRACKET);
    createEReference(cssRuleBracketEClass, CSS_RULE_BRACKET__INNER);

    cssNumLiteralEClass = createEClass(CSS_NUM_LITERAL);
    createEAttribute(cssNumLiteralEClass, CSS_NUM_LITERAL__VALUE);

    cssRuleRegexEClass = createEClass(CSS_RULE_REGEX);
    createEAttribute(cssRuleRegexEClass, CSS_RULE_REGEX__REGEX);

    cssRuleLiteralEClass = createEClass(CSS_RULE_LITERAL);
    createEReference(cssRuleLiteralEClass, CSS_RULE_LITERAL__DOKU);
    createEAttribute(cssRuleLiteralEClass, CSS_RULE_LITERAL__VALUE);

    cssRuleSymbolEClass = createEClass(CSS_RULE_SYMBOL);
    createEReference(cssRuleSymbolEClass, CSS_RULE_SYMBOL__DOKU);
    createEAttribute(cssRuleSymbolEClass, CSS_RULE_SYMBOL__SYMBOL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cssTypeEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleRefEClass.getESuperTypes().add(this.getCSSRule());
    cssRangedIntTypeEClass.getESuperTypes().add(this.getCSSType());
    cssRangedDoubleTypeEClass.getESuperTypes().add(this.getCSSType());
    propertyDefinitionEClass.getESuperTypes().add(this.getDefinition());
    cssRuleDefinitionEClass.getESuperTypes().add(this.getDefinition());
    cssRuleFuncEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleOrEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleXorEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleConcatEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleConcatWithoutSpaceEClass.getESuperTypes().add(this.getCSSRule());
    cssRulePostfixEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleBracketEClass.getESuperTypes().add(this.getCSSRule());
    cssNumLiteralEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleRegexEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleLiteralEClass.getESuperTypes().add(this.getCSSRule());
    cssRuleSymbolEClass.getESuperTypes().add(this.getCSSRule());

    // Initialize classes and features; add operations and parameters
    initEClass(cssExtensionEClass, CssExtension.class, "CssExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCssExtension_Imports(), this.getImport(), null, "imports", null, 0, -1, CssExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCssExtension_PackageDef(), this.getPackageDefinition(), null, "packageDef", null, 0, 1, CssExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDefinitionEClass, PackageDefinition.class, "PackageDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Rules(), this.getDefinition(), null, "rules", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Subpackages(), this.getPackageDefinition(), null, "subpackages", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDefinition_Elements(), this.getElementDefinition(), null, "elements", null, 0, -1, PackageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dokuEClass, Doku.class, "Doku", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoku_Content(), ecorePackage.getEString(), "content", null, 0, 1, Doku.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleEClass, CSSRule.class, "CSSRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cssTypeEClass, CSSType.class, "CSSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSType_Doku(), this.getDoku(), null, "doku", null, 0, 1, CSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSType_Type(), ecorePackage.getEString(), "type", null, 0, 1, CSSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementDefinitionEClass, ElementDefinition.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDefinition_Super(), this.getElementDefinition(), null, "super", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementDefinition_Styleclass(), ecorePackage.getEString(), "styleclass", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDefinition_Properties(), this.getDefinition(), null, "properties", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDefinition_PseudoClasses(), this.getPseudoClassDefinition(), null, "pseudoClasses", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementDefinition_Substructures(), this.getSubstructure(), null, "substructures", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Rule(), this.getCSSRule(), null, "rule", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pseudoClassDefinitionEClass, PseudoClassDefinition.class, "PseudoClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPseudoClassDefinition_Doku(), this.getDoku(), null, "doku", null, 0, 1, PseudoClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPseudoClassDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PseudoClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleRefEClass, CSSRuleRef.class, "CSSRuleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleRef_Doku(), this.getDoku(), null, "doku", null, 0, 1, CSSRuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCSSRuleRef_Ref(), this.getDefinition(), null, "ref", null, 0, 1, CSSRuleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssDefaultValueEClass, CSSDefaultValue.class, "CSSDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSDefaultValue_Val(), this.getCSSRule(), null, "val", null, 0, 1, CSSDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSDefaultValue_Ival(), ecorePackage.getEInt(), "ival", null, 0, 1, CSSDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSDefaultValue_Dval(), ecorePackage.getEDouble(), "dval", null, 0, 1, CSSDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSDefaultValue_Sval(), ecorePackage.getEString(), "sval", null, 0, 1, CSSDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(substructureSelectorEClass, SubstructureSelector.class, "SubstructureSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubstructureSelector_SelectorName(), ecorePackage.getEString(), "selectorName", null, 0, 1, SubstructureSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubstructureSelector_Var(), ecorePackage.getEString(), "var", null, 0, 1, SubstructureSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(substructureEClass, Substructure.class, "Substructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubstructure_Doku(), this.getDoku(), null, "doku", null, 0, 1, Substructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubstructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Substructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubstructure_Childs(), this.getSubstructureStyleclass(), null, "childs", null, 0, -1, Substructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(substructureStyleclassEClass, SubstructureStyleclass.class, "SubstructureStyleclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubstructureStyleclass_Doku(), this.getDoku(), null, "doku", null, 0, 1, SubstructureStyleclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubstructureStyleclass_Element(), this.getElementDefinition(), null, "element", null, 0, 1, SubstructureStyleclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubstructureStyleclass_Selectors(), this.getSubstructureSelector(), null, "selectors", null, 0, -1, SubstructureStyleclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubstructureStyleclass_Childs(), this.getSubstructureStyleclass(), null, "childs", null, 0, -1, SubstructureStyleclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRangedIntTypeEClass, CSSRangedIntType.class, "CSSRangedIntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRangedIntType_From(), ecorePackage.getEInt(), "from", null, 0, 1, CSSRangedIntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRangedIntType_To(), ecorePackage.getEInt(), "to", null, 0, 1, CSSRangedIntType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRangedDoubleTypeEClass, CSSRangedDoubleType.class, "CSSRangedDoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRangedDoubleType_From(), ecorePackage.getEDouble(), "from", null, 0, 1, CSSRangedDoubleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRangedDoubleType_To(), ecorePackage.getEDouble(), "to", null, 0, 1, CSSRangedDoubleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDefinition_Default(), this.getCSSDefaultValue(), null, "default", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleDefinitionEClass, CSSRuleDefinition.class, "CSSRuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleDefinition_Func(), this.getCSSRule(), null, "func", null, 0, 1, CSSRuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleFuncEClass, CSSRuleFunc.class, "CSSRuleFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRuleFunc_Name(), ecorePackage.getEString(), "name", null, 0, 1, CSSRuleFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCSSRuleFunc_Params(), this.getCSSRule(), null, "params", null, 0, 1, CSSRuleFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleOrEClass, CSSRuleOr.class, "CSSRuleOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleOr_Ors(), this.getCSSRule(), null, "ors", null, 0, -1, CSSRuleOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleXorEClass, CSSRuleXor.class, "CSSRuleXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleXor_Xors(), this.getCSSRule(), null, "xors", null, 0, -1, CSSRuleXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleConcatEClass, CSSRuleConcat.class, "CSSRuleConcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleConcat_Conc(), this.getCSSRule(), null, "conc", null, 0, -1, CSSRuleConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleConcatWithoutSpaceEClass, CSSRuleConcatWithoutSpace.class, "CSSRuleConcatWithoutSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleConcatWithoutSpace_Conc(), this.getCSSRule(), null, "conc", null, 0, -1, CSSRuleConcatWithoutSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRulePostfixEClass, CSSRulePostfix.class, "CSSRulePostfix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRulePostfix_Rule(), this.getCSSRule(), null, "rule", null, 0, 1, CSSRulePostfix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRulePostfix_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, CSSRulePostfix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleBracketEClass, CSSRuleBracket.class, "CSSRuleBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleBracket_Inner(), this.getCSSRule(), null, "inner", null, 0, 1, CSSRuleBracket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssNumLiteralEClass, CSSNumLiteral.class, "CSSNumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSNumLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CSSNumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleRegexEClass, CSSRuleRegex.class, "CSSRuleRegex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSSRuleRegex_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, CSSRuleRegex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleLiteralEClass, CSSRuleLiteral.class, "CSSRuleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleLiteral_Doku(), this.getDoku(), null, "doku", null, 0, 1, CSSRuleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRuleLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, CSSRuleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cssRuleSymbolEClass, CSSRuleSymbol.class, "CSSRuleSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSSRuleSymbol_Doku(), this.getDoku(), null, "doku", null, 0, 1, CSSRuleSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCSSRuleSymbol_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, CSSRuleSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CssExtDslPackageImpl
