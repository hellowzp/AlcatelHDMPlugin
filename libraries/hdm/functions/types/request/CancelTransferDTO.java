package hdm.functions.types.request;

import java.io.Serializable;

public class CancelTransferDTO
  implements Serializable
{
  private static final long serialVersionUID = 105453344787034480L;
  private String commandKey;
  private String policyID;

  public CancelTransferDTO()
  {
  }

  public CancelTransferDTO(String commandKey)
  {
    this.commandKey = commandKey;
  }

  public String getCommandKey() {
    return this.commandKey;
  }

  public void setCommandKey(String commandKey) {
    this.commandKey = commandKey;
  }

  public String getPolicyID() {
    return this.policyID;
  }

  public void setPolicyID(String policyID) {
    this.policyID = policyID;
  }
}