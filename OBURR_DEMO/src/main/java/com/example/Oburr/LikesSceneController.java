/**
 * @EnesBektas
 * java version 14.0.2
 */
package com.example.Oburr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oburr.searching.Ingredient;
import oburr.user.UserUpdater;

import java.io.IOException;
import java.util.ArrayList;

public class LikesSceneController {

    // Change scene
    Stage stage;

    /**
     * Changes current scene
     * @param fxml fxml name of the next scene
     * @param event action event
     */
    public void changeScene( String fxml, ActionEvent event )  {
        try{
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource( fxml ) );
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene( scene );
            stage.show();
        }
        catch ( IOException e ){}
    }

    // Likes Scene

    // GUI variables
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private CheckBox checkBox5;
    @FXML
    private CheckBox checkBox6;
    @FXML
    private CheckBox checkBox7;
    @FXML
    private CheckBox checkBox8;
    @FXML
    private CheckBox checkBox9;
    @FXML
    private CheckBox checkBox10;
    @FXML
    private CheckBox checkBox11;
    @FXML
    private CheckBox checkBox12;
    @FXML
    private CheckBox checkBox13;
    @FXML
    private CheckBox checkBox14;
    @FXML
    private CheckBox checkBox15;
    @FXML
    private CheckBox checkBox16;
    @FXML
    private CheckBox checkBox17;
    @FXML
    private CheckBox checkBox18;
    @FXML
    private CheckBox checkBox19;
    @FXML
    private CheckBox checkBox20;
    @FXML
    private CheckBox checkBox21;
    @FXML
    private CheckBox checkBox22;
    @FXML
    private CheckBox checkBox23;
    @FXML
    private CheckBox checkBox24;
    @FXML
    private CheckBox checkBox25;
    @FXML
    private CheckBox checkBox26;
    @FXML
    private CheckBox checkBox27;
    @FXML
    private CheckBox checkBox28;
    @FXML
    private CheckBox checkBox29;
    @FXML
    private CheckBox checkBox30;
    @FXML
    private CheckBox checkBox31;
    @FXML
    private CheckBox checkBox32;

    @FXML
    private TextField enterIngredient;
    @FXML
    private CheckBox userCheckBox1;
    @FXML
    private CheckBox userCheckBox2;
    @FXML
    private CheckBox userCheckBox3;
    @FXML
    private CheckBox userCheckBox4;
    @FXML
    private CheckBox userCheckBox5;
    @FXML
    private CheckBox userCheckBox6;
    @FXML
    private CheckBox userCheckBox7;
    @FXML
    private CheckBox userCheckBox8;
    @FXML
    private CheckBox userCheckBox9;
    @FXML
    private CheckBox userCheckBox10;

    /**
     * Selects check boxes according to information from database
     */
    public void initialize(){

        ArrayList<Ingredient> tmp = UserUpdater.likesFromDatabase();
        for( Ingredient i: tmp ){
            if( checkBox1.getText().equals( i.toString() ) ){
                checkBox1.setSelected(true);
            }
            else if( checkBox2.getText().equals( i.toString() ) ){
                checkBox2.setSelected(true);
            }
            else if( checkBox3.getText().equals( i.toString() ) ){
                checkBox3.setSelected(true);
            }
            else if( checkBox4.getText().equals( i.toString() ) ){
                checkBox4.setSelected(true);
            }
            else if( checkBox5.getText().equals( i.toString() ) ){
                checkBox5.setSelected(true);
            }
            else if( checkBox6.getText().equals( i.toString() ) ){
                checkBox6.setSelected(true);
            }
            else if( checkBox7.getText().equals( i.toString() ) ){
                checkBox7.setSelected(true);
            }
            else if( checkBox8.getText().equals( i.toString() ) ){
                checkBox8.setSelected(true);
            }
            else if( checkBox9.getText().equals( i.toString() ) ){
                checkBox9.setSelected(true);
            }
            else if( checkBox10.getText().equals( i.toString() ) ){
                checkBox10.setSelected(true);
            }
            else if( checkBox11.getText().equals( i.toString() ) ){
                checkBox11.setSelected(true);
            }
            else if( checkBox12.getText().equals( i.toString() ) ){
                checkBox12.setSelected(true);
            }
            else if( checkBox13.getText().equals( i.toString() ) ){
                checkBox13.setSelected(true);
            }
            else if( checkBox14.getText().equals( i.toString() ) ){
                checkBox14.setSelected(true);
            }
            else if( checkBox15.getText().equals( i.toString() ) ){
                checkBox15.setSelected(true);
            }
            else if( checkBox16.getText().equals( i.toString() ) ){
                checkBox16.setSelected(true);
            }
            else if( checkBox17.getText().equals( i.toString() ) ){
                checkBox17.setSelected(true);
            }
            else if( checkBox18.getText().equals( i.toString() ) ){
                checkBox18.setSelected(true);
            }
            else if( checkBox19.getText().equals( i.toString() ) ){
                checkBox19.setSelected(true);
            }
            else if( checkBox20.getText().equals( i.toString() ) ){
                checkBox20.setSelected(true);
            }
            else if( checkBox21.getText().equals( i.toString() ) ){
                checkBox21.setSelected(true);
            }
            else if( checkBox22.getText().equals( i.toString() ) ){
                checkBox22.setSelected(true);
            }
            else if( checkBox23.getText().equals( i.toString() ) ){
                checkBox23.setSelected(true);
            }
            else if( checkBox24.getText().equals( i.toString() ) ){
                checkBox24.setSelected(true);
            }
            else if( checkBox25.getText().equals( i.toString() ) ){
                checkBox25.setSelected(true);
            }
            else if( checkBox26.getText().equals( i.toString() ) ){
                checkBox26.setSelected(true);
            }
            else if( checkBox27.getText().equals( i.toString() ) ){
                checkBox27.setSelected(true);
            }
            else if( checkBox28.getText().equals( i.toString() ) ){
                checkBox28.setSelected(true);
            }
            else if( checkBox29.getText().equals( i.toString() ) ){
                checkBox29.setSelected(true);
            }
            else if( checkBox30.getText().equals( i.toString() ) ){
                checkBox30.setSelected(true);
            }
            else if( checkBox31.getText().equals( i.toString() ) ){
                checkBox31.setSelected(true);
            }
            else if( checkBox32.getText().equals( i.toString() ) ){
                checkBox32.setSelected(true);
            }
            else if( userCheckBox1.getText().equals( "Add Ingredient" ) ){
                userCheckBox1.setText( i.toString() );
                userCheckBox1.setSelected(true);
            }
            else if( userCheckBox2.getText().equals( "Add Ingredient" ) ){
                userCheckBox2.setText( i.toString() );
                userCheckBox2.setSelected(true);
            }
            else if( userCheckBox3.getText().equals( "Add Ingredient" ) ){
                userCheckBox3.setText( i.toString() );
                userCheckBox3.setSelected(true);
            }
            else if( userCheckBox4.getText().equals( "Add Ingredient" ) ){
                userCheckBox4.setText( i.toString() );
                userCheckBox4.setSelected(true);
            }
            else if( userCheckBox5.getText().equals( "Add Ingredient" ) ){
                userCheckBox5.setText( i.toString() );
                userCheckBox5.setSelected(true);
            }
            else if( userCheckBox6.getText().equals( "Add Ingredient" ) ){
                userCheckBox6.setText( i.toString() );
                userCheckBox6.setSelected(true);
            }
            else if( userCheckBox7.getText().equals( "Add Ingredient" ) ){
                userCheckBox7.setText( i.toString() );
                userCheckBox7.setSelected(true);
            }
            else if( userCheckBox8.getText().equals( "Add Ingredient" ) ){
                userCheckBox8.setText( i.toString() );
                userCheckBox8.setSelected(true);
            }
            else if( userCheckBox9.getText().equals( "Add Ingredient" ) ){
                userCheckBox9.setText( i.toString() );
                userCheckBox9.setSelected(true);
            }
            else if( userCheckBox10.getText().equals( "Add Ingredient" ) ){
                userCheckBox10.setText( i.toString() );
                userCheckBox10.setSelected(true);
            }
        }
    }

    /**
     * Adds or removes liked item when a checkbox is clicked
     * @param e action event
     */
    public void likesCheckBoxListener( ActionEvent e ){
        CheckBox checkBox = ( CheckBox ) e.getSource();
        if( !checkBox.getText().equals( "Add Ingredient") ){
            if( checkBox.isSelected() ){
                UserUpdater.addLikedItem( checkBox.getText() );

            }
            else {
                UserUpdater.removeLikedItem( checkBox.getText() );
            }
        }

    }

    /**
     * Updates likes that are in the database
     * @param e action event
     */
    public void updateLikes( ActionEvent e ){
        UserUpdater.updateLikedInfo();
    }

    /**
     * If user enters a new liked item, adds it to user interface
     * @param e action event
     */
    public void addIngredient( ActionEvent e ){
        String str = enterIngredient.getText();
        if ( userCheckBox1.getText().equals( "Add Ingredient" ) ){
            userCheckBox1.setText( str );
        }
        else if( userCheckBox2.getText().equals( "Add Ingredient" ) ){
            userCheckBox2.setText( str );
        }
        else if( userCheckBox3.getText().equals( "Add Ingredient" ) ){
            userCheckBox3.setText( str );
        }
        else if( userCheckBox4.getText().equals( "Add Ingredient" ) ){
            userCheckBox4.setText( str );
        }
        else if( userCheckBox5.getText().equals( "Add Ingredient" ) ){
            userCheckBox5.setText( str );
        }
        else if( userCheckBox6.getText().equals( "Add Ingredient" ) ){
            userCheckBox6.setText( str );
        }
    }

    /**
     * Turns back to profile scene
     * @param e action event
     */
    public void back( ActionEvent e ){
        changeScene( "ProfileScene.fxml", e );
    }

    // If this scene is displayed from register

    // GUI variables
    @FXML
    private Button saveButton;
    @FXML
    private Button backButton;
    @FXML
    private Button skipButton;
    @FXML
    private Button proceedButton;

    /**
     * Changes visibility of the buttons
     */
    public void fromRegister(){
        saveButton.setVisible(false);
        backButton.setVisible(false);
        skipButton.setVisible(true);
        proceedButton.setVisible(true);
    }

    /**
     * Changes scene to dislikes scene and calls a method from DislikesSceneController to initialize dislikes scene
     * @param event action event
     */
    public void changeSceneFromRegister( ActionEvent event )  {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DislikesScene.fxml"));
            Parent root = loader.load();
            DislikesSceneController controller = loader.getController();
            controller.fromRegister();

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene( scene );
            stage.show();
        }
        catch ( IOException e ){}
    }

    /**
     * ActionListener for proceed button
     * @param e action event
     */
    public void proceed( ActionEvent e ){
        updateLikes( e );
        changeSceneFromRegister( e );
    }
}
