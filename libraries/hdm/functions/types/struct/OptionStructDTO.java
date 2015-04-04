package hdm.functions.types.struct;

import java.io.Serializable;

public class OptionStructDTO
  implements Serializable
{
  private String optionName;
  private int mode;
  private boolean transferable;
  private long voucherSN;
  private long state;
  private String startDateUTC;
  private String expirationDateUTC;

  public String getOptionName()
  {
    return this.optionName;
  }

  public void setOptionName(String optionName)
  {
    this.optionName = optionName;
  }

  public String getExpirationDateUTC()
  {
    return this.expirationDateUTC;
  }

  public void setExpirationDateUTC(String expirationDateUTC)
  {
    this.expirationDateUTC = expirationDateUTC;
  }

  public int getMode()
  {
    return this.mode;
  }

  public void setMode(int mode)
  {
    this.mode = mode;
  }

  public String getStartDateUTC()
  {
    return this.startDateUTC;
  }

  public void setStartDateUTC(String startDateUTC)
  {
    this.startDateUTC = startDateUTC;
  }

  public long getState()
  {
    return this.state;
  }

  public void setState(long state)
  {
    this.state = state;
  }

  public boolean isTransferable()
  {
    return this.transferable;
  }

  public void setTransferable(boolean transferable)
  {
    this.transferable = transferable;
  }

  public long getVoucherSN()
  {
    return this.voucherSN;
  }

  public void setVoucherSN(long voucherSN)
  {
    this.voucherSN = voucherSN;
  }
}