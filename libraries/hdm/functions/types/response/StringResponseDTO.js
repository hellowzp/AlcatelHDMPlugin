/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.StringResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    value:null, //< private String
    //> public constructs()
    //> public constructs(String value)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_StringResponseDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_StringResponseDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_StringResponseDTO_ovld()
    constructs_0_0_StringResponseDTO_ovld:function(){
    },
    //> protected constructs_1_0_StringResponseDTO_ovld(String value)
    constructs_1_0_StringResponseDTO_ovld:function(value){
        this.setValue(value);
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