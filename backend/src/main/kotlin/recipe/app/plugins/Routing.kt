package recipe.app.plugins

import io.ktor.application.*
import recipe.app.routes.registerHelloWorldRoutes
import recipe.app.routes.registerRecipeRoutes

fun Application.configureRouting() {
    registerHelloWorldRoutes()
    registerRecipeRoutes()
}
