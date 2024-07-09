package com.example.firstjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistrationForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Registration Form JavaFx Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void testMethod(){
        System.out.println("I'm now in the test method. Going to launch the UI");
        launch();
        System.out.println("Window closed, going to leave the test method");
    }
    public static void main(String[] args) {
        testMethod();
    }
}