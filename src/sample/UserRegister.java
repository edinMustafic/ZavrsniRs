package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserRegister
{
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    private void RegisterUser()
    {

        User newUser = new User(username.getText(), password.getText());
        System.out.println("Registered new User:\n" + newUser.toString());
        // spremi ga u bazu
    }

    public void RegisterButtonPressed(javafx.event.ActionEvent event) throws Exception
    {
        RegisterUser();
        Parent logInParent = FXMLLoader.load(getClass().getResource("RegistrationSuccessful.fxml"));
        Scene logInScene = new Scene(logInParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logInScene);
        window.show();
    }
}
