package hdm.functions.types.struct;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="installOperationStructDTO")
public class InstallOperationStructDTO extends OperationStructDTO
{
  private String executionEnvRef;

  public String getExecutionEnvRef()
  {
    return this.executionEnvRef;
  }

  public void setExecutionEnvRef(String executionEnvRef)
  {
    this.executionEnvRef = executionEnvRef;
  }
}