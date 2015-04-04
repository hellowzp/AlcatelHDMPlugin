/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.DownloadDTO') //< public
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
    delaySeconds:0, //< private long
    successURL:null, //< private String
    failureURL:null, //< private String
    //> public constructs()
    //> public constructs(String fileType,String url,String username,String password,int filesize,String targetFilename,int delaySeconds,String successURL,String failureURL)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_DownloadDTO_ovld();
        }else if(arguments.length===9){
            this.constructs_9_0_DownloadDTO_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4],arguments[5],arguments[6],arguments[7],arguments[8]);
        }
    },
    //> protected constructs_0_0_DownloadDTO_ovld()
    constructs_0_0_DownloadDTO_ovld:function(){
    },
    //> protected constructs_9_0_DownloadDTO_ovld(String fileType,String url,String username,String password,int filesize,String targetFilename,int delaySeconds,String successURL,String failureURL)
    constructs_9_0_DownloadDTO_ovld:function(fileType,url,username,password,filesize,targetFilename,delaySeconds,successURL,failureURL){
        this.fileType=fileType;
        this.URL=url;
        this.username=username;
        this.password=password;
        this.filesize=filesize;
        this.targetFilename=targetFilename;
        this.delaySeconds=delaySeconds;
        this.successURL=successURL;
        this.failureURL=failureURL;
    },
    //> public long getDelaySeconds()
    getDelaySeconds:function(){
        return this.delaySeconds;
    },
    //> public void setDelaySeconds(long delaySeconds)
    setDelaySeconds:function(delaySeconds){
        this.delaySeconds=delaySeconds;
    },
    //> public String getFailureURL()
    getFailureURL:function(){
        return this.failureURL;
    },
    //> public void setFailureURL(String failureURL)
    setFailureURL:function(failureURL){
        this.failureURL=failureURL;
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
    //> public String getSuccessURL()
    getSuccessURL:function(){
        return this.successURL;
    },
    //> public void setSuccessURL(String successURL)
    setSuccessURL:function(successURL){
        this.successURL=successURL;
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
    }
})
.endType();