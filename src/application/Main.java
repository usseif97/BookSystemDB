package application;

import java.sql.Connection;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		User user = new User();
		connection c = new connection();
		Connection con = c.createConnect("BookSystem", "root", user.getPassword());

		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,600,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
