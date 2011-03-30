package com.evolutionnext.cdiscala.account

import javax.enterprise.context.RequestScoped
import javax.inject.Named
import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 3/29/11
 * Time: 5:18 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@RequestScoped
@Named
class Account(@BeanProperty var firstName: String,
              @BeanProperty var lastName: String) {
  def this() = this ("Howie", "Long")
}