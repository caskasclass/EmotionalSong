package application;

import java.io.IOException;
import java.util.ArrayList;

import application.classes.FileManager;
import application.classes.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ControllerH {

    private static String PATH = "./src/deposit/users.txt";

    @FXML public TextField ue_field;
    @FXML public PasswordField passwd_field;
    @FXML public Label lb_allert;


    public  void Login(ActionEvent e) throws IOException{
        User loguser = new User(ue_field.getText(),passwd_field.getText(),ue_field.getText());
        ArrayList<User> users = (ArrayList<User>) FileManager.ReadUsers(PATH);
        if (users.contains(loguser)) {
            lb_allert.setTextFill(Color.GREEN);
            lb_allert.setText("User trovato");
           // System.out.println("\n\n\nUser trovato\n\n\n");
        } else {
            lb_allert.setTextFill(Color.RED);
            lb_allert.setText("User non trovato");
            //System.out.println("\n\n\nUser non presente\n\n\n");
        }
    }
}
