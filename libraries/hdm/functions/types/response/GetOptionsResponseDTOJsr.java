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
import hdm.functions.types.struct.OptionStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class GetOptionsResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.GetOptionsResponseDTO", GetOptionsResponseDTOJsr.class, "GetOptionsResponseDTO", true);

    
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

    public GetOptionsResponseDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected GetOptionsResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<OptionStructDTOJsr[]> getOptionList(){
        return call(OptionStructDTOJsr[].class, "getOptionList");
    }

    public JsFunc<Void> setOptionList(OptionStructDTOJsr[] optionList){
        return call("setOptionList").with(wrap(optionList));
    }

    public JsFunc<Void> setOptionList(IValueBinding<OptionStructDTOJsr[]> optionList){
        return call("setOptionList").with(optionList);
    }

    public JsFunc<String> getRequestedOptionName(){
        return call(String.class, "getRequestedOptionName");
    }

    public JsFunc<Void> setRequestedOptionName(String requestedOptionName){
        return call("setRequestedOptionName").with(requestedOptionName);
    }

    public JsFunc<Void> setRequestedOptionName(IValueBinding<String> requestedOptionName){
        return call("setRequestedOptionName").with(requestedOptionName);
    }
    
    public static JsTypeRef<GetOptionsResponseDTOJsr> prototype = new JsTypeRef<GetOptionsResponseDTOJsr>(S);
}