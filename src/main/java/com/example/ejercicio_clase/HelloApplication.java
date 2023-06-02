package com.example.ejercicio_clase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root.load(), 400, 600);

        //se carga la carpeta css//*
        String css = HelloApplication.class.getResource("styles/app.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Hola FX + CSS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}