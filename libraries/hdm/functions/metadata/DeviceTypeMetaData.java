package hdm.functions.metadata;

public class DeviceTypeMetaData
{
  String OUI;
  String productClass;

  public DeviceTypeMetaData()
  {
  }

  public DeviceTypeMetaData(String OUI, String productClass)
  {
    this.OUI = OUI;
    this.productClass = productClass;
  }

  public String getOUI() {
    return this.OUI;
  }

  public void setOUI(String OUI) {
    this.OUI = OUI;
  }

  public String getProductClass() {
    return this.productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }
}