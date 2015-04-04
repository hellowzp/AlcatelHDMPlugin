/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.CwmpCustomPreactivationResponseDTO') //< public
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    pppoeUserName:null, //< private String
    pppoePassword:null, //< private String
    httpPublicUserName:null, //< private String
    httpPublicPassword:null, //< private String
    connectionRequestUserName:null, //< private String
    connectionRequestPassword:null, //< private String
    acsUrl:null, //< private String
    //> public String getPppoeUserName()
    getPppoeUserName:function(){
        return this.pppoeUserName;
    },
    //> public void setPppoeUserName(String pppoeUserName)
    setPppoeUserName:function(pppoeUserName){
        this.pppoeUserName=pppoeUserName;
    },
    //> public String getPppoePassword()
    getPppoePassword:function(){
        return this.pppoePassword;
    },
    //> public void setPppoePassword(String pppoePassword)
    setPppoePassword:function(pppoePassword){
        this.pppoePassword=pppoePassword;
    },
    //> public String getHttpPublicUserName()
    getHttpPublicUserName:function(){
        return this.httpPublicUserName;
    },
    //> public void setHttpPublicUserName(String httpPublicUserName)
    setHttpPublicUserName:function(httpPublicUserName){
        this.httpPublicUserName=httpPublicUserName;
    },
    //> public String getHttpPublicPassword()
    getHttpPublicPassword:function(){
        return this.httpPublicPassword;
    },
    //> public void setHttpPublicPassword(String httpPublicPassword)
    setHttpPublicPassword:function(httpPublicPassword){
        this.httpPublicPassword=httpPublicPassword;
    },
    //> public String getConnectionRequestUserName()
    getConnectionRequestUserName:function(){
        return this.connectionRequestUserName;
    },
    //> public void setConnectionRequestUserName(String connectionRequestUserName)
    setConnectionRequestUserName:function(connectionRequestUserName){
        this.connectionRequestUserName=connectionRequestUserName;
    },
    //> public String getConnectionRequestPassword()
    getConnectionRequestPassword:function(){
        return this.connectionRequestPassword;
    },
    //> public void setConnectionRequestPassword(String connectionRequestPassword)
    setConnectionRequestPassword:function(connectionRequestPassword){
        this.connectionRequestPassword=connectionRequestPassword;
    },
    //> public String getAcsUrl()
    getAcsUrl:function(){
        return this.acsUrl;
    },
    //> public void setAcsUrl(String acsUrl)
    setAcsUrl:function(acsUrl){
        this.acsUrl=acsUrl;
    }
})
.endType();