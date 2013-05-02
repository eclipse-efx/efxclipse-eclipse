/**
 */
package org.eclipse.fx.ide.css.cssDsl.impl;

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

import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.charset;
import org.eclipse.fx.ide.css.cssDsl.importExpression;
import org.eclipse.fx.ide.css.cssDsl.media;
import org.eclipse.fx.ide.css.cssDsl.page;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.stylesheetImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stylesheetImpl extends MinimalEObjectImpl.Container implements stylesheet
{
  /**
   * The cached value of the '{@link #getCharset() <em>Charset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharset()
   * @generated
   * @ordered
   */
  protected charset charset;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<importExpression> imports;

  /**
   * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleset()
   * @generated
   * @ordered
   */
  protected EList<ruleset> ruleset;

  /**
   * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedia()
   * @generated
   * @ordered
   */
  protected EList<media> media;

  /**
   * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected EList<page> page;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stylesheetImpl()
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
    return CssDslPackage.Literals.STYLESHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public charset getCharset()
  {
    return charset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCharset(charset newCharset, NotificationChain msgs)
  {
    charset oldCharset = charset;
    charset = newCharset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.STYLESHEET__CHARSET, oldCharset, newCharset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharset(charset newCharset)
  {
    if (newCharset != charset)
    {
      NotificationChain msgs = null;
      if (charset != null)
        msgs = ((InternalEObject)charset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.STYLESHEET__CHARSET, null, msgs);
      if (newCharset != null)
        msgs = ((InternalEObject)newCharset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.STYLESHEET__CHARSET, null, msgs);
      msgs = basicSetCharset(newCharset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.STYLESHEET__CHARSET, newCharset, newCharset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<importExpression> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<importExpression>(importExpression.class, this, CssDslPackage.STYLESHEET__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ruleset> getRuleset()
  {
    if (ruleset == null)
    {
      ruleset = new EObjectContainmentEList<ruleset>(ruleset.class, this, CssDslPackage.STYLESHEET__RULESET);
    }
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<media> getMedia()
  {
    if (media == null)
    {
      media = new EObjectContainmentEList<media>(media.class, this, CssDslPackage.STYLESHEET__MEDIA);
    }
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<page> getPage()
  {
    if (page == null)
    {
      page = new EObjectContainmentEList<page>(page.class, this, CssDslPackage.STYLESHEET__PAGE);
    }
    return page;
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
      case CssDslPackage.STYLESHEET__CHARSET:
        return basicSetCharset(null, msgs);
      case CssDslPackage.STYLESHEET__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CssDslPackage.STYLESHEET__RULESET:
        return ((InternalEList<?>)getRuleset()).basicRemove(otherEnd, msgs);
      case CssDslPackage.STYLESHEET__MEDIA:
        return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
      case CssDslPackage.STYLESHEET__PAGE:
        return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
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
      case CssDslPackage.STYLESHEET__CHARSET:
        return getCharset();
      case CssDslPackage.STYLESHEET__IMPORTS:
        return getImports();
      case CssDslPackage.STYLESHEET__RULESET:
        return getRuleset();
      case CssDslPackage.STYLESHEET__MEDIA:
        return getMedia();
      case CssDslPackage.STYLESHEET__PAGE:
        return getPage();
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
      case CssDslPackage.STYLESHEET__CHARSET:
        setCharset((charset)newValue);
        return;
      case CssDslPackage.STYLESHEET__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends importExpression>)newValue);
        return;
      case CssDslPackage.STYLESHEET__RULESET:
        getRuleset().clear();
        getRuleset().addAll((Collection<? extends ruleset>)newValue);
        return;
      case CssDslPackage.STYLESHEET__MEDIA:
        getMedia().clear();
        getMedia().addAll((Collection<? extends media>)newValue);
        return;
      case CssDslPackage.STYLESHEET__PAGE:
        getPage().clear();
        getPage().addAll((Collection<? extends page>)newValue);
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
      case CssDslPackage.STYLESHEET__CHARSET:
        setCharset((charset)null);
        return;
      case CssDslPackage.STYLESHEET__IMPORTS:
        getImports().clear();
        return;
      case CssDslPackage.STYLESHEET__RULESET:
        getRuleset().clear();
        return;
      case CssDslPackage.STYLESHEET__MEDIA:
        getMedia().clear();
        return;
      case CssDslPackage.STYLESHEET__PAGE:
        getPage().clear();
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
      case CssDslPackage.STYLESHEET__CHARSET:
        return charset != null;
      case CssDslPackage.STYLESHEET__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CssDslPackage.STYLESHEET__RULESET:
        return ruleset != null && !ruleset.isEmpty();
      case CssDslPackage.STYLESHEET__MEDIA:
        return media != null && !media.isEmpty();
      case CssDslPackage.STYLESHEET__PAGE:
        return page != null && !page.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //stylesheetImpl
