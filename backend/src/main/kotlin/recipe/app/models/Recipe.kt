package recipe.app.models

data class Recipe(
    val id: Long,
    val name: String,
    val user: User? = null,
    val ingredients: List<Ingredient>? = null,
    val steps: List<RecipeStep>? = null
)

val recipeList = listOf(
    Recipe(
        1,
        "Cottage Pie",
        User("Jeff"),
        ingredients = cottagePieIngredients,
        steps = listOf(RecipeStep(order = 1, description = "Just throw it in the oven"))
    ),
    Recipe(
        2,
        "Coq au vin",
        ingredients = coqAuVinIngredients,
        steps = listOf(
            RecipeStep(order = 1, description = "Cut the chicken"),
            RecipeStep(order = 2, description = "Rest of the fucking owl"),
        )
    )
)