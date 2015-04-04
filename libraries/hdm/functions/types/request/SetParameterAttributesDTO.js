/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.SetParameterAttributesDTO') //< public
//> needs hdm.functions.types.struct.SetParameterAttributesStructDTO
.satisfies('java.io.Serializable')
.protos({
    parameterList:null, //< private SetParameterAttributesStructDTO[]
    //> public constructs()
    //> public constructs(SetParameterAttributesStructDTO[] parameterList)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_SetParameterAttributesDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_SetParameterAttributesDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_SetParameterAttributesDTO_ovld()
    constructs_0_0_SetParameterAttributesDTO_ovld:function(){
    },
    //> protected constructs_1_0_SetParameterAttributesDTO_ovld(SetParameterAttributesStructDTO[] parameterList)
    constructs_1_0_SetParameterAttributesDTO_ovld:function(parameterList){
        this.parameterList=parameterList;
    },
    //> public SetParameterAttributesStructDTO[] getParameterList()
    getParameterList:function(){
        return this.parameterList;
    },
    //> public void setParameterList(SetParameterAttributesStructDTO[] parameterList)
    setParameterList:function(parameterList){
        this.parameterList=parameterList;
    }
})
.endType();