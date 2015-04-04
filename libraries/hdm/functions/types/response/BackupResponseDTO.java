package hdm.functions.types.response;

import java.io.Serializable;

public class BackupResponseDTO
  implements ResponseDTO, Serializable
{
  private long backupId;

  public long getBackupId()
  {
    return this.backupId;
  }

  public void setBackupId(long backupId)
  {
    this.backupId = backupId;
  }
}