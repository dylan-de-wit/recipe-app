package nl.dylan.rabackend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredient extends BaseModel {

    @Getter
    @Setter
    @Column(nullable = false)
    private String amount;

    @Getter
    @Setter
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WeightUnit weightUnit;

    @Getter
    @Column(updatable = false, insertable = false)
    private UUID ingredientId;

    @Getter
    @Column(updatable = false, insertable = false)
    private UUID recipeId;

    @Getter
    @Setter
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    /**
     * Never fetch, only set, id is sufficient for this model
     */
    @Setter
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;
}
