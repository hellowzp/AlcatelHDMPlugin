package hdm.functions.types.request;

import java.io.Serializable;

public class DownloadDTO
  implements Serializable
{
  public static final String FIRMWARE_UPGRADE_IMAGE = "1 Firmware Upgrade Image";
  public static final String WEB_CONTENT = "2 Web Content";
  public static final String VENDOR_CONFIGURATION_FILE = "3 Vendor Configuration File";
  public static final String TONE_FILE = "4 Tone File";
  public static final String RINGER_FILE = "5 Ringer File";
  private String fileType;
  private String URL;
  private String username;
  private String password;
  private long filesize;
  private String targetFilename;
  private long delaySeconds;
  private String successURL;
  private String failureURL;

  public DownloadDTO()
  {
  }

  public DownloadDTO(String fileType, String url, String username, String password, int filesize, String targetFilename, int delaySeconds, String successURL, String failureURL)
  {
    this.fileType = fileType;
    this.URL = url;
    this.username = username;
    this.password = password;
    this.filesize = filesize;
    this.targetFilename = targetFilename;
    this.delaySeconds = delaySeconds;
    this.successURL = successURL;
    this.failureURL = failureURL;
  }

  public long getDelaySeconds()
  {
    return this.delaySeconds;
  }

  public void setDelaySeconds(long delaySeconds)
  {
    this.delaySeconds = delaySeconds;
  }

  public String getFailureURL()
  {
    return this.failureURL;
  }

  public void setFailureURL(String failureURL)
  {
    this.failureURL = failureURL;
  }

  public long getFilesize()
  {
    return this.filesize;
  }

  public void setFilesize(long filesize)
  {
    this.filesize = filesize;
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

  public String getSuccessURL()
  {
    return this.successURL;
  }

  public void setSuccessURL(String successURL)
  {
    this.successURL = successURL;
  }

  public String getTargetFilename()
  {
    return this.targetFilename;
  }

  public void setTargetFilename(String targetFilename)
  {
    this.targetFilename = targetFilename;
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