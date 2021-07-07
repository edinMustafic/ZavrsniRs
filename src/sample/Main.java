package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        /*primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 880, 690));
        primaryStage.show();*/
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }

    private static void search()
    {

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

class User
{
    String username;
    String password;

    public User(String UN, String PW)
    {
        username = UN;
        password = PW;
    }
}

class Admin
{

}

class Landlord extends User
{
    String firstName;
    String lastName;
    String phoneNumber;

    ArrayList<Oglas> oglasi;

    public Landlord(String FN, String LN, String PN, String UN, String PW)
    {
        super(UN, PW);
        firstName = FN;
        lastName = LN;
        phoneNumber = PN;

    }

    void KreirajOglas()
    {

        Oglas oglas = new Oglas();

    }

    void IzbrisiOglas()
    {

    }

    void UpdateOglas()
    {

    }

    @Override
    public String toString()
    {
        return "Landlord{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", oglasi=" + oglasi +
                '}';
    }
}

class Customer extends User
{
    float wallet;

    ArrayList<Oglas> rezervisaniOglasi;

    public Customer(String UN, String PW)
    {
        super(UN, PW);
        wallet = 0;
    }

    void Rezervisi(Oglas oglas)
    {

    }

    void Otkazi(Oglas oglas)
    {

    }

    void Plati(int price)
    {

    }

    void UplatiNaRacun(float iznos)
    {

    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", wallet=" + wallet +
                ", rezervisaniOglasi=" + rezervisaniOglasi +
                '}';
    }
}



class Oglas
{
    private enum TipSmjestaja
    {
        Stan,
        Kuca,
        Vila,
        Soba,
        Vikendica
    }
    String title;
    String country;
    String address;
    TipSmjestaja type;
    int surfaceArea;
    int numberOfRooms;
    int numberOfBeds;
    String detailedDescription;
    Image image;
    float pricePerNight;
    float discount;
    boolean AC, WiFi, Parking, Kitchen, TV, Garden, Balcony, Smoking, Pets;
    ArrayList<GregorianCalendar> reservedDates;

}