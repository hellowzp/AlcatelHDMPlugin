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
import org.eclipse.vjet.vjo.java.lang.LongJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class RestoreDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.RestoreDTO", RestoreDTOJsr.class, "RestoreDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(LongJsr.ResourceSpec.getInstance())
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public RestoreDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public RestoreDTOJsr(LongJsr backupId){
        super(S.getJsCmpMeta(), true, backupId);
    }

    public RestoreDTOJsr(IValueBinding<? extends LongJsr> backupId){
        super(S.getJsCmpMeta(), true, backupId);
    }

    protected RestoreDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<? extends LongJsr> getBackupId(){
        return call(LongJsr.class, "getBackupId");
    }

    public JsFunc<Void> setBackupId(LongJsr backupId){
        return call("setBackupId").with(backupId);
    }

    public JsFunc<Void> setBackupId(IValueBinding<? extends LongJsr> backupId){
        return call("setBackupId").with(backupId);
    }
    
    public static JsTypeRef<RestoreDTOJsr> prototype = new JsTypeRef<RestoreDTOJsr>(S);
}