package hdm.functions.types.request;

import java.io.Serializable;

public class GetParameterNamesDTO
  implements Serializable
{
  private String parameterPath;
  private boolean nextLevel;

  public GetParameterNamesDTO()
  {
  }

  public GetParameterNamesDTO(String parameterPath, boolean nextLevel)
  {
    this.parameterPath = parameterPath;
    this.nextLevel = nextLevel;
  }

  public String getParameterPath()
  {
    return this.parameterPath;
  }

  public void setParameterPath(String parameterPath)
  {
    this.parameterPath = parameterPath;
  }

  public boolean isNextLevel()
  {
    return this.nextLevel;
  }

  public void setNextLevel(boolean nextLevel)
  {
    this.nextLevel = nextLevel;
  }
}