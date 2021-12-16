/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getProps <em>Props</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getAnchors <em>Anchors</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getTexts <em>Texts</em>}</li>
 *   <li>{@link org.xtuml.canvas.language.canvas.Connector#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Props</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Props</em>' containment reference.
   * @see #setProps(ConnectorProps)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Props()
   * @model containment="true"
   * @generated
   */
  ConnectorProps getProps();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getProps <em>Props</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Props</em>' containment reference.
   * @see #getProps()
   * @generated
   */
  void setProps(ConnectorProps value);

  /**
   * Returns the value of the '<em><b>Polyline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polyline</em>' containment reference.
   * @see #setPolyline(Polyline)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Polyline()
   * @model containment="true"
   * @generated
   */
  Polyline getPolyline();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getPolyline <em>Polyline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polyline</em>' containment reference.
   * @see #getPolyline()
   * @generated
   */
  void setPolyline(Polyline value);

  /**
   * Returns the value of the '<em><b>Anchors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anchors</em>' containment reference.
   * @see #setAnchors(Anchors)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Anchors()
   * @model containment="true"
   * @generated
   */
  Anchors getAnchors();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getAnchors <em>Anchors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anchors</em>' containment reference.
   * @see #getAnchors()
   * @generated
   */
  void setAnchors(Anchors value);

  /**
   * Returns the value of the '<em><b>Texts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texts</em>' containment reference.
   * @see #setTexts(FloatingTexts)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Texts()
   * @model containment="true"
   * @generated
   */
  FloatingTexts getTexts();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getTexts <em>Texts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texts</em>' containment reference.
   * @see #getTexts()
   * @generated
   */
  void setTexts(FloatingTexts value);

  /**
   * Returns the value of the '<em><b>Represents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Represents</em>' attribute.
   * @see #setRepresents(String)
   * @see org.xtuml.canvas.language.canvas.CanvasPackage#getConnector_Represents()
   * @model
   * @generated
   */
  String getRepresents();

  /**
   * Sets the value of the '{@link org.xtuml.canvas.language.canvas.Connector#getRepresents <em>Represents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Represents</em>' attribute.
   * @see #getRepresents()
   * @generated
   */
  void setRepresents(String value);

} // Connector
