package nl.dylan.rabackend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RecipeStepDto extends BaseDto {
    private double stepCount = 0.0;
    private String description;
}
