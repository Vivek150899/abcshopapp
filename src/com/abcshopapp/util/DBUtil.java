package com.abcshopapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String driverName="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/achal";
	private static final String username="root";
	private static final String password="Achal@123";
	
	public static Connection getDBConnection() {
		
		Connection con=null;
		
		try{
			//load the driver21
		Class.forName(driverName);
		System.out.println("Driver Loaded");
		
		//establish the connection
	    con=DriverManager.getConnection(url,username,password);
	    System.out.println("Connection Established");
	    
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
