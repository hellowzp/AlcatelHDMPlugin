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
public class FirmwareImageDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.FirmwareImageDTO", FirmwareImageDTOJsr.class, "FirmwareImageDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public FirmwareImageDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public FirmwareImageDTOJsr(String firmwareImageName){
        super(S.getJsCmpMeta(), true, firmwareImageName);
    }

    public FirmwareImageDTOJsr(IValueBinding<String> firmwareImageName){
        super(S.getJsCmpMeta(), true, firmwareImageName);
    }

    protected FirmwareImageDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getFirmwareImageName(){
        return call(String.class, "getFirmwareImageName");
    }

    public JsFunc<Void> setFirmwareImageName(String firmwareImageName){
        return call("setFirmwareImageName").with(firmwareImageName);
    }

    public JsFunc<Void> setFirmwareImageName(IValueBinding<String> firmwareImageName){
        return call("setFirmwareImageName").with(firmwareImageName);
    }
    
    public static JsTypeRef<FirmwareImageDTOJsr> prototype = new JsTypeRef<FirmwareImageDTOJsr>(S);
}