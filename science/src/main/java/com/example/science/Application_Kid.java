package com.example.science;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Application_Kid extends Application {
    private double x, y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //tmpt nk load root fxml, paneRoot tapak fxml
        Parent root = FXMLLoader.load(getClass().getResource("sch1m.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene((scene));

        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setWidth(1050);
        primaryStage.setHeight(576);
        primaryStage.setResizable(false);


        //set borderless
        /*primaryStage.initStyle(StageStyle.UNDECORATED);*/
        //drag it here
        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {

            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}