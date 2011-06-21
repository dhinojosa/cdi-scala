package com.evolutionnext.cdiscala.structuraltypes

import javax.inject.{Inject, Named}
import javax.enterprise.context.{Conversation, ConversationScoped}

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/20/11
 * Time: 2:35 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ConversationScoped
@Named
class CompletionService @Inject() (val conversation:Conversation) extends Serializable {


  type Completable = {def complete(msg:String)}

  def this() = this(null)

  def complete(completable:Completable) {
     completable.complete("Processing this object from Completion Service")
  }
}