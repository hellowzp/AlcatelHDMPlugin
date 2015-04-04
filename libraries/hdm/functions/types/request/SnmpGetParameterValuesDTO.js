/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.SnmpGetParameterValuesDTO') //< public
//> needs hdm.functions.types.struct.SnmpGetParameterStructDTO
.satisfies('java.io.Serializable')
.protos({
    snmpGetParameterStructs:null, //< private SnmpGetParameterStructDTO[]
    //> public SnmpGetParameterStructDTO[] getSnmpGetParameterStructs()
    getSnmpGetParameterStructs:function(){
        return this.snmpGetParameterStructs;
    },
    //> public void setSnmpGetParameterStructs(SnmpGetParameterStructDTO[] snmpGetParameterStructs)
    setSnmpGetParameterStructs:function(snmpGetParameterStructs){
        this.snmpGetParameterStructs=snmpGetParameterStructs;
    }
})
.endType();