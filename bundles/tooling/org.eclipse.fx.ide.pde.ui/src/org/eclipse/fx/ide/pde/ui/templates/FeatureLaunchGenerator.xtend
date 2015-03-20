package org.eclipse.fx.ide.pde.ui.templates

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream

class FeatureLaunchGenerator implements Generator<DynamicFile> {
	override generate(DynamicFile file, Map<String,Object> data) {
		val launchDef = new OSGiLaunchDef();
		
		val v = file.variables.findFirst([e| e.key.equals("classloaderStrategy")]);
		
		launchDef.classloaderStrategy = if( v == null || "default".equals(v.defaultValue)) null else v.defaultValue;
		launchDef.setProjectName(file.variables.findFirst([e| e.key.equals("projectName")]).defaultValue);
		launchDef.features.addAll(file.variables.findFirst([e| e.key.equals("feature")]).defaultValue.split(",").map[new LaunchFeature(it.trim)]);
		
		return new ByteArrayInputStream(generate(launchDef).toString.bytes);
	}
	
	def generate(OSGiLaunchDef launch) '''<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.eclipse.pde.ui.RuntimeWorkbench">
<setAttribute key="additional_plugins"/>
<booleanAttribute key="append.args" value="true"/>
<booleanAttribute key="askclear" value="true"/>
<booleanAttribute key="automaticAdd" value="false"/>
<booleanAttribute key="automaticValidate" value="false"/>
<stringAttribute key="bootstrap" value=""/>
<stringAttribute key="checked" value="[NONE]"/>
<booleanAttribute key="clearConfig" value="false"/>
<booleanAttribute key="clearws" value="false"/>
<booleanAttribute key="clearwslog" value="false"/>
<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/«launch.projectName»"/>
<booleanAttribute key="default" value="false"/>
<stringAttribute key="featureDefaultLocation" value="workspace"/>
<stringAttribute key="featurePluginResolution" value="workspace"/>
<booleanAttribute key="includeOptional" value="true"/>
<stringAttribute key="location" value="${workspace_loc}/../runtime-«launch.projectName»"/>
<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-nl ${target.nl} -consoleLog -nosplash"/>
<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="«IF launch.classloaderStrategy != null»-Dorg.osgi.framework.bundle.parent=«launch.classloaderStrategy»«ELSE»-Dosgi.framework.extensions=org.eclipse.fx.osgi«ENDIF»"/>
<stringAttribute key="pde.version" value="3.3"/>
<stringAttribute key="product" value="«launch.projectName»"/>
<stringAttribute key="productFile" value="/«launch.projectName»/«launch.projectName».product"/>
<setAttribute key="selected_features">
«FOR f : launch.features»
	<setEntry value="«f.name»:default"/>
«ENDFOR»
</setAttribute>
<booleanAttribute key="show_selected_only" value="false"/>
<booleanAttribute key="tracing" value="false"/>
<booleanAttribute key="useCustomFeatures" value="true"/>
<booleanAttribute key="useDefaultConfig" value="true"/>
<booleanAttribute key="useDefaultConfigArea" value="true"/>
<booleanAttribute key="useProduct" value="true"/>
<booleanAttribute key="usefeatures" value="false"/>
</launchConfiguration>
'''

}