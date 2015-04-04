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
import hdm.functions.types.response.KeyValueResponseDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class CustomResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.CustomResponseDTO", CustomResponseDTOJsr.class, "CustomResponseDTO", true);

    
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

    public CustomResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public CustomResponseDTOJsr(KeyValueResponseDTOJsr[] responseDTOList){
        super(S.getJsCmpMeta(), true, responseDTOList);
    }

    public CustomResponseDTOJsr(IValueBinding<KeyValueResponseDTOJsr[]> responseDTOList){
        super(S.getJsCmpMeta(), true, responseDTOList);
    }

    protected CustomResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<KeyValueResponseDTOJsr[]> getResponseDTOList(){
        return call(KeyValueResponseDTOJsr[].class, "getResponseDTOList");
    }

    public JsFunc<Void> setResponseDTOList(KeyValueResponseDTOJsr[] responseDTOList){
        return call("setResponseDTOList").with(wrap(responseDTOList));
    }

    public JsFunc<Void> setResponseDTOList(IValueBinding<KeyValueResponseDTOJsr[]> responseDTOList){
        return call("setResponseDTOList").with(responseDTOList);
    }
    
    public static JsTypeRef<CustomResponseDTOJsr> prototype = new JsTypeRef<CustomResponseDTOJsr>(S);
}