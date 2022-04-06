package nl.dylan.rabackend.mapper;

import nl.dylan.rabackend.domain.Recipe;
import nl.dylan.rabackend.domain.RecipeIngredient;
import nl.dylan.rabackend.domain.RecipeStep;
import nl.dylan.rabackend.dto.RecipeDto;
import nl.dylan.rabackend.dto.RecipeIngredientDto;
import nl.dylan.rabackend.dto.RecipeStepDto;

public class RecipeMapper implements Mapper<RecipeDto, Recipe> {

    public RecipeDto toDto(Recipe model) {
        RecipeDto recipeDto = new RecipeDto();
        recipeDto.setName(model.getName());
        model.getRecipeIngredients().forEach(ingredient -> recipeDto.getIngredients().add(mapRecipeIngredient(ingredient)));
        model.getRecipeSteps().forEach(step -> recipeDto.getSteps().add(mapRecipeStep(step)));

        return recipeDto;
    }

    public Recipe toModel(RecipeDto dto) {
        Recipe recipe = new Recipe();
        recipe.setId(dto.getId());
        recipe.setName(dto.getName());
        dto.getIngredients().forEach(ingredient -> recipe.getRecipeIngredients().add(mapRecipeIngredientDto(ingredient)));
        dto.getSteps().forEach(step -> recipe.getRecipeSteps().add(mapRecipeStepDto(step)));

        return recipe;
    }

    public Recipe updateFromDto(Recipe model, RecipeDto dto) {
        return model;
    }


    // TODO: move to own mappers

    private RecipeIngredientDto mapRecipeIngredient(RecipeIngredient ingredient) {
        RecipeIngredientDto ingredientDto = new RecipeIngredientDto();
        ingredientDto.setId(ingredient.getIngredientId());
        ingredientDto.setName(ingredient.getIngredient().getName());
        ingredientDto.setAmount(ingredient.getAmount());
        ingredientDto.setWeightUnit(ingredient.getWeightUnit());

        return ingredientDto;
    }

    private RecipeStepDto mapRecipeStep(RecipeStep step) {
        RecipeStepDto stepDto = new RecipeStepDto();
        stepDto.setId(step.getId());
        stepDto.setStepCount(step.getStepCount());
        stepDto.setDescription(step.getDescription());

        return stepDto;
    }

    private RecipeIngredient mapRecipeIngredientDto(RecipeIngredientDto ingredientDto) {
        RecipeIngredient ingredient = new RecipeIngredient();
        ingredient.setAmount(ingredientDto.getAmount());
        ingredient.setWeightUnit(ingredientDto.getWeightUnit());

        return ingredient;
    }

    private RecipeStep mapRecipeStepDto(RecipeStepDto stepDto) {
        RecipeStep step = new RecipeStep();
        step.setId(stepDto.getId());
        step.setStepCount(stepDto.getStepCount());
        step.setDescription(stepDto.getDescription());

        return step;
    }
}
