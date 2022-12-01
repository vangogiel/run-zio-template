import CiCommands.{ ciBuild, devBuild }

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "conduktor-challenge",
    libraryDependencies ++=
      Seq(
        Dependencies.Compile.zio,
        Dependencies.Compile.zioHttp,
        Dependencies.Compile.zioJson
      ),
    commands ++= Seq(devBuild, ciBuild)
  )

javaOptions ++= Seq(
  "-XX:MaxRAMPercentage=50"
)

scalacOptions ++=
  Seq(
    "-deprecation",
    "-feature",
    "-deprecation",
    "-unchecked",
    "-Xcheckinit",
    "-Xfatal-warnings",
    "-Xlint:adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-unused:implicits",
    "-Ywarn-unused:locals",
    "-Ywarn-unused:params",
    "-Ywarn-unused:patvars",
    "-Ywarn-unused:privates",
    "-Ywarn-unused:imports"
  )
