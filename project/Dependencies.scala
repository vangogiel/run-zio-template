import sbt._

object Dependencies {
  object Compile {
    val zio = "dev.zio" %% "zio" % "2.0.1"
    val zioHttp = "io.d11" %% "zhttp" % "2.0.0-RC11"
    val zioJson = "dev.zio" %% "zio-json" % "0.3.0-RC11"
  }
}
