package org.eclipse.fx.ide.pde.ui.e4.project.media.tpl

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.util.EcoreUtil

class ApplicationXmiTpl implements Generator<DynamicFile> {

	override generate(DynamicFile file, Map<String,Object> data) {
		val rootPackage = file.variables.findFirst([e| e.key.equals("rootPackage")]).defaultValue;
		
		val bindingContextId = EcoreUtil::generateUUID
		val openCommandId = EcoreUtil::generateUUID
		val refreshCommandId = EcoreUtil::generateUUID
		
		return new ByteArrayInputStream(generate(rootPackage, bindingContextId, openCommandId, refreshCommandId).toString.bytes);
	}
	
	def generate(String rootPackage, String bindingContextId, String openCommandId, String refreshCommandId) '''<?xml version="1.0" encoding="UTF-8"?>
<application:Application xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="http://www.eclipse.org/ui/2010/UIModel/application" xmlns:basic="http://www.eclipse.org/ui/2010/UIModel/application/ui/basic" xmlns:menu="http://www.eclipse.org/ui/2010/UIModel/application/ui/menu" xmi:id="«EcoreUtil::generateUUID»" elementId="org.efxclipse.e4.application" bindingContexts="«bindingContextId»">
  <children xsi:type="basic:TrimmedWindow" xmi:id="«EcoreUtil::generateUUID»" elementId="org.efxclipse.e4.mainWindow" label="Media Application" x="30" y="30" width="1024" height="768">
    <persistedState key="fx.stage.decoration" value="platform:/plugin/«rootPackage»/«rootPackage.replace('.','/')»/decoration/TopArea.fxml"/>
    <children xsi:type="basic:PartSashContainer" xmi:id="«EcoreUtil::generateUUID»" horizontal="true">
      <children xsi:type="basic:Part" xmi:id="«EcoreUtil::generateUUID»" containerData="0.3" contributionURI="bundleclass://«rootPackage»/«rootPackage».parts.MediaListPart"/>
      <children xsi:type="basic:PartStack" xmi:id="«EcoreUtil::generateUUID»" elementId="content.stack" containerData="0.7"/>
    </children>
    <trimBars xmi:id="«EcoreUtil::generateUUID»">
      <children xsi:type="menu:ToolBar" xmi:id="«EcoreUtil::generateUUID»" elementId="org.efxclipse.e4.maintoolbar">
        <children xsi:type="menu:HandledToolItem" xmi:id="«EcoreUtil::generateUUID»" elementId="org.efxclipse.e4.toolitem.open" iconURI="platform:/plugin/«rootPackage»/icons/view-preview.png" command="«openCommandId»"/>
        <children xsi:type="menu:HandledToolItem" xmi:id="«EcoreUtil::generateUUID»" elementId="org.efxclipse.e4.toolitem.save" iconURI="platform:/plugin/«rootPackage»/icons/system-restart.png" command="«refreshCommandId»"/>
      </children>
    </trimBars>
  </children>
  <handlers xmi:id="«EcoreUtil::generateUUID»" contributionURI="bundleclass://«rootPackage»/«rootPackage».handlers.OpenHandler" command="«openCommandId»"/>
  <handlers xmi:id="«EcoreUtil::generateUUID»" contributionURI="bundleclass://«rootPackage»/«rootPackage».handlers.RefreshHandler" command="«refreshCommandId»"/>
  <bindingTables xmi:id="«EcoreUtil::generateUUID»" bindingContext="«bindingContextId»">
    <bindings xmi:id="«EcoreUtil::generateUUID»" keySequence="M1+O" command="«openCommandId»"/>
    <bindings xmi:id="«EcoreUtil::generateUUID»" keySequence="M1+R" command="«refreshCommandId»"/>
  </bindingTables>
  <rootContext xmi:id="«bindingContextId»" elementId="org.eclipse.ui.contexts.dialogAndWindow" name="In Dialog and Windows">
    <children xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.ui.contexts.window" name="In Windows"/>
    <children xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.ui.contexts.dialog" name="In Dialogs"/>
  </rootContext>
  <commands xmi:id="«openCommandId»" elementId="media.open" commandName="openMedia"/>
  <commands xmi:id="«refreshCommandId»" elementId="media.refresh" commandName="refreshMedia"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.core.commands.service" contributionURI="bundleclass://org.eclipse.e4.core.commands/org.eclipse.e4.core.commands.CommandServiceAddon"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.contexts.service" contributionURI="bundleclass://org.eclipse.e4.ui.services/org.eclipse.e4.ui.services.ContextServiceAddon"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.fx.ui.keybindings.e4.service" contributionURI="bundleclass://org.eclipse.fx.ui.keybindings.e4/org.eclipse.fx.ui.keybindings.e4.BindingServiceAddon"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.workbench.commands.model" contributionURI="bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.CommandProcessingAddon"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.workbench.contexts.model" contributionURI="bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.ContextProcessingAddon"/>
  <addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.fx.ui.keybindings.e4.model" contributionURI="bundleclass://org.eclipse.fx.ui.keybindings.e4/org.eclipse.fx.ui.keybindings.e4.BindingProcessingAddon"/>
</application:Application>
'''
}