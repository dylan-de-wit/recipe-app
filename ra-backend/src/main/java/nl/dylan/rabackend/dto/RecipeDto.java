package nl.dylan.rabackend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RecipeDto extends BaseDto {

    private String name;
    private List<RecipeIngredientDto> ingredients = new ArrayList<>();
    private List<RecipeStepDto> steps = new ArrayList<>();
}
