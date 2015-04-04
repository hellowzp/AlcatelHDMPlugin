package hdm.functions.tag;

import java.io.Serializable;

public class JCFDynamicVariable
  implements Serializable
{
  private static final long serialVersionUID = -1049923120589137887L;
  private static final int HASH_PRIME = 1000003;
  public static final String SENSITIVE_VALUE = "*";
  private String name;
  private String value;
  private Boolean sensitive;
  private Boolean encrypt;

  public JCFDynamicVariable()
  {
  }

  public JCFDynamicVariable(String name, String value)
  {
    this.name = name;
    this.value = value;
    this.sensitive = Boolean.FALSE;
    this.encrypt = Boolean.FALSE;
  }

  public JCFDynamicVariable(String name, String value, Boolean sensitive, Boolean encrypt)
  {
    this.name = name;
    this.value = value;
    this.sensitive = sensitive;
    this.encrypt = encrypt;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getValue()
  {
    return this.value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public Boolean isSensitive()
  {
    return this.sensitive;
  }

  public void setSensitive(Boolean sensitive)
  {
    this.sensitive = sensitive;
  }

  public Boolean isEncrypt()
  {
    return this.encrypt;
  }

  public void setEncrypt(Boolean encrypted)
  {
    this.encrypt = encrypted;
  }

  public boolean equals(Object obj)
  {
    if (obj == null)
      return false;
    if (!(obj instanceof JCFDynamicVariable)) {
      return false;
    }
    JCFDynamicVariable dv = (JCFDynamicVariable)obj;

    if ((dv.getName() == null ? dv.getName() == this.name : dv.getName().equals(this.name)) && (dv.getValue() == null ? dv.getValue() == this.value : dv.getValue().equals(this.value)) && (dv.isEncrypt() == null ? dv.isEncrypt() == this.encrypt : dv.isEncrypt().equals(this.encrypt)) && (dv.isSensitive() == null ? dv.isSensitive() == this.sensitive : dv.isSensitive().equals(this.sensitive)))
    {
      return true;
    }
    return false;
  }

  public int hashCode()
  {
    int result = 0;

    result = 1000003 * result + this.name.hashCode();
    result = 1000003 * result + (this.encrypt == null ? 1 : this.encrypt.hashCode());
    result = 1000003 * result + (this.sensitive == null ? 17 : this.sensitive.hashCode());
    result = 1000003 * result + (this.value == null ? 71 : this.value.hashCode());

    return result;
  }
}