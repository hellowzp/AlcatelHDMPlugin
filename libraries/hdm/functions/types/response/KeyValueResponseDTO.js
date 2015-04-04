/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.KeyValueResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    key:null, //< private String
    value:null, //< private String
    //> public String getKey()
    getKey:function(){
        return this.key;
    },
    //> public void setKey(String key)
    setKey:function(key){
        this.key=key;
    },
    //> public String getValue()
    getValue:function(){
        return this.value;
    },
    //> public void setValue(String value)
    setValue:function(value){
        this.value=value;
    }
})
.endType();