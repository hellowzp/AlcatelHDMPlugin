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
import org.eclipse.vjet.vjo.java.util.SetJsr;
import org.eclipse.vjet.vjo.java.util.HashSetJsr;
import org.eclipse.vjet.vjo.java.util.IteratorJsr;
import hdm.functions.tag.JCFUserTagJsr;
import hdm.functions.tag.JCFServiceTagJsr;
import hdm.functions.tag.JCFTagConditionJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class JCFTagMapJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.tag.JCFTagMap", JCFTagMapJsr.class, "JCFTagMap", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(SetJsr.ResourceSpec.getInstance())
        .addDependentComponent(HashSetJsr.ResourceSpec.getInstance())
        .addDependentComponent(IteratorJsr.ResourceSpec.getInstance())
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance())
        .addDependentComponent(JCFUserTagJsr.ResourceSpec.getInstance())
        .addDependentComponent(JCFServiceTagJsr.ResourceSpec.getInstance())
        .addDependentComponent(JCFTagConditionJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.lang.ObjectUtil.ResourceSpec.getInstance());

    public JCFTagMapJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected JCFTagMapJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<Void> setUserTagInCache(String userTagName, String userTagValue, JCFTagConditionJsr condition){
        return call("setUserTagInCache").with(userTagName, userTagValue, condition);
    }

    public JsFunc<Void> setUserTagInCache(IValueBinding<String> userTagName, IValueBinding<String> userTagValue, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("setUserTagInCache").with(userTagName, userTagValue, condition);
    }

    public JsFunc<String> getUserTagInCache(String userTagName, JCFTagConditionJsr condition){
        return call(String.class, "getUserTagInCache").with(userTagName, condition);
    }

    public JsFunc<String> getUserTagInCache(IValueBinding<String> userTagName, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call(String.class, "getUserTagInCache").with(userTagName, condition);
    }

    public JsFunc<Void> clearUserTagInCache(String userTagName, JCFTagConditionJsr condition){
        return call("clearUserTagInCache").with(userTagName, condition);
    }

    public JsFunc<Void> clearUserTagInCache(IValueBinding<String> userTagName, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("clearUserTagInCache").with(userTagName, condition);
    }

    public JsFunc<Void> setServiceTagInCache(String serviceTagName, String serviceTagValue, JCFTagConditionJsr condition){
        return call("setServiceTagInCache").with(serviceTagName, serviceTagValue, condition);
    }

    public JsFunc<Void> setServiceTagInCache(IValueBinding<String> serviceTagName, IValueBinding<String> serviceTagValue, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("setServiceTagInCache").with(serviceTagName, serviceTagValue, condition);
    }

    public JsFunc<Void> setServiceTagInCache(String serviceTagName, String serviceTagValue, String factoryResetValue, boolean copyOnFactoryReset, JCFTagConditionJsr condition){
        return call("setServiceTagInCache").with(serviceTagName, serviceTagValue, factoryResetValue, copyOnFactoryReset, condition);
    }

    public JsFunc<Void> setServiceTagInCache(IValueBinding<String> serviceTagName, IValueBinding<String> serviceTagValue, IValueBinding<String> factoryResetValue, IValueBinding<Boolean> copyOnFactoryReset, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("setServiceTagInCache").with(serviceTagName, serviceTagValue, factoryResetValue, check(copyOnFactoryReset), condition);
    }

    public JsFunc<String> getServiceTagInCache(String serviceTagName, JCFTagConditionJsr condition){
        return call(String.class, "getServiceTagInCache").with(serviceTagName, condition);
    }

    public JsFunc<String> getServiceTagInCache(IValueBinding<String> serviceTagName, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call(String.class, "getServiceTagInCache").with(serviceTagName, condition);
    }

    public JsFunc<Void> clearServiceTagInCache(String serviceTagName, JCFTagConditionJsr condition){
        return call("clearServiceTagInCache").with(serviceTagName, condition);
    }

    public JsFunc<Void> clearServiceTagInCache(IValueBinding<String> serviceTagName, IValueBinding<? extends JCFTagConditionJsr> condition){
        return call("clearServiceTagInCache").with(serviceTagName, condition);
    }

    public JsFunc<? extends SetJsr<JCFUserTagJsr>> getUserTags(){
        return call((Class<SetJsr<JCFUserTagJsr>>)null, "getUserTags");
    }

    public JsFunc<? extends SetJsr<JCFServiceTagJsr>> getServiceTags(){
        return call((Class<SetJsr<JCFServiceTagJsr>>)null, "getServiceTags");
    }

    public JsFunc<Void> setUserTags(SetJsr<JCFUserTagJsr> userTags){
        return call("setUserTags").with(userTags);
    }

    public JsFunc<Void> setUserTags(IValueBinding<? extends SetJsr<JCFUserTagJsr>> userTags){
        return call("setUserTags").with(userTags);
    }

    public JsFunc<Void> setServiceTags(SetJsr<JCFServiceTagJsr> serviceTags){
        return call("setServiceTags").with(serviceTags);
    }

    public JsFunc<Void> setServiceTags(IValueBinding<? extends SetJsr<JCFServiceTagJsr>> serviceTags){
        return call("setServiceTags").with(serviceTags);
    }

    public JsFunc<String> toString_(){
        return call(String.class, "toString");
    }
    
    public static JsTypeRef<JCFTagMapJsr> prototype = new JsTypeRef<JCFTagMapJsr>(S);
}