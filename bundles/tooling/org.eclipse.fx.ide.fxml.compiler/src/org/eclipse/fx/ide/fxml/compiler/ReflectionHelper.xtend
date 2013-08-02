package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.xtext.common.types.JvmTypeReference
import java.util.Map
import java.util.List
import org.eclipse.xtext.common.types.JvmType
import java.lang.reflect.Modifier
import static extension org.eclipse.fx.ide.fxml.compiler.BitOperations.*
import java.lang.reflect.Field
import java.lang.reflect.ParameterizedType
import java.lang.reflect.WildcardType

class ReflectionHelper {
	private static Class<?> EVENT_HANDLER_CLASS = Class::forName("javafx.event.EventHandler",false, typeof(ReflectionHelper).classLoader);
	
	def static getEnumType(JvmTypeReference type, String attributeName, boolean layoutConstraint) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		
		val methodName = "set"+attributeName.toFirstUpper
		val m = c.methods.findFirst[name == methodName && (parameterCount == 1 || (layoutConstraint && parameterCount == 2) )]
		val t = m?.parameterTypes.get(if (layoutConstraint) 1 else 0)
		
		return if( t != null && t.enum ) t?.name else null
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
		return ReflectionFX.defaultAttribute(type)
	}
	
	def static eventType(JvmTypeReference type, String name) {
		val c = Class::forName(type.qualifiedName, false, typeof(ReflectionHelper).getClassLoader())
		val m = c.getMethod("get"+name.toFirstUpper)
		
		if( m.returnType.equals(EVENT_HANDLER_CLASS) ) {
			val gt = m.genericReturnType as ParameterizedType
			val t = gt.actualTypeArguments.head 
			if( t instanceof WildcardType ) {
				val WildcardType wt = t as WildcardType
				return wt.lowerBounds.head.typeName 
			} else {
				return t.typeName
			}
		}
		
		return null
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
		} else if(EVENT_HANDLER_CLASS.isAssignableFrom(m.returnType)) {
			return ValueType.EVENT_CLASS
		} else {
			return ValueType.CLASS
		}
	}
	
	def static getStaticValueType(JvmType type, String attribute) {
		val m = ReflectionFX.getStaticMethod(type,attribute);
		
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