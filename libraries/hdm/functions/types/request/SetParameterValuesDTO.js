/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.SetParameterValuesDTO') //< public
//> needs hdm.functions.types.struct.ParameterValueStructDTO
.satisfies('java.io.Serializable')
.props({
    TR69_TYPE_INT:"int", //< public final String
    TR69_TYPE_LONG:"long", //< public final String
    TR69_TYPE_UNSIGNED_INT:"unsignedInt", //< public final String
    TR69_TYPE_STRING:"string", //< public final String
    TR69_TYPE_DATETIME:"dateTime", //< public final String
    TR69_TYPE_BOOLEAN:"boolean", //< public final String
    TR69_TYPE_BASE64:"base64", //< public final String
    TR69_TYPE_UNSIGNED_LONG:"unsignedLong", //< public final String
    TR69_TYPE_HEX_BINARY:"hexBinary" //< public final String
})
.protos({
    parameterValueStructs:null, //< private ParameterValueStructDTO[]
    parameterKey:null, //< private String
    //> public constructs()
    //> public constructs(ParameterValueStructDTO[] parameterValueStructs,String parameterKey)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_SetParameterValuesDTO_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_SetParameterValuesDTO_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_0_0_SetParameterValuesDTO_ovld()
    constructs_0_0_SetParameterValuesDTO_ovld:function(){
    },
    //> protected constructs_2_0_SetParameterValuesDTO_ovld(ParameterValueStructDTO[] parameterValueStructs,String parameterKey)
    constructs_2_0_SetParameterValuesDTO_ovld:function(parameterValueStructs,parameterKey){
        this.parameterValueStructs=parameterValueStructs;
        this.parameterKey=parameterKey;
    },
    //> public ParameterValueStructDTO[] getParameterValueStructs()
    getParameterValueStructs:function(){
        return this.parameterValueStructs;
    },
    //> public void setParameterValueStructs(ParameterValueStructDTO[] parameterValueStructs)
    setParameterValueStructs:function(parameterValueStructs){
        this.parameterValueStructs=parameterValueStructs;
    },
    //> public String getParameterKey()
    getParameterKey:function(){
        return this.parameterKey;
    },
    //> public void setParameterKey(String parameterKey)
    setParameterKey:function(parameterKey){
        this.parameterKey=parameterKey;
    }
})
.endType();