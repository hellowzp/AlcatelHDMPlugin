package hdm.functions.tag;

import java.io.Serializable;

public class JCFServiceTag
  implements Serializable
{
  private static final long serialVersionUID = 6770894260432447605L;
  private String name;
  private String value;
  private JCFTagCondition condition;
  private String factoryResetValue;
  private boolean copyOnFactoryReset;
  private boolean removed;
  private static final int HASH_PRIME = 1000003;

  public JCFServiceTag(String name, String value)
  {
    this.name = name;
    this.value = value;
    this.removed = false;
    this.condition = JCFTagCondition.ANY;
  }

  public JCFServiceTag(String name, String value, JCFTagCondition condition)
  {
    this.name = name;
    this.value = value;
    this.condition = condition;
    this.removed = false;
  }

  public JCFServiceTag(String name, String value, String factoryResetValue, boolean copyOnFactoryReset, JCFTagCondition condition)
  {
    this.name = name;
    this.value = value;
    this.condition = condition;
    this.factoryResetValue = factoryResetValue;
    this.copyOnFactoryReset = copyOnFactoryReset;
    this.removed = false;
  }

  public JCFServiceTag(String name, String value, String factoryResetValue, boolean copyOnFactoryReset)
  {
    this.name = name;
    this.value = value;
    this.copyOnFactoryReset = copyOnFactoryReset;
    this.factoryResetValue = factoryResetValue;
    this.removed = false;
    this.condition = JCFTagCondition.ANY;
  }

  public String getName()
  {
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

  public String getFactoryResetValue() {
    return this.factoryResetValue;
  }

  public void setFactoryResetValue(String factoryResetValue) {
    this.factoryResetValue = factoryResetValue;
  }

  public boolean isCopyOnFactoryReset() {
    return this.copyOnFactoryReset;
  }

  public void setCopyOnFactoryReset(boolean copyOnFactoryReset) {
    this.copyOnFactoryReset = copyOnFactoryReset;
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
    JCFServiceTag object = (JCFServiceTag)obj;

    if ((this.name.equals(object.name)) && (this.condition.equals(object.condition))) {
      return true;
    }
    return false;
  }

  public String toString()
  {
    StringBuilder sb = new StringBuilder();

    sb.append("JCFServiceTag:\tName: ");
    sb.append(this.name);
    sb.append("\t- Value :");
    sb.append(this.value);
    sb.append("\t- Factory Reset Value: ");
    sb.append(this.factoryResetValue);
    sb.append("\t- Copy on factory reset: ");
    sb.append(this.copyOnFactoryReset);
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