package hdm.functions.types.struct;

public class SnmpParameterValueStructDTO extends ParameterValueStructDTO
{
  private String oid;

  public String getOid()
  {
    return this.oid;
  }

  public void setOid(String oid)
  {
    this.oid = oid;
  }
}