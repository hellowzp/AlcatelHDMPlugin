package hdm.functions.types.response;

import java.io.Serializable;

public class UploadResponseDTO
  implements ResponseDTO, Serializable
{
  private int status;
  private String startTimeUTC;
  private String completeTimeUTC;

  public String getCompleteTimeUTC()
  {
    return this.completeTimeUTC;
  }

  public void setCompleteTimeUTC(String completeTimeUTC)
  {
    this.completeTimeUTC = completeTimeUTC;
  }

  public String getStartTimeUTC()
  {
    return this.startTimeUTC;
  }

  public void setStartTimeUTC(String startTimeUTC)
  {
    this.startTimeUTC = startTimeUTC;
  }

  public int getStatus()
  {
    return this.status;
  }

  public void setStatus(int status)
  {
    this.status = status;
  }
}