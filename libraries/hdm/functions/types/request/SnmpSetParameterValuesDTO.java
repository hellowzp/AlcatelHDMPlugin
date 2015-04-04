package hdm.functions.types.request;

import hdm.functions.types.struct.SnmpParameterValueStructDTO;
import java.io.Serializable;

public class SnmpSetParameterValuesDTO
  implements Serializable
{
  public static final String SNMP_TYPE_COUNTER_32 = "counter32";
  public static final String SNMP_TYPE_COUNTER_64 = "counter64";
  public static final String SNMP_TYPE_INTEGER_32 = "integer32";
  public static final String SNMP_TYPE_ENUMERATED_INTEGER_32 = "enumeratedInteger32";
  public static final String SNMP_TYPE_UNSIGNED_INTEGER_32 = "unsignedInteger32";
  public static final String SNMP_TYPE_OPAQUE = "opaque";
  public static final String SNMP_TYPE_OID = "oid";
  public static final String SNMP_TYPE_GAUGE_32 = "gauge32";
  public static final String SNMP_TYPE_TIME_TICKS = "timeTicks";
  public static final String SNMP_TYPE_OCTET_STRING = "octetString";
  public static final String SNMP_TYPE_IP_ADDRESS = "ipAddress";
  public static final String SNMP_TYPE_GENERIC_ADDRESS = "genericAddress";
  private SnmpParameterValueStructDTO[] parameterValueStructs;

  public SnmpParameterValueStructDTO[] getParameterValueStructs()
  {
    return this.parameterValueStructs;
  }

  public void setParameterValueStructs(SnmpParameterValueStructDTO[] parameterValueStructs)
  {
    this.parameterValueStructs = parameterValueStructs;
  }
}