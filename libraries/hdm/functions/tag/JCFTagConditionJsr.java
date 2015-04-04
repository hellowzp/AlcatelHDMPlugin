package hdm.functions.tag;

import org.eclipse.vjet.vsf.jsref.JsEnum;
import org.eclipse.vjet.vsf.jsref.JsProp;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public final class JCFTagConditionJsr extends JsEnum implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.tag.JCFTagCondition", JCFTagConditionJsr.class, "JCFTagCondition", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public JCFTagConditionJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected JCFTagConditionJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<JCFTagConditionJsr> SUCCESS(){ return getProp(S, JCFTagConditionJsr.class, "SUCCESS");}

    public static final JsProp<JCFTagConditionJsr> FAILURE(){ return getProp(S, JCFTagConditionJsr.class, "FAILURE");}

    public static final JsProp<JCFTagConditionJsr> ANY(){ return getProp(S, JCFTagConditionJsr.class, "ANY");}
    
    public static JsTypeRef<JCFTagConditionJsr> prototype = new JsTypeRef<JCFTagConditionJsr>(S);
}