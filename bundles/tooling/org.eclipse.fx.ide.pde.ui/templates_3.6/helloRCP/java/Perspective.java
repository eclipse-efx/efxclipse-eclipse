package $packageName$;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import $packageName$.$viewPartClass$;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView($viewPartClass$.ID, false, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}
}
