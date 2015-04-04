/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.ComplexArgumentMetaData') //< public
.inherits('hdm.functions.metadata.ArgumentMetaData')
.protos({
    label:null, //< private String
    //> public String getLabel()
    getLabel:function(){
        return this.label;
    },
    //> public void setLabel(String label)
    setLabel:function(label){
        this.label=label;
    }
})
.endType();