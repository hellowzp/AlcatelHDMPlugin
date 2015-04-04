package hdm.functions.types.request;

import java.io.Serializable;

public class FirmwareImageDTO
  implements Serializable
{
  private String firmwareImageName;

  public FirmwareImageDTO()
  {
  }

  public FirmwareImageDTO(String firmwareImageName)
  {
    this.firmwareImageName = firmwareImageName;
  }

  public String getFirmwareImageName()
  {
    return this.firmwareImageName;
  }

  public void setFirmwareImageName(String firmwareImageName)
  {
    this.firmwareImageName = firmwareImageName;
  }
}