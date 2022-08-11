/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.rrobot.dsl.conversion;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.osgi.framework.Version;

public class RRobotConverters extends Ecore2XtextTerminalConverters {
	@ValueConverter(rule = "Version")
	public IValueConverter<Version> Version() {
		return new AbstractNullSafeConverter<Version>() {

			@Override
			protected String internalToString(Version value) {
				return value.toString();
			}

			@Override
			protected Version internalToValue(String string, INode node) throws ValueConverterException {
				return new Version(string);
			}
		};
	}

	@ValueConverter(rule = "EByteArray")
	public IValueConverter<byte[]> EByteArray() {
		return new AbstractNullSafeConverter<byte[]>() {

			@Override
			protected String internalToString(byte[] value) {
				return new String(value);
			}

			@Override
			protected byte[] internalToValue(String string, INode node) throws ValueConverterException {
				return string.substring(1, string.length()-1).getBytes();
			}
		};
	}
}
