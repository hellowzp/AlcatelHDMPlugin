/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.GetRPCMethodsResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    methodList:null, //< private String[]
    //> public String[] getMethodList()
    getMethodList:function(){
        return this.methodList;
    },
    //> public void setMethodList(String[] methodList)
    setMethodList:function(methodList){
        this.methodList=methodList;
    }
})
.endType();