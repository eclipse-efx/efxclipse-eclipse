package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile
import java.util.Map
import java.io.ByteArrayInputStream
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle
import org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage
import org.eclipse.fx.ide.rrobot.model.bundle.ExportedPackage
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin
import java.util.ArrayList
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile
import org.eclipse.fx.ide.rrobot.model.task.File
import java.util.List
import org.eclipse.fx.ide.rrobot.model.task.Resource
import org.eclipse.fx.ide.rrobot.model.task.Folder

class BundleManifestGenerator implements Generator<ManifestFile> {


	override generate(ManifestFile file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}

	def generateContent(ManifestFile file, Map<String,Object> data) '''Manifest-Version: 1.0
Bundle-ManifestVersion: 2
Bundle-Name: «file.bundlename»
Bundle-SymbolicName: «file.symbolicname»«IF (file.eContainer as BundleProject).pluginxml != null»; singleton:=true«ENDIF»
Bundle-Version: «file.version»
Bundle-RequiredExecutionEnvironment: «file.executionEnvironment»
Bundle-ActivationPolicy: lazy
«IF !file.requiredBundles.empty»
Require-Bundle: «file.requiredBundles.filter([e | e.excludeExpression(data)]).map() [ requireBundleBuilder ].join(",\r\n ")»
«ENDIF»
«IF !file.importedPackages.empty»
Import-Package: «file.importedPackages.filter([e | e.excludeExpression(data)]).map() [ importPackageBuilder ].join(",\r\n ")»
«ENDIF»
«IF !file.exportedPackages.empty»
Export-Package: «file.exportedPackages.filter([e | e.excludeExpression(data)]).map() [ exportPackageBuilder ].join(",\r\n ")»
«ENDIF»
«IF ! serviceComponents(file).empty»
Service-Component: «serviceComponents(file).join(",\r\n ")»
«ENDIF»
	'''
	def excludeExpression(ExcludeableElementMixin mixin, Map<String,Object> data) {
		if( mixin.excludeExpression != null ) {
			return ! mixin.excludeExpression.execute(data)
		}
		return true;
	}

	def serviceComponents(ManifestFile file) {
		val rv = new ArrayList<String>()
		val project = file.eContainer as BundleProject

		project.resources.forEach[r | collect(rv,"",r)];

		return rv
	}

	def collect(List<String> files, String prefix, Resource r) {
		if( r instanceof ComponentDefinitionFile ) {
			files.add(prefix + r.name);
		} else if( r instanceof Folder ) {
			val f = r as Folder;
			for( c : f.children ) {
				collect(files,prefix+r.name+"/",c);
			}
		}
	}

	def exportPackageBuilder(ExportedPackage e) {
		var rv = e.name;
		if( e.eIsSet(BundlePackage$Literals::EXPORTED_PACKAGE__VERSION) ) {
			rv = rv.concat(";version=\""+e.eGet(BundlePackage$Literals::EXPORTED_PACKAGE__VERSION)+"\"");
		}
		return rv;
	}

	def importPackageBuilder(ImportedPackage i) {
		var rv = i.name;
		if(i.eIsSet(BundlePackage$Literals::IMPORTED_PACKAGE__MIN_VERSION) || i.eIsSet(BundlePackage$Literals::IMPORTED_PACKAGE__MAX_VERSION)) {
			rv = rv.concat(";version=\"");
			if (!i.eIsSet(BundlePackage$Literals::IMPORTED_PACKAGE__MAX_VERSION)) {
				rv = rv.concat(i.eGet(BundlePackage$Literals::IMPORTED_PACKAGE__MIN_VERSION).toString);
			} else {
				if( i.minExclusive ) {
					rv = rv.concat("(");
				} else {
					rv = rv.concat("[");
				}
				rv = rv.concat(i.eGet(BundlePackage$Literals::IMPORTED_PACKAGE__MIN_VERSION).toString);
				if( i.maxExclusive ) {
					rv = rv.concat(")");
				} else {
					rv = rv.concat("]");
				}
			}
			rv = rv.concat( "\"");
		}
		return rv;
	}

	def requireBundleBuilder(RequiredBundle r) {
		var rv = r.name;
		if(r.eIsSet(BundlePackage$Literals::REQUIRED_BUNDLE__MIN_VERSION) || r.eIsSet(BundlePackage$Literals::REQUIRED_BUNDLE__MAX_VERSION)) {
			rv = rv.concat("bundle-version=\"");
			if (!r.eIsSet(BundlePackage$Literals::REQUIRED_BUNDLE__MAX_VERSION)) {
				rv = rv.concat(r.eGet(BundlePackage$Literals::REQUIRED_BUNDLE__MIN_VERSION).toString);
			} else {
				if( r.minExclusive ) {
					rv = rv.concat("(");
				} else {
					rv = rv.concat("[");
				}
				rv = rv.concat(r.eGet(BundlePackage$Literals::REQUIRED_BUNDLE__MIN_VERSION).toString);
				if( r.maxExclusive ) {
					rv = rv.concat(")");
				} else {
					rv = rv.concat("]");
				}
			}
			rv = rv.concat( "\"");
		}
		return rv;
	}
}