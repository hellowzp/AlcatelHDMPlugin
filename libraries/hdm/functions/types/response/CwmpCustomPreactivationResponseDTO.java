package hdm.functions.types.response;

import java.io.Serializable;

public class CwmpCustomPreactivationResponseDTO
  implements ResponseDTO, Serializable
{
  private String pppoeUserName;
  private String pppoePassword;
  private String httpPublicUserName;
  private String httpPublicPassword;
  private String connectionRequestUserName;
  private String connectionRequestPassword;
  private String acsUrl;

  public String getPppoeUserName()
  {
    return this.pppoeUserName;
  }

  public void setPppoeUserName(String pppoeUserName) {
    this.pppoeUserName = pppoeUserName;
  }

  public String getPppoePassword() {
    return this.pppoePassword;
  }

  public void setPppoePassword(String pppoePassword) {
    this.pppoePassword = pppoePassword;
  }

  public String getHttpPublicUserName() {
    return this.httpPublicUserName;
  }

  public void setHttpPublicUserName(String httpPublicUserName) {
    this.httpPublicUserName = httpPublicUserName;
  }

  public String getHttpPublicPassword() {
    return this.httpPublicPassword;
  }

  public void setHttpPublicPassword(String httpPublicPassword) {
    this.httpPublicPassword = httpPublicPassword;
  }

  public String getConnectionRequestUserName() {
    return this.connectionRequestUserName;
  }

  public void setConnectionRequestUserName(String connectionRequestUserName) {
    this.connectionRequestUserName = connectionRequestUserName;
  }

  public String getConnectionRequestPassword() {
    return this.connectionRequestPassword;
  }

  public void setConnectionRequestPassword(String connectionRequestPassword) {
    this.connectionRequestPassword = connectionRequestPassword;
  }

  public String getAcsUrl() {
    return this.acsUrl;
  }

  public void setAcsUrl(String acsUrl) {
    this.acsUrl = acsUrl;
  }
}