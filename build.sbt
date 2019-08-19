name := "SelfType"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
libraryDependencies += "org.scalamock" %% "scalamock" % "4.4.0" % Test
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.1"
libraryDependencies += "org.scalamock" %% "scalamock" % "4.4.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
logBuffered in Test := false
