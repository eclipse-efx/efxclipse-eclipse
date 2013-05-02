package org.eclipse.fx.ide.css.conversion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class CSSSTRINGValueConverter extends AbstractLexerBasedConverter<String> {
	
	
	final Pattern unicodePattern = Pattern.compile("\\\\([0-9a-fA-F]{1,6})");
	
	private String cssUnicodeToJavaUnicode(String input) {
		final StringBuffer result = new StringBuffer();
		final Matcher matcher = unicodePattern.matcher(input);
		int lastEnd = 0;
		while (matcher.find()) {
			final int cssUnicodeStart = matcher.start();
			final int cssUnicodeEnd = matcher.end();
			result.append(input.substring(lastEnd, cssUnicodeStart));
			final String cssUnicodeString = matcher.group(1);
			result.append(convertToJava(cssUnicodeString));
			lastEnd = cssUnicodeEnd;
		}
		result.append(input.substring(lastEnd));
		return result.toString();
	}
	
	private String convertToJava(String cssUnicode) {
		final int codePoint = Integer.parseInt(cssUnicode, 16);
		final char[] chars = Character.toChars(codePoint);
		return String.valueOf(chars);
	}
	
	@Override
	protected String toEscapedString(String value) {
		value = cssUnicodeToJavaUnicode(value);
		return '"' + Strings.convertToJavaString(value, false) + '"';
	}
	
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			string = cssUnicodeToJavaUnicode(string);
			return Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
}