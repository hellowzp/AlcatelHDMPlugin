package hdm.functions.metadata;

import java.io.Serializable;

public class FunctionMetaData
  implements Serializable
{
  private boolean deviceTypeBound;
  private String nameKey;
  private String description;
  private int functionCode;
  private ArgumentMetaData[] argumentMetaDatas;
  private ScriptMappingMetaData[] scriptMappings;

  public ScriptMappingMetaData[] getScriptMappings()
  {
    return this.scriptMappings;
  }

  public void setScriptMappings(ScriptMappingMetaData[] scriptMappings) {
    this.scriptMappings = scriptMappings;
  }

  public ArgumentMetaData[] getArgumentMetaDatas() {
    return this.argumentMetaDatas;
  }

  public void setArgumentMetaDatas(ArgumentMetaData[] argumentMetaDatas) {
    this.argumentMetaDatas = argumentMetaDatas;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNameKey() {
    return this.nameKey;
  }

  public void setNameKey(String nameKey) {
    this.nameKey = nameKey;
  }

  public int getFunctionCode() {
    return this.functionCode;
  }

  public void setFunctionCode(int functionCode) {
    this.functionCode = functionCode;
  }

  public boolean isDeviceTypeBound() {
    return this.deviceTypeBound;
  }

  public void setDeviceTypeBound(boolean deviceTypeBound) {
    this.deviceTypeBound = deviceTypeBound;
  }
}