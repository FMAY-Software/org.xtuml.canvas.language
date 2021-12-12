/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.canvas.language.canvas.StartAnchor#getPoint <em>Point</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.StartAnchor#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see org.xtuml.canvas.language.canvas.CanvasPackage#getStartAnchor()
 * @model
 * @generated
 */
public interface StartAnchor extends EObject
{
  /**
   * Returns the value of the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Point</em>' containment reference.
   * @see #setPoint(Point)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getStartAnchor_Point()
   * @model containment="true"
   * @generated
   */
  Point getPoint();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.StartAnchor#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
  void setPoint(Point value);

  /**
   * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anchor</em>' containment reference.
   * @see #setAnchor(Anchor)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getStartAnchor_Anchor()
   * @model containment="true"
   * @generated
   */
  Anchor getAnchor();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.StartAnchor#getAnchor <em>Anchor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anchor</em>' containment reference.
   * @see #getAnchor()
   * @generated
   */
  void setAnchor(Anchor value);

} // StartAnchor