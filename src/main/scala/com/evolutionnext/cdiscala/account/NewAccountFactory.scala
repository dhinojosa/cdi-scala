package com.evolutionnext.cdiscala.account

import javax.enterprise.inject.Produces
import com.evolutionnext.cdiscala.annotation.Blank
import org.jboss.seam.faces.context.conversation.Begin
import javax.inject.{Inject, Named}
import javax.enterprise.context.{ConversationScoped, Conversation}
import scala.Serializable
import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/31/11
 * Time: 10:32 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ConversationScoped
@Named
class NewAccountFactory @Inject() (val conversation: Conversation) extends scala.Serializable {

  def this() = this(null)

  @Produces
  @Blank
  @ConversationScoped
  @Named("blankAccount")
  def getNewAccount = {
    println("con: " + conversation)
    conversation.begin()
    new Account
  }
}