/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.BackupResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    backupId:0, //< private long
    //> public long getBackupId()
    getBackupId:function(){
        return this.backupId;
    },
    //> public void setBackupId(long backupId)
    setBackupId:function(backupId){
        this.backupId=backupId;
    }
})
.endType();