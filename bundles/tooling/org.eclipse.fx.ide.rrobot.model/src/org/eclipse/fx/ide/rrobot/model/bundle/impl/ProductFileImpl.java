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
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFile;
import org.eclipse.fx.ide.rrobot.model.bundle.ProductStartConfig;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getProgramArgs <em>Program Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#isIncludeLaunchers <em>Include Launchers</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ProductFileImpl#getStartconfigurations <em>Startconfigurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProductFileImpl extends TemplatedFileImpl implements ProductFile {
	/**
	 * The default value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected String vmArgs = VM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected String programArgs = PROGRAM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

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
	 * The default value of the '{@link #isIncludeLaunchers() <em>Include Launchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeLaunchers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_LAUNCHERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeLaunchers() <em>Include Launchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeLaunchers()
	 * @generated
	 * @ordered
	 */
	protected boolean includeLaunchers = INCLUDE_LAUNCHERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartconfigurations() <em>Startconfigurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartconfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductStartConfig> startconfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ProductFileImpl() {
		super();
		setGeneratorType("bundle-product");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.PRODUCT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgs() {
		return vmArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgs(String newVmArgs) {
		String oldVmArgs = vmArgs;
		vmArgs = newVmArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__VM_ARGS, oldVmArgs, vmArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgs() {
		return programArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgs(String newProgramArgs) {
		String oldProgramArgs = programArgs;
		programArgs = newProgramArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__PROGRAM_ARGS, oldProgramArgs, programArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__ID, oldId, id));
	}

	@Override
	public String getName() {
		if( super.getName() == null ) {
			return getId() + ".product";
		}
		return super.getName();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__APPLICATION, oldApplication, application));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeLaunchers() {
		return includeLaunchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeLaunchers(boolean newIncludeLaunchers) {
		boolean oldIncludeLaunchers = includeLaunchers;
		includeLaunchers = newIncludeLaunchers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.PRODUCT_FILE__INCLUDE_LAUNCHERS, oldIncludeLaunchers, includeLaunchers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductStartConfig> getStartconfigurations() {
		if (startconfigurations == null) {
			startconfigurations = new EObjectContainmentEList<ProductStartConfig>(ProductStartConfig.class, this, BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS);
		}
		return startconfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS:
				return ((InternalEList<?>)getStartconfigurations()).basicRemove(otherEnd, msgs);
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				return getVmArgs();
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				return getProgramArgs();
			case BundlePackage.PRODUCT_FILE__PRODUCT_NAME:
				return getProductName();
			case BundlePackage.PRODUCT_FILE__ID:
				return getId();
			case BundlePackage.PRODUCT_FILE__APPLICATION:
				return getApplication();
			case BundlePackage.PRODUCT_FILE__VERSION:
				return getVersion();
			case BundlePackage.PRODUCT_FILE__INCLUDE_LAUNCHERS:
				return isIncludeLaunchers();
			case BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS:
				return getStartconfigurations();
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				setVmArgs((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				setProgramArgs((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__ID:
				setId((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__APPLICATION:
				setApplication((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__VERSION:
				setVersion((String)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__INCLUDE_LAUNCHERS:
				setIncludeLaunchers((Boolean)newValue);
				return;
			case BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS:
				getStartconfigurations().clear();
				getStartconfigurations().addAll((Collection<? extends ProductStartConfig>)newValue);
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				setVmArgs(VM_ARGS_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				setProgramArgs(PROGRAM_ARGS_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__ID:
				setId(ID_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__INCLUDE_LAUNCHERS:
				setIncludeLaunchers(INCLUDE_LAUNCHERS_EDEFAULT);
				return;
			case BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS:
				getStartconfigurations().clear();
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
			case BundlePackage.PRODUCT_FILE__VM_ARGS:
				return VM_ARGS_EDEFAULT == null ? vmArgs != null : !VM_ARGS_EDEFAULT.equals(vmArgs);
			case BundlePackage.PRODUCT_FILE__PROGRAM_ARGS:
				return PROGRAM_ARGS_EDEFAULT == null ? programArgs != null : !PROGRAM_ARGS_EDEFAULT.equals(programArgs);
			case BundlePackage.PRODUCT_FILE__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case BundlePackage.PRODUCT_FILE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BundlePackage.PRODUCT_FILE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case BundlePackage.PRODUCT_FILE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case BundlePackage.PRODUCT_FILE__INCLUDE_LAUNCHERS:
				return includeLaunchers != INCLUDE_LAUNCHERS_EDEFAULT;
			case BundlePackage.PRODUCT_FILE__STARTCONFIGURATIONS:
				return startconfigurations != null && !startconfigurations.isEmpty();
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
		result.append(" (vmArgs: ");
		result.append(vmArgs);
		result.append(", programArgs: ");
		result.append(programArgs);
		result.append(", productName: ");
		result.append(productName);
		result.append(", id: ");
		result.append(id);
		result.append(", application: ");
		result.append(application);
		result.append(", version: ");
		result.append(version);
		result.append(", includeLaunchers: ");
		result.append(includeLaunchers);
		result.append(')');
		return result.toString();
	}

} //ProductFileImpl
