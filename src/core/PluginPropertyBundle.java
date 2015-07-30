package core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PluginPropertyBundle {

	private static Properties properties = loadProperties();
	private static Element XSD_ROOT_ELEMENT = loadXSD();

	public static final int PAGE_BOUND_X = getProperty("wizardpage.bound.x", 15);
	public static final int PAGE_BOUND_Y = getProperty("wizardpage.bound.y", 15);
	public static final int PAGE_WIDTH = getProperty("wizardpage.width", 520);
	public static final int PAGE_HEIGHT = getProperty("wizardpage.height", 400);

	public static final int PARAMETER_THRESHOLD = getProperty(
			"parameter.threshold", 5);
	public static final int PAGE_HORIZONTAL_SPACE = getProperty(
			"wizardpage.layout.horizontalSpace", 10);
	public static final int PAGE_ROW_HEIGHT = getProperty(
			"wizardpage.layout.rowHeight", 100);
	public static final int PAGE_WIDTH_HINT = getProperty(
			"wizardpage.widthHint", 500);
	public static final int PAGE_HEIGHT_HINT = getProperty(
			"wizardpage.heightHint", 500);

	public static final String[] SIMPLE_PARAMETERS = getParameterTypes("simpleParameterType");
	public static final String[] COMPLEX_PARAMETERS = getParameterTypes("complexParameterType");

	public static final String LIBRARY_ID = getProperty("library.id",
			"al.hdm.library.sharedlibrary");
	public static final String LIBRARY_DESCRIPTION = getProperty(
			"library.description", "Alcatel-Lucent Bell HDM JavaScript Library");

	private static Properties loadProperties() {
		Properties properties = new Properties();
		/**
		 * Don't use the standard io library to locate files in plugin app the
		 * user.dir becomes the eclipse install library
		 * Paths.get("plugin.properties").toAbsolutePath() will be
		 * eclipse-install-directory/plugin.properties
		 */
		try (InputStream is = FileLocator.find(
					HDMPluginActivator.getDefault().getBundle(),
					new Path("src/core/plugin.properties"), null)
				.openStream()) {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	private static Element loadXSD() {
		Document doc = null;	
		try( InputStream is = FileLocator.find(
					HDMPluginActivator.getDefault().getBundle(),
					new Path("src/core/functionMetaData.xsd"), null)
				.openStream() ){
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(is);
		} catch (IOException | SAXException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		return doc.getDocumentElement();
	}

	private static int getProperty(String property, int value) {
		try {
			return Integer.valueOf( properties.getProperty(property, "" + value));
		} catch (NumberFormatException ex) {
			return value;
		}
	}

	private static String getProperty(String property, String value) {
		return properties.getProperty(property, value);
	}

//	private static String[] getParameterTypeArray(String type) {
//		return properties.getProperty(type).split(",");
//	}
	
	private static String[] getParameterTypes(String paraType) {
		NodeList childNodes = XSD_ROOT_ELEMENT.getChildNodes();
		for(int i=0; i<childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			// node type: element, attribute, text, entity ...
			if( node.getNodeType()==Node.ELEMENT_NODE ) {
				Element element = (Element)node;
				if( element.getAttribute("name").equals(paraType) ) {
					NodeList list = element.getElementsByTagName("xs:enumeration");
//					System.out.println(list.getLength());
					
					String[] types = new String[list.getLength()];
					for(int j=0; j<list.getLength(); j++) {
						Node typeEnumNode = list.item(j);
						types[j] = ((Element)typeEnumNode).getAttribute("value");
//						System.out.println(types[j]);
					}
					return types;
				}
			}
		}
		
		return null;
	}

}
