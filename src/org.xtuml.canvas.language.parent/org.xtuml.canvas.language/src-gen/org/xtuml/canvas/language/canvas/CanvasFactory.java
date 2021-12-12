/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtuml.canvas.language.canvas.CanvasPackage
 * @generated
 */
public interface CanvasFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CanvasFactory eINSTANCE = org.xtuml.canvas.language.canvas.impl.CanvasFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Semantic Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic Model</em>'.
   * @generated
   */
  SemanticModel createSemanticModel();

  /**
   * Returns a new object of class '<em>Model Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Properties</em>'.
   * @generated
   */
  ModelProperties createModelProperties();

  /**
   * Returns a new object of class '<em>Graphical Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graphical Element</em>'.
   * @generated
   */
  GraphicalElement createGraphicalElement();

  /**
   * Returns a new object of class '<em>Shapes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shapes</em>'.
   * @generated
   */
  Shapes createShapes();

  /**
   * Returns a new object of class '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape</em>'.
   * @generated
   */
  Shape createShape();

  /**
   * Returns a new object of class '<em>Floating Texts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floating Texts</em>'.
   * @generated
   */
  FloatingTexts createFloatingTexts();

  /**
   * Returns a new object of class '<em>Floating Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floating Text</em>'.
   * @generated
   */
  FloatingText createFloatingText();

  /**
   * Returns a new object of class '<em>Shape Props</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Props</em>'.
   * @generated
   */
  ShapeProps createShapeProps();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Connectors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connectors</em>'.
   * @generated
   */
  Connectors createConnectors();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Anchors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anchors</em>'.
   * @generated
   */
  Anchors createAnchors();

  /**
   * Returns a new object of class '<em>Start Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Anchor</em>'.
   * @generated
   */
  StartAnchor createStartAnchor();

  /**
   * Returns a new object of class '<em>End Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Anchor</em>'.
   * @generated
   */
  EndAnchor createEndAnchor();

  /**
   * Returns a new object of class '<em>Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anchor</em>'.
   * @generated
   */
  Anchor createAnchor();

  /**
   * Returns a new object of class '<em>Shape Anchor Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Anchor Element</em>'.
   * @generated
   */
  ShapeAnchorElement createShapeAnchorElement();

  /**
   * Returns a new object of class '<em>Connector Anchor Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector Anchor Element</em>'.
   * @generated
   */
  ConnectorAnchorElement createConnectorAnchorElement();

  /**
   * Returns a new object of class '<em>Connector Props</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector Props</em>'.
   * @generated
   */
  ConnectorProps createConnectorProps();

  /**
   * Returns a new object of class '<em>Polyline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polyline</em>'.
   * @generated
   */
  Polyline createPolyline();

  /**
   * Returns a new object of class '<em>Segment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Segment</em>'.
   * @generated
   */
  Segment createSegment();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rectangle</em>'.
   * @generated
   */
  Rectangle createRectangle();

  /**
   * Returns a new object of class '<em>Shape Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Container</em>'.
   * @generated
   */
  ShapeContainer createShapeContainer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CanvasPackage getCanvasPackage();

} //CanvasFactory