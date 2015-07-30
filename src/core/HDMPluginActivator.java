package core;

import java.io.File;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class HDMPluginActivator extends AbstractUIPlugin {

	/**
	 * This shouldn't be called before the plugin is initialized by the platform
	 * through invoking its start() method
	 */
//	public static final String PLUGIN_ID = getPluginId();
	
	private static HDMPluginActivator plugin;
	
	public static HDMPluginActivator getDefault() {
		return plugin;
	}	
	
	public static String getPluginId() {
		return plugin.getBundle().getSymbolicName();
	}
	
	/**
	 * user.dir: /Applications/eclipse/Eclipse.app/Contents/MacOS
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;	
		System.out.println("Plugin started: " + getBundle().getSymbolicName());
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(
				plugin.getBundle().getSymbolicName(), path);
	}
	
	//https://eclipse.org/articles/Article-Using%20Images%20In%20Eclipse/Using%20Images%20In%20Eclipse.html
	@Override
	protected void initializeImageRegistry(ImageRegistry registry) {
        Bundle bundle = getBundle();
        ImageDescriptor img = ImageDescriptor.createFromURL( 
        		FileLocator.find( bundle, 
        				new Path("icons"+File.separator+"logo.png"), null));
        registry.put("AL_LOGO", img);
    }
		
}
