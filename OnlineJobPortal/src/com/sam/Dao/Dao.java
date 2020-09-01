package com.sam.Dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	private static Connection con;
	public static Connection getConnection()   
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanage","root","1234");
		   }
		 catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
}
