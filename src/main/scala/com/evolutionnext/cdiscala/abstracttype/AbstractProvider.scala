package com.evolutionnext.cdiscala.abstracttype

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/16/11
 * Time: 12:17 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
trait AbstractProvider {
  type A

  def produceResult:A
}