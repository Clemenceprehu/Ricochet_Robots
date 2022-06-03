package com.example.ricochet_robots;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class HelloController {

    public GridPane gridPane;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    /*public void initialize(){
        gridPane.setDisable(true);
        Insets bordsLines = new Insets(0,0,0,0);

        while (int i=0)
        for (int i= 0 ; i<8 ; i++){
            for (int j=0 ; j<8 ; j++){

            }
        }
    }

   */
}