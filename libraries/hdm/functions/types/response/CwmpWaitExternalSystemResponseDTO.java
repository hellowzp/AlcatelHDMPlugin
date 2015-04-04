package hdm.functions.types.response;

import java.io.Serializable;
import java.util.Properties;

public class CwmpWaitExternalSystemResponseDTO
  implements ResponseDTO, Serializable
{
  private static final long serialVersionUID = 2881344772374318311L;
  private Properties props;

  public Properties getProperties()
  {
    return this.props;
  }

  public void setProperties(Properties props) {
    this.props = props;
  }
}