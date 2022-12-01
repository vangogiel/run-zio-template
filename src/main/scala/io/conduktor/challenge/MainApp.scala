package io.conduktor.challenge

import zhttp.http._
import zhttp.service.Server
import zio.{Scope, ZIO, ZIOAppArgs, ZIOAppDefault}

object MainApp extends ZIOAppDefault {
  val app: HttpApp[Any, Nothing] = Http.collect[Request] {
    case Method.GET -> !! / "text" => Response.text("Hello World!")
  }

  override val run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] =
    Server.start(
      port = 8080,
      http = app
    )
}
