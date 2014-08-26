package org.eclipse.fx.ide.pde.ui.templates

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream

class JemmyFeatureLaunchGenerator implements Generator<DynamicFile> {
	override generate(DynamicFile file, Map<String,Object> data) {
		val launchDef = new JUnitLaunchDef();
		
		launchDef.setProjectName(file.variables.findFirst([e| e.key.equals("projectName")]).defaultValue);
		launchDef.setJunitClassName(file.variables.findFirst([e| e.key.equals("testSuite")]).defaultValue);
		launchDef.setTestProductId(file.variables.findFirst([e| e.key.equals("testProductId")]).defaultValue);
		
		val vals = file.variables.findFirst([e| e.key.equals("featureList")]).defaultValue.split(",")
		for( v : vals ) {
			launchDef.features.add(new LaunchFeature(v));	
		}
		
		return new ByteArrayInputStream(generate(launchDef).toString.bytes);
	}
	
	def generate(JUnitLaunchDef launch) '''<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.eclipse.pde.ui.JunitLaunchConfig">
<setAttribute key="additional_plugins"/>
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
<stringAttribute key="featureDefaultLocation" value="workspace"/>
<stringAttribute key="featurePluginResolution" value="workspace"/>
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
<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-nl ${target.nl} -consoleLog -nosplash"/>
<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="«launch.projectName»"/>
<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xms40m -Xmx512m -Dosgi.framework.extensions=org.eclipse.fx.osgi -Dtest.jemmy.product=«launch.testProductId»"/>
<stringAttribute key="pde.version" value="3.3"/>
<stringAttribute key="product" value="org.eclipse.sdk.ide"/>
<booleanAttribute key="run_in_ui_thread" value="false"/>
<setAttribute key="selected_features">
«FOR f : launch.features»
	<setEntry value="«f.name»:default"/>
«ENDFOR»
</setAttribute>
<booleanAttribute key="show_selected_only" value="false"/>
<booleanAttribute key="tracing" value="false"/>
<booleanAttribute key="useCustomFeatures" value="true"/>
<booleanAttribute key="useDefaultConfig" value="true"/>
<booleanAttribute key="useDefaultConfigArea" value="false"/>
<booleanAttribute key="useProduct" value="false"/>
</launchConfiguration>
'''
}