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
import hdm.functions.metadata.ScriptMappingMetaDataJsr;
import hdm.functions.metadata.ArgumentMetaDataJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class FunctionMetaDataJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.FunctionMetaData", FunctionMetaDataJsr.class, "FunctionMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public FunctionMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected FunctionMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<ScriptMappingMetaDataJsr[]> getScriptMappings(){
        return call(ScriptMappingMetaDataJsr[].class, "getScriptMappings");
    }

    public JsFunc<Void> setScriptMappings(ScriptMappingMetaDataJsr[] scriptMappings){
        return call("setScriptMappings").with(wrap(scriptMappings));
    }

    public JsFunc<Void> setScriptMappings(IValueBinding<ScriptMappingMetaDataJsr[]> scriptMappings){
        return call("setScriptMappings").with(scriptMappings);
    }

    public JsFunc<ArgumentMetaDataJsr[]> getArgumentMetaDatas(){
        return call(ArgumentMetaDataJsr[].class, "getArgumentMetaDatas");
    }

    public JsFunc<Void> setArgumentMetaDatas(ArgumentMetaDataJsr[] argumentMetaDatas){
        return call("setArgumentMetaDatas").with(wrap(argumentMetaDatas));
    }

    public JsFunc<Void> setArgumentMetaDatas(IValueBinding<ArgumentMetaDataJsr[]> argumentMetaDatas){
        return call("setArgumentMetaDatas").with(argumentMetaDatas);
    }

    public JsFunc<String> getDescription(){
        return call(String.class, "getDescription");
    }

    public JsFunc<Void> setDescription(String description){
        return call("setDescription").with(description);
    }

    public JsFunc<Void> setDescription(IValueBinding<String> description){
        return call("setDescription").with(description);
    }

    public JsFunc<String> getNameKey(){
        return call(String.class, "getNameKey");
    }

    public JsFunc<Void> setNameKey(String nameKey){
        return call("setNameKey").with(nameKey);
    }

    public JsFunc<Void> setNameKey(IValueBinding<String> nameKey){
        return call("setNameKey").with(nameKey);
    }

    public JsFunc<Integer> getFunctionCode(){
        return call(Integer.class, "getFunctionCode");
    }

    public JsFunc<Void> setFunctionCode(int functionCode){
        return call("setFunctionCode").with(functionCode);
    }

    public JsFunc<Void> setFunctionCode(IValueBinding<Integer> functionCode){
        return call("setFunctionCode").with(functionCode);
    }

    public JsFunc<Boolean> isDeviceTypeBound(){
        return call(Boolean.class, "isDeviceTypeBound");
    }

    public JsFunc<Void> setDeviceTypeBound(boolean deviceTypeBound){
        return call("setDeviceTypeBound").with(deviceTypeBound);
    }

    public JsFunc<Void> setDeviceTypeBound(IValueBinding<Boolean> deviceTypeBound){
        return call("setDeviceTypeBound").with(check(deviceTypeBound));
    }
    
    public static JsTypeRef<FunctionMetaDataJsr> prototype = new JsTypeRef<FunctionMetaDataJsr>(S);
}