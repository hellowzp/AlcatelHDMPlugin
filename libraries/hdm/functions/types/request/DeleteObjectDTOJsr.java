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
public class DeleteObjectDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.DeleteObjectDTO", DeleteObjectDTOJsr.class, "DeleteObjectDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public DeleteObjectDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public DeleteObjectDTOJsr(String objectName, String parameterKey){
        super(S.getJsCmpMeta(), true, objectName, parameterKey);
    }

    public DeleteObjectDTOJsr(IValueBinding<String> objectName, IValueBinding<String> parameterKey){
        super(S.getJsCmpMeta(), true, objectName, parameterKey);
    }

    protected DeleteObjectDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getObjectName(){
        return call(String.class, "getObjectName");
    }

    public JsFunc<Void> setObjectName(String objectName){
        return call("setObjectName").with(objectName);
    }

    public JsFunc<Void> setObjectName(IValueBinding<String> objectName){
        return call("setObjectName").with(objectName);
    }

    public JsFunc<String> getParameterKey(){
        return call(String.class, "getParameterKey");
    }

    public JsFunc<Void> setParameterKey(String parameterKey){
        return call("setParameterKey").with(parameterKey);
    }

    public JsFunc<Void> setParameterKey(IValueBinding<String> parameterKey){
        return call("setParameterKey").with(parameterKey);
    }
    
    public static JsTypeRef<DeleteObjectDTOJsr> prototype = new JsTypeRef<DeleteObjectDTOJsr>(S);
}