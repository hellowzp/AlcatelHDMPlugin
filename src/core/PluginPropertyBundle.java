package core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;

public class PluginPropertyBundle {
	
	private static Properties properties = loadProperties();
	
	public static final int PAGE_BOUND_X = getProperty("wizardpage.bound.x", 15);
	public static final int PAGE_BOUND_Y = getProperty("wizardpage.bound.y", 15);
	public static final int PAGE_WIDTH = getProperty("wizardpage.width", 520);
	public static final int PAGE_HEIGHT = getProperty("wizardpage.height", 400);
	
	public static final int PARAMETER_THRESHOLD = getProperty("parameter.threshold", 5);
	public static final int PAGE_HORIZONTAL_SPACE = 
								getProperty("wizardpage.layout.horizontalSpace", 10);
	public static final int PAGE_ROW_HEIGHT = 
								getProperty("wizardpage.layout.rowHeight", 100);
	public static final int PAGE_WIDTH_HINT = getProperty("wizardpage.widthHint", 500);
	public static final int PAGE_HEIGHT_HINT = getProperty("wizardpage.heightHint", 500);
	
	public static final String[] PARAMETER_SIMPLE_TYPES = getParameterTypeArray("parameter.simpleType");
	public static final String[] PARAMETER_COMPLEX_TYPES = getParameterTypeArray("parameter.complexType");

	public static final String LIBRARY_ID = getProperty("library.id", "al.hdm.library.sharedlibrary");
	public static final String LIBRARY_DESCRIPTION = getProperty("library.description", "Alcatel-Lucent Bell HDM JavaScript Library");	
	
	private static Properties loadProperties() {
		Properties properties = new Properties();
		/**
		 * Don't use the standard io library to locate files in plugin app
		 * the user.dir becomes the eclipse install library
		 * Paths.get("plugin.properties").toAbsolutePath() will be 
		 * D:\application_programs\eclipse-rcp-luna-SR1a-win32-x86_64\plugin.properties
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
	
	private static int getProperty(String property, int value) {
		try {
			return Integer.valueOf(properties.getProperty(property, ""+value));
		} catch( NumberFormatException ex) {
			return value;
		}
	}
	
	private static String getProperty(String property, String value) {
		return properties.getProperty(property, value);
	}
	
	private static String[] getParameterTypeArray(String type) {
		return properties.getProperty(type).split(",");
	}

}
