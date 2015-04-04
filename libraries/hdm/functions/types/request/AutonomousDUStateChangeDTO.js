/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.AutonomousDUStateChangeDTO') //< public
//> needs hdm.functions.types.struct.AutonOpResultStructDTO
.satisfies('hdm.functions.types.response.ResponseDTO')
.satisfies('java.io.Serializable')
.protos({
    autonomousOperationResult:null, //< private AutonOpResultStructDTO[]
    //> public AutonOpResultStructDTO[] getAutonomousOperationResult()
    getAutonomousOperationResult:function(){
        return this.autonomousOperationResult;
    },
    //> public void setAutonomousOperationResult(AutonOpResultStructDTO[] autonomousOperationResult)
    setAutonomousOperationResult:function(autonomousOperationResult){
        this.autonomousOperationResult=autonomousOperationResult;
    }
})
.endType();