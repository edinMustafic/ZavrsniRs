package sample;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.regex.Pattern;

public class LandlordRegister
{
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField username;
    @FXML
    private TextField password;


    boolean registrationSuccessful = false;

    private boolean checkPhoneNumber(String str, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    private void RegisterLandlord()
    {
        if (phoneNumber.getText().length() > 8 && checkPhoneNumber(phoneNumber.getText(), phoneNumber.getText().length()))
        {
            Landlord newLandlord = new Landlord(firstName.getText(), lastName.getText(), phoneNumber.getText(), username.getText(), password.getText());
            registrationSuccessful = true;
            System.out.println("Registered new landlord: \n" + newLandlord);
            // pohrani ga u bazu podataka
        }
        else
        {
            phoneNumber.setPromptText("Invalid phone number");
        }
    }

    public void RegisterButtonPressed(javafx.event.ActionEvent event) throws Exception
    {
        //while(registrationSuccessful == false)
        {
            RegisterLandlord();
        }
        Parent logInParent = FXMLLoader.load(getClass().getResource("RegistrationSuccessful.fxml"));
        Scene logInScene = new Scene(logInParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logInScene);
        window.show();
    }


}
