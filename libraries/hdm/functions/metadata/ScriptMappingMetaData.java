package hdm.functions.metadata;

public class ScriptMappingMetaData
{
  private DeviceTypeMetaData deviceType;
  private String softwareVersion;
  private String jsContentMappingName;
  private boolean isDefault;
  private int order;
  private String dataModelType;

  public ScriptMappingMetaData()
  {
  }

  public ScriptMappingMetaData(DeviceTypeMetaData deviceType, String softwareVersion, String jsContentMappingName, boolean isDefault, int order, String dataModelType)
  {
    this.deviceType = deviceType;
    this.softwareVersion = softwareVersion;
    this.jsContentMappingName = jsContentMappingName;
    this.isDefault = isDefault;
    this.order = order;
    this.dataModelType = dataModelType;
  }

  public DeviceTypeMetaData getDeviceType() {
    return this.deviceType;
  }

  public void setDeviceType(DeviceTypeMetaData deviceType) {
    this.deviceType = deviceType;
  }

  public String getSoftwareVersion() {
    return this.softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getJsContentMappingName() {
    return this.jsContentMappingName;
  }

  public void setJsContentMappingName(String jsContentMappingName) {
    this.jsContentMappingName = jsContentMappingName;
  }

  public boolean isDefault() {
    return this.isDefault;
  }

  public void setDefault(boolean isDefault) {
    this.isDefault = isDefault;
  }

  public int getOrder() {
    return this.order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public String getDataModelType() {
    return this.dataModelType;
  }

  public void setDataModelType(String dataModelType) {
    this.dataModelType = dataModelType;
  }
}