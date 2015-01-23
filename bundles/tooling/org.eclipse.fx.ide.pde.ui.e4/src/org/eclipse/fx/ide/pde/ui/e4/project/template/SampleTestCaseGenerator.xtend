/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.pde.ui.e4.project.template

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.File
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class SampleTestCaseGenerator implements Generator<File> {
	override generate(File file, Map<String,Object> data) {
		val cp = file.eContainer as CompilationUnit
		return new ByteArrayInputStream(generate(cp.packagename).toString.bytes);
	}

	def generate(String packageName) '''package «packageName»;

import org.jemmy.fx.SceneDock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTestCase {
	protected static SceneDock scene;

	@BeforeClass
	public static void startApp() throws InterruptedException {
		try {
			scene = new SceneDock();
		} catch(Throwable t ) {
			t.printStackTrace();
		}
	}

	@Test
	public void sampleTestMethod() {
		Assert.fail("Not implemented");
	}
}
	'''

}