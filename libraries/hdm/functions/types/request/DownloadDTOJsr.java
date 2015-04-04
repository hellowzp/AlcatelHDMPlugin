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
public class DownloadDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.DownloadDTO", DownloadDTOJsr.class, "DownloadDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public DownloadDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public DownloadDTOJsr(String fileType, String url, String username, String password, int filesize, String targetFilename, int delaySeconds, String successURL, String failureURL){
        super(S.getJsCmpMeta(), true, fileType, url, username, password, filesize, targetFilename, delaySeconds, successURL, failureURL);
    }

    public DownloadDTOJsr(IValueBinding<String> fileType, IValueBinding<String> url, IValueBinding<String> username, IValueBinding<String> password, IValueBinding<Integer> filesize, IValueBinding<String> targetFilename, IValueBinding<Integer> delaySeconds, IValueBinding<String> successURL, IValueBinding<String> failureURL){
        super(S.getJsCmpMeta(), true, fileType, url, username, password, filesize, targetFilename, delaySeconds, successURL, failureURL);
    }

    protected DownloadDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> FIRMWARE_UPGRADE_IMAGE(){
        return getProp(S, String.class, "FIRMWARE_UPGRADE_IMAGE");
    }

    public static final JsProp<String> WEB_CONTENT(){
        return getProp(S, String.class, "WEB_CONTENT");
    }

    public static final JsProp<String> VENDOR_CONFIGURATION_FILE(){
        return getProp(S, String.class, "VENDOR_CONFIGURATION_FILE");
    }

    public static final JsProp<String> TONE_FILE(){
        return getProp(S, String.class, "TONE_FILE");
    }

    public static final JsProp<String> RINGER_FILE(){
        return getProp(S, String.class, "RINGER_FILE");
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

    public JsFunc<String> getFailureURL(){
        return call(String.class, "getFailureURL");
    }

    public JsFunc<Void> setFailureURL(String failureURL){
        return call("setFailureURL").with(failureURL);
    }

    public JsFunc<Void> setFailureURL(IValueBinding<String> failureURL){
        return call("setFailureURL").with(failureURL);
    }

    public JsFunc<Long> getFilesize(){
        return call(Long.class, "getFilesize");
    }

    public JsFunc<Void> setFilesize(long filesize){
        return call("setFilesize").with(filesize);
    }

    public JsFunc<Void> setFilesize(IValueBinding<Long> filesize){
        return call("setFilesize").with(filesize);
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

    public JsFunc<String> getSuccessURL(){
        return call(String.class, "getSuccessURL");
    }

    public JsFunc<Void> setSuccessURL(String successURL){
        return call("setSuccessURL").with(successURL);
    }

    public JsFunc<Void> setSuccessURL(IValueBinding<String> successURL){
        return call("setSuccessURL").with(successURL);
    }

    public JsFunc<String> getTargetFilename(){
        return call(String.class, "getTargetFilename");
    }

    public JsFunc<Void> setTargetFilename(String targetFilename){
        return call("setTargetFilename").with(targetFilename);
    }

    public JsFunc<Void> setTargetFilename(IValueBinding<String> targetFilename){
        return call("setTargetFilename").with(targetFilename);
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
    
    public static JsTypeRef<DownloadDTOJsr> prototype = new JsTypeRef<DownloadDTOJsr>(S);
}