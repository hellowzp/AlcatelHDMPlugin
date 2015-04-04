/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.DeleteObjectDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    objectName:null, //< private String
    parameterKey:null, //< private String
    //> public constructs()
    //> public constructs(String objectName,String parameterKey)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_DeleteObjectDTO_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_DeleteObjectDTO_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_0_0_DeleteObjectDTO_ovld()
    constructs_0_0_DeleteObjectDTO_ovld:function(){
    },
    //> protected constructs_2_0_DeleteObjectDTO_ovld(String objectName,String parameterKey)
    constructs_2_0_DeleteObjectDTO_ovld:function(objectName,parameterKey){
        this.objectName=objectName;
        this.parameterKey=parameterKey;
    },
    //> public String getObjectName()
    getObjectName:function(){
        return this.objectName;
    },
    //> public void setObjectName(String objectName)
    setObjectName:function(objectName){
        this.objectName=objectName;
    },
    //> public String getParameterKey()
    getParameterKey:function(){
        return this.parameterKey;
    },
    //> public void setParameterKey(String parameterKey)
    setParameterKey:function(parameterKey){
        this.parameterKey=parameterKey;
    }
})
.endType();