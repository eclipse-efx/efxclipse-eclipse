/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#isEmbedjnlp <em>Embedjnlp</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#isExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#isIncludeDT <em>Include DT</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#isOfflineAllowed <em>Offline Allowed</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPlaceholderref <em>Placeholderref</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPlaceholderid <em>Placeholderid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getUpdatemode <em>Updatemode</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getCallbacks <em>Callbacks</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getSplashImage <em>Splash Image</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#getPackagingFormat <em>Packaging Format</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl#isVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployImpl extends EObjectImpl implements Deploy {
	/**
	 * The default value of the '{@link #isEmbedjnlp() <em>Embedjnlp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedjnlp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDJNLP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmbedjnlp() <em>Embedjnlp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedjnlp()
	 * @generated
	 * @ordered
	 */
	protected boolean embedjnlp = EMBEDJNLP_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtension()
	 * @generated
	 * @ordered
	 */
	protected boolean extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeDT() <em>Include DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeDT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_DT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeDT() <em>Include DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeDT()
	 * @generated
	 * @ordered
	 */
	protected boolean includeDT = INCLUDE_DT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOfflineAllowed() <em>Offline Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOfflineAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OFFLINE_ALLOWED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOfflineAllowed() <em>Offline Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOfflineAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean offlineAllowed = OFFLINE_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderref() <em>Placeholderref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderref()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDERREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderref() <em>Placeholderref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderref()
	 * @generated
	 * @ordered
	 */
	protected String placeholderref = PLACEHOLDERREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderid() <em>Placeholderid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderid()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderid() <em>Placeholderid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderid()
	 * @generated
	 * @ordered
	 */
	protected String placeholderid = PLACEHOLDERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatemode() <em>Updatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatemode()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATEMODE_EDEFAULT = "background";

	/**
	 * The cached value of the '{@link #getUpdatemode() <em>Updatemode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatemode()
	 * @generated
	 * @ordered
	 */
	protected String updatemode = UPDATEMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected Platform platform;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected Preferences preferences;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected Permissions permissions;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template template;

	/**
	 * The cached value of the '{@link #getCallbacks() <em>Callbacks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Callback> callbacks;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * The default value of the '{@link #getSplashImage() <em>Splash Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplashImage()
	 * @generated
	 * @ordered
	 */
	protected static final String SPLASH_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSplashImage() <em>Splash Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplashImage()
	 * @generated
	 * @ordered
	 */
	protected String splashImage = SPLASH_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackagingFormat() <em>Packaging Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGING_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagingFormat() <em>Packaging Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagingFormat()
	 * @generated
	 * @ordered
	 */
	protected String packagingFormat = PACKAGING_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected boolean verbose = VERBOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.DEPLOY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedjnlp() {
		return embedjnlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedjnlp(boolean newEmbedjnlp) {
		boolean oldEmbedjnlp = embedjnlp;
		embedjnlp = newEmbedjnlp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__EMBEDJNLP, oldEmbedjnlp, embedjnlp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(boolean newExtension) {
		boolean oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeDT() {
		return includeDT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDT(boolean newIncludeDT) {
		boolean oldIncludeDT = includeDT;
		includeDT = newIncludeDT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__INCLUDE_DT, oldIncludeDT, includeDT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOfflineAllowed() {
		return offlineAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfflineAllowed(boolean newOfflineAllowed) {
		boolean oldOfflineAllowed = offlineAllowed;
		offlineAllowed = newOfflineAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__OFFLINE_ALLOWED, oldOfflineAllowed, offlineAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderref() {
		return placeholderref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderref(String newPlaceholderref) {
		String oldPlaceholderref = placeholderref;
		placeholderref = newPlaceholderref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PLACEHOLDERREF, oldPlaceholderref, placeholderref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderid() {
		return placeholderid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderid(String newPlaceholderid) {
		String oldPlaceholderid = placeholderid;
		placeholderid = newPlaceholderid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PLACEHOLDERID, oldPlaceholderid, placeholderid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdatemode() {
		return updatemode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatemode(String newUpdatemode) {
		String oldUpdatemode = updatemode;
		updatemode = newUpdatemode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__UPDATEMODE, oldUpdatemode, updatemode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(Platform newPlatform, NotificationChain msgs) {
		Platform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PLATFORM, oldPlatform, newPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(Platform newPlatform) {
		if (newPlatform != platform) {
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preferences getPreferences() {
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferences(Preferences newPreferences, NotificationChain msgs) {
		Preferences oldPreferences = preferences;
		preferences = newPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PREFERENCES, oldPreferences, newPreferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferences(Preferences newPreferences) {
		if (newPreferences != preferences) {
			NotificationChain msgs = null;
			if (preferences != null)
				msgs = ((InternalEObject)preferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PREFERENCES, null, msgs);
			if (newPreferences != null)
				msgs = ((InternalEObject)newPreferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PREFERENCES, null, msgs);
			msgs = basicSetPreferences(newPreferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PREFERENCES, newPreferences, newPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__APPLICATION, null, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__APPLICATION, null, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permissions getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(Permissions newPermissions, NotificationChain msgs) {
		Permissions oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PERMISSIONS, oldPermissions, newPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissions(Permissions newPermissions) {
		if (newPermissions != permissions) {
			NotificationChain msgs = null;
			if (permissions != null)
				msgs = ((InternalEObject)permissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject)newPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PERMISSIONS, newPermissions, newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Template newTemplate, NotificationChain msgs) {
		Template oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Callback> getCallbacks() {
		if (callbacks == null) {
			callbacks = new EObjectContainmentEList<Callback>(Callback.class, this, AntTasksPackage.DEPLOY__CALLBACKS);
		}
		return callbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.DEPLOY__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSplashImage() {
		return splashImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplashImage(String newSplashImage) {
		String oldSplashImage = splashImage;
		splashImage = newSplashImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__SPLASH_IMAGE, oldSplashImage, splashImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagingFormat() {
		return packagingFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagingFormat(String newPackagingFormat) {
		String oldPackagingFormat = packagingFormat;
		packagingFormat = newPackagingFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__PACKAGING_FORMAT, oldPackagingFormat, packagingFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbose(boolean newVerbose) {
		boolean oldVerbose = verbose;
		verbose = newVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.DEPLOY__VERBOSE, oldVerbose, verbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AntTasksPackage.DEPLOY__PLATFORM:
				return basicSetPlatform(null, msgs);
			case AntTasksPackage.DEPLOY__PREFERENCES:
				return basicSetPreferences(null, msgs);
			case AntTasksPackage.DEPLOY__APPLICATION:
				return basicSetApplication(null, msgs);
			case AntTasksPackage.DEPLOY__PERMISSIONS:
				return basicSetPermissions(null, msgs);
			case AntTasksPackage.DEPLOY__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case AntTasksPackage.DEPLOY__CALLBACKS:
				return ((InternalEList<?>)getCallbacks()).basicRemove(otherEnd, msgs);
			case AntTasksPackage.DEPLOY__INFO:
				return basicSetInfo(null, msgs);
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
			case AntTasksPackage.DEPLOY__EMBEDJNLP:
				return isEmbedjnlp();
			case AntTasksPackage.DEPLOY__EXTENSION:
				return isExtension();
			case AntTasksPackage.DEPLOY__HEIGHT:
				return getHeight();
			case AntTasksPackage.DEPLOY__INCLUDE_DT:
				return isIncludeDT();
			case AntTasksPackage.DEPLOY__OFFLINE_ALLOWED:
				return isOfflineAllowed();
			case AntTasksPackage.DEPLOY__PLACEHOLDERREF:
				return getPlaceholderref();
			case AntTasksPackage.DEPLOY__PLACEHOLDERID:
				return getPlaceholderid();
			case AntTasksPackage.DEPLOY__UPDATEMODE:
				return getUpdatemode();
			case AntTasksPackage.DEPLOY__WIDTH:
				return getWidth();
			case AntTasksPackage.DEPLOY__PLATFORM:
				return getPlatform();
			case AntTasksPackage.DEPLOY__PREFERENCES:
				return getPreferences();
			case AntTasksPackage.DEPLOY__APPLICATION:
				return getApplication();
			case AntTasksPackage.DEPLOY__PERMISSIONS:
				return getPermissions();
			case AntTasksPackage.DEPLOY__TEMPLATE:
				return getTemplate();
			case AntTasksPackage.DEPLOY__CALLBACKS:
				return getCallbacks();
			case AntTasksPackage.DEPLOY__INFO:
				return getInfo();
			case AntTasksPackage.DEPLOY__SPLASH_IMAGE:
				return getSplashImage();
			case AntTasksPackage.DEPLOY__PACKAGING_FORMAT:
				return getPackagingFormat();
			case AntTasksPackage.DEPLOY__VERBOSE:
				return isVerbose();
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
			case AntTasksPackage.DEPLOY__EMBEDJNLP:
				setEmbedjnlp((Boolean)newValue);
				return;
			case AntTasksPackage.DEPLOY__EXTENSION:
				setExtension((Boolean)newValue);
				return;
			case AntTasksPackage.DEPLOY__HEIGHT:
				setHeight((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__INCLUDE_DT:
				setIncludeDT((Boolean)newValue);
				return;
			case AntTasksPackage.DEPLOY__OFFLINE_ALLOWED:
				setOfflineAllowed((Boolean)newValue);
				return;
			case AntTasksPackage.DEPLOY__PLACEHOLDERREF:
				setPlaceholderref((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__PLACEHOLDERID:
				setPlaceholderid((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__UPDATEMODE:
				setUpdatemode((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__WIDTH:
				setWidth((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__PLATFORM:
				setPlatform((Platform)newValue);
				return;
			case AntTasksPackage.DEPLOY__PREFERENCES:
				setPreferences((Preferences)newValue);
				return;
			case AntTasksPackage.DEPLOY__APPLICATION:
				setApplication((Application)newValue);
				return;
			case AntTasksPackage.DEPLOY__PERMISSIONS:
				setPermissions((Permissions)newValue);
				return;
			case AntTasksPackage.DEPLOY__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case AntTasksPackage.DEPLOY__CALLBACKS:
				getCallbacks().clear();
				getCallbacks().addAll((Collection<? extends Callback>)newValue);
				return;
			case AntTasksPackage.DEPLOY__INFO:
				setInfo((Info)newValue);
				return;
			case AntTasksPackage.DEPLOY__SPLASH_IMAGE:
				setSplashImage((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__PACKAGING_FORMAT:
				setPackagingFormat((String)newValue);
				return;
			case AntTasksPackage.DEPLOY__VERBOSE:
				setVerbose((Boolean)newValue);
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
			case AntTasksPackage.DEPLOY__EMBEDJNLP:
				setEmbedjnlp(EMBEDJNLP_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__INCLUDE_DT:
				setIncludeDT(INCLUDE_DT_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__OFFLINE_ALLOWED:
				setOfflineAllowed(OFFLINE_ALLOWED_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__PLACEHOLDERREF:
				setPlaceholderref(PLACEHOLDERREF_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__PLACEHOLDERID:
				setPlaceholderid(PLACEHOLDERID_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__UPDATEMODE:
				setUpdatemode(UPDATEMODE_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__PLATFORM:
				setPlatform((Platform)null);
				return;
			case AntTasksPackage.DEPLOY__PREFERENCES:
				setPreferences((Preferences)null);
				return;
			case AntTasksPackage.DEPLOY__APPLICATION:
				setApplication((Application)null);
				return;
			case AntTasksPackage.DEPLOY__PERMISSIONS:
				setPermissions((Permissions)null);
				return;
			case AntTasksPackage.DEPLOY__TEMPLATE:
				setTemplate((Template)null);
				return;
			case AntTasksPackage.DEPLOY__CALLBACKS:
				getCallbacks().clear();
				return;
			case AntTasksPackage.DEPLOY__INFO:
				setInfo((Info)null);
				return;
			case AntTasksPackage.DEPLOY__SPLASH_IMAGE:
				setSplashImage(SPLASH_IMAGE_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__PACKAGING_FORMAT:
				setPackagingFormat(PACKAGING_FORMAT_EDEFAULT);
				return;
			case AntTasksPackage.DEPLOY__VERBOSE:
				setVerbose(VERBOSE_EDEFAULT);
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
			case AntTasksPackage.DEPLOY__EMBEDJNLP:
				return embedjnlp != EMBEDJNLP_EDEFAULT;
			case AntTasksPackage.DEPLOY__EXTENSION:
				return extension != EXTENSION_EDEFAULT;
			case AntTasksPackage.DEPLOY__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case AntTasksPackage.DEPLOY__INCLUDE_DT:
				return includeDT != INCLUDE_DT_EDEFAULT;
			case AntTasksPackage.DEPLOY__OFFLINE_ALLOWED:
				return offlineAllowed != OFFLINE_ALLOWED_EDEFAULT;
			case AntTasksPackage.DEPLOY__PLACEHOLDERREF:
				return PLACEHOLDERREF_EDEFAULT == null ? placeholderref != null : !PLACEHOLDERREF_EDEFAULT.equals(placeholderref);
			case AntTasksPackage.DEPLOY__PLACEHOLDERID:
				return PLACEHOLDERID_EDEFAULT == null ? placeholderid != null : !PLACEHOLDERID_EDEFAULT.equals(placeholderid);
			case AntTasksPackage.DEPLOY__UPDATEMODE:
				return UPDATEMODE_EDEFAULT == null ? updatemode != null : !UPDATEMODE_EDEFAULT.equals(updatemode);
			case AntTasksPackage.DEPLOY__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case AntTasksPackage.DEPLOY__PLATFORM:
				return platform != null;
			case AntTasksPackage.DEPLOY__PREFERENCES:
				return preferences != null;
			case AntTasksPackage.DEPLOY__APPLICATION:
				return application != null;
			case AntTasksPackage.DEPLOY__PERMISSIONS:
				return permissions != null;
			case AntTasksPackage.DEPLOY__TEMPLATE:
				return template != null;
			case AntTasksPackage.DEPLOY__CALLBACKS:
				return callbacks != null && !callbacks.isEmpty();
			case AntTasksPackage.DEPLOY__INFO:
				return info != null;
			case AntTasksPackage.DEPLOY__SPLASH_IMAGE:
				return SPLASH_IMAGE_EDEFAULT == null ? splashImage != null : !SPLASH_IMAGE_EDEFAULT.equals(splashImage);
			case AntTasksPackage.DEPLOY__PACKAGING_FORMAT:
				return PACKAGING_FORMAT_EDEFAULT == null ? packagingFormat != null : !PACKAGING_FORMAT_EDEFAULT.equals(packagingFormat);
			case AntTasksPackage.DEPLOY__VERBOSE:
				return verbose != VERBOSE_EDEFAULT;
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
		result.append(" (embedjnlp: ");
		result.append(embedjnlp);
		result.append(", extension: ");
		result.append(extension);
		result.append(", height: ");
		result.append(height);
		result.append(", includeDT: ");
		result.append(includeDT);
		result.append(", offlineAllowed: ");
		result.append(offlineAllowed);
		result.append(", placeholderref: ");
		result.append(placeholderref);
		result.append(", placeholderid: ");
		result.append(placeholderid);
		result.append(", updatemode: ");
		result.append(updatemode);
		result.append(", width: ");
		result.append(width);
		result.append(", splashImage: ");
		result.append(splashImage);
		result.append(", packagingFormat: ");
		result.append(packagingFormat);
		result.append(", verbose: ");
		result.append(verbose);
		result.append(')');
		return result.toString();
	}

} //DeployImpl
