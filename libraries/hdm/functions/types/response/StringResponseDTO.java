package hdm.functions.types.response;

import java.io.Serializable;

public class StringResponseDTO
  implements ResponseDTO, Serializable
{
  private String value;

  public StringResponseDTO()
  {
  }

  public StringResponseDTO(String value)
  {
    setValue(value);
  }

  public String getValue()
  {
    return this.value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }
}