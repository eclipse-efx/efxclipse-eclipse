package org.eclipse.fx.ide.pde.ui.wizard.rcp.tpl

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import static extension org.eclipse.fx.ide.pde.ui.wizard.Util.*

class ApplicationWorkbenchWindowAdvisorTpl implements Generator<DynamicFile> { 
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val packageName = file.cuPackagename;
		return generate(packageName).toStream
	}
	
	def generate(String packageName) '''package «packageName»;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(400, 300));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(false);
        configurer.setTitle("My RCP Application"); //$$NON-NLS-1$$
    }
}
'''
}