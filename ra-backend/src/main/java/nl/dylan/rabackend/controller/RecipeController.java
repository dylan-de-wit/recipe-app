package nl.dylan.rabackend.controller;

import lombok.RequiredArgsConstructor;
import nl.dylan.rabackend.dto.RecipeDto;
import nl.dylan.rabackend.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService service;

    @GetMapping
    public List<RecipeDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RecipeDto findById(@PathVariable UUID id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public RecipeDto create(@RequestBody RecipeDto recipeDto) {
        return service.create(recipeDto);
    }

    @PutMapping("/{id}")
    public RecipeDto id(@PathVariable UUID id, @RequestBody RecipeDto recipeDto) {
        return service.update(id, recipeDto);
    }
}
