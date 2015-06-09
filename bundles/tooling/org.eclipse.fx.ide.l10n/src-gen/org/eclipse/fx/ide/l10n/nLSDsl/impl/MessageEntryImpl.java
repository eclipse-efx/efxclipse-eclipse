/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.l10n.nLSDsl.Message;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageParam;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl#getMessageList <em>Message List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageEntryImpl#getEntryRef <em>Entry Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageEntryImpl extends MinimalEObjectImpl.Container implements MessageEntry
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamList()
   * @generated
   * @ordered
   */
  protected EList<MessageParam> paramList;

  /**
   * The cached value of the '{@link #getMessageList() <em>Message List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageList()
   * @generated
   * @ordered
   */
  protected EList<Message> messageList;

  /**
   * The cached value of the '{@link #getEntryRef() <em>Entry Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryRef()
   * @generated
   * @ordered
   */
  protected MessageEntry entryRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NLSDslPackage.Literals.MESSAGE_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.MESSAGE_ENTRY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageParam> getParamList()
  {
    if (paramList == null)
    {
      paramList = new EObjectContainmentEList<MessageParam>(MessageParam.class, this, NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST);
    }
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessageList()
  {
    if (messageList == null)
    {
      messageList = new EObjectContainmentEList<Message>(Message.class, this, NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST);
    }
    return messageList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageEntry getEntryRef()
  {
    if (entryRef != null && entryRef.eIsProxy())
    {
      InternalEObject oldEntryRef = (InternalEObject)entryRef;
      entryRef = (MessageEntry)eResolveProxy(oldEntryRef);
      if (entryRef != oldEntryRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF, oldEntryRef, entryRef));
      }
    }
    return entryRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageEntry basicGetEntryRef()
  {
    return entryRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryRef(MessageEntry newEntryRef)
  {
    MessageEntry oldEntryRef = entryRef;
    entryRef = newEntryRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF, oldEntryRef, entryRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST:
        return ((InternalEList<?>)getParamList()).basicRemove(otherEnd, msgs);
      case NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST:
        return ((InternalEList<?>)getMessageList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NLSDslPackage.MESSAGE_ENTRY__NAME:
        return getName();
      case NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST:
        return getParamList();
      case NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST:
        return getMessageList();
      case NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF:
        if (resolve) return getEntryRef();
        return basicGetEntryRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NLSDslPackage.MESSAGE_ENTRY__NAME:
        setName((String)newValue);
        return;
      case NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST:
        getParamList().clear();
        getParamList().addAll((Collection<? extends MessageParam>)newValue);
        return;
      case NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST:
        getMessageList().clear();
        getMessageList().addAll((Collection<? extends Message>)newValue);
        return;
      case NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF:
        setEntryRef((MessageEntry)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NLSDslPackage.MESSAGE_ENTRY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST:
        getParamList().clear();
        return;
      case NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST:
        getMessageList().clear();
        return;
      case NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF:
        setEntryRef((MessageEntry)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NLSDslPackage.MESSAGE_ENTRY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NLSDslPackage.MESSAGE_ENTRY__PARAM_LIST:
        return paramList != null && !paramList.isEmpty();
      case NLSDslPackage.MESSAGE_ENTRY__MESSAGE_LIST:
        return messageList != null && !messageList.isEmpty();
      case NLSDslPackage.MESSAGE_ENTRY__ENTRY_REF:
        return entryRef != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MessageEntryImpl
