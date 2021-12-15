/**
 *@CenkOlcay
 *java version 16.0.1
 */

package oburr.searching;

import oburr.user.User;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * a class to define and use the searching functions of the resource that will be used for scrapping
 */
public class SearchableResource extends Resource{


    protected String searchURL;
    protected String searchKeyWord, resultPath, linkPath, titlePath,
            descriptionPath, ingredientPath, totalTimePath, nutritionFactsPath;


    public SearchableResource(String platformName, String defaultLink, boolean ingredientSearchAvailable,
                              User user,
                              String searchKeyWord, String resultPath, String titlePath, String linkPath,
                              String descriptionPath, String ingredientPath,
                              String totalTimePath, String nutritionFactsPath){

        super(platformName, defaultLink, ingredientSearchAvailable, user);
        setSearchKeyWord(searchKeyWord);
        setResultPath(resultPath);
        setTitlePath(titlePath);
        setLinkPath(linkPath);
        setIngredientPath(ingredientPath);
        setDescriptionPath(descriptionPath);
        setTotalTimePath(totalTimePath);
        setNutritionFactsPath(nutritionFactsPath);
    }

    public void includeIngredients(ArrayList<Ingredient> ingredients, String search){

        if(ingredients != null && ingredients.size() != 0){

            for (Ingredient ingredient : ingredients) {

                searchURL += "IngIncl=" + ingredient.toString();

                searchURL += "&";

            }
        }

    }

    public void excludeAllergens() {

        if(user.getAllergies() != null && user.getAllergies().size() != 0){

            for (Ingredient allergen : user.getAllergies()) {

                searchURL += "IngExcl=" + allergen.toString();

                searchURL += "&";

            }
        }
    }

    public String updatedURL(String baseURL, String search){

        if(search == null || search.equals("")){
            return baseURL;
        }

        String updatedURL = baseURL + searchKeyWord;
        Scanner reader = new Scanner(search);

        reader.useDelimiter("[^A-Za-zİğ]");

        int wordCount = 0;

        while(reader.hasNext()){

            if(wordCount > 0){
                updatedURL += "+";
            }
            updatedURL += reader.next();
            wordCount++;
        }

        return updatedURL;
    }


    @Override
    public ArrayList<Recipe> findResults( ArrayList<Ingredient> ingredients, String search) {

        createResultsList();

        searchURL = new String(defaultLink);

        if(ingredientSearchAvailable){
        excludeAllergens();
        }

        includeIngredients(ingredients, search);


        String url = updatedURL(searchURL,search);

        System.out.println(url);

        try {

            long now = System.currentTimeMillis();

            Document doc = Jsoup.connect(url).get();
            Elements resultCards = doc.select(resultPath);

            int resultCount = 0;

            while ( resultCount < resultCards.size() && resultCount < maxResultSize){

                Element result = resultCards.get(resultCount++);

                String resultURL = result.select(linkPath).attr("href");
                String imageURL = result.select("img").attr("src");

                Document recipePage = Jsoup.connect(resultURL).get();
                ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
                String recipeDescription = "";

                String recipeTitle = recipePage.select(titlePath).text();


                for (Element ingredient : recipePage.select(ingredientPath)) {
                    recipeIngredients.add(new Ingredient(ingredient.text() + " "));
                }


                int stepCount = 0;
                for (Element step : recipePage.select(descriptionPath)) {
                    recipeDescription += "Step " + (++stepCount) + ": " + "\n" + step.text() + "\n";
                }

                String recipeTimeInfo = "",
                        nutritionFacts = "";

                if(recipePage.select(totalTimePath).first() != null) {
                    recipeTimeInfo = recipePage.select(totalTimePath).first().text();
                }

                if(recipePage.select(nutritionFactsPath).first() != null) {
                    nutritionFacts = recipePage.select(nutritionFactsPath).first().text();

                    nutritionFacts = nutritionFacts.substring(0, nutritionFacts.lastIndexOf('.'));
                }

                results.add(new Recipe(recipeTitle, platformName, imageURL,
                            recipeIngredients, recipeDescription,
                            recipeTimeInfo, nutritionFacts));
            }

            if(!ingredientSearchAvailable){
                excludeAllergens();
            }

            long now2 = System.currentTimeMillis();

            System.out.println((now2-now)/1000);

            return results;
        }
        catch(Exception exception){
            exception.printStackTrace();

        }
        return null;
    }




    public void setResultPath(String resultPath){ this.resultPath = resultPath;}
    public void setSearchKeyWord(String searchKeyWord){ this.searchKeyWord = searchKeyWord;}
    public void setTitlePath(String titlePath){ this.titlePath = titlePath;}
    public void setLinkPath(String linkPath){ this.linkPath = linkPath;}
    public void setDescriptionPath(String descriptionPath){this.descriptionPath = descriptionPath;}
    public void setIngredientPath(String ingredientPath){ this.ingredientPath = ingredientPath; }
    public void setTotalTimePath(String totalTimePath){this.totalTimePath = totalTimePath;}
    public void setNutritionFactsPath(String nutritionFactsPath){this.nutritionFactsPath = nutritionFactsPath;}



}
