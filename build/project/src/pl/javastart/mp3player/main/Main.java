package pl.javastart.mp3player.main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		final String appName = "Mp3Player";
		try {
			Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/pl/javastart/mp3player/view/MainPane.fxml"));
			Scene scene = new Scene(parent);
			stage.setTitle(appName);
			stage.setScene(scene);
			stage.show();
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
