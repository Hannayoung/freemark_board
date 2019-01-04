package com.free.testDb.mysql;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;


public class Mysql {

	
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/board";

	private static final String USER ="root";

	private static final String PW = "root";

	
	@Test
	public void connect()
	{
		try {
			Class.forName(DRIVER);
			Connection con = (Connection) DriverManager.getConnection(URL, USER, PW);
			System.out.println("connect success");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
