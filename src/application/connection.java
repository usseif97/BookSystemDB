package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	
	private static Connection connection;
	
	public Connection createConnect(String dbName, String userName, String password) {
		String jdbcURL = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		//String jdbcURL = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?autoReconnect=true&useSSL=false;useJDBCCompliantTimezoneShift=true;uselegacyDatetimecode=false&serverTimezone=UTC;";
		//String jdbcURL = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?autoReconnect=true&useSSL=false
		try{
			connection = DriverManager.getConnection(jdbcURL, userName, password);
			connection.setAutoCommit(false);
			System.out.println("Connected To DB");
		} catch (SQLException e) {
			System.out.println("Error During Connection");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static Connection getInstance() {
		return connection;
	}
	
}
