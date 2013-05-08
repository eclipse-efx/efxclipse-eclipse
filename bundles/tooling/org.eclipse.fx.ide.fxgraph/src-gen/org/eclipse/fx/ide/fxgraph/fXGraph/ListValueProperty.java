/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getListValueProperty()
 * @model
 * @generated
 */
public interface ListValueProperty extends MultiValueProperty
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getListValueProperty_Value()
   * @model containment="true"
   * @generated
   */
  EList<ListValueElement> getValue();

} // ListValueProperty
