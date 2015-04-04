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
import hdm.functions.types.response.ResponseDTOJsr;
import hdm.functions.types.struct.AutonOpResultStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class AutonomousDUStateChangeDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.AutonomousDUStateChangeDTO", AutonomousDUStateChangeDTOJsr.class, "AutonomousDUStateChangeDTO", true);

    
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

    public AutonomousDUStateChangeDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected AutonomousDUStateChangeDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<AutonOpResultStructDTOJsr[]> getAutonomousOperationResult(){
        return call(AutonOpResultStructDTOJsr[].class, "getAutonomousOperationResult");
    }

    public JsFunc<Void> setAutonomousOperationResult(AutonOpResultStructDTOJsr[] autonomousOperationResult){
        return call("setAutonomousOperationResult").with(wrap(autonomousOperationResult));
    }

    public JsFunc<Void> setAutonomousOperationResult(IValueBinding<AutonOpResultStructDTOJsr[]> autonomousOperationResult){
        return call("setAutonomousOperationResult").with(autonomousOperationResult);
    }
    
    public static JsTypeRef<AutonomousDUStateChangeDTOJsr> prototype = new JsTypeRef<AutonomousDUStateChangeDTOJsr>(S);
}