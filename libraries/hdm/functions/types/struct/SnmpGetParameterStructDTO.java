package hdm.functions.types.struct;

import java.io.Serializable;

public class SnmpGetParameterStructDTO
  implements Serializable
{
  private String name;
  private String oid;
  private String value;

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getOid()
  {
    return this.oid;
  }

  public void setOid(String oid)
  {
    this.oid = oid;
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