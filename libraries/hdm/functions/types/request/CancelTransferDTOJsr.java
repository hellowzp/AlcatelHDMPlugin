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
public class CancelTransferDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.CancelTransferDTO", CancelTransferDTOJsr.class, "CancelTransferDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public CancelTransferDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public CancelTransferDTOJsr(String commandKey){
        super(S.getJsCmpMeta(), true, commandKey);
    }

    public CancelTransferDTOJsr(IValueBinding<String> commandKey){
        super(S.getJsCmpMeta(), true, commandKey);
    }

    protected CancelTransferDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
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

    public JsFunc<String> getPolicyID(){
        return call(String.class, "getPolicyID");
    }

    public JsFunc<Void> setPolicyID(String policyID){
        return call("setPolicyID").with(policyID);
    }

    public JsFunc<Void> setPolicyID(IValueBinding<String> policyID){
        return call("setPolicyID").with(policyID);
    }
    
    public static JsTypeRef<CancelTransferDTOJsr> prototype = new JsTypeRef<CancelTransferDTOJsr>(S);
}