package com.evolutionnext.cdiscala.dao

import org.scalatest.WordSpec
import org.scalatest.testng.TestNGSuite
import javax.inject.Inject
import org.testng.annotations.Test
import org.scalatest.matchers.ShouldMatchers
import com.evolutionnext.cdiscala.temperature.TemperatureConverter
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.{ArchivePaths, ShrinkWrap}
import org.jboss.arquillian.api.Deployment
import javax.management.remote.rmi._RMIConnection_Stub
import org.jboss.arquillian.testng.Arquillian


/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/21/11
 * Time: 11:28 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class AccountArquillianTest extends Arquillian with WordSpec with TestNGSuite with ShouldMatchers {

   @Inject var converter:TemperatureConverter = _

   @Test
   def testConvertToCelsius() {
      converter.convertToCelsius(32d) should be (0d)
      converter.convertToCelsius(212d) should be (100d)
   }

   @Test
   def testConvertToFahrenheit() {
      converter.convertToFahrenheit(0d) should be (32d)
      converter.convertToFahrenheit(100d) should be (212d)
   }
}

object AccountArquillianTest {
   @Deployment
   def createTestArchive() = {
      println("working")
      ShrinkWrap.create(classOf[JavaArchive], "test.jar")
         .addClasses(classOf[TemperatureConverter])
         .addAsManifestResource(
            EmptyAsset.INSTANCE,
            ArchivePaths.create("beans.xml"));

   }
}