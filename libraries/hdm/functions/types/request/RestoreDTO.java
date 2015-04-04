package hdm.functions.types.request;

import java.io.Serializable;

public class RestoreDTO
  implements Serializable
{
  private Long backupId = null;

  public RestoreDTO() {
  }

  public RestoreDTO(Long backupId) {
    this.backupId = backupId;
  }

  public Long getBackupId()
  {
    return this.backupId;
  }

  public void setBackupId(Long backupId)
  {
    this.backupId = backupId;
  }
}