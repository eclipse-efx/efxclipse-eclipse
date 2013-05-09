/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit;
import org.eclipse.fx.ide.rrobot.model.task.JDTProject;
import org.eclipse.fx.ide.rrobot.model.task.SourceFragment;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JDT Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl#getSourceFragments <em>Source Fragments</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JDTProjectImpl extends ProjectImpl implements JDTProject {
	/**
	 * The cached value of the '{@link #getSourceFragments() <em>Source Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFragment> sourceFragments;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JDTProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.JDT_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFragment> getSourceFragments() {
		if (sourceFragments == null) {
			sourceFragments = new EObjectContainmentEList<SourceFragment>(SourceFragment.class, this, TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS);
		}
		return sourceFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, TaskPackage.JDT_PROJECT__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS:
				return ((InternalEList<?>)getSourceFragments()).basicRemove(otherEnd, msgs);
			case TaskPackage.JDT_PROJECT__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS:
				return getSourceFragments();
			case TaskPackage.JDT_PROJECT__COMPILATION_UNITS:
				return getCompilationUnits();
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
			case TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS:
				getSourceFragments().clear();
				getSourceFragments().addAll((Collection<? extends SourceFragment>)newValue);
				return;
			case TaskPackage.JDT_PROJECT__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
			case TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS:
				getSourceFragments().clear();
				return;
			case TaskPackage.JDT_PROJECT__COMPILATION_UNITS:
				getCompilationUnits().clear();
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
			case TaskPackage.JDT_PROJECT__SOURCE_FRAGMENTS:
				return sourceFragments != null && !sourceFragments.isEmpty();
			case TaskPackage.JDT_PROJECT__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JDTProjectImpl
