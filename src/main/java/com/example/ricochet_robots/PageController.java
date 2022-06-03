package com.example.ricochet_robots;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class PageController {

    public Button watchRules;
    public PageController() {
    }

    public void launchGame( ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 605, 605);
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();
    }

    public void watchRules( ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rules-game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 550);
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();
    }

    public void goGame( ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 605, 605);
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();
    }

}
