package organisationalChart.organisationalChart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class Team_RoleMembersItemSemanticEditPolicy
		extends
		organisationalChart.organisationalChart.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Team_RoleMembersItemSemanticEditPolicy() {
		super(
				organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Team_RoleMembers_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
