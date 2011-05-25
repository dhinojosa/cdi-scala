package com.evolutionnext.cdiscala.task

import reflect.BeanProperty
import com.evolutionnext.cdiscala.tag.Tag

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/1/11
 * Time: 4:43 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class Task(@BeanProperty val id: Long,
           @BeanProperty val date: java.sql.Date,
           @BeanProperty val name: String,
           @BeanProperty val tracks: List[Track],
           @BeanProperty val tags: List[Tag])