/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.DeviceTypeMetaData') //< public
.protos({
    OUI:null, //< String
    productClass:null, //< String
    //> public constructs()
    //> public constructs(String OUI,String productClass)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_DeviceTypeMetaData_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_DeviceTypeMetaData_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_0_0_DeviceTypeMetaData_ovld()
    constructs_0_0_DeviceTypeMetaData_ovld:function(){
    },
    //> protected constructs_2_0_DeviceTypeMetaData_ovld(String OUI,String productClass)
    constructs_2_0_DeviceTypeMetaData_ovld:function(OUI,productClass){
        this.OUI=OUI;
        this.productClass=productClass;
    },
    //> public String getOUI()
    getOUI:function(){
        return this.OUI;
    },
    //> public void setOUI(String OUI)
    setOUI:function(OUI){
        this.OUI=OUI;
    },
    //> public String getProductClass()
    getProductClass:function(){
        return this.productClass;
    },
    //> public void setProductClass(String productClass)
    setProductClass:function(productClass){
        this.productClass=productClass;
    }
})
.endType();