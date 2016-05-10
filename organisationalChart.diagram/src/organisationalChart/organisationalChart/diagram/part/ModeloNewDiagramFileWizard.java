package organisationalChart.organisationalChart.diagram.part;

/**
 * @generated
 */
public class ModeloNewDiagramFileWizard extends org.eclipse.jface.wizard.Wizard {

	/**
 * @generated
 */
	private 
organisationalChart.organisationalChart.diagram.application.WizardNewFileCreationPage myFileCreationPage;

	/**
 * @generated
 */
	private organisationalChart.organisationalChart.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
 * @generated
 */
	private org.eclipse.emf.transaction.TransactionalEditingDomain myEditingDomain;

	/**
 * @generated
 */
	public ModeloNewDiagramFileWizard(org.eclipse.emf.common.util.URI domainModelURI,
			org.eclipse.emf.ecore.EObject diagramRoot,
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
	    assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
	    assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new 
organisationalChart.organisationalChart.diagram.application.WizardNewFileCreationPage(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_CreationPageName, org.eclipse.jface.viewers.StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(org.eclipse.osgi.util.NLS.bind(
				organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_CreationPageDescription, 
				organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID));
		org.eclipse.core.runtime.IPath filePath;
		String fileName = org.eclipse.emf.common.util.URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI);  //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil.getUniqueFileName(
				filePath, fileName, "organisationalchart_diagram"));  //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage.setDescription(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

	   	myEditingDomain = editingDomain;
	}

	/**
 * @generated
 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
 * @generated
 */
	public boolean performFinish() {
		java.util.List affectedFiles = new java.util.LinkedList();
				org.eclipse.core.runtime.IPath diagramModelPath = myFileCreationPage.getContainerFullPath().append(myFileCreationPage.getFileName());
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createFileURI(diagramModelPath.toString());
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final org.eclipse.emf.ecore.resource.Resource diagramResource = resourceSet.createResource(diagramModelURI);
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command =
			new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(
				myEditingDomain, organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
					org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
						throws org.eclipse.core.commands.ExecutionException {
				int diagramVID = organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID) {
					return org.eclipse.gmf.runtime.common.core.command.CommandResult.newErrorCommandResult(
						organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_IncorrectRootError);
				}
				org.eclipse.gmf.runtime.notation.Diagram diagram =
					org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
						diagramRootElementSelectionPage.getModelElement(), organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID,
						organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
												return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(
				command, new org.eclipse.core.runtime.NullProgressMonitor(), null);
			diagramResource.save(organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil.getSaveOptions());
			organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorUtil.openDiagram(diagramResource);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin.getInstance().logError(
				"Unable to create model and diagram", e);  //$NON-NLS-1$
		} catch (java.io.IOException ex) {
			organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin.getInstance().logError(
				"Save operation failed for: " + diagramModelURI, ex);  //$NON-NLS-1$
		} catch (org.eclipse.ui.PartInitException ex) {
			organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin.getInstance().logError(
				"Unable to open editor", ex);  //$NON-NLS-1$
		}			
		return true;
	}

	/**
 * @generated
 */
	private static class DiagramRootElementSelectionPage extends organisationalChart.organisationalChart.diagram.part.ModelElementSelectionPage {

		/**
 * @generated
 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
 * @generated
 */
		protected String getSelectionTitle() {
			return organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
 * @generated
 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().provides(
				new org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation(
					new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(selectedModelElement),
					organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.MODEL_ID, organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null : organisationalChart.organisationalChart.diagram.part.Messages.ModeloNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
