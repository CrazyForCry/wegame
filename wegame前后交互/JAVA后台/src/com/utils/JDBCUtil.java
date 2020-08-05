package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//
public class JDBCUtil {
	private static String url = "jdbc:mysql://localhost:3306/web14";
	private static String user="root";
	private static String password="123456";
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnect(){
		try {
			return  DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static void close(Connection con){
		try{
			if(con!=null){
				con.close();
			}
		}catch(Exception d){
			
		}
	}
	
}
