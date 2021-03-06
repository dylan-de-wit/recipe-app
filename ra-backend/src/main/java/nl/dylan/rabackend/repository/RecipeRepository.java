package nl.dylan.rabackend.repository;

import nl.dylan.rabackend.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {
}
