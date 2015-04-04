/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.SnmpGetParameterValuesResponseDTO') //< public
//> needs hdm.functions.types.struct.SnmpGetParameterStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    parameterList:null, //< private SnmpGetParameterStructDTO[]
    //> public SnmpGetParameterStructDTO[] getParameterList()
    getParameterList:function(){
        return this.parameterList;
    },
    //> public void setParameterList(SnmpGetParameterStructDTO[] parameterList)
    setParameterList:function(parameterList){
        this.parameterList=parameterList;
    }
})
.endType();