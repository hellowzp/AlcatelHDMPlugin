/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.ArgumentMetaData') //< public abstract
.satisfies('java.io.Serializable')
.props({
    TYPE_ADD_OBJECT:"AddObjectDTO", //< public final String
    TYPE_DELETE_OBJECT:"DeleteObjectDTO", //< public final String
    TYPE_DOWNLOAD:"DownloadDTO", //< public final String
    TYPE_SCHEDULE_DOWNLOAD:"ScheduleDownloadDTO", //< public final String
    TYPE_FIRMWARE_UPDATE:"FirmwareUpdateDTO", //< public final String
    TYPE_GET_OPTIONS:"GetOptionsDTO", //< public final String
    TYPE_GET_PARAMETER_ATTRIBUTES:"GetParameterAttributesDTO", //< public final String
    TYPE_GET_PARAMETER_NAMES:"GetParameterNamesDTO", //< public final String
    TYPE_GET_PARAMETER_VALUES:"GetParameterValuesDTO", //< public final String
    TYPE_RESTORE:"RestoreDTO", //< public final String
    TYPE_SET_PARAMETER_ATTRIBUTES:"SetParameterAttributesDTO", //< public final String
    TYPE_SET_PARAMETER_VALUES:"SetParameterValuesDTO", //< public final String
    TYPE_SET_VOUCHERS:"SetVouchersDTO", //< public final String
    TYPE_UPLOAD:"UploadDTO", //< public final String
    TYPE_CHANGE_DEPLOYMENT_STATE:"ChangeDeploymentStateDTO", //< public final String
    TYPE_CANCEL_TRANSFER:"CancelTransferDTO", //< public final String
    TYPE_SNMP_SET_PARAMETER_VALUES:"SnmpSetParameterValuesDTO", //< public final String
    TYPE_SNMP_GET_PARAMETER_VALUES:"SnmpGetParameterValuesDTO", //< public final String
    TYPE_INTEGER:"integer", //< public final String
    TYPE_LONG:"long", //< public final String
    TYPE_STRING:"string", //< public final String
    TYPE_DATE:"date", //< public final String
    TYPE_BOOLEAN:"boolean", //< public final String
    TYPE_UNSIGNED_INTEGER:"unsignedInt", //< public final String
    TYPE_HEX_BINARY:"hexBinary", //< public final String
    TYPE_UNSIGNED_LONG:"unsignedLong", //< public final String
    TYPE_TEXT:"text", //< public final String
    TYPE_CUSTOM:"Custom" //< public final String
})
.protos({
    name:null, //< private String
    type:null, //< private String
    description:null, //< private String
    //> public String getName()
    getName:function(){
        return this.name;
    },
    //> public String getType()
    getType:function(){
        return this.type;
    },
    //> public void setName(String name)
    setName:function(name){
        this.name=name;
    },
    //> public void setType(String type)
    setType:function(type){
        this.type=type;
    },
    //> public String getDescription()
    getDescription:function(){
        return this.description;
    },
    //> public void setDescription(String description)
    setDescription:function(description){
        this.description=description;
    }
})
.endType();