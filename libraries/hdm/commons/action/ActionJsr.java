package hdm.commons.action;

import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.dsf.common.binding.IValueBinding;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import org.eclipse.vjet.vjo.java.lang.LongJsr;
import hdm.functions.types.response.GetOptionsResponseDTOJsr;
import org.eclipse.vjet.vjo.java.util.MapJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public interface ActionJsr {
    JsObjData S = 
        new JsObjData("hdm.commons.action.Action", ActionJsr.class, "Action", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec();

    public abstract JsFunc<? extends LongJsr> getId();

    public abstract JsFunc<hdm.commons.PrimitiveDataEvent[]> getPrimitiveDataEvents();

    public abstract JsFunc<Void> addPrimitiveDataEvents(hdm.commons.PrimitiveDataEvent[] paramArrayOfPrimitiveDataEvent);

    public abstract JsFunc<Void> addPrimitiveDataEvents(IValueBinding<hdm.commons.PrimitiveDataEvent[]> paramArrayOfPrimitiveDataEvent);

    public abstract JsFunc<Void> addPrimitiveOptionEvents(GetOptionsResponseDTOJsr[] paramArrayOfGetOptionsResponseDTO);

    public abstract JsFunc<Void> addPrimitiveOptionEvents(IValueBinding<GetOptionsResponseDTOJsr[]> paramArrayOfGetOptionsResponseDTO);

    public abstract JsFunc<GetOptionsResponseDTOJsr[]> getPrimitiveOptionEvents();

    public abstract JsFunc<String> getPrimitiveFunctionName();

    public abstract JsFunc<Integer> getPrimitiveFunctionState();

    public abstract JsFunc<Void> setPrimitiveFunctionState(int paramInt);

    public abstract JsFunc<Void> setPrimitiveFunctionState(IValueBinding<Integer> paramInt);

    public abstract JsFunc<String> getIrptHandlerSymbol();

    public abstract JsFunc<? extends MapJsr> getPrimitiveContextMap();

    public abstract JsFunc<? extends MapJsr> getCustomContextMap();

    public abstract JsFunc<Object[]> getPrimitiveFunctionParameters();

    public abstract JsFunc<? extends hdm.commons.DeviceID> getDeviceId();

    public abstract JsFunc<Void> setPrimitiveFunctionName(String paramString);

    public abstract JsFunc<Void> setPrimitiveFunctionName(IValueBinding<String> paramString);

    public abstract JsFunc<Void> setPrimitiveFunctionParameters(Object[] paramArrayOfObject);

    public abstract JsFunc<Void> setIrptHandlerSymbol(String paramString);

    public abstract JsFunc<Void> setIrptHandlerSymbol(IValueBinding<String> paramString);

    public abstract JsFunc<? extends LongJsr> getCallerId();
    
    public static JsTypeRef<ActionJsr> prototype = new JsTypeRef<ActionJsr>(S);
}