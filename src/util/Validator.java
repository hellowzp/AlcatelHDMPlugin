package util;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

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
	
	/**
	 * validate XML against xsd using the javax.xml.validation package
	 * 
	 * @return null if success or the error message if any fail
	 */
	public static String validateXML(URL xsdUrl, URL xmlUrl) {
	    DocumentBuilder parser;
		try {
			// parse an XML document into a DOM tree
			parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();			
			Document document = parser.parse(xmlUrl.openStream());

		    // create a SchemaFactory capable of understanding WXS schemas
		    SchemaFactory factory = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI);

		    // load a WXS schema, represented by a Schema instance
		    Source schemaFile = new StreamSource(xmlUrl.openStream());
		    Schema schema = factory.newSchema(schemaFile);

		    // create a Validator instance, which can be used to validate an instance document
		    javax.xml.validation.Validator validator = schema.newValidator();
		    validator.validate(new DOMSource(document));
	        return null;
	        
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
			return e1.getMessage();
		} catch (SAXException | IOException e) {
	    	return e.getMessage();
	    }
	}
	
}
