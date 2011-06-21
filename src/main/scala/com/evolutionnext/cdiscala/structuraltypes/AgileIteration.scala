package com.evolutionnext.cdiscala.structuraltypes

import javax.inject.Named
import javax.enterprise.context.ConversationScoped
import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/20/11
 * Time: 2:39 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */


class AgileIteration (@BeanProperty var job:String, @BeanProperty var customer:String) extends Serializable {

    @BeanProperty var status:String  = _

    def this() = this("", "")

    def complete(msg:String) { println("completing iteration" + job); status = msg}
}