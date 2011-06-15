import sbt.{Configuration, ProjectInfo, DefaultWebProject}

class CDIScalaProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val scalaToolsRepository = "Scala-Tools Maven2 Repository" at "http://scala-tools.org/repo-releases"
  val jbossPublicRepository = "JBoss Public Maven Repository Group" at
          "http://repository.jboss.org/nexus/content/groups/public"


  val jodaTime = "joda-time" % "joda-time" % "1.6.2" withSources ()
  val seamFaces = "org.jboss.seam.faces" % "seam-faces" % "3.0.0.Final" % "compile" withSources ()
  val seamCatch = "org.jboss.seam.catch" % "seam-catch" % "3.0.0.Final" % "compile" withSources ()
  val seamPersistence = "org.jboss.seam.persistence" % "seam-persistence" % "3.0.0.Final" % "compile" withSources ()
  val jsfFacelets = "com.sun.facelets" % "jsf-facelets" % "1.1.15" % "compile" withSources ()

  val seamServlet = "org.jboss.seam.servlet" % "seam-servlet" % "3.0.0.Final" % "compile" withSources ()
  val scalaCheck = "org.scala-tools.testing" % "scalacheck_2.8.0.RC1" % "1.7" % "test" withSources ()
  val scalaTest = "org.scalatest" % "scalatest_2.9.0" % "1.4.1" % "test" withSources ()
  val testNG = "org.testng" % "testng" % "5.14" % "test" withSources ()
  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5" % "test" withSources ()

  val easyMock = "org.easymock" % "easymock" % "3.0" % "test" withSources ()
  val javaxServlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  val javaxPersistence = "javax.persistence" % "persistence-api" % "1.0" % "provided" withSources ()
  val jsf = "javax.faces" % "jsf-api" % "2.1" % "provided" withSources ()
  val richUI = "org.richfaces.ui" % "richfaces-components-ui" % "4.0.0.Final" withSources ()
  val richCore = "org.richfaces.core" % "richfaces-core-impl" % "4.0.0.Final" withSources ()

  val weld = "javax.enterprise" % "cdi-api" % "1.0-SP4" % "provided"
  val weldServlet = "org.jboss.weld.servlet" % "weld-servlet" % "1.1.1.Final" % "provided"
  //
  val javaxPersistenceSpec = "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.0.Final" % "provided" withSources ()
  val jbossSpec = "org.jboss.spec" % "jboss-javaee-6.0" % "1.0.0.Final" % "provided"

  //  val javaxServletSpec = "org.jboss.spec.javax.servlet" % "jboss-servlet-api_3.0_spec" % "1.0.0.Final" % "provided" withSources ()
  //  val javaeeAPI = "javax" % "javaee-api" % "6.0" % "provided"

  //  Workaround to keep source files out!
  override def outputPattern = "[type]/[conf]/[artifact](-[revision])(-[classifier]).[ext]"

  override def configurationPath(c: Configuration) = managedDependencyPath / "jar" / c.toString
}
