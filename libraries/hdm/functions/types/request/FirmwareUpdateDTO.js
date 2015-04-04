/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.FirmwareUpdateDTO') //< public
.needs('hdm.functions.types.request.DownloadDTO')
.satisfies('java.io.Serializable')
.protos({
    download:null, //< private DownloadDTO
    prerequisiteSoftwareVersion:null, //< private String
    firmwareImageCorrelationKey:null, //< private String
    //> public constructs()
    //> public constructs(DownloadDTO download,String prerequisiteSoftwareVersion)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_FirmwareUpdateDTO_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_FirmwareUpdateDTO_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_0_0_FirmwareUpdateDTO_ovld()
    constructs_0_0_FirmwareUpdateDTO_ovld:function(){
        this.download=new this.vj$.DownloadDTO();
        this.download.setFileType("1 Firmware Upgrade Image");
    },
    //> protected constructs_2_0_FirmwareUpdateDTO_ovld(DownloadDTO download,String prerequisiteSoftwareVersion)
    constructs_2_0_FirmwareUpdateDTO_ovld:function(download,prerequisiteSoftwareVersion){
        this.download=download;
        this.download.setFileType("1 Firmware Upgrade Image");
        this.prerequisiteSoftwareVersion=prerequisiteSoftwareVersion;
    },
    //> public String getFirmwareImageCorrelationKey()
    getFirmwareImageCorrelationKey:function(){
        return this.firmwareImageCorrelationKey;
    },
    //> public void setFirmwareImageCorrelationKey(String correlationKey)
    setFirmwareImageCorrelationKey:function(correlationKey){
        this.firmwareImageCorrelationKey=correlationKey;
    },
    //> public long getDelaySeconds()
    getDelaySeconds:function(){
        return this.download.getDelaySeconds();
    },
    //> public long getFilesize()
    getFilesize:function(){
        return this.download.getFilesize();
    },
    //> public String getPassword()
    getPassword:function(){
        return this.download.getPassword();
    },
    //> public String getTargetFilename()
    getTargetFilename:function(){
        return this.download.getTargetFilename();
    },
    //> public String getURL()
    getURL:function(){
        return this.download.getURL();
    },
    //> public String getUsername()
    getUsername:function(){
        return this.download.getUsername();
    },
    //> public void setDelaySeconds(long delaySeconds)
    setDelaySeconds:function(delaySeconds){
        this.download.setDelaySeconds(delaySeconds);
    },
    //> public void setFilesize(long filesize)
    setFilesize:function(filesize){
        this.download.setFilesize(filesize);
    },
    //> public void setPassword(String password)
    setPassword:function(password){
        this.download.setPassword(password);
    },
    //> public void setSuccessURL(String successURL)
    setSuccessURL:function(successURL){
        this.download.setSuccessURL(successURL);
    },
    //> public String getSuccessURL()
    getSuccessURL:function(){
        return this.download.getSuccessURL();
    },
    //> public String getFailureURL()
    getFailureURL:function(){
        return this.download.getFailureURL();
    },
    //> public void setFailureURL(String failureURL)
    setFailureURL:function(failureURL){
        this.download.setFailureURL(failureURL);
    },
    //> public void setTargetFilename(String targetFilename)
    setTargetFilename:function(targetFilename){
        this.download.setTargetFilename(targetFilename);
    },
    //> public void setURL(String url)
    setURL:function(url){
        this.download.setURL(url);
    },
    //> public void setUsername(String username)
    setUsername:function(username){
        this.download.setUsername(username);
    },
    //> public String getPrerequisiteSoftwareVersion()
    getPrerequisiteSoftwareVersion:function(){
        return this.prerequisiteSoftwareVersion;
    },
    //> public void setPrerequisiteSoftwareVersion(String prerequisiteSoftwareVersion)
    setPrerequisiteSoftwareVersion:function(prerequisiteSoftwareVersion){
        this.prerequisiteSoftwareVersion=prerequisiteSoftwareVersion;
    },
    //> public DownloadDTO getDownload()
    getDownload:function(){
        return this.download;
    },
    //> public void setDownload(DownloadDTO download)
    setDownload:function(download){
        this.download=download;
    }
})
.endType();