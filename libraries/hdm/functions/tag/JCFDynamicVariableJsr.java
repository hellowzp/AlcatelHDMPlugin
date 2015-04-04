package hdm.functions.tag;

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

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class JCFDynamicVariableJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.tag.JCFDynamicVariable", JCFDynamicVariableJsr.class, "JCFDynamicVariable", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance())
        .addDependentComponent(org.eclipse.vjet.vjo.java.lang.BooleanUtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.lang.ObjectUtil.ResourceSpec.getInstance());

    public JCFDynamicVariableJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public JCFDynamicVariableJsr(String name, String value){
        super(S.getJsCmpMeta(), true, name, value);
    }

    public JCFDynamicVariableJsr(IValueBinding<String> name, IValueBinding<String> value){
        super(S.getJsCmpMeta(), true, name, value);
    }

    public JCFDynamicVariableJsr(String name, String value, Boolean sensitive, Boolean encrypt){
        super(S.getJsCmpMeta(), true, name, value, sensitive, encrypt);
    }

    public JCFDynamicVariableJsr(IValueBinding<String> name, IValueBinding<String> value, IValueBinding<Boolean> sensitive, IValueBinding<Boolean> encrypt){
        super(S.getJsCmpMeta(), true, name, value, sensitive, encrypt);
    }

    protected JCFDynamicVariableJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> SENSITIVE_VALUE(){
        return getProp(S, String.class, "SENSITIVE_VALUE");
    }

    public JsFunc<String> getName(){
        return call(String.class, "getName");
    }

    public JsFunc<Void> setName(String name){
        return call("setName").with(name);
    }

    public JsFunc<Void> setName(IValueBinding<String> name){
        return call("setName").with(name);
    }

    public JsFunc<String> getValue_(){
        return call(String.class, "getValue");
    }

    public JsFunc<Void> setValue_(String value){
        return call("setValue").with(value);
    }

    public JsFunc<Void> setValue_(IValueBinding<String> value){
        return call("setValue").with(value);
    }

    public JsFunc<Boolean> isSensitive(){
        return call(Boolean.class, "isSensitive");
    }

    public JsFunc<Void> setSensitive(Boolean sensitive){
        return call("setSensitive").with(sensitive);
    }

    public JsFunc<Void> setSensitive(IValueBinding<Boolean> sensitive){
        return call("setSensitive").with(sensitive);
    }

    public JsFunc<Boolean> isEncrypt(){
        return call(Boolean.class, "isEncrypt");
    }

    public JsFunc<Void> setEncrypt(Boolean encrypted){
        return call("setEncrypt").with(encrypted);
    }

    public JsFunc<Void> setEncrypt(IValueBinding<Boolean> encrypted){
        return call("setEncrypt").with(encrypted);
    }

    public JsFunc<Boolean> equals_(Object obj){
        return call(Boolean.class, "equals").with(obj);
    }

    public JsFunc<Integer> hashCode_(){
        return call(Integer.class, "hashCode");
    }
    
    public static JsTypeRef<JCFDynamicVariableJsr> prototype = new JsTypeRef<JCFDynamicVariableJsr>(S);
}