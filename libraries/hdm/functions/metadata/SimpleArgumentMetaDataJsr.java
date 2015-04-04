package hdm.functions.metadata;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsProp;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import hdm.functions.metadata.ArgumentMetaDataJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class SimpleArgumentMetaDataJsr extends ArgumentMetaDataJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.SimpleArgumentMetaData", SimpleArgumentMetaDataJsr.class, "SimpleArgumentMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ArgumentMetaDataJsr.ResourceSpec.getInstance());

    public SimpleArgumentMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected SimpleArgumentMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> REPRESENTATION_TYPE_TEXT(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_TEXT");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_MASK_TEXT(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_MASK_TEXT");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_TEXT_AREA(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_TEXT_AREA");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_CHOICE_LIST(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_CHOICE_LIST");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_BOOLEAN(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_BOOLEAN");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_DATETIME(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_DATETIME");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_TEXT_ARRAY(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_TEXT_ARRAY");
    }

    public static final JsProp<String> REPRESENTATION_TYPE_EDITABLE_CHOICE_LIST(){
        return getProp(S, String.class, "REPRESENTATION_TYPE_EDITABLE_CHOICE_LIST");
    }

    public JsFunc<String> getDefaultValue(){
        return call(String.class, "getDefaultValue");
    }

    public JsFunc<Void> setDefaultValue(String defaultValue){
        return call("setDefaultValue").with(defaultValue);
    }

    public JsFunc<Void> setDefaultValue(IValueBinding<String> defaultValue){
        return call("setDefaultValue").with(defaultValue);
    }

    public JsFunc<String> getHint(){
        return call(String.class, "getHint");
    }

    public JsFunc<Void> setHint(String hint){
        return call("setHint").with(hint);
    }

    public JsFunc<Void> setHint(IValueBinding<String> hint){
        return call("setHint").with(hint);
    }

    public JsFunc<String> getPostLabel(){
        return call(String.class, "getPostLabel");
    }

    public JsFunc<Void> setPostLabel(String postLabel){
        return call("setPostLabel").with(postLabel);
    }

    public JsFunc<Void> setPostLabel(IValueBinding<String> postLabel){
        return call("setPostLabel").with(postLabel);
    }

    public JsFunc<String> getPreLabel(){
        return call(String.class, "getPreLabel");
    }

    public JsFunc<Void> setPreLabel(String preLabel){
        return call("setPreLabel").with(preLabel);
    }

    public JsFunc<Void> setPreLabel(IValueBinding<String> preLabel){
        return call("setPreLabel").with(preLabel);
    }

    public JsFunc<String> getRepresentationType(){
        return call(String.class, "getRepresentationType");
    }

    public JsFunc<Void> setRepresentationType(String representationType){
        return call("setRepresentationType").with(representationType);
    }

    public JsFunc<Void> setRepresentationType(IValueBinding<String> representationType){
        return call("setRepresentationType").with(representationType);
    }

    public JsFunc<Boolean> isRequired(){
        return call(Boolean.class, "isRequired");
    }

    public JsFunc<Void> setRequired(boolean required){
        return call("setRequired").with(required);
    }

    public JsFunc<Void> setRequired(IValueBinding<Boolean> required){
        return call("setRequired").with(check(required));
    }

    public JsFunc<Void> setChoices(String[] choices){
        return call("setChoices").with((Object)choices);
    }

    public JsFunc<Void> setChoices(IValueBinding<String[]> choices){
        return call("setChoices").with(choices);
    }

    public JsFunc<String[]> getChoices(){
        return call(String[].class, "getChoices");
    }
    
    public static JsTypeRef<SimpleArgumentMetaDataJsr> prototype = new JsTypeRef<SimpleArgumentMetaDataJsr>(S);
}