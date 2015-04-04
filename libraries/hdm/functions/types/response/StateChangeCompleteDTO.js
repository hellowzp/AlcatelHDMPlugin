/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.StateChangeCompleteDTO') //< public
//> needs hdm.functions.types.struct.ResultStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    commandKey:null, //< private String
    resultStructDTO:null, //< private ResultStructDTO[]
    //> public String getCommandKey()
    getCommandKey:function(){
        return this.commandKey;
    },
    //> public void setCommandKey(String commandKey)
    setCommandKey:function(commandKey){
        this.commandKey=commandKey;
    },
    //> public ResultStructDTO[] getResultStructDTO()
    getResultStructDTO:function(){
        return this.resultStructDTO;
    },
    //> public void setResultStructDTO(ResultStructDTO[] resultStructDTO)
    setResultStructDTO:function(resultStructDTO){
        this.resultStructDTO=resultStructDTO;
    }
})
.endType();