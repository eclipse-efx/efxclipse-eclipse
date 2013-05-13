package org.eclipse.fx.ide.pde.ui.templates

class OSGiAppLaunchGenerator {
	def generate(OSGiLaunchDef launch) '''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<launchConfiguration type="org.eclipse.pde.ui.RuntimeWorkbench">
		<booleanAttribute key="append.args" value="true"/>
		<stringAttribute key="application" value="test.osgi.app.application"/>
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
</launchConfiguration>
	
	'''
}