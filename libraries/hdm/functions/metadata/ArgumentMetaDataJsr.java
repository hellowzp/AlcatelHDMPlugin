package hdm.functions.metadata;

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
public abstract class ArgumentMetaDataJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.ArgumentMetaData", ArgumentMetaDataJsr.class, "ArgumentMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public ArgumentMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected ArgumentMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> TYPE_ADD_OBJECT(){
        return getProp(S, String.class, "TYPE_ADD_OBJECT");
    }

    public static final JsProp<String> TYPE_DELETE_OBJECT(){
        return getProp(S, String.class, "TYPE_DELETE_OBJECT");
    }

    public static final JsProp<String> TYPE_DOWNLOAD(){
        return getProp(S, String.class, "TYPE_DOWNLOAD");
    }

    public static final JsProp<String> TYPE_SCHEDULE_DOWNLOAD(){
        return getProp(S, String.class, "TYPE_SCHEDULE_DOWNLOAD");
    }

    public static final JsProp<String> TYPE_FIRMWARE_UPDATE(){
        return getProp(S, String.class, "TYPE_FIRMWARE_UPDATE");
    }

    public static final JsProp<String> TYPE_GET_OPTIONS(){
        return getProp(S, String.class, "TYPE_GET_OPTIONS");
    }

    public static final JsProp<String> TYPE_GET_PARAMETER_ATTRIBUTES(){
        return getProp(S, String.class, "TYPE_GET_PARAMETER_ATTRIBUTES");
    }

    public static final JsProp<String> TYPE_GET_PARAMETER_NAMES(){
        return getProp(S, String.class, "TYPE_GET_PARAMETER_NAMES");
    }

    public static final JsProp<String> TYPE_GET_PARAMETER_VALUES(){
        return getProp(S, String.class, "TYPE_GET_PARAMETER_VALUES");
    }

    public static final JsProp<String> TYPE_RESTORE(){
        return getProp(S, String.class, "TYPE_RESTORE");
    }

    public static final JsProp<String> TYPE_SET_PARAMETER_ATTRIBUTES(){
        return getProp(S, String.class, "TYPE_SET_PARAMETER_ATTRIBUTES");
    }

    public static final JsProp<String> TYPE_SET_PARAMETER_VALUES(){
        return getProp(S, String.class, "TYPE_SET_PARAMETER_VALUES");
    }

    public static final JsProp<String> TYPE_SET_VOUCHERS(){
        return getProp(S, String.class, "TYPE_SET_VOUCHERS");
    }

    public static final JsProp<String> TYPE_UPLOAD(){
        return getProp(S, String.class, "TYPE_UPLOAD");
    }

    public static final JsProp<String> TYPE_CHANGE_DEPLOYMENT_STATE(){
        return getProp(S, String.class, "TYPE_CHANGE_DEPLOYMENT_STATE");
    }

    public static final JsProp<String> TYPE_CANCEL_TRANSFER(){
        return getProp(S, String.class, "TYPE_CANCEL_TRANSFER");
    }

    public static final JsProp<String> TYPE_SNMP_SET_PARAMETER_VALUES(){
        return getProp(S, String.class, "TYPE_SNMP_SET_PARAMETER_VALUES");
    }

    public static final JsProp<String> TYPE_SNMP_GET_PARAMETER_VALUES(){
        return getProp(S, String.class, "TYPE_SNMP_GET_PARAMETER_VALUES");
    }

    public static final JsProp<String> TYPE_INTEGER(){
        return getProp(S, String.class, "TYPE_INTEGER");
    }

    public static final JsProp<String> TYPE_LONG(){
        return getProp(S, String.class, "TYPE_LONG");
    }

    public static final JsProp<String> TYPE_STRING(){
        return getProp(S, String.class, "TYPE_STRING");
    }

    public static final JsProp<String> TYPE_DATE(){
        return getProp(S, String.class, "TYPE_DATE");
    }

    public static final JsProp<String> TYPE_BOOLEAN(){
        return getProp(S, String.class, "TYPE_BOOLEAN");
    }

    public static final JsProp<String> TYPE_UNSIGNED_INTEGER(){
        return getProp(S, String.class, "TYPE_UNSIGNED_INTEGER");
    }

    public static final JsProp<String> TYPE_HEX_BINARY(){
        return getProp(S, String.class, "TYPE_HEX_BINARY");
    }

    public static final JsProp<String> TYPE_UNSIGNED_LONG(){
        return getProp(S, String.class, "TYPE_UNSIGNED_LONG");
    }

    public static final JsProp<String> TYPE_TEXT(){
        return getProp(S, String.class, "TYPE_TEXT");
    }

    public static final JsProp<String> TYPE_CUSTOM(){
        return getProp(S, String.class, "TYPE_CUSTOM");
    }

    public JsFunc<String> getName(){
        return call(String.class, "getName");
    }

    public JsFunc<String> getType(){
        return call(String.class, "getType");
    }

    public JsFunc<Void> setName(String name){
        return call("setName").with(name);
    }

    public JsFunc<Void> setName(IValueBinding<String> name){
        return call("setName").with(name);
    }

    public JsFunc<Void> setType(String type){
        return call("setType").with(type);
    }

    public JsFunc<Void> setType(IValueBinding<String> type){
        return call("setType").with(type);
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
    
    public static JsTypeRef<ArgumentMetaDataJsr> prototype = new JsTypeRef<ArgumentMetaDataJsr>(S);
}