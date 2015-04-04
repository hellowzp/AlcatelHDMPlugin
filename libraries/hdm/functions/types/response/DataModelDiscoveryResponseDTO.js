/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.DataModelDiscoveryResponseDTO') //< public
.needs('org.eclipse.vjet.vjo.java.lang.StringBuilder')
//> needs org.eclipse.vjet.vjo.java.lang.Long
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:4529476902857934181 //< private final long
})
.protos({
    manufacturer:null, //< private String
    customActivationPolicyId:null, //< private Long
    hasDefaultDataModel:false, //< private boolean
    //> public constructs(String manufacturer)
    constructs:function(manufacturer){
        this.manufacturer=manufacturer;
    },
    //> public String getManufacturer()
    getManufacturer:function(){
        return this.manufacturer;
    },
    //> public void setManufacturer(String manufacturer)
    setManufacturer:function(manufacturer){
        this.manufacturer=manufacturer;
    },
    //> public Long getCustomActivationPolicyId()
    getCustomActivationPolicyId:function(){
        return this.customActivationPolicyId;
    },
    //> public boolean hasDefaultDataModel()
    hasDefaultDataModel:function(){
        return this.hasDefaultDataModel;
    },
    //> public void setHasDefaultDataModel(boolean hasDefaultDataModel)
    setHasDefaultDataModel:function(hasDefaultDataModel){
        this.hasDefaultDataModel=hasDefaultDataModel;
    },
    //> public void setCustomActivationPolicyId(Long customActivationPolicyId)
    setCustomActivationPolicyId:function(customActivationPolicyId){
        this.customActivationPolicyId=customActivationPolicyId;
    },
    //> public String toString()
    toString:function(){
        var builder=new this.vj$.StringBuilder(); //<StringBuilder
        builder.append("DataModelDiscoveryRespomseDTO [");
        if(this.manufacturer!==null){
            builder.append("manufacturer=").append(this.manufacturer);
        }
        if(this.customActivationPolicyId!==null){
            builder.append(",customActivationPolicyId=").append(this.customActivationPolicyId);
        }
        builder.append(",hasDefaultDataModel=").append(this.hasDefaultDataModel);
        builder.append("]");
        return builder.toString();
    }
})
.endType();