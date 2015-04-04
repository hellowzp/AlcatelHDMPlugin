package hdm.functions.types.struct;

import java.io.Serializable;

public class AutonOpResultStructDTO extends ResultStructDTO
  implements Serializable
{
  private String operationPerformed;

  public String getOperationPerformed()
  {
    return this.operationPerformed;
  }

  public void setOperationPerformed(String operationPerformed)
  {
    this.operationPerformed = operationPerformed;
  }
}