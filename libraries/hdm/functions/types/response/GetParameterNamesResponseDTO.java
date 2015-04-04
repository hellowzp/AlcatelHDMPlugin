package hdm.functions.types.response;

import hdm.functions.types.struct.ParameterInfoStructDTO;
import java.io.Serializable;

public class GetParameterNamesResponseDTO
  implements ResponseDTO, Serializable
{
  private ParameterInfoStructDTO[] parameterList;

  public ParameterInfoStructDTO[] getParameterList()
  {
    return this.parameterList;
  }

  public void setParameterList(ParameterInfoStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }
}