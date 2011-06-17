package com.evolutionnext.cdiscala.objectz

import javax.enterprise.context.ConversationScoped
import javax.inject.Named

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/16/11
 * Time: 7:08 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ConversationScoped
@Named
object CoffeeMaker extends Serializable {
   def brewKona() = new Coffee("Kona")
}