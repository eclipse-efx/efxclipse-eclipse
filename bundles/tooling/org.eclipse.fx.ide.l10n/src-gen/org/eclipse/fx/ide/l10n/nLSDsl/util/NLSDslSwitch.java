/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fx.ide.l10n.nLSDsl.*;

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
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage
 * @generated
 */
public class NLSDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NLSDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NLSDslPackage.eINSTANCE;
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
      case NLSDslPackage.NLS:
      {
        NLS nls = (NLS)theEObject;
        T result = caseNLS(nls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.NLS_BUNDLE:
      {
        NLSBundle nlsBundle = (NLSBundle)theEObject;
        T result = caseNLSBundle(nlsBundle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.NLS_FORMATTER:
      {
        NLSFormatter nlsFormatter = (NLSFormatter)theEObject;
        T result = caseNLSFormatter(nlsFormatter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.MESSAGE_ENTRY:
      {
        MessageEntry messageEntry = (MessageEntry)theEObject;
        T result = caseMessageEntry(messageEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.MESSAGE_PARAM:
      {
        MessageParam messageParam = (MessageParam)theEObject;
        T result = caseMessageParam(messageParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_STRING:
      {
        RichString richString = (RichString)theEObject;
        T result = caseRichString(richString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_STRING_LITERAL:
      {
        RichStringLiteral richStringLiteral = (RichStringLiteral)theEObject;
        T result = caseRichStringLiteral(richStringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_STRING_LITERAL_START:
      {
        RichStringLiteralStart richStringLiteralStart = (RichStringLiteralStart)theEObject;
        T result = caseRichStringLiteralStart(richStringLiteralStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_STRING_LITERAL_END:
      {
        RichStringLiteralEnd richStringLiteralEnd = (RichStringLiteralEnd)theEObject;
        T result = caseRichStringLiteralEnd(richStringLiteralEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_STRING_LITERAL_INBETWEEN:
      {
        RichStringLiteralInbetween richStringLiteralInbetween = (RichStringLiteralInbetween)theEObject;
        T result = caseRichStringLiteralInbetween(richStringLiteralInbetween);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NLSDslPackage.RICH_VAR_PART:
      {
        RichVarPart richVarPart = (RichVarPart)theEObject;
        T result = caseRichVarPart(richVarPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NLS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NLS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNLS(NLS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NLS Bundle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NLS Bundle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNLSBundle(NLSBundle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NLS Formatter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NLS Formatter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNLSFormatter(NLSFormatter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageEntry(MessageEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageParam(MessageParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichString(RichString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringLiteral(RichStringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Literal Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Literal Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringLiteralStart(RichStringLiteralStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Literal End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Literal End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringLiteralEnd(RichStringLiteralEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich String Literal Inbetween</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich String Literal Inbetween</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichStringLiteralInbetween(RichStringLiteralInbetween object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich Var Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich Var Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichVarPart(RichVarPart object)
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

} //NLSDslSwitch
