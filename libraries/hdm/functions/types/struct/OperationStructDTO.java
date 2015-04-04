package hdm.functions.types.struct;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({InstallOperationStructDTO.class, UninstallOperationStructDTO.class, UpdateOperationStructDTO.class})
public abstract class OperationStructDTO
  implements Serializable
{
  private String uuid;
  private String version;
  private String url;
  private String username;
  private String password;

  public String getPassword()
  {
    return this.password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setUrl(String url)
  {
    this.url = url;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getUuid()
  {
    return this.uuid;
  }

  public void setUuid(String uuid)
  {
    this.uuid = uuid;
  }

  public void setVersion(String version)
  {
    this.version = version;
  }

  public String getVersion()
  {
    return this.version;
  }
}