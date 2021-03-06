import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play20-flyway-plugin"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.googlecode.flyway" % "flyway-core" % "2.1.1"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
