package organisationalChart.organisationalChart.diagram.edit.commands;

/**
 * @generated
 */
public class ModeloReorientConnectionViewCommand
		extends org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand {

	/**
 * @generated
 */
	private org.eclipse.core.runtime.IAdaptable edgeAdaptor;

	/**
 * @generated
 */
	public ModeloReorientConnectionViewCommand(
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain, String label) {
		super(editingDomain, label, null);
	}

	/**
 * @generated
 */
	public java.util.List getAffectedFiles() {
		org.eclipse.gmf.runtime.notation.View view =
				(org.eclipse.gmf.runtime.notation.View) edgeAdaptor.getAdapter(org.eclipse.gmf.runtime.notation.View.class);
		if (view != null) {
			return getWorkspaceFiles(view);
		}
		return super.getAffectedFiles();
	}

	/**
 * @generated
 */
	public org.eclipse.core.runtime.IAdaptable getEdgeAdaptor() {
		return edgeAdaptor;
	}

	/**
 * @generated
 */
	public void setEdgeAdaptor(org.eclipse.core.runtime.IAdaptable edgeAdaptor) {
		this.edgeAdaptor = edgeAdaptor;
	}

	/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor progressMonitor, org.eclipse.core.runtime.IAdaptable info) {
		assert null != edgeAdaptor : "Null child in ModeloReorientConnectionViewCommand"; //$NON-NLS-1$
		org.eclipse.gmf.runtime.notation.Edge edge = (org.eclipse.gmf.runtime.notation.Edge) getEdgeAdaptor().getAdapter(org.eclipse.gmf.runtime.notation.Edge.class);
		assert null != edge : "Null edge in ModeloReorientConnectionViewCommand"; //$NON-NLS-1$
		org.eclipse.gmf.runtime.notation.View tempView = edge.getSource();
		edge.setSource(edge.getTarget());
		edge.setTarget(tempView);
		return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
	}
}
