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
public class AddObjectResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.AddObjectResponseDTO", AddObjectResponseDTOJsr.class, "AddObjectResponseDTO", true);

    
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

    public AddObjectResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected AddObjectResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<Long> getInstanceNumber(){
        return call(Long.class, "getInstanceNumber");
    }

    public JsFunc<Void> setInstanceNumber(long instanceNumber){
        return call("setInstanceNumber").with(instanceNumber);
    }

    public JsFunc<Void> setInstanceNumber(IValueBinding<Long> instanceNumber){
        return call("setInstanceNumber").with(instanceNumber);
    }

    public JsFunc<Integer> getStatus(){
        return call(Integer.class, "getStatus");
    }

    public JsFunc<Void> setStatus(int status){
        return call("setStatus").with(status);
    }

    public JsFunc<Void> setStatus(IValueBinding<Integer> status){
        return call("setStatus").with(status);
    }

    public JsFunc<String> getLabel(){
        return call(String.class, "getLabel");
    }

    public JsFunc<Void> setLabel(String label){
        return call("setLabel").with(label);
    }

    public JsFunc<Void> setLabel(IValueBinding<String> label){
        return call("setLabel").with(label);
    }
    
    public static JsTypeRef<AddObjectResponseDTOJsr> prototype = new JsTypeRef<AddObjectResponseDTOJsr>(S);
}