package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.xtext.common.types.JvmTypeReference
import javafx.beans.DefaultProperty
import java.util.Map
import java.util.List
import org.eclipse.xtext.common.types.JvmType
import javafx.scene.Node

class ReflectionHelper {
	def static getEnumType(JvmTypeReference type, String attributeName, boolean layoutConstraint) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		
		val methodName = "set"+attributeName.toFirstUpper
		val m = c.methods.findFirst[name == methodName && (parameterCount == 1 || (layoutConstraint && parameterCount == 2) )]
		val t = m?.parameterTypes.get(if (layoutConstraint) 1 else 0)
		
		return if( t?.enum ) t?.name else null
	}
	
	def static needsBuilder(JvmTypeReference type) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		return c.constructors.findFirst[parameterCount==0] == null
	}
	
	def static defaultAttribute(JvmTypeReference type) {
		var c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		var DefaultProperty p
		do {
			p = c.getAnnotation(typeof(DefaultProperty))
			c = c.superclass;
		} while( p == null && c != typeof(Object) )
		
		return p.value;
	}
	
	def static getFqnType(String simpleName, Map<String,String> imports, List<String> globalImports) {
		val rv = imports.get(simpleName)
		if( rv == null ) {
			for( String ns : globalImports ) {
				try {
					val c = Class::forName(ns+"."+simpleName, false, typeof(ReflectionHelper).getClassLoader())
					imports.put(c.simpleName, c.name)
					return c.name
				} catch(Exception e) {
					
				}
			}
		}
		return rv;
	}
	
	def static getValueType(JvmType type, String attribute) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		val m = c.getMethod("get"+attribute.toFirstUpper)
		
		if( m.returnType == boolean ) {
			return ValueType.BOOLEAN	
		} else if( m.returnType == double || m.returnType == int ) {
			return ValueType.NUMBER
		} else if( m.returnType == String ) {
			return ValueType.STRING
		} else if( List.isAssignableFrom(m.returnType) ) {
			return ValueType.LIST
		} else {
			return ValueType.CLASS
		}
	}
	
	def static getStaticValueType(JvmType type, String attribute) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		val m = c.getMethod("get"+attribute.toFirstUpper, Node)
		
		println(m.returnType)
		
		if( m.returnType == boolean ) {
			return ValueType.BOOLEAN	
		} else if( m.returnType == double || m.returnType == int || m.returnType == Integer || m.returnType == Double ) {
			return ValueType.NUMBER
		} else if( m.returnType == String ) {
			return ValueType.STRING
		} else if( List.isAssignableFrom(m.returnType) ) {
			return ValueType.LIST
		} else {
			return ValueType.CLASS
		}
	}
}