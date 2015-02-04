/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getIncludeElement <em>Include Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getDefine()
 * @model
 * @generated
 */
public interface Define extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getDefine_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

  /**
   * Returns the value of the '<em><b>Include Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Element</em>' containment reference.
   * @see #setIncludeElement(IncludeValueProperty)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getDefine_IncludeElement()
   * @model containment="true"
   * @generated
   */
  IncludeValueProperty getIncludeElement();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getIncludeElement <em>Include Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Element</em>' containment reference.
   * @see #getIncludeElement()
   * @generated
   */
  void setIncludeElement(IncludeValueProperty value);

} // Define
