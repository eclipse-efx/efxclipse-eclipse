/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fx.ide.l10n.nLSDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NLSDslFactoryImpl extends EFactoryImpl implements NLSDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NLSDslFactory init()
  {
    try
    {
      NLSDslFactory theNLSDslFactory = (NLSDslFactory)EPackage.Registry.INSTANCE.getEFactory(NLSDslPackage.eNS_URI);
      if (theNLSDslFactory != null)
      {
        return theNLSDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NLSDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSDslFactoryImpl()
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
      case NLSDslPackage.NLS: return createNLS();
      case NLSDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case NLSDslPackage.NLS_BUNDLE: return createNLSBundle();
      case NLSDslPackage.NLS_FORMATTER: return createNLSFormatter();
      case NLSDslPackage.MESSAGE_ENTRY: return createMessageEntry();
      case NLSDslPackage.MESSAGE_PARAM: return createMessageParam();
      case NLSDslPackage.MESSAGE: return createMessage();
      case NLSDslPackage.RICH_STRING: return createRichString();
      case NLSDslPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
      case NLSDslPackage.RICH_STRING_LITERAL_START: return createRichStringLiteralStart();
      case NLSDslPackage.RICH_STRING_LITERAL_END: return createRichStringLiteralEnd();
      case NLSDslPackage.RICH_STRING_LITERAL_INBETWEEN: return createRichStringLiteralInbetween();
      case NLSDslPackage.RICH_VAR_PART: return createRichVarPart();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NLSDslPackage.PREDEFINED_TYPES:
        return createPredefinedTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NLSDslPackage.PREDEFINED_TYPES:
        return convertPredefinedTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLS createNLS()
  {
    NLSImpl nls = new NLSImpl();
    return nls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSBundle createNLSBundle()
  {
    NLSBundleImpl nlsBundle = new NLSBundleImpl();
    return nlsBundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSFormatter createNLSFormatter()
  {
    NLSFormatterImpl nlsFormatter = new NLSFormatterImpl();
    return nlsFormatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageEntry createMessageEntry()
  {
    MessageEntryImpl messageEntry = new MessageEntryImpl();
    return messageEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageParam createMessageParam()
  {
    MessageParamImpl messageParam = new MessageParamImpl();
    return messageParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString createRichString()
  {
    RichStringImpl richString = new RichStringImpl();
    return richString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteral createRichStringLiteral()
  {
    RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
    return richStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteralStart createRichStringLiteralStart()
  {
    RichStringLiteralStartImpl richStringLiteralStart = new RichStringLiteralStartImpl();
    return richStringLiteralStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteralEnd createRichStringLiteralEnd()
  {
    RichStringLiteralEndImpl richStringLiteralEnd = new RichStringLiteralEndImpl();
    return richStringLiteralEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteralInbetween createRichStringLiteralInbetween()
  {
    RichStringLiteralInbetweenImpl richStringLiteralInbetween = new RichStringLiteralInbetweenImpl();
    return richStringLiteralInbetween;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichVarPart createRichVarPart()
  {
    RichVarPartImpl richVarPart = new RichVarPartImpl();
    return richVarPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredefinedTypes createPredefinedTypesFromString(EDataType eDataType, String initialValue)
  {
    PredefinedTypes result = PredefinedTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPredefinedTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSDslPackage getNLSDslPackage()
  {
    return (NLSDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NLSDslPackage getPackage()
  {
    return NLSDslPackage.eINSTANCE;
  }

} //NLSDslFactoryImpl
