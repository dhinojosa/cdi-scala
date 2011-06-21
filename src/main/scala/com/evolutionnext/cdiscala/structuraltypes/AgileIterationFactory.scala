package com.evolutionnext.cdiscala.structuraltypes

import com.evolutionnext.cdiscala.annotation.Blank
import javax.enterprise.context.{Conversation, ConversationScoped}
import javax.inject.{Inject, Named}
import javax.enterprise.inject.Produces

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/21/11
 * Time: 2:19 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@ConversationScoped
class AgileIterationFactory @Inject() (val conversation:Conversation) extends Serializable {

  def this() = this(null)

  @Produces
  @ConversationScoped
  @Blank
  @Named("newAgileIteration")
  def createBlankAgileIterationFactory:AgileIteration = {
    conversation.begin()
    new AgileIteration("New Job", "New Customer")
  }
}