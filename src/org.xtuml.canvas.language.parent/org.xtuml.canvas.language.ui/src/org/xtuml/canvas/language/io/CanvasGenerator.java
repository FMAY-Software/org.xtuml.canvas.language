package org.xtuml.canvas.language.io;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.xtuml.bp.core.Action_c;
import org.xtuml.bp.core.Association_c;
import org.xtuml.bp.core.ClassAsSubtype_c;
import org.xtuml.bp.core.ClassStateMachine_c;
import org.xtuml.bp.core.CreationTransition_c;
import org.xtuml.bp.core.Gd_c;
import org.xtuml.bp.core.ImportedClass_c;
import org.xtuml.bp.core.InstanceStateMachine_c;
import org.xtuml.bp.core.ModelClass_c;
import org.xtuml.bp.core.Package_c;
import org.xtuml.bp.core.PackageableElement_c;
import org.xtuml.bp.core.StateMachineState_c;
import org.xtuml.bp.core.StateMachine_c;
import org.xtuml.bp.core.SubtypeSupertypeAssociation_c;
import org.xtuml.bp.core.SystemModel_c;
import org.xtuml.bp.core.Transition_c;
import org.xtuml.bp.core.common.ModelRoot;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.PersistenceManager;
import org.xtuml.bp.ui.canvas.Connector_c;
import org.xtuml.bp.ui.canvas.Diagram_c;
import org.xtuml.bp.ui.canvas.Graphelement_c;
import org.xtuml.bp.ui.canvas.GraphicalElement_c;
import org.xtuml.bp.ui.canvas.Graphnode_c;
import org.xtuml.bp.ui.canvas.LineSegment_c;
import org.xtuml.bp.ui.canvas.ModelSpecification_c;
import org.xtuml.bp.ui.canvas.ModelTool_c;
import org.xtuml.bp.ui.canvas.Model_c;
import org.xtuml.bp.ui.canvas.Modeltype_c;
import org.xtuml.bp.ui.canvas.Ooaofgraphics;
import org.xtuml.bp.ui.canvas.Ooatype_c;
import org.xtuml.bp.ui.canvas.Waypoint_c;
import org.xtuml.canvas.language.canvas.Anchor;
import org.xtuml.canvas.language.canvas.Connector;
import org.xtuml.canvas.language.canvas.ConnectorAnchorElement;
import org.xtuml.canvas.language.canvas.Connectors;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.Segment;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.ShapeAnchorElement;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.ui.internal.LanguageActivator;

import com.google.inject.Inject;

public class CanvasGenerator {

	@Inject
	IResourceSetProvider resourceSetProvider;

	ModelRoot graphicsRoot;
	NonRootModelElement parent;
	CanvasWriter writer = new CanvasWriter();

	public void generate(NonRootModelElement parentElement, ModelRoot destinationRoot, IFile file)
			throws IOException, CoreException {
		if (!file.exists()) {
			writer.write(parentElement, file);
			// this is from a pre-canvas-language model
			// instances will exist already, just need to
			// write the new graphics file
			return;
		}
		// only create if necessary
		Model_c xtModel = Model_c.ModelInstance(Ooaofgraphics.getInstance(parentElement.getModelRoot().getId()),
				m -> ((Model_c) m).getRepresents() == parentElement);
		if (xtModel == null) {
			graphicsRoot = destinationRoot;
			parent = parentElement;
			LanguageActivator.getInstance().getInjector("org.xtuml.canvas.language.Canvas").injectMembers(this);
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			ResourceSet rs = resourceSetProvider.get(file.getProject());
			Resource r = rs.getResource(uri, true);
			EObject potentialModel = r.getContents().get(0);
			if (potentialModel != null && potentialModel instanceof Model) {
				// only one model supported at this time
				Model model = (Model) potentialModel;
				if (model.getProperties() != null) {
					xtModel = new Model_c(destinationRoot);
					int modelType = getModelType();
					xtModel.setModel_type(modelType);
					xtModel.setOoa_id(parent.Get_ooa_id());
					Diagram_c xtDiagram = new Diagram_c(destinationRoot);
					xtModel.relateAcrossR18To(xtDiagram);
					xtDiagram.setViewportx(model.getProperties().getPoint().getX());
					xtDiagram.setViewporty(model.getProperties().getPoint().getY());
					xtDiagram.setZoom(model.getProperties().getZoom());
					xtModel.setRepresents(parentElement);
					ModelSpecification_c[] modelSpecs = ModelSpecification_c
							.ModelSpecificationInstances(Ooaofgraphics.getDefaultInstance());
					for (ModelSpecification_c spec : modelSpecs) {
						if (spec.getModel_type() == modelType) {
							spec.relateAcrossR9To(xtModel);
							break;
						}
					}
					xtModel.Initializetools();
					createGraphicalElements(xtModel, model);
				}
			}
		}
	}

	private int getModelType() {
		if (parent instanceof SystemModel_c) {
			return Modeltype_c.SystemModelPackage;
		}
		if (parent instanceof Package_c) {
			return Modeltype_c.Package;
		}
		if (parent instanceof InstanceStateMachine_c) {
			return Modeltype_c.InstanceStateChartDiagram;
		}
		if (parent instanceof ClassStateMachine_c) {
			return Modeltype_c.ClassStateChartDiagram;
		}
		return Modeltype_c.OOA_UNINITIALIZED_ENUM;
	}

	private void createGraphicalElements(Model_c xtModel, Model model) {
		model.getElements().forEach(elem -> {
			if (elem instanceof Shapes) {
				Shapes shapes = (Shapes) elem;
				shapes.getShapes().forEach(shape -> {
					createShape(xtModel, shape);
				});
			}
			if (elem instanceof Connectors) {
				Connectors connectors = (Connectors) elem;
				connectors.getConnectors().forEach(connector -> {
					createConnector(xtModel, connector);
				});
			}
		});
	}

	private GraphicalElement_c getOrCreateShape(Model_c xtModel, Shape shape) {
		GraphicalElement_c existing = GraphicalElement_c.getOneGD_GEOnR1(xtModel,
				ge -> getPath((NonRootModelElement) ((GraphicalElement_c) ge).getRepresents())
						.equals(shape.getRepresents()));
		if (existing == null) {
			createShape(xtModel, shape);
		}
		existing = GraphicalElement_c.getOneGD_GEOnR1(xtModel,
				ge -> getPath((NonRootModelElement) ((GraphicalElement_c) ge).getRepresents())
						.equals(shape.getRepresents()));
		return existing;
	}

	private void createShape(Model_c xtModel, Shape shape) {
		NonRootModelElement representedElement = getElementByPath(shape.getRepresents());
		UUID toolId = getToolId(xtModel, representedElement);
		UUID shapeId = xtModel.Createshape(false, toolId);
		Graphelement_c graphElem = Graphelement_c.GraphelementInstance(graphicsRoot,
				ge -> ((Graphelement_c) ge).getElementid().equals(shapeId));
		GraphicalElement_c graphicalElem = GraphicalElement_c.getOneGD_GEOnR23(graphElem);
		graphicalElem.setRepresents(representedElement);
		graphElem.setPositionx(shape.getRect().getX());
		graphElem.setPositiony(shape.getRect().getY());
		Graphnode_c node = Graphnode_c.getOneDIM_NDOnR301(graphElem);
		node.setWidth(shape.getRect().getW());
		node.setHeight(shape.getRect().getH());
	}

	private GraphicalElement_c getOrCreateConnector(Model_c xtModel, Connector connector) {
		GraphicalElement_c existing = GraphicalElement_c.getOneGD_GEOnR1(xtModel,
				ge -> getPath((NonRootModelElement) ((GraphicalElement_c) ge).getRepresents())
						.equals(connector.getRepresents()));
		if (existing == null) {
			createConnector(xtModel, connector);
		}
		existing = GraphicalElement_c.getOneGD_GEOnR1(xtModel,
				ge -> getPath((NonRootModelElement) ((GraphicalElement_c) ge).getRepresents())
						.equals(connector.getRepresents()));
		return existing;
	}

	private void createConnector(Model_c xtModel, Connector connector) {
		NonRootModelElement representedElement = getElementByPath(connector.getRepresents());
		UUID toolId = getToolId(xtModel, representedElement);
		GraphicalElement_c startElem = getStartElement(xtModel, connector);
		UUID startElemId = Gd_c.Null_unique_id();
		if (startElem == null) {
			startElemId = xtModel.getDiagramid();
		} else {
			startElemId = startElem.getElementid();
		}
		GraphicalElement_c endElem = getEndElement(xtModel, connector);
		UUID endElemId = Gd_c.Null_unique_id();
		if (endElem == null) {
			endElemId = xtModel.getDiagramid();
		} else {
			endElemId = endElem.getElementid();
		}
		UUID connId = xtModel.Createconnector(false, endElemId, startElemId, toolId,
				connector.getPolyline().getSegments().get(0).getStartPoint().getX(),
				connector.getPolyline().getSegments().get(0).getEndPoint().getX(),
				connector.getPolyline().getSegments().get(0).getStartPoint().getY(),
				connector.getPolyline().getSegments().get(0).getEndPoint().getY());
		if (!connId.equals(Gd_c.Null_unique_id())) {
			Graphelement_c graphElem = Graphelement_c.GraphelementInstance(graphicsRoot,
					ge -> ((Graphelement_c) ge).getElementid().equals(connId));
			GraphicalElement_c graphicalElem = GraphicalElement_c.getOneGD_GEOnR23(graphElem);
			createSegments(Connector_c.getOneGD_CONOnR2(graphicalElem), connector);
			graphicalElem.setRepresents(representedElement);
		}
	}

	private void createSegments(Connector_c xtCon, Connector connector) {
		// delete existing segment and replace with stored polyline segments
		LineSegment_c old = LineSegment_c.getOneGD_LSOnR6(xtCon);
		xtCon.unrelateAcrossR6From(old);
		old.Dispose();
		LineSegment_c lastSeg = null;
		for(Segment segment : connector.getPolyline().getSegments()) {
			LineSegment_c xtSeg = new LineSegment_c(xtCon.getModelRoot());
			xtSeg.relateAcrossR6To(xtCon);
			xtSeg.relateAcrossR7ToFollows(lastSeg);
			Waypoint_c startWay = new Waypoint_c(xtCon.getModelRoot());
			Waypoint_c endWay = new Waypoint_c(xtCon.getModelRoot());
			startWay.relateAcrossR21To(xtSeg);
			endWay.relateAcrossR22To(xtSeg);
			startWay.setPositionx(segment.getStartPoint().getX());
			startWay.setPositiony(segment.getStartPoint().getY());
			endWay.setPositionx(segment.getEndPoint().getX());
			endWay.setPositiony(segment.getEndPoint().getY());
			lastSeg = xtSeg;
		}
	}

	private GraphicalElement_c getEndElement(Model_c xtModel, Connector connector) {
		GraphicalElement_c endElem = null;
		Anchor anchor = connector.getAnchors().getEndAnchor().getAnchor();
		if (anchor != null) {
			if (anchor instanceof ShapeAnchorElement) {
				endElem = getOrCreateShape(xtModel, ((ShapeAnchorElement) anchor).getElement());
			} else {
				endElem = getOrCreateConnector(xtModel, ((ConnectorAnchorElement) anchor).getElement());
			}
		}
		return endElem;
	}

	private GraphicalElement_c getStartElement(Model_c xtModel, Connector connector) {
		GraphicalElement_c startElem = null;
		Anchor anchor = connector.getAnchors().getStartAnchor().getAnchor();
		if (anchor != null) {
			if (anchor instanceof ShapeAnchorElement) {
				startElem = getOrCreateShape(xtModel, ((ShapeAnchorElement) anchor).getElement());
			} else {
				startElem = getOrCreateConnector(xtModel, ((ConnectorAnchorElement) anchor).getElement());
			}
		}
		return startElem;
	}

	private NonRootModelElement getElementByPath(String represents) {
		// if ISM or ASM parent is StateMachine
		NonRootModelElement container = parent;
		if(parent instanceof InstanceStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((InstanceStateMachine_c) container);
		}
		if(parent instanceof ClassStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((ClassStateMachine_c) container);
		}
		List<?> children = PersistenceManager.getHierarchyMetaData().getChildren(container, false);
		Optional<?> findAny = children.stream().filter(c -> getPath((NonRootModelElement) c).equals(represents))
				.findAny();
		if (findAny.isPresent()) {
			return (NonRootModelElement) findAny.get();
		} else {
			// if not found, check for subtypes
			// NOTE: this may not be the most efficient approach
			if (parent instanceof Package_c) {
				Optional<ClassAsSubtype_c> potentialSub = Stream
						.of(ClassAsSubtype_c.getManyR_SUBsOnR213(SubtypeSupertypeAssociation_c.getManyR_SUBSUPsOnR206(Association_c
								.getManyR_RELsOnR8001(PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent)))))
						.filter(subsup -> getPath(subsup).equals(represents)).findFirst();
				if (potentialSub.isPresent()) {
					return potentialSub.get();
				}
			}
		}
		return null;
	}

	private String getPath(NonRootModelElement ele) {
		return ele.getPath();
	}
	
	private UUID getToolId(Model_c xtModel, NonRootModelElement represents) {
		ModelTool_c[] tools = ModelTool_c.getManyCT_MTLsOnR100(xtModel);
		for (int i = 0; i < tools.length; i++) {
			ModelTool_c tool = tools[i];
			if (tool.getOoa_type() == getTypeFromReference(represents)) {
				return tool.getTool_id();
			}
		}
		return Gd_c.Null_unique_id();
	}

	private int getTypeFromReference(NonRootModelElement represents) {
		if (represents instanceof ModelClass_c) {
			return Ooatype_c.Class;
		}
		if (represents instanceof Action_c) {
			return Ooatype_c.GenericAction;
		}
		if (represents instanceof Package_c) {
			return Ooatype_c.Package;
		}
		if (represents instanceof Association_c) {
			SubtypeSupertypeAssociation_c subSuper = SubtypeSupertypeAssociation_c
					.getOneR_SUBSUPOnR206((Association_c) represents);
			if (subSuper != null) {
				return Ooatype_c.Supertype;
			}
			return Ooatype_c.Association;
		}
		if (represents instanceof ClassAsSubtype_c) {
			return Ooatype_c.Subtype;
		}
		if (represents instanceof ImportedClass_c) {
			return Ooatype_c.ImportedClass;
		}
		if (represents instanceof Transition_c) {
			return Ooatype_c.Transition;
		}
		if (represents instanceof CreationTransition_c) {
			return Ooatype_c.CreationTransition;
		}
		if (represents instanceof StateMachineState_c) {
			return Ooatype_c.State;
		}
		return Ooatype_c.OOA_UNINITIALIZED_ENUM;
	}
}
