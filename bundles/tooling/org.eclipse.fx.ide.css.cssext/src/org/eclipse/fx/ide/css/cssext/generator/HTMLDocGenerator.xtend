package org.eclipse.fx.ide.css.cssext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition
import java.util.StringTokenizer
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleOr
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcat
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleBracket
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleXor
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleLiteral
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSNumLiteral
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRulePostfix
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRegex
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleSymbol
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleFunc
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition
import java.util.HashSet
import java.util.List
import java.util.ArrayList
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSType
import java.util.Set

class HTMLDocGenerator {
	def generate(Resource resource) '''
	«leadin»
	«navbar("JavaFX CSS", resource.contents.get(0) as CssExtension)»
	<div class="container-fluid">
		<div class="row-fluid">
			«sidebar(resource.contents.get(0) as CssExtension)»
			«contentArea(resource.contents.get(0) as CssExtension)»
		</div>
	</div>
	«leadout»
	'''
	
	def leadin() '''
	<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>CSS Documentation</title>

    <!-- Le styles -->
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/js/google-code-prettify/prettify.css" rel="stylesheet">

    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
      
      .bs-docs-description:after {
    background-color: #F5F5F5;
    border: 1px solid #DDDDDD;
    border-radius: 4px 0 4px 0;
    color: #9DA0A4;
    content: "Description";
    font-size: 12px;
    font-weight: bold;
    left: -1px;
    padding: 3px 7px;
    position: absolute;
    top: -1px;
}
.bs-docs-description {
    background-color: #FFFFFF;
    border: 1px solid #DDDDDD;
    border-radius: 4px 4px 4px 4px;
    margin: 15px 0;
    padding: 39px 19px 14px;
    position: relative;
}
.bs-href {
	color: inherit;
}
.bs-href:hover {
	color: #0088CC;
}
    </style>
<body>
	'''
	def navbar(String name, CssExtension cssExt) '''
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a class="brand" href="#">«name»</a>
			<ul class="nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="#">
					Elements
					<b class="caret"></b>
					</a>
					<ul class="dropdown-menu">
						«FOR j : cssExt.eAllContents.filter(typeof(PackageDefinition)).filter(e|!e.elements.empty).toList»
						«var splitted = splitUp((j as PackageDefinition).elements,15)»
						«FOR elements : splitted»
						<li class="dropdown-submenu">
							<a href="#pack_«j.calcPackagename»">«j.calcPackagename»«IF splitted.size > 1» - «splitted.indexOf(elements)+1»«ENDIF»</a>
							<ul class="dropdown-menu">
								«FOR c : elements»
									<li><a href='#el_«(c.eContainer as PackageDefinition).calcPackagename».«c.name»'>«c.name»</a></li>
								«ENDFOR»
							</ul>
						</li>
						«ENDFOR»
						«ENDFOR»
					</ul>
				</li>
			</ul>
		</div>
	</div>
</div>
	'''
	
	def splitUp(List<ElementDefinition> elements, int max) {
		val rv = new ArrayList<List<ElementDefinition>>
		var currentList = new ArrayList<ElementDefinition>;
		var i = 0;
		
		for( ElementDefinition e : elements ) {
			if( i % max == 0 ) {
				currentList = new ArrayList<ElementDefinition>;
				rv.add(currentList);
			}
			currentList.add(e);
			i=i+1;
		}
		
		return rv;
	}
	
	def sidebar(CssExtension cssExt) '''
<div class="span3">
	<div class="well sidebar-nav">
		<ul class="nav nav-list">
			«FOR j : cssExt.eAllContents.filter(typeof(PackageDefinition)).toList»
				<li class="nav-header">«j.calcPackagename»</li>
				«FOR c : (j as PackageDefinition).elements»
				<li><a href='#el_«(c.eContainer as PackageDefinition).calcPackagename».«c.name»'>«c.name»</a></li>
				«ENDFOR»
			«ENDFOR»
		</ul>
	</div>
</div>
	'''
	
	def contentArea(CssExtension cssExt) '''
	<div class="span9">
		<div class="hero-unit">
			<h1>JavaFX CSS Documentation</h1>
		</div>
	«FOR j : cssExt.eAllContents.filter(typeof(PackageDefinition)).toList»
		«packageContent(j)»
	«ENDFOR»
	</div>
	'''
	
	def packageContent(PackageDefinition p) '''
	<section id="global">
		<div class="page-header">
			<a name="pack_«p.calcPackagename»"></a><h1>«p.calcPackagename»</h1>
		</div>
		<h2>Rules</h2>
		«FOR r : p.rules»
		<a name="r_«p.calcPackagename+"."+r.name»"></a>
		<h3>«r.name»</h3>
		<div style="padding-left: 40px;">
			<code>«IF r.rule != null»«r.rule.translateRule»«ELSE»«((r as CSSRuleDefinition).func as CSSRuleFunc).name»(«((r as CSSRuleDefinition).func as CSSRuleFunc).params.translateRule»)«ENDIF»</code>
			«IF r.doku != null»
			<div class="bs-docs-description">«r?.doku?.content?.fixJDoc»</div>
			«ENDIF»
		</div>
		«ENDFOR»
		<h2>Elements</h2>
		«FOR e : p.elements»
		<a name="el_«p.calcPackagename+"."+e.name»"></a>
		<h3>«e.name»«IF ! e.getSuper().empty»  <small>extends «e.getSuper().map(el|"<a class='bs-href' href='#el_"+(el.eContainer as PackageDefinition).calcPackagename+"."+el.name+"'>"+el.name+"</a>").join(",")»</small>«ENDIF»</h3>
		<div style="padding-left: 40px;">
			<div class="accordion" id="ac_«p.calcPackagename.replace('.','_')+"_"+e.name»">
				<div class="accordion-group">
					<div class="accordion-heading">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#ac_«p.calcPackagename.replace('.','_')+"_"+e.name»" href="#desc_«p.calcPackagename.replace('.','_')+"_"+e.name»">
							Description
						</a>
					</div>
					<div id="desc_«p.calcPackagename.replace('.','_')+"_"+e.name»" class="accordion-body collapse">
						<div class="accordion-inner">
							«e?.doku?.content?.fixJDoc»
						</div>
					</div>
				</div>
				«IF ! e.properties.empty»
				<div class="accordion-group">
					<div class="accordion-heading">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#ac_«p.calcPackagename.replace('.','_')+"_"+e.name»" href="#props_«p.calcPackagename.replace('.','_')+"_"+e.name»">
							Properties
						</a>
					</div>
					<div id="props_«p.calcPackagename.replace('.','_')+"_"+e.name»" class="accordion-body collapse">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Property</th>
									<th>Definition</th>
									<th>Default</th>
									<th>Description</th>
								</tr>
							</thead>
							<tbody>
								«FOR prop : e.properties»
									<tr>
										<td><nobr>«prop.name»</nobr></td>
										<td>«prop.rule.translateRule»</td>
										<td>«(prop as PropertyDefinition)?.getDefault()?.calcDefault»</td>
										<td>«prop?.doku?.content?.fixJDoc»</td>
									</tr>
								«ENDFOR»
							</tbody>
						</table>
					</div>
				</div>
				«ENDIF»
				«IF ! e.allSuperElements().empty»
				<div class="accordion-group">
					<div class="accordion-heading">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#ac_«p.calcPackagename.replace('.','_')+"_"+e.name»" href="#props_«p.calcPackagename.replace('.','_')+"_"+e.name»_inherited">
							Inherited Properties
						</a>
					</div>
					<div id="props_«p.calcPackagename.replace('.','_')+"_"+e.name»_inherited" class="accordion-body collapse">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Element</th>
									<th>Property</th>
									<th>Definition</th>
									<th>Default</th>
									<th>Description</th>
								</tr>
							</thead>
							<tbody>
								«FOR su : e.allSuperElements()»
									«FOR prop : (su as ElementDefinition).properties»
										<tr>
											<td>«IF(su as ElementDefinition).properties.get(0) == prop»<nobr>«(su as ElementDefinition).name»</nobr>«ENDIF»</td>
											<td><nobr>«prop.name»</nobr></td>
											<td>«prop.rule.translateRule»</td>
											<td>«(prop as PropertyDefinition)?.getDefault()?.calcDefault»</td>
											<td>«prop?.doku?.content?.fixJDoc»</td>
										</tr>
									«ENDFOR»
								«ENDFOR»
							</tbody>
						</table>
					</div>
				</div>
				«ENDIF»
				«IF ! e.pseudoClasses.empty»
				<div class="accordion-group">
					<div class="accordion-heading">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#ac_«p.calcPackagename.replace('.','_')+"_"+e.name»" href="#pseudo_«p.calcPackagename.replace('.','_')+"_"+e.name»">
							Pseudo-Classes
						</a>
					</div>
					<div id="pseudo_«p.calcPackagename.replace('.','_')+"_"+e.name»" class="accordion-body collapse">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Name</th>
									<th>Definition</th>
								</tr>
							</thead>
							<tbody>
							«FOR pseudo : e.pseudoClasses»
								<tr>
									
									<td>«pseudo.name»</td>
									<td>«pseudo?.doku?.content?.fixJDoc»</td>
								</tr>
							«ENDFOR»
							</tbody>
						</table>
					</div>
				</div>
				«ENDIF»
				«IF ! e.allSuperElements.empty»
				<div class="accordion-group">
					<div class="accordion-heading">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#ac_«p.calcPackagename.replace('.','_')+"_"+e.name»" href="#pseudo_«p.calcPackagename.replace('.','_')+"_"+e.name»_inherited">
							Inherited Pseudo-Classes
						</a>
					</div>
					<div id="pseudo_«p.calcPackagename.replace('.','_')+"_"+e.name»_inherited" class="accordion-body collapse">
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Element</th>
									<th>Name</th>
									<th>Definition</th>
								</tr>
							</thead>
							<tbody>
							«FOR su : e.allSuperElements()»
								«FOR pseudo : su.pseudoClasses»
									<tr>
										<td>«IF(su as ElementDefinition).pseudoClasses.get(0) == pseudo»<nobr>«(su as ElementDefinition).name»</nobr>«ENDIF»</td>
										<td>«pseudo.name»</td>
										<td>«pseudo?.doku?.content?.fixJDoc»</td>
									</tr>
								«ENDFOR»
							«ENDFOR»
							</tbody>
						</table>
					</div>
				</div>
				«ENDIF»	
			</div>
		</div>
		«ENDFOR»
	</section>
	'''
	
	def Set<ElementDefinition> allSuperElements(ElementDefinition definition) { 
		val set = new HashSet<ElementDefinition>
		for( su : definition.getSuper() ) {
			set.add(su);
			set.addAll(allSuperElements(su));
		}
		return set;
	}
	
	def calcDefault(CSSDefaultValue defaultValue) {
		if( defaultValue.getVal() != null ) {
			return defaultValue.getVal().translateRule;
		} else if( defaultValue.sval != null ) {
			return "\""+defaultValue.sval+"\"";
		} else if( defaultValue.ival != 0) {
			return defaultValue.ival + "";
		} else {
			return defaultValue.dval + "";
		}
	}
	
	def calcPackagename(PackageDefinition p) {
		var rv = p.name;
		var parent = p;
		while( parent.eContainer instanceof PackageDefinition ) {
			parent = parent.eContainer as PackageDefinition;
			rv = parent.name + "." +  rv;
			
		}
		return rv;
	}
	
	def fixJDoc(String doc) {
		val result = new StringBuffer();
		val linetokenizer = new StringTokenizer(doc, "\r\n");
		
		while (linetokenizer.hasMoreElements()) {
			var line = linetokenizer.nextToken();
			
			line = line.replaceFirst("^/[*][*]", "");
			line = line.replaceFirst("[*][/]$", "");
			line = line.replaceFirst("^.*[*]\t*", "");
			
			if (line.length() == 0 && result.length() > 0) {
				result.append("<br/>");
			}
			
			else {
				result.append(line);
			}
		}
		return result.toString();
	}
	
	def String translateRule(CSSRule r) {
		var result = new StringBuilder;
		if (r instanceof CSSRuleOr) {
			val iterator =(r as CSSRuleOr).getOrs().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" | ");
				}
			}
		}
		else if (r instanceof CSSRuleConcat) {
			val iterator =( r as CSSRuleConcat).getConc().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" ");
				}
			}
		}
		else if (r instanceof CSSRuleBracket) {
			result.append("[ " + translateRule(( r as CSSRuleBracket).getInner()) + " ]");
		}
		else if (r instanceof CSSRuleXor) {
			val iterator =(r as CSSRuleXor).getXors().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" || ");
				}
			}
		}
		else if (r instanceof CSSRuleLiteral) {
			result.append(( r as CSSRuleLiteral).getValue());
		}
		else if (r instanceof CSSNumLiteral) {
			result.append((r as CSSNumLiteral).getValue());
		}
		else if (r instanceof CSSRuleRef) {
			val ref = r as CSSRuleRef;
			result.append("&lt;<a class='bs-href' href='#r_"+((ref.getRef()).findpackage as PackageDefinition).calcPackagename+"."+ref.getRef().getName()+"'>" + ref.getRef().getName() + "</a>&gt;");
		}
		else if (r instanceof CSSRulePostfix) {
			result.append(translateRule(( r as CSSRulePostfix).getRule()) + (r as CSSRulePostfix).getCardinality());
		}
		else if (r instanceof CSSRuleRegex) {
			result.append(( r as CSSRuleRegex).getRegex());
		}
		else if (r instanceof CSSRuleSymbol) {
			result.append((r as CSSRuleSymbol).getSymbol());
		}
		else if (r instanceof CSSType) {
			return (r as CSSType).getType();
		}
		else {
			if (r == null) {
				return "null";
			}
		}
		return result.toString;
	}
	
	def findpackage(Definition rule) {
		var e = rule.eContainer;
		while( e != null && !(e instanceof PackageDefinition) ) {
			e = e.eContainer;
		}
		return e;
	}
	
	def leadout() '''
	<script src="http://twitter.github.com/bootstrap/assets/js/jquery.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-transition.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-alert.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-modal.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-scrollspy.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tab.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tooltip.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-popover.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-button.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-collapse.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-carousel.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-typeahead.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-affix.js">
</body>
</html>
	'''
}