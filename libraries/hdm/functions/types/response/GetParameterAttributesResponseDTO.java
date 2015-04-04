package hdm.functions.types.response;

import hdm.functions.types.struct.ParameterAttributeStructDTO;
import java.io.Serializable;

public class GetParameterAttributesResponseDTO
  implements ResponseDTO, Serializable
{
  private ParameterAttributeStructDTO[] parameterList;

  public ParameterAttributeStructDTO[] getParameterList()
  {
    return this.parameterList;
  }

  public void setParameterList(ParameterAttributeStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }
}