/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.commons.action.Action') //< public abstract
//> needs org.eclipse.vjet.vjo.java.lang.Long,org.eclipse.vjet.vjo.java.util.Map,hdm.functions.types.response.GetOptionsResponseDTO
.protos({
    //> public abstract Long getId()
    getId:function(){
    },
    //> public abstract hdm.commons.PrimitiveDataEvent[] getPrimitiveDataEvents()
    getPrimitiveDataEvents:function(){
    },
    //> public abstract void addPrimitiveDataEvents(hdm.commons.PrimitiveDataEvent[] paramArrayOfPrimitiveDataEvent)
    addPrimitiveDataEvents:function(paramArrayOfPrimitiveDataEvent){
    },
    //> public abstract void addPrimitiveOptionEvents(GetOptionsResponseDTO[] paramArrayOfGetOptionsResponseDTO)
    addPrimitiveOptionEvents:function(paramArrayOfGetOptionsResponseDTO){
    },
    //> public abstract GetOptionsResponseDTO[] getPrimitiveOptionEvents()
    getPrimitiveOptionEvents:function(){
    },
    //> public abstract String getPrimitiveFunctionName()
    getPrimitiveFunctionName:function(){
    },
    //> public abstract int getPrimitiveFunctionState()
    getPrimitiveFunctionState:function(){
    },
    //> public abstract void setPrimitiveFunctionState(int paramInt)
    setPrimitiveFunctionState:function(paramInt){
    },
    //> public abstract String getIrptHandlerSymbol()
    getIrptHandlerSymbol:function(){
    },
    //> public abstract Map getPrimitiveContextMap()
    getPrimitiveContextMap:function(){
    },
    //> public abstract Map getCustomContextMap()
    getCustomContextMap:function(){
    },
    //> public abstract Object[] getPrimitiveFunctionParameters()
    getPrimitiveFunctionParameters:function(){
    },
    //> public abstract hdm.commons.DeviceID getDeviceId()
    getDeviceId:function(){
    },
    //> public abstract void setPrimitiveFunctionName(String paramString)
    setPrimitiveFunctionName:function(paramString){
    },
    //> public abstract void setPrimitiveFunctionParameters(org.eclipse.vjet.dsf.jsnative.global.Object[] paramArrayOfObject)
    setPrimitiveFunctionParameters:function(paramArrayOfObject){
    },
    //> public abstract void setIrptHandlerSymbol(String paramString)
    setIrptHandlerSymbol:function(paramString){
    },
    //> public abstract Long getCallerId()
    getCallerId:function(){
    }
})
.endType();