/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticCallProperties <em>Static Call Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty()
 * @model
 * @generated
 */
public interface IncludeValueProperty extends SingleValueProperty, ListValueElement, ReferenceType
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ComponentDefinition)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty_Source()
   * @model
   * @generated
   */
  ComponentDefinition getSource();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ComponentDefinition value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Static Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Properties</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty_StaticProperties()
   * @model containment="true"
   * @generated
   */
  EList<StaticValueProperty> getStaticProperties();

  /**
   * Returns the value of the '<em><b>Static Call Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Call Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Call Properties</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty_StaticCallProperties()
   * @model containment="true"
   * @generated
   */
  EList<StaticCallValueProperty> getStaticCallProperties();

} // IncludeValueProperty
