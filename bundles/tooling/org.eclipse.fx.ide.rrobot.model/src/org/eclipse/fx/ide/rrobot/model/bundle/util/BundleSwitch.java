/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.util;

import org.eclipse.fx.ide.rrobot.model.bundle.*;

import org.eclipse.fx.ide.rrobot.model.task.Resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.fx.ide.rrobot.model.bundle.Attribute;
import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject;
import org.eclipse.fx.ide.rrobot.model.bundle.Element;
import org.eclipse.fx.ide.rrobot.model.bundle.ExportedPackage;
import org.eclipse.fx.ide.rrobot.model.bundle.Extension;
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile;
import org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject;
import org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage;
import org.eclipse.fx.ide.rrobot.model.bundle.IncludedFeature;
import org.eclipse.fx.ide.rrobot.model.bundle.LinkedString;
import org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile;
import org.eclipse.fx.ide.rrobot.model.bundle.PluginXMLFile;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFeature;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFile;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFileFeaturebase;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductPlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductStartConfig;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature;
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin;
import org.eclipse.fx.ide.rrobot.model.task.File;
import org.eclipse.fx.ide.rrobot.model.task.JDTProject;
import org.eclipse.fx.ide.rrobot.model.task.Project;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage
 * @generated
 */
public class BundleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BundlePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSwitch() {
		if (modelPackage == null) {
			modelPackage = BundlePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BundlePackage.BUNDLE_PROJECT: {
				BundleProject bundleProject = (BundleProject)theEObject;
				T result = caseBundleProject(bundleProject);
				if (result == null) result = caseJDTProject(bundleProject);
				if (result == null) result = caseProject(bundleProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.FEATURE_PROJECT: {
				FeatureProject featureProject = (FeatureProject)theEObject;
				T result = caseFeatureProject(featureProject);
				if (result == null) result = caseProject(featureProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.MANIFEST_FILE: {
				ManifestFile manifestFile = (ManifestFile)theEObject;
				T result = caseManifestFile(manifestFile);
				if (result == null) result = caseTemplatedFile(manifestFile);
				if (result == null) result = caseFile(manifestFile);
				if (result == null) result = caseResource(manifestFile);
				if (result == null) result = caseExcludeableElementMixin(manifestFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PLUGIN_XML_FILE: {
				PluginXMLFile pluginXMLFile = (PluginXMLFile)theEObject;
				T result = casePluginXMLFile(pluginXMLFile);
				if (result == null) result = caseTemplatedFile(pluginXMLFile);
				if (result == null) result = caseFile(pluginXMLFile);
				if (result == null) result = caseResource(pluginXMLFile);
				if (result == null) result = caseExcludeableElementMixin(pluginXMLFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.BUILD_PROPERTIES: {
				BuildProperties buildProperties = (BuildProperties)theEObject;
				T result = caseBuildProperties(buildProperties);
				if (result == null) result = caseTemplatedFile(buildProperties);
				if (result == null) result = caseFile(buildProperties);
				if (result == null) result = caseResource(buildProperties);
				if (result == null) result = caseExcludeableElementMixin(buildProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PRODUCT_FILE: {
				ProductFile productFile = (ProductFile)theEObject;
				T result = caseProductFile(productFile);
				if (result == null) result = caseTemplatedFile(productFile);
				if (result == null) result = caseFile(productFile);
				if (result == null) result = caseResource(productFile);
				if (result == null) result = caseExcludeableElementMixin(productFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PRODUCT_FILE_FEATUREBASE: {
				ProductFileFeaturebase productFileFeaturebase = (ProductFileFeaturebase)theEObject;
				T result = caseProductFileFeaturebase(productFileFeaturebase);
				if (result == null) result = caseProductFile(productFileFeaturebase);
				if (result == null) result = caseTemplatedFile(productFileFeaturebase);
				if (result == null) result = caseFile(productFileFeaturebase);
				if (result == null) result = caseResource(productFileFeaturebase);
				if (result == null) result = caseExcludeableElementMixin(productFileFeaturebase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.FEATURE_FILE: {
				FeatureFile featureFile = (FeatureFile)theEObject;
				T result = caseFeatureFile(featureFile);
				if (result == null) result = caseTemplatedFile(featureFile);
				if (result == null) result = caseFile(featureFile);
				if (result == null) result = caseResource(featureFile);
				if (result == null) result = caseExcludeableElementMixin(featureFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.IMPORTED_PACKAGE: {
				ImportedPackage importedPackage = (ImportedPackage)theEObject;
				T result = caseImportedPackage(importedPackage);
				if (result == null) result = caseExcludeableElementMixin(importedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.EXPORTED_PACKAGE: {
				ExportedPackage exportedPackage = (ExportedPackage)theEObject;
				T result = caseExportedPackage(exportedPackage);
				if (result == null) result = caseExcludeableElementMixin(exportedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseExcludeableElementMixin(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.REQUIRED_BUNDLE: {
				RequiredBundle requiredBundle = (RequiredBundle)theEObject;
				T result = caseRequiredBundle(requiredBundle);
				if (result == null) result = caseExcludeableElementMixin(requiredBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.LINKED_STRING: {
				LinkedString linkedString = (LinkedString)theEObject;
				T result = caseLinkedString(linkedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.FEATURE_PLUGIN: {
				FeaturePlugin featurePlugin = (FeaturePlugin)theEObject;
				T result = caseFeaturePlugin(featurePlugin);
				if (result == null) result = caseExcludeableElementMixin(featurePlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.REQUIRED_FEATURE: {
				RequiredFeature requiredFeature = (RequiredFeature)theEObject;
				T result = caseRequiredFeature(requiredFeature);
				if (result == null) result = caseExcludeableElementMixin(requiredFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.INCLUDED_FEATURE: {
				IncludedFeature includedFeature = (IncludedFeature)theEObject;
				T result = caseIncludedFeature(includedFeature);
				if (result == null) result = caseExcludeableElementMixin(includedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PRODUCT_PLUGIN: {
				ProductPlugin productPlugin = (ProductPlugin)theEObject;
				T result = caseProductPlugin(productPlugin);
				if (result == null) result = caseExcludeableElementMixin(productPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PRODUCT_FEATURE: {
				ProductFeature productFeature = (ProductFeature)theEObject;
				T result = caseProductFeature(productFeature);
				if (result == null) result = caseExcludeableElementMixin(productFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BundlePackage.PRODUCT_START_CONFIG: {
				ProductStartConfig productStartConfig = (ProductStartConfig)theEObject;
				T result = caseProductStartConfig(productStartConfig);
				if (result == null) result = caseExcludeableElementMixin(productStartConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleProject(BundleProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureProject(FeatureProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestFile(ManifestFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin XML File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin XML File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginXMLFile(PluginXMLFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildProperties(BuildProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductFile(ProductFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product File Featurebase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product File Featurebase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductFileFeaturebase(ProductFileFeaturebase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureFile(FeatureFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedPackage(ImportedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportedPackage(ExportedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredBundle(RequiredBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linked String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linked String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkedString(LinkedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePlugin(FeaturePlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredFeature(RequiredFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedFeature(IncludedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductPlugin(ProductPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductFeature(ProductFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Start Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Start Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStartConfig(ProductStartConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JDT Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JDT Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJDTProject(JDTProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excludeable Element Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excludeable Element Mixin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeableElementMixin(ExcludeableElementMixin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templated File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templated File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplatedFile(TemplatedFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BundleSwitch
