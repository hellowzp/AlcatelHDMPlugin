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
import hdm.functions.types.struct.ParameterAttributeStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class GetParameterAttributesResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.GetParameterAttributesResponseDTO", GetParameterAttributesResponseDTOJsr.class, "GetParameterAttributesResponseDTO", true);

    
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

    public GetParameterAttributesResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected GetParameterAttributesResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<ParameterAttributeStructDTOJsr[]> getParameterList(){
        return call(ParameterAttributeStructDTOJsr[].class, "getParameterList");
    }

    public JsFunc<Void> setParameterList(ParameterAttributeStructDTOJsr[] parameterList){
        return call("setParameterList").with(wrap(parameterList));
    }

    public JsFunc<Void> setParameterList(IValueBinding<ParameterAttributeStructDTOJsr[]> parameterList){
        return call("setParameterList").with(parameterList);
    }
    
    public static JsTypeRef<GetParameterAttributesResponseDTOJsr> prototype = new JsTypeRef<GetParameterAttributesResponseDTOJsr>(S);
}