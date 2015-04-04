package hdm.functions.types.struct;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({SnmpParameterValueStructDTO.class})
public class ParameterValueStructDTO
  implements Serializable
{
  private String name;
  private String value;
  private String type;

  public ParameterValueStructDTO()
  {
  }

  public ParameterValueStructDTO(String name, String value, String type)
  {
    this.name = name;
    this.value = value;
    this.type = type;
  }

  public String getName()
  {
    return this.name;
  }

  public String getType()
  {
    return this.type;
  }

  public String getValue()
  {
    return this.value;
  }

  public void setName(String name)
  {
    this.name = name.trim();
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setValue(String value)
  {
    this.value = value;
  }
}