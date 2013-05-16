/**
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 */
package org.eclipse.fx.ide.fxgraph.ui.wizards.template;

import com.google.common.base.Objects;
import org.eclipse.fx.ide.fxgraph.ui.wizards.template.FXGraphElement;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FXGraphTemplate implements IGenerator<FXGraphElement> {
  public CharSequence generateContent(final FXGraphElement element) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      IPackageFragment _packageFragment = element.getPackageFragment();
      boolean _notEquals = (!Objects.equal(_packageFragment, null));
      if (!_notEquals) {
        _and = false;
      } else {
        IPackageFragment _packageFragment_1 = element.getPackageFragment();
        String _elementName = _packageFragment_1.getElementName();
        boolean _isEmpty = _elementName.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("package ");
        IPackageFragment _packageFragment_2 = element.getPackageFragment();
        String _elementName_1 = _packageFragment_2.getElementName();
        _builder.append(_elementName_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    IType _rootElement = element.getRootElement();
    String _fullyQualifiedName = _rootElement.getFullyQualifiedName();
    _builder.append(_fullyQualifiedName, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isDynamic = element.isDynamic();
      if (_isDynamic) {
        _builder.append("dynamic ");
      }
    }
    _builder.append("component ");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    IType _rootElement_1 = element.getRootElement();
    String _elementName_2 = _rootElement_1.getElementName();
    _builder.append(_elementName_2, "	");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("//TODO Add Nodes");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
