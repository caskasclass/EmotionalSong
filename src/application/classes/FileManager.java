package application.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager {
  /*
   * public static void getData(User data)
   * {
   * try {
   * FileWriter myWriter = new FileWriter(PATH,false);
   * myWriter.write((data.printUser()).toUpperCase());
   * myWriter.close();
   * } catch (IOException e) {
   * e.printStackTrace();
   * }
   * }
   */
  public static void getUsers(ArrayList<User> data, String PATH) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(PATH);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(data);
      objectOutputStream.flush();
      objectOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ArrayList<User> ReadUsers(String PATH) {
    ArrayList<User> users = new ArrayList<User>();
    try {
      FileInputStream fileInputStream = new FileInputStream(PATH);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      users = (ArrayList<User>) objectInputStream.readObject();//fixare sta merda di warning 
      /*
      * Ho trovato questo su internet!
      *
      *
      * Object obj = ois.readObject();
      * Check it's an ArrayList
      * if (obj instanceof ArrayList<?>) {
      *  // Get the List.
      * ArrayList<?> al = (ArrayList<?>) obj;
      *  if (al.size() > 0) {
      *    // Iterate.
      *    for (int i = 0; i < al.size(); i++) {
      *      // Still not enough for a type.
      *      Object o = al.get(i);
      *      if (o instanceof MyVariable) {
      *        // Here we go!
      *       MyVariable v = (MyVariable) o;
      *        // use v.
      *      }
      *    }
      *  }
      * }
      */
      objectInputStream.close();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException IOe) {
      IOe.printStackTrace();
    }
    return users;
  }
  /*
   * public static void ReadFile() {
   * try {
   * File myObj = new File(PATH);
   * Scanner myReader = new Scanner(myObj);
   * while (myReader.hasNextLine()) {
   * String data = myReader.nextLine();
   * System.out.println(data);
   * }
   * myReader.close();
   * } catch (FileNotFoundException e) {
   * System.out.println("An error occurred.");
   * e.printStackTrace();
   * }
   * }
   */

}
