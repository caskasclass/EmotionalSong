package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import application.classes.FileManager;
import application.classes.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ControllerH {

    private static String PATH = "./src/deposit/users.txt";

    @FXML
    public TextField ue_field;
    @FXML
    public PasswordField passwd_field;
    @FXML
    public Label lb_allert;
    @FXML
    public Hyperlink reg_link;
    @FXML
    public TextField btn_username;
    @FXML
    public TextField btn_mail;
    @FXML
    public PasswordField btn_passwd;

    public void Login(ActionEvent e) throws IOException {
        User loguser = new User(ue_field.getText(), passwd_field.getText(), ue_field.getText());
        ArrayList<User> users = (ArrayList<User>) FileManager.ReadUsers(PATH);
        if (users.contains(loguser)) {
            lb_allert.setTextFill(Color.GREEN);
            lb_allert.setText("User trovato");
            // System.out.println("\n\n\nUser trovato\n\n\n");
        } else {
            lb_allert.setTextFill(Color.RED);
            lb_allert.setText("User non trovato");
            // System.out.println("\n\n\nUser non presente\n\n\n");
        }
    }

    public void SignUpWind(ActionEvent e) throws IOException {
        Main m = new Main();
        m.changeScene("SignUpWindow.fxml");
    }

    public void SignUpUser(ActionEvent e) throws IOException {

        User newuser = new User(btn_username.getText(), btn_passwd.getText(), btn_mail.getText());
        ArrayList<User> users = FileManager.ReadUsers(PATH);
        if (users.contains(newuser)) {
            System.out.println("\n\n\nUtente gia registrato!!!\n\n\n");
        } else {
            users.add(newuser);
            System.out.println("\n\nuser aggiunto\n" + newuser.printUser() + "\n");
        }
        FileManager.getUsers(users, PATH);
        

    }

    /*
     * public static void SignUpUser(String u, String p, String e) {
     * User newuser = new User(u, p, e);
     * ArrayList<User> users = FileManager.ReadUsers(PATH);
     * if (users.contains(newuser)) {
     * System.out.println("\n\n\nUtente gia registrato!!!\n\n\n");
     * } else {
     * users.add(newuser);
     * System.out.println("\n\nuser aggiunto\n" + newuser.printUser() + "\n");
     * }
     * FileManager.getUsers(users, PATH);
     * 
     * }
     */

}