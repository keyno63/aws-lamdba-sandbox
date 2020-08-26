import sbt._
import sbt.Keys._

lazy val `aws-lamdba-samdbox` = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "aws-lamdba-samdbox"
  )

lazy val `scala-sample` = (project in file("./scala-sample"))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "scala-sample",
    libraryDependencies ++=
      jsonModule ++
        Seq(
          "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
          "com.amazonaws" % "aws-lambda-java-events" % "1.1.0"
        )
  )

val versions = Map(
  "circe" -> "0.12.1"
)

val jsonModule = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % versions("circe"))