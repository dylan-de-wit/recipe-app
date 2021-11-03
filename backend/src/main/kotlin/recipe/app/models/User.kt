package recipe.app.models

data class User(
    val username: String,
    val recipes: List<Recipe>? = null,
    val userIngredientList: UserIngredientList? = null,
    val plannedRecipes: List<PlannedRecipe>? = null
)