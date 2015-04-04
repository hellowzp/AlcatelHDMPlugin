package hdm.functions.types.struct;

import java.io.Serializable;

public class ParameterAttributeStructDTO
  implements Serializable
{
  private String name;
  private int notification;
  private String[] accessList;

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String[] getAccessList()
  {
    return this.accessList;
  }

  public void setAccessList(String[] accessList)
  {
    this.accessList = accessList;
  }

  public int getNotification()
  {
    return this.notification;
  }

  public void setNotification(int notification)
  {
    this.notification = notification;
  }
}