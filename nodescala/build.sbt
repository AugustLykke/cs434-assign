
scalaVersion := "2.11.5"

scalacOptions ++= Seq("-deprecation", "-feature")

(fork in Test) := false

libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "0.9.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.6"
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.1" % "test"
)