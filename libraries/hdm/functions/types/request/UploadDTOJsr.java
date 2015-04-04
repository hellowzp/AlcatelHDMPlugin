package hdm.functions.types.request;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsObj;
import org.eclipse.vjet.vsf.jsref.JsProp;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class UploadDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.UploadDTO", UploadDTOJsr.class, "UploadDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public UploadDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public UploadDTOJsr(String fileType, String url, String username, String password, long delaySeconds){
        super(S.getJsCmpMeta(), true, fileType, url, username, password, delaySeconds);
    }

    public UploadDTOJsr(IValueBinding<String> fileType, IValueBinding<String> url, IValueBinding<String> username, IValueBinding<String> password, IValueBinding<Long> delaySeconds){
        super(S.getJsCmpMeta(), true, fileType, url, username, password, delaySeconds);
    }

    protected UploadDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> VENDOR_CONFIGURATION_FILE(){
        return getProp(S, String.class, "VENDOR_CONFIGURATION_FILE");
    }

    public static final JsProp<String> VENDOR_LOG_FILE(){
        return getProp(S, String.class, "VENDOR_LOG_FILE");
    }

    public JsFunc<Long> getDelaySeconds(){
        return call(Long.class, "getDelaySeconds");
    }

    public JsFunc<Void> setDelaySeconds(long delaySeconds){
        return call("setDelaySeconds").with(delaySeconds);
    }

    public JsFunc<Void> setDelaySeconds(IValueBinding<Long> delaySeconds){
        return call("setDelaySeconds").with(delaySeconds);
    }

    public JsFunc<String> getFileType(){
        return call(String.class, "getFileType");
    }

    public JsFunc<Void> setFileType(String fileType){
        return call("setFileType").with(fileType);
    }

    public JsFunc<Void> setFileType(IValueBinding<String> fileType){
        return call("setFileType").with(fileType);
    }

    public JsFunc<String> getPassword(){
        return call(String.class, "getPassword");
    }

    public JsFunc<Void> setPassword(String password){
        return call("setPassword").with(password);
    }

    public JsFunc<Void> setPassword(IValueBinding<String> password){
        return call("setPassword").with(password);
    }

    public JsFunc<String> getURL(){
        return call(String.class, "getURL");
    }

    public JsFunc<Void> setURL(String url){
        return call("setURL").with(url);
    }

    public JsFunc<Void> setURL(IValueBinding<String> url){
        return call("setURL").with(url);
    }

    public JsFunc<String> getUsername(){
        return call(String.class, "getUsername");
    }

    public JsFunc<Void> setUsername(String username){
        return call("setUsername").with(username);
    }

    public JsFunc<Void> setUsername(IValueBinding<String> username){
        return call("setUsername").with(username);
    }
    
    public static JsTypeRef<UploadDTOJsr> prototype = new JsTypeRef<UploadDTOJsr>(S);
}