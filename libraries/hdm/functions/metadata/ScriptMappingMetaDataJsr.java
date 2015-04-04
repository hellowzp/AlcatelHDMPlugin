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
import hdm.functions.metadata.DeviceTypeMetaDataJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class ScriptMappingMetaDataJsr extends JsObj {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.metadata.ScriptMappingMetaData", ScriptMappingMetaDataJsr.class, "ScriptMappingMetaData", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(DeviceTypeMetaDataJsr.ResourceSpec.getInstance());

    public ScriptMappingMetaDataJsr(){
        super(S.getJsCmpMeta(), true);
    }

    public ScriptMappingMetaDataJsr(DeviceTypeMetaDataJsr deviceType, String softwareVersion, String jsContentMappingName, boolean isDefault, int order, String dataModelType){
        super(S.getJsCmpMeta(), true, deviceType, softwareVersion, jsContentMappingName, isDefault, order, dataModelType);
    }

    public ScriptMappingMetaDataJsr(IValueBinding<? extends DeviceTypeMetaDataJsr> deviceType, IValueBinding<String> softwareVersion, IValueBinding<String> jsContentMappingName, IValueBinding<Boolean> isDefault, IValueBinding<Integer> order, IValueBinding<String> dataModelType){
        super(S.getJsCmpMeta(), true, deviceType, softwareVersion, jsContentMappingName, isDefault, order, dataModelType);
    }

    protected ScriptMappingMetaDataJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<? extends DeviceTypeMetaDataJsr> getDeviceType(){
        return call(DeviceTypeMetaDataJsr.class, "getDeviceType");
    }

    public JsFunc<Void> setDeviceType(DeviceTypeMetaDataJsr deviceType){
        return call("setDeviceType").with(deviceType);
    }

    public JsFunc<Void> setDeviceType(IValueBinding<? extends DeviceTypeMetaDataJsr> deviceType){
        return call("setDeviceType").with(deviceType);
    }

    public JsFunc<String> getSoftwareVersion(){
        return call(String.class, "getSoftwareVersion");
    }

    public JsFunc<Void> setSoftwareVersion(String softwareVersion){
        return call("setSoftwareVersion").with(softwareVersion);
    }

    public JsFunc<Void> setSoftwareVersion(IValueBinding<String> softwareVersion){
        return call("setSoftwareVersion").with(softwareVersion);
    }

    public JsFunc<String> getJsContentMappingName(){
        return call(String.class, "getJsContentMappingName");
    }

    public JsFunc<Void> setJsContentMappingName(String jsContentMappingName){
        return call("setJsContentMappingName").with(jsContentMappingName);
    }

    public JsFunc<Void> setJsContentMappingName(IValueBinding<String> jsContentMappingName){
        return call("setJsContentMappingName").with(jsContentMappingName);
    }

    public JsFunc<Boolean> isDefault(){
        return call(Boolean.class, "isDefault");
    }

    public JsFunc<Void> setDefault(boolean isDefault){
        return call("setDefault").with(isDefault);
    }

    public JsFunc<Void> setDefault(IValueBinding<Boolean> isDefault){
        return call("setDefault").with(check(isDefault));
    }

    public JsFunc<Integer> getOrder(){
        return call(Integer.class, "getOrder");
    }

    public JsFunc<Void> setOrder(int order){
        return call("setOrder").with(order);
    }

    public JsFunc<Void> setOrder(IValueBinding<Integer> order){
        return call("setOrder").with(order);
    }

    public JsFunc<String> getDataModelType(){
        return call(String.class, "getDataModelType");
    }

    public JsFunc<Void> setDataModelType(String dataModelType){
        return call("setDataModelType").with(dataModelType);
    }

    public JsFunc<Void> setDataModelType(IValueBinding<String> dataModelType){
        return call("setDataModelType").with(dataModelType);
    }
    
    public static JsTypeRef<ScriptMappingMetaDataJsr> prototype = new JsTypeRef<ScriptMappingMetaDataJsr>(S);
}