package org.eclipse.fx.ide.gmodel.generator

import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty
import java.util.List
import java.util.Set
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement
import java.util.HashSet

class Util {

	def static toJavaType(String v) {
		if( v == "Int" ) {
			return "int"
		} else if( v == "Double" ) {
			return "double";
		} else if( v == "Boolean" ) {
			return "boolean";
		}
		return v;
	}

	def static getValue(GDomainProperty p) {
		if(  p.defaultValue != null ) {
			if( p.defaultValue.stringVal != null ) {
				return '"' + p.defaultValue.stringVal + '"'
			} else {
				return p.defaultValue.intVal + ""
			}
		}
	}

	def static Set<GDomainElement> collectHierarchicalList(List<GDomainElement> list) {
		val set = new HashSet<GDomainElement>();
		set.addAll(list)
		set.addAll(list.map[ e | new HashSet<GDomainElement>(e.superTypeList.collectHierarchicalList) ].flatten.toSet)
		return set;
	}
}