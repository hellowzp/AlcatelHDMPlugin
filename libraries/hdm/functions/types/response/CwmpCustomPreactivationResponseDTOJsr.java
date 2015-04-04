package hdm.functions.types.response;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsObj;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.types.response.ResponseDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class CwmpCustomPreactivationResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.CwmpCustomPreactivationResponseDTO", CwmpCustomPreactivationResponseDTOJsr.class, "CwmpCustomPreactivationResponseDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ResponseDTOJsr.ResourceSpec.getInstance())
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public CwmpCustomPreactivationResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected CwmpCustomPreactivationResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getPppoeUserName(){
        return call(String.class, "getPppoeUserName");
    }

    public JsFunc<Void> setPppoeUserName(String pppoeUserName){
        return call("setPppoeUserName").with(pppoeUserName);
    }

    public JsFunc<Void> setPppoeUserName(IValueBinding<String> pppoeUserName){
        return call("setPppoeUserName").with(pppoeUserName);
    }

    public JsFunc<String> getPppoePassword(){
        return call(String.class, "getPppoePassword");
    }

    public JsFunc<Void> setPppoePassword(String pppoePassword){
        return call("setPppoePassword").with(pppoePassword);
    }

    public JsFunc<Void> setPppoePassword(IValueBinding<String> pppoePassword){
        return call("setPppoePassword").with(pppoePassword);
    }

    public JsFunc<String> getHttpPublicUserName(){
        return call(String.class, "getHttpPublicUserName");
    }

    public JsFunc<Void> setHttpPublicUserName(String httpPublicUserName){
        return call("setHttpPublicUserName").with(httpPublicUserName);
    }

    public JsFunc<Void> setHttpPublicUserName(IValueBinding<String> httpPublicUserName){
        return call("setHttpPublicUserName").with(httpPublicUserName);
    }

    public JsFunc<String> getHttpPublicPassword(){
        return call(String.class, "getHttpPublicPassword");
    }

    public JsFunc<Void> setHttpPublicPassword(String httpPublicPassword){
        return call("setHttpPublicPassword").with(httpPublicPassword);
    }

    public JsFunc<Void> setHttpPublicPassword(IValueBinding<String> httpPublicPassword){
        return call("setHttpPublicPassword").with(httpPublicPassword);
    }

    public JsFunc<String> getConnectionRequestUserName(){
        return call(String.class, "getConnectionRequestUserName");
    }

    public JsFunc<Void> setConnectionRequestUserName(String connectionRequestUserName){
        return call("setConnectionRequestUserName").with(connectionRequestUserName);
    }

    public JsFunc<Void> setConnectionRequestUserName(IValueBinding<String> connectionRequestUserName){
        return call("setConnectionRequestUserName").with(connectionRequestUserName);
    }

    public JsFunc<String> getConnectionRequestPassword(){
        return call(String.class, "getConnectionRequestPassword");
    }

    public JsFunc<Void> setConnectionRequestPassword(String connectionRequestPassword){
        return call("setConnectionRequestPassword").with(connectionRequestPassword);
    }

    public JsFunc<Void> setConnectionRequestPassword(IValueBinding<String> connectionRequestPassword){
        return call("setConnectionRequestPassword").with(connectionRequestPassword);
    }

    public JsFunc<String> getAcsUrl(){
        return call(String.class, "getAcsUrl");
    }

    public JsFunc<Void> setAcsUrl(String acsUrl){
        return call("setAcsUrl").with(acsUrl);
    }

    public JsFunc<Void> setAcsUrl(IValueBinding<String> acsUrl){
        return call("setAcsUrl").with(acsUrl);
    }
    
    public static JsTypeRef<CwmpCustomPreactivationResponseDTOJsr> prototype = new JsTypeRef<CwmpCustomPreactivationResponseDTOJsr>(S);
}