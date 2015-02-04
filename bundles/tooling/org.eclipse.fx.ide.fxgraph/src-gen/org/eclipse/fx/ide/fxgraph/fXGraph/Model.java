/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getComponentDef <em>Component Def</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDeclaration)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getModel_Package()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackage();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDeclaration value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.fxgraph.fXGraph.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Component Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Def</em>' containment reference.
   * @see #setComponentDef(ComponentDefinition)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getModel_ComponentDef()
   * @model containment="true"
   * @generated
   */
  ComponentDefinition getComponentDef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getComponentDef <em>Component Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Def</em>' containment reference.
   * @see #getComponentDef()
   * @generated
   */
  void setComponentDef(ComponentDefinition value);

} // Model
