package recipe.app.models

data class RecipeStep(val recipe: Recipe? = null, val order: Int, val description: String)