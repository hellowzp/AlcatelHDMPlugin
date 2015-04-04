package hdm.functions.types.request;

import java.io.Serializable;

public class GetParameterAttributesDTO
  implements Serializable
{
  private String[] parameterNames;

  public GetParameterAttributesDTO()
  {
  }

  public GetParameterAttributesDTO(String[] parameterNames)
  {
    this.parameterNames = parameterNames;
  }

  public String[] getParameterNames()
  {
    return this.parameterNames;
  }

  public void setParameterNames(String[] parameterNames)
  {
    this.parameterNames = parameterNames;
  }
}