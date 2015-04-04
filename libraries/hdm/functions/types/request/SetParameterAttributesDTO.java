package hdm.functions.types.request;

import hdm.functions.types.struct.SetParameterAttributesStructDTO;
import java.io.Serializable;

public class SetParameterAttributesDTO
  implements Serializable
{
  private SetParameterAttributesStructDTO[] parameterList;

  public SetParameterAttributesDTO()
  {
  }

  public SetParameterAttributesDTO(SetParameterAttributesStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }

  public SetParameterAttributesStructDTO[] getParameterList()
  {
    return this.parameterList;
  }

  public void setParameterList(SetParameterAttributesStructDTO[] parameterList)
  {
    this.parameterList = parameterList;
  }
}