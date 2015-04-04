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
public class GetParameterValuesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.GetParameterValuesDTO", GetParameterValuesDTOJsr.class, "GetParameterValuesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public GetParameterValuesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public GetParameterValuesDTOJsr(String[] parameterNames){
        super(S.getJsCmpMeta(), true, parameterNames);
    }

    public GetParameterValuesDTOJsr(IValueBinding<String[]> parameterNames){
        super(S.getJsCmpMeta(), true, parameterNames);
    }

    protected GetParameterValuesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
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
    
    public static JsTypeRef<GetParameterValuesDTOJsr> prototype = new JsTypeRef<GetParameterValuesDTOJsr>(S);
}