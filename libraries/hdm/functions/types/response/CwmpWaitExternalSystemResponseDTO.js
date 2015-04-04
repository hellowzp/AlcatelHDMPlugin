/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.response.CwmpWaitExternalSystemResponseDTO') //< public
//> needs org.eclipse.vjet.vjo.java.util.Properties
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.props({
    serialVersionUID:2881344772374318311 //< private final long
})
.protos({
    props:null, //< private Properties
    //> public Properties getProperties()
    getProperties:function(){
        return this.props;
    },
    //> public void setProperties(Properties props)
    setProperties:function(props){
        this.props=props;
    }
})
.endType();