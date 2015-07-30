package core;

import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XSDParser {

	private static Element XSD_ROOT_ELEMENT = loadXSD();

	private static Element loadXSD() {
		Element root = null;
		try {
			File fXmlFile = new File("src/core/functionMetaData.xsd");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			root = doc.getDocumentElement();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return root;
	}
	
	public static void main(String[] args) throws Exception {
		String[] typeArray = getParameterTypes("simpleParameterType");
		System.out.println(Arrays.toString(typeArray));
		getParameterTypes("complexParameterType");
	}
	
	public static String[] getParameterTypes(String paraType) {
		NodeList childNodes = XSD_ROOT_ELEMENT.getChildNodes();
		for(int i=0; i<childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			// node type: element, attribute, text, entity ...
			if( node.getNodeType()==Node.ELEMENT_NODE ) {
				Element element = (Element)node;
				if( element.getAttribute("name").equals(paraType) ) {
					NodeList list = element.getElementsByTagName("xs:enumeration");
					System.out.println(list.getLength());
					
					String[] types = new String[list.getLength()];
					for(int j=0; j<list.getLength(); j++) {
						Node typeEnumNode = list.item(j);
						types[j] = ((Element)typeEnumNode).getAttribute("value");
						System.out.println(types[j]);
					}
					return types;
				}
			}
		}
		
		return null;
	}
}
