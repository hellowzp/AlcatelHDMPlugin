/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.GetParameterNamesDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    parameterPath:null, //< private String
    nextLevel:false, //< private boolean
    //> public constructs()
    //> public constructs(String parameterPath,boolean nextLevel)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_GetParameterNamesDTO_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_GetParameterNamesDTO_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_0_0_GetParameterNamesDTO_ovld()
    constructs_0_0_GetParameterNamesDTO_ovld:function(){
    },
    //> protected constructs_2_0_GetParameterNamesDTO_ovld(String parameterPath,boolean nextLevel)
    constructs_2_0_GetParameterNamesDTO_ovld:function(parameterPath,nextLevel){
        this.parameterPath=parameterPath;
        this.nextLevel=nextLevel;
    },
    //> public String getParameterPath()
    getParameterPath:function(){
        return this.parameterPath;
    },
    //> public void setParameterPath(String parameterPath)
    setParameterPath:function(parameterPath){
        this.parameterPath=parameterPath;
    },
    //> public boolean isNextLevel()
    isNextLevel:function(){
        return this.nextLevel;
    },
    //> public void setNextLevel(boolean nextLevel)
    setNextLevel:function(nextLevel){
        this.nextLevel=nextLevel;
    }
})
.endType();