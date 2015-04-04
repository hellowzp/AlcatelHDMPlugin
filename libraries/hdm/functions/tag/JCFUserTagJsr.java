package hdm.functions.tag;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsObj;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.tag.JCFTagConditionJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class JCFUserTagJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.tag.JCFUserTag", JCFUserTagJsr.class, "JCFUserTag", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance())
        .addDependentComponent(JCFTagConditionJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.lang.ObjectUtil.ResourceSpec.getInstance());

    public JCFUserTagJsr(String name, String value, JCFTagConditionJsr condition){
        super(S.getJsCmpMeta(), true, name, value, condition);
    }

    public JCFUserTagJsr(IValueBinding<String> name, IValueBinding<String> value, IValueBinding<? extends JCFTagConditionJsr> condition){
        super(S.getJsCmpMeta(), true, name, value, condition);
    }

    public JCFUserTagJsr(String name, String value){
        super(S.getJsCmpMeta(), true, name, value);
    }

    public JCFUserTagJsr(IValueBinding<String> name, IValueBinding<String> value){
        super(S.getJsCmpMeta(), true, name, value);
    }

    protected JCFUserTagJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
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

    public JsFunc<? extends JCFTagConditionJsr> getCondition(){
        return call(JCFTagConditionJsr.class, "getCondition");
    }

    public JsFunc<Void> setCondition(JCFTagConditionJsr condition){
        return call("setCondition").with(condition);
    }

    public JsFunc<Void> setCondition(IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("setCondition").with(condition);
    }

    public JsFunc<Boolean> isRemoved(){
        return call(Boolean.class, "isRemoved");
    }

    public JsFunc<Void> setRemoved(boolean removed){
        return call("setRemoved").with(removed);
    }

    public JsFunc<Void> setRemoved(IValueBinding<Boolean> removed){
        return call("setRemoved").with(check(removed));
    }

    public JsFunc<Boolean> equals_(Object obj){
        return call(Boolean.class, "equals").with(obj);
    }

    public JsFunc<String> toString_(){
        return call(String.class, "toString");
    }

    public JsFunc<Integer> hashCode_(){
        return call(Integer.class, "hashCode");
    }
    
    public static JsTypeRef<JCFUserTagJsr> prototype = new JsTypeRef<JCFUserTagJsr>(S);
}