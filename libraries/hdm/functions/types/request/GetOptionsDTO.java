package hdm.functions.types.request;

import java.io.Serializable;

public class GetOptionsDTO
  implements Serializable
{
  private String optionName;

  public String getOptionName()
  {
    return this.optionName;
  }

  public void setOptionName(String optionName)
  {
    this.optionName = optionName;
  }
}