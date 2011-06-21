package com.evolutionnext.cdiscala.account

import com.evolutionnext.cdiscala.annotation.Blank
import javax.enterprise.context.Conversation
import javax.enterprise.context.ConversationScoped
import javax.inject.Inject
import javax.inject.Named
import javax.persistence.EntityManager
import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/6/11
 * Time: 11:30 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@ConversationScoped
@Named
class AccountBean @Inject() (val entityManager:EntityManager,
                   val conversation:Conversation,
                   @Blank val account: Account) extends scala.Serializable {

  def this() = this(null, null, null)

  def persist() {
    conversation.end()
    val copyAccount: Account = new Account()
    copyAccount.setFirstName(account.getFirstName)
    copyAccount.setLastName(account.getLastName)
    copyAccount.setPassword(account.getPassword)
    entityManager.persist(copyAccount)
  }
}