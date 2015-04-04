/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.metadata.SimpleArgumentMetaData') //< public
.inherits('hdm.functions.metadata.ArgumentMetaData')
.props({
    REPRESENTATION_TYPE_TEXT:"TEXT", //< public final String
    REPRESENTATION_TYPE_MASK_TEXT:"MASK_TEXT", //< public final String
    REPRESENTATION_TYPE_TEXT_AREA:"MULTI_LINE_TEXT", //< public final String
    REPRESENTATION_TYPE_CHOICE_LIST:"CHOICE_LIST", //< public final String
    REPRESENTATION_TYPE_BOOLEAN:"BOOLEAN", //< public final String
    REPRESENTATION_TYPE_DATETIME:"DATETIME", //< public final String
    REPRESENTATION_TYPE_TEXT_ARRAY:"TEXTARRAY", //< public final String
    REPRESENTATION_TYPE_EDITABLE_CHOICE_LIST:"EDITABLE_CHOICE_LIST" //< public final String
})
.protos({
    required:false, //< private boolean
    defaultValue:null, //< private String
    preLabel:null, //< private String
    postLabel:null, //< private String
    representationType:null, //< private String
    hint:null, //< private String
    choices:null, //< private String[]
    //> public String getDefaultValue()
    getDefaultValue:function(){
        return this.defaultValue;
    },
    //> public void setDefaultValue(String defaultValue)
    setDefaultValue:function(defaultValue){
        this.defaultValue=defaultValue;
    },
    //> public String getHint()
    getHint:function(){
        return this.hint;
    },
    //> public void setHint(String hint)
    setHint:function(hint){
        this.hint=hint;
    },
    //> public String getPostLabel()
    getPostLabel:function(){
        return this.postLabel;
    },
    //> public void setPostLabel(String postLabel)
    setPostLabel:function(postLabel){
        this.postLabel=postLabel;
    },
    //> public String getPreLabel()
    getPreLabel:function(){
        return this.preLabel;
    },
    //> public void setPreLabel(String preLabel)
    setPreLabel:function(preLabel){
        this.preLabel=preLabel;
    },
    //> public String getRepresentationType()
    getRepresentationType:function(){
        return this.representationType;
    },
    //> public void setRepresentationType(String representationType)
    setRepresentationType:function(representationType){
        this.representationType=representationType;
    },
    //> public boolean isRequired()
    isRequired:function(){
        return this.required;
    },
    //> public void setRequired(boolean required)
    setRequired:function(required){
        this.required=required;
    },
    //> public void setChoices(String[] choices)
    setChoices:function(choices){
        this.choices=choices;
    },
    //> public String[] getChoices()
    getChoices:function(){
        return this.choices;
    }
})
.endType();