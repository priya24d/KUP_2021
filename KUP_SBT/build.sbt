//This class contains methods for performing various operations of a calculator.

name := "KUP_SBT"

version := "0.1"

scalaVersion := "2.13.4"

coverageEnabled := true
libraryDependencies ++= Seq("org.mockito" %% "mockito-scala-scalatest" % "1.15.0" % Test,"org.mockito" %% "mockito-scala" % "1.14.8"
  , "org.scalatest" %% "scalatest" % "3.2.2" % Test  ,"org.mockito" % "mockito-core" % "1.9.5" % "test")
