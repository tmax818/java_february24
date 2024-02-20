package co.tylermaxwell.beltreview.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltreview.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findAll();

}
