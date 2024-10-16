package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	
		// driver load --> loaded driver
		
		// conection estabilish
	public void createDatabase() {
		try {
			String url = "jdbc:mysql://localhost:3306/"; // to check port on cmd --> select @@port;
			String userName = "root"; //to check user on CMD --> select user();
			String password = "Dipak/13"; 
			
			Connection conn = DriverManager.getConnection(url, userName, password); // created object of connection --> conn connection is a class or interface
			
			// statement create
			Statement stm = conn.createStatement();
			System.out.println("Connected Successfully");
			
			// execute query
			String query = "create database jdbc"; 
			stm.execute(query);
			System.out.println("database createed successfully ");
			
			// close connection
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	
	// Table creation
	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/jdbc"; // to check port on cmd --> select @@port;
			String db = "jdbc";
			String userName = "root"; //to check user on CMD --> select user();
			String password = "Dipak/13"; 
			
			Connection conn = DriverManager.getConnection(url, userName, password); // created object of connection --> conn connection is a class or interface
			
			// statement create
			Statement stm = conn.createStatement();
	
			
			// execute query
			String query = "Create table Student (sId int(3), sName varchar(200), sEmail varchar(200))"; 
			stm.execute(query);
			System.out.println("Table createed successfully ");
			
			// close connection
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}


	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/"; // to check port on cmd --> select @@port;
			String db = "jdbc";
			String userName = "root"; //to check user on CMD --> select user();
			String password = "Dipak/13"; 
			
			Connection conn = DriverManager.getConnection(url+db, userName, password); // created object of connection --> conn connection is a class or interface
			String query = "insert into student (sId, sName, Semail) values (?,?,?)"; 
			
			
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, 10);
			pstm.setString(2, "Mayur");
			pstm.setString(3, "abd@gmail.com");
			
			
			// execute query
			
			pstm.execute(); // pstm.executeUpdate(); pstm.executeQuery();<- does not work
			System.out.println("data inserted successfully ");
			
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/"; // to check port on cmd --> select @@port;
			String db = "jdbc";
			String userName = "root"; //to check user on CMD --> select user();
			String password = "Dipak/13"; 
			
			Connection conn = DriverManager.getConnection(url+db, userName, password); // created object of connection --> conn connection is a class or interface
			String query = "select * from student"; 
			Statement stm = conn.createStatement();
			
		
			// execute query
			
			ResultSet rs = stm.executeQuery(query); // pstm.executeUpdate(); pstm.executeQuery();<- does not work
			while(rs.next()) {
				System.out.println("Id = " + rs.getInt(1));
				System.out.println("Name = " + rs.getString(2));
				System.out.println("Gmail = " + rs.getString(3));
			}
			System.out.println("read successfully ");
			
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
