/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.AddObjectResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    instanceNumber:0, //< private long
    status:0, //< private int
    label:null, //< private String
    //> public long getInstanceNumber()
    getInstanceNumber:function(){
        return this.instanceNumber;
    },
    //> public void setInstanceNumber(long instanceNumber)
    setInstanceNumber:function(instanceNumber){
        this.instanceNumber=instanceNumber;
    },
    //> public int getStatus()
    getStatus:function(){
        return this.status;
    },
    //> public void setStatus(int status)
    setStatus:function(status){
        this.status=status;
    },
    //> public String getLabel()
    getLabel:function(){
        return this.label;
    },
    //> public void setLabel(String label)
    setLabel:function(label){
        this.label=label;
    }
})
.endType();