package organisationalChart.organisationalChart.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModeloDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return getOrganisation_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrganisation_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		organisationalChart.organisationalChart.Organisation modelElement = (organisationalChart.organisationalChart.Organisation) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEmployees().iterator(); it.hasNext();) {
			organisationalChart.organisationalChart.Individual_Role childElement = (organisationalChart.organisationalChart.Individual_Role) it
					.next();
			int visualID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID) {
				result
						.add(new organisationalChart.organisationalChart.diagram.part.ModeloNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getTeams().iterator(); it.hasNext();) {
			organisationalChart.organisationalChart.Team_Role childElement = (organisationalChart.organisationalChart.Team_Role) it
					.next();
			int visualID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID) {
				result
						.add(new organisationalChart.organisationalChart.diagram.part.ModeloNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getDepartments().iterator(); it
				.hasNext();) {
			organisationalChart.organisationalChart.Organisational_Unit childElement = (organisationalChart.organisationalChart.Organisational_Unit) it
					.next();
			int visualID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID) {
				result
						.add(new organisationalChart.organisationalChart.diagram.part.ModeloNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return getOrganisation_1000ContainedLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID:
			return getIndividual_Role_2001ContainedLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID:
			return getTeam_Role_2002ContainedLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID:
			return getOrganisational_Unit_2003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID:
			return getIndividual_Role_2001IncomingLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID:
			return getTeam_Role_2002IncomingLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID:
			return getOrganisational_Unit_2003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID:
			return getIndividual_Role_2001OutgoingLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID:
			return getTeam_Role_2002OutgoingLinks(view);
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID:
			return getOrganisational_Unit_2003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrganisation_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividual_Role_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTeam_Role_2002ContainedLinks(View view) {
		organisationalChart.organisationalChart.Team_Role modelElement = (organisationalChart.organisationalChart.Team_Role) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Team_Role_Members_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOrganisational_Unit_2003ContainedLinks(View view) {
		organisationalChart.organisationalChart.Organisational_Unit modelElement = (organisationalChart.organisationalChart.Organisational_Unit) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Organisational_Unit_Personnel_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIndividual_Role_2001IncomingLinks(View view) {
		organisationalChart.organisationalChart.Individual_Role modelElement = (organisationalChart.organisationalChart.Individual_Role) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Team_Role_Members_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Organisational_Unit_Personnel_4002(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTeam_Role_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrganisational_Unit_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIndividual_Role_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTeam_Role_2002OutgoingLinks(View view) {
		organisationalChart.organisationalChart.Team_Role modelElement = (organisationalChart.organisationalChart.Team_Role) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Team_Role_Members_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOrganisational_Unit_2003OutgoingLinks(View view) {
		organisationalChart.organisationalChart.Organisational_Unit modelElement = (organisationalChart.organisationalChart.Organisational_Unit) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Organisational_Unit_Personnel_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Team_Role_Members_4001(
			organisationalChart.organisationalChart.Individual_Role target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
					.getTeam_Role_Members()) {
				result
						.add(new organisationalChart.organisationalChart.diagram.part.ModeloLinkDescriptor(
								setting.getEObject(),
								target,
								organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_RoleMembers_4001,
								organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleMembersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Organisational_Unit_Personnel_4002(
			organisationalChart.organisationalChart.Individual_Role target,
			Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
					.getOrganisational_Unit_Personnel()) {
				result
						.add(new organisationalChart.organisationalChart.diagram.part.ModeloLinkDescriptor(
								setting.getEObject(),
								target,
								organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_UnitPersonnel_4002,
								organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitPersonnelEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Team_Role_Members_4001(
			organisationalChart.organisationalChart.Team_Role source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getMembers().iterator(); destinations
				.hasNext();) {
			organisationalChart.organisationalChart.Individual_Role destination = (organisationalChart.organisationalChart.Individual_Role) destinations
					.next();
			result
					.add(new organisationalChart.organisationalChart.diagram.part.ModeloLinkDescriptor(
							source,
							destination,
							organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_RoleMembers_4001,
							organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleMembersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Organisational_Unit_Personnel_4002(
			organisationalChart.organisationalChart.Organisational_Unit source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getPersonnel().iterator(); destinations
				.hasNext();) {
			organisationalChart.organisationalChart.Individual_Role destination = (organisationalChart.organisationalChart.Individual_Role) destinations
					.next();
			result
					.add(new organisationalChart.organisationalChart.diagram.part.ModeloLinkDescriptor(
							source,
							destination,
							organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_UnitPersonnel_4002,
							organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitPersonnelEditPart.VISUAL_ID));
		}
		return result;
	}

}
