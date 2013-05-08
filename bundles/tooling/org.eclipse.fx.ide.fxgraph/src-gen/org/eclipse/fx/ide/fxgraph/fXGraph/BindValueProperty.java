/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getElementReference <em>Element Reference</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getBindValueProperty()
 * @model
 * @generated
 */
public interface BindValueProperty extends SingleValueProperty
{
  /**
   * Returns the value of the '<em><b>Element Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Reference</em>' reference.
   * @see #setElementReference(Element)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getBindValueProperty_ElementReference()
   * @model
   * @generated
   */
  Element getElementReference();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getElementReference <em>Element Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Reference</em>' reference.
   * @see #getElementReference()
   * @generated
   */
  void setElementReference(Element value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getBindValueProperty_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

} // BindValueProperty
