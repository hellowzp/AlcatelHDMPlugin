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

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class GetParameterAttributesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.GetParameterAttributesDTO", GetParameterAttributesDTOJsr.class, "GetParameterAttributesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public GetParameterAttributesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public GetParameterAttributesDTOJsr(String[] parameterNames){
        super(S.getJsCmpMeta(), true, parameterNames);
    }

    public GetParameterAttributesDTOJsr(IValueBinding<String[]> parameterNames){
        super(S.getJsCmpMeta(), true, parameterNames);
    }

    protected GetParameterAttributesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String[]> getParameterNames(){
        return call(String[].class, "getParameterNames");
    }

    public JsFunc<Void> setParameterNames(String[] parameterNames){
        return call("setParameterNames").with((Object)parameterNames);
    }

    public JsFunc<Void> setParameterNames(IValueBinding<String[]> parameterNames){
        return call("setParameterNames").with(parameterNames);
    }
    
    public static JsTypeRef<GetParameterAttributesDTOJsr> prototype = new JsTypeRef<GetParameterAttributesDTOJsr>(S);
}