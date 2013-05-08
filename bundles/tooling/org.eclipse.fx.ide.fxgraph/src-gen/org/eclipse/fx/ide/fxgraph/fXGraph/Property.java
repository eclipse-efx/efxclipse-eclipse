/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see #setModifier(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getProperty_Modifier()
   * @model
   * @generated
   */
  String getModifier();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see #getModifier()
   * @generated
   */
  void setModifier(String value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueProperty)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  ValueProperty getValue();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueProperty value);

} // Property
