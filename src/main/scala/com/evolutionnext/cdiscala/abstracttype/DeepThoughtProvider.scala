package com.evolutionnext.cdiscala.abstracttype

import com.evolutionnext.cdiscala.annotation.DeepThought
import javax.inject.Named
import javax.enterprise.inject.Produces

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/16/11
 * Time: 12:17 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class DeepThoughtProvider extends AbstractProvider with Serializable {
  type A = String

  @Produces
  @DeepThought
  @Named("deepThought")
  override def produceResult = "To be or not to be that is the question."
}