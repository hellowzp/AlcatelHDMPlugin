/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.GetOptionsResponseDTO') //< public
//> needs hdm.functions.types.struct.OptionStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    requestedOptionName:null, //< private String
    optionList:null, //< private OptionStructDTO[]
    //> public OptionStructDTO[] getOptionList()
    getOptionList:function(){
        return this.optionList;
    },
    //> public void setOptionList(OptionStructDTO[] optionList)
    setOptionList:function(optionList){
        this.optionList=optionList;
    },
    //> public String getRequestedOptionName()
    getRequestedOptionName:function(){
        return this.requestedOptionName;
    },
    //> public void setRequestedOptionName(String requestedOptionName)
    setRequestedOptionName:function(requestedOptionName){
        this.requestedOptionName=requestedOptionName;
    }
})
.endType();