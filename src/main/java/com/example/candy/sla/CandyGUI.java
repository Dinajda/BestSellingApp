package com.example.candy.sla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CandyGUI extends Application {
    CandyController myController;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CandyGUI.class.getResource("CandyView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        myController = fxmlLoader.getController();
        stage.setTitle("Top Candy");
        stage.setScene(scene);
        stage.show();
    }

    public void stop ()throws Exception{
        myController.saveData();
    }
    public static void main(String[] args) {
        launch();
    }
}