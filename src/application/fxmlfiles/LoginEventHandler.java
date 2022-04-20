package application.fxmlfiles;

import java.io.IOException;
import java.util.ArrayList;

import application.classes.FileManager;
import application.classes.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginEventHandler {

    private static String PATH = "./src/deposit/users.txt";

    @FXML
    TextField  user_email_field;
    @FXML
    PasswordField password_field;
    @FXML
    Button btn_login;
    @FXML
    Label allert_label;

    public void login(ActionEvent e) throws IOException
    {
        System.out.println("x");
    }
    
   /* public  void Login() throws IOException{
        User loguser = new User(user_email_field.getText(),password_field.getText(),user_email_field.getText());
        ArrayList<User> users = (ArrayList<User>) FileManager.ReadUsers(PATH);
        if (users.contains(loguser)) {
            allert_label.setTextFill(Color.GREEN);
            allert_label.setText("User trovato");
           // System.out.println("\n\n\nUser trovato\n\n\n");
        } else {
            allert_label.setTextFill(Color.RED);
            allert_label.setText("User non trovato");
            //System.out.println("\n\n\nUser non presente\n\n\n");
        }
    }*/
    // per ora non mi serve SignUP
    
     /* public static void SignUpUser(String u, String p, String e) {
      User newuser = new User(u, p, e);
      ArrayList<User> users = FileManager.ReadUsers(PATH);
      if (users.contains(newuser)) {
      System.out.println("\n\n\nUtente gia registrato!!!\n\n\n");
      } else {
      users.add(newuser);
      System.out.println("\n\nuser aggiunto\n" + newuser.printUser() + "\n");
      }
      FileManager.getUsers(users, PATH);
      
    }
*/
    
    

}