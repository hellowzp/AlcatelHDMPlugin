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
public class SetVouchersDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.SetVouchersDTO", SetVouchersDTOJsr.class, "SetVouchersDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public SetVouchersDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public SetVouchersDTOJsr(String[] voucherList){
        super(S.getJsCmpMeta(), true, voucherList);
    }

    public SetVouchersDTOJsr(IValueBinding<String[]> voucherList){
        super(S.getJsCmpMeta(), true, voucherList);
    }

    protected SetVouchersDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String[]> getVoucherList(){
        return call(String[].class, "getVoucherList");
    }

    public JsFunc<Void> setVoucherList(String[] voucherList){
        return call("setVoucherList").with((Object)voucherList);
    }

    public JsFunc<Void> setVoucherList(IValueBinding<String[]> voucherList){
        return call("setVoucherList").with(voucherList);
    }
    
    public static JsTypeRef<SetVouchersDTOJsr> prototype = new JsTypeRef<SetVouchersDTOJsr>(S);
}