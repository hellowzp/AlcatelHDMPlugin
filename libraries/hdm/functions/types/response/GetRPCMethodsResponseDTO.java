package hdm.functions.types.response;

import java.io.Serializable;

public class GetRPCMethodsResponseDTO
  implements ResponseDTO, Serializable
{
  private String[] methodList;

  public String[] getMethodList()
  {
    return this.methodList;
  }

  public void setMethodList(String[] methodList)
  {
    this.methodList = methodList;
  }
}