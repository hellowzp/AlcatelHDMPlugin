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
import hdm.functions.types.struct.ResultStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class StateChangeCompleteDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.StateChangeCompleteDTO", StateChangeCompleteDTOJsr.class, "StateChangeCompleteDTO", true);

    
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

    public StateChangeCompleteDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected StateChangeCompleteDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getCommandKey(){
        return call(String.class, "getCommandKey");
    }

    public JsFunc<Void> setCommandKey(String commandKey){
        return call("setCommandKey").with(commandKey);
    }

    public JsFunc<Void> setCommandKey(IValueBinding<String> commandKey){
        return call("setCommandKey").with(commandKey);
    }

    public JsFunc<ResultStructDTOJsr[]> getResultStructDTO(){
        return call(ResultStructDTOJsr[].class, "getResultStructDTO");
    }

    public JsFunc<Void> setResultStructDTO(ResultStructDTOJsr[] resultStructDTO){
        return call("setResultStructDTO").with(wrap(resultStructDTO));
    }

    public JsFunc<Void> setResultStructDTO(IValueBinding<ResultStructDTOJsr[]> resultStructDTO){
        return call("setResultStructDTO").with(resultStructDTO);
    }
    
    public static JsTypeRef<StateChangeCompleteDTOJsr> prototype = new JsTypeRef<StateChangeCompleteDTOJsr>(S);
}