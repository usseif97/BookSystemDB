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

public class ManagerController {
	@FXML
	private Button manager_addbook_btn;
	@FXML
	private Button manager_modifybook_btn;
	@FXML
	private Button manager_placeorder_btn;
	@FXML
	private Button manager_confirmorder_btn;
	@FXML
	private Button manager_promote_btn;
	@FXML
	private Button manager_reports_btn;

	
	public void publisher(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Publisher.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addBook(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBook.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void modifyBook(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifyBook.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void placeOreder(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PlaceOrder.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void confirmOrder(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ConfirmOrder.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void promoteCustomer(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PromoteCustomer.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void viewReports(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Reports.fxml"));
			Pane root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
