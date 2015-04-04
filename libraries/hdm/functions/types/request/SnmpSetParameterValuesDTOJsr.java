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
import hdm.functions.types.struct.SnmpParameterValueStructDTOJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class SnmpSetParameterValuesDTOJsr extends JsObj implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("hdm.functions.types.request.SnmpSetParameterValuesDTO", SnmpSetParameterValuesDTOJsr.class, "SnmpSetParameterValuesDTO", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(java.io.Serializable.ResourceSpec.getInstance());

    public SnmpSetParameterValuesDTOJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected SnmpSetParameterValuesDTOJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public static final JsProp<String> SNMP_TYPE_COUNTER_32(){
        return getProp(S, String.class, "SNMP_TYPE_COUNTER_32");
    }

    public static final JsProp<String> SNMP_TYPE_COUNTER_64(){
        return getProp(S, String.class, "SNMP_TYPE_COUNTER_64");
    }

    public static final JsProp<String> SNMP_TYPE_INTEGER_32(){
        return getProp(S, String.class, "SNMP_TYPE_INTEGER_32");
    }

    public static final JsProp<String> SNMP_TYPE_ENUMERATED_INTEGER_32(){
        return getProp(S, String.class, "SNMP_TYPE_ENUMERATED_INTEGER_32");
    }

    public static final JsProp<String> SNMP_TYPE_UNSIGNED_INTEGER_32(){
        return getProp(S, String.class, "SNMP_TYPE_UNSIGNED_INTEGER_32");
    }

    public static final JsProp<String> SNMP_TYPE_OPAQUE(){
        return getProp(S, String.class, "SNMP_TYPE_OPAQUE");
    }

    public static final JsProp<String> SNMP_TYPE_OID(){
        return getProp(S, String.class, "SNMP_TYPE_OID");
    }

    public static final JsProp<String> SNMP_TYPE_GAUGE_32(){
        return getProp(S, String.class, "SNMP_TYPE_GAUGE_32");
    }

    public static final JsProp<String> SNMP_TYPE_TIME_TICKS(){
        return getProp(S, String.class, "SNMP_TYPE_TIME_TICKS");
    }

    public static final JsProp<String> SNMP_TYPE_OCTET_STRING(){
        return getProp(S, String.class, "SNMP_TYPE_OCTET_STRING");
    }

    public static final JsProp<String> SNMP_TYPE_IP_ADDRESS(){
        return getProp(S, String.class, "SNMP_TYPE_IP_ADDRESS");
    }

    public static final JsProp<String> SNMP_TYPE_GENERIC_ADDRESS(){
        return getProp(S, String.class, "SNMP_TYPE_GENERIC_ADDRESS");
    }

    public JsFunc<SnmpParameterValueStructDTOJsr[]> getParameterValueStructs(){
        return call(SnmpParameterValueStructDTOJsr[].class, "getParameterValueStructs");
    }

    public JsFunc<Void> setParameterValueStructs(SnmpParameterValueStructDTOJsr[] parameterValueStructs){
        return call("setParameterValueStructs").with(wrap(parameterValueStructs));
    }

    public JsFunc<Void> setParameterValueStructs(IValueBinding<SnmpParameterValueStructDTOJsr[]> parameterValueStructs){
        return call("setParameterValueStructs").with(parameterValueStructs);
    }
    
    public static JsTypeRef<SnmpSetParameterValuesDTOJsr> prototype = new JsTypeRef<SnmpSetParameterValuesDTOJsr>(S);
}