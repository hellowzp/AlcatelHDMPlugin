package hdm.functions.types.request;

import hdm.functions.types.response.ResponseDTO;
import hdm.functions.types.struct.AutonOpResultStructDTO;
import java.io.Serializable;

public class AutonomousDUStateChangeDTO
  implements ResponseDTO, Serializable
{
  private AutonOpResultStructDTO[] autonomousOperationResult;

  public AutonOpResultStructDTO[] getAutonomousOperationResult()
  {
    return this.autonomousOperationResult;
  }

  public void setAutonomousOperationResult(AutonOpResultStructDTO[] autonomousOperationResult)
  {
    this.autonomousOperationResult = autonomousOperationResult;
  }
}