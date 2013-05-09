/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;


import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.File;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getBundlename <em>Bundlename</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getSymbolicname <em>Symbolicname</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getActivatorClass <em>Activator Class</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile()
 * @model
 * @generated
 */
public interface ManifestFile extends TemplatedFile {
	/**
	 * Returns the value of the '<em><b>Bundlename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundlename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundlename</em>' attribute.
	 * @see #setBundlename(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Bundlename()
	 * @model required="true"
	 * @generated
	 */
	String getBundlename();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getBundlename <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundlename</em>' attribute.
	 * @see #getBundlename()
	 * @generated
	 */
	void setBundlename(String value);

	/**
	 * Returns the value of the '<em><b>Symbolicname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolicname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolicname</em>' attribute.
	 * @see #setSymbolicname(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Symbolicname()
	 * @model required="true"
	 * @generated
	 */
	String getSymbolicname();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getSymbolicname <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolicname</em>' attribute.
	 * @see #getSymbolicname()
	 * @generated
	 */
	void setSymbolicname(String value);

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
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.ExportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_ExportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportedPackage> getExportedPackages();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedPackage> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environment</em>' attribute.
	 * @see #setExecutionEnvironment(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_ExecutionEnvironment()
	 * @model required="true"
	 * @generated
	 */
	String getExecutionEnvironment();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getExecutionEnvironment <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Environment</em>' attribute.
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	void setExecutionEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Required Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Bundles</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_RequiredBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredBundle> getRequiredBundles();

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(Boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Lazy()
	 * @model
	 * @generated
	 */
	Boolean getLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #getLazy()
	 * @generated
	 */
	void setLazy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(Boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Singleton()
	 * @model
	 * @generated
	 */
	Boolean getSingleton();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #getSingleton()
	 * @generated
	 */
	void setSingleton(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activator Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator Class</em>' attribute.
	 * @see #setActivatorClass(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_ActivatorClass()
	 * @model
	 * @generated
	 */
	String getActivatorClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getActivatorClass <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator Class</em>' attribute.
	 * @see #getActivatorClass()
	 * @generated
	 */
	void setActivatorClass(String value);

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
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getManifestFile_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

} // ManifestFile
