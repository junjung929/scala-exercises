enablePlugins(ScalaJSPlugin)

name := "Scala.js Hello World"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.2"

scalacOptions += "-deprecation"


