package org.eclipse.fx.ide.pde.ui.e4.project.template

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.RobotTask
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject
import org.eclipse.fx.ide.pde.ui.templates.PluginLaunchDef
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.EObject

class LaunchGenerator implements Generator<DynamicFile> {
	
	def findRoot(EObject file) {
		var tmp = file;
		while( true ) {
			if( tmp.eContainer instanceof RobotTask ) {
				return tmp.eContainer as RobotTask;
			}
			tmp = tmp.eContainer;
		}
	}
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val robotTask = findRoot(file) as RobotTask;
		val launchDef = new E4LaunchDef();
		val plugin = robotTask.projects.findFirst([e | e instanceof FeatureProject]) as FeatureProject;
		val bundleProject = robotTask.projects.findFirst([e | e instanceof BundleProject]) as BundleProject;
		
		val symbolicName = bundleProject.manifest.symbolicname;
		
		launchDef.setProjectName(bundleProject.name);
		
		if( plugin != null ) {
			for( fp : plugin.feature.plugins ) {
				if(symbolicName.equals(fp.getId())) {
					// Skip it
				} else if( "org.eclipse.core.runtime.compatibility.registry".equals(fp.getId()) ) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","false"));
				} else if("org.eclipse.core.runtime".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","true"));
				} else if("org.eclipse.equinox.common".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"2","true"));
				} else if("org.eclipse.equinox.ds".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"1","true"));
				} else if("org.eclipse.osgi".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"-1","true"));
				} else {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId()));	
				}
			}
			
			launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(symbolicName));
			
		}
		return new ByteArrayInputStream(generate(launchDef).toString.bytes);
	}
	
	def generate(E4LaunchDef launch) '''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<launchConfiguration type="org.eclipse.pde.ui.RuntimeWorkbench">
		<booleanAttribute key="append.args" value="true"/>
		<stringAttribute key="application" value="org.eclipse.fx.ui.workbench.fx.application"/>
		<booleanAttribute key="askclear" value="true"/>
		<booleanAttribute key="automaticAdd" value="false"/>
		<booleanAttribute key="automaticValidate" value="false"/>
		<stringAttribute key="bootstrap" value=""/>
		<stringAttribute key="checked" value="[NONE]"/>
		<booleanAttribute key="clearConfig" value="false"/>
		<booleanAttribute key="clearws" value="false"/>
		<booleanAttribute key="clearwslog" value="false"/>
		<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/«launch.projectName».product"/>
		<booleanAttribute key="default" value="false"/>
		<booleanAttribute key="includeOptional" value="true"/>
		<stringAttribute key="location" value="${workspace_loc}/../runtime-«launch.projectName».product"/>
		<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-nl ${target.nl} -consoleLog -nosplash"/>
		<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
		<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xms40m -Xmx512m -Dosgi.framework.extensions=org.eclipse.fx.osgi"/>
		<stringAttribute key="pde.version" value="3.3"/>
		<stringAttribute key="product" value="«launch.projectName».product"/>
		<stringAttribute key="productFile" value="/«launch.projectName»/«launch.projectName».product"/>
		<stringAttribute key="selected_target_plugins" value="«launch.targetPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»" />
		<stringAttribute key="selected_workspace_plugins" value="«launch.workbenchPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»"/>
		<booleanAttribute key="show_selected_only" value="false"/>
		<booleanAttribute key="tracing" value="false"/>
		<booleanAttribute key="useCustomFeatures" value="false"/>
		<booleanAttribute key="useDefaultConfig" value="true"/>
		<booleanAttribute key="useDefaultConfigArea" value="true"/>
		<booleanAttribute key="useProduct" value="true"/>
		<booleanAttribute key="usefeatures" value="false"/>
</launchConfiguration>'''
}