package organisationalChart.organisationalChart.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class ModeloCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.diagram.part.ModeloCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected organisationalChart.organisationalChart.diagram.part.ModeloCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizardTitle);
		setDefaultPageImageDescriptor(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewOrganisationalChartWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new organisationalChart.organisationalChart.diagram.part.ModeloCreationWizardPage(
				"DiagramModelFile", getSelection(), "organisationalchart_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new organisationalChart.organisationalChart.diagram.part.ModeloCreationWizardPage(
				"DomainModelFile", getSelection(), "organisationalchart") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".organisationalchart_diagram".length()); //$NON-NLS-1$
					setFileName(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "organisationalchart")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								organisationalChart.organisationalChart.diagram.part.Messages.ModeloCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
