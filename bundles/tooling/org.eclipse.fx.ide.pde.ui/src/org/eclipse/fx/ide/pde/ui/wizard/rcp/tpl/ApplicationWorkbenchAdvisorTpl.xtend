package org.eclipse.fx.ide.pde.ui.wizard.rcp.tpl

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import static extension org.eclipse.fx.ide.pde.ui.wizard.Util.*

class ApplicationWorkbenchAdvisorTpl implements Generator<DynamicFile> { 
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val bundleId = file.getVariableValue("bundleId");
		val packageName = file.cuPackagename;
		return generate(bundleId, packageName).toStream
	}
	
	def generate(String bundleId, String packageName) '''package «packageName»;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "«bundleId».perspective"; //$$NON-NLS-1$$

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}'''
}