/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.CancelTransferResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    commandKey:null, //< private String
    //> public constructs()
    //> public constructs(String commandKey)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_CancelTransferResponseDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_CancelTransferResponseDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_CancelTransferResponseDTO_ovld()
    constructs_0_0_CancelTransferResponseDTO_ovld:function(){
    },
    //> protected constructs_1_0_CancelTransferResponseDTO_ovld(String commandKey)
    constructs_1_0_CancelTransferResponseDTO_ovld:function(commandKey){
        this.commandKey=commandKey;
    },
    //> public String getCommandKey()
    getCommandKey:function(){
        return this.commandKey;
    },
    //> public void setCommandKey(String commandKey)
    setCommandKey:function(commandKey){
        this.commandKey=commandKey;
    }
})
.endType();