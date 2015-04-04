/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.CancelTransferDTO') //< public
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:105453344787034480 //< private final long
})
.protos({
    commandKey:null, //< private String
    policyID:null, //< private String
    //> public constructs()
    //> public constructs(String commandKey)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_CancelTransferDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_CancelTransferDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_CancelTransferDTO_ovld()
    constructs_0_0_CancelTransferDTO_ovld:function(){
    },
    //> protected constructs_1_0_CancelTransferDTO_ovld(String commandKey)
    constructs_1_0_CancelTransferDTO_ovld:function(commandKey){
        this.commandKey=commandKey;
    },
    //> public String getCommandKey()
    getCommandKey:function(){
        return this.commandKey;
    },
    //> public void setCommandKey(String commandKey)
    setCommandKey:function(commandKey){
        this.commandKey=commandKey;
    },
    //> public String getPolicyID()
    getPolicyID:function(){
        return this.policyID;
    },
    //> public void setPolicyID(String policyID)
    setPolicyID:function(policyID){
        this.policyID=policyID;
    }
})
.endType();