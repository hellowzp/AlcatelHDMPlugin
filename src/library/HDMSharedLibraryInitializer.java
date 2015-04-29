package library;

import java.io.File;
import java.io.IOException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.wst.jsdt.core.IAccessRule;
import org.eclipse.wst.jsdt.core.IIncludePathAttribute;
import org.eclipse.wst.jsdt.core.IIncludePathEntry;
import org.eclipse.wst.jsdt.core.IJavaScriptProject;
import org.eclipse.wst.jsdt.core.JavaScriptCore;
import org.eclipse.wst.jsdt.core.JsGlobalScopeContainerInitializer;
import org.eclipse.wst.jsdt.core.compiler.libraries.LibraryLocation;
import org.eclipse.wst.jsdt.core.compiler.libraries.SystemLibraryLocation;
import org.osgi.framework.Bundle;

public class HDMSharedLibraryInitializer extends JsGlobalScopeContainerInitializer {
	
	private static final String LIBRARY_ID = "al.hdm.library.sharedlibrary";
	private static final String[] LIBRARY_FILE_NAMES = { "common.js", "sharedScript.js", "sharedPreactivationScript.js" };

	private final LibraryLocation libLocation = new HDMLibraryLocation();

	public IPath getPath() {
		return new Path(LIBRARY_ID);
	}

	public LibraryLocation getLibraryLocation() {
		return libLocation;
	}

	public String getDescription() {
		return "Alcatel-Lucent Bell HDM JavaScript Library";
	}

	public String getDescription(IPath containerPath, IJavaScriptProject project) {
		return getDescription();
	}

	public int getKind() {
		return JsGlobalScopeContainerInitializer.K_SYSTEM;
	}

	public IIncludePathEntry[] getIncludepathEntries() {
		LibraryLocation libLocation = getLibraryLocation();
		char[][] filesInLibs = libLocation.getLibraryFileNames();
		IIncludePathEntry[] entries = new IIncludePathEntry[filesInLibs.length];
		for (int i = 0; i < entries.length; i++) {
			IPath workingLibPath = new Path(
					libLocation.getLibraryPath(filesInLibs[i]));
			entries[i] = JavaScriptCore.newLibraryEntry(
					workingLibPath.makeAbsolute(), null, null,
					new IAccessRule[0], new IIncludePathAttribute[0], true);
		}
		return entries;
	}

	final class HDMLibraryLocation extends SystemLibraryLocation {
		private HDMLibraryLocation() {
		}

		public char[][] getLibraryFileNames() {
			char[][] libs = new char[LIBRARY_FILE_NAMES.length][];
			for (int i = 0; i < LIBRARY_FILE_NAMES.length; i++) {
				libs[i] = LIBRARY_FILE_NAMES[i].toCharArray();
			}
			return libs;
		}

		public IPath getLibraryPathInPlugin() {
			return new Path("libraries");
		}

		public String getLibraryPath(char[] paramArrayOfChar) {
			Bundle bundle = Platform.getBundle("AlcatelHDMPlugin");
			File bundleFile = null;
			try {
				bundleFile = FileLocator.getBundleFile(bundle);
			} catch (IOException e) {
				e.printStackTrace();
			}

			File libFile = new File(bundleFile, "libraries/" + new String(paramArrayOfChar));
			return libFile.getAbsolutePath();
		}

		protected String getPluginId() {
			return "AlcatelHDMPlugin";
		}
	}
}