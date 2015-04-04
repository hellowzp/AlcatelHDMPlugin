/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.tag.JCFUserTag') //< public
.needs(['org.eclipse.vjet.vjo.java.lang.StringBuilder','hdm.functions.tag.JCFTagCondition',
    'vjo.java.lang.ObjectUtil'])
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:-8894734437925910796, //< private final long
    HASH_PRIME:1000003 //< private final int
})
.protos({
    name:null, //< private String
    value:null, //< private String
    condition:null, //< private JCFTagCondition
    removed:false, //< private boolean
    //> public constructs()
    //> public constructs(String name,String value,JCFTagCondition condition)
    //> public constructs(String name,String value)
    constructs:function(){
        if(arguments.length===3){
            this.constructs_3_0_JCFUserTag_ovld(arguments[0],arguments[1],arguments[2]);
        }else if(arguments.length===2){
            this.constructs_2_0_JCFUserTag_ovld(arguments[0],arguments[1]);
        }
    },
    //> protected constructs_3_0_JCFUserTag_ovld(String name,String value,JCFTagCondition condition)
    constructs_3_0_JCFUserTag_ovld:function(name,value,condition){
        this.name=name;
        this.value=value;
        this.condition=condition;
        this.removed=false;
    },
    //> protected constructs_2_0_JCFUserTag_ovld(String name,String value)
    constructs_2_0_JCFUserTag_ovld:function(name,value){
        this.name=name;
        this.value=value;
        this.condition=this.vj$.JCFTagCondition.ANY;
        this.removed=false;
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
        var object=obj; //<<JCFUserTag
        if((vjo.java.lang.ObjectUtil.equals(this.name,object.name))&&(this.condition.equals(object.condition))){
            return true;
        }
        return false;
    },
    //> public String toString()
    toString:function(){
        var sb=new this.vj$.StringBuilder(); //<StringBuilder
        sb.append("JCFUserTag:\tName: ");
        sb.append(this.name);
        sb.append("\t- Value :");
        sb.append(this.value);
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