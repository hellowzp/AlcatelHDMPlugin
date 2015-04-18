package ui;

import java.io.File;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class HDMPluginActivator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "AlcatelHDMPlugin";
	public static final String IMAGE_REGISTRY_ID = "Alcatel-Lucent image registry";
	
	private static HDMPluginActivator plugin;
	
	public static HDMPluginActivator getDefault() {
		return plugin;
	}
	
	public String getPluginId() {
		return getBundle().getSymbolicName();
	}
	
	/**
	 * user.dir: /Applications/eclipse/Eclipse.app/Contents/MacOS
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;	
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
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	@Override
	protected void initializeImageRegistry(ImageRegistry registry) {
        Bundle bundle = Platform.getBundle(PLUGIN_ID);
        ImageDescriptor img = ImageDescriptor.createFromURL( 
        		FileLocator.find(bundle, new Path("icons"+File.separator+"logo.png"), null));
        registry.put("AL_LOGO", img);
    }
		
}
