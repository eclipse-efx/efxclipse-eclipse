/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.validation;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.Import;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXCtrlField;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.model.Util;
import org.eclipse.fx.ide.ui.util.RelativeFileLocator;

import com.google.inject.Inject;
 
@SuppressWarnings("restriction")
public class FXGraphJavaValidator extends AbstractFXGraphJavaValidator {
	public static final String UNKNOWN_CONTROLLER_FIELD = "FXGraphJavaValidator.UNKNOWN_CONTROLLER_FIELD";
	public static final String CONTROLLER_FIELD_NOT_ASSIGNABLE = "FXGraphJavaValidator.CONTROLLER_FIELD_NOT_ASSIGNABLE";
	public static final String UNKNOWN_CONTROLLER_METHOD = "FXGraphJavaValidator.UNKNOWN_CONTROLLER_METHOD";
	
	@Inject
	private IJvmTypeProvider.Factory jdtTypeProvider;

	@Inject
	private IScopeProvider scopeProvider;
	
	@Inject
	private IJavaProjectProvider projectProvider;
	
//	@Inject
//	private IXtextEObjectSearch
	
//	@Inject
//	private IJavaProjectProvider projectProvider;

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Check
	public void validateModel(Model model) {
		if( model.getPackage() == null ) {
			warning("You should add a package declaration to use a namespace", FXGraphPackage.Literals.MODEL__PACKAGE);
		} else {
			URI uri = model.eResource().getURI();
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
			
			IPath path = null;
			for( int i = 2; i < uri.segmentCount() - 1; i++ ) {
				if( path == null ) {
					path = new Path(uri.segment(i));
				} else {
					path = path.append(uri.segment(i));
				}
			}
			
			IJavaElement e = JavaCore.create(p.getFolder(path));
			if( e instanceof IPackageFragment ) {
				if( ! model.getPackage().getName().equals(e.getElementName())) {
					error("The package has to be '"+e.getElementName()+"'", FXGraphPackage.Literals.MODEL__PACKAGE);
				}
			}
		}
	}
	
	@Check
	public void validateComponent(ComponentDefinition componentDef) {
		int i = 0;
		for( String cssFile : componentDef.getPreviewCssFiles() ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					cssFile);
			if( absFile == null || ! absFile.exists() ) {
				warning("The specified file '"+cssFile+"' could not be found", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_CSS_FILES,i);
			}
			
			i++;
		}
		
		if( componentDef.getPreviewResourceBundle() != null ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					componentDef.getPreviewResourceBundle());
			
			if( absFile == null || ! absFile.exists() ) {
				error("The specified resource file '"+componentDef.getPreviewResourceBundle()+"' could not be found", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE);
			}
		}
	}
	
	@Check
	public void validate(Element element) {
		JvmTypeReference controller = ((Model)element.eResource().getContents().get(0)).getComponentDef().getController();
		if( controller != null && element.getName() != null ) {
			IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
			
			try {
				IType type = javaProject.findType(controller.getQualifiedName());
				IFXCtrlClass fxClazz = FXPlugin.getClassmodel().findCtrlClass(javaProject, type);
				if( fxClazz != null ) {
					IFXCtrlField f = fxClazz.getAllFields().get(element.getName());
					if( f == null ) {
						// Defines should not lead to a warning because it is referenced later on
						if( !(element.eContainer() instanceof Define) ) {
							warning("The controller '"+type.getElementName()+"' has no field '"+element.getName()+"'", FXGraphPackage.Literals.ELEMENT__NAME, UNKNOWN_CONTROLLER_FIELD, element.getName(), controller.getQualifiedName(), element.getType().getQualifiedName());							
						}
					} else {
						IType fromType = javaProject.findType(element.getType().getQualifiedName());
						IType toType = f.getType();
						if( ! Util.assignable(fromType, toType) ) {
							error("The type '"+fromType.getElementName()+"' is not assignable to the controller fields type '"+toType.getElementName()+"'", FXGraphPackage.Literals.ELEMENT__NAME, CONTROLLER_FIELD_NOT_ASSIGNABLE, element.getName(), controller.getQualifiedName(), element.getType().getQualifiedName());
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Check
	public void validate(ControllerHandledValueProperty element) {
		JvmTypeReference controller = ((Model)element.eResource().getContents().get(0)).getComponentDef().getController();
		if( controller != null && element.getMethodname() != null ) {
			IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
			try {
				IType ctrlType = javaProject.findType(controller.getQualifiedName());
				Property propertyModel = (Property) element.eContainer();
				Element elementModel = (Element)propertyModel.eContainer();
				IType elType = javaProject.findType(elementModel.getType().getQualifiedName());
				
				IFXCtrlClass fxCtrlClazz = FXPlugin.getClassmodel().findCtrlClass(javaProject, ctrlType);
				IFXClass fxElClass = FXPlugin.getClassmodel().findClass(javaProject, elType);
				
				IFXProperty fxProp = fxElClass.getAllProperties().get(propertyModel.getName());
				
				if( !(fxProp instanceof IFXEventHandlerProperty) ) {
					error("Property is not an event property", propertyModel, FXGraphPackage.Literals.PROPERTY__NAME, -1);
					return;
				}
				
				if( fxCtrlClazz != null ) {
					IFXCtrlEventMethod m = fxCtrlClazz.getAllEventMethods().get(element.getMethodname());
					if( m == null ) {
						warning("The controller '"+ ctrlType.getElementName() +"' has no event method '"+element.getMethodname()+"'", FXGraphPackage.Literals.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME,UNKNOWN_CONTROLLER_METHOD, element.getMethodname(), controller.getQualifiedName(), ((IFXEventHandlerProperty)fxProp).getEventType().getFullyQualifiedName());
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Check
	public void validateImport(Import importDef) {
		if( importDef.getImportedNamespace() != null ) {
			if( ! importDef.getImportedNamespace().endsWith("*") ) {
//				IJvmTypeProvider p = jdtTypeProvider.createTypeProvider(importDef.eResource().getResourceSet());
//				if( p.findTypeByName(importDef.getImportedNamespace()) == null ) {
////					IScope s = scopeProvider.getScope(importDef.eContainer(), importDef.eContainmentFeature());
////					QualifiedName name = QualifiedName.create(importDef.getImportedNamespace().split("\\."));
//				}
			}	
		}
	}
}
