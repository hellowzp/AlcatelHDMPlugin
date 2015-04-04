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
public class KeyValueResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.KeyValueResponseDTO", KeyValueResponseDTOJsr.class, "KeyValueResponseDTO", true);

    
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

    public KeyValueResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected KeyValueResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getKey(){
        return call(String.class, "getKey");
    }

    public JsFunc<Void> setKey(String key){
        return call("setKey").with(key);
    }

    public JsFunc<Void> setKey(IValueBinding<String> key){
        return call("setKey").with(key);
    }

    public JsFunc<String> getValue_(){
        return call(String.class, "getValue");
    }

    public JsFunc<Void> setValue_(String value){
        return call("setValue").with(value);
    }

    public JsFunc<Void> setValue_(IValueBinding<String> value){
        return call("setValue").with(value);
    }
    
    public static JsTypeRef<KeyValueResponseDTOJsr> prototype = new JsTypeRef<KeyValueResponseDTOJsr>(S);
}