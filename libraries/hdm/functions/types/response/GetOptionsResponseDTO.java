package hdm.functions.types.response;

import hdm.functions.types.struct.OptionStructDTO;
import java.io.Serializable;

public class GetOptionsResponseDTO
  implements ResponseDTO, Serializable
{
  private String requestedOptionName = null;
  private OptionStructDTO[] optionList;

  public OptionStructDTO[] getOptionList()
  {
    return this.optionList;
  }

  public void setOptionList(OptionStructDTO[] optionList)
  {
    this.optionList = optionList;
  }

  public String getRequestedOptionName()
  {
    return this.requestedOptionName;
  }

  public void setRequestedOptionName(String requestedOptionName)
  {
    this.requestedOptionName = requestedOptionName;
  }
}