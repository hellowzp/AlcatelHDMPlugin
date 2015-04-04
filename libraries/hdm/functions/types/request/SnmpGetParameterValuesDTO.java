package hdm.functions.types.request;

import hdm.functions.types.struct.SnmpGetParameterStructDTO;
import java.io.Serializable;

public class SnmpGetParameterValuesDTO
  implements Serializable
{
  private SnmpGetParameterStructDTO[] snmpGetParameterStructs;

  public SnmpGetParameterStructDTO[] getSnmpGetParameterStructs()
  {
    return this.snmpGetParameterStructs;
  }

  public void setSnmpGetParameterStructs(SnmpGetParameterStructDTO[] snmpGetParameterStructs)
  {
    this.snmpGetParameterStructs = snmpGetParameterStructs;
  }
}