package com.evolutionnext.cdiscala.account

import javax.persistence.EntityManager
import javax.enterprise.context.ConversationScoped
import javax.inject.{Named, Inject}
import com.evolutionnext.cdiscala.annotation.Persisted

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/6/11
 * Time: 5:09 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ConversationScoped
@Named
class UpdateDeleteAccountBean @Inject () (@Persisted val account: Account, val entityManager:EntityManager) extends scala.Serializable {

     def this() = this(null, null)

     def update() {
        entityManager.flush()
     }
}