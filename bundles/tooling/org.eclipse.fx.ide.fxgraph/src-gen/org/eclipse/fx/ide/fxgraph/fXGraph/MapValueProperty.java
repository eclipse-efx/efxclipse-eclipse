/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getMapValueProperty()
 * @model
 * @generated
 */
public interface MapValueProperty extends MultiValueProperty
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getMapValueProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // MapValueProperty
