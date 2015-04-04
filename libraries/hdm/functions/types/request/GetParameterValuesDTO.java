package hdm.functions.types.request;

import java.io.Serializable;

public class GetParameterValuesDTO
  implements Serializable
{
  private String[] parameterNames;

  public GetParameterValuesDTO()
  {
  }

  public GetParameterValuesDTO(String[] parameterNames)
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