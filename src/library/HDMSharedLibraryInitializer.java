package library;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.wst.jsdt.core.IAccessRule;
import org.eclipse.wst.jsdt.core.IIncludePathAttribute;
import org.eclipse.wst.jsdt.core.IIncludePathEntry;
import org.eclipse.wst.jsdt.core.IJavaScriptProject;
import org.eclipse.wst.jsdt.core.JavaScriptCore;
import org.eclipse.wst.jsdt.core.JsGlobalScopeContainerInitializer;
import org.eclipse.wst.jsdt.core.compiler.libraries.LibraryLocation;

import core.PluginPropertyBundle;

public class HDMSharedLibraryInitializer extends JsGlobalScopeContainerInitializer {
	
	private final LibraryLocation libLocation = new HDMLibraryLocation();

	public IPath getPath() {
		return new Path(PluginPropertyBundle.LIBRARY_ID);
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

}