/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.*;
import org.eclipse.fx.ide.rrobot.model.bundle.Attribute;
import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleFactory;
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
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFileFeaturebase;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductPlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductStartConfig;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature;
import org.eclipse.fx.ide.rrobot.model.bundle.MatchRule;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleFactoryImpl extends EFactoryImpl implements BundleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BundleFactory init() {
		try {
			BundleFactory theBundleFactory = (BundleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.efxclipse.org/rrobot/task/bundle/1.0"); 
			if (theBundleFactory != null) {
				return theBundleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BundleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BundlePackage.BUNDLE_PROJECT: return createBundleProject();
			case BundlePackage.FEATURE_PROJECT: return createFeatureProject();
			case BundlePackage.MANIFEST_FILE: return createManifestFile();
			case BundlePackage.PLUGIN_XML_FILE: return createPluginXMLFile();
			case BundlePackage.BUILD_PROPERTIES: return createBuildProperties();
			case BundlePackage.PRODUCT_FILE_FEATUREBASE: return createProductFileFeaturebase();
			case BundlePackage.FEATURE_FILE: return createFeatureFile();
			case BundlePackage.IMPORTED_PACKAGE: return createImportedPackage();
			case BundlePackage.EXPORTED_PACKAGE: return createExportedPackage();
			case BundlePackage.EXTENSION: return createExtension();
			case BundlePackage.ELEMENT: return createElement();
			case BundlePackage.ATTRIBUTE: return createAttribute();
			case BundlePackage.REQUIRED_BUNDLE: return createRequiredBundle();
			case BundlePackage.LINKED_STRING: return createLinkedString();
			case BundlePackage.FEATURE_PLUGIN: return createFeaturePlugin();
			case BundlePackage.REQUIRED_FEATURE: return createRequiredFeature();
			case BundlePackage.INCLUDED_FEATURE: return createIncludedFeature();
			case BundlePackage.PRODUCT_PLUGIN: return createProductPlugin();
			case BundlePackage.PRODUCT_FEATURE: return createProductFeature();
			case BundlePackage.PRODUCT_START_CONFIG: return createProductStartConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BundlePackage.MATCH_RULE:
				return createMatchRuleFromString(eDataType, initialValue);
			case BundlePackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BundlePackage.MATCH_RULE:
				return convertMatchRuleToString(eDataType, instanceValue);
			case BundlePackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleProject createBundleProject() {
		BundleProjectImpl bundleProject = new BundleProjectImpl();
		return bundleProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureProject createFeatureProject() {
		FeatureProjectImpl featureProject = new FeatureProjectImpl();
		return featureProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestFile createManifestFile() {
		ManifestFileImpl manifestFile = new ManifestFileImpl();
		return manifestFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginXMLFile createPluginXMLFile() {
		PluginXMLFileImpl pluginXMLFile = new PluginXMLFileImpl();
		return pluginXMLFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildProperties createBuildProperties() {
		BuildPropertiesImpl buildProperties = new BuildPropertiesImpl();
		return buildProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFileFeaturebase createProductFileFeaturebase() {
		ProductFileFeaturebaseImpl productFileFeaturebase = new ProductFileFeaturebaseImpl();
		return productFileFeaturebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFile createFeatureFile() {
		FeatureFileImpl featureFile = new FeatureFileImpl();
		return featureFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedPackage createImportedPackage() {
		ImportedPackageImpl importedPackage = new ImportedPackageImpl();
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedPackage createExportedPackage() {
		ExportedPackageImpl exportedPackage = new ExportedPackageImpl();
		return exportedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBundle createRequiredBundle() {
		RequiredBundleImpl requiredBundle = new RequiredBundleImpl();
		return requiredBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedString createLinkedString() {
		LinkedStringImpl linkedString = new LinkedStringImpl();
		return linkedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePlugin createFeaturePlugin() {
		FeaturePluginImpl featurePlugin = new FeaturePluginImpl();
		return featurePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredFeature createRequiredFeature() {
		RequiredFeatureImpl requiredFeature = new RequiredFeatureImpl();
		return requiredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedFeature createIncludedFeature() {
		IncludedFeatureImpl includedFeature = new IncludedFeatureImpl();
		return includedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPlugin createProductPlugin() {
		ProductPluginImpl productPlugin = new ProductPluginImpl();
		return productPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature createProductFeature() {
		ProductFeatureImpl productFeature = new ProductFeatureImpl();
		return productFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStartConfig createProductStartConfig() {
		ProductStartConfigImpl productStartConfig = new ProductStartConfigImpl();
		return productStartConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchRule createMatchRuleFromString(EDataType eDataType, String initialValue) {
		MatchRule result = MatchRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundlePackage getBundlePackage() {
		return (BundlePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BundlePackage getPackage() {
		return BundlePackage.eINSTANCE;
	}

} //BundleFactoryImpl
