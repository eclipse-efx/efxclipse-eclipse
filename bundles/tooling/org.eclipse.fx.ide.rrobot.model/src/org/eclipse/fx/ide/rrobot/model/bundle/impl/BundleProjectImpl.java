/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;



import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject;
import org.eclipse.fx.ide.rrobot.model.bundle.ManifestFile;
import org.eclipse.fx.ide.rrobot.model.bundle.PluginXMLFile;
import org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl;
import org.eclipse.fx.ide.rrobot.model.task.impl.ProjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.BundleProjectImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.BundleProjectImpl#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.BundleProjectImpl#getPluginxml <em>Pluginxml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleProjectImpl extends JDTProjectImpl implements BundleProject {
	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected ManifestFile manifest;

	/**
	 * The cached value of the '{@link #getBuildProperties() <em>Build Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildProperties()
	 * @generated
	 * @ordered
	 */
	protected BuildProperties buildProperties;

	/**
	 * The cached value of the '{@link #getPluginxml() <em>Pluginxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginxml()
	 * @generated
	 * @ordered
	 */
	protected PluginXMLFile pluginxml;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.BUNDLE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestFile getManifest() {
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest(ManifestFile newManifest, NotificationChain msgs) {
		ManifestFile oldManifest = manifest;
		manifest = newManifest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__MANIFEST, oldManifest, newManifest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest(ManifestFile newManifest) {
		if (newManifest != manifest) {
			NotificationChain msgs = null;
			if (manifest != null)
				msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__MANIFEST, null, msgs);
			if (newManifest != null)
				msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__MANIFEST, null, msgs);
			msgs = basicSetManifest(newManifest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__MANIFEST, newManifest, newManifest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildProperties getBuildProperties() {
		return buildProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildProperties(BuildProperties newBuildProperties, NotificationChain msgs) {
		BuildProperties oldBuildProperties = buildProperties;
		buildProperties = newBuildProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, oldBuildProperties, newBuildProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildProperties(BuildProperties newBuildProperties) {
		if (newBuildProperties != buildProperties) {
			NotificationChain msgs = null;
			if (buildProperties != null)
				msgs = ((InternalEObject)buildProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, null, msgs);
			if (newBuildProperties != null)
				msgs = ((InternalEObject)newBuildProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, null, msgs);
			msgs = basicSetBuildProperties(newBuildProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, newBuildProperties, newBuildProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginXMLFile getPluginxml() {
		return pluginxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginxml(PluginXMLFile newPluginxml, NotificationChain msgs) {
		PluginXMLFile oldPluginxml = pluginxml;
		pluginxml = newPluginxml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__PLUGINXML, oldPluginxml, newPluginxml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginxml(PluginXMLFile newPluginxml) {
		if (newPluginxml != pluginxml) {
			NotificationChain msgs = null;
			if (pluginxml != null)
				msgs = ((InternalEObject)pluginxml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__PLUGINXML, null, msgs);
			if (newPluginxml != null)
				msgs = ((InternalEObject)newPluginxml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__PLUGINXML, null, msgs);
			msgs = basicSetPluginxml(newPluginxml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__PLUGINXML, newPluginxml, newPluginxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return basicSetManifest(null, msgs);
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return basicSetBuildProperties(null, msgs);
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return basicSetPluginxml(null, msgs);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return getManifest();
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return getBuildProperties();
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return getPluginxml();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				setManifest((ManifestFile)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				setBuildProperties((BuildProperties)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				setPluginxml((PluginXMLFile)newValue);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				setManifest((ManifestFile)null);
				return;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				setBuildProperties((BuildProperties)null);
				return;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				setPluginxml((PluginXMLFile)null);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return manifest != null;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return buildProperties != null;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return pluginxml != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleProjectImpl
