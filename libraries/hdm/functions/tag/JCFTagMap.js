/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.tag.JCFTagMap') //< public
.needs(['org.eclipse.vjet.vjo.java.util.Set','org.eclipse.vjet.vjo.java.util.HashSet',
    'org.eclipse.vjet.vjo.java.lang.StringBuilder','org.eclipse.vjet.vjo.java.util.Iterator',
    'hdm.functions.tag.JCFUserTag','hdm.functions.tag.JCFServiceTag',
    'hdm.functions.tag.JCFTagCondition','vjo.java.lang.ObjectUtil'])
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:-3038024996105467281, //< private final long
    logger:null //< private final org.apache.log4j.Logger
})
.protos({
    userTags:null, //< private Set<JCFUserTag> userTags
    serviceTags:null, //< private Set<JCFServiceTag> serviceTags
    //> public constructs()
    constructs:function(){
        this.userTags=new this.vj$.HashSet();
        this.serviceTags=new this.vj$.HashSet();
    },
    //> public void setUserTagInCache(String userTagName,String userTagValue,JCFTagCondition condition)
    setUserTagInCache:function(userTagName,userTagValue,condition){
        if(condition.equals(this.vj$.JCFTagCondition.ANY)){
            this.setUserTag(userTagName,userTagValue,this.vj$.JCFTagCondition.SUCCESS);
            this.setUserTag(userTagName,userTagValue,this.vj$.JCFTagCondition.FAILURE);
        }else {
            this.setUserTag(userTagName,userTagValue,condition);
        }
    },
    //> private void setUserTag(String userTagName,String userTagValue,JCFTagCondition condition)
    setUserTag:function(userTagName,userTagValue,condition){
        var newUserTag=new this.vj$.JCFUserTag(userTagName,userTagValue,condition); //<JCFUserTag
        var alreadyExists=this.userTags.contains(newUserTag); //<boolean
        if(alreadyExists){
            this.vj$.JCFTagMap.logger.info((new this.vj$.StringBuilder()).append(userTagName).append(" already exists in the cache. It will be overwritten...").toString());
            this.userTags.remove(newUserTag);
        }
        this.userTags.add(newUserTag);
        if(this.vj$.JCFTagMap.logger.isDebugEnabled()){
            this.vj$.JCFTagMap.logger.debug((new this.vj$.StringBuilder()).append("Tag has been added to the cache.").append(newUserTag.toString()).toString());
        }
    },
    //> public String getUserTagInCache(String userTagName,JCFTagCondition condition)
    getUserTagInCache:function(userTagName,condition){
        for (var iter=this.userTags.iterator();iter.hasNext();){
            var tag=iter.next(); //<<JCFUserTag
            if((vjo.java.lang.ObjectUtil.equals(tag.getName(),userTagName))&&((tag.getCondition().equals(condition))||(condition.equals(this.vj$.JCFTagCondition.ANY)))){
                return tag.getValue();
            }
        }
        return null;
    },
    //> public void clearUserTagInCache(String userTagName,JCFTagCondition condition)
    clearUserTagInCache:function(userTagName,condition){
        if(condition.equals(this.vj$.JCFTagCondition.ANY)){
            this.clearUserTag(userTagName,this.vj$.JCFTagCondition.SUCCESS);
            this.clearUserTag(userTagName,this.vj$.JCFTagCondition.FAILURE);
        }else {
            this.clearUserTag(userTagName,condition);
        }
    },
    //> private void clearUserTag(String userTagName,JCFTagCondition condition)
    clearUserTag:function(userTagName,condition){
        var tagExists=false; //<boolean
        var tag=null; //<JCFUserTag
        for (var iter=this.userTags.iterator();iter.hasNext();){
            tag=iter.next(); //<<JCFUserTag
            if((vjo.java.lang.ObjectUtil.equals(tag.getName(),userTagName))&&(tag.getCondition().equals(condition))){
                tagExists=true;
            }
        }
        if(tagExists){
            this.userTags.remove(tag);
            if(this.vj$.JCFTagMap.logger.isDebugEnabled()){
                this.vj$.JCFTagMap.logger.debug((new this.vj$.StringBuilder()).append("Tag has been removed from the cache. :").append(tag.toString()).toString());
            }
        }else {
            this.vj$.JCFTagMap.logger.warn((new this.vj$.StringBuilder()).append("Tag could not be found in the cache. Name :").append(userTagName).append(" Condition: ").append(condition.toString()).toString());
        }
    },
    //> public void setServiceTagInCache(String serviceTagName,String serviceTagValue,JCFTagCondition condition)
    //> public void setServiceTagInCache(String serviceTagName,String serviceTagValue,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    setServiceTagInCache:function(serviceTagName,serviceTagValue,condition){
        if(arguments.length===3){
            this.setServiceTagInCache_3_0_JCFTagMap_ovld(arguments[0],arguments[1],arguments[2]);
        }else if(arguments.length===5){
            this.setServiceTagInCache_5_0_JCFTagMap_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4]);
        }
    },
    //> protected void setServiceTagInCache_3_0_JCFTagMap_ovld(String serviceTagName,String serviceTagValue,JCFTagCondition condition)
    setServiceTagInCache_3_0_JCFTagMap_ovld:function(serviceTagName,serviceTagValue,condition){
        if(condition.equals(this.vj$.JCFTagCondition.ANY)){
            this.setServiceTag(serviceTagName,serviceTagValue,this.vj$.JCFTagCondition.SUCCESS);
            this.setServiceTag(serviceTagName,serviceTagValue,this.vj$.JCFTagCondition.FAILURE);
        }else {
            this.setServiceTag(serviceTagName,serviceTagValue,condition);
        }
    },
    //> protected void setServiceTagInCache_5_0_JCFTagMap_ovld(String serviceTagName,String serviceTagValue,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    setServiceTagInCache_5_0_JCFTagMap_ovld:function(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,condition){
        if(condition.equals(this.vj$.JCFTagCondition.ANY)){
            this.setServiceTag(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,this.vj$.JCFTagCondition.SUCCESS);
            this.setServiceTag(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,this.vj$.JCFTagCondition.FAILURE);
        }else {
            this.setServiceTag(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,condition);
        }
    },
    //> private void setServiceTag(String serviceTagName,String serviceTagValue,JCFTagCondition condition)
    //> private void setServiceTag(String serviceTagName,String serviceTagValue,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    setServiceTag:function(serviceTagName,serviceTagValue,condition){
        if(arguments.length===3){
            this.setServiceTag_3_0_JCFTagMap_ovld(arguments[0],arguments[1],arguments[2]);
        }else if(arguments.length===5){
            this.setServiceTag_5_0_JCFTagMap_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4]);
        }
    },
    //> private void setServiceTag_3_0_JCFTagMap_ovld(String serviceTagName,String serviceTagValue,JCFTagCondition condition)
    setServiceTag_3_0_JCFTagMap_ovld:function(serviceTagName,serviceTagValue,condition){
        var newServiceTag=new this.vj$.JCFServiceTag(serviceTagName,serviceTagValue,condition); //<JCFServiceTag
        var alreadyExists=this.serviceTags.contains(newServiceTag); //<boolean
        if(alreadyExists){
            this.vj$.JCFTagMap.logger.info((new this.vj$.StringBuilder()).append(serviceTagName).append(" already exists in the cache. It will be overwritten...").toString());
            this.serviceTags.remove(newServiceTag);
        }
        this.serviceTags.add(newServiceTag);
        if(this.vj$.JCFTagMap.logger.isDebugEnabled()){
            this.vj$.JCFTagMap.logger.debug((new this.vj$.StringBuilder()).append("Tag has been added to the cache: ").append(newServiceTag.toString()).toString());
        }
    },
    //> private void setServiceTag_5_0_JCFTagMap_ovld(String serviceTagName,String serviceTagValue,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    setServiceTag_5_0_JCFTagMap_ovld:function(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,condition){
        var newServiceTag=new this.vj$.JCFServiceTag(serviceTagName,serviceTagValue,factoryResetValue,copyOnFactoryReset,condition); //<JCFServiceTag
        var alreadyExists=this.serviceTags.contains(newServiceTag); //<boolean
        if(alreadyExists){
            this.vj$.JCFTagMap.logger.info((new this.vj$.StringBuilder()).append(serviceTagName).append(" already exists in the cache. It will be overwritten...").toString());
            this.serviceTags.remove(newServiceTag);
        }
        this.serviceTags.add(newServiceTag);
        if(this.vj$.JCFTagMap.logger.isDebugEnabled()){
            this.vj$.JCFTagMap.logger.debug((new this.vj$.StringBuilder()).append("Tag has been added to the cache: ").append(newServiceTag.toString()).toString());
        }
    },
    //> public String getServiceTagInCache(String serviceTagName,JCFTagCondition condition)
    getServiceTagInCache:function(serviceTagName,condition){
        var value=null; //<String
        for (var iter=this.serviceTags.iterator();iter.hasNext();){
            var tag=iter.next(); //<<JCFServiceTag
            if((vjo.java.lang.ObjectUtil.equals(tag.getName(),serviceTagName))&&((tag.getCondition().equals(condition))||(condition.equals(this.vj$.JCFTagCondition.ANY)))){
                value=tag.getValue();
                break;
            }
        }
        return value;
    },
    //> public void clearServiceTagInCache(String serviceTagName,JCFTagCondition condition)
    clearServiceTagInCache:function(serviceTagName,condition){
        if(condition.equals(this.vj$.JCFTagCondition.ANY)){
            this.clearServiceTag(serviceTagName,this.vj$.JCFTagCondition.SUCCESS);
            this.clearServiceTag(serviceTagName,this.vj$.JCFTagCondition.FAILURE);
        }else {
            this.clearServiceTag(serviceTagName,condition);
        }
    },
    //> private void clearServiceTag(String serviceTagName,JCFTagCondition condition)
    clearServiceTag:function(serviceTagName,condition){
        var tagExists=false; //<boolean
        var tag=null; //<JCFServiceTag
        for (var iter=this.serviceTags.iterator();iter.hasNext();){
            tag=iter.next(); //<<JCFServiceTag
            if((vjo.java.lang.ObjectUtil.equals(tag.getName(),serviceTagName))&&(tag.getCondition().equals(condition))){
                tagExists=true;
            }
        }
        if(tagExists){
            this.serviceTags.remove(tag);
            if(this.vj$.JCFTagMap.logger.isDebugEnabled()){
                this.vj$.JCFTagMap.logger.debug((new this.vj$.StringBuilder()).append("Tag has been removed from the cache.: ").append(tag.toString()).toString());
            }
        }else {
            this.vj$.JCFTagMap.logger.warn((new this.vj$.StringBuilder()).append("Tag could not be found in the cache. Name :").append(serviceTagName).append(" Condition: ").append(condition.toString()).toString());
        }
    },
    //> public Set<JCFUserTag> getUserTags()
    getUserTags:function(){
        return this.userTags;
    },
    //> public Set<JCFServiceTag> getServiceTags()
    getServiceTags:function(){
        return this.serviceTags;
    },
    //> public void setUserTags(Set<JCFUserTag> userTags)
    setUserTags:function(userTags){
        this.userTags=userTags;
    },
    //> public void setServiceTags(Set<JCFServiceTag> serviceTags)
    setServiceTags:function(serviceTags){
        this.serviceTags=serviceTags;
    },
    //> public String toString()
    toString:function(){
        var sb=new this.vj$.StringBuilder(); //<StringBuilder
        sb.append("JCFTagMap:\n");
        sb.append("Cached service tags ---> \n");
        if(this.serviceTags!==null){
            for (var serviceTag,_$itr=this.serviceTags.iterator();_$itr.hasNext();){
                serviceTag=_$itr.next();
                sb.append(serviceTag.toString());
                sb.append("\n");
            }
        }else {
            sb.append("There are no service tags in the cache...\n");
        }
        sb.append("Cached user tags ---> \n");
        if((this.userTags!==null)||(this.userTags.size()!==0)){
            for (var userTag,_$itr=this.userTags.iterator();_$itr.hasNext();){
                userTag=_$itr.next();
                sb.append(userTag.toString());
                sb.append("\n");
            }
        }else {
            sb.append("There are no user tags in the cache...");
        }
        return sb.toString();
    }
})
.inits(function(){
    this.vj$.JCFTagMap.logger=this.vj$.TraceLogger.getLogger(this.clazz);
})
.endType();