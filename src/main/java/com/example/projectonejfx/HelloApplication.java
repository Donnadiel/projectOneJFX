package com.example.projectonejfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    gameInterface g1 = new gameInterface();
    @Override


    public void start(Stage stage) throws IOException {

        stage.setTitle("Game!");
        stage.setScene(g1.getScene());
        stage.show();

        ToolBar tB = new ToolBar();
        tB.setStyle("-fx-padding: 20px;");
    }


    public static void main(String[] args) {

        launch();
    }

}