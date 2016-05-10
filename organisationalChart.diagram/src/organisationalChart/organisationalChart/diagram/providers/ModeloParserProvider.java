package organisationalChart.organisationalChart.diagram.providers;

/**
 * @generated
 */
public class ModeloParserProvider extends org.eclipse.gmf.runtime.common.core.service.AbstractProvider implements org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider {
	
	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser individual_RoleName_5001Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getIndividual_RoleName_5001Parser() {
		if (individual_RoleName_5001Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE.getRole_Name()
			};
				organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser parser = new organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser(features);
								individual_RoleName_5001Parser = parser;
		}
		return individual_RoleName_5001Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser team_RoleName_5002Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getTeam_RoleName_5002Parser() {
		if (team_RoleName_5002Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE.getRole_Name()
			};
				organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser parser = new organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser(features);
								team_RoleName_5002Parser = parser;
		}
		return team_RoleName_5002Parser;
	}

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser organisational_UnitName_5003Parser;

	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.common.ui.services.parser.IParser getOrganisational_UnitName_5003Parser() {
		if (organisational_UnitName_5003Parser == null) {
			org.eclipse.emf.ecore.EAttribute[] features = new org.eclipse.emf.ecore.EAttribute[] {
				organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE.getOrganisational_Unit_Name()
			};
				organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser parser = new organisationalChart.organisationalChart.diagram.parsers.MessageFormatParser(features);
								organisational_UnitName_5003Parser = parser;
		}
		return organisational_UnitName_5003Parser;
	}

	
	

		/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(int visualID) {
		switch (visualID) {
			case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleNameEditPart.VISUAL_ID: return getIndividual_RoleName_5001Parser();
	case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleNameEditPart.VISUAL_ID: return getTeam_RoleName_5002Parser();
	case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitNameEditPart.VISUAL_ID: return getOrganisational_UnitName_5003Parser();
						}
		return null;
	}
		/**
 * Utility method that consults ParserService
 * @generated
 */
	public static org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(org.eclipse.gmf.runtime.emf.type.core.IElementType type, org.eclipse.emf.ecore.EObject object, String parserHint) {
		return org.eclipse.gmf.runtime.common.ui.services.parser.ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}
		/**
 * @generated
 */
	public org.eclipse.gmf.runtime.common.ui.services.parser.IParser getParser(
			org.eclipse.core.runtime.IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry.getVisualID(vid));
		}
		org.eclipse.gmf.runtime.notation.View view =
				(org.eclipse.gmf.runtime.notation.View) hint.getAdapter(org.eclipse.gmf.runtime.notation.View.class);
		if (view != null) {
			return getParser(organisationalChart.organisationalChart.diagram.part.ModeloVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

		/**
 * @generated
 */
	public boolean provides(org.eclipse.gmf.runtime.common.core.service.IOperation operation) {
		if (operation instanceof org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation) {
			org.eclipse.core.runtime.IAdaptable hint =
					((org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation) operation).getHint();
			if (organisationalChart.organisationalChart.diagram.providers.ModeloElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

		/**
 * @generated
 */
	private static class HintAdapter extends org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter {

		/**
 * @generated
 */
		private final org.eclipse.gmf.runtime.emf.type.core.IElementType elementType;

		/**
 * @generated
 */
		public HintAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType type,
				org.eclipse.emf.ecore.EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
 * @generated
 */
		public Object getAdapter(Class adapter) {
			if (org.eclipse.gmf.runtime.emf.type.core.IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

	}
