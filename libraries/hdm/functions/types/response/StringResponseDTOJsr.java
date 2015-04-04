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
public class StringResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.StringResponseDTO", StringResponseDTOJsr.class, "StringResponseDTO", true);

    
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

    public StringResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public StringResponseDTOJsr(String value){
        super(S.getJsCmpMeta(), true, value);
    }

    public StringResponseDTOJsr(IValueBinding<String> value){
        super(S.getJsCmpMeta(), true, value);
    }

    protected StringResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
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
    
    public static JsTypeRef<StringResponseDTOJsr> prototype = new JsTypeRef<StringResponseDTOJsr>(S);
}