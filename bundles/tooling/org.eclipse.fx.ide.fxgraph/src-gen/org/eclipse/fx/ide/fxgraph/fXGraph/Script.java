/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSourcecode <em>Sourcecode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScript_Language()
   * @model
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScript_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourcecode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourcecode</em>' attribute.
   * @see #setSourcecode(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScript_Sourcecode()
   * @model
   * @generated
   */
  String getSourcecode();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSourcecode <em>Sourcecode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourcecode</em>' attribute.
   * @see #getSourcecode()
   * @generated
   */
  void setSourcecode(String value);

} // Script
