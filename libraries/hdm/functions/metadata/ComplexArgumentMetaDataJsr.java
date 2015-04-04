package hdm.functions.metadata;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.metadata.ArgumentMetaDataJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class ComplexArgumentMetaDataJsr extends ArgumentMetaDataJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.ComplexArgumentMetaData", ComplexArgumentMetaDataJsr.class, "ComplexArgumentMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ArgumentMetaDataJsr.ResourceSpec.getInstance());

    public ComplexArgumentMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected ComplexArgumentMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<String> getLabel(){
        return call(String.class, "getLabel");
    }

    public JsFunc<Void> setLabel(String label){
        return call("setLabel").with(label);
    }

    public JsFunc<Void> setLabel(IValueBinding<String> label){
        return call("setLabel").with(label);
    }
    
    public static JsTypeRef<ComplexArgumentMetaDataJsr> prototype = new JsTypeRef<ComplexArgumentMetaDataJsr>(S);
}