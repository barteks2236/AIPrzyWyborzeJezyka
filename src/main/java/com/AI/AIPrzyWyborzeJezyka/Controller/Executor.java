package com.AI.AIPrzyWyborzeJezyka.Controller;

import java.sql.*;

public class Executor {
	
	public static ResultSet select(String selectQuery) {
		
		try {
			Connection connection = Connect.connect();
			Statement statement = connection.createStatement();
			return statement.executeQuery(selectQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public static void query(String query) {
		
		try {
			Connection connection = Connect.connect();
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
