/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getProgramArgs <em>Program Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#isIncludeLaunchers <em>Include Launchers</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getStartconfigurations <em>Startconfigurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile()
 * @model abstract="true"
 * @generated
 */
public interface ProductFile extends TemplatedFile {
	/**
	 * Returns the value of the '<em><b>Vm Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args</em>' attribute.
	 * @see #setVmArgs(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_VmArgs()
	 * @model
	 * @generated
	 */
	String getVmArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getVmArgs <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args</em>' attribute.
	 * @see #getVmArgs()
	 * @generated
	 */
	void setVmArgs(String value);

	/**
	 * Returns the value of the '<em><b>Program Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args</em>' attribute.
	 * @see #setProgramArgs(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_ProgramArgs()
	 * @model
	 * @generated
	 */
	String getProgramArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getProgramArgs <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args</em>' attribute.
	 * @see #getProgramArgs()
	 * @generated
	 */
	void setProgramArgs(String value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_Application()
	 * @model
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

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
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Include Launchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Launchers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Launchers</em>' attribute.
	 * @see #setIncludeLaunchers(boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_IncludeLaunchers()
	 * @model
	 * @generated
	 */
	boolean isIncludeLaunchers();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFile#isIncludeLaunchers <em>Include Launchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Launchers</em>' attribute.
	 * @see #isIncludeLaunchers()
	 * @generated
	 */
	void setIncludeLaunchers(boolean value);

	/**
	 * Returns the value of the '<em><b>Startconfigurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.ProductStartConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startconfigurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startconfigurations</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFile_Startconfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductStartConfig> getStartconfigurations();

} // ProductFile
