package hdm.functions.metadata;

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
public class DeviceTypeMetaDataJsr extends JsObj {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.DeviceTypeMetaData", DeviceTypeMetaDataJsr.class, "DeviceTypeMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec();

    public DeviceTypeMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public DeviceTypeMetaDataJsr(String OUI, String productClass){
        super(S.getJsCmpMeta(), true, OUI, productClass);
    }

    public DeviceTypeMetaDataJsr(IValueBinding<String> OUI, IValueBinding<String> productClass){
        super(S.getJsCmpMeta(), true, OUI, productClass);
    }

    protected DeviceTypeMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getOUI(){
        return call(String.class, "getOUI");
    }

    public JsFunc<Void> setOUI(String OUI){
        return call("setOUI").with(OUI);
    }

    public JsFunc<Void> setOUI(IValueBinding<String> OUI){
        return call("setOUI").with(OUI);
    }

    public JsFunc<String> getProductClass(){
        return call(String.class, "getProductClass");
    }

    public JsFunc<Void> setProductClass(String productClass){
        return call("setProductClass").with(productClass);
    }

    public JsFunc<Void> setProductClass(IValueBinding<String> productClass){
        return call("setProductClass").with(productClass);
    }
    
    public static JsTypeRef<DeviceTypeMetaDataJsr> prototype = new JsTypeRef<DeviceTypeMetaDataJsr>(S);
}