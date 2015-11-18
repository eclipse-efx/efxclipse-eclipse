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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NLS Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl#getFormatterList <em>Formatter List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl#getMessageEntryList <em>Message Entry List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSBundleImpl#getIncludedBundleList <em>Included Bundle List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NLSBundleImpl extends MinimalEObjectImpl.Container implements NLSBundle
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
   * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected static final String LANG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected String lang = LANG_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormatterList() <em>Formatter List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatterList()
   * @generated
   * @ordered
   */
  protected EList<NLSFormatter> formatterList;

  /**
   * The cached value of the '{@link #getMessageEntryList() <em>Message Entry List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageEntryList()
   * @generated
   * @ordered
   */
  protected EList<MessageEntry> messageEntryList;

  /**
   * The cached value of the '{@link #getIncludedBundleList() <em>Included Bundle List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedBundleList()
   * @generated
   * @ordered
   */
  protected EList<NLSBundle> includedBundleList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NLSBundleImpl()
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
    return NLSDslPackage.Literals.NLS_BUNDLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS_BUNDLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(String newLang)
  {
    String oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS_BUNDLE__LANG, oldLang, lang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NLSFormatter> getFormatterList()
  {
    if (formatterList == null)
    {
      formatterList = new EObjectContainmentEList<NLSFormatter>(NLSFormatter.class, this, NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST);
    }
    return formatterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageEntry> getMessageEntryList()
  {
    if (messageEntryList == null)
    {
      messageEntryList = new EObjectContainmentEList<MessageEntry>(MessageEntry.class, this, NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST);
    }
    return messageEntryList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NLSBundle> getIncludedBundleList()
  {
    if (includedBundleList == null)
    {
      includedBundleList = new EObjectResolvingEList<NLSBundle>(NLSBundle.class, this, NLSDslPackage.NLS_BUNDLE__INCLUDED_BUNDLE_LIST);
    }
    return includedBundleList;
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
      case NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST:
        return ((InternalEList<?>)getFormatterList()).basicRemove(otherEnd, msgs);
      case NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST:
        return ((InternalEList<?>)getMessageEntryList()).basicRemove(otherEnd, msgs);
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
      case NLSDslPackage.NLS_BUNDLE__NAME:
        return getName();
      case NLSDslPackage.NLS_BUNDLE__LANG:
        return getLang();
      case NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST:
        return getFormatterList();
      case NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST:
        return getMessageEntryList();
      case NLSDslPackage.NLS_BUNDLE__INCLUDED_BUNDLE_LIST:
        return getIncludedBundleList();
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
      case NLSDslPackage.NLS_BUNDLE__NAME:
        setName((String)newValue);
        return;
      case NLSDslPackage.NLS_BUNDLE__LANG:
        setLang((String)newValue);
        return;
      case NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST:
        getFormatterList().clear();
        getFormatterList().addAll((Collection<? extends NLSFormatter>)newValue);
        return;
      case NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST:
        getMessageEntryList().clear();
        getMessageEntryList().addAll((Collection<? extends MessageEntry>)newValue);
        return;
      case NLSDslPackage.NLS_BUNDLE__INCLUDED_BUNDLE_LIST:
        getIncludedBundleList().clear();
        getIncludedBundleList().addAll((Collection<? extends NLSBundle>)newValue);
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
      case NLSDslPackage.NLS_BUNDLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NLSDslPackage.NLS_BUNDLE__LANG:
        setLang(LANG_EDEFAULT);
        return;
      case NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST:
        getFormatterList().clear();
        return;
      case NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST:
        getMessageEntryList().clear();
        return;
      case NLSDslPackage.NLS_BUNDLE__INCLUDED_BUNDLE_LIST:
        getIncludedBundleList().clear();
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
      case NLSDslPackage.NLS_BUNDLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NLSDslPackage.NLS_BUNDLE__LANG:
        return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
      case NLSDslPackage.NLS_BUNDLE__FORMATTER_LIST:
        return formatterList != null && !formatterList.isEmpty();
      case NLSDslPackage.NLS_BUNDLE__MESSAGE_ENTRY_LIST:
        return messageEntryList != null && !messageEntryList.isEmpty();
      case NLSDslPackage.NLS_BUNDLE__INCLUDED_BUNDLE_LIST:
        return includedBundleList != null && !includedBundleList.isEmpty();
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
    result.append(", lang: ");
    result.append(lang);
    result.append(')');
    return result.toString();
  }

} //NLSBundleImpl
