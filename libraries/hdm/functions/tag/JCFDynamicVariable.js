/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.tag.JCFDynamicVariable') //< public
.needs('vjo.java.lang.ObjectUtil')
.needs('org.eclipse.vjet.vjo.java.lang.BooleanUtil','')
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:-1049923120589137887, //< private final long
    HASH_PRIME:1000003, //< private final int
    SENSITIVE_VALUE:"*" //< public final String
})
.protos({
    name:null, //< private String
    value:null, //< private String
    sensitive:null, //< private Boolean
    encrypt:null, //< private Boolean
    //> public constructs()
    //> public constructs(String name,String value)
    //> public constructs(String name,String value,Boolean sensitive,Boolean encrypt)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_JCFDynamicVariable_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_JCFDynamicVariable_ovld(arguments[0],arguments[1]);
        }else if(arguments.length===4){
            this.constructs_4_0_JCFDynamicVariable_ovld(arguments[0],arguments[1],arguments[2],arguments[3]);
        }
    },
    //> protected constructs_0_0_JCFDynamicVariable_ovld()
    constructs_0_0_JCFDynamicVariable_ovld:function(){
    },
    //> protected constructs_2_0_JCFDynamicVariable_ovld(String name,String value)
    constructs_2_0_JCFDynamicVariable_ovld:function(name,value){
        this.name=name;
        this.value=value;
        this.sensitive=org.eclipse.vjet.vjo.java.lang.BooleanUtil.FALSE;
        this.encrypt=org.eclipse.vjet.vjo.java.lang.BooleanUtil.FALSE;
    },
    //> protected constructs_4_0_JCFDynamicVariable_ovld(String name,String value,Boolean sensitive,Boolean encrypt)
    constructs_4_0_JCFDynamicVariable_ovld:function(name,value,sensitive,encrypt){
        this.name=name;
        this.value=value;
        this.sensitive=sensitive;
        this.encrypt=encrypt;
    },
    //> public String getName()
    getName:function(){
        return this.name;
    },
    //> public void setName(String name)
    setName:function(name){
        this.name=name;
    },
    //> public String getValue()
    getValue:function(){
        return this.value;
    },
    //> public void setValue(String value)
    setValue:function(value){
        this.value=value;
    },
    //> public Boolean isSensitive()
    isSensitive:function(){
        return this.sensitive;
    },
    //> public void setSensitive(Boolean sensitive)
    setSensitive:function(sensitive){
        this.sensitive=sensitive;
    },
    //> public Boolean isEncrypt()
    isEncrypt:function(){
        return this.encrypt;
    },
    //> public void setEncrypt(Boolean encrypted)
    setEncrypt:function(encrypted){
        this.encrypt=encrypted;
    },
    //> public boolean equals(Object obj)
    equals:function(obj){
        if(obj===null){
            return false;
        }
        if(!(hdm.functions.tag.JCFDynamicVariable.isInstance(obj))){
            return false;
        }
        var dv=obj; //<<JCFDynamicVariable
        if((dv.getName()===null?dv.getName()===this.name:vjo.java.lang.ObjectUtil.equals(dv.getName(),this.name))&&(dv.getValue()===null?dv.getValue()===this.value:vjo.java.lang.ObjectUtil.equals(dv.getValue(),this.value))&&(dv.isEncrypt()===null?dv.isEncrypt()===this.encrypt:vjo.java.lang.ObjectUtil.equals(dv.isEncrypt(),this.encrypt))&&(dv.isSensitive()===null?dv.isSensitive()===this.sensitive:vjo.java.lang.ObjectUtil.equals(dv.isSensitive(),this.sensitive))){
            return true;
        }
        return false;
    },
    //> public int hashCode()
    hashCode:function(){
        var result=0; //<int
        result=1000003*result+vjo.java.lang.ObjectUtil.hashCode(this.name);
        result=1000003*result+(this.encrypt===null?1:vjo.java.lang.ObjectUtil.hashCode(this.encrypt));
        result=1000003*result+(this.sensitive===null?17:vjo.java.lang.ObjectUtil.hashCode(this.sensitive));
        result=1000003*result+(this.value===null?71:vjo.java.lang.ObjectUtil.hashCode(this.value));
        return result;
    }
})
.endType();