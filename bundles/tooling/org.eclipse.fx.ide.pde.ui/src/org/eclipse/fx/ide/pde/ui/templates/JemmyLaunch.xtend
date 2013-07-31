package org.eclipse.fx.ide.pde.ui.templates

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.fx.ide.rrobot.model.task.RobotTask
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject
import java.io.ByteArrayInputStream

class JemmyLaunch implements Generator<DynamicFile> {
	def findRoot(EObject file) {
		var tmp = file;
		while( true ) {
			if( tmp.eContainer instanceof RobotTask ) {
				return tmp.eContainer as RobotTask;
			}
			tmp = tmp.eContainer;
		}
		return null;
	}
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val robotTask = findRoot(file) as RobotTask;
		
		val plugin = robotTask.projects.findFirst([e | e instanceof FeatureProject]) as FeatureProject;
		val bundleProject = robotTask.projects.findFirst([e | e instanceof BundleProject]) as BundleProject;
		
		val symbolicName = bundleProject.manifest.symbolicname;
		
		val launchDef = new JemmyLaunchDef();
		launchDef.setJunitClassName(symbolicName+".jemmy.TestSuite");
		launchDef.setProjectName(bundleProject.name+".jemmy");
		launchDef.setTestProductId(symbolicName+".product");
			
		for( FeaturePlugin fp : plugin.getFeature().getPlugins() ) {
			if(symbolicName.equals(fp.getId())) {
					
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
			
		launchDef.getTargetPlugins().add(new PluginLaunchDef("at.bestsolution.efxclipse.jemmy"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.jdt.junit.runtime"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.jdt.junit4.runtime"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.osgi.services"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.pde.junit.runtime"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.hamcrest.core"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.jemmy.fx.repackaged"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.junit*4.10.0.v4_10_0_v20120426-0900"));
		launchDef.getTargetPlugins().add(new PluginLaunchDef("org.junit4"));
			
		launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(symbolicName));
		launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(symbolicName+".jemmy"));
			
		return new ByteArrayInputStream(generate(launchDef).toString.bytes);
	}
	
	def generate(JemmyLaunchDef launch) '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<launchConfiguration type="org.eclipse.pde.ui.JunitLaunchConfig">
			<booleanAttribute key="append.args" value="true"/>
			<stringAttribute key="application" value="org.eclipse.pde.junit.runtime.coretestapplication"/>
			<booleanAttribute key="askclear" value="false"/>
			<booleanAttribute key="automaticAdd" value="false"/>
			<booleanAttribute key="automaticValidate" value="false"/>
			<stringAttribute key="bootstrap" value=""/>
			<stringAttribute key="checked" value="[NONE]"/>
			<booleanAttribute key="clearConfig" value="true"/>
			<booleanAttribute key="clearws" value="true"/>
			<booleanAttribute key="clearwslog" value="false"/>
			<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/pde-junit"/>
			<booleanAttribute key="default" value="false"/>
			<booleanAttribute key="includeOptional" value="true"/>
			<stringAttribute key="location" value="${workspace_loc}/../junit-workspace"/>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
				<listEntry value="/«launch.projectName»/src/«launch.junitClassName.replace('.','/')».java"/>
			</listAttribute>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
				<listEntry value="1"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.jdt.junit.CONTAINER" value=""/>
			<booleanAttribute key="org.eclipse.jdt.junit.KEEPRUNNING_ATTR" value="false"/>
			<stringAttribute key="org.eclipse.jdt.junit.TESTNAME" value=""/>
			<stringAttribute key="org.eclipse.jdt.junit.TEST_KIND" value="org.eclipse.jdt.junit.loader.junit4"/>
			<stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="«launch.junitClassName»"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-nl ${target.nl} -consoleLog -nosplash -console"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="«launch.projectName»"/>
			<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xms40m -Xmx512m -Dosgi.framework.extensions=org.eclipse.fx.osgi -Dtest.jemmy.product=«launch.testProductId»"/>
			<stringAttribute key="pde.version" value="3.3"/>
			<stringAttribute key="product" value="org.eclipse.sdk.ide"/>
			<booleanAttribute key="run_in_ui_thread" value="false"/>
			<stringAttribute key="selected_target_plugins" value="«launch.targetPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»" />
			<stringAttribute key="selected_workspace_plugins" value="«launch.workbenchPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»"/>
			<booleanAttribute key="show_selected_only" value="false"/>
			<booleanAttribute key="tracing" value="false"/>
			<booleanAttribute key="useCustomFeatures" value="false"/>
			<booleanAttribute key="useDefaultConfig" value="true"/>
			<booleanAttribute key="useDefaultConfigArea" value="false"/>
			<booleanAttribute key="useProduct" value="false"/>
		</launchConfiguration> 
	'''

	
	
}