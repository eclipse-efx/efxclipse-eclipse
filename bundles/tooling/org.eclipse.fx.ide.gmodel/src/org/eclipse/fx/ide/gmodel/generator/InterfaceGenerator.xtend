package org.eclipse.fx.ide.gmodel.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.fx.ide.gmodel.gModelDSL.GModel
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement
import static extension org.eclipse.fx.ide.gmodel.generator.Util.*;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty

class InterfaceGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val root = input.contents.head as GModel
		val name = input.URI.lastSegment.substring(0,input.URI.lastSegment.length-5)
		root.typeList.forEach[ t |
			fsa.generateFile(root.name.replace('.','/') + "/"+t.name+".java",t.generateType(name,root))
		]

		fsa.generateFile(root.name.replace('.','/') + "/"+name+"GModel.java",generateGmodelAccessor(name,root))
		fsa.generateFile(root.name.replace('.','/') + "/"+name+"Base.java",generateBaseInterface(name,root))
	}

	def generateBaseInterface(String name, GModel m) '''
	package «m.name»;

	public interface «name»Base {

	}
	'''

	def generateGmodelAccessor(String name, GModel m) '''
	package «m.name»;

	public interface «name»GModel {
		public static «name»GModel create() {
			return new «m.name».gson.GsonElementFactory();
		}

		public <T extends «name»Base> T createObject(java.io.Reader json);
		public <T extends «name»Base> java.util.List<T> createList(java.io.Reader json);

		public String toString(«name»Base o);
		public String toString(java.util.List<«name»Base> o);

		«FOR t : m.typeList»
		public «t.name».Builder «t.name»Builder();
		«ENDFOR»
	}
	'''

	def generateType(GDomainElement e, String name, GModel m) '''
	package «m.name»;

	«val superHierarchy = e.superTypeList.collectHierarchicalList»
	public interface «e.name» extends «name»Base«IF ! e.superTypeList.isEmpty», «superHierarchy.sortBy[ v | v.name ].map[ v | v.name ].join(", ")»«ENDIF» {
		«FOR p : e.propertyList»
			public «p.type» «IF p.type == "boolean"»is«ELSE»get«ENDIF»«p.name.toFirstUpper»();
		«ENDFOR»
		«FOR t : superHierarchy.sortBy[ v | v.name ]»
			«FOR p : t.propertyList»
				public «p.type» «IF p.type == "boolean"»is«ELSE»get«ENDIF»«p.name.toFirstUpper»();
			«ENDFOR»
		«ENDFOR»

		public interface Builder {
			«FOR p : e.propertyList»
				«IF p.isList»
					public Builder «p.name»(«p.type» «p.name»);
					public Builder append«p.name.toFirstUpper»(«p.plainType» «p.name»);
					«IF p.builtIn == null»
						public Builder «p.name»(java.util.function.Function<«name»GModel,java.util.List<«p.plainType»>> provider);
						public Builder append«p.name.toFirstUpper»(java.util.function.Function<«p.plainType».Builder,«p.plainType»> provider);
					«ENDIF»
				«ELSE»
					public Builder «p.name»(«p.type» «p.name»);
				«ENDIF»
			«ENDFOR»
			«FOR t : superHierarchy.sortBy[ v | v.name ]»
				«FOR p : t.propertyList»
					«IF p.isList»
						public Builder «p.name»(«p.type» «p.name»);
						public Builder append«p.name.toFirstUpper»(«p.plainType» «p.name»);
						«IF p.builtIn == null»
							public Builder «p.name»(java.util.function.Function<«name»GModel,java.util.List<«p.plainType»>> provider);
							public Builder append«p.name.toFirstUpper»(java.util.function.Function<«p.plainType».Builder,«p.plainType»> provider);
						«ENDIF»
					«ELSE»
						public Builder «p.name»(«p.type» «p.name»);
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			public «e.name» build();
		}
	}
	'''

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