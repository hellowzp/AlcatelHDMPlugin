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
public class GetRPCMethodsResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.GetRPCMethodsResponseDTO", GetRPCMethodsResponseDTOJsr.class, "GetRPCMethodsResponseDTO", true);

    
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

    public GetRPCMethodsResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected GetRPCMethodsResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String[]> getMethodList(){
        return call(String[].class, "getMethodList");
    }

    public JsFunc<Void> setMethodList(String[] methodList){
        return call("setMethodList").with((Object)methodList);
    }

    public JsFunc<Void> setMethodList(IValueBinding<String[]> methodList){
        return call("setMethodList").with(methodList);
    }
    
    public static JsTypeRef<GetRPCMethodsResponseDTOJsr> prototype = new JsTypeRef<GetRPCMethodsResponseDTOJsr>(S);
}