package application;

public class Book {
	
	private String title, publisher, publication, price, category, threshold;
	private String[] authors;
	
	public Book(String title, String[] authors, String publisher, String publication, String price, String category, String threshold) {
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.publication = publication;
		this.price = price;
		this.category = category;
		this.threshold = threshold;
	}
	
	public void updateBook(String title, String[] authors, String publisher, String publication, String price, String category, String threshold) {
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.publication = publication;
		this.price = price;
		this.category = category;
		this.threshold = threshold;
	}
	
	// GETTERS
	public String getTitle() {
		return title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getPrice() {
		return price;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	public String getThreshold() {
		return threshold;
	}
	
	// SETTERS
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	
	// logic functions
	public boolean save() {
		// TODO: save the book to the db
		return true;
	}
}
