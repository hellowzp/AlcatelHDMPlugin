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
public class UploadResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.UploadResponseDTO", UploadResponseDTOJsr.class, "UploadResponseDTO", true);

    
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

    public UploadResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected UploadResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getCompleteTimeUTC(){
        return call(String.class, "getCompleteTimeUTC");
    }

    public JsFunc<Void> setCompleteTimeUTC(String completeTimeUTC){
        return call("setCompleteTimeUTC").with(completeTimeUTC);
    }

    public JsFunc<Void> setCompleteTimeUTC(IValueBinding<String> completeTimeUTC){
        return call("setCompleteTimeUTC").with(completeTimeUTC);
    }

    public JsFunc<String> getStartTimeUTC(){
        return call(String.class, "getStartTimeUTC");
    }

    public JsFunc<Void> setStartTimeUTC(String startTimeUTC){
        return call("setStartTimeUTC").with(startTimeUTC);
    }

    public JsFunc<Void> setStartTimeUTC(IValueBinding<String> startTimeUTC){
        return call("setStartTimeUTC").with(startTimeUTC);
    }

    public JsFunc<Integer> getStatus(){
        return call(Integer.class, "getStatus");
    }

    public JsFunc<Void> setStatus(int status){
        return call("setStatus").with(status);
    }

    public JsFunc<Void> setStatus(IValueBinding<Integer> status){
        return call("setStatus").with(status);
    }
    
    public static JsTypeRef<UploadResponseDTOJsr> prototype = new JsTypeRef<UploadResponseDTOJsr>(S);
}