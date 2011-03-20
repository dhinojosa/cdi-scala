import sbt.{DefaultWebProject, ProjectInfo, Path}


class CDIScalaProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val scalaToolsRepository = "Scala-Tools Maven2 Repository" at "http://scala-tools.org/repo-releases"
  val jbossPublicRepository = "JBoss Public Maven Repository Group" at
          "http://repository.jboss.org/nexus/content/groups/public"

  val jodaTime = "joda-time" % "joda-time" % "1.6.2" withSources ()
  val seamFaces = "org.jboss.seam.faces" % "seam-faces" % "3.0.0.CR2" % "compile" withSources()
  val seamCatch = "org.jboss.seam.catch" % "seam-catch" % "3.0.0.CR3" % "compile" withSources ()
  val seamServlet = "org.jboss.seam.servlet" % "seam-servlet" % "3.0.0.CR3" % "compile" withSources()
//  val jbossLogging = "org.jboss.logging" % "jboss-logging" % "3.0.0.Beta5" % "provided" withSources()

  val scalaCheck = "org.scala-tools.testing" % "scalacheck_2.8.0.RC1" % "1.7" % "test" withSources ()
  val scalaTest = "org.scalatest" % "scalatest" % "1.2" % "test" withSources ()
  val testNG = "org.testng" % "testng" % "5.14" % "test" withSources ()
  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5" % "test" withSources ()

  val javaxServlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"
  val weld = "javax.enterprise" % "cdi-api" % "1.0-SP4" % "provided"
  val weldServlet = "org.jboss.weld.servlet" % "weld-servlet" % "1.1.0.Final" % "provided"
}
