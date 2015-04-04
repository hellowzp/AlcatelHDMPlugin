package hdm.commons.action;

import hdm.commons.DeviceID;
import hdm.commons.PrimitiveDataEvent;
import hdm.functions.types.response.GetOptionsResponseDTO;
import java.util.Map;

public abstract interface Action
{
  public abstract Long getId();

  public abstract PrimitiveDataEvent[] getPrimitiveDataEvents();

  public abstract void addPrimitiveDataEvents(PrimitiveDataEvent[] paramArrayOfPrimitiveDataEvent);

  public abstract void addPrimitiveOptionEvents(GetOptionsResponseDTO[] paramArrayOfGetOptionsResponseDTO);

  public abstract GetOptionsResponseDTO[] getPrimitiveOptionEvents();

  public abstract String getPrimitiveFunctionName();

  public abstract int getPrimitiveFunctionState();

  public abstract void setPrimitiveFunctionState(int paramInt);

  public abstract String getIrptHandlerSymbol();

  public abstract Map getPrimitiveContextMap();

  public abstract Map getCustomContextMap();

  public abstract Object[] getPrimitiveFunctionParameters();

  public abstract DeviceID getDeviceId();

  public abstract void setPrimitiveFunctionName(String paramString);

  public abstract void setPrimitiveFunctionParameters(Object[] paramArrayOfObject);

  public abstract void setIrptHandlerSymbol(String paramString);

  public abstract Long getCallerId();
}