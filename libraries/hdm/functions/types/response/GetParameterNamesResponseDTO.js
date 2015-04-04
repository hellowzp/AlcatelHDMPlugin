/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.GetParameterNamesResponseDTO') //< public
//> needs hdm.functions.types.struct.ParameterInfoStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    parameterList:null, //< private ParameterInfoStructDTO[]
    //> public ParameterInfoStructDTO[] getParameterList()
    getParameterList:function(){
        return this.parameterList;
    },
    //> public void setParameterList(ParameterInfoStructDTO[] parameterList)
    setParameterList:function(parameterList){
        this.parameterList=parameterList;
    }
})
.endType();