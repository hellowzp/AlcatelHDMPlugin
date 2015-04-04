/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.ScriptMappingMetaData') //< public
.needs('hdm.functions.metadata.DeviceTypeMetaData')
.protos({
    deviceType:null, //< private DeviceTypeMetaData
    softwareVersion:null, //< private String
    jsContentMappingName:null, //< private String
    isDefault:false, //< private boolean
    order:0, //< private int
    dataModelType:null, //< private String
    //> public constructs()
    //> public constructs(DeviceTypeMetaData deviceType,String softwareVersion,String jsContentMappingName,boolean isDefault,int order,String dataModelType)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_ScriptMappingMetaData_ovld();
        }else if(arguments.length===6){
            this.constructs_6_0_ScriptMappingMetaData_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4],arguments[5]);
        }
    },
    //> protected constructs_0_0_ScriptMappingMetaData_ovld()
    constructs_0_0_ScriptMappingMetaData_ovld:function(){
    },
    //> protected constructs_6_0_ScriptMappingMetaData_ovld(DeviceTypeMetaData deviceType,String softwareVersion,String jsContentMappingName,boolean isDefault,int order,String dataModelType)
    constructs_6_0_ScriptMappingMetaData_ovld:function(deviceType,softwareVersion,jsContentMappingName,isDefault,order,dataModelType){
        this.deviceType=deviceType;
        this.softwareVersion=softwareVersion;
        this.jsContentMappingName=jsContentMappingName;
        this.isDefault=isDefault;
        this.order=order;
        this.dataModelType=dataModelType;
    },
    //> public DeviceTypeMetaData getDeviceType()
    getDeviceType:function(){
        return this.deviceType;
    },
    //> public void setDeviceType(DeviceTypeMetaData deviceType)
    setDeviceType:function(deviceType){
        this.deviceType=deviceType;
    },
    //> public String getSoftwareVersion()
    getSoftwareVersion:function(){
        return this.softwareVersion;
    },
    //> public void setSoftwareVersion(String softwareVersion)
    setSoftwareVersion:function(softwareVersion){
        this.softwareVersion=softwareVersion;
    },
    //> public String getJsContentMappingName()
    getJsContentMappingName:function(){
        return this.jsContentMappingName;
    },
    //> public void setJsContentMappingName(String jsContentMappingName)
    setJsContentMappingName:function(jsContentMappingName){
        this.jsContentMappingName=jsContentMappingName;
    },
    //> public boolean isDefault()
    isDefault:function(){
        return this.isDefault;
    },
    //> public void setDefault(boolean isDefault)
    setDefault:function(isDefault){
        this.isDefault=isDefault;
    },
    //> public int getOrder()
    getOrder:function(){
        return this.order;
    },
    //> public void setOrder(int order)
    setOrder:function(order){
        this.order=order;
    },
    //> public String getDataModelType()
    getDataModelType:function(){
        return this.dataModelType;
    },
    //> public void setDataModelType(String dataModelType)
    setDataModelType:function(dataModelType){
        this.dataModelType=dataModelType;
    }
})
.endType();