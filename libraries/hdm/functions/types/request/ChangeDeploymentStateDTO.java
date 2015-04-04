package hdm.functions.types.request;

import hdm.functions.types.struct.OperationStructDTO;
import java.io.Serializable;

public class ChangeDeploymentStateDTO
  implements Serializable
{
  private OperationStructDTO[] operations;

  public OperationStructDTO[] getOperations()
  {
    return this.operations;
  }

  public void setOperations(OperationStructDTO[] operations)
  {
    this.operations = operations;
  }
}