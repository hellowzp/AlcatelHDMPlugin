package hdm.functions.types.struct;

import java.io.Serializable;

public class TimeWindowStructDTO
  implements Serializable
{
  public static final String AT_ANY_TIME = "1 At Any Time";
  public static final String IMMEDIATELY = "2 Immediately";
  public static final String WHEN_IDLE = "3 When Idle";
  public static final String CONFIRMATION_NEEDED = "4 Confirmation Needed";
  private String windowStart;
  private String windowEnd;
  private String windowMode;
  private String userMessage;
  private int MaxRetries;

  public String getWindowStart()
  {
    return this.windowStart;
  }
  public void setWindowStart(String windowStart) {
    this.windowStart = windowStart;
  }
  public String getWindowEnd() {
    return this.windowEnd;
  }
  public void setWindowEnd(String windowEnd) {
    this.windowEnd = windowEnd;
  }
  public String getWindowMode() {
    return this.windowMode;
  }
  public void setWindowMode(String windowMode) {
    this.windowMode = windowMode;
  }
  public String getUserMessage() {
    return this.userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }
  public int getMaxRetries() {
    return this.MaxRetries;
  }
  public void setMaxRetries(int maxRetries) {
    this.MaxRetries = maxRetries;
  }
}