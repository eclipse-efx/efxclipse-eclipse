package org.eclipse.fx.ide.pde.ui.templates.tycho

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream

class JemmyPomGenerator implements Generator<DynamicFile> {
	def toPomGroupId(String bundleId) {
		if( bundleId.indexOf('.') != -1 ) {
			return bundleId.substring(0,bundleId.lastIndexOf('.'));
		}
		return bundleId;
	}
	
	def String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val relengGroupId = file.variables.findFirst([e| e.key.equals("relengGroupId")]).defaultValue;
		val relengArtifactId = file.variables.findFirst([e| e.key.equals("relengArtifactId")]).defaultValue;
		val relengVersion    = toPomVersion(file.variables.findFirst([e| e.key.equals("baseVersion")]).defaultValue);
		val relengPath       = file.variables.findFirst([e| e.key.equals("relengPath")]).defaultValue;
		
		val groupId = file.variables.findFirst([e| e.key.equals("groupId")]).defaultValue;
		val artifactId	= file.variables.findFirst([e| e.key.equals("artifactId")]).defaultValue;
		val name = file.variables.findFirst([e| e.key.equals("name")]).defaultValue;
	
		val testSuiteBundle = file.variables.findFirst([e| e.key.equals("testBundleId")]).defaultValue;
		val testSuiteClass = file.variables.findFirst([e| e.key.equals("testSuite")]).defaultValue;
		val testProductId = file.variables.findFirst([e| e.key.equals("testProductId")]).defaultValue;
		val applicationFeature = file.variables.findFirst([e| e.key.equals("testProductFeature")]).defaultValue;
		
		val pomData = new JemmyPomData(
			name,
			groupId,
			artifactId,
			relengGroupId,
			relengArtifactId,
			relengVersion,
			relengPath,
			testSuiteBundle,
			testSuiteClass,
			testProductId,
			applicationFeature
		);
		return new ByteArrayInputStream(generate(pomData).toString.bytes);
	}
	
	def generate(JemmyPomData data) '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<name>«data.description»</name>
	<groupId>«data.groupId»</groupId>
	<artifactId>«data.artifactId»</artifactId>
	<packaging>eclipse-test-plugin</packaging>

	<parent>
		<groupId>«data.parentGroupId»</groupId>
		<artifactId>«data.parentArtifactId»</artifactId>
		<relativePath>«data.parentPomPath»/pom.xml</relativePath>
		<version>«data.parentVersion»</version>
	</parent>

	<build>
		<plugins>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-surefire-plugin</artifactId>
				<version>${tycho-version}</version>
				<configuration>
					<testSuite>«data.testSuiteBundle»</testSuite>
					<testClass>«data.testSuiteClass»</testClass>
					<useUIHarness>false</useUIHarness>
					<useUIThread>false</useUIThread>
					<argLine>-Xms40m -Xmx512m -Defxclipse.osgi.hook.debug=true -Dosgi.framework.extensions=org.eclipse.fx.osgi -Dtest.jemmy.product=«data.testProductId»</argLine>
					<appArgLine>-consoleLog -nosplash</appArgLine>
					<application>org.eclipse.pde.junit.runtime.coretestapplication</application>
					<dependencies>
						<dependency>
							<type>eclipse-feature</type>
							<artifactId>«data.applicationFeature»</artifactId>
							<version>0.0.0</version>
						</dependency>
					</dependencies>
					<frameworkExtensions>
						<frameworkExtension>
							<groupId>org.eclipse.fx.runtime</groupId>
							<artifactId>org.eclipse.fx.osgi</artifactId>
							<version>${efx-version}</version>
						</frameworkExtension>
					</frameworkExtensions>
				</configuration>
				<executions>
					<execution>
						<phase>test</phase>
						<goals>
							<goal>test</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-maven-plugin</artifactId>
				<version>${tycho-version}</version>
				<extensions>true</extensions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>target-platform-configuration</artifactId>
				<version>${tycho-version}</version>
				<configuration>
					<resolver>p2</resolver>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

</project>
	'''
}