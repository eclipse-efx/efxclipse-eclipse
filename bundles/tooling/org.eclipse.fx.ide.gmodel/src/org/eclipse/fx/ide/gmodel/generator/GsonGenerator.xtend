package org.eclipse.fx.ide.gmodel.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.fx.ide.gmodel.gModelDSL.GModel
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement
import static extension org.eclipse.fx.ide.gmodel.generator.Util.*;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty
import java.util.HashSet
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap

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
			«IF e.map != null»
				this.propertyMap = toMap(jsonObject);
			«ELSE»
				«FOR p : properties.sortBy[ p | p.name]»
					«p.generatePropertyInit»
				«ENDFOR»
			«ENDIF»
		}
		«IF e.map != null»
			public Gson«e.name»Impl(java.util.Map<String,«e.map.plainType»> propertyMap) {
				this.propertyMap = propertyMap;
			}
		«ELSE»
			public Gson«e.name»Impl(«properties.sortBy[ p | p.name].map[ p | p.type + " " + p.name].join(", ")») {
				«FOR p : properties.sortBy[ p | p.name]»
				this.«p.name» = «p.name»;
				«ENDFOR»
			}
		«ENDIF»

		public JsonObject toJSONObject() {
			JsonObject o = new JsonObject();
			o.addProperty( "$gtype", "«e.name»" );
			«IF e.map != null»
				for( java.util.Map.Entry<String,«e.map.plainType»> e : this.propertyMap ) {
					o.add( e.getKey(), ((GsonBase)e.getValue()).toJSONObject() );
				}
			«ELSE»
				«FOR p : properties.sortBy[ p | p.name]»
					«p.generatePropertyToJson»
				«ENDFOR»
			«ENDIF»
			return o;
		}

		public String toString() {
			«IF e.map != null»
			return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " { "
						+ "propertyMap : " + propertyMap
					+" }";
			«ELSE»
			return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " { "
						«properties.sortBy[ p | p.name].map[ p |
							if( p.builtIn != null ) {
								' + "' + p.name + ' : " + ' + p.name
							} else if( p.isList ) {
								' + "' + p.name + ' : " + ' + p.name + '.stream().map( e -> e.getClass().getSimpleName() + "@" + Integer.toHexString(e.hashCode()) ).collect(java.util.stream.Collectors.toList())'
							} else {
								' + "' + p.name + ' : " + (' + p.name + ' == null ? null : ' + p.name + '.getClass().getSimpleName() + "@" + Integer.toHexString('+p.name+'.hashCode()))'
							}
						].join(''' + ", "
						''')»
						+" }";
			«ENDIF»
		}

		«IF e.map != null»
			private static java.util.Map<String,«e.map.plainType»> toMap(JsonObject o) {
				java.util.Map<String,«e.map.plainType»> rv = new java.util.HashMap<>();
				for( java.util.Map.Entry<String,com.google.gson.JsonElement> e : o.entrySet() ) {
					if( e.getKey().startsWith("$") ) {
						continue;
					}
					«IF e.map.ref != null»
						rv.put( e.getKey(), GsonElementFactory.create«e.map.ref.name»(e.getValue().getAsJsonObject()) );
					«ELSE»
						«IF e.map.plainType == "boolean"»
							rv.put( e.getKey(), e.getValue().getAsBoolean() );
						«ELSEIF e.map.plainType == "int"»
							rv.put( e.getKey(), e.getValue().getAsInt() );
						«ELSEIF e.map.plainType == "double"»
							rv.put( e.getKey(), e.getValue().getAsDouble() );
						«ELSEIF e.map.plainType == "String"»
							rv.put( e.getKey(), e.getValue().getAsString() );
						«ENDIF»
					«ENDIF»
				}
				return rv;
			}

			private java.util.Map<String,«e.map.plainType»> propertyMap;
			public java.util.Map<String,«e.map.plainType»> getPropertyMap() {
				return this.propertyMap;
			}
		«ELSE»
			«FOR p : properties.sortBy[ p | p.name]»
				«p.generatePropertyEntry»

			«ENDFOR»
		«ENDIF»

		«val name = m.eResource.URI.lastSegment.substring(0,m.eResource.URI.lastSegment.length-5)»
		public static class Builder implements «e.name».Builder {
			private final «name»GModel instance;

			public Builder(«name»GModel instance) {
				this.instance = instance;
			}
			«IF e.map != null»
				java.util.Map<String,«e.map.plainType»> propertyMap = new java.util.HashMap<>();

				public Builder propertyMap(java.util.Map<String,«e.map.plainType»> propertyMap) {
					this.propertyMap.putAll(propertyMap);
					return this;
				}

				public Builder propertyMap(String key, «e.map.plainType» value) {
					this.propertyMap.put(key,value);
					return this;
				}

				public Builder propertyMap(String key, java.util.function.Function<«e.map.plainType».Builder,«e.map.plainType»> provider) {
					this.propertyMap.put(key,provider.apply( new Gson«e.map.plainType»Impl.Builder(instance) ) );
					return this;
				}

				public Builder propertyMap(java.util.function.Function<«name»GModel,java.util.Map<String,«e.map.plainType»>> provider) {
					this.propertyMap.putAll(provider.apply( instance ) );
					return this;
				}
			«ELSE»
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
			«ENDIF»

			public «e.name» build() {
				«IF e.map != null»
					return new Gson«e.name»Impl(propertyMap);
				«ELSE»
					return new Gson«e.name»Impl(«properties.sortBy[ p | p.name].map[ p | p.name].join(", ")»);
				«ENDIF»
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
				this.«p.name» = jsonObject.has("«p.name»") ? java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsBoolean()).collect(java.util.stream.Collectors.toList())) : java.util.Collections.emptyList();
			«ELSEIF p.plainType == "int"»
				this.«p.name» = jsonObject.has("«p.name»") ? java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsInt()).collect(java.util.stream.Collectors.toList())) : java.util.Collections.emptyList();
			«ELSEIF p.plainType == "double"»
				this.«p.name» = jsonObject.has("«p.name»") ? java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsDouble()).collect(java.util.stream.Collectors.toList())) : java.util.Collections.emptyList();
			«ELSEIF p.plainType == "String"»
				this.«p.name» = jsonObject.has("«p.name»") ? java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> e.getAsString()).collect(java.util.stream.Collectors.toList())) : java.util.Collections.emptyList();
			«ELSE»
				this.«p.name» = jsonObject.has("«p.name»") ? java.util.Collections.unmodifiableList(java.util.stream.StreamSupport.stream( jsonObject.getAsJsonArray("«p.name»").spliterator(), false )
										.map( e -> GsonElementFactory.create«p.ref.name»(e.getAsJsonObject())).collect(java.util.stream.Collectors.toList())) : java.util.Collections.emptyList();
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
			if( o.has("$gtype") ) {
				switch( o.get("$gtype").getAsString() ) {
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
			if( o.has("$gtype") ) {
				switch( o.get("$gtype").getAsString() ) {
					«FOR t : m.typeList»
					case "«t.name»":
						return (T) create«t.name»(o);
					«ENDFOR»
				}
			}
			return (T) create«m.typeList.head.name»(o);
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

	def static getPlainType(GDomainMap p) {
		return if( p.builtIn != null ) p.builtIn.toJavaType else p.ref.name;
	}
}