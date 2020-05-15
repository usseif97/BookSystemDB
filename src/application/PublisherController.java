package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PublisherController {
	@FXML
	private TextField publisher_txt;
	@FXML
	private TextField publisher_address_txt;
	@FXML
	private TextField publisher_phone_txt;
	
	private PreparedStatement preparedStatement; 
	
	public void add(ActionEvent event) {
		String publisherName, address, phone;
		
		publisherName = this.publisher_txt.getText().trim();
		address = this.publisher_address_txt.getText().trim();
		phone = this.publisher_phone_txt.getText().trim();
		
		Connection connect = connection.getInstance();
		
		try {
			preparedStatement = connect.prepareStatement("INSERT INTO Publisher"
					+ " (publisherName, address, phone)"
					+ " VALUES "
					+ "(?, ?, ?)");

			preparedStatement.setString(1, publisherName);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, phone);
			
			preparedStatement.executeUpdate();
			
			connect.commit();
			System.out.println("Inserted a new publisher succefully");
		} catch(SQLException e) {
			System.out.println("Error inserting a new publisher");
			e.printStackTrace();
		}
		
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
	
	public void back(ActionEvent event) {
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
