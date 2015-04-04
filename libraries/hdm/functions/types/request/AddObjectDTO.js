/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.AddObjectDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    objectName:null, //< private String
    parameterKey:null, //< private String
    objectLabel:null, //< private String
    //> public constructs()
    //> public constructs(String objectName,String parameterKey)
    //> public constructs(String objectName,String parameterKey,String objectLabel)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_AddObjectDTO_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_AddObjectDTO_ovld(arguments[0],arguments[1]);
        }else if(arguments.length===3){
            this.constructs_3_0_AddObjectDTO_ovld(arguments[0],arguments[1],arguments[2]);
        }
    },
    //> protected constructs_0_0_AddObjectDTO_ovld()
    constructs_0_0_AddObjectDTO_ovld:function(){
    },
    //> protected constructs_2_0_AddObjectDTO_ovld(String objectName,String parameterKey)
    constructs_2_0_AddObjectDTO_ovld:function(objectName,parameterKey){
        this.objectName=objectName;
        this.parameterKey=parameterKey;
    },
    //> protected constructs_3_0_AddObjectDTO_ovld(String objectName,String parameterKey,String objectLabel)
    constructs_3_0_AddObjectDTO_ovld:function(objectName,parameterKey,objectLabel){
        this.objectName=objectName;
        this.parameterKey=parameterKey;
        this.objectLabel=objectLabel;
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
    },
    //> public String getObjectLabel()
    getObjectLabel:function(){
        return this.objectLabel;
    },
    //> public void setObjectLabel(String objectLabel)
    setObjectLabel:function(objectLabel){
        this.objectLabel=objectLabel;
    }
})
.endType();