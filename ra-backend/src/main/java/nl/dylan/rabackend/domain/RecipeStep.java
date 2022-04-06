package nl.dylan.rabackend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Entity
@Table(name = "recipe_steps", uniqueConstraints = @UniqueConstraint(columnNames = {"recipe_id", "order"}))
public class RecipeStep extends BaseModel {

    @Getter
    @Column(nullable = false)
    private double stepCount = 0.0;

    @Getter
    @Column(nullable = false)
    private String description;

    @Getter
    @Column(updatable = false, insertable = false)
    private UUID recipeId;

    /**
     * Never fetch, only set, ids are sufficient for this model
     */
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;
}
