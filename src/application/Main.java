package application;

//import application.classes.LoginEventHandler;
import application.classes.StyleManager;
//import application.classes.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		StyleManager stylemanager = new StyleManager();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("fxmlfiles/LoginWindow.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(stylemanager.mainStyle());
			primaryStage.setTitle("EmotionalSong");
			primaryStage.setResizable(false);
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
		// User p2 = new User("1", "1", "1");
		// LoginEventHandler.SignUpUser("2", "2", "2");
		// LoginEventHandler.Login(p2);
		// se il file non esiste si crea un exception, quindi bisogna aggiungere il
		// controllo sull'esistenza del file

	}
}