/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fx.ide.l10n.nLSDsl.Message;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageParam;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslFactory;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter;
import org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration;
import org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes;
import org.eclipse.fx.ide.l10n.nLSDsl.RichString;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart;
import org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NLSDslPackageImpl extends EPackageImpl implements NLSDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nlsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nlsBundleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nlsFormatterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richStringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richStringLiteralStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richStringLiteralEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richStringLiteralInbetweenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richVarPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum predefinedTypesEEnum = null;

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
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NLSDslPackageImpl()
  {
    super(eNS_URI, NLSDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link NLSDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NLSDslPackage init()
  {
    if (isInited) return (NLSDslPackage)EPackage.Registry.INSTANCE.getEPackage(NLSDslPackage.eNS_URI);

    // Obtain or create and register package
    NLSDslPackageImpl theNLSDslPackage = (NLSDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NLSDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NLSDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNLSDslPackage.createPackageContents();

    // Initialize created meta-data
    theNLSDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNLSDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NLSDslPackage.eNS_URI, theNLSDslPackage);
    return theNLSDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNLS()
  {
    return nlsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNLS_Package()
  {
    return (EReference)nlsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNLS_BundleList()
  {
    return (EReference)nlsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNLSBundle()
  {
    return nlsBundleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNLSBundle_Name()
  {
    return (EAttribute)nlsBundleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNLSBundle_Lang()
  {
    return (EAttribute)nlsBundleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNLSBundle_FormatterList()
  {
    return (EReference)nlsBundleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNLSBundle_MessageEntryList()
  {
    return (EReference)nlsBundleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNLSFormatter()
  {
    return nlsFormatterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNLSFormatter_Name()
  {
    return (EAttribute)nlsFormatterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNLSFormatter_ClassRef()
  {
    return (EAttribute)nlsFormatterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageEntry()
  {
    return messageEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageEntry_Name()
  {
    return (EAttribute)messageEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageEntry_ParamList()
  {
    return (EReference)messageEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageEntry_MessageList()
  {
    return (EReference)messageEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessageEntry_EntryRef()
  {
    return (EReference)messageEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageParam()
  {
    return messageParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageParam_Predefined()
  {
    return (EAttribute)messageParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageParam_Var()
  {
    return (EAttribute)messageParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Message()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichString()
  {
    return richStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRichString_Expressions()
  {
    return (EReference)richStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichStringLiteral()
  {
    return richStringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichStringLiteral_Value()
  {
    return (EAttribute)richStringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichStringLiteralStart()
  {
    return richStringLiteralStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichStringLiteralStart_Value()
  {
    return (EAttribute)richStringLiteralStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichStringLiteralEnd()
  {
    return richStringLiteralEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichStringLiteralEnd_Value()
  {
    return (EAttribute)richStringLiteralEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichStringLiteralInbetween()
  {
    return richStringLiteralInbetweenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichStringLiteralInbetween_Value()
  {
    return (EAttribute)richStringLiteralInbetweenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichVarPart()
  {
    return richVarPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichVarPart_Key()
  {
    return (EAttribute)richVarPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichVarPart_Format()
  {
    return (EAttribute)richVarPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRichVarPart_FormatterClass()
  {
    return (EReference)richVarPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPredefinedTypes()
  {
    return predefinedTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSDslFactory getNLSDslFactory()
  {
    return (NLSDslFactory)getEFactoryInstance();
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
    nlsEClass = createEClass(NLS);
    createEReference(nlsEClass, NLS__PACKAGE);
    createEReference(nlsEClass, NLS__BUNDLE_LIST);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

    nlsBundleEClass = createEClass(NLS_BUNDLE);
    createEAttribute(nlsBundleEClass, NLS_BUNDLE__NAME);
    createEAttribute(nlsBundleEClass, NLS_BUNDLE__LANG);
    createEReference(nlsBundleEClass, NLS_BUNDLE__FORMATTER_LIST);
    createEReference(nlsBundleEClass, NLS_BUNDLE__MESSAGE_ENTRY_LIST);

    nlsFormatterEClass = createEClass(NLS_FORMATTER);
    createEAttribute(nlsFormatterEClass, NLS_FORMATTER__NAME);
    createEAttribute(nlsFormatterEClass, NLS_FORMATTER__CLASS_REF);

    messageEntryEClass = createEClass(MESSAGE_ENTRY);
    createEAttribute(messageEntryEClass, MESSAGE_ENTRY__NAME);
    createEReference(messageEntryEClass, MESSAGE_ENTRY__PARAM_LIST);
    createEReference(messageEntryEClass, MESSAGE_ENTRY__MESSAGE_LIST);
    createEReference(messageEntryEClass, MESSAGE_ENTRY__ENTRY_REF);

    messageParamEClass = createEClass(MESSAGE_PARAM);
    createEAttribute(messageParamEClass, MESSAGE_PARAM__PREDEFINED);
    createEAttribute(messageParamEClass, MESSAGE_PARAM__VAR);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__NAME);
    createEReference(messageEClass, MESSAGE__MESSAGE);

    richStringEClass = createEClass(RICH_STRING);
    createEReference(richStringEClass, RICH_STRING__EXPRESSIONS);

    richStringLiteralEClass = createEClass(RICH_STRING_LITERAL);
    createEAttribute(richStringLiteralEClass, RICH_STRING_LITERAL__VALUE);

    richStringLiteralStartEClass = createEClass(RICH_STRING_LITERAL_START);
    createEAttribute(richStringLiteralStartEClass, RICH_STRING_LITERAL_START__VALUE);

    richStringLiteralEndEClass = createEClass(RICH_STRING_LITERAL_END);
    createEAttribute(richStringLiteralEndEClass, RICH_STRING_LITERAL_END__VALUE);

    richStringLiteralInbetweenEClass = createEClass(RICH_STRING_LITERAL_INBETWEEN);
    createEAttribute(richStringLiteralInbetweenEClass, RICH_STRING_LITERAL_INBETWEEN__VALUE);

    richVarPartEClass = createEClass(RICH_VAR_PART);
    createEAttribute(richVarPartEClass, RICH_VAR_PART__KEY);
    createEAttribute(richVarPartEClass, RICH_VAR_PART__FORMAT);
    createEReference(richVarPartEClass, RICH_VAR_PART__FORMATTER_CLASS);

    // Create enums
    predefinedTypesEEnum = createEEnum(PREDEFINED_TYPES);
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

    // Initialize classes and features; add operations and parameters
    initEClass(nlsEClass, org.eclipse.fx.ide.l10n.nLSDsl.NLS.class, "NLS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNLS_Package(), this.getPackageDeclaration(), null, "package", null, 0, 1, org.eclipse.fx.ide.l10n.nLSDsl.NLS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNLS_BundleList(), this.getNLSBundle(), null, "bundleList", null, 0, -1, org.eclipse.fx.ide.l10n.nLSDsl.NLS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nlsBundleEClass, NLSBundle.class, "NLSBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNLSBundle_Name(), ecorePackage.getEString(), "name", null, 0, 1, NLSBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNLSBundle_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, NLSBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNLSBundle_FormatterList(), this.getNLSFormatter(), null, "formatterList", null, 0, -1, NLSBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNLSBundle_MessageEntryList(), this.getMessageEntry(), null, "messageEntryList", null, 0, -1, NLSBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nlsFormatterEClass, NLSFormatter.class, "NLSFormatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNLSFormatter_Name(), ecorePackage.getEString(), "name", null, 0, 1, NLSFormatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNLSFormatter_ClassRef(), ecorePackage.getEString(), "classRef", null, 0, 1, NLSFormatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEntryEClass, MessageEntry.class, "MessageEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageEntry_ParamList(), this.getMessageParam(), null, "paramList", null, 0, -1, MessageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageEntry_MessageList(), this.getMessage(), null, "messageList", null, 0, -1, MessageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessageEntry_EntryRef(), this.getMessageEntry(), null, "entryRef", null, 0, 1, MessageEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageParamEClass, MessageParam.class, "MessageParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageParam_Predefined(), this.getPredefinedTypes(), "predefined", null, 0, 1, MessageParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageParam_Var(), ecorePackage.getEString(), "var", null, 0, 1, MessageParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Message(), this.getRichString(), null, "message", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richStringEClass, RichString.class, "RichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRichString_Expressions(), ecorePackage.getEObject(), null, "expressions", null, 0, -1, RichString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richStringLiteralEClass, RichStringLiteral.class, "RichStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRichStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, RichStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richStringLiteralStartEClass, RichStringLiteralStart.class, "RichStringLiteralStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRichStringLiteralStart_Value(), ecorePackage.getEString(), "value", null, 0, 1, RichStringLiteralStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richStringLiteralEndEClass, RichStringLiteralEnd.class, "RichStringLiteralEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRichStringLiteralEnd_Value(), ecorePackage.getEString(), "value", null, 0, 1, RichStringLiteralEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richStringLiteralInbetweenEClass, RichStringLiteralInbetween.class, "RichStringLiteralInbetween", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRichStringLiteralInbetween_Value(), ecorePackage.getEString(), "value", null, 0, 1, RichStringLiteralInbetween.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(richVarPartEClass, RichVarPart.class, "RichVarPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRichVarPart_Key(), ecorePackage.getEString(), "key", null, 0, 1, RichVarPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRichVarPart_Format(), ecorePackage.getEString(), "format", null, 0, 1, RichVarPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRichVarPart_FormatterClass(), this.getNLSFormatter(), null, "formatterClass", null, 0, 1, RichVarPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(predefinedTypesEEnum, PredefinedTypes.class, "PredefinedTypes");
    addEEnumLiteral(predefinedTypesEEnum, PredefinedTypes.ANY);
    addEEnumLiteral(predefinedTypesEEnum, PredefinedTypes.NUMBER);
    addEEnumLiteral(predefinedTypesEEnum, PredefinedTypes.DATE);
    addEEnumLiteral(predefinedTypesEEnum, PredefinedTypes.TEMPORAL);

    // Create resource
    createResource(eNS_URI);
  }

} //NLSDslPackageImpl
