package hdm.functions.types.request;

import java.io.Serializable;

public class AddObjectDTO
  implements Serializable
{
  private String objectName;
  private String parameterKey;
  private String objectLabel;

  public AddObjectDTO()
  {
  }

  public AddObjectDTO(String objectName, String parameterKey)
  {
    this.objectName = objectName;
    this.parameterKey = parameterKey;
  }

  public AddObjectDTO(String objectName, String parameterKey, String objectLabel)
  {
    this.objectName = objectName;
    this.parameterKey = parameterKey;
    this.objectLabel = objectLabel;
  }

  public String getObjectName()
  {
    return this.objectName;
  }

  public void setObjectName(String objectName)
  {
    this.objectName = objectName;
  }

  public String getParameterKey()
  {
    return this.parameterKey;
  }

  public void setParameterKey(String parameterKey)
  {
    this.parameterKey = parameterKey;
  }

  public String getObjectLabel()
  {
    return this.objectLabel;
  }

  public void setObjectLabel(String objectLabel)
  {
    this.objectLabel = objectLabel;
  }
}