package com.evolutionnext.cdiscala.`lazy`

import javax.inject.Named
import javax.enterprise.context.ConversationScoped
import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/16/11
 * Time: 6:39 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
@ConversationScoped
@Named
class LazyBean extends Serializable {

  private val originalNumberOfBeers = {println("Updating"); 1}

  def getNumberOfBeers = originalNumberOfBeers + 2

}