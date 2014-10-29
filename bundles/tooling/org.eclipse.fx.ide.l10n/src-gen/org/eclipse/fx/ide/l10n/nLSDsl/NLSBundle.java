/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NLS Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getFormatterList <em>Formatter List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getMessageEntryList <em>Message Entry List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSBundle()
 * @model
 * @generated
 */
public interface NLSBundle extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSBundle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSBundle_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

  /**
   * Returns the value of the '<em><b>Formatter List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formatter List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formatter List</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSBundle_FormatterList()
   * @model containment="true"
   * @generated
   */
  EList<NLSFormatter> getFormatterList();

  /**
   * Returns the value of the '<em><b>Message Entry List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Entry List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Entry List</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSBundle_MessageEntryList()
   * @model containment="true"
   * @generated
   */
  EList<MessageEntry> getMessageEntryList();

} // NLSBundle
