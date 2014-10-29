/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage
 * @generated
 */
public interface NLSDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NLSDslFactory eINSTANCE = org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>NLS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NLS</em>'.
   * @generated
   */
  NLS createNLS();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>NLS Bundle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NLS Bundle</em>'.
   * @generated
   */
  NLSBundle createNLSBundle();

  /**
   * Returns a new object of class '<em>NLS Formatter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NLS Formatter</em>'.
   * @generated
   */
  NLSFormatter createNLSFormatter();

  /**
   * Returns a new object of class '<em>Message Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Entry</em>'.
   * @generated
   */
  MessageEntry createMessageEntry();

  /**
   * Returns a new object of class '<em>Message Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Param</em>'.
   * @generated
   */
  MessageParam createMessageParam();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Rich String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich String</em>'.
   * @generated
   */
  RichString createRichString();

  /**
   * Returns a new object of class '<em>Rich String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich String Literal</em>'.
   * @generated
   */
  RichStringLiteral createRichStringLiteral();

  /**
   * Returns a new object of class '<em>Rich String Literal Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich String Literal Start</em>'.
   * @generated
   */
  RichStringLiteralStart createRichStringLiteralStart();

  /**
   * Returns a new object of class '<em>Rich String Literal End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich String Literal End</em>'.
   * @generated
   */
  RichStringLiteralEnd createRichStringLiteralEnd();

  /**
   * Returns a new object of class '<em>Rich String Literal Inbetween</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich String Literal Inbetween</em>'.
   * @generated
   */
  RichStringLiteralInbetween createRichStringLiteralInbetween();

  /**
   * Returns a new object of class '<em>Rich Var Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich Var Part</em>'.
   * @generated
   */
  RichVarPart createRichVarPart();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NLSDslPackage getNLSDslPackage();

} //NLSDslFactory
