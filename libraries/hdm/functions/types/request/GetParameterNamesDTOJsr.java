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
public class GetParameterNamesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.GetParameterNamesDTO", GetParameterNamesDTOJsr.class, "GetParameterNamesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public GetParameterNamesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public GetParameterNamesDTOJsr(String parameterPath, boolean nextLevel){
        super(S.getJsCmpMeta(), true, parameterPath, nextLevel);
    }

    public GetParameterNamesDTOJsr(IValueBinding<String> parameterPath, IValueBinding<Boolean> nextLevel){
        super(S.getJsCmpMeta(), true, parameterPath, nextLevel);
    }

    protected GetParameterNamesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getParameterPath(){
        return call(String.class, "getParameterPath");
    }

    public JsFunc<Void> setParameterPath(String parameterPath){
        return call("setParameterPath").with(parameterPath);
    }

    public JsFunc<Void> setParameterPath(IValueBinding<String> parameterPath){
        return call("setParameterPath").with(parameterPath);
    }

    public JsFunc<Boolean> isNextLevel(){
        return call(Boolean.class, "isNextLevel");
    }

    public JsFunc<Void> setNextLevel(boolean nextLevel){
        return call("setNextLevel").with(nextLevel);
    }

    public JsFunc<Void> setNextLevel(IValueBinding<Boolean> nextLevel){
        return call("setNextLevel").with(check(nextLevel));
    }
    
    public static JsTypeRef<GetParameterNamesDTOJsr> prototype = new JsTypeRef<GetParameterNamesDTOJsr>(S);
}