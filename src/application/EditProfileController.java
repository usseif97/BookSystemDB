package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditProfileController {
	@FXML
	private Button edit_register_btn;
	@FXML
	private TextField edit_firstname_txt;
	@FXML
	private TextField edit_lastname_txt;
	@FXML
	private TextField edit_phone_txt;
	@FXML
	private TextField edit_address_txt;
	@FXML
	private TextField edit_username_txt;
	@FXML
	private TextField edit_email_txt;
	@FXML
	private PasswordField edit_password_txt;
	
	public void save(ActionEvent event) {
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
	
	public void cancel(ActionEvent event) {
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
