package org.eclipse.fx.ide.pde.ui.e4.project.media.tpl.handlers

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class RefreshHandlerTpl implements Generator<DynamicFile> {

	override generate(DynamicFile file, Map<String,Object> data) {
		val cu = file.eContainer as CompilationUnit;
		return new ByteArrayInputStream(generate(cu.packagename).toString.bytes);
	}
	
	def generate(String packageName) '''package «packageName»;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

@SuppressWarnings({ "restriction" })
public class RefreshHandler {
	public static final String REFRESH_EVENT = "media/refresh";
	
	@Execute
	public void execute(IEventBroker broker)
			throws InvocationTargetException, InterruptedException {
		broker.send(REFRESH_EVENT, UUID.randomUUID().toString());
	}
}
'''
}