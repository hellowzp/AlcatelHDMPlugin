/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.GetOptionsDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    optionName:null, //< private String
    //> public String getOptionName()
    getOptionName:function(){
        return this.optionName;
    },
    //> public void setOptionName(String optionName)
    setOptionName:function(optionName){
        this.optionName=optionName;
    }
})
.endType();