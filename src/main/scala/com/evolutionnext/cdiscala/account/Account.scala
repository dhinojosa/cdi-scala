package com.evolutionnext.cdiscala.account

import javax.persistence.{Entity, Id, GeneratedValue, GenerationType}
import scala.reflect.BeanProperty
import scala.annotation.target.beanGetter
/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/6/11
 * Time: 10:45 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@Entity
class Account(@(Id @beanGetter)
              @(GeneratedValue @beanGetter)(strategy = GenerationType.AUTO)
              @BeanProperty
              var id: Long,
              @BeanProperty
              var firstName: String,
              @BeanProperty
              var lastName: String,
              @BeanProperty
              var password: String) extends scala.Serializable {

   def this() =
      this(0L, "", "", "")
}