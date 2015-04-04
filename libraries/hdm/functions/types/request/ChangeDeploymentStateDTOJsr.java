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
import hdm.functions.types.struct.OperationStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class ChangeDeploymentStateDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.ChangeDeploymentStateDTO", ChangeDeploymentStateDTOJsr.class, "ChangeDeploymentStateDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public ChangeDeploymentStateDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected ChangeDeploymentStateDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<OperationStructDTOJsr[]> getOperations(){
        return call(OperationStructDTOJsr[].class, "getOperations");
    }

    public JsFunc<Void> setOperations(OperationStructDTOJsr[] operations){
        return call("setOperations").with(wrap(operations));
    }

    public JsFunc<Void> setOperations(IValueBinding<OperationStructDTOJsr[]> operations){
        return call("setOperations").with(operations);
    }
    
    public static JsTypeRef<ChangeDeploymentStateDTOJsr> prototype = new JsTypeRef<ChangeDeploymentStateDTOJsr>(S);
}