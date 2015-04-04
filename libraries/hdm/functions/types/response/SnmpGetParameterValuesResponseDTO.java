package hdm.functions.types.response;

import hdm.functions.types.struct.SnmpGetParameterStructDTO;
import java.io.Serializable;

public class SnmpGetParameterValuesResponseDTO
  implements ResponseDTO, Serializable
{
  private SnmpGetParameterStructDTO[] parameterList;

  public SnmpGetParameterStructDTO[] getParameterList()
  {
    return this.parameterList;
  }

  public void setParameterList(SnmpGetParameterStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }
}