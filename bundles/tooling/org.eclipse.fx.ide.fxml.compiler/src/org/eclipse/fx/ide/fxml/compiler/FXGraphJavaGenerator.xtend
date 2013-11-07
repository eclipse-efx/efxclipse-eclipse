package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.fx.ide.fxgraph.fXGraph.Model
import org.eclipse.fx.ide.fxgraph.fXGraph.Element
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValuePropertyimport org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty

import static extension org.eclipse.fx.ide.fxml.compiler.ReflectionHelper.*
import java.util.Set
import java.util.HashSet
import java.net.URL
import java.util.ResourceBundle
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty
import javax.lang.model.type.ReferenceType
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty

class FXGraphJavaGenerator {
	int varIndex = 0;
	Set<String> extraImports = new HashSet;
	Model model;
	boolean fieldReflection
	boolean resourceUrl
	
	new(Model model) {
		this.model = model;
		registerImport("java.net.URL");
		registerImport("org.eclipse.fx.core.fxml.FXMLDocument");
		registerImport("java.util.Map");
		registerImport("java.util.HashMap");
		registerImport("java.util.ResourceBundle");
	}
	
	def getVarIndex() {
		varIndex = varIndex + 1;
		return varIndex;
	}
	
	def generate() '''
	package «model.package.name»;
	
	«var content = generateElementDef("root", model.componentDef.rootNode)»
	
	«FOR i : model.imports»
	import «i.importedNamespace»;
	«ENDFOR»
	
	«FOR i : extraImports»
	import «i»;
	«ENDFOR»
	
	@SuppressWarnings("all")
	public class «model.componentDef.name» extends FXMLDocument<«model.componentDef.rootNode.type.simpleName»> {
		private Map<String,Object> namespaceMap = new HashMap<>();
		«IF hasController() »
			«model.componentDef.controller.qualifiedName» _c;
			
			public 	«model.componentDef.controller.qualifiedName» getController() {
				return _c;
			}
		«ELSE»
			public Object getController() {
				return null;
			}
		«ENDIF»
		
		public «model.componentDef.rootNode.type.simpleName» load(URL location, ResourceBundle resourceBundle) {
			«IF hasController() »
				_c = new «model.componentDef.controller.qualifiedName»();
			«ENDIF»
			«IF resourceUrl»
				final String baseURL = createBaseURL(location);
			«ENDIF»
			«content»
			«IF hasController() && model.componentDef.controller.hasMethod("initialize",URL,ResourceBundle)»
				_c.initialize(location,resourceBundle);
			«ENDIF»
			return root;
		}
	
		«IF resourceUrl»
			private static String createBaseURL(URL url) {
				String externalForm = url.toExternalForm();
				return externalForm.substring(0,externalForm.lastIndexOf('/'));
			}
		«ENDIF»
	
		«IF fieldReflection»
			private static void setFieldReflective(Class<?> owner, String n, Object c, Object v) {
				try {
					Field f = owner.getDeclaredField(n);
					f.setAccessible(true);
					f.set(c, v);
				} catch(Throwable e) {
					e.printStackTrace();
				}
			}
		«ENDIF»
	}
	'''
	
	def hasController() {
		return model.componentDef.controller != null
	}
	
	def void enableFieldReflection(String name) {
		fieldReflection = true;
		registerImport("java.lang.reflect.*")
	}
	
	def void registerImport(String name) {
		extraImports.add(name)
	}
	
	def void enableResourceUrl() {
		resourceUrl = true;
	}
	
	def controllerFieldAccess(String name, Element element) '''
	«IF model.componentDef.controller.hasField(model.package.name,element.name)»
		«IF model.componentDef.controller.hasAccessibleField(model.package.name,element.name)»
			_c.«element.name» = «name»;
		«ELSE»
			«enableFieldReflection(element.name)»
			// resort to reflection
			setFieldReflective(«model.componentDef.controller.getFieldOwner(element.name)».class, "«element.name»", _c, «name»);
		«ENDIF»
	«ENDIF»
	'''
	
	def eventBindingAccess(String name, String propertyName, String methodName, Element element) '''
		«registerImport("javafx.event.EventHandler")»
		«name».set«propertyName.toFirstUpper»(new EventHandler<«element.type.eventType(propertyName)»>() {
			public void handle(«element.type.eventType(propertyName)» event) {
				_c.«methodName»(«IF !model.componentDef.controller.hasMethod(methodName)»event«ENDIF»);
			}
		});
	'''
	
	def CharSequence generateElementDef(String name, Element element) '''
	«IF element.type.needsBuilder»
		«IF "javafx.scene.image.Image" == element.type.qualifiedName»
			Image «name»;
			ImageBuilder «name»Builder = ImageBuilder.create();
			«registerImport("org.eclipse.fx.core.fxml.ImageBuilder")»
		«ELSEIF "java.net.URL" == element.type.qualifiedName»
			URL «name»;
			URLBuilder «name»Builder = URLBuilder.create();
			«registerImport("org.eclipse.fx.core.fxml.URLBuilder")»
		«ELSE»
			«element.type.simpleName» «name»;
			«element.type.simpleName»Builder «name»Builder = «element.type.simpleName»Builder.create();
			«registerImport(element.type.qualifiedName+"Builder")»
		«ENDIF»
		«FOR p : element.properties»
			«IF p.value instanceof SimpleValueProperty»
				«IF (p.value as SimpleValueProperty).stringValue != null»
					«val enumType = ReflectionHelper.getEnumType(element.type, p.name, false)»
					«IF enumType != null»
						«name»Builder.«p.name»(«enumType».«(p.value as SimpleValueProperty).stringValue»);
					«ELSE»
						«val type = ReflectionHelper.getValueType(element.type.type, p.name)»
						«IF type == ValueType.CLASS»
							«name»Builder.«p.name»(«ReflectionHelper.getType(element.type.type, p.name)».valueOf("«(p.value as SimpleValueProperty).stringValue»"));
						«ELSE»
							«name»Builder.«p.name»(«(p.value as SimpleValueProperty).simpleAttributeValue»);
						«ENDIF»
					«ENDIF»
				«ELSE»
					«name»Builder.«p.name»(«(p.value as SimpleValueProperty).simpleAttributeValue»);
				«ENDIF»
			«ELSEIF p.value instanceof ResourceValueProperty»
				«name»Builder.«p.name»(baseURL + "/«(p.value as ResourceValueProperty).value.value»");
				«enableResourceUrl()»
			«ENDIF»
		«ENDFOR»
		«name» = «name»Builder.build();
		«IF element.name != null && hasController()»
			«controllerFieldAccess(name,element)»
		«ENDIF»
	«ELSE»
		«IF element.type.qualifiedName == 'java.lang.String'»
			«element.type.simpleName» «name» = «element.type.simpleName».valueOf("«element»");
		«ELSE»
			«element.type.simpleName» «name» = new «element.type.simpleName»();
		«ENDIF»
		«FOR p : element.properties»
			«IF p.value instanceof SimpleValueProperty»
				«IF (p.value as SimpleValueProperty).stringValue != null»
					«val enumType = ReflectionHelper.getEnumType(element.type, p.name, false)»
					«IF enumType != null»
						«name».set«p.name.toFirstUpper»(«enumType».«(p.value as SimpleValueProperty).stringValue»);
					«ELSE»
						«val type = ReflectionHelper.getValueType(element.type.type, p.name)»
						«IF type == ValueType.CLASS»
							«name».set«p.name.toFirstUpper»(«ReflectionHelper.getType(element.type.type, p.name)».valueOf("«(p.value as SimpleValueProperty).stringValue»"));
						«ELSE»
							«name».set«p.name.toFirstUpper»(«(p.value as SimpleValueProperty).simpleAttributeValue»);
						«ENDIF»
					«ENDIF»
				«ELSE»
					«name».set«p.name.toFirstUpper»(«(p.value as SimpleValueProperty).simpleAttributeValue»);
				«ENDIF»
			«ELSEIF p.value instanceof ControllerHandledValueProperty && hasController()»
				«eventBindingAccess(name, p.name, (p.value as ControllerHandledValueProperty).methodname, element)»
			«ELSEIF p.value instanceof ReferenceValueProperty»
				«name».set«p.name.toFirstUpper»((«((p.value as ReferenceValueProperty).reference as Element).type.qualifiedName»)namespaceMap.get("«((p.value as ReferenceValueProperty).reference as Element).name»"));
			«ELSEIF p.value instanceof Element»
				{
					«val varName = 'e_'+getVarIndex»
					«generateElementDef(varName,p.value as Element)»
					«name».set«p.name.toFirstUpper»(«varName»);
					«staticProperties(varName,p.value as Element)»
					«staticCallProperties(varName,p.value as Element)»
				}
			«ELSEIF p.value instanceof ListValueProperty»
				«FOR l : (p.value as ListValueProperty).value»
					{
					«val i = getVarIndex»
					«val varName = 'e_'+i»
						«IF l instanceof Element»
							«generateElementDef(varName,l as Element)»
							«IF "java.net.URL" == (l as Element).type.qualifiedName»
								«name».get«p.name.toFirstUpper»().add(«varName».toExternalForm());
							«ELSE»
								«name».get«p.name.toFirstUpper»().add(«varName»);
							«ENDIF»
							«staticProperties(varName,l as Element)»
							«staticCallProperties(varName,l as Element)»
						«ELSEIF l instanceof SimpleValueProperty»
							«name».get«p.name.toFirstUpper»().add(«(l as SimpleValueProperty).simpleAttributeValue»);
						«ENDIF»
					}
				«ENDFOR»
			«ELSEIF p.value instanceof ResourceValueProperty»
				«name».set«p.name.toFirstUpper»(baseURL + "/«(p.value as ResourceValueProperty).value.value»");
				«enableResourceUrl()»
			«ENDIF»
		«ENDFOR»
		«FOR p : element.defaultChildren»
			{
				«val i = getVarIndex»
				«val varName = 'e_'+i»
				«generateElementDef(varName,p)»
				«staticProperties(varName,p)»
				«staticCallProperties(varName,p)»

«««				Need better check!
				«IF "java.net.URL" == p.type.qualifiedName»
					«name».get«element.type.defaultAttribute.toFirstUpper»().add(«varName».toExternalForm());
				«ELSE»
					«name».get«element.type.defaultAttribute.toFirstUpper»().add(«varName»);
				«ENDIF»
			}
		«ENDFOR»
		«IF element.name != null && hasController()»
			«controllerFieldAccess(name,element)»
		«ENDIF»
	«ENDIF»
	«IF element.name != null»
		namespaceMap.put("«element.name»",«name»);
	«ENDIF»
	'''
	
	def staticCallProperties(String name, Element element) '''
	«FOR prop : element.staticCallProperties»
		«val type = prop.type»
		«IF prop.value instanceof SimpleValueProperty»
			«IF (prop.value as SimpleValueProperty).stringValue != null»
				«val enumType = ReflectionHelper.getEnumType(type, prop.name, true)»
				«IF enumType != null»
					// an enum type
					«type.simpleName».set«prop.name.toFirstUpper»(«name»,«enumType».«(prop.value as SimpleValueProperty).stringValue»);
				«ELSE»
					// a simple value
					«type.simpleName».set«prop.name.toFirstUpper»(«name»,«(prop.value as SimpleValueProperty).simpleAttributeValue»);
				«ENDIF»
			«ELSE»
				«type.simpleName».set«prop.name.toFirstUpper»(«name»,«(prop.value as SimpleValueProperty).simpleAttributeValue»);
			«ENDIF»
		«ELSEIF prop.value instanceof ReferenceValueProperty»
			«type.simpleName».set«prop.name.toFirstUpper»(«name»,(«((prop.value as ReferenceValueProperty).reference as Element).type.qualifiedName»)namespaceMap.get("«((prop.value as ReferenceValueProperty).reference as Element).name»"));
		«ELSEIF prop.value instanceof Element»
			«val varname = 'e_'+getVarIndex»
			«generateElementDef(varname,prop.value as Element)»
			«type.simpleName».set«prop.name.toFirstUpper»(«name»,«varname»);
		«ENDIF»
	«ENDFOR»
	'''
	
	
	def staticProperties(String name, Element element) '''
	«FOR prop : element.staticProperties»
		«val type = prop.type»
		«IF prop.value instanceof SimpleValueProperty»
			«IF (prop.value as SimpleValueProperty).stringValue != null»
				«val enumType = ReflectionHelper.getEnumType(type, prop.name, true)»
				«IF enumType != null»
					«type.simpleName».set«prop.name.toFirstUpper»(«name»,«enumType».«(prop.value as SimpleValueProperty).stringValue»);
				«ELSE»
					«type.simpleName».set«prop.name.toFirstUpper»(«name»,«(prop.value as SimpleValueProperty).simpleAttributeValue»);
				«ENDIF»
			«ELSE»
				«type.simpleName».set«prop.name.toFirstUpper»(«name»,«(prop.value as SimpleValueProperty).simpleAttributeValue»);
			«ENDIF»
		«ELSEIF prop.value instanceof ReferenceValueProperty»
			«type.simpleName».set«prop.name.toFirstUpper»(«name»,((«((prop.value as ReferenceValueProperty).reference as Element).type.qualifiedName»)namespaceMap.get("«((prop.value as ReferenceValueProperty).reference as Element).name»"));
		«ELSEIF prop.value instanceof Element»
			«val varname = 'e_'+getVarIndex»
			«generateElementDef(varname,prop.value as Element)»
			«type.simpleName».set«prop.name.toFirstUpper»(«name»,«varname»);
		«ENDIF»
	«ENDFOR»
	'''
	
	def simpleAttributeValue(SimpleValueProperty value) {
		if( value.stringValue != null ) {
			return '"' + value.stringValue + '"';
		} else if( value.booleanValue != null ) {
			return value.booleanValue;
		} else if( value.number != null ) {
			if( value.negative ) {
				if( value.number == "-Infinity" ) {
					return "Double.NEGATIVE_INFINITY";
				} else {
					return "-" + value.number;	
				}
			} else {
				if( value.number == "-Infinity" ) {
					return "Double.NEGATIVE_INFINITY";
				} else if( value.number == "Infinity" ) {
					return "Double.POSITIVE_INFINITY";
				} else {
					return value.number;
				}
				
			}
		}
	}
	
	def type(StaticValueProperty prop) {
		var el = prop.eContainer
		while( el.eContainer != null ) {
			if( el.eContainer instanceof Element ) {
				val e = el.eContainer as Element
				return e.type;
			}
			el = el.eContainer;
		}
	}
}