package hdm.functions.types.response;

import java.io.Serializable;

public class AddObjectResponseDTO
  implements ResponseDTO, Serializable
{
  private long instanceNumber;
  private int status;
  private String label;

  public long getInstanceNumber()
  {
    return this.instanceNumber;
  }

  public void setInstanceNumber(long instanceNumber)
  {
    this.instanceNumber = instanceNumber;
  }

  public int getStatus()
  {
    return this.status;
  }

  public void setStatus(int status)
  {
    this.status = status;
  }

  public String getLabel()
  {
    return this.label;
  }

  public void setLabel(String label)
  {
    this.label = label;
  }
}