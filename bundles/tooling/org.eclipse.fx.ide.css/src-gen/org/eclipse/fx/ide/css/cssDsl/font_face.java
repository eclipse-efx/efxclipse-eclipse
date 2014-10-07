/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>font face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.font_face#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.font_face#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.font_face#getKeyframeselectors <em>Keyframeselectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getfont_face()
 * @model
 * @generated
 */
public interface font_face extends keyframes
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.css_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getfont_face_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<css_declaration> getDeclarations();

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
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getfont_face_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.font_face#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Keyframeselectors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyframeselectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyframeselectors</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getfont_face_Keyframeselectors()
   * @model containment="true"
   * @generated
   */
  EList<keyframe_selector> getKeyframeselectors();

} // font_face
