package hdm.functions.metadata;

import java.io.Serializable;

public abstract class ArgumentMetaData
  implements Serializable
{
  public static final String TYPE_ADD_OBJECT = "AddObjectDTO";
  public static final String TYPE_DELETE_OBJECT = "DeleteObjectDTO";
  public static final String TYPE_DOWNLOAD = "DownloadDTO";
  public static final String TYPE_SCHEDULE_DOWNLOAD = "ScheduleDownloadDTO";
  public static final String TYPE_FIRMWARE_UPDATE = "FirmwareUpdateDTO";
  public static final String TYPE_GET_OPTIONS = "GetOptionsDTO";
  public static final String TYPE_GET_PARAMETER_ATTRIBUTES = "GetParameterAttributesDTO";
  public static final String TYPE_GET_PARAMETER_NAMES = "GetParameterNamesDTO";
  public static final String TYPE_GET_PARAMETER_VALUES = "GetParameterValuesDTO";
  public static final String TYPE_RESTORE = "RestoreDTO";
  public static final String TYPE_SET_PARAMETER_ATTRIBUTES = "SetParameterAttributesDTO";
  public static final String TYPE_SET_PARAMETER_VALUES = "SetParameterValuesDTO";
  public static final String TYPE_SET_VOUCHERS = "SetVouchersDTO";
  public static final String TYPE_UPLOAD = "UploadDTO";
  public static final String TYPE_CHANGE_DEPLOYMENT_STATE = "ChangeDeploymentStateDTO";
  public static final String TYPE_CANCEL_TRANSFER = "CancelTransferDTO";
  public static final String TYPE_SNMP_SET_PARAMETER_VALUES = "SnmpSetParameterValuesDTO";
  public static final String TYPE_SNMP_GET_PARAMETER_VALUES = "SnmpGetParameterValuesDTO";
  public static final String TYPE_INTEGER = "integer";
  public static final String TYPE_LONG = "long";
  public static final String TYPE_STRING = "string";
  public static final String TYPE_DATE = "date";
  public static final String TYPE_BOOLEAN = "boolean";
  public static final String TYPE_UNSIGNED_INTEGER = "unsignedInt";
  public static final String TYPE_HEX_BINARY = "hexBinary";
  public static final String TYPE_UNSIGNED_LONG = "unsignedLong";
  public static final String TYPE_TEXT = "text";
  public static final String TYPE_CUSTOM = "Custom";
  private String name;
  private String type;
  private String description;

  public String getName()
  {
    return this.name;
  }
  public String getType() {
    return this.type;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
}