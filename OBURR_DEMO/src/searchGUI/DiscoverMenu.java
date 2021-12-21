package searchGUI;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import oburr.searching.Ingredient;
import oburr.searching.OburrRecipe;
import oburr.searching.OburrResource;
import oburr.searching.Resource;
import oburr.user.User;

import java.io.IOException;
import java.util.ArrayList;

public class DiscoverMenu {

    Scene scene;
    Stage stage;
    Parent root;

    @FXML
    private Button executionButton;

    @FXML
    private HBox hbox1,hbox2,hbox3,hbox4;

    @FXML
    private ImageView img1,img2,img3,img4;

    @FXML
    private Label name1,name2,name3,name4;

    @FXML
    private Label r1,r2,r3,r4;

    ArrayList<OburrRecipe> recipeResults;
    OburrResource resource;

    void display() {
        if(recipeResults.size()>0) {
            hbox1.setVisible(true);
            name1.setText(recipeResults.get(0).getRecipeName());
            Image i1 = SwingFXUtils.toFXImage(recipeResults.get(0).getRecipeImage(), null);
            img1.setImage(i1);
            r1.setText(recipeResults.get(0).getPublisher());
        }

        if(recipeResults.size()>1) {
            hbox2.setVisible(true);
            name2.setText(recipeResults.get(1).getRecipeName());
            Image i2 = SwingFXUtils.toFXImage(recipeResults.get(1).getRecipeImage(), null);
            img2.setImage(i2);
            r2.setText(recipeResults.get(1).getPublisher());
        }

        if(recipeResults.size()>2) {
            hbox3.setVisible(true);
            name3.setText(recipeResults.get(2).getRecipeName());
            Image i3 = SwingFXUtils.toFXImage(recipeResults.get(2).getRecipeImage(), null);
            img3.setImage(i3);
            r3.setText(recipeResults.get(2).getPublisher());
        }

        if (recipeResults.size()>3) {
            hbox4.setVisible(true);
            name4.setText(recipeResults.get(3).getRecipeName());
            Image i4 = SwingFXUtils.toFXImage(recipeResults.get(3).getRecipeImage(), null);
            img4.setImage(i4);
            r4.setText(recipeResults.get(3).getPublisher());
        }
    }

    int i = 0;

    @FXML
    void getRecipes(ActionEvent event){

        User user = new User("faruk", "enes");

        ArrayList<Ingredient> allergies = new ArrayList<Ingredient>();
        allergies.add(new Ingredient("garlic"));
        allergies.add(new Ingredient("mustard"));

        ArrayList<Ingredient> likes = new ArrayList<Ingredient>();
        likes.add(new Ingredient("onion"));
        likes.add(new Ingredient("carrot"));

        ArrayList<Ingredient> dislikes = new ArrayList<Ingredient>();
        dislikes.add(new Ingredient("ham"));

        user.setAllergenIngredients(allergies);
        user.setLikedIngredients(likes);
        user.setDislikedIngredients(dislikes);

        resource = new OburrResource();

        recipeResults = resource.bringRecipes(i);

        display();

        i=i+4;
    }

    @FXML
    void openRecipe(Event event) {
        HBox h = (HBox) event.getSource();
        String name = null;
        Image img = null;
        String recipeSteps = null;
        String time = null;
        String ingr = "";
        String facts = null;
        String source = null;
        String calories = "Calories: ";


        if (h == hbox1) {
            name = recipeResults.get(0).getRecipeName();
            img = SwingFXUtils.toFXImage(recipeResults.get(0).getRecipeImage(), null );
            recipeSteps = recipeResults.get(0).getRecipeSteps();
            if ((recipeResults.get(0).getTotalTime()) == 0) {
                time = "NA";
            } else {
                time = recipeResults.get(0).getTimeInfo();
            }
            ArrayList ingrList = recipeResults.get(0).getRecipeIngredients();
            for (int i = 0; i < ingrList.size(); i++) {
                ingr = ingr + " - " + ingrList.get(i) + "\n ";
            }
            facts = recipeResults.get(0).getNutritionFacts();
            source = recipeResults.get(0).getPublisher();
            if ((recipeResults.get(0).getCalories()) == 0) {
                calories = "NA";
            } else {
                calories = calories + String.valueOf(recipeResults.get(0).getCalories());
            }
        } else if (h == hbox2) {
            name = recipeResults.get(1).getRecipeName();
            img = SwingFXUtils.toFXImage(recipeResults.get(1).getRecipeImage(), null );
            recipeSteps = recipeResults.get(1).getRecipeSteps();
            if ((recipeResults.get(1).getTotalTime()) == 0) {
                time = "NA";
            } else {
                time = recipeResults.get(1).getTimeInfo();
            }
            ArrayList ingrList = recipeResults.get(1).getRecipeIngredients();
            for (int i = 0; i < ingrList.size(); i++) {
                ingr = ingr + " - " + ingrList.get(i) + "\n ";
            }
            facts = recipeResults.get(1).getNutritionFacts();
            source = recipeResults.get(1).getPublisher();
            if ((recipeResults.get(1).getCalories()) == 0) {
                calories = "NA";
            } else {
                calories = calories + String.valueOf(recipeResults.get(1).getCalories());
            }
        }else if (h == hbox3) {
            name = recipeResults.get(2).getRecipeName();
            img = SwingFXUtils.toFXImage(recipeResults.get(2).getRecipeImage(), null );
            recipeSteps = recipeResults.get(2).getRecipeSteps();
            if ((recipeResults.get(2).getTotalTime()) == 0) {
                time = "NA";
            } else {
                time = recipeResults.get(2).getTimeInfo();
            }
            ArrayList ingrList = recipeResults.get(2).getRecipeIngredients();
            for (int i = 0; i < ingrList.size(); i++) {
                ingr = ingr + " - " + ingrList.get(i) + "\n ";
            }
            facts = recipeResults.get(2).getNutritionFacts();
            source = recipeResults.get(2).getPublisher();
            if ((recipeResults.get(2).getCalories()) == 0) {
                calories = "NA";
            } else {
                calories = calories + String.valueOf(recipeResults.get(2).getCalories());
            }
        }else if (h == hbox4) {
            name = recipeResults.get(3).getRecipeName();
            img = SwingFXUtils.toFXImage(recipeResults.get(3).getRecipeImage(), null );
            recipeSteps = recipeResults.get(3).getRecipeSteps();
            if ((recipeResults.get(3).getTotalTime()) == 0) {
                time = "NA";
            } else {
                time = recipeResults.get(3).getTimeInfo();
            }
            ArrayList ingrList = recipeResults.get(3).getRecipeIngredients();
            for (int i = 0; i < ingrList.size(); i++) {
                ingr = ingr + " - " + ingrList.get(i) + "\n ";
            }
            facts = recipeResults.get(3).getNutritionFacts();
            source = recipeResults.get(3).getPublisher();
            if ((recipeResults.get(3).getCalories()) == 0) {
                calories = "NA";
            } else {
                calories = calories + String.valueOf(recipeResults.get(3).getCalories());
            }
        }


        FXMLLoader loader = new FXMLLoader(getClass().getResource("recipiePage.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RecipiePage recipiePage = loader.getController();
        recipiePage.displayRecipe(name, img, recipeSteps, time, ingr, facts, source, calories);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
