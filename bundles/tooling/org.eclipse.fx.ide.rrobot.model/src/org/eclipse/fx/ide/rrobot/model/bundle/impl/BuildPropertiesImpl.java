/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.task.Resource;
import org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.BuildPropertiesImpl#getBinIncludes <em>Bin Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildPropertiesImpl extends TemplatedFileImpl implements BuildProperties {
	/**
	 * The cached value of the '{@link #getBinIncludes() <em>Bin Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> binIncludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected BuildPropertiesImpl() {
		super();
		setGeneratorType("bundle-build-properties");
		setName("build.properties");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.BUILD_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBinIncludes() {
		if (binIncludes == null) {
			binIncludes = new EObjectResolvingEList<Resource>(Resource.class, this, BundlePackage.BUILD_PROPERTIES__BIN_INCLUDES);
		}
		return binIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.BUILD_PROPERTIES__BIN_INCLUDES:
				return getBinIncludes();
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
			case BundlePackage.BUILD_PROPERTIES__BIN_INCLUDES:
				getBinIncludes().clear();
				getBinIncludes().addAll((Collection<? extends Resource>)newValue);
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
			case BundlePackage.BUILD_PROPERTIES__BIN_INCLUDES:
				getBinIncludes().clear();
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
			case BundlePackage.BUILD_PROPERTIES__BIN_INCLUDES:
				return binIncludes != null && !binIncludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildPropertiesImpl
