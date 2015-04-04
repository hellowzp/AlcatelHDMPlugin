package hdm.functions.types.request;

import java.io.Serializable;

public class UploadDTO
  implements Serializable
{
  public static final String VENDOR_CONFIGURATION_FILE = "1 Vendor Configuration File";
  public static final String VENDOR_LOG_FILE = "2 Vendor Log File";
  private String fileType;
  private String URL;
  private String username;
  private String password;
  private long delaySeconds;

  public UploadDTO()
  {
  }

  public UploadDTO(String fileType, String url, String username, String password, long delaySeconds)
  {
    this.fileType = fileType;
    this.URL = url;
    this.username = username;
    this.password = password;
    this.delaySeconds = delaySeconds;
  }

  public long getDelaySeconds()
  {
    return this.delaySeconds;
  }

  public void setDelaySeconds(long delaySeconds)
  {
    this.delaySeconds = delaySeconds;
  }

  public String getFileType()
  {
    return this.fileType;
  }

  public void setFileType(String fileType)
  {
    this.fileType = fileType;
  }

  public String getPassword()
  {
    return this.password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getURL()
  {
    return this.URL;
  }

  public void setURL(String url)
  {
    this.URL = url;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }
}