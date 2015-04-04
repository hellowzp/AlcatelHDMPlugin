/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.DownloadResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    status:0, //< private int
    startTimeUTC:null, //< private String
    completeTimeUTC:null, //< private String
    //> public String getCompleteTimeUTC()
    getCompleteTimeUTC:function(){
        return this.completeTimeUTC;
    },
    //> public void setCompleteTimeUTC(String completeTimeUTC)
    setCompleteTimeUTC:function(completeTimeUTC){
        this.completeTimeUTC=completeTimeUTC;
    },
    //> public String getStartTimeUTC()
    getStartTimeUTC:function(){
        return this.startTimeUTC;
    },
    //> public void setStartTimeUTC(String startTimeUTC)
    setStartTimeUTC:function(startTimeUTC){
        this.startTimeUTC=startTimeUTC;
    },
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