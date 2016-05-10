package organisationalChart.organisationalChart.diagram.part;

/**
 * @generated
 */
public class ModeloDiagramActionBarContributor extends org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor {

	/**
 * @generated
 */
	protected Class getEditorClass() {
		return organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditor.class;
	}

	/**
 * @generated
 */
	protected String getEditorId() {
		return organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditor.ID;
	}
	
	/**
 * @generated
 */
	public void init(org.eclipse.ui.IActionBars bars, org.eclipse.ui.IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		org.eclipse.jface.action.IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(org.eclipse.ui.IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
	}
