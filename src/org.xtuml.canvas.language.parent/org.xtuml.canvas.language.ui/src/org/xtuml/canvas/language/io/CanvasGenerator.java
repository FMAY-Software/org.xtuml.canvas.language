package org.xtuml.canvas.language.io;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.xtuml.bp.core.AcceptEvent_c;
import org.xtuml.bp.core.AcceptTimeEventAction_c;
import org.xtuml.bp.core.ActionNode_c;
import org.xtuml.bp.core.Action_c;
import org.xtuml.bp.core.ActivityNode_c;
import org.xtuml.bp.core.Association_c;
import org.xtuml.bp.core.ClassAsLink_c;
import org.xtuml.bp.core.ClassAsSubtype_c;
import org.xtuml.bp.core.ClassStateMachine_c;
import org.xtuml.bp.core.Component_c;
import org.xtuml.bp.core.CreationTransition_c;
import org.xtuml.bp.core.DataType_c;
import org.xtuml.bp.core.EnumerationDataType_c;
import org.xtuml.bp.core.ExternalEntity_c;
import org.xtuml.bp.core.Gd_c;
import org.xtuml.bp.core.ImportedClass_c;
import org.xtuml.bp.core.InstanceStateMachine_c;
import org.xtuml.bp.core.LinkedAssociation_c;
import org.xtuml.bp.core.ModelClass_c;
import org.xtuml.bp.core.Package_c;
import org.xtuml.bp.core.PackageableElement_c;
import org.xtuml.bp.core.StateMachineState_c;
import org.xtuml.bp.core.StateMachine_c;
import org.xtuml.bp.core.StructuredDataType_c;
import org.xtuml.bp.core.SubtypeSupertypeAssociation_c;
import org.xtuml.bp.core.SystemModel_c;
import org.xtuml.bp.core.Transition_c;
import org.xtuml.bp.core.UserDataType_c;
import org.xtuml.bp.core.common.ModelRoot;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.PersistenceManager;
import org.xtuml.bp.core.util.SupertypeSubtypeUtil;
import org.xtuml.bp.ui.canvas.Connector_c;
import org.xtuml.bp.ui.canvas.Diagram_c;
import org.xtuml.bp.ui.canvas.ElementSpecification_c;
import org.xtuml.bp.ui.canvas.FloatingText_c;
import org.xtuml.bp.ui.canvas.Graphedge_c;
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
import org.xtuml.bp.ui.canvas.Shape_c;
import org.xtuml.bp.ui.canvas.Waypoint_c;
import org.xtuml.bp.ui.canvas.persistence.IGraphicalLoader;
import org.xtuml.canvas.language.canvas.Anchor;
import org.xtuml.canvas.language.canvas.Connector;
import org.xtuml.canvas.language.canvas.ConnectorAnchorElement;
import org.xtuml.canvas.language.canvas.Connectors;
import org.xtuml.canvas.language.canvas.FloatingText;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.Segment;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.ShapeAnchorElement;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.io.utils.EnumUtils;
import org.xtuml.canvas.language.ui.internal.LanguageActivator;

import com.google.inject.Inject;

public class CanvasGenerator implements IGraphicalLoader {

	@Inject
	IResourceSetProvider resourceSetProvider;

	ModelRoot graphicsRoot;
	NonRootModelElement parent;
	CanvasWriter writer = new CanvasWriter();

	@Override
	public void initialize() {
	}

	@Override
	public Model_c load(Object container) {
		if (container instanceof NonRootModelElement) {
			NonRootModelElement parentElement = (NonRootModelElement) container;
			IFile parentFile = parentElement.getFile();
			IFile xtGraphFile = parentFile.getParent()
					.getFile(new Path(parentFile.getName().replaceAll(".xtuml", ".xtumlg")));
			try {
				return generate(parentElement, Ooaofgraphics.getInstance(parentElement.getModelRoot().getId()),
						xtGraphFile);
			} catch (IOException | CoreException e) {
				// TODO: implement logging
			}
		}
		return null;
	}

	public Model_c generate(NonRootModelElement parentElement, ModelRoot destinationRoot, IFile file)
			throws IOException, CoreException {
		if (!file.exists()) {
			writer.write(parentElement, file);
			// this is from a pre-canvas-language model
			// instances will exist already, just need to
			// write the new graphics file
			return null;
		}
		// only create if necessary
		Model_c xtModel = Model_c.ModelInstance(Ooaofgraphics.getInstance(parentElement.getModelRoot().getId()),
				m -> ((Model_c) m).getRepresents() == parentElement);
		if (xtModel != null) {
			// for now just recreate, should be fast enough, if it
			// gets to a point were its too slow add updated support
			xtModel.Dispose();
		}
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
			xtModel = new Model_c(destinationRoot);
			int modelType = getModelType();
			xtModel.setModel_type(modelType);
			xtModel.setOoa_id(parent.Get_ooa_id());
			Diagram_c xtDiagram = new Diagram_c(destinationRoot);
			xtModel.relateAcrossR18To(xtDiagram);
			if (model.getProperties() != null) {
				xtDiagram.setViewportx(model.getProperties().getPoint().getX());
				xtDiagram.setViewporty(model.getProperties().getPoint().getY());
				xtDiagram.setZoom(model.getProperties().getZoom());
			}
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
		return xtModel;
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
		if (parent instanceof Component_c) {
			return Modeltype_c.ComponentDiagram;
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

	private void updateTextPosition(FloatingText_c txt, FloatingText text) {
		Graphnode_c node = Graphnode_c.getOneDIM_NDOnR19(txt);
		Graphelement_c ge = Graphelement_c.getOneDIM_GEOnR301(node);
		ge.setPositionx(text.getBounds().getX());
		ge.setPositiony(text.getBounds().getY());
		node.setWidth(text.getBounds().getW());
		node.setHeight(text.getBounds().getH());
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
		String container = shape.getContainer();
		NonRootModelElement representedElement = getElementByPath(shape.getRepresents());
		if (representedElement == null) {
			// this is likely a manual addition, we do not support
			// creation at this time. Mostly because there is no
			// good way to set the name, and or figure out the unnamed variant
			return;
		}
		UUID toolId = getToolId(xtModel, representedElement, container != null);
		UUID shapeId = xtModel.Createshape(representedElement == null, toolId);
		Graphelement_c graphElem = Graphelement_c.GraphelementInstance(graphicsRoot,
				ge -> ((Graphelement_c) ge).getElementid().equals(shapeId));
		GraphicalElement_c graphicalElem = GraphicalElement_c.getOneGD_GEOnR23(graphElem);
		Shape_c shp = Shape_c.getOneGD_SHPOnR2(graphicalElem);
		graphicalElem.setRepresents(representedElement);
		graphicalElem.setOoa_id(representedElement.Get_ooa_id());
		graphElem.setPositionx(shape.getBounds().getX());
		graphElem.setPositiony(shape.getBounds().getY());
		Graphnode_c node = Graphnode_c.getOneDIM_NDOnR301(graphElem);
		node.setWidth(shape.getBounds().getW());
		node.setHeight(shape.getBounds().getH());
		// Floating text will have been created with the call to API
		FloatingText_c txt = FloatingText_c.getOneGD_CTXTOnR27(shp);
		if (txt != null) {
			updateTextPosition(txt, shape.getText());
		}
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
		if (representedElement == null) {
			// this is likely a manual addition, we do not support
			// creation at this time. Mostly because there is no
			// good way to set the name, and or figure out the unnamed variant
			return;
		}
		UUID toolId = getToolId(xtModel, representedElement, false);
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
			Connector_c con = Connector_c.getOneGD_CONOnR2(graphicalElem);
			graphicalElem.setOoa_id(representedElement.Get_ooa_id());
			createSegments(Connector_c.getOneGD_CONOnR2(graphicalElem), connector);
			graphicalElem.setRepresents(representedElement);
			// API will have created Floating texts
			Stream.of(FloatingText_c.getManyGD_CTXTsOnR8(con)).forEach(txt -> {
				Optional<FloatingText> potentialtext = Stream
						.of(connector.getTexts().getTexts().toArray(new FloatingText[0]))
						.filter(floatingText -> floatingText.getEnd().getWhere().equals(EnumUtils.endFor(txt.getEnd())))
						.findFirst();
				if (potentialtext.isPresent()) {
					updateTextPosition(txt, potentialtext.get());
				}
			});
		}
	}

	private void createSegments(Connector_c xtCon, Connector connector) {
		// delete existing segments and replace with stored polyline segments
		Stream.of(LineSegment_c.getManyGD_LSsOnR6(xtCon)).forEach(seg -> {
			xtCon.unrelateAcrossR6From(seg);
			seg.Dispose();
		});
		LineSegment_c lastSeg = null;
		Graphedge_c edge = Graphedge_c.getOneDIM_EDOnR20(xtCon);
		for (Segment segment : connector.getPolyline().getSegments()) {
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
			startWay.relateAcrossR324ToPrecedes(endWay);
			edge.relateAcrossR319To(startWay);
			edge.relateAcrossR319To(endWay);
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
		if (parent instanceof InstanceStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((InstanceStateMachine_c) container);
		}
		if (parent instanceof ClassStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((ClassStateMachine_c) container);
		}
		List<?> children = PersistenceManager.getHierarchyMetaData().getChildren(container, false);
		Optional<?> findAny = children.stream().filter(c -> getPath((NonRootModelElement) c).equals(represents))
				.findAny();
		if (findAny.isPresent()) {
			NonRootModelElement result = (NonRootModelElement) findAny.get();
			if (result instanceof PackageableElement_c) {
				result = SupertypeSubtypeUtil.getSubtypes(result).get(0);
			}
			if (result instanceof DataType_c) {
				UserDataType_c udt = UserDataType_c.getOneS_UDTOnR17((DataType_c) result);
				if (udt != null) {
					return udt;
				}
				EnumerationDataType_c edt = EnumerationDataType_c.getOneS_EDTOnR17((DataType_c) result);
				if (edt != null) {
					return edt;
				}
				StructuredDataType_c sdt = StructuredDataType_c.getOneS_SDTOnR17((DataType_c) result);
				if (sdt != null) {
					return sdt;
				}
			}
			return result;
		} else {
			// if not found, check for situations where a subtype is used to represent the
			// graphic
			// NOTE: this may not be the most efficient approach
			if (parent instanceof Package_c) {
				Optional<ClassAsSubtype_c> potentialSub = Stream
						.of(ClassAsSubtype_c.getManyR_SUBsOnR213(
								SubtypeSupertypeAssociation_c.getManyR_SUBSUPsOnR206(Association_c.getManyR_RELsOnR8001(
										PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent)))))
						.filter(subsup -> getPath(subsup).equals(represents)).findFirst();
				if (potentialSub.isPresent()) {
					return potentialSub.get();
				}
				Optional<ClassAsLink_c> potentialLink = Stream
						.of(ClassAsLink_c.getManyR_ASSRsOnR211(LinkedAssociation_c.getManyR_ASSOCsOnR206(Association_c
								.getManyR_RELsOnR8001(PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent)))))
						.filter(link -> getPath(link).equals(represents)).findFirst();
				if (potentialLink.isPresent()) {
					return potentialLink.get();
				}
				Optional<AcceptTimeEventAction_c> potentialAcceptTime = Stream
						.of(AcceptTimeEventAction_c.getManyA_ATEsOnR1112(AcceptEvent_c.getManyA_AEsOnR1107(
								ActionNode_c.getManyA_ACTsOnR1105(ActivityNode_c.getManyA_NsOnR8001(
										PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent))))))
						.filter(acc -> getPath(acc).equals(represents)).findFirst();
				if (potentialAcceptTime.isPresent()) {
					return potentialAcceptTime.get();
				}
			}
			if (container instanceof StateMachine_c) {
				Optional<CreationTransition_c> potentialCreationTrans = Stream
						.of(CreationTransition_c
								.getManySM_CRTXNsOnR507(Transition_c.getManySM_TXNsOnR505((StateMachine_c) container)))
						.filter(crt -> getPath(crt).equals(represents)).findFirst();
				if (potentialCreationTrans.isPresent()) {
					return potentialCreationTrans.get();
				}
			}
		}
		return null;
	}

	private String getPath(NonRootModelElement ele) {
		if (ele instanceof PackageableElement_c) {
			List<NonRootModelElement> subtypes = SupertypeSubtypeUtil.getSubtypes(ele);
			if (subtypes != null) {
				return subtypes.get(0).getPath();
			}
		}
		return ele.getPath();
	}

	private UUID getToolId(Model_c xtModel, NonRootModelElement represents, boolean container) {
		ModelTool_c[] tools = ModelTool_c.getManyCT_MTLsOnR100(xtModel);
		for (int i = 0; i < tools.length; i++) {
			ModelTool_c tool = tools[i];
			if (tool.getOoa_type() == getTypeFromReference(represents, container)) {
				ElementSpecification_c spec = ElementSpecification_c.getOneGD_ESOnR103(tool);
				if (!container) {
					return tool.getTool_id();
				}
				if (container && spec.getSymboltype().equals("container")) {
					return tool.getTool_id();
				}
			}
		}
		return Gd_c.Null_unique_id();
	}

	private int getTypeFromReference(NonRootModelElement represents, boolean container) {
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
		if (represents instanceof UserDataType_c) {
			return Ooatype_c.UserDataType;
		}
		if (represents instanceof EnumerationDataType_c) {
			return Ooatype_c.EnumerationDataType;
		}
		if (represents instanceof StructuredDataType_c) {
			return Ooatype_c.StructuredDataType;
		}
		if (represents instanceof ExternalEntity_c) {
			return Ooatype_c.EE;
		}
		if (represents instanceof ClassAsLink_c) {
			return Ooatype_c.AssociativeLink;
		}
		if (represents instanceof AcceptTimeEventAction_c) {
			return Ooatype_c.AcceptTimeEventAction;
		}
		if (represents instanceof Component_c) {
			if (container) {
				return Ooatype_c.ComponentContainer;
			}
			return Ooatype_c.Component;
		}

		return Ooatype_c.OOA_UNINITIALIZED_ENUM;
	}
}
