/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.RestoreDTO') //< public
.needs('org.eclipse.vjet.vjo.java.lang.Long')
.satisfies('java.io.Serializable')
.protos({
    backupId:null, //< private Long
    //> public constructs()
    //> public constructs(Long backupId)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_RestoreDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_RestoreDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_RestoreDTO_ovld()
    constructs_0_0_RestoreDTO_ovld:function(){
    },
    //> protected constructs_1_0_RestoreDTO_ovld(Long backupId)
    constructs_1_0_RestoreDTO_ovld:function(backupId){
        this.backupId=backupId;
    },
    //> public Long getBackupId()
    getBackupId:function(){
        return this.backupId;
    },
    //> public void setBackupId(Long backupId)
    setBackupId:function(backupId){
        this.backupId=backupId;
    }
})
.endType();