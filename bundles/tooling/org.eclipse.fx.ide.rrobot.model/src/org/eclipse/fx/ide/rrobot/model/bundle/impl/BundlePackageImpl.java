/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.fx.ide.rrobot.model.bundle.Attribute;
import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleFactory;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject;
import org.eclipse.fx.ide.rrobot.model.bundle.Cardinality;
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile;
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentReference;
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
import org.eclipse.fx.ide.rrobot.model.bundle.Policy;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFeature;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFile;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFileFeaturebase;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductPlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductStartConfig;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl;
import org.osgi.framework.Version;

import org.eclipse.fx.ide.rrobot.model.bundle.MatchRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundlePackageImpl extends EPackageImpl implements BundlePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginXMLFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFileFeaturebaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStartConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BundlePackageImpl() {
		super(eNS_URI, BundleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BundlePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BundlePackage init() {
		if (isInited) return (BundlePackage)EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI);

		// Obtain or create and register package
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BundlePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);

		// Create package meta-data objects
		theBundlePackage.createPackageContents();
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theBundlePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBundlePackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BundlePackage.eNS_URI, theBundlePackage);
		return theBundlePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleProject() {
		return bundleProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_Manifest() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_BuildProperties() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_Pluginxml() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureProject() {
		return featureProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureProject_Feature() {
		return (EReference)featureProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestFile() {
		return manifestFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Bundlename() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Symbolicname() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Version() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_ExportedPackages() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_ImportedPackages() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_ExecutionEnvironment() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_RequiredBundles() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Lazy() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Singleton() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_ActivatorClass() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Vendor() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginXMLFile() {
		return pluginXMLFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginXMLFile_Extensions() {
		return (EReference)pluginXMLFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildProperties() {
		return buildPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildProperties_BinIncludes() {
		return (EReference)buildPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFile() {
		return productFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_VmArgs() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_ProgramArgs() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_ProductName() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_Id() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_Application() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_Version() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFile_IncludeLaunchers() {
		return (EAttribute)productFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFile_Startconfigurations() {
		return (EReference)productFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFileFeaturebase() {
		return productFileFeaturebaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFileFeaturebase_Features() {
		return (EReference)productFileFeaturebaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureFile() {
		return featureFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_Version() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_Featurename() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_Featureid() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_Vendor() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_Description() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_Copyright() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_License() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_License_feature() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFile_License_feature_version() {
		return (EAttribute)featureFileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_Plugins() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_Requiredfeatures() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFile_Includedfeatures() {
		return (EReference)featureFileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportedPackage() {
		return importedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_Name() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MinVersion() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MaxVersion() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MinExclusive() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MaxExclusive() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedPackage() {
		return exportedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportedPackage_Name() {
		return (EAttribute)exportedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportedPackage_Version() {
		return (EAttribute)exportedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Id() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Point() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Elements() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Children() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBundle() {
		return requiredBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_Name() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MinVersion() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MaxVersion() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MinExclusive() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MaxExclusive() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkedString() {
		return linkedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkedString_Weburl() {
		return (EAttribute)linkedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkedString_Value() {
		return (EAttribute)linkedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePlugin() {
		return featurePluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePlugin_Id() {
		return (EAttribute)featurePluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePlugin_Unpack() {
		return (EAttribute)featurePluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePlugin_Fragment() {
		return (EAttribute)featurePluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredFeature() {
		return requiredFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredFeature_Id() {
		return (EAttribute)requiredFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredFeature_Match() {
		return (EAttribute)requiredFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredFeature_Version() {
		return (EAttribute)requiredFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedFeature() {
		return includedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFeature_Id() {
		return (EAttribute)includedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedFeature_Version() {
		return (EAttribute)includedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductPlugin() {
		return productPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductPlugin_Id() {
		return (EAttribute)productPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductPlugin_Version() {
		return (EAttribute)productPluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductPlugin_Fragment() {
		return (EAttribute)productPluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFeature() {
		return productFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeature_Id() {
		return (EAttribute)productFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeature_Version() {
		return (EAttribute)productFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductStartConfig() {
		return productStartConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductStartConfig_Id() {
		return (EAttribute)productStartConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductStartConfig_AutoStart() {
		return (EAttribute)productStartConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductStartConfig_StartLevel() {
		return (EAttribute)productStartConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDefinitionFile() {
		return componentDefinitionFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionFile_Id() {
		return (EAttribute)componentDefinitionFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionFile_ComponentClass() {
		return (EAttribute)componentDefinitionFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionFile_ServiceInterfaceList() {
		return (EAttribute)componentDefinitionFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDefinitionFile_ReferenceList() {
		return (EReference)componentDefinitionFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentReference() {
		return componentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Bind() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Unbind() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Cardinality() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Name() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_TypeName() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_Policy() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatchRule() {
		return matchRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicy() {
		return policyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleFactory getBundleFactory() {
		return (BundleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bundleProjectEClass = createEClass(BUNDLE_PROJECT);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__MANIFEST);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__BUILD_PROPERTIES);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__PLUGINXML);

		featureProjectEClass = createEClass(FEATURE_PROJECT);
		createEReference(featureProjectEClass, FEATURE_PROJECT__FEATURE);

		manifestFileEClass = createEClass(MANIFEST_FILE);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__BUNDLENAME);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__SYMBOLICNAME);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__VERSION);
		createEReference(manifestFileEClass, MANIFEST_FILE__EXPORTED_PACKAGES);
		createEReference(manifestFileEClass, MANIFEST_FILE__IMPORTED_PACKAGES);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__EXECUTION_ENVIRONMENT);
		createEReference(manifestFileEClass, MANIFEST_FILE__REQUIRED_BUNDLES);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__LAZY);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__SINGLETON);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__ACTIVATOR_CLASS);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__VENDOR);

		pluginXMLFileEClass = createEClass(PLUGIN_XML_FILE);
		createEReference(pluginXMLFileEClass, PLUGIN_XML_FILE__EXTENSIONS);

		buildPropertiesEClass = createEClass(BUILD_PROPERTIES);
		createEReference(buildPropertiesEClass, BUILD_PROPERTIES__BIN_INCLUDES);

		productFileEClass = createEClass(PRODUCT_FILE);
		createEAttribute(productFileEClass, PRODUCT_FILE__VM_ARGS);
		createEAttribute(productFileEClass, PRODUCT_FILE__PROGRAM_ARGS);
		createEAttribute(productFileEClass, PRODUCT_FILE__PRODUCT_NAME);
		createEAttribute(productFileEClass, PRODUCT_FILE__ID);
		createEAttribute(productFileEClass, PRODUCT_FILE__APPLICATION);
		createEAttribute(productFileEClass, PRODUCT_FILE__VERSION);
		createEAttribute(productFileEClass, PRODUCT_FILE__INCLUDE_LAUNCHERS);
		createEReference(productFileEClass, PRODUCT_FILE__STARTCONFIGURATIONS);

		productFileFeaturebaseEClass = createEClass(PRODUCT_FILE_FEATUREBASE);
		createEReference(productFileFeaturebaseEClass, PRODUCT_FILE_FEATUREBASE__FEATURES);

		featureFileEClass = createEClass(FEATURE_FILE);
		createEAttribute(featureFileEClass, FEATURE_FILE__VERSION);
		createEAttribute(featureFileEClass, FEATURE_FILE__FEATURENAME);
		createEAttribute(featureFileEClass, FEATURE_FILE__FEATUREID);
		createEAttribute(featureFileEClass, FEATURE_FILE__VENDOR);
		createEReference(featureFileEClass, FEATURE_FILE__DESCRIPTION);
		createEReference(featureFileEClass, FEATURE_FILE__COPYRIGHT);
		createEReference(featureFileEClass, FEATURE_FILE__LICENSE);
		createEAttribute(featureFileEClass, FEATURE_FILE__LICENSE_FEATURE);
		createEAttribute(featureFileEClass, FEATURE_FILE__LICENSE_FEATURE_VERSION);
		createEReference(featureFileEClass, FEATURE_FILE__PLUGINS);
		createEReference(featureFileEClass, FEATURE_FILE__REQUIREDFEATURES);
		createEReference(featureFileEClass, FEATURE_FILE__INCLUDEDFEATURES);

		importedPackageEClass = createEClass(IMPORTED_PACKAGE);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__NAME);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MIN_VERSION);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MAX_VERSION);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MIN_EXCLUSIVE);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MAX_EXCLUSIVE);

		exportedPackageEClass = createEClass(EXPORTED_PACKAGE);
		createEAttribute(exportedPackageEClass, EXPORTED_PACKAGE__NAME);
		createEAttribute(exportedPackageEClass, EXPORTED_PACKAGE__VERSION);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__ID);
		createEAttribute(extensionEClass, EXTENSION__POINT);
		createEReference(extensionEClass, EXTENSION__ELEMENTS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEReference(elementEClass, ELEMENT__CHILDREN);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		requiredBundleEClass = createEClass(REQUIRED_BUNDLE);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__NAME);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MIN_VERSION);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MAX_VERSION);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MIN_EXCLUSIVE);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MAX_EXCLUSIVE);

		linkedStringEClass = createEClass(LINKED_STRING);
		createEAttribute(linkedStringEClass, LINKED_STRING__WEBURL);
		createEAttribute(linkedStringEClass, LINKED_STRING__VALUE);

		featurePluginEClass = createEClass(FEATURE_PLUGIN);
		createEAttribute(featurePluginEClass, FEATURE_PLUGIN__ID);
		createEAttribute(featurePluginEClass, FEATURE_PLUGIN__UNPACK);
		createEAttribute(featurePluginEClass, FEATURE_PLUGIN__FRAGMENT);

		requiredFeatureEClass = createEClass(REQUIRED_FEATURE);
		createEAttribute(requiredFeatureEClass, REQUIRED_FEATURE__ID);
		createEAttribute(requiredFeatureEClass, REQUIRED_FEATURE__MATCH);
		createEAttribute(requiredFeatureEClass, REQUIRED_FEATURE__VERSION);

		includedFeatureEClass = createEClass(INCLUDED_FEATURE);
		createEAttribute(includedFeatureEClass, INCLUDED_FEATURE__ID);
		createEAttribute(includedFeatureEClass, INCLUDED_FEATURE__VERSION);

		productPluginEClass = createEClass(PRODUCT_PLUGIN);
		createEAttribute(productPluginEClass, PRODUCT_PLUGIN__ID);
		createEAttribute(productPluginEClass, PRODUCT_PLUGIN__VERSION);
		createEAttribute(productPluginEClass, PRODUCT_PLUGIN__FRAGMENT);

		productFeatureEClass = createEClass(PRODUCT_FEATURE);
		createEAttribute(productFeatureEClass, PRODUCT_FEATURE__ID);
		createEAttribute(productFeatureEClass, PRODUCT_FEATURE__VERSION);

		productStartConfigEClass = createEClass(PRODUCT_START_CONFIG);
		createEAttribute(productStartConfigEClass, PRODUCT_START_CONFIG__ID);
		createEAttribute(productStartConfigEClass, PRODUCT_START_CONFIG__AUTO_START);
		createEAttribute(productStartConfigEClass, PRODUCT_START_CONFIG__START_LEVEL);

		componentDefinitionFileEClass = createEClass(COMPONENT_DEFINITION_FILE);
		createEAttribute(componentDefinitionFileEClass, COMPONENT_DEFINITION_FILE__ID);
		createEAttribute(componentDefinitionFileEClass, COMPONENT_DEFINITION_FILE__COMPONENT_CLASS);
		createEAttribute(componentDefinitionFileEClass, COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST);
		createEReference(componentDefinitionFileEClass, COMPONENT_DEFINITION_FILE__REFERENCE_LIST);

		componentReferenceEClass = createEClass(COMPONENT_REFERENCE);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__BIND);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__UNBIND);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__CARDINALITY);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__NAME);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__TYPE_NAME);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__POLICY);

		// Create enums
		matchRuleEEnum = createEEnum(MATCH_RULE);
		cardinalityEEnum = createEEnum(CARDINALITY);
		policyEEnum = createEEnum(POLICY);

		// Create data types
		versionEDataType = createEDataType(VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TaskPackage theTaskPackage = (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bundleProjectEClass.getESuperTypes().add(theTaskPackage.getJDTProject());
		featureProjectEClass.getESuperTypes().add(theTaskPackage.getProject());
		manifestFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		pluginXMLFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		buildPropertiesEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		productFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		productFileFeaturebaseEClass.getESuperTypes().add(this.getProductFile());
		featureFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		importedPackageEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		exportedPackageEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		extensionEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		requiredBundleEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		featurePluginEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		requiredFeatureEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		includedFeatureEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		productPluginEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		productFeatureEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		productStartConfigEClass.getESuperTypes().add(theTaskPackage.getExcludeableElementMixin());
		componentDefinitionFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());

		// Initialize classes and features; add operations and parameters
		initEClass(bundleProjectEClass, BundleProject.class, "BundleProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleProject_Manifest(), this.getManifestFile(), null, "manifest", null, 1, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleProject_BuildProperties(), this.getBuildProperties(), null, "buildProperties", null, 1, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleProject_Pluginxml(), this.getPluginXMLFile(), null, "pluginxml", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureProjectEClass, FeatureProject.class, "FeatureProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureProject_Feature(), this.getFeatureFile(), null, "feature", null, 0, 1, FeatureProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestFileEClass, ManifestFile.class, "ManifestFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifestFile_Bundlename(), ecorePackage.getEString(), "bundlename", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Symbolicname(), ecorePackage.getEString(), "symbolicname", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Version(), ecorePackage.getEString(), "version", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_ExportedPackages(), this.getExportedPackage(), null, "exportedPackages", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_ImportedPackages(), this.getImportedPackage(), null, "importedPackages", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_ExecutionEnvironment(), ecorePackage.getEString(), "executionEnvironment", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_RequiredBundles(), this.getRequiredBundle(), null, "requiredBundles", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Lazy(), ecorePackage.getEBooleanObject(), "lazy", null, 0, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Singleton(), ecorePackage.getEBooleanObject(), "singleton", null, 0, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_ActivatorClass(), ecorePackage.getEString(), "activatorClass", null, 0, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginXMLFileEClass, PluginXMLFile.class, "PluginXMLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginXMLFile_Extensions(), this.getExtension(), null, "extensions", null, 0, -1, PluginXMLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildPropertiesEClass, BuildProperties.class, "BuildProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildProperties_BinIncludes(), theTaskPackage.getResource(), null, "binIncludes", null, 0, -1, BuildProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFileEClass, ProductFile.class, "ProductFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductFile_VmArgs(), ecorePackage.getEString(), "vmArgs", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_ProgramArgs(), ecorePackage.getEString(), "programArgs", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_Application(), ecorePackage.getEString(), "application", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFile_IncludeLaunchers(), ecorePackage.getEBoolean(), "includeLaunchers", null, 0, 1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFile_Startconfigurations(), this.getProductStartConfig(), null, "startconfigurations", null, 0, -1, ProductFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFileFeaturebaseEClass, ProductFileFeaturebase.class, "ProductFileFeaturebase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductFileFeaturebase_Features(), this.getProductFeature(), null, "features", null, 0, -1, ProductFileFeaturebase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureFileEClass, FeatureFile.class, "FeatureFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureFile_Version(), ecorePackage.getEString(), "version", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFile_Featurename(), ecorePackage.getEString(), "featurename", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFile_Featureid(), ecorePackage.getEString(), "featureid", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFile_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_Description(), this.getLinkedString(), null, "description", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_Copyright(), this.getLinkedString(), null, "copyright", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_License(), this.getLinkedString(), null, "license", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFile_License_feature(), ecorePackage.getEString(), "license_feature", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFile_License_feature_version(), this.getVersion(), "license_feature_version", null, 0, 1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_Plugins(), this.getFeaturePlugin(), null, "plugins", null, 0, -1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_Requiredfeatures(), this.getRequiredFeature(), null, "requiredfeatures", null, 0, -1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureFile_Includedfeatures(), this.getIncludedFeature(), null, "includedfeatures", null, 0, -1, FeatureFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedPackageEClass, ImportedPackage.class, "ImportedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportedPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MinVersion(), this.getVersion(), "minVersion", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MaxVersion(), this.getVersion(), "maxVersion", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MinExclusive(), ecorePackage.getEBoolean(), "minExclusive", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MaxExclusive(), ecorePackage.getEBoolean(), "maxExclusive", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportedPackageEClass, ExportedPackage.class, "ExportedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportedPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportedPackage_Version(), this.getVersion(), "version", null, 0, 1, ExportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Id(), ecorePackage.getEString(), "id", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Point(), ecorePackage.getEString(), "point", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Elements(), this.getElement(), null, "elements", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Children(), this.getElement(), null, "children", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredBundleEClass, RequiredBundle.class, "RequiredBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredBundle_Name(), ecorePackage.getEString(), "name", null, 1, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MinVersion(), this.getVersion(), "minVersion", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MaxVersion(), this.getVersion(), "maxVersion", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MinExclusive(), ecorePackage.getEBoolean(), "minExclusive", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MaxExclusive(), ecorePackage.getEBoolean(), "maxExclusive", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkedStringEClass, LinkedString.class, "LinkedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkedString_Weburl(), ecorePackage.getEString(), "weburl", null, 0, 1, LinkedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkedString_Value(), ecorePackage.getEString(), "value", null, 0, 1, LinkedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePluginEClass, FeaturePlugin.class, "FeaturePlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePlugin_Id(), ecorePackage.getEString(), "id", null, 0, 1, FeaturePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturePlugin_Unpack(), ecorePackage.getEBoolean(), "unpack", null, 0, 1, FeaturePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturePlugin_Fragment(), ecorePackage.getEBoolean(), "fragment", null, 0, 1, FeaturePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredFeatureEClass, RequiredFeature.class, "RequiredFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, RequiredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredFeature_Match(), this.getMatchRule(), "match", null, 0, 1, RequiredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredFeature_Version(), this.getVersion(), "version", null, 0, 1, RequiredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedFeatureEClass, IncludedFeature.class, "IncludedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludedFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedFeature_Version(), this.getVersion(), "version", null, 0, 1, IncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPluginEClass, ProductPlugin.class, "ProductPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductPlugin_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProductPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPlugin_Version(), this.getVersion(), "version", null, 0, 1, ProductPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductPlugin_Fragment(), ecorePackage.getEBoolean(), "fragment", null, 0, 1, ProductPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFeatureEClass, ProductFeature.class, "ProductFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProductFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeature_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProductFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStartConfigEClass, ProductStartConfig.class, "ProductStartConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStartConfig_Id(), ecorePackage.getEString(), "id", null, 0, 1, ProductStartConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStartConfig_AutoStart(), ecorePackage.getEBoolean(), "autoStart", null, 0, 1, ProductStartConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStartConfig_StartLevel(), ecorePackage.getEInt(), "startLevel", null, 0, 1, ProductStartConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDefinitionFileEClass, ComponentDefinitionFile.class, "ComponentDefinitionFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDefinitionFile_Id(), ecorePackage.getEString(), "id", null, 0, 1, ComponentDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinitionFile_ComponentClass(), ecorePackage.getEString(), "componentClass", null, 0, 1, ComponentDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinitionFile_ServiceInterfaceList(), ecorePackage.getEString(), "serviceInterfaceList", null, 0, -1, ComponentDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDefinitionFile_ReferenceList(), this.getComponentReference(), null, "referenceList", null, 0, -1, ComponentDefinitionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentReferenceEClass, ComponentReference.class, "ComponentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentReference_Bind(), ecorePackage.getEString(), "bind", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentReference_Unbind(), ecorePackage.getEString(), "unbind", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentReference_Cardinality(), this.getCardinality(), "cardinality", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentReference_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentReference_Policy(), this.getPolicy(), "policy", null, 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(matchRuleEEnum, MatchRule.class, "MatchRule");
		addEEnumLiteral(matchRuleEEnum, MatchRule.NONE);
		addEEnumLiteral(matchRuleEEnum, MatchRule.EQUIVALENT);
		addEEnumLiteral(matchRuleEEnum, MatchRule.COMPATIBLE);
		addEEnumLiteral(matchRuleEEnum, MatchRule.PERFECT);
		addEEnumLiteral(matchRuleEEnum, MatchRule.GREATER_OR_EQUAL);

		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.SINGLE_OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.SINGLE_REQUIRED);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MULTI_OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MULTI_REQUIRED);

		initEEnum(policyEEnum, Policy.class, "Policy");
		addEEnumLiteral(policyEEnum, Policy.DYNAMIC);
		addEEnumLiteral(policyEEnum, Policy.STATIC);

		// Initialize data types
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BundlePackageImpl
