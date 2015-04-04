/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.GetParameterValuesResponseDTO') //< public
//> needs hdm.functions.types.struct.ParameterValueStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    parameterList:null, //< private ParameterValueStructDTO[]
    //> public ParameterValueStructDTO[] getParameterList()
    getParameterList:function(){
        return this.parameterList;
    },
    //> public void setParameterList(ParameterValueStructDTO[] parameterList)
    setParameterList:function(parameterList){
        this.parameterList=parameterList;
    }
})
.endType();