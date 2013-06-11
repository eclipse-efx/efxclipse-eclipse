/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getSimpleValueProperty()
 * @model
 * @generated
 */
public interface SimpleValueProperty extends SingleValueProperty, FactoryValueElement, ListValueElement
{
  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getSimpleValueProperty_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Value</em>' attribute.
   * @see #setBooleanValue(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getSimpleValueProperty_BooleanValue()
   * @model
   * @generated
   */
  String getBooleanValue();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Value</em>' attribute.
   * @see #getBooleanValue()
   * @generated
   */
  void setBooleanValue(String value);

  /**
   * Returns the value of the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative</em>' attribute.
   * @see #setNegative(boolean)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getSimpleValueProperty_Negative()
   * @model
   * @generated
   */
  boolean isNegative();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#isNegative <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative</em>' attribute.
   * @see #isNegative()
   * @generated
   */
  void setNegative(boolean value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getSimpleValueProperty_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

} // SimpleValueProperty
