package com.lumen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/mybook";
		String username = "root";
		String password = "admin@123";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}

}
