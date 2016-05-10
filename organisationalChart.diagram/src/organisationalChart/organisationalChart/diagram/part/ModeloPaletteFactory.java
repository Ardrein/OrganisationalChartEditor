package organisationalChart.organisationalChart.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class ModeloPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOrganisationalChart1Group());
	}

	/**
	 * Creates "organisationalChart" palette tool group
	 * @generated
	 */
	private PaletteContainer createOrganisationalChart1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				organisationalChart.organisationalChart.diagram.part.Messages.OrganisationalChart1Group_title);
		paletteContainer.setId("createOrganisationalChart1Group"); //$NON-NLS-1$
		paletteContainer.add(createOrganisational_Unit1CreationTool());
		paletteContainer.add(createOrganisational_UnitPersonnel2CreationTool());
		paletteContainer.add(createIndividual_Role3CreationTool());
		paletteContainer.add(createTeam_Role4CreationTool());
		paletteContainer.add(createTeam_RoleMembers5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrganisational_Unit1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_Unit_2003);
		NodeToolEntry entry = new NodeToolEntry(
				organisationalChart.organisationalChart.diagram.part.Messages.Organisational_Unit1CreationTool_title,
				organisationalChart.organisationalChart.diagram.part.Messages.Organisational_Unit1CreationTool_desc,
				types);
		entry.setId("createOrganisational_Unit1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("/organisationalChart.edit/icons/full/obj16/organisationalUnit.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("/organisationalChart.edit/icons/full/obj16/organisationalUnit.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrganisational_UnitPersonnel2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_UnitPersonnel_4002);
		LinkToolEntry entry = new LinkToolEntry(
				organisationalChart.organisationalChart.diagram.part.Messages.Organisational_UnitPersonnel2CreationTool_title,
				organisationalChart.organisationalChart.diagram.part.Messages.Organisational_UnitPersonnel2CreationTool_desc,
				types);
		entry.setId("createOrganisational_UnitPersonnel2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes
						.getImageDescriptor(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_UnitPersonnel_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividual_Role3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Individual_Role_2001);
		NodeToolEntry entry = new NodeToolEntry(
				organisationalChart.organisationalChart.diagram.part.Messages.Individual_Role3CreationTool_title,
				organisationalChart.organisationalChart.diagram.part.Messages.Individual_Role3CreationTool_desc,
				types);
		entry.setId("createIndividual_Role3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("/organisationalChart.edit/icons/full/obj16/individual_role.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("icons/full/obj16/individual_role.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTeam_Role4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_Role_2002);
		NodeToolEntry entry = new NodeToolEntry(
				organisationalChart.organisationalChart.diagram.part.Messages.Team_Role4CreationTool_title,
				organisationalChart.organisationalChart.diagram.part.Messages.Team_Role4CreationTool_desc,
				types);
		entry.setId("createTeam_Role4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("/organisationalChart.edit/icons/full/obj16/team_role.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.findImageDescriptor("/organisationalChart.edit/icons/full/obj16/team_role.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTeam_RoleMembers5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_RoleMembers_4001);
		LinkToolEntry entry = new LinkToolEntry(
				organisationalChart.organisationalChart.diagram.part.Messages.Team_RoleMembers5CreationTool_title,
				organisationalChart.organisationalChart.diagram.part.Messages.Team_RoleMembers5CreationTool_desc,
				types);
		entry.setId("createTeam_RoleMembers5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes
						.getImageDescriptor(organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_RoleMembers_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
