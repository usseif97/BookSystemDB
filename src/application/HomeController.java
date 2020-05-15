package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomeController {
	@FXML
	private Button home_edit_btn;
	@FXML
	private Button home_search_btn;
	@FXML
	private Button home_viewcart_btn;
	@FXML
	private Button home_checkout_btn;
	@FXML
	private Button home_manager_btn;
	@FXML
	private Button home_logout_btn;

	
	public void edit(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProfile.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void search(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchBook.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void viewCart(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Cart.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void checkout(ActionEvent event) {
		
	}
	
	public void manager(ActionEvent event) {
		// TODO: check if the user is a manager
		
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

	public void logout(ActionEvent event) {
		// TODO: clear the cart
		
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
	}
}
