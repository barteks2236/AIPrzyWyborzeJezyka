package com.AI.AIPrzyWyborzeJezyka.Controller;

import java.sql.*;

public class Connect {
	
	private static String URL = "jdbc:postgresql:UsersDataAI";
	private static String user = "postgres";
	private static String password = "Honda2236";
	
	public static Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
