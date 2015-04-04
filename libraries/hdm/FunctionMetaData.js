/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.FunctionMetaData') //< public
//> needs hdm.functions.metadata.ArgumentMetaData,hdm.functions.metadata.ScriptMappingMetaData
.satisfies('java.io.Serializable')
.protos({
    deviceTypeBound:false, //< private boolean
    nameKey:null, //< private String
    description:null, //< private String
    functionCode:0, //< private int
    argumentMetaDatas:null, //< private ArgumentMetaData[]
    scriptMappings:null, //< private ScriptMappingMetaData[]
    //> public ScriptMappingMetaData[] getScriptMappings()
    getScriptMappings:function(){
        return this.scriptMappings;
    },
    //> public void setScriptMappings(ScriptMappingMetaData[] scriptMappings)
    setScriptMappings:function(scriptMappings){
        this.scriptMappings=scriptMappings;
    },
    //> public ArgumentMetaData[] getArgumentMetaDatas()
    getArgumentMetaDatas:function(){
        return this.argumentMetaDatas;
    },
    //> public void setArgumentMetaDatas(ArgumentMetaData[] argumentMetaDatas)
    setArgumentMetaDatas:function(argumentMetaDatas){
        this.argumentMetaDatas=argumentMetaDatas;
    },
    //> public String getDescription()
    getDescription:function(){
        return this.description;
    },
    //> public void setDescription(String description)
    setDescription:function(description){
        this.description=description;
    },
    //> public String getNameKey()
    getNameKey:function(){
        return this.nameKey;
    },
    //> public void setNameKey(String nameKey)
    setNameKey:function(nameKey){
        this.nameKey=nameKey;
    },
    //> public int getFunctionCode()
    getFunctionCode:function(){
        return this.functionCode;
    },
    //> public void setFunctionCode(int functionCode)
    setFunctionCode:function(functionCode){
        this.functionCode=functionCode;
    },
    //> public boolean isDeviceTypeBound()
    isDeviceTypeBound:function(){
        return this.deviceTypeBound;
    },
    //> public void setDeviceTypeBound(boolean deviceTypeBound)
    setDeviceTypeBound:function(deviceTypeBound){
        this.deviceTypeBound=deviceTypeBound;
    }
})
.endType();