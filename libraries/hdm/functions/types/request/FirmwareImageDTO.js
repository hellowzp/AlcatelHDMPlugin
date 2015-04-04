/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.FirmwareImageDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    firmwareImageName:null, //< private String
    //> public constructs()
    //> public constructs(String firmwareImageName)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_FirmwareImageDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_FirmwareImageDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_FirmwareImageDTO_ovld()
    constructs_0_0_FirmwareImageDTO_ovld:function(){
    },
    //> protected constructs_1_0_FirmwareImageDTO_ovld(String firmwareImageName)
    constructs_1_0_FirmwareImageDTO_ovld:function(firmwareImageName){
        this.firmwareImageName=firmwareImageName;
    },
    //> public String getFirmwareImageName()
    getFirmwareImageName:function(){
        return this.firmwareImageName;
    },
    //> public void setFirmwareImageName(String firmwareImageName)
    setFirmwareImageName:function(firmwareImageName){
        this.firmwareImageName=firmwareImageName;
    }
})
.endType();