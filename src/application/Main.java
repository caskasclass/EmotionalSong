package application;

import java.io.IOException;

import application.classes.StyleManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		StyleManager stylemanager = new StyleManager();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(stylemanager.mainStyle());
			primaryStage.setTitle("EmotionalSong");
			primaryStage.setResizable(false);
			Image icon = new Image(getClass().getResource("/assets/img/icon.png").toString());
			primaryStage.getIcons().add(icon);
			System.out.println((getClass().getResource("")).toString());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
		/*
		 * User p1;
		 * p1 = new User("caskasclass", "Bnmjkliop123", "caskasclass@gmail.com");
		 */
		//LoginEventHandler.SignUpUser("ciao", "122", "bla2");
		// se il file non esiste si crea un exception, quindi bisogna aggiungere il
		// controllo sull'esistenza del file

	}

	public void changeScene(String fxml) throws IOException{
		Stage stg= new Stage();
		Parent root = FXMLLoader.load(getClass().getResource(fxml));
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();

	}

}