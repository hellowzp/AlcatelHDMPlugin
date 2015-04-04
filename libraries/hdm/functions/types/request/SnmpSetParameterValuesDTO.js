/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.SnmpSetParameterValuesDTO') //< public
//> needs hdm.functions.types.struct.SnmpParameterValueStructDTO
.satisfies('java.io.Serializable')
.props({
    SNMP_TYPE_COUNTER_32:"counter32", //< public final String
    SNMP_TYPE_COUNTER_64:"counter64", //< public final String
    SNMP_TYPE_INTEGER_32:"integer32", //< public final String
    SNMP_TYPE_ENUMERATED_INTEGER_32:"enumeratedInteger32", //< public final String
    SNMP_TYPE_UNSIGNED_INTEGER_32:"unsignedInteger32", //< public final String
    SNMP_TYPE_OPAQUE:"opaque", //< public final String
    SNMP_TYPE_OID:"oid", //< public final String
    SNMP_TYPE_GAUGE_32:"gauge32", //< public final String
    SNMP_TYPE_TIME_TICKS:"timeTicks", //< public final String
    SNMP_TYPE_OCTET_STRING:"octetString", //< public final String
    SNMP_TYPE_IP_ADDRESS:"ipAddress", //< public final String
    SNMP_TYPE_GENERIC_ADDRESS:"genericAddress" //< public final String
})
.protos({
    parameterValueStructs:null, //< private SnmpParameterValueStructDTO[]
    //> public SnmpParameterValueStructDTO[] getParameterValueStructs()
    getParameterValueStructs:function(){
        return this.parameterValueStructs;
    },
    //> public void setParameterValueStructs(SnmpParameterValueStructDTO[] parameterValueStructs)
    setParameterValueStructs:function(parameterValueStructs){
        this.parameterValueStructs=parameterValueStructs;
    }
})
.endType();