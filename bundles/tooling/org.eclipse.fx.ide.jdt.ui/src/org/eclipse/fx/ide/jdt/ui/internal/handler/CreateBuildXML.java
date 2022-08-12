/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Martin Blühweis<martin.bluehweis@bestsolution.at> - refactoring to EMF build model
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.fx.ide.jdt.ui.internal.handler.AbstractAntHandler.BuildConfiguration;

public class CreateBuildXML {
	public File run( BuildConfiguration config ) {
		AntTemplate template = new AntTemplate();
		String out = template.generateAnt( config );

		File f = new File( config.buildDirectory );
		if ( !f.exists() ) {
			f.mkdirs();
		}

		FileWriter outFile = null;
		try {
			File buildFile = new File( f, "build.xml" );
			outFile = new FileWriter( buildFile );
			outFile.write( out );
			outFile.close();
			outFile = null;
			return buildFile;
		}
		catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if ( outFile != null ) {
				try {
					outFile.close();
				}
				catch ( IOException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
