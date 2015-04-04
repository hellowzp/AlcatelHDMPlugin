/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.GetParameterAttributesDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    parameterNames:null, //< private String[]
    //> public constructs()
    //> public constructs(String[] parameterNames)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_GetParameterAttributesDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_GetParameterAttributesDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_GetParameterAttributesDTO_ovld()
    constructs_0_0_GetParameterAttributesDTO_ovld:function(){
    },
    //> protected constructs_1_0_GetParameterAttributesDTO_ovld(String[] parameterNames)
    constructs_1_0_GetParameterAttributesDTO_ovld:function(parameterNames){
        this.parameterNames=parameterNames;
    },
    //> public String[] getParameterNames()
    getParameterNames:function(){
        return this.parameterNames;
    },
    //> public void setParameterNames(String[] parameterNames)
    setParameterNames:function(parameterNames){
        this.parameterNames=parameterNames;
    }
})
.endType();