package organisationalChart.organisationalChart.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class OrganisationItemSemanticEditPolicy
		extends
		organisationalChart.organisationalChart.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OrganisationItemSemanticEditPolicy() {
		super(
				organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisation_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Individual_Role_2001 == req
				.getElementType()) {
			return getGEFWrapper(new organisationalChart.organisationalChart.diagram.edit.commands.Individual_RoleCreateCommand(
					req));
		}
		if (organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_Role_2002 == req
				.getElementType()) {
			return getGEFWrapper(new organisationalChart.organisationalChart.diagram.edit.commands.Team_RoleCreateCommand(
					req));
		}
		if (organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_Unit_2003 == req
				.getElementType()) {
			return getGEFWrapper(new organisationalChart.organisationalChart.diagram.edit.commands.Organisational_UnitCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
