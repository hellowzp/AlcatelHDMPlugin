package hdm.functions.types.request;

import java.io.Serializable;

public class FirmwareUpdateDTO
  implements Serializable
{
  private DownloadDTO download;
  private String prerequisiteSoftwareVersion;
  private String firmwareImageCorrelationKey;

  public FirmwareUpdateDTO()
  {
    this.download = new DownloadDTO();
    this.download.setFileType("1 Firmware Upgrade Image");
  }

  public FirmwareUpdateDTO(DownloadDTO download, String prerequisiteSoftwareVersion)
  {
    this.download = download;
    this.download.setFileType("1 Firmware Upgrade Image");
    this.prerequisiteSoftwareVersion = prerequisiteSoftwareVersion;
  }

  public String getFirmwareImageCorrelationKey() {
    return this.firmwareImageCorrelationKey;
  }

  public void setFirmwareImageCorrelationKey(String correlationKey) {
    this.firmwareImageCorrelationKey = correlationKey;
  }

  public long getDelaySeconds() {
    return this.download.getDelaySeconds();
  }

  public long getFilesize() {
    return this.download.getFilesize();
  }

  public String getPassword() {
    return this.download.getPassword();
  }

  public String getTargetFilename() {
    return this.download.getTargetFilename();
  }

  public String getURL() {
    return this.download.getURL();
  }

  public String getUsername() {
    return this.download.getUsername();
  }

  public void setDelaySeconds(long delaySeconds) {
    this.download.setDelaySeconds(delaySeconds);
  }

  public void setFilesize(long filesize) {
    this.download.setFilesize(filesize);
  }

  public void setPassword(String password) {
    this.download.setPassword(password);
  }

  public void setSuccessURL(String successURL) {
    this.download.setSuccessURL(successURL);
  }

  public String getSuccessURL() {
    return this.download.getSuccessURL();
  }

  public String getFailureURL() {
    return this.download.getFailureURL();
  }

  public void setFailureURL(String failureURL) {
    this.download.setFailureURL(failureURL);
  }

  public void setTargetFilename(String targetFilename) {
    this.download.setTargetFilename(targetFilename);
  }

  public void setURL(String url) {
    this.download.setURL(url);
  }

  public void setUsername(String username) {
    this.download.setUsername(username);
  }

  public String getPrerequisiteSoftwareVersion() {
    return this.prerequisiteSoftwareVersion;
  }

  public void setPrerequisiteSoftwareVersion(String prerequisiteSoftwareVersion) {
    this.prerequisiteSoftwareVersion = prerequisiteSoftwareVersion;
  }

  public DownloadDTO getDownload() {
    return this.download;
  }

  public void setDownload(DownloadDTO download) {
    this.download = download;
  }
}