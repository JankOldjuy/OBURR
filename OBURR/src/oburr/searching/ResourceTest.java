package oburr.searching;

import oburr.user.User;
import  java.util.ArrayList;
import java.util.Collections;

public class ResourceTest {

    public static void main(String[] args){

        User user = new User();


        ArrayList<Ingredient> allergies = new ArrayList<Ingredient>();
        allergies.add(new Ingredient("garlic"));

        user.setAllergies(allergies);

        Resource allRecipes = new SearchableResource(
                "AllRecipes.com",
                "https://www.allrecipes.com/search/results/?",
                user,
                ".card__recipe.card__facetedSearchResult" ,
                ".paragraph > p",
                ".ingredients-item-name",
                "body > div.docked-sharebar-content-container > div > main > div.recipe-container.two-col-container > div.content.two-col-main-content.karma-content-container > div.recipe-content.two-col-content.karma-main-column > div.two-col-content-wrapper > div.recipe-content-container > div.lead-content-wrapper.two-col-style > div.lead-content-aside-wrapper > div > section > div:nth-child(1) > div:nth-child(3) > div.recipe-meta-item-body",
                ".recipe-nutrition-section.partial > .section-body"
                );


        long now = System.currentTimeMillis();

        ArrayList<Recipe> results = allRecipes.findResults(null,"potato");


        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i).getRecipeName());
        }


        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i).getDifficultyLevel());

        }

        /**
        Collections.sort(recipes,new SortByCalories());

        for(int i = 0; i < recipes.size(); i++){
            System.out.println((i+1) + "-" + recipes.get(i).getRecipeName());
        }*/

        long now2 = System.currentTimeMillis();

        System.out.println(now);
        System.out.println(now2);
        System.out.println((now2-now)/1000);
    }



}
