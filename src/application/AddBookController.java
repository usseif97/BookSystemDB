package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AddBookController {
	@FXML
	private Button addbook_add_btn;
	@FXML
	private Button addbook_cancel_btn;
	@FXML
	private TextField addbook_title_txt;
	@FXML
	private TextField addbook_author_txt;
	@FXML
	private TextField addbook_publisher_txt;
	@FXML
	private TextField addbook_publication_txt;
	@FXML
	private TextField addbook_price_txt;
	@FXML
	private TextField addbook_category_txt;
	@FXML
	private TextField addbook_threshold_txt;
	
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	// Logic functions
	public boolean addBook(ActionEvent event) {
		String title, author, publisher, publication, price, category, threshold;
		
		title = this.addbook_title_txt.getText().trim();
		author = this.addbook_author_txt.getText().trim();
		publisher = this.addbook_publisher_txt.getText().trim();
		publication = this.addbook_publication_txt.getText().trim();
		price = this.addbook_price_txt.getText().trim();
		category = this.addbook_category_txt.getText().trim();
		threshold = this.addbook_threshold_txt.getText().trim();
		
		// get all authors
		String[] authors = author.split(",");
		
		Connection connect = connection.getInstance();
		
		try {
			preparedStatement = connect.prepareStatement("INSERT INTO Book"
					+ " (title, publisherName, noOfCopies, categoryName, price, publicationYear, threshold)"
					+ " VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?)");

			preparedStatement.setString(1, title);
			preparedStatement.setString(2, publisher);
			preparedStatement.setInt(3, 0);
			preparedStatement.setString(4, category);
			preparedStatement.setInt(5, Integer.parseInt(price));
			preparedStatement.setDate(6, new java.sql.Date(Integer.parseInt(publication), 0, 0));
			preparedStatement.setString(7, threshold);
			
			preparedStatement.executeUpdate();
			
			connect.commit();
			System.out.println("Inserted a new Book succefully");
		} catch(SQLException e) {
			System.out.println("Error inserting a book");
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
