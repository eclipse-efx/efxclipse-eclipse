/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslFactory
 * @model kind="package"
 * @generated
 */
public interface CssDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cssDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/efxclipse/ide/css/CssDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cssDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssDslPackage eINSTANCE = org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl <em>stylesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getstylesheet()
   * @generated
   */
  int STYLESHEET = 0;

  /**
   * The feature id for the '<em><b>Charset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__CHARSET = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Ruleset</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__RULESET = 2;

  /**
   * The feature id for the '<em><b>Media</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__MEDIA = 3;

  /**
   * The feature id for the '<em><b>Page</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__PAGE = 4;

  /**
   * The feature id for the '<em><b>Font face</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__FONT_FACE = 5;

  /**
   * The feature id for the '<em><b>Keyframes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__KEYFRAMES = 6;

  /**
   * The number of structural features of the '<em>stylesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.charsetImpl <em>charset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.charsetImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcharset()
   * @generated
   */
  int CHARSET = 1;

  /**
   * The feature id for the '<em><b>Charset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARSET__CHARSET = 0;

  /**
   * The number of structural features of the '<em>charset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARSET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.importExpressionImpl <em>import Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.importExpressionImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getimportExpression()
   * @generated
   */
  int IMPORT_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>import Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.pageImpl <em>page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.pageImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getpage()
   * @generated
   */
  int PAGE = 3;

  /**
   * The feature id for the '<em><b>Pseudo Page</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__PSEUDO_PAGE = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.mediaImpl <em>media</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.mediaImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getmedia()
   * @generated
   */
  int MEDIA = 4;

  /**
   * The feature id for the '<em><b>Medialist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA__MEDIALIST = 0;

  /**
   * The feature id for the '<em><b>Rulesets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA__RULESETS = 1;

  /**
   * The number of structural features of the '<em>media</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.keyframesImpl <em>keyframes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.keyframesImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getkeyframes()
   * @generated
   */
  int KEYFRAMES = 6;

  /**
   * The number of structural features of the '<em>keyframes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYFRAMES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl <em>font face</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getfont_face()
   * @generated
   */
  int FONT_FACE = 5;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE__DECLARATIONS = KEYFRAMES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>font face</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE_FEATURE_COUNT = KEYFRAMES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.rulesetImpl <em>ruleset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.rulesetImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getruleset()
   * @generated
   */
  int RULESET = 7;

  /**
   * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET__SELECTORS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>ruleset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl <em>selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getselector()
   * @generated
   */
  int SELECTOR = 8;

  /**
   * The feature id for the '<em><b>Simpleselectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SIMPLESELECTORS = 0;

  /**
   * The feature id for the '<em><b>Combinator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__COMBINATOR = 1;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SELECTOR = 2;

  /**
   * The number of structural features of the '<em>selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.SimpleSelectorForNegationImpl <em>Simple Selector For Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.SimpleSelectorForNegationImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getSimpleSelectorForNegation()
   * @generated
   */
  int SIMPLE_SELECTOR_FOR_NEGATION = 9;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FOR_NEGATION__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Universal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FOR_NEGATION__UNIVERSAL = 1;

  /**
   * The feature id for the '<em><b>Sub Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FOR_NEGATION__SUB_SELECTORS = 2;

  /**
   * The number of structural features of the '<em>Simple Selector For Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FOR_NEGATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.CssSelectorImpl <em>Css Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getCssSelector()
   * @generated
   */
  int CSS_SELECTOR = 10;

  /**
   * The number of structural features of the '<em>Css Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_SELECTOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.simple_selectorImpl <em>simple selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.simple_selectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getsimple_selector()
   * @generated
   */
  int SIMPLE_SELECTOR = 11;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Universal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__UNIVERSAL = 1;

  /**
   * The feature id for the '<em><b>Sub Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__SUB_SELECTORS = 2;

  /**
   * The number of structural features of the '<em>simple selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ClassSelectorImpl <em>Class Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.ClassSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getClassSelector()
   * @generated
   */
  int CLASS_SELECTOR = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SELECTOR__NAME = CSS_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SELECTOR_FEATURE_COUNT = CSS_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ElementSelectorImpl <em>Element Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.ElementSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getElementSelector()
   * @generated
   */
  int ELEMENT_SELECTOR = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_SELECTOR__NAME = 0;

  /**
   * The number of structural features of the '<em>Element Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.UniversalSelectorImpl <em>Universal Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.UniversalSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getUniversalSelector()
   * @generated
   */
  int UNIVERSAL_SELECTOR = 14;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_SELECTOR__NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Universal Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.IdSelectorImpl <em>Id Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.IdSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getIdSelector()
   * @generated
   */
  int ID_SELECTOR = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_SELECTOR__NAME = CSS_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_SELECTOR_FEATURE_COUNT = CSS_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.css_declarationImpl <em>css declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.css_declarationImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcss_declaration()
   * @generated
   */
  int CSS_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DECLARATION__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Value Tokens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DECLARATION__VALUE_TOKENS = 1;

  /**
   * The feature id for the '<em><b>Important</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DECLARATION__IMPORTANT = 2;

  /**
   * The number of structural features of the '<em>css declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.css_propertyImpl <em>css property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.css_propertyImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcss_property()
   * @generated
   */
  int CSS_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>css property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassOrFuncImpl <em>Pseudo Class Or Func</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassOrFuncImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassOrFunc()
   * @generated
   */
  int PSEUDO_CLASS_OR_FUNC = 18;

  /**
   * The number of structural features of the '<em>Pseudo Class Or Func</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT = CSS_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassImpl <em>Pseudo Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClass()
   * @generated
   */
  int PSEUDO_CLASS = 19;

  /**
   * The number of structural features of the '<em>Pseudo Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FEATURE_COUNT = CSS_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassNameImpl <em>Pseudo Class Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassNameImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassName()
   * @generated
   */
  int PSEUDO_CLASS_NAME = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_NAME__NAME = PSEUDO_CLASS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pseudo Class Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_NAME_FEATURE_COUNT = PSEUDO_CLASS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl <em>Pseudo Class Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassFunction()
   * @generated
   */
  int PSEUDO_CLASS_FUNCTION = 21;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FUNCTION__NOT = PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR = PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FUNCTION__NAME = PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FUNCTION__PARAMS = PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Pseudo Class Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_CLASS_FUNCTION_FEATURE_COUNT = PSEUDO_CLASS_OR_FUNC_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.CssTokImpl <em>Css Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getCssTok()
   * @generated
   */
  int CSS_TOK = 22;

  /**
   * The number of structural features of the '<em>Css Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_TOK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.URLTypeImpl <em>URL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.URLTypeImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getURLType()
   * @generated
   */
  int URL_TYPE = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE__VALUE = IMPORT_EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Media List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE__MEDIA_LIST = IMPORT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE__URL = IMPORT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>URL Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE_FEATURE_COUNT = IMPORT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.AttributeSelectorImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getAttributeSelector()
   * @generated
   */
  int ATTRIBUTE_SELECTOR = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__NAME = CSS_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__OP = CSS_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR__VALUE = CSS_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SELECTOR_FEATURE_COUNT = CSS_SELECTOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.SymbolTokImpl <em>Symbol Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.SymbolTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getSymbolTok()
   * @generated
   */
  int SYMBOL_TOK = 25;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_TOK__SYMBOL = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.WSTokImpl <em>WS Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.WSTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getWSTok()
   * @generated
   */
  int WS_TOK = 26;

  /**
   * The number of structural features of the '<em>WS Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WS_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.StringTokImpl <em>String Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.StringTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getStringTok()
   * @generated
   */
  int STRING_TOK = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TOK__VALUE = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.NumberTokImpl <em>Number Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.NumberTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getNumberTok()
   * @generated
   */
  int NUMBER_TOK = 28;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TOK__VAL = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.UrlTokImpl <em>Url Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.UrlTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getUrlTok()
   * @generated
   */
  int URL_TOK = 29;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TOK__URL = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Url Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ColorTokImpl <em>Color Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.ColorTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getColorTok()
   * @generated
   */
  int COLOR_TOK = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_TOK__VALUE = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.IdentifierTokImpl <em>Identifier Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.IdentifierTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getIdentifierTok()
   * @generated
   */
  int IDENTIFIER_TOK = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TOK__NAME = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.FuncTokImpl <em>Func Tok</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.css.cssDsl.impl.FuncTokImpl
   * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getFuncTok()
   * @generated
   */
  int FUNC_TOK = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_TOK__NAME = CSS_TOK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_TOK__PARAMS = CSS_TOK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Func Tok</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_TOK_FEATURE_COUNT = CSS_TOK_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stylesheet</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet
   * @generated
   */
  EClass getstylesheet();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getCharset <em>Charset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Charset</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getCharset()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Charset();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getImports()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getRuleset <em>Ruleset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ruleset</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getRuleset()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Ruleset();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getMedia <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Media</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getMedia()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Media();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Page</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getPage()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Page();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getFont_face <em>Font face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Font face</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getFont_face()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Font_face();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.stylesheet#getKeyframes <em>Keyframes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keyframes</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.stylesheet#getKeyframes()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Keyframes();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.charset <em>charset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>charset</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.charset
   * @generated
   */
  EClass getcharset();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.charset#getCharset <em>Charset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Charset</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.charset#getCharset()
   * @see #getcharset()
   * @generated
   */
  EAttribute getcharset_Charset();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.importExpression <em>import Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>import Expression</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.importExpression
   * @generated
   */
  EClass getimportExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.importExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.importExpression#getValue()
   * @see #getimportExpression()
   * @generated
   */
  EAttribute getimportExpression_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.page <em>page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>page</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.page
   * @generated
   */
  EClass getpage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.page#getPseudoPage <em>Pseudo Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudo Page</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.page#getPseudoPage()
   * @see #getpage()
   * @generated
   */
  EAttribute getpage_PseudoPage();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.page#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.page#getDeclarations()
   * @see #getpage()
   * @generated
   */
  EReference getpage_Declarations();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.media <em>media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>media</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.media
   * @generated
   */
  EClass getmedia();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.media#getMedialist <em>Medialist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Medialist</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.media#getMedialist()
   * @see #getmedia()
   * @generated
   */
  EAttribute getmedia_Medialist();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.media#getRulesets <em>Rulesets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rulesets</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.media#getRulesets()
   * @see #getmedia()
   * @generated
   */
  EReference getmedia_Rulesets();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.font_face <em>font face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>font face</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.font_face
   * @generated
   */
  EClass getfont_face();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.font_face#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.font_face#getDeclarations()
   * @see #getfont_face()
   * @generated
   */
  EReference getfont_face_Declarations();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.keyframes <em>keyframes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>keyframes</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.keyframes
   * @generated
   */
  EClass getkeyframes();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.ruleset <em>ruleset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ruleset</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ruleset
   * @generated
   */
  EClass getruleset();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.ruleset#getSelectors <em>Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selectors</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ruleset#getSelectors()
   * @see #getruleset()
   * @generated
   */
  EReference getruleset_Selectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.ruleset#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ruleset#getDeclarations()
   * @see #getruleset()
   * @generated
   */
  EReference getruleset_Declarations();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.selector
   * @generated
   */
  EClass getselector();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.selector#getSimpleselectors <em>Simpleselectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simpleselectors</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.selector#getSimpleselectors()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Simpleselectors();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.selector#getCombinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combinator</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.selector#getCombinator()
   * @see #getselector()
   * @generated
   */
  EAttribute getselector_Combinator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.selector#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.selector#getSelector()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Selector();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation <em>Simple Selector For Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Selector For Negation</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation
   * @generated
   */
  EClass getSimpleSelectorForNegation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getElement()
   * @see #getSimpleSelectorForNegation()
   * @generated
   */
  EReference getSimpleSelectorForNegation_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getUniversal <em>Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Universal</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getUniversal()
   * @see #getSimpleSelectorForNegation()
   * @generated
   */
  EReference getSimpleSelectorForNegation_Universal();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getSubSelectors <em>Sub Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Selectors</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getSubSelectors()
   * @see #getSimpleSelectorForNegation()
   * @generated
   */
  EReference getSimpleSelectorForNegation_SubSelectors();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.CssSelector <em>Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Css Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.CssSelector
   * @generated
   */
  EClass getCssSelector();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.simple_selector
   * @generated
   */
  EClass getsimple_selector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.simple_selector#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.simple_selector#getElement()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.simple_selector#getUniversal <em>Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Universal</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.simple_selector#getUniversal()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_Universal();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.simple_selector#getSubSelectors <em>Sub Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Selectors</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.simple_selector#getSubSelectors()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_SubSelectors();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.ClassSelector <em>Class Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ClassSelector
   * @generated
   */
  EClass getClassSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.ClassSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ClassSelector#getName()
   * @see #getClassSelector()
   * @generated
   */
  EAttribute getClassSelector_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.ElementSelector <em>Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ElementSelector
   * @generated
   */
  EClass getElementSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.ElementSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ElementSelector#getName()
   * @see #getElementSelector()
   * @generated
   */
  EAttribute getElementSelector_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.UniversalSelector <em>Universal Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Universal Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.UniversalSelector
   * @generated
   */
  EClass getUniversalSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.UniversalSelector#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.UniversalSelector#getNamespace()
   * @see #getUniversalSelector()
   * @generated
   */
  EAttribute getUniversalSelector_Namespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.IdSelector <em>Id Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.IdSelector
   * @generated
   */
  EClass getIdSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.IdSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.IdSelector#getName()
   * @see #getIdSelector()
   * @generated
   */
  EAttribute getIdSelector_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration <em>css declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css declaration</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_declaration
   * @generated
   */
  EClass getcss_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_declaration#getProperty()
   * @see #getcss_declaration()
   * @generated
   */
  EReference getcss_declaration_Property();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#getValueTokens <em>Value Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value Tokens</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_declaration#getValueTokens()
   * @see #getcss_declaration()
   * @generated
   */
  EReference getcss_declaration_ValueTokens();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#isImportant <em>Important</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Important</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_declaration#isImportant()
   * @see #getcss_declaration()
   * @generated
   */
  EAttribute getcss_declaration_Important();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.css_property <em>css property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css property</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_property
   * @generated
   */
  EClass getcss_property();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.css_property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.css_property#getName()
   * @see #getcss_property()
   * @generated
   */
  EAttribute getcss_property_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassOrFunc <em>Pseudo Class Or Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Class Or Func</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassOrFunc
   * @generated
   */
  EClass getPseudoClassOrFunc();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClass <em>Pseudo Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Class</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClass
   * @generated
   */
  EClass getPseudoClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassName <em>Pseudo Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Class Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassName
   * @generated
   */
  EClass getPseudoClassName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassName#getName()
   * @see #getPseudoClassName()
   * @generated
   */
  EAttribute getPseudoClassName_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction <em>Pseudo Class Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudo Class Function</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction
   * @generated
   */
  EClass getPseudoClassFunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#isNot()
   * @see #getPseudoClassFunction()
   * @generated
   */
  EAttribute getPseudoClassFunction_Not();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getParamSelector <em>Param Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getParamSelector()
   * @see #getPseudoClassFunction()
   * @generated
   */
  EReference getPseudoClassFunction_ParamSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getName()
   * @see #getPseudoClassFunction()
   * @generated
   */
  EAttribute getPseudoClassFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction#getParams()
   * @see #getPseudoClassFunction()
   * @generated
   */
  EReference getPseudoClassFunction_Params();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.CssTok <em>Css Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Css Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.CssTok
   * @generated
   */
  EClass getCssTok();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.URLType <em>URL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL Type</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.URLType
   * @generated
   */
  EClass getURLType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.URLType#getMediaList <em>Media List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Media List</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.URLType#getMediaList()
   * @see #getURLType()
   * @generated
   */
  EAttribute getURLType_MediaList();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.URLType#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.URLType#getUrl()
   * @see #getURLType()
   * @generated
   */
  EAttribute getURLType_Url();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.AttributeSelector <em>Attribute Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Selector</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.AttributeSelector
   * @generated
   */
  EClass getAttributeSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getName()
   * @see #getAttributeSelector()
   * @generated
   */
  EAttribute getAttributeSelector_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getOp()
   * @see #getAttributeSelector()
   * @generated
   */
  EAttribute getAttributeSelector_Op();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.AttributeSelector#getValue()
   * @see #getAttributeSelector()
   * @generated
   */
  EAttribute getAttributeSelector_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.SymbolTok <em>Symbol Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SymbolTok
   * @generated
   */
  EClass getSymbolTok();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.SymbolTok#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.SymbolTok#getSymbol()
   * @see #getSymbolTok()
   * @generated
   */
  EAttribute getSymbolTok_Symbol();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.WSTok <em>WS Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WS Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.WSTok
   * @generated
   */
  EClass getWSTok();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.StringTok <em>String Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.StringTok
   * @generated
   */
  EClass getStringTok();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.StringTok#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.StringTok#getValue()
   * @see #getStringTok()
   * @generated
   */
  EAttribute getStringTok_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.NumberTok <em>Number Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.NumberTok
   * @generated
   */
  EClass getNumberTok();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.NumberTok#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.NumberTok#getVal()
   * @see #getNumberTok()
   * @generated
   */
  EAttribute getNumberTok_Val();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.UrlTok <em>Url Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.UrlTok
   * @generated
   */
  EClass getUrlTok();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.UrlTok#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.UrlTok#getUrl()
   * @see #getUrlTok()
   * @generated
   */
  EReference getUrlTok_Url();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.ColorTok <em>Color Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ColorTok
   * @generated
   */
  EClass getColorTok();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.ColorTok#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.ColorTok#getValue()
   * @see #getColorTok()
   * @generated
   */
  EAttribute getColorTok_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.IdentifierTok <em>Identifier Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.IdentifierTok
   * @generated
   */
  EClass getIdentifierTok();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.css.cssDsl.IdentifierTok#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.IdentifierTok#getName()
   * @see #getIdentifierTok()
   * @generated
   */
  EAttribute getIdentifierTok_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.css.cssDsl.FuncTok <em>Func Tok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Tok</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.FuncTok
   * @generated
   */
  EClass getFuncTok();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.css.cssDsl.FuncTok#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.FuncTok#getName()
   * @see #getFuncTok()
   * @generated
   */
  EReference getFuncTok_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.css.cssDsl.FuncTok#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.fx.ide.css.cssDsl.FuncTok#getParams()
   * @see #getFuncTok()
   * @generated
   */
  EReference getFuncTok_Params();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssDslFactory getCssDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl <em>stylesheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getstylesheet()
     * @generated
     */
    EClass STYLESHEET = eINSTANCE.getstylesheet();

    /**
     * The meta object literal for the '<em><b>Charset</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__CHARSET = eINSTANCE.getstylesheet_Charset();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__IMPORTS = eINSTANCE.getstylesheet_Imports();

    /**
     * The meta object literal for the '<em><b>Ruleset</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__RULESET = eINSTANCE.getstylesheet_Ruleset();

    /**
     * The meta object literal for the '<em><b>Media</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__MEDIA = eINSTANCE.getstylesheet_Media();

    /**
     * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__PAGE = eINSTANCE.getstylesheet_Page();

    /**
     * The meta object literal for the '<em><b>Font face</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__FONT_FACE = eINSTANCE.getstylesheet_Font_face();

    /**
     * The meta object literal for the '<em><b>Keyframes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__KEYFRAMES = eINSTANCE.getstylesheet_Keyframes();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.charsetImpl <em>charset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.charsetImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcharset()
     * @generated
     */
    EClass CHARSET = eINSTANCE.getcharset();

    /**
     * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARSET__CHARSET = eINSTANCE.getcharset_Charset();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.importExpressionImpl <em>import Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.importExpressionImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getimportExpression()
     * @generated
     */
    EClass IMPORT_EXPRESSION = eINSTANCE.getimportExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_EXPRESSION__VALUE = eINSTANCE.getimportExpression_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.pageImpl <em>page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.pageImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getpage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getpage();

    /**
     * The meta object literal for the '<em><b>Pseudo Page</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__PSEUDO_PAGE = eINSTANCE.getpage_PseudoPage();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__DECLARATIONS = eINSTANCE.getpage_Declarations();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.mediaImpl <em>media</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.mediaImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getmedia()
     * @generated
     */
    EClass MEDIA = eINSTANCE.getmedia();

    /**
     * The meta object literal for the '<em><b>Medialist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA__MEDIALIST = eINSTANCE.getmedia_Medialist();

    /**
     * The meta object literal for the '<em><b>Rulesets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA__RULESETS = eINSTANCE.getmedia_Rulesets();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl <em>font face</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getfont_face()
     * @generated
     */
    EClass FONT_FACE = eINSTANCE.getfont_face();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_FACE__DECLARATIONS = eINSTANCE.getfont_face_Declarations();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.keyframesImpl <em>keyframes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.keyframesImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getkeyframes()
     * @generated
     */
    EClass KEYFRAMES = eINSTANCE.getkeyframes();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.rulesetImpl <em>ruleset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.rulesetImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getruleset()
     * @generated
     */
    EClass RULESET = eINSTANCE.getruleset();

    /**
     * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULESET__SELECTORS = eINSTANCE.getruleset_Selectors();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULESET__DECLARATIONS = eINSTANCE.getruleset_Declarations();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl <em>selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getselector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getselector();

    /**
     * The meta object literal for the '<em><b>Simpleselectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SIMPLESELECTORS = eINSTANCE.getselector_Simpleselectors();

    /**
     * The meta object literal for the '<em><b>Combinator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__COMBINATOR = eINSTANCE.getselector_Combinator();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SELECTOR = eINSTANCE.getselector_Selector();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.SimpleSelectorForNegationImpl <em>Simple Selector For Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.SimpleSelectorForNegationImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getSimpleSelectorForNegation()
     * @generated
     */
    EClass SIMPLE_SELECTOR_FOR_NEGATION = eINSTANCE.getSimpleSelectorForNegation();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR_FOR_NEGATION__ELEMENT = eINSTANCE.getSimpleSelectorForNegation_Element();

    /**
     * The meta object literal for the '<em><b>Universal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR_FOR_NEGATION__UNIVERSAL = eINSTANCE.getSimpleSelectorForNegation_Universal();

    /**
     * The meta object literal for the '<em><b>Sub Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR_FOR_NEGATION__SUB_SELECTORS = eINSTANCE.getSimpleSelectorForNegation_SubSelectors();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.CssSelectorImpl <em>Css Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getCssSelector()
     * @generated
     */
    EClass CSS_SELECTOR = eINSTANCE.getCssSelector();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.simple_selectorImpl <em>simple selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.simple_selectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getsimple_selector()
     * @generated
     */
    EClass SIMPLE_SELECTOR = eINSTANCE.getsimple_selector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__ELEMENT = eINSTANCE.getsimple_selector_Element();

    /**
     * The meta object literal for the '<em><b>Universal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__UNIVERSAL = eINSTANCE.getsimple_selector_Universal();

    /**
     * The meta object literal for the '<em><b>Sub Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__SUB_SELECTORS = eINSTANCE.getsimple_selector_SubSelectors();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ClassSelectorImpl <em>Class Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.ClassSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getClassSelector()
     * @generated
     */
    EClass CLASS_SELECTOR = eINSTANCE.getClassSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_SELECTOR__NAME = eINSTANCE.getClassSelector_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ElementSelectorImpl <em>Element Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.ElementSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getElementSelector()
     * @generated
     */
    EClass ELEMENT_SELECTOR = eINSTANCE.getElementSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_SELECTOR__NAME = eINSTANCE.getElementSelector_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.UniversalSelectorImpl <em>Universal Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.UniversalSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getUniversalSelector()
     * @generated
     */
    EClass UNIVERSAL_SELECTOR = eINSTANCE.getUniversalSelector();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIVERSAL_SELECTOR__NAMESPACE = eINSTANCE.getUniversalSelector_Namespace();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.IdSelectorImpl <em>Id Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.IdSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getIdSelector()
     * @generated
     */
    EClass ID_SELECTOR = eINSTANCE.getIdSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_SELECTOR__NAME = eINSTANCE.getIdSelector_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.css_declarationImpl <em>css declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.css_declarationImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcss_declaration()
     * @generated
     */
    EClass CSS_DECLARATION = eINSTANCE.getcss_declaration();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_DECLARATION__PROPERTY = eINSTANCE.getcss_declaration_Property();

    /**
     * The meta object literal for the '<em><b>Value Tokens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_DECLARATION__VALUE_TOKENS = eINSTANCE.getcss_declaration_ValueTokens();

    /**
     * The meta object literal for the '<em><b>Important</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_DECLARATION__IMPORTANT = eINSTANCE.getcss_declaration_Important();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.css_propertyImpl <em>css property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.css_propertyImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getcss_property()
     * @generated
     */
    EClass CSS_PROPERTY = eINSTANCE.getcss_property();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_PROPERTY__NAME = eINSTANCE.getcss_property_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassOrFuncImpl <em>Pseudo Class Or Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassOrFuncImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassOrFunc()
     * @generated
     */
    EClass PSEUDO_CLASS_OR_FUNC = eINSTANCE.getPseudoClassOrFunc();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassImpl <em>Pseudo Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClass()
     * @generated
     */
    EClass PSEUDO_CLASS = eINSTANCE.getPseudoClass();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassNameImpl <em>Pseudo Class Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassNameImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassName()
     * @generated
     */
    EClass PSEUDO_CLASS_NAME = eINSTANCE.getPseudoClassName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_CLASS_NAME__NAME = eINSTANCE.getPseudoClassName_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl <em>Pseudo Class Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getPseudoClassFunction()
     * @generated
     */
    EClass PSEUDO_CLASS_FUNCTION = eINSTANCE.getPseudoClassFunction();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_CLASS_FUNCTION__NOT = eINSTANCE.getPseudoClassFunction_Not();

    /**
     * The meta object literal for the '<em><b>Param Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR = eINSTANCE.getPseudoClassFunction_ParamSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO_CLASS_FUNCTION__NAME = eINSTANCE.getPseudoClassFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDO_CLASS_FUNCTION__PARAMS = eINSTANCE.getPseudoClassFunction_Params();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.CssTokImpl <em>Css Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getCssTok()
     * @generated
     */
    EClass CSS_TOK = eINSTANCE.getCssTok();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.URLTypeImpl <em>URL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.URLTypeImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getURLType()
     * @generated
     */
    EClass URL_TYPE = eINSTANCE.getURLType();

    /**
     * The meta object literal for the '<em><b>Media List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_TYPE__MEDIA_LIST = eINSTANCE.getURLType_MediaList();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_TYPE__URL = eINSTANCE.getURLType_Url();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.AttributeSelectorImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getAttributeSelector()
     * @generated
     */
    EClass ATTRIBUTE_SELECTOR = eINSTANCE.getAttributeSelector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_SELECTOR__NAME = eINSTANCE.getAttributeSelector_Name();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_SELECTOR__OP = eINSTANCE.getAttributeSelector_Op();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_SELECTOR__VALUE = eINSTANCE.getAttributeSelector_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.SymbolTokImpl <em>Symbol Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.SymbolTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getSymbolTok()
     * @generated
     */
    EClass SYMBOL_TOK = eINSTANCE.getSymbolTok();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_TOK__SYMBOL = eINSTANCE.getSymbolTok_Symbol();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.WSTokImpl <em>WS Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.WSTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getWSTok()
     * @generated
     */
    EClass WS_TOK = eINSTANCE.getWSTok();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.StringTokImpl <em>String Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.StringTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getStringTok()
     * @generated
     */
    EClass STRING_TOK = eINSTANCE.getStringTok();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TOK__VALUE = eINSTANCE.getStringTok_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.NumberTokImpl <em>Number Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.NumberTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getNumberTok()
     * @generated
     */
    EClass NUMBER_TOK = eINSTANCE.getNumberTok();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_TOK__VAL = eINSTANCE.getNumberTok_Val();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.UrlTokImpl <em>Url Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.UrlTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getUrlTok()
     * @generated
     */
    EClass URL_TOK = eINSTANCE.getUrlTok();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_TOK__URL = eINSTANCE.getUrlTok_Url();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.ColorTokImpl <em>Color Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.ColorTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getColorTok()
     * @generated
     */
    EClass COLOR_TOK = eINSTANCE.getColorTok();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_TOK__VALUE = eINSTANCE.getColorTok_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.IdentifierTokImpl <em>Identifier Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.IdentifierTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getIdentifierTok()
     * @generated
     */
    EClass IDENTIFIER_TOK = eINSTANCE.getIdentifierTok();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_TOK__NAME = eINSTANCE.getIdentifierTok_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.css.cssDsl.impl.FuncTokImpl <em>Func Tok</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.css.cssDsl.impl.FuncTokImpl
     * @see org.eclipse.fx.ide.css.cssDsl.impl.CssDslPackageImpl#getFuncTok()
     * @generated
     */
    EClass FUNC_TOK = eINSTANCE.getFuncTok();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_TOK__NAME = eINSTANCE.getFuncTok_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_TOK__PARAMS = eINSTANCE.getFuncTok_Params();

  }

} //CssDslPackage
