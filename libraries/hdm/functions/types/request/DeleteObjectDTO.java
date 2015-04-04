package hdm.functions.types.request;

import java.io.Serializable;

public class DeleteObjectDTO
  implements Serializable
{
  private String objectName;
  private String parameterKey;

  public DeleteObjectDTO()
  {
  }

  public DeleteObjectDTO(String objectName, String parameterKey)
  {
    this.objectName = objectName;
    this.parameterKey = parameterKey;
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
}