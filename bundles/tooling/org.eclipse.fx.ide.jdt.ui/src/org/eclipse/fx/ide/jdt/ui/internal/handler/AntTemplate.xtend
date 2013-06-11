/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - modified to use EMF build configuration
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.handler

import java.io.File
import java.util.List
import java.util.HashMap
import java.util.ArrayList
import org.apache.commons.lang.text.StrSubstitutor
import java.util.Map
import org.eclipse.fx.ide.jdt.ui.internal.handler.AbstractAntHandler$BuildConfiguration
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask

class AntTemplate {
	def generateAnt(BuildConfiguration config) {
		val projectName = config.projectName as String;
		
		'''
		<?xml version="1.0" encoding="UTF-8"?>
			<project name="«projectName»" default="do-deploy" basedir="."  xmlns:fx="javafx:com.sun.javafx.tools.ant">
			«createInitTaskTarget(config)»
			«createLocalSetup(config)»
			«compileTarget(config)»
			«createDoDeployTarget(config,config.task)»
		</project>
		'''.toString
	}
	
	def createLocalSetup(BuildConfiguration config) {
		'''
		<target name="setup-staging-area">
			<delete dir="externalLibs" />
			<delete dir="project" />
			<delete dir="projectRefs" />
			
			<mkdir dir="externalLibs" />
			
			«FOR File l : config.origExternalLibs»
			<copy todir="externalLibs">
				<fileset dir="«l.parent»">
					<filename name="«l.name»"/>	
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="project" />
			«FOR SetupDirectory d : config.origProjectSourceDirs»
			<copy todir="project">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.path»/**" />
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="projectRefs" />
			«FOR SetupDirectory d : config.origProjectRefSourceDirs»
			<copy todir="projectRefs">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.path»/**" />
				</fileset>
			</copy>
			«ENDFOR»
		</target>
		'''
	}
	
	def createInitTaskTarget(BuildConfiguration config) {
		'''
		<target name="init-fx-tasks">
			<path id="fxant">
				<filelist>
					<file name="${java.home}\..\lib\ant-javafx.jar"/>
					<file name="${java.home}\lib\jfxrt.jar"/>
				</filelist>
			</path>
		
			<taskdef resource="com/sun/javafx/tools/ant/antlib.xml"      
				uri="javafx:com.sun.javafx.tools.ant"
				classpathref="fxant"/>
		</target>
		'''
	}
	
	def compileTarget(BuildConfiguration config) {
		'''
		<target name='do-compile'>
			<delete dir="build" />
			<mkdir dir="build/src" />
			<mkdir dir="build/libs" />
			<mkdir dir="build/classes" />
		
			<!-- Copy project-libs references -->
			<copy todir="build/libs">
				<fileset dir="externalLibs">
					«FOR String s : config.externalLibs»
					<include name="«s»"/>
					«ENDFOR»
				</fileset>
			</copy>
		
			<!-- Copy project references -->
			«FOR String s : config.projectRefSourceDirs»
			<copy todir="build/src">
				<fileset dir="projectRefs/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<!-- Copy project sources itself -->
			«FOR String s : config.projectSourceDirs»
			<copy todir="build/src">
				<fileset dir="project/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<javac includeantruntime="false" source="«config.sourceCompliance»" target="«config.targetCompliance»" srcdir="build/src" destdir="build/classes"«IF config.projectEncoding != null» encoding="«config.projectEncoding»"«ENDIF»>
				<classpath>
					<fileset dir="build/libs">
						<include name="*"/>
					</fileset>
					«IF config.jfxjar != null»
					<filelist>
						<file name="«config.jfxjar»"/>
					</filelist>
					«ENDIF»
				</classpath>
			</javac>
			
			<!-- Copy over none Java-Files -->
			<copy todir="build/classes">
			«FOR String s : config.projectSourceDirs»
				<fileset dir="project/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			«ENDFOR»
			</copy>
		
			«FOR String s : config.projectRefSourceDirs»
			<copy todir="build/classes">
				<fileset dir="projectRefs/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			</copy>
			«ENDFOR»

		</target>
		'''	
	}
	
	def createDoDeployTarget(BuildConfiguration config, AntTask task) {
		val projectName =  config.projectName;//task.getDeploy().getApplication().getName();
		val mainClass = task.getDeploy().getApplication().getMainclass();
		val appletWidth = task.getDeploy().getWidth();
		val appletHeight = task.getDeploy().getHeight();
		val appTitle = task.getDeploy().getInfo().getTitle();
		val appVersion = task.getDeploy().getApplication().getVersion();
		val preloaderClass = task.getDeploy().getApplication().getPreloaderclass();
		
		var preloaderPath = "";
		if( preloaderClass == null ) {
			preloaderPath = null;
		} else {
			preloaderPath = preloaderClass.replace('.','/');
		}
		val fallBackClass = task.getDeploy().getApplication().getFallbackclass();
		
		'''
		<target name="do-deploy" depends="setup-staging-area, do-compile, init-fx-tasks">
			<delete file="dist"/>
			<delete file="deploy" />
			
			<mkdir dir="dist" />
			<mkdir dir="dist/libs" />
			
			<copy todir="dist/libs">
				<fileset dir="externalLibs">
					<include name="*" />
				</fileset>
			</copy>
			
			«IF preloaderClass != null»
			<jar destfile="dist/libs/«projectName»-preloader.jar">
				<fileset dir="build/classes">
					<include name="«preloaderPath».class"/>
				</fileset>
			</jar>
			«ENDIF»
			
			<fx:resources id="appRes">
				«IF preloaderClass != null»
				<fx:fileset dir="dist" requiredFor="preloader"
					includes="«projectName»-preloader.jar"/>
				«ENDIF»
				<fx:fileset dir="dist" includes="«projectName».jar"/>
				<fx:fileset dir="dist" includes="libs/*"/>
			</fx:resources> 
			
			<fx:application id="fxApplication"
				name="«appTitle»"
				mainClass="«mainClass»"
				«IF preloaderClass != null»
					preloaderClass="«preloaderClass»"
				«ENDIF»
				«IF fallBackClass != null»
					fallbackClass="«fallBackClass»"
				«ENDIF»
				«IF task.getDeploy().getApplication().getToolkit() != null»
					toolkit="«task.getDeploy().getApplication().getToolkit()»"
				«ENDIF»
			/>

			<mkdir dir="build/classes/META-INF" />
			«IF !task.getFonts().isEmpty()»
				<propertyfile file="build/classes/META-INF/fonts.mf" comment="Fonts">
				«FOR f : task.getFonts()»
					<entry key="«f.getKey()»" value="/«f.getValue()»"/>
				«ENDFOR»
				</propertyfile>
			«ENDIF»
			
			«val HashMap<String, List<String>> map = new HashMap<String, List<String>>()»
			«FOR f : task.getFiles()»
				«IF !map.containsKey(f.getKey())»
					«map.put(f.getKey(), new ArrayList<String>())»
				«ENDIF»
				«/*val nix is necessary to suppress the return value of add(...)*/»
				«val nix = map.get(f.getKey()).add(new CreateAntHandler().resolvePath(f.getValue(), null))»
			«ENDFOR»
			
			«FOR folderName : map.keySet()»
				<mkdir dir="build/classes/META-INF/«folderName»" />
				«FOR serviceFile : map.get(folderName)»
					<copy 
						todir="build/classes/META-INF/«folderName»"
						«val Map<String, String> replacements = new HashMap<String, String>()»
						«replacements.put("workspace", "build/classes")»
						«val StrSubstitutor sub = new StrSubstitutor(replacements)»
						file="«sub.replace(serviceFile)»"
					/>
				«ENDFOR»
			«ENDFOR»
			
			<fx:jar destfile="dist/«projectName».jar">
				<fx:application refid="fxApplication"/>
				<fileset dir="build/classes">
				«IF preloaderClass != null»
					<exclude name="«preloaderPath».class" />
				«ENDIF»
				</fileset>
				<fx:resources refid="appRes"/>
				
				<manifest>
					<attribute name="Implementation-Vendor" value="«task.getDeploy().getInfo().getVendor()»"/>
					<attribute name="Implementation-Title" value="«appTitle»"/>
					<attribute name="Implementation-Version" value="«appVersion»"/>
					«IF task.getDeploy().getSplashImage() != null»
						<attribute name="SplashScreen-Image" value="«task.getDeploy().getSplashImage()»"/>
					«ENDIF»
					«FOR a : task.getManifestEntries()»
						<attribute name="«a.getName()»" value="«a.getValue()»"/>
					«ENDFOR»
					«IF ! task.deploy.proxyResolution»
						<attribute name="JavaFX-Feature-Proxy" value="None"/>
					«ENDIF»
				</manifest>
			</fx:jar>
			
			«IF task.getSignjar().getKeystore() != null && task.getSignjar().getKeystore().length() > 0»
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:signjar 
				keystore="«task.getSignjar().getKeystore()»" 
				alias="«task.getSignjar().getAlias()»" 
				keypass="«task.getSignjar().getKeypass()»" 
				storepass="«task.getSignjar().getStorepass()»" 
				«IF task.getSignjar().getStoretype() != null»storetype="«task.getSignjar().getStoretype()»" «ENDIF»
				destDir="${basedir}/dist">
				<fileset dir='dist'>
					<include name='**/*.jar' />
				</fileset>
			</fx:signjar>
			«ENDIF»
		
			«IF (appletWidth != null && appletHeight != null) || task.deploy.packagingFormat != null»
			<mkdir dir="deploy" />
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:deploy
				«IF task.getDeploy().verbose »verbose="true" «ENDIF»
				embedJNLP="«task.getDeploy().isEmbedjnlp()»"
				extension="«task.getDeploy().isExtension()»"
				«IF appletWidth != null && appletWidth.length > 0 && appletHeight != null && appletHeight.length > 0 »width="«appletWidth»" height="«appletHeight»"«ENDIF» 
				includeDT="«task.getDeploy().isIncludeDT()»"
				offlineAllowed="«task.getDeploy().isOfflineAllowed()»"
				outdir="${basedir}/deploy"
				outfile="«projectName»" «IF task.getDeploy().packagingFormat != null»nativeBundles="«task.getDeploy().packagingFormat»"«ENDIF»
				«IF task.getDeploy().getPlaceholderref()?.length() > 0 »placeholderref="«task.getDeploy().getPlaceholderref()»"«ENDIF» 
				«IF task.getDeploy().getPlaceholderid()?.length() > 0 »placeholderid="«task.getDeploy().getPlaceholderid()»"«ENDIF» 
				«IF task.getDeploy().getUpdatemode()?.length() > 0 »updatemode="«task.getDeploy().getUpdatemode()»"«ENDIF» >

				«IF task.getDeploy().getInfo().getSplash().isEmpty() && task.getDeploy().getInfo().getIcon().isEmpty()»
					<fx:info title="«projectName»" vendor="«task.getDeploy().getInfo().getVendor()»"/>
				«ELSE»
					<fx:info title="«projectName»" vendor="«task.getDeploy().getInfo().getVendor()»">
						«FOR s : task.getDeploy().getInfo().getSplash()»
							<fx:splash href="«s.getHref()»" «IF s.getMode() != null»mode="«s.getMode()»"«ENDIF» />
						«ENDFOR»
						«FOR i : task.getDeploy().getInfo().getIcon()»
							<fx:icon href="«i.getHref()»" «IF i.getDepth() != null»depth="«i.getDepth()»"«ENDIF» «IF i.getHeight() != null»height="«i.getHeight()»"«ENDIF» «IF i.getKind() != null»kind="«i.getKind()»"«ENDIF» «IF i.getWidth() != null»width="«i.getWidth()»"«ENDIF» />
						«ENDFOR»
					</fx:info>
				«ENDIF»
				<fx:application refId="fxApplication"/>
				«IF task.getDeploy().getTemplate()?.getFile()?.trim()?.length() > 0»
					<fx:template 
						file="build/src/«task.getDeploy().getTemplate().getFile()»"
					«IF task.getDeploy().getTemplate().getToFile()?.trim().length() > 0»
						tofile="dist/«task.getDeploy().getTemplate().getToFile()»"
					«ENDIF»
					/>
				«ENDIF»
				<fx:resources refid="appRes"/>
				«IF task.getSignjar().getKeystore()?.length > 0»
					<fx:permissions elevated="true"/>
				«ENDIF»
			</fx:deploy>
			«ENDIF»
			
			«IF (task.isCssToBin())»
				<fx:csstobin outdir="build/classes">
					<fileset dir="build/classes" includes="**/*.css"/>
				</fx:csstobin>			
			«ENDIF»
			
		</target>
		'''
	}
}