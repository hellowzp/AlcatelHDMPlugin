package hdm.functions.types.response;

import hdm.functions.types.struct.ParameterValueStructDTO;
import java.io.Serializable;

public class GetParameterValuesResponseDTO
  implements ResponseDTO, Serializable
{
  private ParameterValueStructDTO[] parameterList;

  public ParameterValueStructDTO[] getParameterList()
  {
    return this.parameterList;
  }

  public void setParameterList(ParameterValueStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }
}