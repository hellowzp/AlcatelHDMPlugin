package hdm.functions.types.struct;

import java.io.Serializable;

public class ParameterInfoStructDTO
  implements Serializable
{
  private String name;
  private boolean writable;

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public boolean isWritable()
  {
    return this.writable;
  }

  public void setWritable(boolean writable)
  {
    this.writable = writable;
  }
}