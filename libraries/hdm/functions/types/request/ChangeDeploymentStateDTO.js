/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.ChangeDeploymentStateDTO') //< public
//> needs hdm.functions.types.struct.OperationStructDTO
.satisfies('java.io.Serializable')
.protos({
    operations:null, //< private OperationStructDTO[]
    //> public OperationStructDTO[] getOperations()
    getOperations:function(){
        return this.operations;
    },
    //> public void setOperations(OperationStructDTO[] operations)
    setOperations:function(operations){
        this.operations=operations;
    }
})
.endType();