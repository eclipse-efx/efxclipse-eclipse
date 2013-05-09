/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.ExportedPackage;
import org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage;
import org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredBundle;
import org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl;
import org.osgi.framework.Version;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getBundlename <em>Bundlename</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getSymbolicname <em>Symbolicname</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getActivatorClass <em>Activator Class</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ManifestFileImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestFileImpl extends TemplatedFileImpl implements ManifestFile {
	/**
	 * The default value of the '{@link #getBundlename() <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundlename()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundlename() <em>Bundlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundlename()
	 * @generated
	 * @ordered
	 */
	protected String bundlename = BUNDLENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolicname() <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicname()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLICNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolicname() <em>Symbolicname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicname()
	 * @generated
	 * @ordered
	 */
	protected String symbolicname = SYMBOLICNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportedPackage> exportedPackages;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedPackage> importedPackages;

	/**
	 * The default value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String executionEnvironment = EXECUTION_ENVIRONMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBundles() <em>Required Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredBundle> requiredBundles;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LAZY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected Boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SINGLETON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleton()
	 * @generated
	 * @ordered
	 */
	protected Boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivatorClass() <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATOR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivatorClass() <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClass()
	 * @generated
	 * @ordered
	 */
	protected String activatorClass = ACTIVATOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ManifestFileImpl() {
		super();
		setGeneratorType("bundle-manifest");
		setName("MANIFEST.MF");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.MANIFEST_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundlename() {
		return bundlename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundlename(String newBundlename) {
		String oldBundlename = bundlename;
		bundlename = newBundlename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__BUNDLENAME, oldBundlename, bundlename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolicname() {
		return symbolicname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicname(String newSymbolicname) {
		String oldSymbolicname = symbolicname;
		symbolicname = newSymbolicname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__SYMBOLICNAME, oldSymbolicname, symbolicname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportedPackage> getExportedPackages() {
		if (exportedPackages == null) {
			exportedPackages = new EObjectContainmentEList<ExportedPackage>(ExportedPackage.class, this, BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES);
		}
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedPackage> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectContainmentEList<ImportedPackage>(ImportedPackage.class, this, BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionEnvironment() {
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionEnvironment(String newExecutionEnvironment) {
		String oldExecutionEnvironment = executionEnvironment;
		executionEnvironment = newExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT, oldExecutionEnvironment, executionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredBundle> getRequiredBundles() {
		if (requiredBundles == null) {
			requiredBundles = new EObjectContainmentEList<RequiredBundle>(RequiredBundle.class, this, BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES);
		}
		return requiredBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(Boolean newLazy) {
		Boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(Boolean newSingleton) {
		Boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivatorClass() {
		return activatorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatorClass(String newActivatorClass) {
		String oldActivatorClass = activatorClass;
		activatorClass = newActivatorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__ACTIVATOR_CLASS, oldActivatorClass, activatorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.MANIFEST_FILE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return ((InternalEList<?>)getExportedPackages()).basicRemove(otherEnd, msgs);
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return ((InternalEList<?>)getRequiredBundles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				return getBundlename();
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				return getSymbolicname();
			case BundlePackage.MANIFEST_FILE__VERSION:
				return getVersion();
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return getExportedPackages();
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return getImportedPackages();
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return getRequiredBundles();
			case BundlePackage.MANIFEST_FILE__LAZY:
				return getLazy();
			case BundlePackage.MANIFEST_FILE__SINGLETON:
				return getSingleton();
			case BundlePackage.MANIFEST_FILE__ACTIVATOR_CLASS:
				return getActivatorClass();
			case BundlePackage.MANIFEST_FILE__VENDOR:
				return getVendor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				setBundlename((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				setSymbolicname((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__VERSION:
				setVersion((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				getExportedPackages().addAll((Collection<? extends ExportedPackage>)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends ImportedPackage>)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				getRequiredBundles().addAll((Collection<? extends RequiredBundle>)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__ACTIVATOR_CLASS:
				setActivatorClass((String)newValue);
				return;
			case BundlePackage.MANIFEST_FILE__VENDOR:
				setVendor((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				setBundlename(BUNDLENAME_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				setSymbolicname(SYMBOLICNAME_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				return;
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				setExecutionEnvironment(EXECUTION_ENVIRONMENT_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				return;
			case BundlePackage.MANIFEST_FILE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__ACTIVATOR_CLASS:
				setActivatorClass(ACTIVATOR_CLASS_EDEFAULT);
				return;
			case BundlePackage.MANIFEST_FILE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BundlePackage.MANIFEST_FILE__BUNDLENAME:
				return BUNDLENAME_EDEFAULT == null ? bundlename != null : !BUNDLENAME_EDEFAULT.equals(bundlename);
			case BundlePackage.MANIFEST_FILE__SYMBOLICNAME:
				return SYMBOLICNAME_EDEFAULT == null ? symbolicname != null : !SYMBOLICNAME_EDEFAULT.equals(symbolicname);
			case BundlePackage.MANIFEST_FILE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BundlePackage.MANIFEST_FILE__EXPORTED_PACKAGES:
				return exportedPackages != null && !exportedPackages.isEmpty();
			case BundlePackage.MANIFEST_FILE__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case BundlePackage.MANIFEST_FILE__EXECUTION_ENVIRONMENT:
				return EXECUTION_ENVIRONMENT_EDEFAULT == null ? executionEnvironment != null : !EXECUTION_ENVIRONMENT_EDEFAULT.equals(executionEnvironment);
			case BundlePackage.MANIFEST_FILE__REQUIRED_BUNDLES:
				return requiredBundles != null && !requiredBundles.isEmpty();
			case BundlePackage.MANIFEST_FILE__LAZY:
				return LAZY_EDEFAULT == null ? lazy != null : !LAZY_EDEFAULT.equals(lazy);
			case BundlePackage.MANIFEST_FILE__SINGLETON:
				return SINGLETON_EDEFAULT == null ? singleton != null : !SINGLETON_EDEFAULT.equals(singleton);
			case BundlePackage.MANIFEST_FILE__ACTIVATOR_CLASS:
				return ACTIVATOR_CLASS_EDEFAULT == null ? activatorClass != null : !ACTIVATOR_CLASS_EDEFAULT.equals(activatorClass);
			case BundlePackage.MANIFEST_FILE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bundlename: ");
		result.append(bundlename);
		result.append(", symbolicname: ");
		result.append(symbolicname);
		result.append(", version: ");
		result.append(version);
		result.append(", executionEnvironment: ");
		result.append(executionEnvironment);
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(", activatorClass: ");
		result.append(activatorClass);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //ManifestFileImpl
