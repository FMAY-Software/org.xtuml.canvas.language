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
import org.xtuml.bp.core.Gd_c;
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
import org.xtuml.bp.ui.canvas.Objectreference_c;
import org.xtuml.bp.ui.canvas.Referencepath_c;
import org.xtuml.bp.ui.canvas.references.ReferencePathManagement;

public class PathUtils {

	public static NonRootModelElement getElementByPath(String represents, NonRootModelElement parent) {
		Referencepath_c path = ReferencePathManagement.getPath(represents);
		if(path != null) {
			return (NonRootModelElement) path.getElement();
		}
		return null;
	}

//	public static NonRootModelElement getSubtypeRepresentation(String represents, NonRootModelElement supertype,
//			NonRootModelElement parent) {
//		List<NonRootModelElement> subtypes = SupertypeSubtypeUtil.getSubtypes(supertype);
//		for (NonRootModelElement subtype : subtypes) {
//			if (ReferencePathManagement.getPath(subtype).equals(represents)) {
//				return subtype;
//			} else {
//				NonRootModelElement element = getSubtypeRepresentation(represents, subtype, parent);
//				if (element != null) {
//					return element;
//				}
//			}
//		}
//		return null;
//	}

//	public static String ReferencePathManagement.getPath(NonRootModelElement ele, NonRootModelElement parent) {
//		if (ele instanceof PackageableElement_c) {
//			List<NonRootModelElement> subtypes = SupertypeSubtypeUtil.getSubtypes(ele);
//			if (subtypes != null) {
//				return subtypes.get(0).ReferencePathManagement.getPath();
//			}
//		}
//		// Special case for unnamed elements
//		if (ele instanceof TimingMark_c || ele instanceof TimeSpan_c || ele.ReferencePathManagement.getPath().equals(parent.ReferencePathManagement.getPath())) {
//			String name = ele.getClass().getSimpleName().replaceAll("_c", "")
//					+ ele.Get_ooa_id().getLeastSignificantBits();
//			return name;
//		}
//		return ele.ReferencePathManagement.getPath();
//	}
}
