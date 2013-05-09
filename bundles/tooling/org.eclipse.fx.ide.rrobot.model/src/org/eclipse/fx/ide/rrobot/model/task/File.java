/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.fx.ide.rrobot.model.task.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface File extends Resource {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.fx.ide.rrobot.model.task.InputStream" exceptions="org.eclipse.fx.ide.rrobot.model.task.IOException" progressMonitorDataType="org.eclipse.fx.ide.rrobot.model.task.IProgressMonitor"
	 * @generated
	 */
	InputStream getContent(IProgressMonitor progressMonitor, Map<String, Object> data) throws IOException;
} // File
