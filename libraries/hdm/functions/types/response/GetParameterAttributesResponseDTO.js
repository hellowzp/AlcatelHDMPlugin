/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.GetParameterAttributesResponseDTO') //< public
//> needs hdm.functions.types.struct.ParameterAttributeStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    parameterList:null, //< private ParameterAttributeStructDTO[]
    //> public ParameterAttributeStructDTO[] getParameterList()
    getParameterList:function(){
        return this.parameterList;
    },
    //> public void setParameterList(ParameterAttributeStructDTO[] parameterList)
    setParameterList:function(parameterList){
        this.parameterList=parameterList;
    }
})
.endType();