package application.classes;

import java.util.ArrayList;

public class LoginEventHandler {

    private static String PATH = "./src/deposit/users.txt";

    public static void Login(User u) {
        ArrayList<User> users = (ArrayList<User>) FileManager.ReadUsers(PATH);
        if (users.contains(u)) {
            System.out.println("\n\n\nUser trovato\n\n\n");
        } else {
            System.out.println("\n\n\nUser non presente\n\n\n");
        }
    }
    // per ora non mi serve SignUP
    
      public static void SignUpUser(String u, String p, String e) {
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
    

}