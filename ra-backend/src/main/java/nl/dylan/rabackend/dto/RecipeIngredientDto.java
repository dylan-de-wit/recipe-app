package nl.dylan.rabackend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import nl.dylan.rabackend.domain.WeightUnit;

@Data
@EqualsAndHashCode(callSuper = true)
public class RecipeIngredientDto extends BaseDto {
    private String name;
    private String amount;
    private WeightUnit weightUnit;
}
