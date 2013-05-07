/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;

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

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substructure Styleclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureStyleclassImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureStyleclassImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureStyleclassImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureStyleclassImpl#getChilds <em>Childs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstructureStyleclassImpl extends MinimalEObjectImpl.Container implements SubstructureStyleclass
{
  /**
   * The cached value of the '{@link #getDoku() <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoku()
   * @generated
   * @ordered
   */
  protected Doku doku;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected ElementDefinition element;

  /**
   * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectors()
   * @generated
   * @ordered
   */
  protected EList<SubstructureSelector> selectors;

  /**
   * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChilds()
   * @generated
   * @ordered
   */
  protected EList<SubstructureStyleclass> childs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstructureStyleclassImpl()
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
    return CssExtDslPackage.Literals.SUBSTRUCTURE_STYLECLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku getDoku()
  {
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoku(Doku newDoku, NotificationChain msgs)
  {
    Doku oldDoku = doku;
    doku = newDoku;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU, oldDoku, newDoku);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoku(Doku newDoku)
  {
    if (newDoku != doku)
    {
      NotificationChain msgs = null;
      if (doku != null)
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU, newDoku, newDoku));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (ElementDefinition)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(ElementDefinition newElement)
  {
    ElementDefinition oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubstructureSelector> getSelectors()
  {
    if (selectors == null)
    {
      selectors = new EObjectContainmentEList<SubstructureSelector>(SubstructureSelector.class, this, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS);
    }
    return selectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubstructureStyleclass> getChilds()
  {
    if (childs == null)
    {
      childs = new EObjectContainmentEList<SubstructureStyleclass>(SubstructureStyleclass.class, this, CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS);
    }
    return childs;
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
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS:
        return ((InternalEList<?>)getSelectors()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS:
        return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU:
        return getDoku();
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS:
        return getSelectors();
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS:
        return getChilds();
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
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT:
        setElement((ElementDefinition)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS:
        getSelectors().clear();
        getSelectors().addAll((Collection<? extends SubstructureSelector>)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS:
        getChilds().clear();
        getChilds().addAll((Collection<? extends SubstructureStyleclass>)newValue);
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
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT:
        setElement((ElementDefinition)null);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS:
        getSelectors().clear();
        return;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS:
        getChilds().clear();
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
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__DOKU:
        return doku != null;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__ELEMENT:
        return element != null;
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__SELECTORS:
        return selectors != null && !selectors.isEmpty();
      case CssExtDslPackage.SUBSTRUCTURE_STYLECLASS__CHILDS:
        return childs != null && !childs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubstructureStyleclassImpl
