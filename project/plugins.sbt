addSbtPlugin("io.get-coursier"           % "sbt-coursier" % "1.0.2")
addSbtPlugin("com.typesafe.sbt"          % "sbt-git"      % "0.9.3")
addSbtPlugin("com.jsuereth"              % "sbt-pgp"      % "1.1.0")
addSbtPlugin("com.geirsson"              % "sbt-scalafmt" % "1.4.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.3")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"  % "0.3.4")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"

resolvers += ("CompStak Nexus Releases".at("https://nexus.compstak.com/repository/maven-group"))

ThisBuild / useCoursier := false

credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "nexus.compstak.com",
  sys.env.get("NEXUS_USERNAME").getOrElse(""),
  sys.env.get("NEXUS_PASSWORD").getOrElse("")
)

addSbtPlugin("compstak" % "sbt-ci-release-early" % "1.3.3")
