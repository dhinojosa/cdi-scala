package com.evolutionnext.cdiscala.tag

import reflect.BeanProperty

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/1/11
 * Time: 4:53 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class Tag(@BeanProperty val id: Long,
          @BeanProperty val name: String)