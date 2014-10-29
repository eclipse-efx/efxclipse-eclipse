/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getMessageList <em>Message List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getEntryRef <em>Entry Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageEntry()
 * @model
 * @generated
 */
public interface MessageEntry extends EObject
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
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param List</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageEntry_ParamList()
   * @model containment="true"
   * @generated
   */
  EList<MessageParam> getParamList();

  /**
   * Returns the value of the '<em><b>Message List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.l10n.nLSDsl.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message List</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageEntry_MessageList()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessageList();

  /**
   * Returns the value of the '<em><b>Entry Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Ref</em>' reference.
   * @see #setEntryRef(MessageEntry)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageEntry_EntryRef()
   * @model
   * @generated
   */
  MessageEntry getEntryRef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry#getEntryRef <em>Entry Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Ref</em>' reference.
   * @see #getEntryRef()
   * @generated
   */
  void setEntryRef(MessageEntry value);

} // MessageEntry
