/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticCallProperties <em>Static Call Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty()
 * @model
 * @generated
 */
public interface ReferenceValueProperty extends SingleValueProperty, ListValueElement
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(ReferenceType)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty_Reference()
   * @model
   * @generated
   */
  ReferenceType getReference();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ReferenceType value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty_StaticProperties()
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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty_StaticCallProperties()
   * @model containment="true"
   * @generated
   */
  EList<StaticCallValueProperty> getStaticCallProperties();

} // ReferenceValueProperty
