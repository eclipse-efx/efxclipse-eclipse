/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Var Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormatterClass <em>Formatter Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichVarPart()
 * @model
 * @generated
 */
public interface RichVarPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichVarPart_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichVarPart_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

  /**
   * Returns the value of the '<em><b>Formatter Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formatter Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formatter Class</em>' reference.
   * @see #setFormatterClass(NLSFormatter)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichVarPart_FormatterClass()
   * @model
   * @generated
   */
  NLSFormatter getFormatterClass();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart#getFormatterClass <em>Formatter Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formatter Class</em>' reference.
   * @see #getFormatterClass()
   * @generated
   */
  void setFormatterClass(NLSFormatter value);

} // RichVarPart
