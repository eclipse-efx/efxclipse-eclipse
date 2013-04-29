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
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ant Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getJar <em>Jar</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getSignjar <em>Signjar</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getBuildDirectory <em>Build Directory</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getManifestEntries <em>Manifest Entries</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#isCssToBin <em>Css To Bin</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl#getFonts <em>Fonts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AntTaskImpl extends EObjectImpl implements AntTask {
	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected Deploy deploy;

	/**
	 * The cached value of the '{@link #getJar() <em>Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJar()
	 * @generated
	 * @ordered
	 */
	protected Jar jar;

	/**
	 * The cached value of the '{@link #getSignjar() <em>Signjar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignjar()
	 * @generated
	 * @ordered
	 */
	protected SignJar signjar;

	/**
	 * The default value of the '{@link #getBuildDirectory() <em>Build Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildDirectory() <em>Build Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDirectory()
	 * @generated
	 * @ordered
	 */
	protected String buildDirectory = BUILD_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManifestEntries() <em>Manifest Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Param> manifestEntries;

	/**
	 * The default value of the '{@link #isCssToBin() <em>Css To Bin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCssToBin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CSS_TO_BIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCssToBin() <em>Css To Bin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCssToBin()
	 * @generated
	 * @ordered
	 */
	protected boolean cssToBin = CSS_TO_BIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> files;

	/**
	 * The cached value of the '{@link #getFonts() <em>Fonts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonts()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> fonts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.ANT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy getDeploy() {
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploy(Deploy newDeploy, NotificationChain msgs) {
		Deploy oldDeploy = deploy;
		deploy = newDeploy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__DEPLOY, oldDeploy, newDeploy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploy(Deploy newDeploy) {
		if (newDeploy != deploy) {
			NotificationChain msgs = null;
			if (deploy != null)
				msgs = ((InternalEObject)deploy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__DEPLOY, null, msgs);
			if (newDeploy != null)
				msgs = ((InternalEObject)newDeploy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__DEPLOY, null, msgs);
			msgs = basicSetDeploy(newDeploy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__DEPLOY, newDeploy, newDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jar getJar() {
		return jar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJar(Jar newJar, NotificationChain msgs) {
		Jar oldJar = jar;
		jar = newJar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__JAR, oldJar, newJar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJar(Jar newJar) {
		if (newJar != jar) {
			NotificationChain msgs = null;
			if (jar != null)
				msgs = ((InternalEObject)jar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__JAR, null, msgs);
			if (newJar != null)
				msgs = ((InternalEObject)newJar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__JAR, null, msgs);
			msgs = basicSetJar(newJar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__JAR, newJar, newJar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignJar getSignjar() {
		return signjar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignjar(SignJar newSignjar, NotificationChain msgs) {
		SignJar oldSignjar = signjar;
		signjar = newSignjar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__SIGNJAR, oldSignjar, newSignjar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignjar(SignJar newSignjar) {
		if (newSignjar != signjar) {
			NotificationChain msgs = null;
			if (signjar != null)
				msgs = ((InternalEObject)signjar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__SIGNJAR, null, msgs);
			if (newSignjar != null)
				msgs = ((InternalEObject)newSignjar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AntTasksPackage.ANT_TASK__SIGNJAR, null, msgs);
			msgs = basicSetSignjar(newSignjar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__SIGNJAR, newSignjar, newSignjar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildDirectory() {
		return buildDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildDirectory(String newBuildDirectory) {
		String oldBuildDirectory = buildDirectory;
		buildDirectory = newBuildDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__BUILD_DIRECTORY, oldBuildDirectory, buildDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getManifestEntries() {
		if (manifestEntries == null) {
			manifestEntries = new EObjectContainmentEList<Param>(Param.class, this, AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES);
		}
		return manifestEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCssToBin() {
		return cssToBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssToBin(boolean newCssToBin) {
		boolean oldCssToBin = cssToBin;
		cssToBin = newCssToBin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.ANT_TASK__CSS_TO_BIN, oldCssToBin, cssToBin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValuePair> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, AntTasksPackage.ANT_TASK__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValuePair> getFonts() {
		if (fonts == null) {
			fonts = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, AntTasksPackage.ANT_TASK__FONTS);
		}
		return fonts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AntTasksPackage.ANT_TASK__DEPLOY:
				return basicSetDeploy(null, msgs);
			case AntTasksPackage.ANT_TASK__JAR:
				return basicSetJar(null, msgs);
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				return basicSetSignjar(null, msgs);
			case AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES:
				return ((InternalEList<?>)getManifestEntries()).basicRemove(otherEnd, msgs);
			case AntTasksPackage.ANT_TASK__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case AntTasksPackage.ANT_TASK__FONTS:
				return ((InternalEList<?>)getFonts()).basicRemove(otherEnd, msgs);
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
			case AntTasksPackage.ANT_TASK__DEPLOY:
				return getDeploy();
			case AntTasksPackage.ANT_TASK__JAR:
				return getJar();
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				return getSignjar();
			case AntTasksPackage.ANT_TASK__BUILD_DIRECTORY:
				return getBuildDirectory();
			case AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES:
				return getManifestEntries();
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				return isCssToBin();
			case AntTasksPackage.ANT_TASK__FILES:
				return getFiles();
			case AntTasksPackage.ANT_TASK__FONTS:
				return getFonts();
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
			case AntTasksPackage.ANT_TASK__DEPLOY:
				setDeploy((Deploy)newValue);
				return;
			case AntTasksPackage.ANT_TASK__JAR:
				setJar((Jar)newValue);
				return;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				setSignjar((SignJar)newValue);
				return;
			case AntTasksPackage.ANT_TASK__BUILD_DIRECTORY:
				setBuildDirectory((String)newValue);
				return;
			case AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES:
				getManifestEntries().clear();
				getManifestEntries().addAll((Collection<? extends Param>)newValue);
				return;
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				setCssToBin((Boolean)newValue);
				return;
			case AntTasksPackage.ANT_TASK__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case AntTasksPackage.ANT_TASK__FONTS:
				getFonts().clear();
				getFonts().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case AntTasksPackage.ANT_TASK__DEPLOY:
				setDeploy((Deploy)null);
				return;
			case AntTasksPackage.ANT_TASK__JAR:
				setJar((Jar)null);
				return;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				setSignjar((SignJar)null);
				return;
			case AntTasksPackage.ANT_TASK__BUILD_DIRECTORY:
				setBuildDirectory(BUILD_DIRECTORY_EDEFAULT);
				return;
			case AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES:
				getManifestEntries().clear();
				return;
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				setCssToBin(CSS_TO_BIN_EDEFAULT);
				return;
			case AntTasksPackage.ANT_TASK__FILES:
				getFiles().clear();
				return;
			case AntTasksPackage.ANT_TASK__FONTS:
				getFonts().clear();
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
			case AntTasksPackage.ANT_TASK__DEPLOY:
				return deploy != null;
			case AntTasksPackage.ANT_TASK__JAR:
				return jar != null;
			case AntTasksPackage.ANT_TASK__SIGNJAR:
				return signjar != null;
			case AntTasksPackage.ANT_TASK__BUILD_DIRECTORY:
				return BUILD_DIRECTORY_EDEFAULT == null ? buildDirectory != null : !BUILD_DIRECTORY_EDEFAULT.equals(buildDirectory);
			case AntTasksPackage.ANT_TASK__MANIFEST_ENTRIES:
				return manifestEntries != null && !manifestEntries.isEmpty();
			case AntTasksPackage.ANT_TASK__CSS_TO_BIN:
				return cssToBin != CSS_TO_BIN_EDEFAULT;
			case AntTasksPackage.ANT_TASK__FILES:
				return files != null && !files.isEmpty();
			case AntTasksPackage.ANT_TASK__FONTS:
				return fonts != null && !fonts.isEmpty();
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
		result.append(" (buildDirectory: ");
		result.append(buildDirectory);
		result.append(", cssToBin: ");
		result.append(cssToBin);
		result.append(')');
		return result.toString();
	}

} //AntTaskImpl
