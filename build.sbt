import sbt._
import sbt.Keys._

lazy val `aws-lamdba-sandbox` = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "aws-lamdba-sandbox"
  )

lazy val `scala-sample` = (project in file("./scala-sample"))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "scala-sample",
    libraryDependencies ++=
      jsonModule ++ awsTools
  )

lazy val `java-sample` = (project in file("./java-sample"))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "java-sample",
    libraryDependencies ++= awsTools
      ++ Seq(
      "org.junit.platform" % "junit-platform-runner" % "1.6.2" % Test,
      "org.junit.jupiter" % "junit-jupiter" % "5.6.2" % Test,
      "org.junit.jupiter" % "junit-jupiter-engine" % "5.6.2" % Test,
      "org.junit.vintage" % "junit-vintage-engine" % "5.6.2" % Test,

      "com.novocode" % "junit-interface" % "0.11" % Test,

      "org.mockito" % "mockito-core" % "3.5.6" % Test,
      "org.mockito" % "mockito-junit-jupiter" % "3.5.6" % Test
    ),
    javacOptions ++= Seq("-source", "11", "-target", "11"),
    autoScalaLibrary := false
  )

val awsTools = Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
  "com.amazonaws" % "aws-lambda-java-events" % "1.1.0"
)

val versions = Map(
  "circe" -> "0.12.1"
)

val jsonModule = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % versions("circe"))
