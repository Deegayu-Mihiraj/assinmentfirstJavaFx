package com.example.firstjavafx;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    public MenuItem closeMenuButton;
    @FXML
    public PasswordField PasswordText;
    @FXML
    public TextField UserNameText;
    @FXML
    public Label MyWalletLabel;

    @FXML
    protected void oncloseMenuButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onLoginButtonClick() {
        String userName = UserNameText.getText();
        String password = PasswordText.getText();
        if(userName.isEmpty() || password.isEmpty()) {
            MyWalletLabel.setText("Username and Password are Empty");
        }
    }
}
