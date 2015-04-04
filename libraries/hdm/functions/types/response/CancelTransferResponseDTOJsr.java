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
public class CancelTransferResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.CancelTransferResponseDTO", CancelTransferResponseDTOJsr.class, "CancelTransferResponseDTO", true);

    
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

    public CancelTransferResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public CancelTransferResponseDTOJsr(String commandKey){
        super(S.getJsCmpMeta(), true, commandKey);
    }

    public CancelTransferResponseDTOJsr(IValueBinding<String> commandKey){
        super(S.getJsCmpMeta(), true, commandKey);
    }

    protected CancelTransferResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
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
    
    public static JsTypeRef<CancelTransferResponseDTOJsr> prototype = new JsTypeRef<CancelTransferResponseDTOJsr>(S);
}