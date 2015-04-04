package hdm.functions.types.response;

import java.io.Serializable;

public class DataModelDiscoveryResponseDTO
  implements ResponseDTO, Serializable
{
  private static final long serialVersionUID = 4529476902857934181L;
  private String manufacturer;
  private Long customActivationPolicyId;
  private boolean hasDefaultDataModel;

  public DataModelDiscoveryResponseDTO(String manufacturer)
  {
    this.manufacturer = manufacturer;
  }

  public String getManufacturer()
  {
    return this.manufacturer;
  }

  public void setManufacturer(String manufacturer)
  {
    this.manufacturer = manufacturer;
  }

  public Long getCustomActivationPolicyId()
  {
    return this.customActivationPolicyId;
  }

  public boolean hasDefaultDataModel()
  {
    return this.hasDefaultDataModel;
  }

  public void setHasDefaultDataModel(boolean hasDefaultDataModel)
  {
    this.hasDefaultDataModel = hasDefaultDataModel;
  }

  public void setCustomActivationPolicyId(Long customActivationPolicyId)
  {
    this.customActivationPolicyId = customActivationPolicyId;
  }

  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("DataModelDiscoveryRespomseDTO [");
    if (this.manufacturer != null)
      builder.append("manufacturer=").append(this.manufacturer);
    if (this.customActivationPolicyId != null)
      builder.append(",customActivationPolicyId=").append(this.customActivationPolicyId);
    builder.append(",hasDefaultDataModel=").append(this.hasDefaultDataModel);
    builder.append("]");
    return builder.toString();
  }
}