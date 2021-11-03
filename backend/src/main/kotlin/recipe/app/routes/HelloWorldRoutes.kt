package recipe.app.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.helloWorldRouting() {
    route("/hello-world") {
        get {
            call.respondText("Hello World!!", status = HttpStatusCode.OK)
        }
    }
}

fun Application.registerHelloWorldRoutes() {
    routing {
        helloWorldRouting()
    }
}