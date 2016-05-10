package organisationalChart.organisationalChart.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ModeloElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private ModeloElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Organisation_1000 = getElementType("organisationalChart.diagram.Organisation_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Individual_Role_2001 = getElementType("organisationalChart.diagram.Individual_Role_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Team_Role_2002 = getElementType("organisationalChart.diagram.Team_Role_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Organisational_Unit_2003 = getElementType("organisationalChart.diagram.Organisational_Unit_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Team_RoleMembers_4001 = getElementType("organisationalChart.diagram.Team_RoleMembers_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Organisational_UnitPersonnel_4002 = getElementType("organisationalChart.diagram.Organisational_UnitPersonnel_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements
					.put(
							Organisation_1000,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getOrganisation());

			elements
					.put(
							Individual_Role_2001,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getIndividual_Role());

			elements
					.put(
							Team_Role_2002,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getTeam_Role());

			elements
					.put(
							Organisational_Unit_2003,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getOrganisational_Unit());

			elements
					.put(
							Team_RoleMembers_4001,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getTeam_Role_Members());

			elements
					.put(
							Organisational_UnitPersonnel_4002,
							organisationalChart.organisationalChart.OrganisationalChartPackage.eINSTANCE
									.getOrganisational_Unit_Personnel());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Organisation_1000);
			KNOWN_ELEMENT_TYPES.add(Individual_Role_2001);
			KNOWN_ELEMENT_TYPES.add(Team_Role_2002);
			KNOWN_ELEMENT_TYPES.add(Organisational_Unit_2003);
			KNOWN_ELEMENT_TYPES.add(Team_RoleMembers_4001);
			KNOWN_ELEMENT_TYPES.add(Organisational_UnitPersonnel_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case organisationalChart.organisationalChart.diagram.edit.parts.OrganisationEditPart.VISUAL_ID:
			return Organisation_1000;
		case organisationalChart.organisationalChart.diagram.edit.parts.Individual_RoleEditPart.VISUAL_ID:
			return Individual_Role_2001;
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleEditPart.VISUAL_ID:
			return Team_Role_2002;
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitEditPart.VISUAL_ID:
			return Organisational_Unit_2003;
		case organisationalChart.organisationalChart.diagram.edit.parts.Team_RoleMembersEditPart.VISUAL_ID:
			return Team_RoleMembers_4001;
		case organisationalChart.organisationalChart.diagram.edit.parts.Organisational_UnitPersonnelEditPart.VISUAL_ID:
			return Organisational_UnitPersonnel_4002;
		}
		return null;
	}

}
