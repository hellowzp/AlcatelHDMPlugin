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
import org.eclipse.vjet.vjo.java.lang.LongJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class DataModelDiscoveryResponseDTOJsr extends JsObj implements ResponseDTOJsr, java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.response.DataModelDiscoveryResponseDTO", DataModelDiscoveryResponseDTOJsr.class, "DataModelDiscoveryResponseDTO", true);

    
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

    public DataModelDiscoveryResponseDTOJsr(String manufacturer){
        super(S.getJsCmpMeta(), true, manufacturer);
    }

    public DataModelDiscoveryResponseDTOJsr(IValueBinding<String> manufacturer){
        super(S.getJsCmpMeta(), true, manufacturer);
    }

    protected DataModelDiscoveryResponseDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getManufacturer(){
        return call(String.class, "getManufacturer");
    }

    public JsFunc<Void> setManufacturer(String manufacturer){
        return call("setManufacturer").with(manufacturer);
    }

    public JsFunc<Void> setManufacturer(IValueBinding<String> manufacturer){
        return call("setManufacturer").with(manufacturer);
    }

    public JsFunc<? extends LongJsr> getCustomActivationPolicyId(){
        return call(LongJsr.class, "getCustomActivationPolicyId");
    }

    public JsFunc<Boolean> hasDefaultDataModel(){
        return call(Boolean.class, "hasDefaultDataModel");
    }

    public JsFunc<Void> setHasDefaultDataModel(boolean hasDefaultDataModel){
        return call("setHasDefaultDataModel").with(hasDefaultDataModel);
    }

    public JsFunc<Void> setHasDefaultDataModel(IValueBinding<Boolean> hasDefaultDataModel){
        return call("setHasDefaultDataModel").with(check(hasDefaultDataModel));
    }

    public JsFunc<Void> setCustomActivationPolicyId(LongJsr customActivationPolicyId){
        return call("setCustomActivationPolicyId").with(customActivationPolicyId);
    }

    public JsFunc<Void> setCustomActivationPolicyId(IValueBinding<? extends LongJsr> customActivationPolicyId){
        return call("setCustomActivationPolicyId").with(customActivationPolicyId);
    }

    public JsFunc<String> toString_(){
        return call(String.class, "toString");
    }
    
    public static JsTypeRef<DataModelDiscoveryResponseDTOJsr> prototype = new JsTypeRef<DataModelDiscoveryResponseDTOJsr>(S);
}