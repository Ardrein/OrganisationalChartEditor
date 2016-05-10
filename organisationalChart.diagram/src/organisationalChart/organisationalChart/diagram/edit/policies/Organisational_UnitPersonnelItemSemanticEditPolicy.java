package organisationalChart.organisationalChart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class Organisational_UnitPersonnelItemSemanticEditPolicy
		extends
		organisationalChart.organisationalChart.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Organisational_UnitPersonnelItemSemanticEditPolicy() {
		super(
				organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.Organisational_UnitPersonnel_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
