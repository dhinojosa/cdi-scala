package com.evolutionnext.cdiscala.dao

import javax.persistence.EntityManager
import javax.enterprise.context.ConversationScoped
import javax.inject.{Inject, Named}

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 4/28/11
 * Time: 4:38 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@ConversationScoped
@Named("typedEntityManager")
class TypedEntityManager @Inject() (var em: EntityManager) extends scala.Serializable {

  def this() = this(null)

  def persist[T](t: T)(implicit manifest:Manifest[T]){
    println("Manifest" + manifest.erasure.getClass)
    em.persist(t)
  }

  def update[T](t: T) {
    em.flush()
  }

  def delete[T](t: T) {
    em.remove(t)
  }
}