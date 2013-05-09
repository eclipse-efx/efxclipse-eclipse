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
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile;
import org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin;
import org.eclipse.fx.ide.rrobot.model.bundle.IncludedFeature;
import org.eclipse.fx.ide.rrobot.model.bundle.LinkedString;
import org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature;
import org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl;
import org.osgi.framework.Version;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getFeaturename <em>Featurename</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getFeatureid <em>Featureid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getLicense_feature <em>License feature</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getLicense_feature_version <em>License feature version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getRequiredfeatures <em>Requiredfeatures</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.FeatureFileImpl#getIncludedfeatures <em>Includedfeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureFileImpl extends TemplatedFileImpl implements FeatureFile {
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
	 * The default value of the '{@link #getFeaturename() <em>Featurename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturename()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeaturename() <em>Featurename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturename()
	 * @generated
	 * @ordered
	 */
	protected String featurename = FEATURENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureid() <em>Featureid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureid()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATUREID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureid() <em>Featureid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureid()
	 * @generated
	 * @ordered
	 */
	protected String featureid = FEATUREID_EDEFAULT;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected LinkedString description;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected LinkedString copyright;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected LinkedString license;

	/**
	 * The default value of the '{@link #getLicense_feature() <em>License feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_feature()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense_feature() <em>License feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_feature()
	 * @generated
	 * @ordered
	 */
	protected String license_feature = LICENSE_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense_feature_version() <em>License feature version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_feature_version()
	 * @generated
	 * @ordered
	 */
	protected static final Version LICENSE_FEATURE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense_feature_version() <em>License feature version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense_feature_version()
	 * @generated
	 * @ordered
	 */
	protected Version license_feature_version = LICENSE_FEATURE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<FeaturePlugin> plugins;

	/**
	 * The cached value of the '{@link #getRequiredfeatures() <em>Requiredfeatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredfeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredFeature> requiredfeatures;

	/**
	 * The cached value of the '{@link #getIncludedfeatures() <em>Includedfeatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedfeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedFeature> includedfeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FeatureFileImpl() {
		super();
		setGeneratorType("feature-xml");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.FEATURE_FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeaturename() {
		return featurename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturename(String newFeaturename) {
		String oldFeaturename = featurename;
		featurename = newFeaturename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__FEATURENAME, oldFeaturename, featurename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureid() {
		return featureid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureid(String newFeatureid) {
		String oldFeatureid = featureid;
		featureid = newFeatureid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__FEATUREID, oldFeatureid, featureid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedString getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(LinkedString newDescription, NotificationChain msgs) {
		LinkedString oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(LinkedString newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedString getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(LinkedString newCopyright, NotificationChain msgs) {
		LinkedString oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(LinkedString newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedString getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(LinkedString newLicense, NotificationChain msgs) {
		LinkedString oldLicense = license;
		license = newLicense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__LICENSE, oldLicense, newLicense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(LinkedString newLicense) {
		if (newLicense != license) {
			NotificationChain msgs = null;
			if (license != null)
				msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.FEATURE_FILE__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__LICENSE, newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense_feature() {
		return license_feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense_feature(String newLicense_feature) {
		String oldLicense_feature = license_feature;
		license_feature = newLicense_feature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__LICENSE_FEATURE, oldLicense_feature, license_feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getLicense_feature_version() {
		return license_feature_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense_feature_version(Version newLicense_feature_version) {
		Version oldLicense_feature_version = license_feature_version;
		license_feature_version = newLicense_feature_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.FEATURE_FILE__LICENSE_FEATURE_VERSION, oldLicense_feature_version, license_feature_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeaturePlugin> getPlugins() {
		if (plugins == null) {
			plugins = new EObjectContainmentEList<FeaturePlugin>(FeaturePlugin.class, this, BundlePackage.FEATURE_FILE__PLUGINS);
		}
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredFeature> getRequiredfeatures() {
		if (requiredfeatures == null) {
			requiredfeatures = new EObjectContainmentEList<RequiredFeature>(RequiredFeature.class, this, BundlePackage.FEATURE_FILE__REQUIREDFEATURES);
		}
		return requiredfeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedFeature> getIncludedfeatures() {
		if (includedfeatures == null) {
			includedfeatures = new EObjectContainmentEList<IncludedFeature>(IncludedFeature.class, this, BundlePackage.FEATURE_FILE__INCLUDEDFEATURES);
		}
		return includedfeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.FEATURE_FILE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case BundlePackage.FEATURE_FILE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case BundlePackage.FEATURE_FILE__LICENSE:
				return basicSetLicense(null, msgs);
			case BundlePackage.FEATURE_FILE__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case BundlePackage.FEATURE_FILE__REQUIREDFEATURES:
				return ((InternalEList<?>)getRequiredfeatures()).basicRemove(otherEnd, msgs);
			case BundlePackage.FEATURE_FILE__INCLUDEDFEATURES:
				return ((InternalEList<?>)getIncludedfeatures()).basicRemove(otherEnd, msgs);
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
			case BundlePackage.FEATURE_FILE__VERSION:
				return getVersion();
			case BundlePackage.FEATURE_FILE__FEATURENAME:
				return getFeaturename();
			case BundlePackage.FEATURE_FILE__FEATUREID:
				return getFeatureid();
			case BundlePackage.FEATURE_FILE__VENDOR:
				return getVendor();
			case BundlePackage.FEATURE_FILE__DESCRIPTION:
				return getDescription();
			case BundlePackage.FEATURE_FILE__COPYRIGHT:
				return getCopyright();
			case BundlePackage.FEATURE_FILE__LICENSE:
				return getLicense();
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE:
				return getLicense_feature();
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE_VERSION:
				return getLicense_feature_version();
			case BundlePackage.FEATURE_FILE__PLUGINS:
				return getPlugins();
			case BundlePackage.FEATURE_FILE__REQUIREDFEATURES:
				return getRequiredfeatures();
			case BundlePackage.FEATURE_FILE__INCLUDEDFEATURES:
				return getIncludedfeatures();
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
			case BundlePackage.FEATURE_FILE__VERSION:
				setVersion((String)newValue);
				return;
			case BundlePackage.FEATURE_FILE__FEATURENAME:
				setFeaturename((String)newValue);
				return;
			case BundlePackage.FEATURE_FILE__FEATUREID:
				setFeatureid((String)newValue);
				return;
			case BundlePackage.FEATURE_FILE__VENDOR:
				setVendor((String)newValue);
				return;
			case BundlePackage.FEATURE_FILE__DESCRIPTION:
				setDescription((LinkedString)newValue);
				return;
			case BundlePackage.FEATURE_FILE__COPYRIGHT:
				setCopyright((LinkedString)newValue);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE:
				setLicense((LinkedString)newValue);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE:
				setLicense_feature((String)newValue);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE_VERSION:
				setLicense_feature_version((Version)newValue);
				return;
			case BundlePackage.FEATURE_FILE__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends FeaturePlugin>)newValue);
				return;
			case BundlePackage.FEATURE_FILE__REQUIREDFEATURES:
				getRequiredfeatures().clear();
				getRequiredfeatures().addAll((Collection<? extends RequiredFeature>)newValue);
				return;
			case BundlePackage.FEATURE_FILE__INCLUDEDFEATURES:
				getIncludedfeatures().clear();
				getIncludedfeatures().addAll((Collection<? extends IncludedFeature>)newValue);
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
			case BundlePackage.FEATURE_FILE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__FEATURENAME:
				setFeaturename(FEATURENAME_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__FEATUREID:
				setFeatureid(FEATUREID_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__DESCRIPTION:
				setDescription((LinkedString)null);
				return;
			case BundlePackage.FEATURE_FILE__COPYRIGHT:
				setCopyright((LinkedString)null);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE:
				setLicense((LinkedString)null);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE:
				setLicense_feature(LICENSE_FEATURE_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE_VERSION:
				setLicense_feature_version(LICENSE_FEATURE_VERSION_EDEFAULT);
				return;
			case BundlePackage.FEATURE_FILE__PLUGINS:
				getPlugins().clear();
				return;
			case BundlePackage.FEATURE_FILE__REQUIREDFEATURES:
				getRequiredfeatures().clear();
				return;
			case BundlePackage.FEATURE_FILE__INCLUDEDFEATURES:
				getIncludedfeatures().clear();
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
			case BundlePackage.FEATURE_FILE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BundlePackage.FEATURE_FILE__FEATURENAME:
				return FEATURENAME_EDEFAULT == null ? featurename != null : !FEATURENAME_EDEFAULT.equals(featurename);
			case BundlePackage.FEATURE_FILE__FEATUREID:
				return FEATUREID_EDEFAULT == null ? featureid != null : !FEATUREID_EDEFAULT.equals(featureid);
			case BundlePackage.FEATURE_FILE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case BundlePackage.FEATURE_FILE__DESCRIPTION:
				return description != null;
			case BundlePackage.FEATURE_FILE__COPYRIGHT:
				return copyright != null;
			case BundlePackage.FEATURE_FILE__LICENSE:
				return license != null;
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE:
				return LICENSE_FEATURE_EDEFAULT == null ? license_feature != null : !LICENSE_FEATURE_EDEFAULT.equals(license_feature);
			case BundlePackage.FEATURE_FILE__LICENSE_FEATURE_VERSION:
				return LICENSE_FEATURE_VERSION_EDEFAULT == null ? license_feature_version != null : !LICENSE_FEATURE_VERSION_EDEFAULT.equals(license_feature_version);
			case BundlePackage.FEATURE_FILE__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case BundlePackage.FEATURE_FILE__REQUIREDFEATURES:
				return requiredfeatures != null && !requiredfeatures.isEmpty();
			case BundlePackage.FEATURE_FILE__INCLUDEDFEATURES:
				return includedfeatures != null && !includedfeatures.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", featurename: ");
		result.append(featurename);
		result.append(", featureid: ");
		result.append(featureid);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", license_feature: ");
		result.append(license_feature);
		result.append(", license_feature_version: ");
		result.append(license_feature_version);
		result.append(')');
		return result.toString();
	}

} //FeatureFileImpl
