/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;


import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getFeaturename <em>Featurename</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getFeatureid <em>Featureid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense <em>License</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense_feature <em>License feature</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense_feature_version <em>License feature version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getRequiredfeatures <em>Requiredfeatures</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getIncludedfeatures <em>Includedfeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile()
 * @model
 * @generated
 */
public interface FeatureFile extends TemplatedFile {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Featurename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featurename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featurename</em>' attribute.
	 * @see #setFeaturename(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Featurename()
	 * @model
	 * @generated
	 */
	String getFeaturename();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getFeaturename <em>Featurename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featurename</em>' attribute.
	 * @see #getFeaturename()
	 * @generated
	 */
	void setFeaturename(String value);

	/**
	 * Returns the value of the '<em><b>Featureid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featureid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featureid</em>' attribute.
	 * @see #setFeatureid(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Featureid()
	 * @model
	 * @generated
	 */
	String getFeatureid();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getFeatureid <em>Featureid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featureid</em>' attribute.
	 * @see #getFeatureid()
	 * @generated
	 */
	void setFeatureid(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(LinkedString)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Description()
	 * @model containment="true"
	 * @generated
	 */
	LinkedString getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LinkedString value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(LinkedString)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	LinkedString getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(LinkedString value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(LinkedString)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_License()
	 * @model containment="true"
	 * @generated
	 */
	LinkedString getLicense();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(LinkedString value);

	/**
	 * Returns the value of the '<em><b>License feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License feature</em>' attribute.
	 * @see #setLicense_feature(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_License_feature()
	 * @model
	 * @generated
	 */
	String getLicense_feature();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense_feature <em>License feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License feature</em>' attribute.
	 * @see #getLicense_feature()
	 * @generated
	 */
	void setLicense_feature(String value);

	/**
	 * Returns the value of the '<em><b>License feature version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License feature version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License feature version</em>' attribute.
	 * @see #setLicense_feature_version(Version)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_License_feature_version()
	 * @model dataType="at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Version"
	 * @generated
	 */
	Version getLicense_feature_version();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile#getLicense_feature_version <em>License feature version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License feature version</em>' attribute.
	 * @see #getLicense_feature_version()
	 * @generated
	 */
	void setLicense_feature_version(Version value);

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeaturePlugin> getPlugins();

	/**
	 * Returns the value of the '<em><b>Requiredfeatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiredfeatures</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredfeatures</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Requiredfeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredFeature> getRequiredfeatures();

	/**
	 * Returns the value of the '<em><b>Includedfeatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.IncludedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includedfeatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includedfeatures</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureFile_Includedfeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludedFeature> getIncludedfeatures();

} // FeatureFile
