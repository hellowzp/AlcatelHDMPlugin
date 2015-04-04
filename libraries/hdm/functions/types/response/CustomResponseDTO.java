package hdm.functions.types.response;

import java.io.Serializable;

public class CustomResponseDTO
  implements ResponseDTO, Serializable
{
  private KeyValueResponseDTO[] responseDTOList;

  public CustomResponseDTO()
  {
  }

  public CustomResponseDTO(KeyValueResponseDTO[] responseDTOList)
  {
    setResponseDTOList(responseDTOList);
  }

  public KeyValueResponseDTO[] getResponseDTOList()
  {
    return this.responseDTOList;
  }

  public void setResponseDTOList(KeyValueResponseDTO[] responseDTOList)
  {
    this.responseDTOList = responseDTOList;
  }
}