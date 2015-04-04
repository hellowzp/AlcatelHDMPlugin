/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.DeleteObjectResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    status:0, //< private int
    //> public int getStatus()
    getStatus:function(){
        return this.status;
    },
    //> public void setStatus(int status)
    setStatus:function(status){
        this.status=status;
    }
})
.endType();