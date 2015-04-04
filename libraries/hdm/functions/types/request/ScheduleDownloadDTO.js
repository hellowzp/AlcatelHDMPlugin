/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.ScheduleDownloadDTO') //< public
.needs(['org.eclipse.vjet.vjo.java.util.Vector','org.eclipse.vjet.vjo.java.lang.IndexOutOfBoundsException',
    'hdm.functions.types.struct.TimeWindowStructDTO'])
.satisfies('java.io.Serializable')
.props({
    FIRMWARE_UPGRADE_IMAGE:"1 Firmware Upgrade Image", //< public final String
    WEB_CONTENT:"2 Web Content", //< public final String
    VENDOR_CONFIGURATION_FILE:"3 Vendor Configuration File", //< public final String
    TONE_FILE:"4 Tone File", //< public final String
    RINGER_FILE:"5 Ringer File" //< public final String
})
.protos({
    fileType:null, //< private String
    URL:null, //< private String
    username:null, //< private String
    password:null, //< private String
    filesize:0, //< private long
    targetFilename:null, //< private String
    timeWindowStructList:null, //< private Vector<TimeWindowStructDTO> timeWindowStructList
    //> public constructs()
    //> public constructs(String fileType,String url,String username,String password,int filesize,String targetFilename,Vector<TimeWindowStructDTO> timeWindowStructList)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_ScheduleDownloadDTO_ovld();
        }else if(arguments.length===7){
            this.constructs_7_0_ScheduleDownloadDTO_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4],arguments[5],arguments[6]);
        }
    },
    //> protected constructs_0_0_ScheduleDownloadDTO_ovld()
    constructs_0_0_ScheduleDownloadDTO_ovld:function(){
    },
    //> protected constructs_7_0_ScheduleDownloadDTO_ovld(String fileType,String url,String username,String password,int filesize,String targetFilename,Vector<TimeWindowStructDTO> timeWindowStructList)
    constructs_7_0_ScheduleDownloadDTO_ovld:function(fileType,url,username,password,filesize,targetFilename,timeWindowStructList){
        this.fileType=fileType;
        this.URL=url;
        this.username=username;
        this.password=password;
        this.filesize=filesize;
        this.targetFilename=targetFilename;
        this.timeWindowStructList=timeWindowStructList;
    },
    //> public long getFilesize()
    getFilesize:function(){
        return this.filesize;
    },
    //> public void setFilesize(long filesize)
    setFilesize:function(filesize){
        this.filesize=filesize;
    },
    //> public String getFileType()
    getFileType:function(){
        return this.fileType;
    },
    //> public void setFileType(String fileType)
    setFileType:function(fileType){
        this.fileType=fileType;
    },
    //> public String getPassword()
    getPassword:function(){
        return this.password;
    },
    //> public void setPassword(String password)
    setPassword:function(password){
        this.password=password;
    },
    //> public String getTargetFilename()
    getTargetFilename:function(){
        return this.targetFilename;
    },
    //> public void setTargetFilename(String targetFilename)
    setTargetFilename:function(targetFilename){
        this.targetFilename=targetFilename;
    },
    //> public String getURL()
    getURL:function(){
        return this.URL;
    },
    //> public void setURL(String url)
    setURL:function(url){
        this.URL=url;
    },
    //> public String getUsername()
    getUsername:function(){
        return this.username;
    },
    //> public void setUsername(String username)
    setUsername:function(username){
        this.username=username;
    },
    //> public void addTimeWindowStruct(TimeWindowStructDTO timeWindowStructDTO)
    addTimeWindowStruct:function(timeWindowStructDTO){
        if(this.timeWindowStructList.size()<2){
            throw new this.vj$.IndexOutOfBoundsException();
        }
        this.timeWindowStructList.addElement(timeWindowStructDTO);
    },
    //> public Vector<TimeWindowStructDTO> getTimeWindowStructList()
    getTimeWindowStructList:function(){
        return this.timeWindowStructList;
    },
    //> public void setTimeWindowStructList(Vector<TimeWindowStructDTO> timeWindowStructList)
    setTimeWindowStructList:function(timeWindowStructList){
        this.timeWindowStructList=timeWindowStructList;
    }
})
.endType();