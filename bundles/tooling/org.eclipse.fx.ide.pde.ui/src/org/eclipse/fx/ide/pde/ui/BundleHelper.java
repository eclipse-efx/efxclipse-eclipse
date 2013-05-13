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
package org.eclipse.fx.ide.pde.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IPackageImportDescription;
import org.eclipse.pde.core.project.IRequiredBundleDescription;

public class BundleHelper {
	public static void addRequiredBundleDescriptions(IBundleProjectDescription bundleDesc, IRequiredBundleDescription... requiredBundles) {
		IRequiredBundleDescription[] originalDescs = bundleDesc.getRequiredBundles();
		if( originalDescs == null ) {
			originalDescs = new IRequiredBundleDescription[0];
		}
		
		List<IRequiredBundleDescription> toAdd = new ArrayList<IRequiredBundleDescription>();
		toAdd.addAll(Arrays.asList(requiredBundles));
		
		for (IRequiredBundleDescription a : requiredBundles) {
			for (IRequiredBundleDescription d : originalDescs) {

				if (a.getName().equals(d.getName())) {
					toAdd.remove(a);
				}
			}
		}
		
		requiredBundles = toAdd.toArray(new IRequiredBundleDescription[0]);

//FIXME This is a bug in PDE		
//		IRequiredBundleDescription[] newDescriptions = new IRequiredBundleDescription[originalDescs.length+requiredBundles.length];
//		System.arraycopy(originalDescs, 0, newDescriptions, 0, originalDescs.length);
//		System.arraycopy(requiredBundles, 0, newDescriptions, originalDescs.length, requiredBundles.length);
//		
		bundleDesc.setRequiredBundles(requiredBundles);
	}
	
	public static void addPackageImportDescriptions(IBundleProjectDescription bundleDesc, IPackageImportDescription... importedPackages) {
		IPackageImportDescription[] originalDescs = bundleDesc.getPackageImports();
		if( originalDescs == null ) {
			originalDescs = new IPackageImportDescription[0];
		}
		
		List<IPackageImportDescription> toAdd = new ArrayList<IPackageImportDescription>();
		toAdd.addAll(Arrays.asList(importedPackages));
		
		for (IPackageImportDescription a : importedPackages) {
			for (IPackageImportDescription d : originalDescs) {
				if (a.getName().equals(d.getName())) {
					toAdd.remove(a);
				}
			}
		}
		
		IPackageImportDescription[] newDescriptions = new IPackageImportDescription[originalDescs.length+importedPackages.length];
		System.arraycopy(originalDescs, 0, newDescriptions, 0, originalDescs.length);
		System.arraycopy(importedPackages, 0, newDescriptions, originalDescs.length, importedPackages.length);
		bundleDesc.setPackageImports(newDescriptions);
	}
	
	
//	public static void addRequiredBundleDescriptions(IBundleProjectDescription bundleDesc, IRequiredBundleDescription... requiredBundles) {
//		IRequiredBundleDescription[] originalDescs = bundleDesc.getRequiredBundles();
//		List<IRequiredBundleDescription> toAdd = new ArrayList<IRequiredBundleDescription>();
//		toAdd.addAll(Arrays.asList(requiredBundles));
//
//		if (originalDescs != null) {
//			for (IRequiredBundleDescription a : requiredBundles) {
//				for (IRequiredBundleDescription d : originalDescs) {
//
//					if (a.getName().equals(d.getName())) {
//						toAdd.remove(a);
//					}
//				}
//			}
//		}
//		bundleDesc.setRequiredBundles(toAdd.toArray(new IRequiredBundleDescription[0]));
//	}
//
//	public static void addPackageImportDescriptions(IBundleProjectDescription bundleDesc, IPackageImportDescription... importedPackages) {
//		IPackageImportDescription[] originalDescs = bundleDesc.getPackageImports();
//		List<IPackageImportDescription> toAdd = new ArrayList<IPackageImportDescription>();
//		toAdd.addAll(Arrays.asList(importedPackages));
//
//		if (originalDescs != null) {
//			for (IPackageImportDescription a : importedPackages) {
//				for (IPackageImportDescription d : originalDescs) {
//					if (a.getName().equals(d.getName())) {
//						toAdd.remove(a);
//					}
//				}
//			}
//		}
//		bundleDesc.setPackageImports(toAdd.toArray(new IPackageImportDescription[0]));
//	}
}
