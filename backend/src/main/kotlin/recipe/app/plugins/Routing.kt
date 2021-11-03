package recipe.app.plugins

import io.ktor.application.*
import recipe.app.routes.registerHelloWorldRoutes

fun Application.configureRouting() {
    registerHelloWorldRoutes()
}
