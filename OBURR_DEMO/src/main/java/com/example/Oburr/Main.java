/**
 *
 * Executes the oburr application.
 *
 * @EnesBektas
 * java version 14.0.2
 */
package com.example.Oburr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginScene.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load());
        stage.setScene( loginScene );
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}