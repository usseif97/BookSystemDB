package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ModifyBookController {
	@FXML
	private Button add_btn;
	@FXML
	private Button cancel_btn;
	@FXML
	private TextField title_txt;
	@FXML
	private TextField author_txt;
	@FXML
	private TextField publisher_txt;
	@FXML
	private TextField publication_txt;
	@FXML
	private TextField price_txt;
	@FXML
	private TextField category_txt;
	@FXML
	private TextField threshold_txt;
	@FXML
	private TextField ISBN_txt;
	

	// Logic functions
	public boolean save(ActionEvent event) {
		String ISBN, title, author, publisher, publication, price, category, threshold;
		
		ISBN = this.ISBN_txt.getText().trim();
		title = this.title_txt.getText().trim();
		author = this.author_txt.getText().trim();
		publisher = this.publisher_txt.getText().trim();
		publication = this.publication_txt.getText().trim();
		price = this.price_txt.getText().trim();
		category = this.category_txt.getText().trim();
		threshold = this.threshold_txt.getText().trim();
		
		// get all authors
		String[] authors = author.split(",");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagerHome.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public void cancel(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagerHome.fxml"));
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
