/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.canvas.language.canvas.ModelProperties#getPoint <em>Point</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.ModelProperties#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @see org.xtuml.canvas.language.canvas.CanvasPackage#getModelProperties()
 * @model
 * @generated
 */
public interface ModelProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Point</em>' containment reference.
   * @see #setPoint(Point)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getModelProperties_Point()
   * @model containment="true"
   * @generated
   */
  Point getPoint();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.ModelProperties#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
  void setPoint(Point value);

  /**
   * Returns the value of the '<em><b>Zoom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zoom</em>' attribute.
   * @see #setZoom(int)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getModelProperties_Zoom()
   * @model
   * @generated
   */
  int getZoom();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.ModelProperties#getZoom <em>Zoom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zoom</em>' attribute.
   * @see #getZoom()
   * @generated
   */
  void setZoom(int value);

} // ModelProperties
