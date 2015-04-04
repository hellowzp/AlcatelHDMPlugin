package hdm.functions.metadata;

public class SimpleArgumentMetaData extends ArgumentMetaData
{
  public static final String REPRESENTATION_TYPE_TEXT = "TEXT";
  public static final String REPRESENTATION_TYPE_MASK_TEXT = "MASK_TEXT";
  public static final String REPRESENTATION_TYPE_TEXT_AREA = "MULTI_LINE_TEXT";
  public static final String REPRESENTATION_TYPE_CHOICE_LIST = "CHOICE_LIST";
  public static final String REPRESENTATION_TYPE_BOOLEAN = "BOOLEAN";
  public static final String REPRESENTATION_TYPE_DATETIME = "DATETIME";
  public static final String REPRESENTATION_TYPE_TEXT_ARRAY = "TEXTARRAY";
  public static final String REPRESENTATION_TYPE_EDITABLE_CHOICE_LIST = "EDITABLE_CHOICE_LIST";
  private boolean required;
  private String defaultValue;
  private String preLabel;
  private String postLabel;
  private String representationType;
  private String hint;
  private String[] choices;

  public String getDefaultValue()
  {
    return this.defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }
  public String getHint() {
    return this.hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }
  public String getPostLabel() {
    return this.postLabel;
  }
  public void setPostLabel(String postLabel) {
    this.postLabel = postLabel;
  }
  public String getPreLabel() {
    return this.preLabel;
  }
  public void setPreLabel(String preLabel) {
    this.preLabel = preLabel;
  }
  public String getRepresentationType() {
    return this.representationType;
  }
  public void setRepresentationType(String representationType) {
    this.representationType = representationType;
  }
  public boolean isRequired() {
    return this.required;
  }
  public void setRequired(boolean required) {
    this.required = required;
  }
  public void setChoices(String[] choices) {
    this.choices = choices;
  }
  public String[] getChoices() {
    return this.choices;
  }
}