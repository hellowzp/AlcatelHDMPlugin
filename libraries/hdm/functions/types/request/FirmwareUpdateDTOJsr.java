package hdm.functions.types.request;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsObj;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.types.request.DownloadDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class FirmwareUpdateDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.FirmwareUpdateDTO", FirmwareUpdateDTOJsr.class, "FirmwareUpdateDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance())
        .addDependentComponent(DownloadDTOJsr.ResourceSpec.getInstance());

    public FirmwareUpdateDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public FirmwareUpdateDTOJsr(DownloadDTOJsr download, String prerequisiteSoftwareVersion){
        super(S.getJsCmpMeta(), true, download, prerequisiteSoftwareVersion);
    }

    public FirmwareUpdateDTOJsr(IValueBinding<? extends DownloadDTOJsr> download, IValueBinding<String> prerequisiteSoftwareVersion){
        super(S.getJsCmpMeta(), true, download, prerequisiteSoftwareVersion);
    }

    protected FirmwareUpdateDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getFirmwareImageCorrelationKey(){
        return call(String.class, "getFirmwareImageCorrelationKey");
    }

    public JsFunc<Void> setFirmwareImageCorrelationKey(String correlationKey){
        return call("setFirmwareImageCorrelationKey").with(correlationKey);
    }

    public JsFunc<Void> setFirmwareImageCorrelationKey(IValueBinding<String> correlationKey){
        return call("setFirmwareImageCorrelationKey").with(correlationKey);
    }

    public JsFunc<Long> getDelaySeconds(){
        return call(Long.class, "getDelaySeconds");
    }

    public JsFunc<Long> getFilesize(){
        return call(Long.class, "getFilesize");
    }

    public JsFunc<String> getPassword(){
        return call(String.class, "getPassword");
    }

    public JsFunc<String> getTargetFilename(){
        return call(String.class, "getTargetFilename");
    }

    public JsFunc<String> getURL(){
        return call(String.class, "getURL");
    }

    public JsFunc<String> getUsername(){
        return call(String.class, "getUsername");
    }

    public JsFunc<Void> setDelaySeconds(long delaySeconds){
        return call("setDelaySeconds").with(delaySeconds);
    }

    public JsFunc<Void> setDelaySeconds(IValueBinding<Long> delaySeconds){
        return call("setDelaySeconds").with(delaySeconds);
    }

    public JsFunc<Void> setFilesize(long filesize){
        return call("setFilesize").with(filesize);
    }

    public JsFunc<Void> setFilesize(IValueBinding<Long> filesize){
        return call("setFilesize").with(filesize);
    }

    public JsFunc<Void> setPassword(String password){
        return call("setPassword").with(password);
    }

    public JsFunc<Void> setPassword(IValueBinding<String> password){
        return call("setPassword").with(password);
    }

    public JsFunc<Void> setSuccessURL(String successURL){
        return call("setSuccessURL").with(successURL);
    }

    public JsFunc<Void> setSuccessURL(IValueBinding<String> successURL){
        return call("setSuccessURL").with(successURL);
    }

    public JsFunc<String> getSuccessURL(){
        return call(String.class, "getSuccessURL");
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

    public JsFunc<Void> setTargetFilename(String targetFilename){
        return call("setTargetFilename").with(targetFilename);
    }

    public JsFunc<Void> setTargetFilename(IValueBinding<String> targetFilename){
        return call("setTargetFilename").with(targetFilename);
    }

    public JsFunc<Void> setURL(String url){
        return call("setURL").with(url);
    }

    public JsFunc<Void> setURL(IValueBinding<String> url){
        return call("setURL").with(url);
    }

    public JsFunc<Void> setUsername(String username){
        return call("setUsername").with(username);
    }

    public JsFunc<Void> setUsername(IValueBinding<String> username){
        return call("setUsername").with(username);
    }

    public JsFunc<String> getPrerequisiteSoftwareVersion(){
        return call(String.class, "getPrerequisiteSoftwareVersion");
    }

    public JsFunc<Void> setPrerequisiteSoftwareVersion(String prerequisiteSoftwareVersion){
        return call("setPrerequisiteSoftwareVersion").with(prerequisiteSoftwareVersion);
    }

    public JsFunc<Void> setPrerequisiteSoftwareVersion(IValueBinding<String> prerequisiteSoftwareVersion){
        return call("setPrerequisiteSoftwareVersion").with(prerequisiteSoftwareVersion);
    }

    public JsFunc<? extends DownloadDTOJsr> getDownload(){
        return call(DownloadDTOJsr.class, "getDownload");
    }

    public JsFunc<Void> setDownload(DownloadDTOJsr download){
        return call("setDownload").with(download);
    }

    public JsFunc<Void> setDownload(IValueBinding<? extends DownloadDTOJsr> download){
        return call("setDownload").with(download);
    }
    
    public static JsTypeRef<FirmwareUpdateDTOJsr> prototype = new JsTypeRef<FirmwareUpdateDTOJsr>(S);
}