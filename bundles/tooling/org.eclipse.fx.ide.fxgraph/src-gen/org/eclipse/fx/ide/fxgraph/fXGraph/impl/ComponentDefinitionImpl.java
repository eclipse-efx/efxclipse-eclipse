/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.Script;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#isDynamicRoot <em>Dynamic Root</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getController <em>Controller</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getPreviewCssFiles <em>Preview Css Files</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getPreviewResourceBundle <em>Preview Resource Bundle</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getPreviewClasspathEntries <em>Preview Classpath Entries</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getSceneDefinition <em>Scene Definition</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefinitionImpl extends MinimalEObjectImpl.Container implements ComponentDefinition
{
  /**
   * The default value of the '{@link #isDynamicRoot() <em>Dynamic Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamicRoot()
   * @generated
   * @ordered
   */
  protected static final boolean DYNAMIC_ROOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDynamicRoot() <em>Dynamic Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamicRoot()
   * @generated
   * @ordered
   */
  protected boolean dynamicRoot = DYNAMIC_ROOT_EDEFAULT;

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
   * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected JvmTypeReference controller;

  /**
   * The cached value of the '{@link #getPreviewCssFiles() <em>Preview Css Files</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviewCssFiles()
   * @generated
   * @ordered
   */
  protected EList<String> previewCssFiles;

  /**
   * The default value of the '{@link #getPreviewResourceBundle() <em>Preview Resource Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviewResourceBundle()
   * @generated
   * @ordered
   */
  protected static final String PREVIEW_RESOURCE_BUNDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreviewResourceBundle() <em>Preview Resource Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviewResourceBundle()
   * @generated
   * @ordered
   */
  protected String previewResourceBundle = PREVIEW_RESOURCE_BUNDLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreviewClasspathEntries() <em>Preview Classpath Entries</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviewClasspathEntries()
   * @generated
   * @ordered
   */
  protected EList<String> previewClasspathEntries;

  /**
   * The cached value of the '{@link #getSceneDefinition() <em>Scene Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSceneDefinition()
   * @generated
   * @ordered
   */
  protected ComponentDefinition sceneDefinition;

  /**
   * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScripts()
   * @generated
   * @ordered
   */
  protected EList<Script> scripts;

  /**
   * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefines()
   * @generated
   * @ordered
   */
  protected EList<Define> defines;

  /**
   * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootNode()
   * @generated
   * @ordered
   */
  protected Element rootNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDefinitionImpl()
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
    return FXGraphPackage.Literals.COMPONENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDynamicRoot()
  {
    return dynamicRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynamicRoot(boolean newDynamicRoot)
  {
    boolean oldDynamicRoot = dynamicRoot;
    dynamicRoot = newDynamicRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__DYNAMIC_ROOT, oldDynamicRoot, dynamicRoot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetController(JvmTypeReference newController, NotificationChain msgs)
  {
    JvmTypeReference oldController = controller;
    controller = newController;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER, oldController, newController);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setController(JvmTypeReference newController)
  {
    if (newController != controller)
    {
      NotificationChain msgs = null;
      if (controller != null)
        msgs = ((InternalEObject)controller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER, null, msgs);
      if (newController != null)
        msgs = ((InternalEObject)newController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER, null, msgs);
      msgs = basicSetController(newController, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER, newController, newController));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPreviewCssFiles()
  {
    if (previewCssFiles == null)
    {
      previewCssFiles = new EDataTypeEList<String>(String.class, this, FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CSS_FILES);
    }
    return previewCssFiles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPreviewResourceBundle()
  {
    return previewResourceBundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreviewResourceBundle(String newPreviewResourceBundle)
  {
    String oldPreviewResourceBundle = previewResourceBundle;
    previewResourceBundle = newPreviewResourceBundle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE, oldPreviewResourceBundle, previewResourceBundle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPreviewClasspathEntries()
  {
    if (previewClasspathEntries == null)
    {
      previewClasspathEntries = new EDataTypeEList<String>(String.class, this, FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES);
    }
    return previewClasspathEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition getSceneDefinition()
  {
    if (sceneDefinition != null && sceneDefinition.eIsProxy())
    {
      InternalEObject oldSceneDefinition = (InternalEObject)sceneDefinition;
      sceneDefinition = (ComponentDefinition)eResolveProxy(oldSceneDefinition);
      if (sceneDefinition != oldSceneDefinition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION, oldSceneDefinition, sceneDefinition));
      }
    }
    return sceneDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition basicGetSceneDefinition()
  {
    return sceneDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSceneDefinition(ComponentDefinition newSceneDefinition)
  {
    ComponentDefinition oldSceneDefinition = sceneDefinition;
    sceneDefinition = newSceneDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION, oldSceneDefinition, sceneDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Script> getScripts()
  {
    if (scripts == null)
    {
      scripts = new EObjectContainmentEList<Script>(Script.class, this, FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS);
    }
    return scripts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Define> getDefines()
  {
    if (defines == null)
    {
      defines = new EObjectContainmentEList<Define>(Define.class, this, FXGraphPackage.COMPONENT_DEFINITION__DEFINES);
    }
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getRootNode()
  {
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootNode(Element newRootNode, NotificationChain msgs)
  {
    Element oldRootNode = rootNode;
    rootNode = newRootNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE, oldRootNode, newRootNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootNode(Element newRootNode)
  {
    if (newRootNode != rootNode)
    {
      NotificationChain msgs = null;
      if (rootNode != null)
        msgs = ((InternalEObject)rootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE, null, msgs);
      if (newRootNode != null)
        msgs = ((InternalEObject)newRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE, null, msgs);
      msgs = basicSetRootNode(newRootNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE, newRootNode, newRootNode));
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
      case FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER:
        return basicSetController(null, msgs);
      case FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS:
        return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.COMPONENT_DEFINITION__DEFINES:
        return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE:
        return basicSetRootNode(null, msgs);
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
      case FXGraphPackage.COMPONENT_DEFINITION__DYNAMIC_ROOT:
        return isDynamicRoot();
      case FXGraphPackage.COMPONENT_DEFINITION__NAME:
        return getName();
      case FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER:
        return getController();
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CSS_FILES:
        return getPreviewCssFiles();
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE:
        return getPreviewResourceBundle();
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES:
        return getPreviewClasspathEntries();
      case FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION:
        if (resolve) return getSceneDefinition();
        return basicGetSceneDefinition();
      case FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS:
        return getScripts();
      case FXGraphPackage.COMPONENT_DEFINITION__DEFINES:
        return getDefines();
      case FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE:
        return getRootNode();
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
      case FXGraphPackage.COMPONENT_DEFINITION__DYNAMIC_ROOT:
        setDynamicRoot((Boolean)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER:
        setController((JvmTypeReference)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CSS_FILES:
        getPreviewCssFiles().clear();
        getPreviewCssFiles().addAll((Collection<? extends String>)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE:
        setPreviewResourceBundle((String)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES:
        getPreviewClasspathEntries().clear();
        getPreviewClasspathEntries().addAll((Collection<? extends String>)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION:
        setSceneDefinition((ComponentDefinition)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS:
        getScripts().clear();
        getScripts().addAll((Collection<? extends Script>)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__DEFINES:
        getDefines().clear();
        getDefines().addAll((Collection<? extends Define>)newValue);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE:
        setRootNode((Element)newValue);
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
      case FXGraphPackage.COMPONENT_DEFINITION__DYNAMIC_ROOT:
        setDynamicRoot(DYNAMIC_ROOT_EDEFAULT);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER:
        setController((JvmTypeReference)null);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CSS_FILES:
        getPreviewCssFiles().clear();
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE:
        setPreviewResourceBundle(PREVIEW_RESOURCE_BUNDLE_EDEFAULT);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES:
        getPreviewClasspathEntries().clear();
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION:
        setSceneDefinition((ComponentDefinition)null);
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS:
        getScripts().clear();
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__DEFINES:
        getDefines().clear();
        return;
      case FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE:
        setRootNode((Element)null);
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
      case FXGraphPackage.COMPONENT_DEFINITION__DYNAMIC_ROOT:
        return dynamicRoot != DYNAMIC_ROOT_EDEFAULT;
      case FXGraphPackage.COMPONENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FXGraphPackage.COMPONENT_DEFINITION__CONTROLLER:
        return controller != null;
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CSS_FILES:
        return previewCssFiles != null && !previewCssFiles.isEmpty();
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE:
        return PREVIEW_RESOURCE_BUNDLE_EDEFAULT == null ? previewResourceBundle != null : !PREVIEW_RESOURCE_BUNDLE_EDEFAULT.equals(previewResourceBundle);
      case FXGraphPackage.COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES:
        return previewClasspathEntries != null && !previewClasspathEntries.isEmpty();
      case FXGraphPackage.COMPONENT_DEFINITION__SCENE_DEFINITION:
        return sceneDefinition != null;
      case FXGraphPackage.COMPONENT_DEFINITION__SCRIPTS:
        return scripts != null && !scripts.isEmpty();
      case FXGraphPackage.COMPONENT_DEFINITION__DEFINES:
        return defines != null && !defines.isEmpty();
      case FXGraphPackage.COMPONENT_DEFINITION__ROOT_NODE:
        return rootNode != null;
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
    result.append(" (dynamicRoot: ");
    result.append(dynamicRoot);
    result.append(", name: ");
    result.append(name);
    result.append(", previewCssFiles: ");
    result.append(previewCssFiles);
    result.append(", previewResourceBundle: ");
    result.append(previewResourceBundle);
    result.append(", previewClasspathEntries: ");
    result.append(previewClasspathEntries);
    result.append(')');
    return result.toString();
  }

} //ComponentDefinitionImpl
