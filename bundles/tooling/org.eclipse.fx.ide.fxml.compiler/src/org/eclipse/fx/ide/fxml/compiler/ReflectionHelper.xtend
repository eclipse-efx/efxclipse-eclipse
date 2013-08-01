package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.xtext.common.types.JvmTypeReference
import javafx.beans.DefaultProperty
import java.util.Map
import java.util.List
import org.eclipse.xtext.common.types.JvmType
import javafx.scene.Node
import java.lang.reflect.Modifier
import static extension org.eclipse.fx.ide.fxml.compiler.BitOperations.*
import java.lang.reflect.Field

class ReflectionHelper {
	def static getEnumType(JvmTypeReference type, String attributeName, boolean layoutConstraint) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		
		val methodName = "set"+attributeName.toFirstUpper
		val m = c.methods.findFirst[name == methodName && (parameterCount == 1 || (layoutConstraint && parameterCount == 2) )]
		val t = m?.parameterTypes.get(if (layoutConstraint) 1 else 0)
		
		return if( t != null && t?.enum ) t?.name else null
	}
	
	def static hasMethod(JvmTypeReference type, String name, Class<?>... parameters) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		try {
			c.getDeclaredMethod(name,parameters)
			return true;	
		} catch(NoSuchMethodException e) {
			return false;
		}
		
	}
	
	def static findField(Class<?> c, String name) {
		var NoSuchFieldException initialException = null;
		var l = c;
		while( l != null && l != Object ) {
			try {
				return l.getDeclaredField(name)	
			} catch(NoSuchFieldException e) {
				if( initialException == null ) {
					initialException = e
				}
			}
			l = l.superclass
		}
		
		throw initialException
	}
	
	def static boolean hasAccessibleField(JvmTypeReference type, String refPackage, String name) {
		var c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		var Field field = c.findField(name)
		
		if( field.modifiers.bitSet(Modifier.PUBLIC) ) {
			return true;
		} else if( field.modifiers.bitSet(Modifier.PRIVATE) ) {
			return false;
		} else if( c.package.name == refPackage ) {
			return true;
		}
		return false;
	}
	
	def static getFieldOwner(JvmTypeReference type, String name) {
		var c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		return findField(c,name).declaringClass.name
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
		if( simpleName.contains('.') ) {
			return simpleName;
		}
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
		
		if( m.returnType.boolean ) {
			return ValueType.BOOLEAN	
		} else if( m.returnType.numeric ) {
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
		
		if( m.returnType.boolean ) {
			return ValueType.BOOLEAN	
		} else if( m.returnType.numeric ) {
			return ValueType.NUMBER
		} else if( m.returnType == String ) {
			return ValueType.STRING
		} else if( List.isAssignableFrom(m.returnType) ) {
			return ValueType.LIST
		} else {
			return ValueType.CLASS
		}
	}
	
	def static isBoolean(Class<?> c) {
		return c == boolean || c == Boolean
	}
	
	def static isNumeric(Class<?> c) {
		return c == double || c == int || c == Integer || c == Double
	}
}