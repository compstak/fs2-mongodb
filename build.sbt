scalaVersion := "2.12.10"

crossScalaVersions := List("2.12.10")

organization := "compstak"

name := "fs2-mongodb"

libraryDependencies += "org.mongodb" % "mongodb-driver-async" % "3.8.0"
libraryDependencies += "co.fs2"      %% "fs2-core"            % "2.2.2"

enablePlugins(GitVersioning)

credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "nexus.compstak.com",
  sys.env.get("NEXUS_USERNAME").getOrElse(""),
  sys.env.get("NEXUS_PASSWORD").getOrElse("")
)
publishTo := {
  val prefix = if (isSnapshot.value) "snapshots" else "releases"
  Some("CompStak".at(s"https://nexus.compstak.com/repository/maven-$prefix"))
}
publishMavenStyle := true
