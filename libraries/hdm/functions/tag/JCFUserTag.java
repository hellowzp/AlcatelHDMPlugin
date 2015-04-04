package hdm.functions.tag;

import java.io.Serializable;

public class JCFUserTag
  implements Serializable
{
  private static final long serialVersionUID = -8894734437925910796L;
  private String name;
  private String value;
  private JCFTagCondition condition;
  private boolean removed;
  private static final int HASH_PRIME = 1000003;

  public JCFUserTag(String name, String value, JCFTagCondition condition)
  {
    this.name = name;
    this.value = value;
    this.condition = condition;
    this.removed = false;
  }

  public JCFUserTag(String name, String value)
  {
    this.name = name;
    this.value = value;
    this.condition = JCFTagCondition.ANY;
    this.removed = false;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getValue() {
    return this.value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  public JCFTagCondition getCondition() {
    return this.condition;
  }
  public void setCondition(JCFTagCondition condition) {
    this.condition = condition;
  }

  public boolean isRemoved()
  {
    return this.removed;
  }

  public void setRemoved(boolean removed)
  {
    this.removed = removed;
  }

  public boolean equals(Object obj)
  {
    JCFUserTag object = (JCFUserTag)obj;

    if ((this.name.equals(object.name)) && (this.condition.equals(object.condition)))
    {
      return true;
    }

    return false;
  }

  public String toString()
  {
    StringBuilder sb = new StringBuilder();

    sb.append("JCFUserTag:\tName: ");
    sb.append(this.name);
    sb.append("\t- Value :");
    sb.append(this.value);
    sb.append("\t- Condition : ");
    sb.append(this.condition.toString());

    return sb.toString();
  }

  public int hashCode()
  {
    int result = 0;

    result = 1000003 * result + this.name.hashCode();
    result = 1000003 * result + this.condition.hashCode();

    return result;
  }
}