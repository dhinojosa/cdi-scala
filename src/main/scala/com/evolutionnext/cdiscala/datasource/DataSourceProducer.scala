package com.evolutionnext.cdiscala.datasource

import javax.enterprise.context.ConversationScoped
import javax.enterprise.inject.Produces
import org.jboss.seam.solder.core.ExtensionManaged
import javax.persistence.{PersistenceUnit, EntityManagerFactory}

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/1/11
 * Time: 1:37 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class DataSourceProducer {
//
//    @Produces
//    @ConversationScoped
//    @ExtensionManaged
//    def produceEntityManagerFactory(@PersistenceUnit(name = "cdiscalaPU") entityManagerFactory:EntityManagerFactory):EntityManagerFactory =
//      entityManagerFactory


  @ExtensionManaged
  @Produces
  @PersistenceUnit
  @ConversationScoped
  var producerField: EntityManagerFactory = _
}