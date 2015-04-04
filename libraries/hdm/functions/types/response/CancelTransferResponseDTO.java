package hdm.functions.types.response;

import java.io.Serializable;

public class CancelTransferResponseDTO
  implements ResponseDTO, Serializable
{
  private String commandKey;

  public CancelTransferResponseDTO()
  {
  }

  public CancelTransferResponseDTO(String commandKey)
  {
    this.commandKey = commandKey;
  }

  public String getCommandKey() {
    return this.commandKey;
  }

  public void setCommandKey(String commandKey) {
    this.commandKey = commandKey;
  }
}