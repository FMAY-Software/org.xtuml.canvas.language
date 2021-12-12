package org.xtuml.canvas.language.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.ui.canvas.CanvasPlugin;
import org.xtuml.bp.ui.canvas.Connector_c;
import org.xtuml.bp.ui.canvas.Diagram_c;
import org.xtuml.bp.ui.canvas.Graphconnector_c;
import org.xtuml.bp.ui.canvas.Graphedge_c;
import org.xtuml.bp.ui.canvas.Graphelement_c;
import org.xtuml.bp.ui.canvas.GraphicalElement_c;
import org.xtuml.bp.ui.canvas.Graphnode_c;
import org.xtuml.bp.ui.canvas.LineSegment_c;
import org.xtuml.bp.ui.canvas.Model_c;
import org.xtuml.bp.ui.canvas.Ooaofgraphics;
import org.xtuml.bp.ui.canvas.Shape_c;
import org.xtuml.bp.ui.canvas.Waypoint_c;
import org.xtuml.canvas.language.canvas.Anchors;
import org.xtuml.canvas.language.canvas.CanvasFactory;
import org.xtuml.canvas.language.canvas.Connector;
import org.xtuml.canvas.language.canvas.ConnectorAnchorElement;
import org.xtuml.canvas.language.canvas.Connectors;
import org.xtuml.canvas.language.canvas.EndAnchor;
import org.xtuml.canvas.language.canvas.GraphicalElement;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.ModelProperties;
import org.xtuml.canvas.language.canvas.Point;
import org.xtuml.canvas.language.canvas.Polyline;
import org.xtuml.canvas.language.canvas.Rectangle;
import org.xtuml.canvas.language.canvas.Segment;
import org.xtuml.canvas.language.canvas.SemanticModel;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.ShapeAnchorElement;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.canvas.StartAnchor;
import org.xtuml.canvas.language.ui.internal.LanguageActivator;

import com.google.inject.Inject;

public class CanvasWriter {
    
       
	@Inject
	IResourceSetProvider resourceSetProvider;
	
	CanvasFactory factory = CanvasFactory.eINSTANCE;
	Model model = null;
	
	public void write(NonRootModelElement diagramRepresents, IFile file) throws IOException, CoreException {
		// create an empty file
		if(!file.exists()) {
			file.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		}
		Model_c xtModel = Model_c.ModelInstance(Ooaofgraphics.getInstance(diagramRepresents.getModelRoot().getId()),
				m -> ((Model_c) m).getRepresents() == diagramRepresents);
    	CanvasPlugin.setGraphicalRepresents(xtModel);
		LanguageActivator.getInstance().getInjector("org.xtuml.canvas.language.Canvas").injectMembers(this);
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        ResourceSet rs = resourceSetProvider.get(file.getProject());
        Resource r = rs.getResource(uri, true);
        r.getContents().clear();
        model = factory.createModel();
        model.setRepresents(getPath(diagramRepresents));
        ModelProperties properties = factory.createModelProperties();
        Diagram_c diagram = Diagram_c.getOneDIM_DIAOnR18(xtModel);
        properties.setZoom((int) diagram.getZoom());
        Point viewport = factory.createPoint();
        viewport.setX((int) diagram.getViewportx());
        viewport.setY((int) diagram.getViewporty());
        properties.setPoint(viewport);
        SemanticModel sm = factory.createSemanticModel();
        sm.setImportURI(diagramRepresents.getPath());
        model.getSemantics().add(sm);
        model.setProperties(properties);
        populateModel(diagramRepresents);
        r.getContents().add(model);
        SaveOptions.Builder options = SaveOptions.newBuilder();
        options.format();
        r.save(options.getOptions().toOptionsMap());
	}

	private void populateModel(NonRootModelElement diagramRepresents) {
		Model_c diagram = Model_c.ModelInstance(Ooaofgraphics.getInstance(diagramRepresents.getModelRoot().getId()), m -> ((Model_c) m).getRepresents() == diagramRepresents);
		GraphicalElement_c[] elements = GraphicalElement_c.getManyGD_GEsOnR1(diagram);
		Shapes shapes = factory.createShapes();
		Connectors connectors = factory.createConnectors();
		model.getElements().add(shapes);
		model.getElements().add(connectors);
		Stream.of(elements).forEach(ele -> {
			Shape_c shp = Shape_c.getOneGD_SHPOnR2(ele);
			if(shp != null) {
				Shape shape = getOrCreateShape(shp);
				if(!shapes.getShapes().contains(shape)) {
					shapes.getShapes().add(shape);
				}
			}
			Connector_c con = Connector_c.getOneGD_CONOnR2(ele);
			if(con != null) {
				Connector connector = getOrCreateConnector(con);
				if(!connectors.getConnectors().contains(connector)) {
					connectors.getConnectors().add(connector);
				}
			}
		});
	}

	private Connector createConnector(Connector_c con) {
		Connector connector = factory.createConnector();
		StartAnchor startAnchor = createStartAnchor(con);
		EndAnchor endAnchor = createEndAnchor(con);
		Anchors anchors = factory.createAnchors();
		if(startAnchor != null) {
			anchors.setStartAnchor(startAnchor);
		}
		if(endAnchor != null) {
			anchors.setEndAnchor(endAnchor);
		}
		connector.setRepresents(getPath(GraphicalElement_c.getOneGD_GEOnR2(con)));
		connector.setName(getNameFromPath(connector.getRepresents()));
		connector.setPolyline(createPolyline(con));
		connector.setAnchors(anchors);
		return connector;
	}

	private String getNameFromPath(String represents) {
		String[] parts = represents.split("::");
		return parts[parts.length - 1].replaceAll("\s", "").replaceAll(":", "__");
	}

	private Polyline createPolyline(Connector_c con) {
		Polyline polyline = factory.createPolyline();
		LineSegment_c[] segments = LineSegment_c.getManyGD_LSsOnR6(con);
		Stream.of(segments).forEach(seg -> {
			Waypoint_c startWay = Waypoint_c.getOneDIM_WAYOnR21(seg);
			Waypoint_c endWay = Waypoint_c.getOneDIM_WAYOnR22(seg);
			Segment segment = factory.createSegment();
			Point start = factory.createPoint();
			start.setX((int) startWay.getPositionx());
			start.setY((int) startWay.getPositiony());
			Point end = factory.createPoint();
			end.setX((int) endWay.getPositionx());
			end.setY((int) endWay.getPositiony());
			segment.setStartPoint(start);
			segment.setEndPoint(end);
			polyline.getSegments().add(segment);
		});
		return polyline;
	}

	private Shape createShape(Shape_c shp) {
		GraphicalElement_c ele = GraphicalElement_c.getOneGD_GEOnR2(shp);
		Graphelement_c ge = Graphelement_c.getOneDIM_GEOnR23(ele);
		Graphnode_c node = Graphnode_c.getOneDIM_NDOnR19(shp);
		Shape shape = factory.createShape();
		Rectangle rect = factory.createRectangle();
		rect.setX((int) ge.getPositionx());
		rect.setY((int) ge.getPositiony());
		rect.setW((int) node.getWidth());
		rect.setH((int) node.getHeight());
		shape.setRect(rect);
		shape.setRepresents(getPath(ele));
		shape.setName(getNameFromPath(shape.getRepresents()));
		return shape;
	}

	private String getPath(GraphicalElement_c ele) {
		return getPath((NonRootModelElement) ele.getRepresents());
	}
	
	private String getPath(NonRootModelElement nrme) {
		return nrme.getPath();
	}

	private StartAnchor createStartAnchor(Connector_c con) {
		StartAnchor startAnchor = null;
		Graphconnector_c graphConnector = Graphconnector_c.getOneDIM_CONOnR320(Graphedge_c.getOneDIM_EDOnR20(con));
		GraphicalElement_c startElem = GraphicalElement_c.getOneGD_GEOnR23(Graphelement_c.getOneDIM_GEOnR311(graphConnector));
		startAnchor = factory.createStartAnchor();
		if(startElem != null) {
			Shape_c shpAnchor = Shape_c.getOneGD_SHPOnR2(startElem);
			if(shpAnchor != null) {
				ShapeAnchorElement shapeAnchor = factory.createShapeAnchorElement();
				startAnchor.setAnchor(shapeAnchor);
				Shape shape = getOrCreateShape(shpAnchor);
				shapeAnchor.setElement(shape);
			} else {
				Connector_c conAnchor = Connector_c.getOneGD_CONOnR2(startElem);
				if(conAnchor != null) {
					ConnectorAnchorElement connectorAnchor = factory.createConnectorAnchorElement();
					startAnchor.setAnchor(connectorAnchor);
					Connector connector = getOrCreateConnector(conAnchor);
					connectorAnchor.setElement(connector);
				}
			}
		}
		// some connectors start on whitespace
		Point anchorPoint = factory.createPoint();
		if(startElem != null) {
			anchorPoint.setX((int) graphConnector.getPositionx());
			anchorPoint.setY((int) graphConnector.getPositiony());
		} else {
			// get the values from the first segment waypoint
			LineSegment_c[] segments = LineSegment_c.getManyGD_LSsOnR6(con);
			LineSegment_c firstSegment = segments[0];
			Waypoint_c startWayPoint = Waypoint_c.getOneDIM_WAYOnR21(firstSegment);
			anchorPoint.setX((int) startWayPoint.getPositionx());
			anchorPoint.setY((int) startWayPoint.getPositiony());	
		}
		startAnchor.setPoint(anchorPoint);
		return startAnchor;
	}

	private EndAnchor createEndAnchor(Connector_c con) {
		EndAnchor endAnchor = null;
		Graphconnector_c graphConnector = Graphconnector_c.getOneDIM_CONOnR321(Graphedge_c.getOneDIM_EDOnR20(con));
		GraphicalElement_c endElem = GraphicalElement_c.getOneGD_GEOnR23(Graphelement_c.getOneDIM_GEOnR311(graphConnector));
		endAnchor = factory.createEndAnchor();
		if(endElem != null) {
			Shape_c shpAnchor = Shape_c.getOneGD_SHPOnR2(endElem);
			if(shpAnchor != null) {
				ShapeAnchorElement shapeAnchor = factory.createShapeAnchorElement();
				endAnchor.setAnchor(shapeAnchor);
				Shape shape = getOrCreateShape(shpAnchor);
				shapeAnchor.setElement(shape);
			} else {
				Connector_c conAnchor = Connector_c.getOneGD_CONOnR2(endElem);
				if(conAnchor != null) {
					ConnectorAnchorElement connectorAnchor = factory.createConnectorAnchorElement();
					endAnchor.setAnchor(connectorAnchor);
					Connector connector = getOrCreateConnector(conAnchor);
					connectorAnchor.setElement(connector);
				}
			}
		}
		// some connectors end on whitespace
		Point anchorPoint = factory.createPoint();
		if(endElem != null) {
			anchorPoint.setX((int) graphConnector.getPositionx());
			anchorPoint.setY((int) graphConnector.getPositiony());
		} else {
			// get the values from the last segment waypoint
			LineSegment_c[] segments = LineSegment_c.getManyGD_LSsOnR6(con);
			LineSegment_c lastSegment = segments[segments.length - 1];
			Waypoint_c endWayPoint = Waypoint_c.getOneDIM_WAYOnR22(lastSegment);
			anchorPoint.setX((int) endWayPoint.getPositionx());
			anchorPoint.setY((int) endWayPoint.getPositiony());	
		}
		endAnchor.setPoint(anchorPoint);
		return endAnchor;
	}
	
	private Connector getOrCreateConnector(Connector_c anchor) {
		Connector connector = null;
		GraphicalElement_c ge = GraphicalElement_c.getOneGD_GEOnR2(anchor);
		for(GraphicalElement elem : model.getElements()) {
			if(elem instanceof Connectors) {
				for(Connector potential : ((Connectors) elem).getConnectors()) {
					if(potential.getRepresents().equals(getPath(ge))) {
						connector = potential;
						break;
					}
				}
			}
		}
		if(connector == null) {
			connector = createConnector(anchor);
			for(GraphicalElement ele : model.getElements()) {
				if(ele instanceof Connectors) {
					((Connectors) ele).getConnectors().add(connector);
					break;
				}
			};
		}
		return connector;
	}

	private Shape getOrCreateShape(Shape_c anchor) {
		Shape shape = null;
		GraphicalElement_c ge = GraphicalElement_c.getOneGD_GEOnR2(anchor);
		for(GraphicalElement elem : model.getElements()) {
			if(elem instanceof Shapes) {
				for(Shape potential : ((Shapes) elem).getShapes()) {
					if(potential.getRepresents().equals(getPath(ge))) {
						shape = potential;
						break;
					}
				}
			}
			if(shape != null) {
				break;
			}
		}
		if(shape == null) {
			shape = createShape(anchor);
			for(GraphicalElement ele : model.getElements()) {
				if(ele instanceof Shapes) {
					((Shapes) ele).getShapes().add(shape);
					break;
				}
			};
		}
		return shape;
	}
}
