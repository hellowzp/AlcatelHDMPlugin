package hdm.functions.types.request;

import hdm.functions.types.struct.ParameterValueStructDTO;
import java.io.Serializable;

public class SetParameterValuesDTO
  implements Serializable
{
  public static final String TR69_TYPE_INT = "int";
  public static final String TR69_TYPE_LONG = "long";
  public static final String TR69_TYPE_UNSIGNED_INT = "unsignedInt";
  public static final String TR69_TYPE_STRING = "string";
  public static final String TR69_TYPE_DATETIME = "dateTime";
  public static final String TR69_TYPE_BOOLEAN = "boolean";
  public static final String TR69_TYPE_BASE64 = "base64";
  public static final String TR69_TYPE_UNSIGNED_LONG = "unsignedLong";
  public static final String TR69_TYPE_HEX_BINARY = "hexBinary";
  private ParameterValueStructDTO[] parameterValueStructs;
  private String parameterKey;

  public SetParameterValuesDTO()
  {
  }

  public SetParameterValuesDTO(ParameterValueStructDTO[] parameterValueStructs, String parameterKey)
  {
    this.parameterValueStructs = parameterValueStructs;
    this.parameterKey = parameterKey;
  }

  public ParameterValueStructDTO[] getParameterValueStructs()
  {
    return this.parameterValueStructs;
  }

  public void setParameterValueStructs(ParameterValueStructDTO[] parameterValueStructs)
  {
    this.parameterValueStructs = parameterValueStructs;
  }

  public String getParameterKey()
  {
    return this.parameterKey;
  }

  public void setParameterKey(String parameterKey)
  {
    this.parameterKey = parameterKey;
  }
}