package org.eclipse.fx.ide.pde.ui.e4.project.template

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream

class NativeLaunchGenerator implements Generator<DynamicFile> {

	override generate(DynamicFile file, Map<String,Object> data) {
		val projectName = data.get("BundleProject_projectName") as String;
		val productName = data.get("BundleProject_productName") as String;
		val vendorName = data.get("BundleProject_bundleVendor") as String;
		val launcherdata = new NativeLaunchData("../"+projectName+".product/target/products/"+projectName+".product/noenv/noenv/noenv", productName, vendorName);
		val gen = new NativeLaunchGenerator();
		return new ByteArrayInputStream(gen.generate(launcherdata).toString.bytes);
	}

	def generate(NativeLaunchData data) '''<project name="native-build" default="do-deploy" basedir="."  xmlns:fx="javafx:com.sun.javafx.tools.ant">
	<property name="eclipse-app-dir" value="«data.tychoOutDir»" />

	<target name="init-fx-tasks">
		<taskdef name="fxosgilauncher" classpath="org.eclipse.fx.ide.ant.jar" classname="org.eclipse.fx.ide.ant.FXOsgiLaunchTask" />
		<path id="fxant">
			<filelist>
				<file name="${java.home}\..\lib\ant-javafx.jar"/>
				<file name="${java.home}\lib\ant-jfxrt.jar"/>
			</filelist>
		</path>
		<taskdef resource="com/sun/javafx/tools/ant/antlib.xml"
					uri="javafx:com.sun.javafx.tools.ant"
					classpathref="fxant"/>
	</target>

	<target name="do-deploy" depends="init-fx-tasks">
		<fileset id="equinox-launcher" dir="«data.tychoOutDir»">
			<filename name="plugins/org.eclipse.equinox.launcher_*.jar"/>
		</fileset>
		<fxosgilauncher classpathref="fxant" equinoxlauncherjarref="equinox-launcher"/>

		<fx:resources id="appRes">
			<fx:fileset dir="." includes="fx-osgi-launch.jar"/>
			<fx:fileset dir="${eclipse-app-dir}" includes="**/*"/>
		</fx:resources>

		<fx:application id="fxApplication"
								name="«data.productName»"
								mainClass="org.eclipse.equinox.launcher.Main"
								toolkit="swing"

							/>

		<fx:deploy
			embedJNLP="false"
			extension="false"
			includeDT="false"
			offlineAllowed="true"
			outdir="${basedir}/deploy"
			outfile="fix-ide"
			nativeBundles="all"
			updatemode="background"
			>
			<fx:platform basedir="${java.home}"/>
			<fx:info title="«data.productName»" vendor="«data.vendorName»"/>
			<fx:application refid="fxApplication"/>
			<fx:resources refid="appRes"/>
		</fx:deploy>
	</target>
</project>'''
}