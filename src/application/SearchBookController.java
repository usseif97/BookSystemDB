package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchBookController {
	@FXML
	private TextField searchbook_txt;

	public void search(ActionEvent event) {
		System.out.println("searching for: " + searchbook_txt.getText());
	}
	
	public void back(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
