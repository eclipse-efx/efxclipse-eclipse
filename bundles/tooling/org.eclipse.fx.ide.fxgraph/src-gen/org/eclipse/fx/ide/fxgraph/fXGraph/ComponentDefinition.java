/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#isDynamicRoot <em>Dynamic Root</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getPreviewCssFiles <em>Preview Css Files</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getPreviewClasspathEntries <em>Preview Classpath Entries</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getSceneDefinition <em>Scene Definition</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Dynamic Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Root</em>' attribute.
   * @see #setDynamicRoot(boolean)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_DynamicRoot()
   * @model
   * @generated
   */
  boolean isDynamicRoot();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#isDynamicRoot <em>Dynamic Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic Root</em>' attribute.
   * @see #isDynamicRoot()
   * @generated
   */
  void setDynamicRoot(boolean value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controller</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' containment reference.
   * @see #setController(JvmTypeReference)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_Controller()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getController();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' containment reference.
   * @see #getController()
   * @generated
   */
  void setController(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Preview Css Files</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Css Files</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Css Files</em>' attribute list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_PreviewCssFiles()
   * @model unique="false"
   * @generated
   */
  EList<String> getPreviewCssFiles();

  /**
   * Returns the value of the '<em><b>Preview Resource Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Resource Bundle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Resource Bundle</em>' attribute.
   * @see #setPreviewResourceBundle(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_PreviewResourceBundle()
   * @model
   * @generated
   */
  String getPreviewResourceBundle();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preview Resource Bundle</em>' attribute.
   * @see #getPreviewResourceBundle()
   * @generated
   */
  void setPreviewResourceBundle(String value);

  /**
   * Returns the value of the '<em><b>Preview Classpath Entries</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Classpath Entries</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Classpath Entries</em>' attribute list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_PreviewClasspathEntries()
   * @model unique="false"
   * @generated
   */
  EList<String> getPreviewClasspathEntries();

  /**
   * Returns the value of the '<em><b>Scene Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scene Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scene Definition</em>' reference.
   * @see #setSceneDefinition(ComponentDefinition)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_SceneDefinition()
   * @model
   * @generated
   */
  ComponentDefinition getSceneDefinition();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getSceneDefinition <em>Scene Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scene Definition</em>' reference.
   * @see #getSceneDefinition()
   * @generated
   */
  void setSceneDefinition(ComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.Script}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scripts</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_Scripts()
   * @model containment="true"
   * @generated
   */
  EList<Script> getScripts();

  /**
   * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defines</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_Defines()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefines();

  /**
   * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Node</em>' containment reference.
   * @see #setRootNode(Element)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.FXGraphPackage#getComponentDefinition_RootNode()
   * @model containment="true"
   * @generated
   */
  Element getRootNode();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Node</em>' containment reference.
   * @see #getRootNode()
   * @generated
   */
  void setRootNode(Element value);

} // ComponentDefinition
