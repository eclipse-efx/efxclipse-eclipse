/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslFactory
 * @model kind="package"
 * @generated
 */
public interface NLSDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nLSDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/fx/ide/l10n/NLSDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "nLSDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NLSDslPackage eINSTANCE = org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl <em>NLS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLS()
   * @generated
   */
  int NLS = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Bundle List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS__BUNDLE_LIST = 1;

  /**
   * The number of structural features of the '<em>NLS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.PackageDeclarationImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl <em>NLS Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLSBundle()
   * @generated
   */
  int NLS_BUNDLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_BUNDLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_BUNDLE__LANG = 1;

  /**
   * The feature id for the '<em><b>Formatter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_BUNDLE__FORMATTER_LIST = 2;

  /**
   * The feature id for the '<em><b>Message Entry List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_BUNDLE__MESSAGE_ENTRY_LIST = 3;

  /**
   * The number of structural features of the '<em>NLS Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_BUNDLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl <em>NLS Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLSFormatter()
   * @generated
   */
  int NLS_FORMATTER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_FORMATTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_FORMATTER__CLASS_REF = 1;

  /**
   * The number of structural features of the '<em>NLS Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NLS_FORMATTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl <em>Message Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessageEntry()
   * @generated
   */
  int MESSAGE_ENTRY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Param List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ENTRY__PARAM_LIST = 1;

  /**
   * The feature id for the '<em><b>Message List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ENTRY__MESSAGE_LIST = 2;

  /**
   * The feature id for the '<em><b>Entry Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ENTRY__ENTRY_REF = 3;

  /**
   * The number of structural features of the '<em>Message Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ENTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl <em>Message Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessageParam()
   * @generated
   */
  int MESSAGE_PARAM = 5;

  /**
   * The feature id for the '<em><b>Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAM__PREDEFINED = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAM__VAR = 1;

  /**
   * The number of structural features of the '<em>Message Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__MESSAGE = 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringImpl <em>Rich String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichString()
   * @generated
   */
  int RICH_STRING = 7;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Rich String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteral()
   * @generated
   */
  int RICH_STRING_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Rich String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralStartImpl <em>Rich String Literal Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralStartImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralStart()
   * @generated
   */
  int RICH_STRING_LITERAL_START = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_START__VALUE = 0;

  /**
   * The number of structural features of the '<em>Rich String Literal Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralEndImpl <em>Rich String Literal End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralEndImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralEnd()
   * @generated
   */
  int RICH_STRING_LITERAL_END = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_END__VALUE = 0;

  /**
   * The number of structural features of the '<em>Rich String Literal End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_END_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralInbetweenImpl <em>Rich String Literal Inbetween</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralInbetweenImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralInbetween()
   * @generated
   */
  int RICH_STRING_LITERAL_INBETWEEN = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_INBETWEEN__VALUE = 0;

  /**
   * The number of structural features of the '<em>Rich String Literal Inbetween</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_INBETWEEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl <em>Rich Var Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichVarPart()
   * @generated
   */
  int RICH_VAR_PART = 12;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_VAR_PART__KEY = 0;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_VAR_PART__FORMAT = 1;

  /**
   * The feature id for the '<em><b>Formatter Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_VAR_PART__FORMATTER_CLASS = 2;

  /**
   * The number of structural features of the '<em>Rich Var Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_VAR_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes <em>Predefined Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes
   * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getPredefinedTypes()
   * @generated
   */
  int PREDEFINED_TYPES = 13;


  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS <em>NLS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NLS</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLS
   * @generated
   */
  EClass getNLS();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLS#getPackage()
   * @see #getNLS()
   * @generated
   */
  EReference getNLS_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS#getBundleList <em>Bundle List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bundle List</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLS#getBundleList()
   * @see #getNLS()
   * @generated
   */
  EReference getNLS_BundleList();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle <em>NLS Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NLS Bundle</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle
   * @generated
   */
  EClass getNLSBundle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getName()
   * @see #getNLSBundle()
   * @generated
   */
  EAttribute getNLSBundle_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getLang()
   * @see #getNLSBundle()
   * @generated
   */
  EAttribute getNLSBundle_Lang();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getFormatterList <em>Formatter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formatter List</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getFormatterList()
   * @see #getNLSBundle()
   * @generated
   */
  EReference getNLSBundle_FormatterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getMessageEntryList <em>Message Entry List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Entry List</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getMessageEntryList()
   * @see #getNLSBundle()
   * @generated
   */
  EReference getNLSBundle_MessageEntryList();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter <em>NLS Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NLS Formatter</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter
   * @generated
   */
  EClass getNLSFormatter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getName()
   * @see #getNLSFormatter()
   * @generated
   */
  EAttribute getNLSFormatter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Ref</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getClassRef()
   * @see #getNLSFormatter()
   * @generated
   */
  EAttribute getNLSFormatter_ClassRef();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry <em>Message Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Entry</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry
   * @generated
   */
  EClass getMessageEntry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getName()
   * @see #getMessageEntry()
   * @generated
   */
  EAttribute getMessageEntry_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getParamList <em>Param List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param List</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getParamList()
   * @see #getMessageEntry()
   * @generated
   */
  EReference getMessageEntry_ParamList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getMessageList <em>Message List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message List</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getMessageList()
   * @see #getMessageEntry()
   * @generated
   */
  EReference getMessageEntry_MessageList();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getEntryRef <em>Entry Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entry Ref</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getEntryRef()
   * @see #getMessageEntry()
   * @generated
   */
  EReference getMessageEntry_EntryRef();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam <em>Message Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Param</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageParam
   * @generated
   */
  EClass getMessageParam();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getPredefined <em>Predefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Predefined</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getPredefined()
   * @see #getMessageParam()
   * @generated
   */
  EAttribute getMessageParam_Predefined();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getVar()
   * @see #getMessageParam()
   * @generated
   */
  EAttribute getMessageParam_Var();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.l10n.nLSDsl.Message#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.Message#getMessage()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Message();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichString <em>Rich String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichString
   * @generated
   */
  EClass getRichString();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichString#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichString#getExpressions()
   * @see #getRichString()
   * @generated
   */
  EReference getRichString_Expressions();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral <em>Rich String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String Literal</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral
   * @generated
   */
  EClass getRichStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral#getValue()
   * @see #getRichStringLiteral()
   * @generated
   */
  EAttribute getRichStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart <em>Rich String Literal Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String Literal Start</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart
   * @generated
   */
  EClass getRichStringLiteralStart();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart#getValue()
   * @see #getRichStringLiteralStart()
   * @generated
   */
  EAttribute getRichStringLiteralStart_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd <em>Rich String Literal End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String Literal End</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd
   * @generated
   */
  EClass getRichStringLiteralEnd();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd#getValue()
   * @see #getRichStringLiteralEnd()
   * @generated
   */
  EAttribute getRichStringLiteralEnd_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween <em>Rich String Literal Inbetween</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String Literal Inbetween</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween
   * @generated
   */
  EClass getRichStringLiteralInbetween();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween#getValue()
   * @see #getRichStringLiteralInbetween()
   * @generated
   */
  EAttribute getRichStringLiteralInbetween_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart <em>Rich Var Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich Var Part</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart
   * @generated
   */
  EClass getRichVarPart();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getKey()
   * @see #getRichVarPart()
   * @generated
   */
  EAttribute getRichVarPart_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormat()
   * @see #getRichVarPart()
   * @generated
   */
  EAttribute getRichVarPart_Format();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormatterClass <em>Formatter Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Formatter Class</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormatterClass()
   * @see #getRichVarPart()
   * @generated
   */
  EReference getRichVarPart_FormatterClass();

  /**
   * Returns the meta object for enum '{@link org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes <em>Predefined Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Predefined Types</em>'.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes
   * @generated
   */
  EEnum getPredefinedTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NLSDslFactory getNLSDslFactory();

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
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl <em>NLS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLS()
     * @generated
     */
    EClass NLS = eINSTANCE.getNLS();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NLS__PACKAGE = eINSTANCE.getNLS_Package();

    /**
     * The meta object literal for the '<em><b>Bundle List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NLS__BUNDLE_LIST = eINSTANCE.getNLS_BundleList();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.PackageDeclarationImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl <em>NLS Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLSBundle()
     * @generated
     */
    EClass NLS_BUNDLE = eINSTANCE.getNLSBundle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLS_BUNDLE__NAME = eINSTANCE.getNLSBundle_Name();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLS_BUNDLE__LANG = eINSTANCE.getNLSBundle_Lang();

    /**
     * The meta object literal for the '<em><b>Formatter List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NLS_BUNDLE__FORMATTER_LIST = eINSTANCE.getNLSBundle_FormatterList();

    /**
     * The meta object literal for the '<em><b>Message Entry List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NLS_BUNDLE__MESSAGE_ENTRY_LIST = eINSTANCE.getNLSBundle_MessageEntryList();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl <em>NLS Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getNLSFormatter()
     * @generated
     */
    EClass NLS_FORMATTER = eINSTANCE.getNLSFormatter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLS_FORMATTER__NAME = eINSTANCE.getNLSFormatter_Name();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NLS_FORMATTER__CLASS_REF = eINSTANCE.getNLSFormatter_ClassRef();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl <em>Message Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessageEntry()
     * @generated
     */
    EClass MESSAGE_ENTRY = eINSTANCE.getMessageEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_ENTRY__NAME = eINSTANCE.getMessageEntry_Name();

    /**
     * The meta object literal for the '<em><b>Param List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_ENTRY__PARAM_LIST = eINSTANCE.getMessageEntry_ParamList();

    /**
     * The meta object literal for the '<em><b>Message List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_ENTRY__MESSAGE_LIST = eINSTANCE.getMessageEntry_MessageList();

    /**
     * The meta object literal for the '<em><b>Entry Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_ENTRY__ENTRY_REF = eINSTANCE.getMessageEntry_EntryRef();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl <em>Message Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessageParam()
     * @generated
     */
    EClass MESSAGE_PARAM = eINSTANCE.getMessageParam();

    /**
     * The meta object literal for the '<em><b>Predefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_PARAM__PREDEFINED = eINSTANCE.getMessageParam_Predefined();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_PARAM__VAR = eINSTANCE.getMessageParam_Var();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringImpl <em>Rich String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichString()
     * @generated
     */
    EClass RICH_STRING = eINSTANCE.getRichString();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RICH_STRING__EXPRESSIONS = eINSTANCE.getRichString_Expressions();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteral()
     * @generated
     */
    EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_STRING_LITERAL__VALUE = eINSTANCE.getRichStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralStartImpl <em>Rich String Literal Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralStartImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralStart()
     * @generated
     */
    EClass RICH_STRING_LITERAL_START = eINSTANCE.getRichStringLiteralStart();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_STRING_LITERAL_START__VALUE = eINSTANCE.getRichStringLiteralStart_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralEndImpl <em>Rich String Literal End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralEndImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralEnd()
     * @generated
     */
    EClass RICH_STRING_LITERAL_END = eINSTANCE.getRichStringLiteralEnd();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_STRING_LITERAL_END__VALUE = eINSTANCE.getRichStringLiteralEnd_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralInbetweenImpl <em>Rich String Literal Inbetween</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichStringLiteralInbetweenImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichStringLiteralInbetween()
     * @generated
     */
    EClass RICH_STRING_LITERAL_INBETWEEN = eINSTANCE.getRichStringLiteralInbetween();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_STRING_LITERAL_INBETWEEN__VALUE = eINSTANCE.getRichStringLiteralInbetween_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl <em>Rich Var Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getRichVarPart()
     * @generated
     */
    EClass RICH_VAR_PART = eINSTANCE.getRichVarPart();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_VAR_PART__KEY = eINSTANCE.getRichVarPart_Key();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RICH_VAR_PART__FORMAT = eINSTANCE.getRichVarPart_Format();

    /**
     * The meta object literal for the '<em><b>Formatter Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RICH_VAR_PART__FORMATTER_CLASS = eINSTANCE.getRichVarPart_FormatterClass();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes <em>Predefined Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes
     * @see org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslPackageImpl#getPredefinedTypes()
     * @generated
     */
    EEnum PREDEFINED_TYPES = eINSTANCE.getPredefinedTypes();

  }

} //NLSDslPackage
