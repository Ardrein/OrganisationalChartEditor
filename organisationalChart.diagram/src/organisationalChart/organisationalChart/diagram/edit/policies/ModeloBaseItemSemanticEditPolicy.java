package organisationalChart.organisationalChart.diagram.edit.policies;

/**
 * @generated
 */
public class ModeloBaseItemSemanticEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy {

		/**
 * Extended request data key to hold editpart visual id.
 * @generated
 */
	public static final String VISUAL_ID_KEY = "visual_id";  //$NON-NLS-1$

	/**
 * @generated
 */
	private final org.eclipse.gmf.runtime.emf.type.core.IElementType myElementType;
	
		/**
 * @generated
 */
	protected ModeloBaseItemSemanticEditPolicy(org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
		myElementType = elementType;
	}

	/**
 * Extended request data key to hold editpart visual id.
 * Add visual id of edited editpart to extended data of the request
 * so command switch can decide what kind of diagram element is being edited.
 * It is done in those cases when it's not possible to deduce diagram
 * element kind from domain element.
 * 
 * @generated
 */
	public org.eclipse.gef.commands.Command getCommand(org.eclipse.gef.Request request) {
		if (request instanceof org.eclipse.gef.requests.ReconnectRequest) {
			Object view = ((org.eclipse.gef.requests.ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof org.eclipse.gmf.runtime.notation.View) {
				Integer id = new Integer(organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry.getVisualID((org.eclipse.gmf.runtime.notation.View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}
	
	/**
 * Returns visual id from request parameters.
 * @generated
 */
	protected int getVisualID(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

		/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
	org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest completedRequest = completeRequest(request);
	org.eclipse.gef.commands.Command semanticCommand = getSemanticCommandSwitch(completedRequest);
	semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
	if (completedRequest instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) {
		org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest destroyRequest = (org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest) completedRequest;
		return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command addDeleteViewCommand(org.eclipse.gef.commands.Command mainCommand, org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest completedRequest){
		org.eclipse.gef.commands.Command deleteViewCommand = getGEFWrapper(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), (org.eclipse.gmf.runtime.notation.View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
}
	
		/**
 * @generated
 */
	private org.eclipse.gef.commands.Command getEditHelperCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request, org.eclipse.gef.commands.Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			org.eclipse.gmf.runtime.common.core.command.ICommand command = editPolicyCommand instanceof org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy ? ((org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy) editPolicyCommand).getICommand() : new org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy(editPolicyCommand);
			request.setParameter(organisationalChart.organisationalChart.diagram.edit.helpers.ModeloBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(organisationalChart.organisationalChart.diagram.edit.helpers.ModeloBaseEditHelper.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		org.eclipse.gmf.runtime.common.core.command.ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(organisationalChart.organisationalChart.diagram.edit.helpers.ModeloBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(organisationalChart.organisationalChart.diagram.edit.helpers.ModeloBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand)) {
				command = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(command);
		}
		return editPolicyCommand;
	}
	
		/**
 * @generated
 */
	private org.eclipse.gmf.runtime.emf.type.core.IElementType getContextElementType(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest request) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType requestContextElementType = organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSemanticCommandSwitch(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest req) {
	if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) {
		return getCreateRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) {
		return getCreateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) {
		return getConfigureCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) {
		return getDestroyElementCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) {
		return getDestroyReferenceCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) {
		return getDuplicateCommand((org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) {
		return getEditContextCommand((org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) {
		return getMoveCommand((org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) {
		return getReorientReferenceRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) {
		return getReorientRelationshipCommand((org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest) req);
	} else if (req instanceof org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) {
		return getSetCommand((org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest) req);
	}
	return null;
}
	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getSetCommand(org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getEditContextCommand(org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyReferenceCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDuplicateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getMoveCommand(org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest req) {
	return null;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientReferenceRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}

	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientRelationshipCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest req) {
	return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
}
	
		/**
 * @generated
 */
	protected final org.eclipse.gef.commands.Command getGEFWrapper(org.eclipse.gmf.runtime.common.core.command.ICommand cmd) {
		return new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(cmd);
	}

	/**
 * Returns editing domain from the host edit part.
 * @generated
 */
	protected org.eclipse.emf.transaction.TransactionalEditingDomain getEditingDomain() {
		return ((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()).getEditingDomain();
	}

		/**
 * Clean all shortcuts to the host element from the same diagram
 * @generated
 */
	protected void addDestroyShortcutsCommand(org.eclipse.gmf.runtime.common.core.command.ICompositeCommand cmd, org.eclipse.gmf.runtime.notation.View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (java.util.Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			org.eclipse.gmf.runtime.notation.View nextView = (org.eclipse.gmf.runtime.notation.View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
 * @generated
 */
public static class LinkConstraints {


	

/**
 * @generated
 */
public static boolean canCreateTeam_RoleMembers_4001(organisationalChart.organisationalChart.Team_Role source, organisationalChart.organisationalChart.Individual_Role target) {
	if (source != null) {
	if (source.getMembers().contains(target)
) {
		return false;
	}
	}

	return canExistTeam_RoleMembers_4001(source, target);
}


/**
 * @generated
 */
public static boolean canCreateOrganisational_UnitPersonnel_4002(organisationalChart.organisationalChart.Organisational_Unit source, organisationalChart.organisationalChart.Individual_Role target) {
	if (source != null) {
	if (source.getPersonnel().contains(target)
) {
		return false;
	}
	}

	return canExistOrganisational_UnitPersonnel_4002(source, target);
}
	

	/**
 * @generated
 */
	public static boolean canExistTeam_RoleMembers_4001(organisationalChart.organisationalChart.Team_Role source, organisationalChart.organisationalChart.Individual_Role target) {
		return true;
	}


	/**
 * @generated
 */
	public static boolean canExistOrganisational_UnitPersonnel_4002(organisationalChart.organisationalChart.Organisational_Unit source, organisationalChart.organisationalChart.Individual_Role target) {
		return true;
	}
}

	}
