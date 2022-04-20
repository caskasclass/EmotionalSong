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
      Object obj = objectInputStream.readObject();
      if (obj instanceof ArrayList<?>){
        ArrayList<?> al= (ArrayList<?>) obj;
        users= castList(al);
      }
      
      objectInputStream.close();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException IOe) {
      IOe.printStackTrace();
    }
    return users;
  }

  private static ArrayList<User> castList(ArrayList<?> al){

    ArrayList<User> array= new ArrayList<User>();
    for (Object obj : al) {
      if( obj instanceof User){
        array.add((User)obj);
      } 
    }
    return array;
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
