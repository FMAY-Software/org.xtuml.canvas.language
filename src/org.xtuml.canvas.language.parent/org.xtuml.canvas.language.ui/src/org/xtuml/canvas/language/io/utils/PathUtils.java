package org.xtuml.canvas.language.io.utils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.xtuml.bp.core.Association_c;
import org.xtuml.bp.core.BinaryAssociation_c;
import org.xtuml.bp.core.ClassAsLink_c;
import org.xtuml.bp.core.ClassAsSubtype_c;
import org.xtuml.bp.core.ClassStateMachine_c;
import org.xtuml.bp.core.CommunicationLink_c;
import org.xtuml.bp.core.ComponentReference_c;
import org.xtuml.bp.core.Component_c;
import org.xtuml.bp.core.DataType_c;
import org.xtuml.bp.core.EnumerationDataType_c;
import org.xtuml.bp.core.ImportedProvision_c;
import org.xtuml.bp.core.ImportedReference_c;
import org.xtuml.bp.core.ImportedRequirement_c;
import org.xtuml.bp.core.InstanceStateMachine_c;
import org.xtuml.bp.core.InterfaceReference_c;
import org.xtuml.bp.core.LinkedAssociation_c;
import org.xtuml.bp.core.Package_c;
import org.xtuml.bp.core.PackageableElement_c;
import org.xtuml.bp.core.PortReference_c;
import org.xtuml.bp.core.Port_c;
import org.xtuml.bp.core.Provision_c;
import org.xtuml.bp.core.Requirement_c;
import org.xtuml.bp.core.StateMachine_c;
import org.xtuml.bp.core.StructuredDataType_c;
import org.xtuml.bp.core.SubtypeSupertypeAssociation_c;
import org.xtuml.bp.core.TimeSpan_c;
import org.xtuml.bp.core.TimingMark_c;
import org.xtuml.bp.core.UserDataType_c;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.PersistenceManager;
import org.xtuml.bp.core.util.SupertypeSubtypeUtil;

public class PathUtils {

	public static NonRootModelElement getElementByPath(String represents, NonRootModelElement parent) {
		// if ISM or ASM parent is StateMachine
		NonRootModelElement container = parent;
		if (parent instanceof InstanceStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((InstanceStateMachine_c) container);
		}
		if (parent instanceof ClassStateMachine_c) {
			container = StateMachine_c.getOneSM_SMOnR517((ClassStateMachine_c) container);
		}
		// Special-case looking for communication links, which are connected through
		// the start anchor element
		if (parent instanceof Package_c) {
			// just search all instances in this case, otherwise the navigations are
			// unwieldy
			CommunicationLink_c link = CommunicationLink_c.CommunicationLinkInstance(parent.getModelRoot(),
					l -> getPath((CommunicationLink_c) l, parent).equals(represents));
			if (link != null) {
				return link;
			}
			TimingMark_c mark = TimingMark_c.TimingMarkInstance(parent.getModelRoot(),
					m -> getPath(((TimingMark_c) m), parent).equals(represents));
			if (mark != null) {
				return mark;
			}
			TimeSpan_c span = TimeSpan_c.TimeSpanInstance(parent.getModelRoot(),
					s -> getPath(((TimeSpan_c) s), parent).equals(represents));
			if (span != null) {
				return span;
			}
			BinaryAssociation_c ba = BinaryAssociation_c.BinaryAssociationInstance(parent.getModelRoot(),
					a -> getPath(((BinaryAssociation_c) a), parent).equals(represents));
			if (ba != null) {
				return ba;
			}
		}
		List<?> children = PersistenceManager.getHierarchyMetaData().getChildren(container, false);
		Optional<?> findAny = children.stream().filter(c -> getPath((NonRootModelElement) c, parent).equals(represents))
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
			// if not found, check for special cases and situations where a subtype is used
			// to represent the
			// graphic
			// Special Cases
			if (parent instanceof Package_c) {
				Optional<ClassAsSubtype_c> potentialSub = Stream
						.of(ClassAsSubtype_c.getManyR_SUBsOnR213(
								SubtypeSupertypeAssociation_c.getManyR_SUBSUPsOnR206(Association_c.getManyR_RELsOnR8001(
										PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent)))))
						.filter(subsup -> getPath(subsup, parent).equals(represents)).findFirst();
				if (potentialSub.isPresent()) {
					return potentialSub.get();
				}
				Optional<ClassAsLink_c> potentialLink = Stream
						.of(ClassAsLink_c.getManyR_ASSRsOnR211(LinkedAssociation_c.getManyR_ASSOCsOnR206(Association_c
								.getManyR_RELsOnR8001(PackageableElement_c.getManyPE_PEsOnR8000((Package_c) parent)))))
						.filter(link -> getPath(link, parent).equals(represents)).findFirst();
				if (potentialLink.isPresent()) {
					return potentialLink.get();
				}
				Component_c[] comps = Stream.of(children.toArray()).filter(child -> child instanceof Component_c)
						.collect(Collectors.toList()).toArray(new Component_c[0]);
				Optional<Requirement_c> potentialReq = Stream
						.of(Requirement_c.getManyC_RsOnR4009(
								InterfaceReference_c.getManyC_IRsOnR4016(Port_c.getManyC_POsOnR4010(comps))))
						.filter(req -> getPath(req, parent).equals(represents)).findFirst();
				if (potentialReq.isPresent()) {
					return potentialReq.get();
				}
				Optional<Provision_c> potentialPro = Stream
						.of(Provision_c.getManyC_PsOnR4009(
								InterfaceReference_c.getManyC_IRsOnR4016(Port_c.getManyC_POsOnR4010(comps))))
						.filter(pro -> getPath(pro, parent).equals(represents)).findFirst();
				if (potentialPro.isPresent()) {
					return potentialPro.get();
				}
				ComponentReference_c[] compRefs = Stream.of(children.toArray())
						.filter(child -> child instanceof ComponentReference_c).collect(Collectors.toList())
						.toArray(new ComponentReference_c[0]);
				Optional<ImportedRequirement_c> potentialImportedReq = Stream
						.of(ImportedRequirement_c.getManyCL_IRsOnR4703(ImportedReference_c
								.getManyCL_IIRsOnR4708(PortReference_c.getManyCL_PORsOnR4707(compRefs))))
						.filter(req -> getPath(req, parent).equals(represents)).findFirst();
				if (potentialImportedReq.isPresent()) {
					return potentialImportedReq.get();
				}
				Optional<ImportedProvision_c> potentialImportedPro = Stream
						.of(ImportedProvision_c.getManyCL_IPsOnR4703(ImportedReference_c
								.getManyCL_IIRsOnR4708(PortReference_c.getManyCL_PORsOnR4707(compRefs))))
						.filter(req -> getPath(req, parent).equals(represents)).findFirst();
				if (potentialImportedPro.isPresent()) {
					return potentialImportedPro.get();
				}
			}
			// Subtypes
			for (Object child : children) {
				NonRootModelElement element = getSubtypeRepresentation(represents, (NonRootModelElement) child, parent);
				if (element != null) {
					return element;
				}
			}
		}
		return null;
	}

	public static NonRootModelElement getSubtypeRepresentation(String represents, NonRootModelElement supertype,
			NonRootModelElement parent) {
		List<NonRootModelElement> subtypes = SupertypeSubtypeUtil.getSubtypes(supertype);
		for (NonRootModelElement subtype : subtypes) {
			if (getPath(subtype, parent).equals(represents)) {
				return subtype;
			} else {
				NonRootModelElement element = getSubtypeRepresentation(represents, subtype, parent);
				if (element != null) {
					return element;
				}
			}
		}
		return null;
	}

	public static String getPath(NonRootModelElement ele, NonRootModelElement parent) {
		if (ele instanceof PackageableElement_c) {
			List<NonRootModelElement> subtypes = SupertypeSubtypeUtil.getSubtypes(ele);
			if (subtypes != null) {
				return subtypes.get(0).getPath();
			}
		}
		// Special case for unnamed elements
		if (ele instanceof TimingMark_c || ele instanceof TimeSpan_c || ele.getPath().equals(parent.getPath())) {
			String name = ele.getClass().getSimpleName().replaceAll("_c", "")
					+ ele.Get_ooa_id().getLeastSignificantBits();
			return name;
		}
		return ele.getPath();
	}
}
