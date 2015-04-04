package hdm.functions.types.response;

import hdm.functions.types.struct.ResultStructDTO;
import java.io.Serializable;

public class StateChangeCompleteDTO
  implements ResponseDTO, Serializable
{
  private String commandKey;
  private ResultStructDTO[] resultStructDTO;

  public String getCommandKey()
  {
    return this.commandKey;
  }

  public void setCommandKey(String commandKey)
  {
    this.commandKey = commandKey;
  }

  public ResultStructDTO[] getResultStructDTO()
  {
    return this.resultStructDTO;
  }

  public void setResultStructDTO(ResultStructDTO[] resultStructDTO)
  {
    this.resultStructDTO = resultStructDTO;
  }
}