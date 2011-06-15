package com.evolutionnext.cdiscala.account

import java.lang.Long
import javax.enterprise.inject.Produces
import javax.inject.{Inject, Named}
import org.jboss.seam.servlet.http.RequestParam
import javax.persistence.EntityManager
import com.evolutionnext.cdiscala.annotation.Persisted
import javax.enterprise.context.{RequestScoped, ConversationScoped}

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/31/11
 * Time: 10:51 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@RequestScoped
@Named
class AccountLoadById @Inject()(@RequestParam("accountID") id: Long,
                                entityManager: EntityManager) {


  def this() = this(null, null)

  @Produces
  @Persisted
  @ConversationScoped
  @Named("account")
  def load: Account = {
    println("id" + id)
    entityManager.find(classOf[Account], id)
  }
}