package organisationalChart.organisationalChart.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class Organisational_UnitPersonnelReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public Organisational_UnitPersonnelReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof organisationalChart.organisationalChart.Organisational_Unit) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof organisationalChart.organisationalChart.Individual_Role && newEnd instanceof organisationalChart.organisationalChart.Organisational_Unit)) {
			return false;
		}
		return organisationalChart.organisationalChart.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOrganisational_UnitPersonnel_4002(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof organisationalChart.organisationalChart.Individual_Role && newEnd instanceof organisationalChart.organisationalChart.Individual_Role)) {
			return false;
		}
		return organisationalChart.organisationalChart.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy.LinkConstraints
				.canExistOrganisational_UnitPersonnel_4002(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getPersonnel().remove(getOldTarget());
		getNewSource().getPersonnel().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getPersonnel().remove(getOldTarget());
		getOldSource().getPersonnel().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.Organisational_Unit getOldSource() {
		return (organisationalChart.organisationalChart.Organisational_Unit) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.Organisational_Unit getNewSource() {
		return (organisationalChart.organisationalChart.Organisational_Unit) newEnd;
	}

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.Individual_Role getOldTarget() {
		return (organisationalChart.organisationalChart.Individual_Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.Individual_Role getNewTarget() {
		return (organisationalChart.organisationalChart.Individual_Role) newEnd;
	}
}
