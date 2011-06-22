package com.evolutionnext.cdiscala.dao

import org.scalatest.WordSpec
import org.scalatest.testng.TestNGSuite
import javax.inject.Inject
import org.testng.annotations.Test
import org.scalatest.matchers.ShouldMatchers
import com.evolutionnext.cdiscala.temperature.TemperatureConverter
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.{ArchivePaths, ShrinkWrap}
import org.jboss.arquillian.api.Deployment
import org.jboss.arquillian.testng.Arquillian
import org.jboss.seam.persistence.test.util.MavenArtifactResolver
import org.jboss.shrinkwrap.api.spec.{WebArchive, JavaArchive}
import java.io.File


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

  @Inject var converter: TemperatureConverter = _

  @Test
  def testConvertToCelsius() {
    converter.convertToCelsius(32d) should be(0d)
    converter.convertToCelsius(212d) should be(100d)
  }

  @Test
  def testConvertToFahrenheit() {
    converter.convertToFahrenheit(0d) should be(32d)
    converter.convertToFahrenheit(100d) should be(212d)
  }
}

object AccountArquillianTest {
  @Deployment
  def createTestArchive() = {
    println("working")
    ShrinkWrap.create(classOf[WebArchive], "test.war")
            .addClasses(classOf[TemperatureConverter])
            .addAsLibrary(new File("/home/danno/development/cdi-scala/lib_managed/scala_2.9.0-1/jar/test/scalatest_2.9.0-1.4.1.jar"))
            //.addAsLibrary(new File("/home/danno/development/cdi-scala/lib_managed/scala_2.9.0-1/jar/test/testng-5.14.6.jar"))
            .addAsLibrary(new File("/home/danno/java/scala/lib/scala-library.jar"))
//            .addAsLibrary(MavenArtifactResolver.resolve("commons-logging:commons-logging:1.1.1"))
//            .addAsLibrary(MavenArtifactResolver.resolve("commons-lang:commons-lang:2.5"))
//            .addAsLibrary(MavenArtifactResolver.resolve("org.testng:testng:5.10:jdk15"))
//            .addAsLibrary(MavenArtifactResolver.resolve("org.scalatest:scalatest_2.9.0:1.4.1"))
            .addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"))
            .addAsWebInfResource(new File("/home/danno/development/cdi-scala/src/main/webapp/WEB-INF/jboss-scanning.xml"));

  }
}