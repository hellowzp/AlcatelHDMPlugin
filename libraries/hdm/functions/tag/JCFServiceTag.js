/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.tag.JCFServiceTag') //< public
.needs(['org.eclipse.vjet.vjo.java.lang.StringBuilder','hdm.functions.tag.JCFTagCondition',
    'vjo.java.lang.ObjectUtil'])
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:6770894260432447605, //< private final long
    HASH_PRIME:1000003 //< private final int
})
.protos({
    name:null, //< private String
    value:null, //< private String
    condition:null, //< private JCFTagCondition
    factoryResetValue:null, //< private String
    copyOnFactoryReset:false, //< private boolean
    removed:false, //< private boolean
    //> public constructs()
    //> public constructs(String name,String value)
    //> public constructs(String name,String value,JCFTagCondition condition)
    //> public constructs(String name,String value,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    //> public constructs(String name,String value,String factoryResetValue,boolean copyOnFactoryReset)
    constructs:function(){
        if(arguments.length===2){
            this.constructs_2_0_JCFServiceTag_ovld(arguments[0],arguments[1]);
        }else if(arguments.length===3){
            this.constructs_3_0_JCFServiceTag_ovld(arguments[0],arguments[1],arguments[2]);
        }else if(arguments.length===5){
            this.constructs_5_0_JCFServiceTag_ovld(arguments[0],arguments[1],arguments[2],arguments[3],arguments[4]);
        }else if(arguments.length===4){
            this.constructs_4_0_JCFServiceTag_ovld(arguments[0],arguments[1],arguments[2],arguments[3]);
        }
    },
    //> protected constructs_2_0_JCFServiceTag_ovld(String name,String value)
    constructs_2_0_JCFServiceTag_ovld:function(name,value){
        this.name=name;
        this.value=value;
        this.removed=false;
        this.condition=this.vj$.JCFTagCondition.ANY;
    },
    //> protected constructs_3_0_JCFServiceTag_ovld(String name,String value,JCFTagCondition condition)
    constructs_3_0_JCFServiceTag_ovld:function(name,value,condition){
        this.name=name;
        this.value=value;
        this.condition=condition;
        this.removed=false;
    },
    //> protected constructs_5_0_JCFServiceTag_ovld(String name,String value,String factoryResetValue,boolean copyOnFactoryReset,JCFTagCondition condition)
    constructs_5_0_JCFServiceTag_ovld:function(name,value,factoryResetValue,copyOnFactoryReset,condition){
        this.name=name;
        this.value=value;
        this.condition=condition;
        this.factoryResetValue=factoryResetValue;
        this.copyOnFactoryReset=copyOnFactoryReset;
        this.removed=false;
    },
    //> protected constructs_4_0_JCFServiceTag_ovld(String name,String value,String factoryResetValue,boolean copyOnFactoryReset)
    constructs_4_0_JCFServiceTag_ovld:function(name,value,factoryResetValue,copyOnFactoryReset){
        this.name=name;
        this.value=value;
        this.copyOnFactoryReset=copyOnFactoryReset;
        this.factoryResetValue=factoryResetValue;
        this.removed=false;
        this.condition=this.vj$.JCFTagCondition.ANY;
    },
    //> public String getName()
    getName:function(){
        return this.name;
    },
    //> public void setName(String name)
    setName:function(name){
        this.name=name;
    },
    //> public String getValue()
    getValue:function(){
        return this.value;
    },
    //> public void setValue(String value)
    setValue:function(value){
        this.value=value;
    },
    //> public JCFTagCondition getCondition()
    getCondition:function(){
        return this.condition;
    },
    //> public void setCondition(JCFTagCondition condition)
    setCondition:function(condition){
        this.condition=condition;
    },
    //> public String getFactoryResetValue()
    getFactoryResetValue:function(){
        return this.factoryResetValue;
    },
    //> public void setFactoryResetValue(String factoryResetValue)
    setFactoryResetValue:function(factoryResetValue){
        this.factoryResetValue=factoryResetValue;
    },
    //> public boolean isCopyOnFactoryReset()
    isCopyOnFactoryReset:function(){
        return this.copyOnFactoryReset;
    },
    //> public void setCopyOnFactoryReset(boolean copyOnFactoryReset)
    setCopyOnFactoryReset:function(copyOnFactoryReset){
        this.copyOnFactoryReset=copyOnFactoryReset;
    },
    //> public boolean isRemoved()
    isRemoved:function(){
        return this.removed;
    },
    //> public void setRemoved(boolean removed)
    setRemoved:function(removed){
        this.removed=removed;
    },
    //> public boolean equals(Object obj)
    equals:function(obj){
        var object=obj; //<<JCFServiceTag
        if((vjo.java.lang.ObjectUtil.equals(this.name,object.name))&&(this.condition.equals(object.condition))){
            return true;
        }
        return false;
    },
    //> public String toString()
    toString:function(){
        var sb=new this.vj$.StringBuilder(); //<StringBuilder
        sb.append("JCFServiceTag:\tName: ");
        sb.append(this.name);
        sb.append("\t- Value :");
        sb.append(this.value);
        sb.append("\t- Factory Reset Value: ");
        sb.append(this.factoryResetValue);
        sb.append("\t- Copy on factory reset: ");
        sb.append(this.copyOnFactoryReset);
        sb.append("\t- Condition : ");
        sb.append(this.condition.toString());
        return sb.toString();
    },
    //> public int hashCode()
    hashCode:function(){
        var result=0; //<int
        result=1000003*result+vjo.java.lang.ObjectUtil.hashCode(this.name);
        result=1000003*result+this.condition.hashCode();
        return result;
    }
})
.endType();