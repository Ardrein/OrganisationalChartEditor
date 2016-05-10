package organisationalChart.organisationalChart.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModeloVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "organisationalChart.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID
					.equals(view.getType())) {
				return organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
				.getOrganisation().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((organisationalChart.organisationalChart.Organisation) domainElement)) {
			return organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getModelID(containerView);
		if (!organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			if (organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
					.getIndividual_Role().isSuperTypeOf(domainElement.eClass())) {
				return organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID;
			}
			if (organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
					.getTeam_Role().isSuperTypeOf(domainElement.eClass())) {
				return organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID;
			}
			if (organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
					.getOrganisational_Unit().isSuperTypeOf(
							domainElement.eClass())) {
				return organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
				.getModelID(containerView);
		if (!organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID:
			if (organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID:
			if (organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID:
			if (organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			if (organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			organisationalChart.organisationalChart.Organisation element) {
		return true;
	}

}
