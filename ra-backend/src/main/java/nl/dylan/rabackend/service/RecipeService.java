package nl.dylan.rabackend.service;

import nl.dylan.rabackend.domain.Recipe;
import nl.dylan.rabackend.dto.RecipeDto;
import nl.dylan.rabackend.mapper.Mapper;
import nl.dylan.rabackend.mapper.RecipeMapper;
import nl.dylan.rabackend.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RecipeService extends BaseService<RecipeDto, Recipe> {
    private final RecipeRepository repository;
    private final Mapper<RecipeDto, Recipe> mapper;

    @Autowired
    public RecipeService(RecipeRepository repository, RecipeMapper mapper, Class<Recipe> recipe) {
        super(recipe);

        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Recipe, UUID> repository() {
        return repository;
    }

    @Override
    protected Mapper<RecipeDto, Recipe> mapper() {
        return mapper;
    }
}
