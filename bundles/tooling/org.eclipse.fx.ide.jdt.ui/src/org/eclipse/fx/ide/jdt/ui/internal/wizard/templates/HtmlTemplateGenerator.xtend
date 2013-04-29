/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.ui.wizards.template.IGenerator
import org.eclipse.fx.ide.ui.wizards.template.HtmlElement

class HtmlTemplateGenerator implements IGenerator<HtmlElement> {
	override generateContent(HtmlElement htmlDef) '''
		<html>
			<head>
				<title>Insert title here</title>
			</head>
			<body>
				<h1>Embed JavaFX application into existing page</h1>
				<!-- application will be inserted here -->
				<div id="fxApplication"></div>
			</body>
		</html>  
	 '''
}