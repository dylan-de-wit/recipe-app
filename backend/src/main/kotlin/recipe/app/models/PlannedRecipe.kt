package recipe.app.models

import java.time.LocalDateTime

data class PlannedRecipe(val user: User, val recipe: Recipe, val plannedDate: LocalDateTime)