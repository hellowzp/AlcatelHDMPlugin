package util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Validator {

	private static final Pattern FUNCTION_PATTERN = Pattern.compile("[_$a-zA-Z\\xA0-\\uFFFF][_$a-zA-Z0-9\\xA0-\\uFFFF]*");
	private static final String[] JAVASCRIPT_KEY_WORDS = { "instanceof", "typeof", "break", "do", "new", "var", "case", "else", "return", "void", 
														   "catch", "finally", "continue", "for", "switch", "while", "this", "with", "debugger", 
														   "function", "throw", "default", "if", "try", "delete", "in", "abstarct" };
	
	public static String isValidJSIdentifier(String identifier) {
    	if( identifier==null || identifier.isEmpty()) {
    		return "The identifier can not be empty";
    	}
    	if( Arrays.asList(JAVASCRIPT_KEY_WORDS).contains(identifier)) {
    		return "The identifier cannot be a JavaScript key word";
    	}
    	if(!FUNCTION_PATTERN.matcher(identifier).matches() ) {
    		return "Invalid identifier";
    	}
    	return null;
    }
	
}
