package org.eclipse.fx.ide.gmodel.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.fx.ide.gmodel.gModelDSL.GModel
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement
import static extension org.eclipse.fx.ide.gmodel.generator.Util.*;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty
import java.util.HashSet

class GsonGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val root = input.contents.head as GModel
		fsa.generateFile(root.name.replace('.','/') + "/gson/GsonBase.java", root.generateBase)
		root.typeList.forEach[ t |
			fsa.generateFile(root.name.replace('.','/') + "/gson/Gson"+t.name+"Impl.java",t.generateType(root))
		]
		fsa.generateFile(root.name.replace('.','/') + "/gson/GsonElementFactory.java",root.generateDeserializer);
	}

	def generateBase(GModel m) '''
	package «m.name».gson;

	import com.google.gson.JsonArray;
	import com.google.gson.JsonElement;
	import com.google.gson.JsonObject;
	import java.util.List;

	public interface GsonBase {
		public static JsonArray toJsonArray(List<JsonElement> list) {
			JsonArray ar = new JsonArray();
			list.stream().forEach(ar::add);
			return ar;
		}

		public static JsonArray toDomainJsonArray(List<?> list) {
			JsonArray ar = new JsonArray();
			list.stream().map( e -> (GsonBase)e ).map(GsonBase::toJSONObject).forEach(ar::add);
			return ar;
		}

		public JsonObject toJSONObject();
	}
	'''

	def generateType(GDomainElement e, GModel m) '''
	package «m.name».gson;

	import «m.name».*;
	import com.google.gson.JsonObject;

	«val superHierarchy = e.superTypeList.collectHierarchicalList»
	«val properties = new HashSet(e.propertyList)»
	«superHierarchy.forEach[ s | properties.addAll(s.propertyList) ]»
	public final class Gson«e.name»Impl implements GsonBase, «e.name»«IF !e.superTypeList.isEmpty», «superHierarchy.sortBy[ v | v.name ].map[ v | v.name ].join(", ")»«ENDIF» {
		public Gson«e.name»Impl(JsonObject jsonObject) {
			«FOR p : properties.sortBy[ p | p.name]»
				«p.generatePropertyInit»
			«ENDFOR»
		}

		public Gson«e.name»Impl(«properties.sortBy[ p | p.name].map[ p | p.type + " " + p.name].join(", ")») {
			«FOR p : properties.sortBy[ p | p.name]»
			this.«p.name» = «p.name»;
			«ENDFOR»
		}

		public JsonObject toJSONObject() {
			JsonObject o = new JsonObject();
			o.addProperty( "__type", "«e.name»" );
			«FOR p : properties.sortBy[ p | p.name]»
				«p.generatePropertyToJson»
			«ENDFOR»
			return o;
		}

		public String toString() {
			return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " { "
						«properties.sortBy[ p | p.name].map[ p |
							if( p.builtIn != null ) {
								' + "' + p.name + ' : " + ' + p.name
							} else if( p.isList ) {
								' + "' + p.name + ' : " + ' + p.name + '.stream().map( e -> e.getClass().getSimpleName() + "@" + Integer.toHexString(e.hashCode()) ).collect(java.util.stream.Collectors.toList())'
							} else {
								' + "' + p.name + ' : " + ' + p.name + ' == null ? null : ' + p.name + '.getClass().getSimpleName() + "@" + Integer.toHexString('+p.name+'.hashCode())'
							}
						].join(''' + ", "
						''')»
						+" }";
		}

		«FOR p : properties.sortBy[ p | p.name]»
			«p.generatePropertyEntry»

		«ENDFOR»
		«val name = m.eResource.URI.lastSegment.substring(0,m.eResource.URI.lastSegment.length-5)»
		public static class Builder implements «e.name».Builder {
			private final «name»GModel instance;

			public Builder(«name»GModel instance) {
				this.instance = instance;
			}

			«FOR p : properties.sortBy[ p | p.name]»
				«IF p.isList»
				private final «p.type» «p.name» = new java.util.ArrayList<>();
				public Builder «p.name»(«p.type» «p.name») {
					this.«p.name».addAll(«p.name»);
					return this;
				}
				public Builder append«p.name.toFirstUpper»(«p.plainType» «p.name») {
					this.«p.name».add(«p.name»);
					return this;
				}
				«IF p.builtIn == null»
				public Builder «p.name»(java.util.function.Function<«name»GModel,java.util.List<«p.plainType»>> provider) {
					«p.name»( provider.apply( instance ) );
					return this;
				}

				public Builder append«p.name.toFirstUpper»(java.util.function.Function<«p.plainType».Builder,«p.plainType»> provider) {
					append«p.name.toFirstUpper»( provider.apply( new Gson«p.plainType»Impl.Builder(instance) ) );
					return this;
				}
				«ENDIF»
				«ELSE»
				private «p.type» «p.name»;
				public Builder «p.name»(«p.type» «p.name») {
					this.«p.name» = «p.name»;
					return this;
				}
				«ENDIF»
			«ENDFOR»

			public «e.name» build() {
				return new Gson«e.name»Impl(«properties.sortBy[ p | p.name].map[ p | p.name].join(", ")»);
			}
		}
	}
	'''

	def generatePropertyToJson(GDomainProperty p) '''
		«IF p.isList»
			«IF p.plainType == "boolean"»
			o.add( "«p.name»", GsonBase.toJsonArray(get«p.name.toFirstUpper»().stream().map(com.google.gson.JsonPrimitive::new).collect(java.util.stream.Collectors.toList())) );
			«ELSEIF p.plainType == "int"»
			o.add( "«p.name»", GsonBase.toJsonArray(get«p.name.toFirstUpper»().stream().map(com.google.gson.JsonPrimitive::new).collect(java.util.stream.Collectors.toList())) );
			«ELSEIF p.plainType == "double"»
			o.add( "«p.name»", GsonBase.toJsonArray(get«p.name.toFirstUpper»().stream().map(com.google.gson.JsonPrimitive::new).collect(java.util.stream.Collectors.toList())) );
			«ELSEIF p.plainType == "String"»
			o.add( "«p.name»", GsonBase.toJsonArray(get«p.name.toFirstUpper»().stream().map(com.google.gson.JsonPrimitive::new).collect(java.util.stream.Collectors.toList())) );
			«ELSE»
			o.add( "«p.name»", GsonBase.toDomainJsonArray(get«p.name.toFirstUpper»()) );
			«ENDIF»
		«ELSE»
			«IF p.type == "boolean"»
			o.addProperty( "«p.name»", is«p.name.toFirstUpper»() );
			«ELSEIF p.type == "int"»
			o.addProperty( "«p.name»", get«p.name.toFirstUpper»() );
			«ELSEIF p.type == "double"»
			o.addProperty( "«p.name»", get«p.name.toFirstUpper»() );
			«ELSEIF p.type == "String"»
			o.addProperty( "«p.name»", get«p.name.toFirstUpper»() );
			«ELSE»
			o.add( "«p.name»", get«p.name.toFirstUpper»() == null ? null : ((GsonBase)get«p.name.toFirstUpper»()).toJSONObject() );
			«ENDIF»
		«ENDIF»
	'''

	def generatePropertyInit(GDomainProperty p) '''
		«IF p.isList»
			«IF p.plainType == "boolean"»
				this.«p.name» = java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsBoolean()).collect(java.util.stream.Collectors.toList()));
			«ELSEIF p.plainType == "int"»
				this.«p.name» = java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsInt()).collect(java.util.stream.Collectors.toList()));
			«ELSEIF p.plainType == "double"»
				this.«p.name» = java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsDouble()).collect(java.util.stream.Collectors.toList()));
			«ELSEIF p.plainType == "String"»
				this.«p.name» = java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsString()).collect(java.util.stream.Collectors.toList()));
			«ELSE»
				this.«p.name» = java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> GsonElementFactory.create«p.ref.name»(e.getAsJsonObject())).collect(java.util.stream.Collectors.toList()));
			«ENDIF»
		«ELSE»
			«IF p.type == "boolean"»
				this.«p.name» = jsonObject.has("«p.name»") ? jsonObject.get("«p.name»").getAsBoolean() : «IF p.value != null»«p.value»«ELSE»false«ENDIF»;
			«ELSEIF p.type == "int"»
				this.«p.name» = jsonObject.has("«p.name»") ? jsonObject.get("«p.name»").getAsInt() : «IF p.value != null»«p.value»«ELSE»0«ENDIF»;
			«ELSEIF p.type == "double"»
				this.«p.name» = jsonObject.has("«p.name»") ? jsonObject.get("«p.name»").getAsDouble() : «IF p.value != null»«p.value»«ELSE»0.0«ENDIF»;
			«ELSEIF p.type == "String"»
				this.«p.name» = jsonObject.has("«p.name»") ? jsonObject.get("«p.name»").getAsString() : «IF p.value != null»«p.value»«ELSE»null«ENDIF»;
			«ELSE»
				this.«p.name» = jsonObject.has("«p.name»") ? GsonElementFactory.create«p.ref.name»(jsonObject.getAsJsonObject("«p.name»")) : «IF p.value != null»«p.value»«ELSE»null«ENDIF»;
			«ENDIF»
		«ENDIF»
	'''

	def generatePropertyEntry(GDomainProperty p) '''
		private final «p.type» «p.name»;
		public «p.type» «IF p.type == "boolean"»is«ELSE»get«ENDIF»«p.name.toFirstUpper»() {
			return this.«p.name»;
		}

	'''

	def generateDeserializer(GModel m) '''
	package «m.name».gson;

	import «m.name».*;
	import com.google.gson.JsonObject;
	import com.google.gson.JsonArray;

	«val name = m.eResource.URI.lastSegment.substring(0,m.eResource.URI.lastSegment.length-5)»
	public final class GsonElementFactory implements «name»GModel {
		«FOR t : m.typeList»
		public static «t.name» create«t.name»(JsonObject o) {
			if( o.has("__type") ) {
				switch( o.get("__type").getAsString() ) {
					case "«t.name»":
						return new Gson«t.name»Impl(o);
					«FOR sub : t.getAllImpl(m)»
						case "«sub.name»":
							return new Gson«sub.name»Impl(o);
					«ENDFOR»
					default:
						throw new IllegalStateException();
				}
			} else {
				return new Gson«t.name»Impl(o);
			}
		}
		public «t.name».Builder «t.name»Builder() {
			return new Gson«t.name»Impl.Builder(this);
		}

		«ENDFOR»


		public <T extends «name»Base> T createObject(java.io.Reader json) {
			JsonObject o = new com.google.gson.Gson().fromJson( json, JsonObject.class);
			return _createObject(o);
		}

		@SuppressWarnings("unchecked")
		private static <T extends «name»Base> T _createObject(JsonObject o) {
			if( o.has("__type") ) {
				switch( o.get("__type").getAsString() ) {
					«FOR t : m.typeList»
					case "«t.name»":
						return (T) create«t.name»(o);
					«ENDFOR»
				}
			}
			throw new IllegalArgumentException();
		}

		public <T extends «name»Base> java.util.List<T> createList(java.io.Reader json) {
			JsonArray ar = new com.google.gson.Gson().fromJson( json, JsonArray.class);
			return java.util.stream.StreamSupport.stream(ar.spliterator(), false)
				.map( e -> (JsonObject)e)
				.map( GsonElementFactory::<T>_createObject)
				.collect(java.util.stream.Collectors.toList());
		}

		public String toString(«name»Base o) {
			return new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson( ((GsonBase)o).toJSONObject() );
		}

		public String toString(java.util.List<«name»Base> o) {
			return new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson( GsonBase.toDomainJsonArray(o) );
		}
	}
	'''

	def static getAllImpl(GDomainElement e, GModel m) {
		return m.typeList.filter[ it != e].filter[ superTypeList.collectHierarchicalList.contains(e) ].toList
	}

	def static getType(GDomainProperty p) {
		if( p.isList ) {
			return "java.util.List<"+p.getPlainType+">"
		} else {
			return p.getPlainType;
		}
	}

	def static getPlainType(GDomainProperty p) {
		return if( p.builtIn != null ) p.builtIn.toJavaType else p.ref.name;
	}
}