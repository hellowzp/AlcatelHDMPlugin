package hdm.functions.types.struct;

import java.io.Serializable;

public class SetParameterAttributesStructDTO
  implements Serializable
{
  private String name;
  private boolean notificationChange;
  private int notification;
  private boolean accessListChange;
  private String[] accessList;

  public SetParameterAttributesStructDTO()
  {
  }

  public SetParameterAttributesStructDTO(String name, boolean notificationChange, int notification, boolean accessListChange, String[] accessList)
  {
    this.name = name;
    this.notificationChange = notificationChange;
    this.notification = notification;
    this.accessListChange = accessListChange;
    this.accessList = accessList;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public boolean isNotificationChange()
  {
    return this.notificationChange;
  }

  public void setNotificationChange(boolean notificationChange)
  {
    this.notificationChange = notificationChange;
  }

  public boolean getNotificationChange()
  {
    return this.notificationChange;
  }

  public int getNotification()
  {
    return this.notification;
  }

  public void setNotification(int notification)
  {
    this.notification = notification;
  }

  public boolean isAccessListChange()
  {
    return this.accessListChange;
  }

  public void setAccessListChange(boolean accessListChange)
  {
    this.accessListChange = accessListChange;
  }

  public boolean getAccessListChange()
  {
    return this.accessListChange;
  }

  public String[] getAccessList()
  {
    return this.accessList;
  }

  public void setAccessList(String[] accessList)
  {
    this.accessList = accessList;
  }
}