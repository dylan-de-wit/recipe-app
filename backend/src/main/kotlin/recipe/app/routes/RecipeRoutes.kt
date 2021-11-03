package recipe.app.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import recipe.app.models.recipeList

fun Route.recipeRoutes() {
    route("/recipes") {
        get {
            call.respond(recipeList)
        }

        get("/{id}") {
            call.parameters["id"] ?: call.respondText("Bad request", status = HttpStatusCode.BadRequest)

            val recipe = recipeList.find { it.id == call.parameters["id"]?.toLong() }
                ?: call.respondText("No recipe found with this id", status = HttpStatusCode.NotFound)

            call.respond(recipe)
        }
    }
}

fun Application.registerRecipeRoutes() {
    routing {
        recipeRoutes()
    }
}