package hdm.functions.types.request;

import java.io.Serializable;

public class SetVouchersDTO
  implements Serializable
{
  private String[] voucherList;

  public SetVouchersDTO()
  {
  }

  public SetVouchersDTO(String[] voucherList)
  {
    this.voucherList = voucherList;
  }

  public String[] getVoucherList()
  {
    return this.voucherList;
  }

  public void setVoucherList(String[] voucherList)
  {
    this.voucherList = voucherList;
  }
}