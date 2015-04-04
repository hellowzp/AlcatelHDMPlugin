/* @org.eclipse.vjet.dsf.resource.utils.CodeGen("VjoGenerator") */
vjo.ctype('hdm.functions.types.request.SetVouchersDTO') //< public
.satisfies('java.io.Serializable')
.protos({
    voucherList:null, //< private String[]
    //> public constructs()
    //> public constructs(String[] voucherList)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_SetVouchersDTO_ovld();
        }else if(arguments.length===1){
            this.constructs_1_0_SetVouchersDTO_ovld(arguments[0]);
        }
    },
    //> protected constructs_0_0_SetVouchersDTO_ovld()
    constructs_0_0_SetVouchersDTO_ovld:function(){
    },
    //> protected constructs_1_0_SetVouchersDTO_ovld(String[] voucherList)
    constructs_1_0_SetVouchersDTO_ovld:function(voucherList){
        this.voucherList=voucherList;
    },
    //> public String[] getVoucherList()
    getVoucherList:function(){
        return this.voucherList;
    },
    //> public void setVoucherList(String[] voucherList)
    setVoucherList:function(voucherList){
        this.voucherList=voucherList;
    }
})
.endType();