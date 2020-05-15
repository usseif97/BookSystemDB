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

public class RegisterController {
	@FXML
	private Button login_register_btn;
	@FXML
	private TextField login_firstname_txt;
	@FXML
	private TextField login_lastname_txt;
	@FXML
	private TextField login_phone_txt;
	@FXML
	private TextField login_address_txt;
	@FXML
	private TextField login_username_txt;
	@FXML
	private TextField login_email_txt;
	@FXML
	private PasswordField login_password_txt;
	
	
	public boolean register(ActionEvent event) {
		// TODO: check for the DB
		
		// go to Home
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
		return true;
	}
	
	public boolean back(ActionEvent event) {		
		// go to Home
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
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
}
