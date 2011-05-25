package com.evolutionnext.cdiscala.account

import reflect.BeanProperty
import javax.inject.Named
import javax.enterprise.context.ConversationScoped

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 3/29/11
 * Time: 5:18 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@Named("newAccount")
@ConversationScoped
class Account(@BeanProperty var id: Long,
              @BeanProperty var firstName: String,
              @BeanProperty var lastName: String,
              @BeanProperty var password: String) {

              override def toString = "Account(%s, %s)".format(firstName, lastName)
              override def equals(other:Any) = {
                   if (!other.isInstanceOf[Account]) false
                   val otherAccount = other.asInstanceOf[Account]
                   otherAccount.firstName == this.firstName &&
                   otherAccount.lastName == this.lastName
              }
              override def hashCode:Int = firstName.hashCode + lastName.hashCode + 33
}
