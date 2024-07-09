package com.example.firstjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class RegistrationFormController {

    @FXML
    public PasswordField PasswordText;
    @FXML
    public TextField FullNameText;
    @FXML
    public Label RegistrationFormLabel;
    @FXML
    public TextField Email1Text;

    @FXML
    public void onSubmitButtonClick() throws Exception {

        String FullName = FullNameText.getText();
        String Password = PasswordText.getText();
        String EmailID = Email1Text.getText();
        if (FullName.isEmpty() || Password.isEmpty() || EmailID.isEmpty()) {
            RegistrationFormLabel.setText("Username, Password and email are Empty");
            return;
        }

        Stage newStage = (Stage) RegistrationFormLabel.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        newStage.setScene(new Scene(root, 500, 300));
        newStage.show();
    }
}
