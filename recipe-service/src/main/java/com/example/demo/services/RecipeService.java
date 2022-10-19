package com.example.demo.services;


import com.example.demo.entities.Ingredient;
import com.example.demo.entities.Recipe;
import com.example.demo.entities.Tag;

import java.util.List;

public interface RecipeService extends CrudService<Recipe,Long> {

    Recipe createRecipe(Recipe recipe);
//    List<Tag> getAllTagsByRecipeId(Long recipeId);
//
//    List<Ingredient> getAllIngredientsByRecipeId(Long recipeId);
//
//    Recipe assignRecipeTag(Long recipeId, Long tagId);
//
//    Recipe unassignRecipeTag(Long recipeId, Long tagId);
//
//    Recipe assignRecipeIngredient(Long recipeId, Long ingredientId);
//
//    Recipe unassignRecipeIngredient(Long recipeId, Long ingredientId);

    List<Recipe> getAllRecipesByProfileId(Long profileId);

    List<Recipe> getAllRecipesByCookbookId(Long cookbookId);
}

