package hdm.functions.types.request;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsObj;
import org.eclipse.vjet.vsf.jsref.JsProp;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.types.struct.ParameterValueStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class SetParameterValuesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.SetParameterValuesDTO", SetParameterValuesDTOJsr.class, "SetParameterValuesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public SetParameterValuesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public SetParameterValuesDTOJsr(ParameterValueStructDTOJsr[] parameterValueStructs, String parameterKey){
        super(S.getJsCmpMeta(), true, parameterValueStructs, parameterKey);
    }

    public SetParameterValuesDTOJsr(IValueBinding<ParameterValueStructDTOJsr[]> parameterValueStructs, IValueBinding<String> parameterKey){
        super(S.getJsCmpMeta(), true, parameterValueStructs, parameterKey);
    }

    protected SetParameterValuesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> TR69_TYPE_INT(){
        return getProp(S, String.class, "TR69_TYPE_INT");
    }

    public static final JsProp<String> TR69_TYPE_LONG(){
        return getProp(S, String.class, "TR69_TYPE_LONG");
    }

    public static final JsProp<String> TR69_TYPE_UNSIGNED_INT(){
        return getProp(S, String.class, "TR69_TYPE_UNSIGNED_INT");
    }

    public static final JsProp<String> TR69_TYPE_STRING(){
        return getProp(S, String.class, "TR69_TYPE_STRING");
    }

    public static final JsProp<String> TR69_TYPE_DATETIME(){
        return getProp(S, String.class, "TR69_TYPE_DATETIME");
    }

    public static final JsProp<String> TR69_TYPE_BOOLEAN(){
        return getProp(S, String.class, "TR69_TYPE_BOOLEAN");
    }

    public static final JsProp<String> TR69_TYPE_BASE64(){
        return getProp(S, String.class, "TR69_TYPE_BASE64");
    }

    public static final JsProp<String> TR69_TYPE_UNSIGNED_LONG(){
        return getProp(S, String.class, "TR69_TYPE_UNSIGNED_LONG");
    }

    public static final JsProp<String> TR69_TYPE_HEX_BINARY(){
        return getProp(S, String.class, "TR69_TYPE_HEX_BINARY");
    }

    public JsFunc<ParameterValueStructDTOJsr[]> getParameterValueStructs(){
        return call(ParameterValueStructDTOJsr[].class, "getParameterValueStructs");
    }

    public JsFunc<Void> setParameterValueStructs(ParameterValueStructDTOJsr[] parameterValueStructs){
        return call("setParameterValueStructs").with(wrap(parameterValueStructs));
    }

    public JsFunc<Void> setParameterValueStructs(IValueBinding<ParameterValueStructDTOJsr[]> parameterValueStructs){
        return call("setParameterValueStructs").with(parameterValueStructs);
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
    
    public static JsTypeRef<SetParameterValuesDTOJsr> prototype = new JsTypeRef<SetParameterValuesDTOJsr>(S);
}