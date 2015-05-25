package library;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.wst.jsdt.core.compiler.libraries.SystemLibraryLocation;
import org.osgi.framework.Bundle;

import core.HDMPluginActivator;

public class HDMLibraryLocation extends SystemLibraryLocation {
	
	private static final String[] LIBRARY_FILE_NAMES = { "common.js", "sharedScript.js", "sharedPreactivationScript.js" };
	
	public HDMLibraryLocation() {}
	
	@Override
	public char[][] getLibraryFileNames() {
		char[][] libs = new char[LIBRARY_FILE_NAMES.length][];
		for (int i = 0; i < LIBRARY_FILE_NAMES.length; i++) {
			libs[i] = LIBRARY_FILE_NAMES[i].toCharArray();
		}
		return libs;
	}

	@Override
	public IPath getLibraryPathInPlugin() {
		return new Path("libraries");
	}

	@Override
	public String getLibraryPath(char[] paramArrayOfChar) {
		Bundle bundle = HDMPluginActivator.getDefault().getBundle();
		File bundleFile = null;
		try {
			bundleFile = FileLocator.getBundleFile(bundle);
		} catch (IOException e) {
			e.printStackTrace();
		}

		File libFile = new File(bundleFile, "libraries/" + new String(paramArrayOfChar));
		return libFile.getAbsolutePath();
	}

	@Override
	protected String getPluginId() {
		return HDMPluginActivator.getDefault().getBundle().getSymbolicName();
	}
}
