package organisationalChart.organisationalChart.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		organisationalChart.organisationalChart.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		organisationalChart.organisationalChart.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		organisationalChart.organisationalChart.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		organisationalChart.organisationalChart.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		organisationalChart.organisationalChart.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return organisationalChart.organisationalChart.diagram.part.ModeloDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
