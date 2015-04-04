/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.UploadDTO') //< public
.satisfies('java.io.Serializable')
.props({
    VENDOR_CONFIGURATION_FILE:"1 Vendor Configuration File", //< public final String
    VENDOR_LOG_FILE:"2 Vendor Log File" //< public final String
})
.protos({
    fileType:null, //< private String
    URL:null, //< private String
    username:null, //< private String
    password:null, //< private String
    delaySeconds:0, //< private long
    //> public constructs()
    //> public constructs(String fileType,String url,String username,String password,long delaySeconds)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_UploadDTO_ovld();
        }else if(arguments.length===5){
            this.constructs_5_0_UploadDTO_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4]);
        }
    },
    //> protected constructs_0_0_UploadDTO_ovld()
    constructs_0_0_UploadDTO_ovld:function(){
    },
    //> protected constructs_5_0_UploadDTO_ovld(String fileType,String url,String username,String password,long delaySeconds)
    constructs_5_0_UploadDTO_ovld:function(fileType,url,username,password,delaySeconds){
        this.fileType=fileType;
        this.URL=url;
        this.username=username;
        this.password=password;
        this.delaySeconds=delaySeconds;
    },
    //> public long getDelaySeconds()
    getDelaySeconds:function(){
        return this.delaySeconds;
    },
    //> public void setDelaySeconds(long delaySeconds)
    setDelaySeconds:function(delaySeconds){
        this.delaySeconds=delaySeconds;
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