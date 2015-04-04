package hdm.functions.types.struct;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({AutonOpResultStructDTO.class})
public class ResultStructDTO
  implements Serializable
{
  private static final long serialVersionUID = 1447184253531683083L;
  private String uuid;
  private String deploymentUnitRef;
  private String version;
  private boolean resolved;
  private String currentState;
  private String executionUnitRefList;
  private Date startTime;
  private Date completeTime;
  private int faultCode;
  private String faultString;

  public Date getCompleteTime()
  {
    return this.completeTime;
  }

  public void setCompleteTime(Date completeTime)
  {
    this.completeTime = completeTime;
  }

  public String getCurrentState()
  {
    return this.currentState;
  }

  public void setCurrentState(String currentState)
  {
    this.currentState = currentState;
  }

  public String getExecutionUnitRefList()
  {
    return this.executionUnitRefList;
  }

  public void setExecutionUnitRefList(String executionUnitRefList)
  {
    this.executionUnitRefList = executionUnitRefList;
  }

  public int getFaultCode()
  {
    return this.faultCode;
  }

  public void setFaultCode(int faultCode)
  {
    this.faultCode = faultCode;
  }

  public String getFaultString()
  {
    return this.faultString;
  }

  public void setFaultString(String faultString)
  {
    this.faultString = faultString;
  }

  public Date getStartTime()
  {
    return this.startTime;
  }

  public void setStartTime(Date startTime)
  {
    this.startTime = startTime;
  }

  public String getUuid()
  {
    return this.uuid;
  }

  public void setUuid(String uuid)
  {
    this.uuid = uuid;
  }

  public String getVersion()
  {
    return this.version;
  }

  public void setVersion(String version)
  {
    this.version = version;
  }

  public String getDeploymentUnitRef()
  {
    return this.deploymentUnitRef;
  }

  public void setDeploymentUnitRef(String deploymentUnitRef)
  {
    this.deploymentUnitRef = deploymentUnitRef;
  }

  public boolean isResolved()
  {
    return this.resolved;
  }

  public void setResolved(boolean resolved)
  {
    this.resolved = resolved;
  }
}