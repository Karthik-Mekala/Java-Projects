package com.satellite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	static Connection connection;

	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/spacepedia";
		String username = "root";
		String password = "admin@123";
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();

		} catch (SQLException e) {
			System.out.println("Error");
		}
		return connection; 
	}
}
