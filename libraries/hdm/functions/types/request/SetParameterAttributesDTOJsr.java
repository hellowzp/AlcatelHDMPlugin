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
import hdm.functions.types.struct.SetParameterAttributesStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class SetParameterAttributesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.SetParameterAttributesDTO", SetParameterAttributesDTOJsr.class, "SetParameterAttributesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public SetParameterAttributesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public SetParameterAttributesDTOJsr(SetParameterAttributesStructDTOJsr[] parameterList){
        super(S.getJsCmpMeta(), true, parameterList);
    }

    public SetParameterAttributesDTOJsr(IValueBinding<SetParameterAttributesStructDTOJsr[]> parameterList){
        super(S.getJsCmpMeta(), true, parameterList);
    }

    protected SetParameterAttributesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<SetParameterAttributesStructDTOJsr[]> getParameterList(){
        return call(SetParameterAttributesStructDTOJsr[].class, "getParameterList");
    }

    public JsFunc<Void> setParameterList(SetParameterAttributesStructDTOJsr[] parameterList){
        return call("setParameterList").with(wrap(parameterList));
    }

    public JsFunc<Void> setParameterList(IValueBinding<SetParameterAttributesStructDTOJsr[]> parameterList){
        return call("setParameterList").with(parameterList);
    }
    
    public static JsTypeRef<SetParameterAttributesDTOJsr> prototype = new JsTypeRef<SetParameterAttributesDTOJsr>(S);
}