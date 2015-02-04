/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticCallProperties <em>Static Call Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getDefaultChildren <em>Default Children</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends SingleValueProperty, FactoryValueElement, ListValueElement, ReferenceType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SimpleValueProperty)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Value()
   * @model containment="true"
   * @generated
   */
  SimpleValueProperty getValue();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SimpleValueProperty value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_StaticProperties()
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
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_StaticCallProperties()
   * @model containment="true"
   * @generated
   */
  EList<StaticCallValueProperty> getStaticCallProperties();

  /**
   * Returns the value of the '<em><b>Default Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Children</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_DefaultChildren()
   * @model containment="true"
   * @generated
   */
  EList<Element> getDefaultChildren();

  /**
   * Returns the value of the '<em><b>Factory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factory</em>' attribute.
   * @see #setFactory(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Factory()
   * @model
   * @generated
   */
  String getFactory();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getFactory <em>Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factory</em>' attribute.
   * @see #getFactory()
   * @generated
   */
  void setFactory(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getElement_Values()
   * @model containment="true"
   * @generated
   */
  EList<FactoryValueElement> getValues();

} // Element
