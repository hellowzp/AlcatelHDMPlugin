package hdm.functions.types.response;

import java.io.Serializable;

public class SetParameterValuesResponseDTO
  implements ResponseDTO, Serializable
{
  private int status;

  public int getStatus()
  {
    return this.status;
  }

  public void setStatus(int status)
  {
    this.status = status;
  }
}