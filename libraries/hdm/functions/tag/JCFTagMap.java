package hdm.functions.tag;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import motive.trace.TraceLogger;
import org.apache.log4j.Logger;

public class JCFTagMap
  implements Serializable
{
  private static final long serialVersionUID = -3038024996105467281L;
  private Set<JCFUserTag> userTags;
  private Set<JCFServiceTag> serviceTags;
  private static final Logger logger = TraceLogger.getLogger(JCFTagMap.class);

  public JCFTagMap() {
    this.userTags = new HashSet();
    this.serviceTags = new HashSet();
  }

  public void setUserTagInCache(String userTagName, String userTagValue, JCFTagCondition condition)
  {
    if (condition.equals(JCFTagCondition.ANY))
    {
      setUserTag(userTagName, userTagValue, JCFTagCondition.SUCCESS);
      setUserTag(userTagName, userTagValue, JCFTagCondition.FAILURE);
    }
    else
    {
      setUserTag(userTagName, userTagValue, condition);
    }
  }

  private void setUserTag(String userTagName, String userTagValue, JCFTagCondition condition)
  {
    JCFUserTag newUserTag = new JCFUserTag(userTagName, userTagValue, condition);

    boolean alreadyExists = this.userTags.contains(newUserTag);

    if (alreadyExists) {
      logger.info(new StringBuilder().append(userTagName).append(" already exists in the cache. It will be overwritten...").toString());

      this.userTags.remove(newUserTag);
    }

    this.userTags.add(newUserTag);
    if (logger.isDebugEnabled())
      logger.debug(new StringBuilder().append("Tag has been added to the cache.").append(newUserTag.toString()).toString());
  }

  public String getUserTagInCache(String userTagName, JCFTagCondition condition) {
    for (Iterator iter = this.userTags.iterator(); iter.hasNext(); ) {
      JCFUserTag tag = (JCFUserTag)iter.next();
      if ((tag.getName().equals(userTagName)) && (
        (tag.getCondition().equals(condition)) || (condition.equals(JCFTagCondition.ANY)))) {
        return tag.getValue();
      }
    }
    return null;
  }

  public void clearUserTagInCache(String userTagName, JCFTagCondition condition)
  {
    if (condition.equals(JCFTagCondition.ANY))
    {
      clearUserTag(userTagName, JCFTagCondition.SUCCESS);
      clearUserTag(userTagName, JCFTagCondition.FAILURE);
    }
    else
    {
      clearUserTag(userTagName, condition);
    }
  }

  private void clearUserTag(String userTagName, JCFTagCondition condition) {
    boolean tagExists = false;
    JCFUserTag tag = null;
    for (Iterator iter = this.userTags.iterator(); iter.hasNext(); ) {
      tag = (JCFUserTag)iter.next();
      if ((tag.getName().equals(userTagName)) && (tag.getCondition().equals(condition))) {
        tagExists = true;
      }

    }

    if (tagExists) {
      this.userTags.remove(tag);
      if (logger.isDebugEnabled())
        logger.debug(new StringBuilder().append("Tag has been removed from the cache. :").append(tag.toString()).toString());
    }
    else
    {
      logger.warn(new StringBuilder().append("Tag could not be found in the cache. Name :").append(userTagName).append(" Condition: ").append(condition.toString()).toString());
    }
  }

  public void setServiceTagInCache(String serviceTagName, String serviceTagValue, JCFTagCondition condition)
  {
    if (condition.equals(JCFTagCondition.ANY))
    {
      setServiceTag(serviceTagName, serviceTagValue, JCFTagCondition.SUCCESS);
      setServiceTag(serviceTagName, serviceTagValue, JCFTagCondition.FAILURE);
    }
    else
    {
      setServiceTag(serviceTagName, serviceTagValue, condition);
    }
  }

  public void setServiceTagInCache(String serviceTagName, String serviceTagValue, String factoryResetValue, boolean copyOnFactoryReset, JCFTagCondition condition)
  {
    if (condition.equals(JCFTagCondition.ANY))
    {
      setServiceTag(serviceTagName, serviceTagValue, factoryResetValue, copyOnFactoryReset, JCFTagCondition.SUCCESS);

      setServiceTag(serviceTagName, serviceTagValue, factoryResetValue, copyOnFactoryReset, JCFTagCondition.FAILURE);
    }
    else
    {
      setServiceTag(serviceTagName, serviceTagValue, factoryResetValue, copyOnFactoryReset, condition);
    }
  }

  private void setServiceTag(String serviceTagName, String serviceTagValue, JCFTagCondition condition)
  {
    JCFServiceTag newServiceTag = new JCFServiceTag(serviceTagName, serviceTagValue, condition);

    boolean alreadyExists = this.serviceTags.contains(newServiceTag);

    if (alreadyExists) {
      logger.info(new StringBuilder().append(serviceTagName).append(" already exists in the cache. It will be overwritten...").toString());

      this.serviceTags.remove(newServiceTag);
    }

    this.serviceTags.add(newServiceTag);
    if (logger.isDebugEnabled())
      logger.debug(new StringBuilder().append("Tag has been added to the cache: ").append(newServiceTag.toString()).toString());
  }

  private void setServiceTag(String serviceTagName, String serviceTagValue, String factoryResetValue, boolean copyOnFactoryReset, JCFTagCondition condition)
  {
    JCFServiceTag newServiceTag = new JCFServiceTag(serviceTagName, serviceTagValue, factoryResetValue, copyOnFactoryReset, condition);

    boolean alreadyExists = this.serviceTags.contains(newServiceTag);

    if (alreadyExists) {
      logger.info(new StringBuilder().append(serviceTagName).append(" already exists in the cache. It will be overwritten...").toString());

      this.serviceTags.remove(newServiceTag);
    }

    this.serviceTags.add(newServiceTag);
    if (logger.isDebugEnabled())
      logger.debug(new StringBuilder().append("Tag has been added to the cache: ").append(newServiceTag.toString()).toString());
  }

  public String getServiceTagInCache(String serviceTagName, JCFTagCondition condition)
  {
    String value = null;

    for (Iterator iter = this.serviceTags.iterator(); iter.hasNext(); ) {
      JCFServiceTag tag = (JCFServiceTag)iter.next();
      if ((tag.getName().equals(serviceTagName)) && (
        (tag.getCondition().equals(condition)) || (condition.equals(JCFTagCondition.ANY))))
      {
        value = tag.getValue();
        break;
      }
    }

    return value;
  }

  public void clearServiceTagInCache(String serviceTagName, JCFTagCondition condition)
  {
    if (condition.equals(JCFTagCondition.ANY))
    {
      clearServiceTag(serviceTagName, JCFTagCondition.SUCCESS);
      clearServiceTag(serviceTagName, JCFTagCondition.FAILURE);
    }
    else
    {
      clearServiceTag(serviceTagName, condition);
    }
  }

  private void clearServiceTag(String serviceTagName, JCFTagCondition condition)
  {
    boolean tagExists = false;
    JCFServiceTag tag = null;
    for (Iterator iter = this.serviceTags.iterator(); iter.hasNext(); ) {
      tag = (JCFServiceTag)iter.next();
      if ((tag.getName().equals(serviceTagName)) && (tag.getCondition().equals(condition))) {
        tagExists = true;
      }

    }

    if (tagExists) {
      this.serviceTags.remove(tag);
      if (logger.isDebugEnabled())
        logger.debug(new StringBuilder().append("Tag has been removed from the cache.: ").append(tag.toString()).toString());
    }
    else {
      logger.warn(new StringBuilder().append("Tag could not be found in the cache. Name :").append(serviceTagName).append(" Condition: ").append(condition.toString()).toString());
    }
  }

  public Set<JCFUserTag> getUserTags() {
    return this.userTags;
  }

  public Set<JCFServiceTag> getServiceTags() {
    return this.serviceTags;
  }

  public void setUserTags(Set<JCFUserTag> userTags) {
    this.userTags = userTags;
  }

  public void setServiceTags(Set<JCFServiceTag> serviceTags) {
    this.serviceTags = serviceTags;
  }

  public String toString()
  {
    StringBuilder sb = new StringBuilder();

    sb.append("JCFTagMap:\n");
    sb.append("Cached service tags ---> \n");

    if (this.serviceTags != null)
    {
      for (JCFServiceTag serviceTag : this.serviceTags) {
        sb.append(serviceTag.toString());
        sb.append("\n");
      }
    }
    else
    {
      sb.append("There are no service tags in the cache...\n");
    }

    sb.append("Cached user tags ---> \n");

    if ((this.userTags != null) || (this.userTags.size() != 0)) {
      for (JCFUserTag userTag : this.userTags) {
        sb.append(userTag.toString());
        sb.append("\n");
      }
    }
    else {
      sb.append("There are no user tags in the cache...");
    }

    return sb.toString();
  }
}