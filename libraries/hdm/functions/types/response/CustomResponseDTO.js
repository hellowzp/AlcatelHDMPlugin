/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.CustomResponseDTO') //< public
//> needs hdm.functions.types.response.KeyValueResponseDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    responseDTOList:null, //< private KeyValueResponseDTO[]
    //> public constructs()
    //> public constructs(KeyValueResponseDTO[] responseDTOList)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_CustomResponseDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_CustomResponseDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_CustomResponseDTO_ovld()
    constructs_0_0_CustomResponseDTO_ovld:function(){
    },
    //> protected constructs_1_0_CustomResponseDTO_ovld(KeyValueResponseDTO[] responseDTOList)
    constructs_1_0_CustomResponseDTO_ovld:function(responseDTOList){
        this.setResponseDTOList(responseDTOList);
    },
    //> public KeyValueResponseDTO[] getResponseDTOList()
    getResponseDTOList:function(){
        return this.responseDTOList;
    },
    //> public void setResponseDTOList(KeyValueResponseDTO[] responseDTOList)
    setResponseDTOList:function(responseDTOList){
        this.responseDTOList=responseDTOList;
    }
})
.endType();