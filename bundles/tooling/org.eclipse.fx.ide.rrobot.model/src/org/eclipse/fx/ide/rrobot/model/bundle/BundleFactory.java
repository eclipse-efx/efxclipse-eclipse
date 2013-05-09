/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage
 * @generated
 */
public interface BundleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BundleFactory eINSTANCE = org.eclipse.fx.ide.rrobot.model.bundle.impl.BundleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	BundleProject createBundleProject();

	/**
	 * Returns a new object of class '<em>Feature Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Project</em>'.
	 * @generated
	 */
	FeatureProject createFeatureProject();

	/**
	 * Returns a new object of class '<em>Manifest File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifest File</em>'.
	 * @generated
	 */
	ManifestFile createManifestFile();

	/**
	 * Returns a new object of class '<em>Plugin XML File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin XML File</em>'.
	 * @generated
	 */
	PluginXMLFile createPluginXMLFile();

	/**
	 * Returns a new object of class '<em>Build Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Properties</em>'.
	 * @generated
	 */
	BuildProperties createBuildProperties();

	/**
	 * Returns a new object of class '<em>Product File Featurebase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product File Featurebase</em>'.
	 * @generated
	 */
	ProductFileFeaturebase createProductFileFeaturebase();

	/**
	 * Returns a new object of class '<em>Feature File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature File</em>'.
	 * @generated
	 */
	FeatureFile createFeatureFile();

	/**
	 * Returns a new object of class '<em>Imported Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Package</em>'.
	 * @generated
	 */
	ImportedPackage createImportedPackage();

	/**
	 * Returns a new object of class '<em>Exported Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exported Package</em>'.
	 * @generated
	 */
	ExportedPackage createExportedPackage();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Required Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Bundle</em>'.
	 * @generated
	 */
	RequiredBundle createRequiredBundle();

	/**
	 * Returns a new object of class '<em>Linked String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linked String</em>'.
	 * @generated
	 */
	LinkedString createLinkedString();

	/**
	 * Returns a new object of class '<em>Feature Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Plugin</em>'.
	 * @generated
	 */
	FeaturePlugin createFeaturePlugin();

	/**
	 * Returns a new object of class '<em>Required Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Feature</em>'.
	 * @generated
	 */
	RequiredFeature createRequiredFeature();

	/**
	 * Returns a new object of class '<em>Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Feature</em>'.
	 * @generated
	 */
	IncludedFeature createIncludedFeature();

	/**
	 * Returns a new object of class '<em>Product Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Plugin</em>'.
	 * @generated
	 */
	ProductPlugin createProductPlugin();

	/**
	 * Returns a new object of class '<em>Product Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature</em>'.
	 * @generated
	 */
	ProductFeature createProductFeature();

	/**
	 * Returns a new object of class '<em>Product Start Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Start Config</em>'.
	 * @generated
	 */
	ProductStartConfig createProductStartConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BundlePackage getBundlePackage();

} //BundleFactory
